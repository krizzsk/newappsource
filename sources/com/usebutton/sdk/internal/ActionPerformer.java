package com.usebutton.sdk.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.usebutton.sdk.internal.api.ButtonNetworkException;
import com.usebutton.sdk.internal.core.FailableReceiver;
import com.usebutton.sdk.internal.events.EventTracker;
import com.usebutton.sdk.internal.events.Events;
import com.usebutton.sdk.internal.models.App;
import com.usebutton.sdk.internal.models.AppAction;
import com.usebutton.sdk.internal.models.Browser;
import com.usebutton.sdk.internal.models.MetaInfo;
import com.usebutton.sdk.internal.notifications.NotificationDispatcher;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.internal.util.JsonBuilder;
import com.usebutton.sdk.internal.util.TestUtils;
import com.usebutton.sdk.internal.util.UrlPrivacyValidator;
import com.usebutton.sdk.models.Link;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class ActionPerformer {
    private static final String TAG = "ActionPerformer";
    private final Link mAction;
    private final App mApp;
    private String[] mEventPropertyPairs;
    private final int mIntentFlags;
    private List<String> mInvokeEvents;
    private final MetaInfo mMeta;

    public ActionPerformer(App app, MetaInfo metaInfo, Link link) {
        this(app, metaInfo, link, 268435456);
    }

    private void addExtraProperties(JSONObject jSONObject) {
        if (this.mEventPropertyPairs != null) {
            int i = 0;
            while (true) {
                String[] strArr = this.mEventPropertyPairs;
                if (i < strArr.length) {
                    try {
                        jSONObject.put(strArr[i], strArr[i + 1]);
                    } catch (JSONException unused) {
                    }
                    i += 2;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void doExecute(Context context) {
        String str;
        Intent intent;
        Uri uri;
        Context context2 = context;
        EventTracker eventTracker = ButtonPrivate.getButton().getEventTracker();
        NotificationDispatcher notificationDispatcher = ButtonPrivate.getButton().getNotificationDispatcher();
        char c = 2;
        if (this.mMeta.isTargetWebviewOnly() && this.mAction.getBrowserLink() != null) {
            uri = this.mAction.getBrowserLink();
            intent = WebViewActivity.createIntent(context2, this.mApp, this.mMeta, this.mAction);
            intent.setFlags(this.mIntentFlags);
            this.mInvokeEvents.add(Events.WEB_WEBVIEW_OPEN);
            ButtonLog.infoFormat(TAG, "Webview-only requested for action: %s", uri);
            str = Browser.TARGET_WEBVIEW_ONLY;
        } else if (isInstalled() && this.mAction.getAppLink() != null) {
            uri = this.mAction.getAppLink();
            Intent intent2 = new Intent("android.intent.action.VIEW", uri);
            intent2.setPackage(this.mMeta.getStoreId());
            intent2.setFlags(this.mIntentFlags);
            this.mInvokeEvents.add(Events.APP_DEEPLINK);
            ButtonLog.infoFormat(TAG, "App installed, open action: %s", uri);
            if (TestUtils.isNotTesting() && ButtonPrivate.getButton().getParameters().isAppToAppNotificationEnabled()) {
                notificationDispatcher.displayAppToAppNotification(intent2);
                eventTracker.trackEventWithProperties(Events.NOTIFIED_TRACKING_ACTIVE, Events.PROPERTY_SOURCE_TOKEN, this.mMeta.getSourceToken());
            }
            str = "app";
            intent = intent2;
        } else if (this.mMeta.isTargetBrowser() && this.mAction.getBrowserLink() != null) {
            uri = this.mAction.getBrowserLink();
            intent = new Intent("android.intent.action.VIEW", uri);
            intent.setFlags(this.mIntentFlags);
            intent.setPackage(findDefaultBrowser(context));
            this.mInvokeEvents.add(Events.APP_DEEPLINK);
            ButtonLog.infoFormat(TAG, "Browser requested for action: %s", uri);
            str = Browser.TARGET_BROWSER;
        } else if (this.mMeta.isTargetWebview() && this.mAction.getBrowserLink() != null) {
            uri = this.mAction.getBrowserLink();
            intent = WebViewActivity.createIntent(context2, this.mApp, this.mMeta, this.mAction);
            intent.setFlags(this.mIntentFlags);
            this.mInvokeEvents.add(Events.WEB_WEBVIEW_OPEN);
            ButtonLog.infoFormat(TAG, "Webview requested for action: %s", uri);
            str = Browser.TARGET_WEBVIEW;
        } else if (this.mAction.getAppLink() != null) {
            uri = this.mAction.getAppLink();
            Intent intentForPromotion = InstallCardActivity.intentForPromotion(context2, this.mApp, this.mMeta, uri, this.mIntentFlags);
            ButtonLog.infoFormat(TAG, "App not installed, let's install for action: %s", uri);
            Intent intent3 = intentForPromotion;
            str = "app";
            intent = intent3;
        } else {
            ButtonLog.warnFormat(TAG, "Don't know how to open link: %s", this.mAction);
            return;
        }
        ButtonPrivate.safelyOpenIntent(context2, intent);
        ButtonLog.infoFormat(TAG, "Opening action: %s in: %s with intent %s", uri, str, intent);
        ButtonLog.visibleFormat("Deep link executed (Action ID: %s, Link: %s)", this.mMeta.getId(), uri);
        for (String next : this.mInvokeEvents) {
            Object[] objArr = new Object[6];
            objArr[0] = Events.PROPERTY_SOURCE_TOKEN;
            objArr[1] = this.mMeta.getSourceToken();
            objArr[c] = Events.PROPERTY_ACTION;
            objArr[3] = uri.toString();
            objArr[4] = "target";
            objArr[5] = str;
            JSONObject json = JsonBuilder.toJson(objArr);
            addExtraProperties(json);
            if (Events.APP_DEEPLINK.equals(next)) {
                try {
                    json.put(Events.PROPERTY_NOTIFICATIONS_ENABLED, notificationDispatcher.areNotificationsEnabled());
                } catch (JSONException unused) {
                }
            }
            if (Events.WEB_WEBVIEW_OPEN.equals(next)) {
                try {
                    json.put(Events.PROPERTY_IS_UNSUPPORTED_PARTNER_URL, this.mMeta.isUnsupportedUrl());
                } catch (JSONException unused2) {
                }
            }
            eventTracker.trackEventWithProperties(next, json);
            c = 2;
        }
    }

    private String findDefaultBrowser(Context context) {
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(UrlPrivacyValidator.HTTP_SCHEME)), SQLiteDatabase.OPEN_FULLMUTEX);
        if (resolveActivity != null) {
            return resolveActivity.resolvePackageName;
        }
        return null;
    }

    private boolean isInstalled() {
        return ButtonPrivate.getButton().getPackageObserver().isInstalled(this.mMeta.getStoreId());
    }

    public void execute(Context context) {
        execute(context, (AppAction.Listener) null);
    }

    public ActionPerformer withEvent(String str) {
        this.mInvokeEvents.add(str);
        return this;
    }

    public ActionPerformer withEventProperties(String... strArr) {
        this.mEventPropertyPairs = strArr;
        return this;
    }

    public ActionPerformer(App app, MetaInfo metaInfo, Link link, int i) {
        this.mInvokeEvents = new ArrayList();
        this.mApp = app;
        this.mAction = link;
        this.mMeta = metaInfo;
        this.mIntentFlags = i;
    }

    public void execute(final Context context, final AppAction.Listener listener) {
        ButtonRepository buttonRepository = ButtonPrivate.getButton().getButtonRepository();
        final C122471 r1 = new Runnable() {
            public void run() {
                ActionPerformer.this.doExecute(context);
                AppAction.Listener listener = listener;
                if (listener != null) {
                    listener.onSuccess();
                }
            }
        };
        final String tapSignal = this.mMeta.getTapSignal();
        if (!tapSignal.equals(MetaInfo.TAP_SIGNAL_REQUIRE_ACK)) {
            r1.run();
        }
        if (!tapSignal.isEmpty()) {
            buttonRepository.postTap(this.mMeta.getSourceToken(), this.mMeta.getCampaignId(), new FailableReceiver<JSONObject>() {
                public void onError() {
                    if (listener != null && tapSignal.equals(MetaInfo.TAP_SIGNAL_REQUIRE_ACK)) {
                        listener.onFailure(new ButtonNetworkException("Failed to report tap event"));
                    }
                }

                public void onResult(JSONObject jSONObject) {
                    if (tapSignal.equals(MetaInfo.TAP_SIGNAL_REQUIRE_ACK)) {
                        r1.run();
                    }
                }
            });
        }
    }
}
