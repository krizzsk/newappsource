package com.appboy.configuration;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Keep;
import com.appboy.support.AppboyLogger;
import com.braze.configuration.BrazeConfig;
import java.util.EnumSet;
import java.util.Set;
import org.json.JSONArray;
import p030bo.app.C1612j4;

@Keep
public class RuntimeAppConfigurationProvider {
    public static final String SHARED_PREFERENCES_NAME = "com.appboy.override.configuration.cache";
    public static final String TAG = AppboyLogger.getBrazeLogTag(RuntimeAppConfigurationProvider.class);
    public final SharedPreferences mStorageMap;

    public RuntimeAppConfigurationProvider(Context context) {
        this.mStorageMap = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0);
    }

    public static void putBooleanIntoEditor(SharedPreferences.Editor editor, String str, Boolean bool) {
        if (bool != null) {
            editor.putBoolean(str, bool.booleanValue());
        }
    }

    public static <T extends Enum<T>> void putEnumSetIntoEditor(SharedPreferences.Editor editor, EnumSet<T> enumSet, String str) {
        if (enumSet != null) {
            editor.putStringSet(str, C1612j4.m4335a(enumSet));
        }
    }

    public static void putIntIntoEditor(SharedPreferences.Editor editor, String str, Integer num) {
        if (num != null) {
            editor.putInt(str, num.intValue());
        }
    }

    public static void putStringIntoEditor(SharedPreferences.Editor editor, String str, String str2) {
        if (str2 != null) {
            editor.putString(str, str2);
        }
    }

    public void clearAllConfigurationValues() {
        AppboyLogger.m5448d(TAG, "Clearing Braze Override configuration cache");
        SharedPreferences.Editor edit = this.mStorageMap.edit();
        edit.clear();
        edit.apply();
    }

    public boolean containsKey(String str) {
        return this.mStorageMap.contains(str);
    }

    public boolean getBooleanValue(String str, boolean z) {
        return this.mStorageMap.getBoolean(str, z);
    }

    public int getIntValue(String str, int i) {
        return this.mStorageMap.getInt(str, i);
    }

    public SharedPreferences getStorageMap() {
        return this.mStorageMap;
    }

    public Set<String> getStringSetValue(String str, Set<String> set) {
        return this.mStorageMap.getStringSet(str, set);
    }

    public String getStringValue(String str, String str2) {
        return this.mStorageMap.getString(str, str2);
    }

    public void putEnumIntoEditorAsString(SharedPreferences.Editor editor, String str, Enum<?> enumR) {
        if (enumR != null) {
            putStringIntoEditor(editor, str, enumR.toString());
        }
    }

    public void setConfiguration(BrazeConfig brazeConfig) {
        String str = TAG;
        AppboyLogger.m5453i(str, "Setting Braze Override configuration with config: " + brazeConfig);
        SharedPreferences.Editor edit = this.mStorageMap.edit();
        putStringIntoEditor(edit, AppboyConfigurationProvider.API_KEY, brazeConfig.mApiKey);
        putStringIntoEditor(edit, AppboyConfigurationProvider.SERVER_TARGET_KEY, brazeConfig.mServerTarget);
        putEnumIntoEditorAsString(edit, AppboyConfigurationProvider.SDK_FLAVOR, brazeConfig.mSdkFlavor);
        putBooleanIntoEditor(edit, AppboyConfigurationProvider.NEWSFEED_UNREAD_VISUAL_INDICATOR_ON, brazeConfig.mIsNewsFeedVisualIndicatorOn);
        putStringIntoEditor(edit, AppboyConfigurationProvider.CUSTOM_ENDPOINT, brazeConfig.mCustomEndpoint);
        putStringIntoEditor(edit, AppboyConfigurationProvider.SMALL_NOTIFICATION_ICON_KEY, brazeConfig.mSmallNotificationIcon);
        putStringIntoEditor(edit, AppboyConfigurationProvider.LARGE_NOTIFICATION_ICON_KEY, brazeConfig.mLargeNotificationIcon);
        putIntIntoEditor(edit, AppboyConfigurationProvider.SESSION_TIMEOUT_KEY, brazeConfig.mSessionTimeout);
        putIntIntoEditor(edit, AppboyConfigurationProvider.DEFAULT_NOTIFICATION_ACCENT_COLOR_KEY, brazeConfig.mDefaultNotificationAccentColor);
        putIntIntoEditor(edit, AppboyConfigurationProvider.TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_KEY_SECONDS, brazeConfig.mTriggerActionMinimumTimeIntervalSeconds);
        putBooleanIntoEditor(edit, AppboyConfigurationProvider.ADM_MESSAGING_REGISTRATION_ENABLED_KEY, brazeConfig.mAdmMessagingRegistrationEnabled);
        putBooleanIntoEditor(edit, AppboyConfigurationProvider.HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY, brazeConfig.mHandlePushDeepLinksAutomatically);
        putBooleanIntoEditor(edit, AppboyConfigurationProvider.ENABLE_LOCATION_COLLECTION_KEY, brazeConfig.mIsLocationCollectionEnabled);
        putIntIntoEditor(edit, "com_appboy_data_flush_interval_bad_network", brazeConfig.mBadNetworkInterval);
        putIntIntoEditor(edit, "com_appboy_data_flush_interval_good_network", brazeConfig.mGoodNetworkInterval);
        putIntIntoEditor(edit, "com_appboy_data_flush_interval_great_network", brazeConfig.mGreatNetworkInterval);
        putStringIntoEditor(edit, AppboyConfigurationProvider.DEFAULT_NOTIFICATION_CHANNEL_NAME, brazeConfig.mDefaultNotificationChannelName);
        putStringIntoEditor(edit, AppboyConfigurationProvider.DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION, brazeConfig.mDefaultNotificationChannelDescription);
        putBooleanIntoEditor(edit, AppboyConfigurationProvider.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED_KEY, brazeConfig.mIsPushDeepLinkBackStackActivityEnabled);
        putStringIntoEditor(edit, AppboyConfigurationProvider.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME_KEY, brazeConfig.mPushDeepLinkBackStackActivityClassName);
        putBooleanIntoEditor(edit, AppboyConfigurationProvider.SESSION_START_BASED_TIMEOUT_ENABLED_KEY, brazeConfig.mIsSessionStartBasedTimeoutEnabled);
        putBooleanIntoEditor(edit, AppboyConfigurationProvider.FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED_KEY, brazeConfig.mIsFirebaseCloudMessagingRegistrationEnabled);
        putStringIntoEditor(edit, AppboyConfigurationProvider.FIREBASE_CLOUD_MESSAGING_SENDER_ID_KEY, brazeConfig.mFirebaseCloudMessagingSenderIdKey);
        putBooleanIntoEditor(edit, AppboyConfigurationProvider.CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED, brazeConfig.mIsContentCardsUnreadVisualIndicatorEnabled);
        putBooleanIntoEditor(edit, AppboyConfigurationProvider.DEVICE_OBJECT_ALLOWLISTING_ENABLED_KEY, brazeConfig.mIsDeviceObjectAllowlistEnabled);
        putBooleanIntoEditor(edit, AppboyConfigurationProvider.IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED, brazeConfig.mIsInAppMessageAccessibilityExclusiveModeEnabled);
        putBooleanIntoEditor(edit, AppboyConfigurationProvider.PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED, brazeConfig.mIsPushWakeScreenForNotificationEnabled);
        putBooleanIntoEditor(edit, AppboyConfigurationProvider.PUSH_NOTIFICATION_HTML_RENDERING_ENABLED, brazeConfig.mPushHtmlRenderingEnabled);
        putBooleanIntoEditor(edit, AppboyConfigurationProvider.GEOFENCES_ENABLED, brazeConfig.mGeofencesEnabled);
        putBooleanIntoEditor(edit, AppboyConfigurationProvider.IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY, brazeConfig.mInAppMessageTestPushEagerDisplayEnabled);
        putStringIntoEditor(edit, AppboyConfigurationProvider.CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME_KEY, brazeConfig.mCustomHtmlWebViewActivityClassName);
        putBooleanIntoEditor(edit, AppboyConfigurationProvider.GEOFENCES_AUTOMATIC_REQUESTS_ENABLED_KEY, brazeConfig.mAutomaticGeofenceRequestsEnabled);
        putIntIntoEditor(edit, AppboyConfigurationProvider.IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT_KEY, brazeConfig.mInAppMessageWebViewClientMaxOnPageFinishedWaitMs);
        putBooleanIntoEditor(edit, AppboyConfigurationProvider.f6828xedf5dd9d, brazeConfig.mIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled);
        putBooleanIntoEditor(edit, AppboyConfigurationProvider.SDK_AUTH_ENABLED, brazeConfig.mIsSdkAuthEnabled);
        putBooleanIntoEditor(edit, AppboyConfigurationProvider.REQUIRE_TOUCH_MODE_FOR_HTML_IAMS_KEY, brazeConfig.mIsTouchModeRequiredForHtmlInAppMessages);
        if (brazeConfig.mLocaleToApiMapping != null) {
            putStringIntoEditor(edit, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_KEY, new JSONArray(brazeConfig.mLocaleToApiMapping).toString());
        }
        putEnumSetIntoEditor(edit, brazeConfig.mDeviceObjectAllowlist, AppboyConfigurationProvider.DEVICE_OBJECT_ALLOWLIST_VALUE);
        putEnumSetIntoEditor(edit, brazeConfig.mCustomLocationProviderNames, AppboyConfigurationProvider.CUSTOM_LOCATION_PROVIDERS_LIST_KEY);
        edit.apply();
    }
}
