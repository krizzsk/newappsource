package com.usebutton.sdk.internal.models;

import android.content.Context;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.Strategy;
import com.usebutton.sdk.internal.BrowserTransitionStyle;
import com.usebutton.sdk.internal.events.Events;
import com.usebutton.sdk.internal.util.JsonBuilder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Configuration {
    public static final String KEY_COPY = "copy";
    public static final String KEY_FLAGS = "flags";
    public static final String KEY_LINKS_CONFIGURATION = "links_configuration";
    public static final String KEY_PARAMETERS = "parameters";
    private final Copy mCopy;
    private final List<String> mFlags = new ArrayList();
    private final JSONObject mJsonRepresentation;
    private final LinksConfiguration mLinksConfiguration;
    private final Parameters mParameters;

    public static class Copy {
        private final JSONObject mDictionary;

        public Copy(JSONObject jSONObject) {
            this.mDictionary = jSONObject;
        }

        public String getFormattedString(Context context, String str, int i, Object... objArr) {
            return String.format(Locale.getDefault(), getString(context, str, i), objArr);
        }

        public String getString(Context context, String str, int i) {
            return this.mDictionary.optString(str, context.getString(i));
        }
    }

    public static class Parameters {
        private final boolean appToAppNotificationEnabled;
        private final int attendedInstallAutoOpenSeconds;
        private final boolean autofillCreditCardEnabled;
        private final boolean autofillEnabled;
        private final boolean autofillKeyboardCtaEnabled;
        private final Set blacklistedWebResources;
        private final BrowserTransitionStyle browserTransitionStyle;
        private final int cacheImageGlobalSizeBytes;
        private final int cacheImageMaxSizeBytes;
        private final int configLaunchUpdateMinimumInterval;
        private final int configUpdateMinimumInterval;
        private final int crashReportingInterval;
        private final int eventFlushSeconds;
        private final int eventReportIntervalSeconds;
        private final boolean impressionTrackingDisabled;
        private final boolean instantRewardsCardEnabled;
        private final int inventoryButtonLimit;
        private final boolean isButtonDisabled;
        private final boolean isCrashReportingEnabled;
        private final boolean isInstallNotificationDisabled;
        private final boolean isPurchasePathExtensionDisabled;
        private final boolean isWebNavigateEventsDisabled;
        private final boolean pageViewReportingEnabled;
        private final boolean predictableRewardsCardEnabled;
        private final Set restrictedCookiesDomains;
        private final boolean unsupportedPurchasePathUrlsEnabled;
        private final String webViewJsBridgeUrl;

        public Parameters(JSONObject jSONObject) {
            Set<String> set;
            this.isButtonDisabled = jSONObject.optBoolean("button_disabled", false);
            this.isCrashReportingEnabled = jSONObject.optBoolean("crash_reporting_enabled", false);
            this.isInstallNotificationDisabled = jSONObject.optBoolean("disable_install_notification", false);
            this.isWebNavigateEventsDisabled = jSONObject.optBoolean("disable_webview_navigate_events", false);
            this.isPurchasePathExtensionDisabled = jSONObject.optBoolean("checkout_extension_disabled", false);
            this.eventFlushSeconds = jSONObject.optInt("event_flush_seconds", 5);
            this.eventReportIntervalSeconds = jSONObject.optInt("events_report_interval_seconds", Strategy.TTL_SECONDS_MAX);
            this.configUpdateMinimumInterval = jSONObject.optInt("config_update_minimum_interval_seconds", Strategy.TTL_SECONDS_DEFAULT);
            this.configLaunchUpdateMinimumInterval = jSONObject.optInt("config_launch_update_minimum_interval_seconds", Strategy.TTL_SECONDS_DEFAULT);
            this.cacheImageGlobalSizeBytes = jSONObject.optInt("cache_image_global_size_bytes", 2097152);
            this.cacheImageMaxSizeBytes = jSONObject.optInt("cache_image_max_size_bytes", Message.MAX_CONTENT_SIZE_BYTES);
            this.crashReportingInterval = jSONObject.optInt("crash_reporting_interval_seconds", 3600);
            this.attendedInstallAutoOpenSeconds = jSONObject.optInt("attended_install_auto_open_seconds", 30);
            this.inventoryButtonLimit = jSONObject.optInt("inventory_button_item_limit", 0);
            this.blacklistedWebResources = arrayToSet(jSONObject.optJSONArray("blacklisted_web_resources"));
            if (jSONObject.has("restricted_cookies_domains")) {
                set = arrayToSet(jSONObject.optJSONArray("restricted_cookies_domains"));
            } else {
                set = null;
            }
            this.restrictedCookiesDomains = set;
            this.pageViewReportingEnabled = jSONObject.optBoolean("pageview_reporting_enabled", true);
            this.autofillEnabled = jSONObject.optBoolean(Events.PROPERTY_AUTOFILL_ENABLED, false);
            this.autofillCreditCardEnabled = jSONObject.optBoolean("cc_autofill_enabled", false);
            this.autofillKeyboardCtaEnabled = jSONObject.optBoolean("autofill_keyboard_cta_enabled", false);
            this.predictableRewardsCardEnabled = jSONObject.optBoolean("predictable_rewards_card_enabled", false);
            this.instantRewardsCardEnabled = jSONObject.optBoolean("instant_rewards_card_enabled", false);
            this.appToAppNotificationEnabled = jSONObject.optBoolean("app_to_app_notification_enabled", false);
            this.browserTransitionStyle = BrowserTransitionStyle.fromJson(jSONObject.optString("browser_transition_style", "default"));
            this.impressionTrackingDisabled = jSONObject.optBoolean("impression_tracking_disabled", false);
            this.webViewJsBridgeUrl = jSONObject.optString("webview_js_bridge_url", (String) null);
            this.unsupportedPurchasePathUrlsEnabled = jSONObject.optBoolean("unsupported_purchase_path_urls_enabled", false);
        }

        private Set<String> arrayToSet(JSONArray jSONArray) {
            HashSet hashSet = new HashSet();
            if (!(jSONArray == null || jSONArray.length() == 0)) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    hashSet.add(jSONArray.optString(i));
                }
            }
            return hashSet;
        }

        public int getAttendedInstallAutoOpenSeconds() {
            return this.attendedInstallAutoOpenSeconds;
        }

        public Set<String> getBlacklistedWebResources() {
            return this.blacklistedWebResources;
        }

        public BrowserTransitionStyle getBrowserTransitionStyle() {
            return this.browserTransitionStyle;
        }

        public int getCacheImageGlobalSizeBytes() {
            return this.cacheImageGlobalSizeBytes;
        }

        public int getCacheImageMaxSizeBytes() {
            return this.cacheImageMaxSizeBytes;
        }

        public int getConfigLaunchUpdateMinimumInterval() {
            return this.configLaunchUpdateMinimumInterval;
        }

        public int getConfigUpdateMinimumInterval() {
            return this.configUpdateMinimumInterval;
        }

        public int getCrashReportingIntervalSeconds() {
            return this.crashReportingInterval;
        }

        public int getEventFlushSeconds() {
            return this.eventFlushSeconds;
        }

        public int getEventReportIntervalSeconds() {
            return this.eventReportIntervalSeconds;
        }

        public int getInventoryButtonLimit() {
            return this.inventoryButtonLimit;
        }

        public Set<String> getRestrictedCookiesDomains() {
            return this.restrictedCookiesDomains;
        }

        public String getWebViewJsBridgeUrl() {
            return this.webViewJsBridgeUrl;
        }

        public boolean isAppToAppNotificationEnabled() {
            return this.appToAppNotificationEnabled;
        }

        public boolean isAutofillCreditCardEnabled() {
            return this.autofillCreditCardEnabled;
        }

        public boolean isAutofillEnabled() {
            return this.autofillEnabled;
        }

        public boolean isAutofillKeyboardCtaEnabled() {
            return this.autofillKeyboardCtaEnabled;
        }

        public boolean isButtonDisabled() {
            return this.isButtonDisabled;
        }

        public boolean isCrashReporterEnabled() {
            return this.isCrashReportingEnabled;
        }

        public boolean isImpressionTrackingDisabled() {
            return this.impressionTrackingDisabled;
        }

        public boolean isInstallNotificationDisabled() {
            return this.isInstallNotificationDisabled;
        }

        public boolean isInstantRewardsCardEnabled() {
            return this.instantRewardsCardEnabled;
        }

        public boolean isPageViewReportingEnabled() {
            return this.pageViewReportingEnabled;
        }

        public boolean isPredictableRewardsCardEnabled() {
            return this.predictableRewardsCardEnabled;
        }

        public boolean isPurchasePathExtensionDisabled() {
            return this.isPurchasePathExtensionDisabled;
        }

        public boolean isUnsupportedPurchasePathUrlsEnabled() {
            return this.unsupportedPurchasePathUrlsEnabled;
        }

        public boolean isWebNavigateEventsDisabled() {
            return this.isWebNavigateEventsDisabled;
        }
    }

    public Configuration(JSONObject jSONObject) throws JSONException {
        JSONObject objectOrEmpty = objectOrEmpty(jSONObject, KEY_PARAMETERS);
        JSONObject objectOrEmpty2 = objectOrEmpty(jSONObject, KEY_LINKS_CONFIGURATION);
        this.mParameters = new Parameters(objectOrEmpty);
        this.mLinksConfiguration = new LinksConfiguration(objectOrEmpty2);
        JSONObject objectOrEmpty3 = objectOrEmpty(jSONObject, KEY_COPY);
        this.mCopy = new Copy(objectOrEmpty3);
        JSONObject objectOrEmpty4 = objectOrEmpty(jSONObject, "flags");
        Iterator<String> keys = objectOrEmpty4.keys();
        while (keys.hasNext()) {
            this.mFlags.add(keys.next());
        }
        this.mJsonRepresentation = JsonBuilder.toJson(KEY_PARAMETERS, objectOrEmpty, KEY_COPY, objectOrEmpty3, "flags", objectOrEmpty4, KEY_LINKS_CONFIGURATION, objectOrEmpty2);
    }

    public static Configuration emptyConfiguration() {
        try {
            return new Configuration(JsonBuilder.toJson(KEY_PARAMETERS, new JSONObject(), KEY_COPY, new JSONObject(), "flags", new JSONObject(), KEY_LINKS_CONFIGURATION, new JSONObject()));
        } catch (JSONException e) {
            throw new IllegalStateException("Could not create default configuration, this should never happen.", e);
        }
    }

    private static final JSONObject objectOrEmpty(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject != null) {
            return optJSONObject;
        }
        return new JSONObject();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ((Configuration) obj).mJsonRepresentation.toString().equals(this.mJsonRepresentation.toString());
    }

    public Copy getCopy() {
        Copy copy = this.mCopy;
        return copy != null ? copy : new Copy(new JSONObject());
    }

    public List<String> getFlags() {
        return this.mFlags;
    }

    public JSONObject getJsonRepresentation() {
        return this.mJsonRepresentation;
    }

    public String getJsonString() {
        return this.mJsonRepresentation.toString();
    }

    public LinksConfiguration getLinks() {
        return this.mLinksConfiguration;
    }

    public Parameters getParameters() {
        Parameters parameters = this.mParameters;
        return parameters != null ? parameters : new Parameters(new JSONObject());
    }

    public int hashCode() {
        JSONObject jSONObject = this.mJsonRepresentation;
        if (jSONObject != null) {
            return jSONObject.hashCode();
        }
        return 0;
    }

    public String toString() {
        return this.mJsonRepresentation.toString();
    }
}
