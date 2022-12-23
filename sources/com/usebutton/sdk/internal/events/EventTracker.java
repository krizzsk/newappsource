package com.usebutton.sdk.internal.events;

import android.content.Context;
import com.usebutton.sdk.internal.api.models.ClientEventDTO;
import com.usebutton.sdk.internal.configuration.ConfigurationModule;
import com.usebutton.sdk.internal.core.Storage;
import com.usebutton.sdk.internal.events.ReportPolicy;
import com.usebutton.sdk.internal.models.Configuration;
import com.usebutton.sdk.internal.models.MetaInfo;
import com.usebutton.sdk.internal.user.UserModule;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.internal.util.ButtonThreadFactory;
import com.usebutton.sdk.internal.util.JsonBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class EventTracker {
    public static final Set<String> JS_BRIDGE_VERSION_EVENTS = new HashSet(Arrays.asList(new String[]{Events.WEB_WEBVIEW_OPEN, Events.WEB_WEBVIEW_NAVIGATE, Events.WEB_WEBVIEW_DISMISS, Events.AUTOFILL_CARD_SHOWN, Events.AUTOFILL_FORM_ACCEPTED_DATA, Events.AUTOFILL_FORM_DECLINED_DATA}));
    private static final int MAX_EVENTS_UPLOAD_COUNT = 400;
    public static final int MAX_SIZE = 1000;
    private static final String TAG = "EventTracker";
    private JSONArray mConfigurationFlags;
    private final ConfigurationModule mConfigurationModule;
    private final Executor mEventPoster;
    /* access modifiers changed from: private */
    public final EventsStore mEventsStore;
    private final ReportPolicy mPolicy;
    private final Storage mStorage;
    private final UserModule mUserModule;

    public EventTracker(Context context, Storage storage, UserModule userModule, ConfigurationModule configurationModule) {
        this(storage, Executors.newSingleThreadExecutor(new ButtonThreadFactory(TAG)), new IntermediateStore(new DatabaseStore(context)), userModule, configurationModule);
    }

    private void postEventAsync(final ClientEventDTO clientEventDTO) {
        this.mEventPoster.execute(new Runnable() {
            public void run() {
                synchronized (EventTracker.this.mEventsStore) {
                    EventTracker.this.mEventsStore.add(clientEventDTO);
                    EventTracker.this.mEventsStore.trimToSize(1000);
                }
            }
        });
    }

    private JSONArray toArray(Configuration configuration) {
        JSONArray jSONArray = new JSONArray();
        if (configuration == null) {
            return jSONArray;
        }
        for (String put : configuration.getFlags()) {
            jSONArray.put(put);
        }
        return jSONArray;
    }

    public List<ClientEventDTO> getPendingEvents() {
        return getPendingEvents(MAX_EVENTS_UPLOAD_COUNT);
    }

    public int getTotalPendingEvents() {
        return this.mEventsStore.size();
    }

    public void onAppLaunch() {
        this.mPolicy.onAppLaunch();
    }

    public void onEvent(String str) {
        this.mPolicy.onEvent(str);
    }

    public void onEventsReported() {
        this.mPolicy.onEventsReported();
    }

    public void onOrder() {
        this.mPolicy.onOrder();
    }

    public void removeEvents(int i) {
        synchronized (this.mEventsStore) {
            this.mEventsStore.remove(i);
        }
        ButtonLog.infoFormat(TAG, "Removed %d events.", Integer.valueOf(i));
    }

    public void setConfiguration(Configuration configuration) {
        this.mConfigurationFlags = toArray(configuration);
    }

    public void subscribeWeak(ReportPolicy.Listener listener) {
        this.mPolicy.getObservable().subscribeWeak(listener);
    }

    public void trackActionAvailable(MetaInfo metaInfo) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Events.PROPERTY_SOURCE_TOKEN, metaInfo.getSourceToken());
            if (metaInfo.getRequestTime() != null && !metaInfo.getRequestTime().equals("")) {
                jSONObject.put(Events.PROPERTY_REQUEST_TIME, metaInfo.getRequestTime());
            }
            trackEventWithProperties(Events.BUTTON_ACTION_AVAILABLE, jSONObject);
        } catch (JSONException e) {
            ButtonLog.warn(TAG, "Error tracking event.", e);
        }
    }

    public void trackEvent(String str) {
        trackEventWithProperties(str, new JSONObject());
    }

    public void trackEventWithPromotionSourceToken(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Events.PROPERTY_SOURCE_TOKEN, str2);
            trackEventWithProperties(str, jSONObject);
        } catch (JSONException e) {
            ButtonLog.warn(TAG, "Error tracking event.", e);
        }
    }

    public void trackEventWithProperties(String str, String... strArr) {
        if (strArr == null || strArr.length <= 1) {
            trackEventWithProperties(str, new JSONObject());
        } else {
            trackEventWithProperties(str, JsonBuilder.toJson(strArr));
        }
    }

    public void unsubscribe(ReportPolicy.Listener listener) {
        this.mPolicy.getObservable().unsubscribe(listener);
    }

    public EventTracker(Storage storage, Executor executor, EventsStore eventsStore, UserModule userModule, ConfigurationModule configurationModule) {
        this.mStorage = storage;
        this.mConfigurationFlags = toArray(storage.getConfiguration());
        this.mEventsStore = eventsStore;
        this.mPolicy = new ReportPolicy(storage);
        this.mEventPoster = executor;
        this.mUserModule = userModule;
        this.mConfigurationModule = configurationModule;
    }

    public List<ClientEventDTO> getPendingEvents(int i) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mEventsStore) {
            arrayList.addAll(this.mEventsStore.peek(i));
        }
        ButtonLog.infoFormat(TAG, "Returning %d pending events.", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public void trackEventWithProperties(String str, JSONObject jSONObject) {
        if (str != null) {
            try {
                jSONObject.put("flags", this.mConfigurationFlags);
            } catch (JSONException unused) {
                ButtonLog.warn(TAG, "Couldn't add flags to event payload.");
            }
            try {
                jSONObject.put(Events.PROPERTY_AUTOFILL_ENABLED, this.mConfigurationModule.isAutofillEnabled());
            } catch (JSONException unused2) {
                ButtonLog.warn(TAG, "Couldn't add autofill_enabled to event payload.");
            }
            try {
                jSONObject.put(Events.PROPERTY_AUTOFILL_PUB_PROFILE, this.mUserModule.hasProfileData());
            } catch (JSONException unused3) {
                ButtonLog.warn(TAG, "Couldn't add autofill_pub_profile to event payload.");
            }
            try {
                if (JS_BRIDGE_VERSION_EVENTS.contains(str)) {
                    jSONObject.put(Events.PROPERTY_WEBVIEW_JS_BRIDGE_VERSION, this.mStorage.getWebViewJsVersion());
                }
            } catch (JSONException unused4) {
                ButtonLog.warn(TAG, "Couldn't add js_bridge_version to event payload.");
            }
            ClientEventDTO clientEventDTO = new ClientEventDTO(str, jSONObject, UUID.randomUUID());
            postEventAsync(clientEventDTO);
            onEvent(str);
            ButtonLog.infoFormat(TAG, "Tracked event: %s", clientEventDTO);
        }
    }
}
