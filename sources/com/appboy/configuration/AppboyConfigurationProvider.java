package com.appboy.configuration;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.appboy.enums.DeviceKey;
import com.appboy.enums.LocationProviderName;
import com.appboy.enums.SdkFlavor;
import com.appboy.support.AppboyLogger;
import com.appboy.support.PackageUtils;
import com.appboy.support.StringUtils;
import com.braze.configuration.BrazeConfigurationProvider;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p030bo.app.C1612j4;
import p030bo.app.C1635m2;

@Deprecated
@Keep
public class AppboyConfigurationProvider extends CachedConfigurationProvider {
    public static final String ADM_MESSAGING_REGISTRATION_ENABLED_KEY = "com_appboy_push_adm_messaging_registration_enabled";
    public static final String API_KEY = "com_appboy_api_key";
    public static final String APPLICATION_ICON_KEY = "application_icon";
    public static final String CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED = "com_appboy_content_cards_unread_visual_indicator_enabled";
    public static final String CUSTOM_ENDPOINT = "com_appboy_custom_endpoint";
    public static final String CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME_KEY = "com_appboy_custom_html_webview_activity_class_name";
    public static final String CUSTOM_LOCATION_PROVIDERS_LIST_KEY = "com_appboy_custom_location_providers_list";
    public static final int DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS = ((int) TimeUnit.SECONDS.toMillis(15));
    public static final String DEFAULT_NOTIFICATION_ACCENT_COLOR_KEY = "com_appboy_default_notification_accent_color";
    public static final String DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION = "com_appboy_default_notification_channel_description";
    public static final String DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION_DEFAULT_VALUE = "";
    public static final String DEFAULT_NOTIFICATION_CHANNEL_NAME = "com_appboy_default_notification_channel_name";
    public static final String DEFAULT_NOTIFICATION_CHANNEL_NAME_DEFAULT_VALUE = "General";
    public static final int DEFAULT_SESSION_TIMEOUT_SECONDS = 10;
    public static final int DEFAULT_TRIGGER_MINIMUM_INTERVAL = 30;
    public static final String DEVICE_OBJECT_ALLOWLISTING_ENABLED_KEY = "com_appboy_device_object_whitelisting_enabled";
    public static final String DEVICE_OBJECT_ALLOWLIST_VALUE = "com_appboy_device_object_whitelist";
    public static final String ENABLE_LOCATION_COLLECTION_KEY = "com_appboy_enable_location_collection";
    public static final String FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED_KEY = "com_appboy_firebase_cloud_messaging_registration_enabled";
    public static final String FIREBASE_CLOUD_MESSAGING_SENDER_ID_KEY = "com_appboy_firebase_cloud_messaging_sender_id";

    /* renamed from: FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN_KEY */
    public static final String f6828xedf5dd9d = "com_appboy_firebase_messaging_service_automatically_register_on_new_token";
    public static final String GEOFENCES_AUTOMATIC_REQUESTS_ENABLED_KEY = "com_appboy_automatic_geofence_requests_enabled";
    public static final String GEOFENCES_ENABLED = "com_appboy_geofences_enabled";
    public static final String HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY = "com_appboy_handle_push_deep_links_automatically";
    public static final String IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED = "com_appboy_device_in_app_message_accessibility_exclusive_mode_enabled";
    public static final String IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY = "com_appboy_in_app_message_push_test_eager_display_enabled";
    public static final String IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT_KEY = "com_appboy_in_app_message_webview_client_max_onpagefinished_wait_ms";
    public static final String LARGE_NOTIFICATION_ICON_KEY = "com_appboy_push_large_notification_icon";
    public static final String LOCALE_TO_API_KEY_MAPPING_KEY = "com_appboy_locale_api_key_map";
    public static final String LOCALE_TO_API_KEY_MAPPING_SEPARATOR = ",";
    public static final String LOGGER_INITIAL_LOG_LEVEL = "com_appboy_logger_initial_log_level";
    public static final String NEWSFEED_UNREAD_VISUAL_INDICATOR_ON = "com_appboy_newsfeed_unread_visual_indicator_on";
    public static final String PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME_KEY = "com_appboy_push_deep_link_back_stack_activity_class_name";
    public static final String PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED_KEY = "com_appboy_push_deep_link_back_stack_activity_enabled";
    public static final String PUSH_NOTIFICATION_HTML_RENDERING_ENABLED = "com_appboy_push_notification_html_rendering_enabled";
    public static final String PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED = "com_appboy_push_wake_screen_for_notification_enabled";
    public static final String REQUIRE_TOUCH_MODE_FOR_HTML_IAMS_KEY = "com_braze_require_touch_mode_for_html_in_app_messages";
    public static final String SDK_AUTH_ENABLED = "com_appboy_sdk_authentication_enabled";
    public static final String SDK_FLAVOR = "com_appboy_sdk_flavor";
    public static final String SERVER_TARGET_KEY = "com_appboy_server_target";
    public static final String SESSION_START_BASED_TIMEOUT_ENABLED_KEY = "com_appboy_session_start_based_timeout_enabled";
    public static final String SESSION_TIMEOUT_KEY = "com_appboy_session_timeout";
    public static final String SMALL_NOTIFICATION_ICON_KEY = "com_appboy_push_small_notification_icon";
    public static final String TAG = AppboyLogger.getBrazeLogTag(BrazeConfigurationProvider.class);
    public static final String TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_KEY_SECONDS = "com_appboy_trigger_action_minimum_time_interval_seconds";
    public static final String VERSION_CODE_KEY = "version_code";
    public final Context mContext;

    /* renamed from: com.appboy.configuration.AppboyConfigurationProvider$a */
    public enum C1974a {
        SMALL,
        LARGE
    }

    public AppboyConfigurationProvider(Context context) {
        super(context);
        this.mContext = context;
    }

    private <E extends Enum<E>> EnumSet<E> getGenericEnumSetFromStringSet(Class<E> cls, String str) {
        if (this.mConfigurationCache.containsKey(str)) {
            return (EnumSet) this.mConfigurationCache.get(str);
        }
        EnumSet<E> a = C1612j4.m4334a(cls, getStringSetValue(str, new HashSet()));
        this.mConfigurationCache.put(str, a);
        return a;
    }

    private int getNotificationIconResourceId(C1974a aVar) {
        String str;
        if (aVar.equals(C1974a.LARGE)) {
            str = LARGE_NOTIFICATION_ICON_KEY;
        } else {
            str = SMALL_NOTIFICATION_ICON_KEY;
        }
        if (this.mConfigurationCache.containsKey(str)) {
            return ((Integer) this.mConfigurationCache.get(str)).intValue();
        }
        if (this.mRuntimeAppConfigurationProvider.containsKey(str)) {
            String stringValue = this.mRuntimeAppConfigurationProvider.getStringValue(str, "");
            int identifier = this.mContext.getResources().getIdentifier(stringValue, "drawable", PackageUtils.getResourcePackageName(this.mContext));
            this.mConfigurationCache.put(str, Integer.valueOf(identifier));
            String str2 = TAG;
            AppboyLogger.m5448d(str2, "Using runtime override value for key: " + str + " and value: " + stringValue);
            return identifier;
        }
        int identifier2 = this.mContext.getResources().getIdentifier(str, "drawable", PackageUtils.getResourcePackageName(this.mContext));
        this.mConfigurationCache.put(str, Integer.valueOf(identifier2));
        return identifier2;
    }

    private String getServerTarget() {
        return getStringValue(SERVER_TARGET_KEY, "PROD");
    }

    public void clear() {
        this.mConfigurationCache.clear();
        this.mRuntimeAppConfigurationProvider.getStorageMap().edit().clear().apply();
    }

    public C1635m2 getAppboyApiKey() {
        C1635m2 m2Var = (C1635m2) this.mConfigurationCache.get(API_KEY);
        if (m2Var == null) {
            String stringValue = this.mRuntimeAppConfigurationProvider.getStringValue(API_KEY, (String) null);
            if (stringValue != null) {
                AppboyLogger.m5453i(TAG, "Found an override api key. Using it to configure Appboy.");
            } else {
                stringValue = getAppboyApiKeyStringFromLocaleMapping(Locale.getDefault());
                if (stringValue != null) {
                    AppboyLogger.m5453i(TAG, "Found a locale that matches the current locale in braze.xml. Using the associated api key");
                } else {
                    stringValue = readStringResourceValue(API_KEY, (String) null);
                }
            }
            if (stringValue != null) {
                m2Var = new C1635m2(stringValue);
                this.mConfigurationCache.put(API_KEY, m2Var);
            }
        }
        if (m2Var != null) {
            return m2Var;
        }
        String str = TAG;
        AppboyLogger.m5459w(str, "****************************************************");
        AppboyLogger.m5459w(str, "**                                                **");
        AppboyLogger.m5459w(str, "**                 !! WARNING !!                  **");
        AppboyLogger.m5459w(str, "**                                                **");
        AppboyLogger.m5459w(str, "**     No API key set in res/values/braze.xml     **");
        AppboyLogger.m5459w(str, "** No cached API Key found from Braze.configure   **");
        AppboyLogger.m5459w(str, "**          Braze functionality disabled          **");
        AppboyLogger.m5459w(str, "**                                                **");
        AppboyLogger.m5459w(str, "****************************************************");
        throw new RuntimeException("Unable to read the Braze API key from the res/values/braze.xml file or from runtime configuration via AppboyConfig. See log for more details.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getAppboyApiKeyStringFromLocaleMapping(java.util.Locale r12) {
        /*
            r11 = this;
            r0 = 0
            if (r12 != 0) goto L_0x000b
            java.lang.String r12 = TAG
            java.lang.String r1 = "Passed in a null locale to match."
            com.appboy.support.AppboyLogger.m5448d(r12, r1)
            return r0
        L_0x000b:
            com.appboy.configuration.RuntimeAppConfigurationProvider r1 = r11.mRuntimeAppConfigurationProvider
            java.lang.String r2 = "com_appboy_locale_api_key_map"
            boolean r1 = r1.containsKey(r2)
            r3 = 0
            if (r1 == 0) goto L_0x0043
            com.appboy.configuration.RuntimeAppConfigurationProvider r1 = r11.mRuntimeAppConfigurationProvider
            java.lang.String r1 = r1.getStringValue(r2, r0)
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0039 }
            r2.<init>(r1)     // Catch:{ JSONException -> 0x0039 }
            int r1 = r2.length()     // Catch:{ JSONException -> 0x0039 }
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ JSONException -> 0x0039 }
            r4 = 0
        L_0x0028:
            int r5 = r2.length()     // Catch:{ JSONException -> 0x0037 }
            if (r4 >= r5) goto L_0x0047
            java.lang.String r5 = r2.getString(r4)     // Catch:{ JSONException -> 0x0037 }
            r1[r4] = r5     // Catch:{ JSONException -> 0x0037 }
            int r4 = r4 + 1
            goto L_0x0028
        L_0x0037:
            r2 = move-exception
            goto L_0x003b
        L_0x0039:
            r2 = move-exception
            r1 = r0
        L_0x003b:
            java.lang.String r4 = TAG
            java.lang.String r5 = "Caught exception creating locale to api key mapping from override cache"
            com.appboy.support.AppboyLogger.m5452e(r4, r5, r2)
            goto L_0x0047
        L_0x0043:
            java.lang.String[] r1 = r11.readStringArrayResourceValue(r2, r0)
        L_0x0047:
            if (r1 != 0) goto L_0x0051
            java.lang.String r12 = TAG
            java.lang.String r1 = "Locale to api key mappings not present in XML."
            com.appboy.support.AppboyLogger.m5448d(r12, r1)
            return r0
        L_0x0051:
            int r2 = r1.length
            r4 = 0
        L_0x0053:
            if (r4 >= r2) goto L_0x009d
            r5 = r1[r4]
            java.lang.String r6 = ","
            int r7 = com.appboy.support.StringUtils.countOccurrences(r5, r6)
            r8 = 1
            if (r7 == r8) goto L_0x0061
            goto L_0x0093
        L_0x0061:
            java.lang.String[] r5 = r5.split(r6)
            int r6 = r5.length
            r7 = 2
            if (r6 == r7) goto L_0x006a
            goto L_0x0093
        L_0x006a:
            r6 = r5[r3]
            java.lang.String r6 = r6.trim()
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r6 = r6.toLowerCase(r7)
            java.lang.String r9 = r12.toString()
            java.lang.String r9 = r9.toLowerCase(r7)
            boolean r9 = r6.equals(r9)
            java.lang.String r10 = r12.getCountry()
            java.lang.String r7 = r10.toLowerCase(r7)
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0096
            if (r9 == 0) goto L_0x0093
            goto L_0x0096
        L_0x0093:
            int r4 = r4 + 1
            goto L_0x0053
        L_0x0096:
            r12 = r5[r8]
            java.lang.String r12 = r12.trim()
            return r12
        L_0x009d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appboy.configuration.AppboyConfigurationProvider.getAppboyApiKeyStringFromLocaleMapping(java.util.Locale):java.lang.String");
    }

    public int getApplicationIconResourceId() {
        int i;
        if (this.mConfigurationCache.containsKey(APPLICATION_ICON_KEY)) {
            return ((Integer) this.mConfigurationCache.get(APPLICATION_ICON_KEY)).intValue();
        }
        String packageName = this.mContext.getPackageName();
        int i2 = 0;
        try {
            i = this.mContext.getPackageManager().getApplicationInfo(packageName, 0).icon;
        } catch (PackageManager.NameNotFoundException unused) {
            String str = TAG;
            AppboyLogger.m5459w(str, "Cannot find package named " + packageName);
            try {
                i = this.mContext.getPackageManager().getApplicationInfo(this.mContext.getPackageName(), 0).icon;
            } catch (PackageManager.NameNotFoundException unused2) {
                String str2 = TAG;
                AppboyLogger.m5459w(str2, "Cannot find package named " + packageName);
            }
        }
        i2 = i;
        this.mConfigurationCache.put(APPLICATION_ICON_KEY, Integer.valueOf(i2));
        return i2;
    }

    public String getBaseUrlForRequests() {
        return "STAGING".equals(getServerTarget().toUpperCase(Locale.US)) ? "https://sondheim.appboy.com/api/v3/" : "https://sdk.iad-01.braze.com/api/v3/";
    }

    public String getCustomEndpoint() {
        return getStringValue(CUSTOM_ENDPOINT, (String) null);
    }

    public String getCustomHtmlWebViewActivityClassName() {
        return getStringValue(CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME_KEY, "");
    }

    public EnumSet<LocationProviderName> getCustomLocationProviderNames() {
        return getGenericEnumSetFromStringSet(LocationProviderName.class, CUSTOM_LOCATION_PROVIDERS_LIST_KEY);
    }

    @TargetApi(21)
    public int getDefaultNotificationAccentColor() {
        Integer colorValue = getColorValue(DEFAULT_NOTIFICATION_ACCENT_COLOR_KEY);
        if (colorValue == null) {
            return getIntValue(DEFAULT_NOTIFICATION_ACCENT_COLOR_KEY, 0);
        }
        AppboyLogger.m5448d(TAG, "Using default notification accent color found in resources");
        return colorValue.intValue();
    }

    public String getDefaultNotificationChannelDescription() {
        return getStringValue(DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION, "");
    }

    public String getDefaultNotificationChannelName() {
        return getStringValue(DEFAULT_NOTIFICATION_CHANNEL_NAME, DEFAULT_NOTIFICATION_CHANNEL_NAME_DEFAULT_VALUE);
    }

    public EnumSet<DeviceKey> getDeviceObjectAllowlist() {
        return getGenericEnumSetFromStringSet(DeviceKey.class, DEVICE_OBJECT_ALLOWLIST_VALUE);
    }

    @Deprecated
    public EnumSet<DeviceKey> getDeviceObjectWhitelist() {
        return getDeviceObjectAllowlist();
    }

    public String getFirebaseCloudMessagingSenderIdKey() {
        return getStringValue(FIREBASE_CLOUD_MESSAGING_SENDER_ID_KEY, (String) null);
    }

    public boolean getHandlePushDeepLinksAutomatically() {
        return getBooleanValue(HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY, false);
    }

    public int getInAppMessageWebViewClientOnPageFinishedMaxWaitMs() {
        return getIntValue(IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT_KEY, DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS);
    }

    public boolean getIsAutomaticGeofenceRequestsEnabled() {
        return getBooleanValue(GEOFENCES_AUTOMATIC_REQUESTS_ENABLED_KEY, true);
    }

    public boolean getIsDeviceObjectAllowlistEnabled() {
        return getBooleanValue(DEVICE_OBJECT_ALLOWLISTING_ENABLED_KEY, false);
    }

    @Deprecated
    public boolean getIsDeviceObjectWhitelistEnabled() {
        return getIsDeviceObjectAllowlistEnabled();
    }

    public boolean getIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled() {
        return getBooleanValue(f6828xedf5dd9d, isFirebaseCloudMessagingRegistrationEnabled());
    }

    public boolean getIsGeofencesEnabled() {
        return getBooleanValue(GEOFENCES_ENABLED, isLocationCollectionEnabled());
    }

    public boolean getIsInAppMessageAccessibilityExclusiveModeEnabled() {
        return getBooleanValue(IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED, false);
    }

    public boolean getIsInAppMessageTestPushEagerDisplayEnabled() {
        return getBooleanValue(IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY, true);
    }

    public boolean getIsNewsfeedVisualIndicatorOn() {
        return getBooleanValue(NEWSFEED_UNREAD_VISUAL_INDICATOR_ON, true);
    }

    public boolean getIsPushDeepLinkBackStackActivityEnabled() {
        return getBooleanValue(PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED_KEY, true);
    }

    public boolean getIsPushNotificationHtmlRenderingEnabled() {
        return getBooleanValue(PUSH_NOTIFICATION_HTML_RENDERING_ENABLED, false);
    }

    public boolean getIsPushWakeScreenForNotificationEnabled() {
        return getBooleanValue(PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED, true);
    }

    public boolean getIsSdkAuthenticationEnabled() {
        return getBooleanValue(SDK_AUTH_ENABLED, false);
    }

    public boolean getIsSessionStartBasedTimeoutEnabled() {
        return getBooleanValue(SESSION_START_BASED_TIMEOUT_ENABLED_KEY, false);
    }

    public boolean getIsTouchModeRequiredForHtmlInAppMessages() {
        return getBooleanValue(REQUIRE_TOUCH_MODE_FOR_HTML_IAMS_KEY, true);
    }

    public int getLargeNotificationIconResourceId() {
        return getNotificationIconResourceId(C1974a.LARGE);
    }

    public int getLoggerInitialLogLevel() {
        return getIntValue(LOGGER_INITIAL_LOG_LEVEL, 4);
    }

    public String getPushDeepLinkBackStackActivityClassName() {
        return getStringValue(PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME_KEY, "");
    }

    public RuntimeAppConfigurationProvider getRuntimeAppConfigurationProvider() {
        return this.mRuntimeAppConfigurationProvider;
    }

    public SdkFlavor getSdkFlavor() {
        String stringValue = getStringValue(SDK_FLAVOR, (String) null);
        if (StringUtils.isNullOrBlank(stringValue)) {
            return null;
        }
        try {
            return SdkFlavor.valueOf(stringValue.toUpperCase(Locale.US));
        } catch (Exception e) {
            AppboyLogger.m5452e(TAG, "Exception while parsing stored SDK flavor. Returning null.", e);
            return null;
        }
    }

    public int getSessionTimeoutSeconds() {
        return getIntValue(SESSION_TIMEOUT_KEY, 10);
    }

    public int getSmallNotificationIconResourceId() {
        return getNotificationIconResourceId(C1974a.SMALL);
    }

    public long getTriggerActionMinimumTimeIntervalInSeconds() {
        return (long) getIntValue(TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_KEY_SECONDS, 30);
    }

    public int getVersionCode() {
        int i;
        if (this.mConfigurationCache.containsKey(VERSION_CODE_KEY)) {
            return ((Integer) this.mConfigurationCache.get(VERSION_CODE_KEY)).intValue();
        }
        try {
            i = this.mContext.getPackageManager().getPackageInfo(PackageUtils.getResourcePackageName(this.mContext), 0).versionCode;
        } catch (Exception e) {
            AppboyLogger.m5452e(TAG, "Unable to read the version code.", e);
            i = -1;
        }
        this.mConfigurationCache.put(VERSION_CODE_KEY, Integer.valueOf(i));
        return i;
    }

    public boolean isAdmMessagingRegistrationEnabled() {
        return getBooleanValue(ADM_MESSAGING_REGISTRATION_ENABLED_KEY, false);
    }

    public boolean isContentCardsUnreadVisualIndicatorEnabled() {
        return getBooleanValue(CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED, true);
    }

    public boolean isFirebaseCloudMessagingRegistrationEnabled() {
        return getBooleanValue(FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED_KEY, false);
    }

    public boolean isLocationCollectionEnabled() {
        return getBooleanValue(ENABLE_LOCATION_COLLECTION_KEY, false);
    }
}
