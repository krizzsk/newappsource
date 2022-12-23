package com.braze.configuration;

import androidx.annotation.Keep;
import com.appboy.enums.DeviceKey;
import com.appboy.enums.LocationProviderName;
import com.appboy.enums.SdkFlavor;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.EnumSet;
import java.util.List;
import p001a0.C0016g;

@Keep
public class BrazeConfig {
    public static final String TAG = AppboyLogger.getBrazeLogTag(BrazeConfig.class);
    public final Boolean mAdmMessagingRegistrationEnabled;
    public final String mApiKey;
    public final Boolean mAutomaticGeofenceRequestsEnabled;
    public final Integer mBadNetworkInterval;
    public final String mCustomEndpoint;
    public final String mCustomHtmlWebViewActivityClassName;
    public final EnumSet<LocationProviderName> mCustomLocationProviderNames;
    public final Integer mDefaultNotificationAccentColor;
    public final String mDefaultNotificationChannelDescription;
    public final String mDefaultNotificationChannelName;
    public final EnumSet<DeviceKey> mDeviceObjectAllowlist;
    public final String mFirebaseCloudMessagingSenderIdKey;
    public final Boolean mGeofencesEnabled;
    public final Integer mGoodNetworkInterval;
    public final Integer mGreatNetworkInterval;
    public final Boolean mHandlePushDeepLinksAutomatically;
    public final Boolean mInAppMessageTestPushEagerDisplayEnabled;
    public final Integer mInAppMessageWebViewClientMaxOnPageFinishedWaitMs;
    public final Boolean mIsContentCardsUnreadVisualIndicatorEnabled;
    public final Boolean mIsDeviceObjectAllowlistEnabled;
    public final Boolean mIsFirebaseCloudMessagingRegistrationEnabled;
    public final Boolean mIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
    public final Boolean mIsInAppMessageAccessibilityExclusiveModeEnabled;
    public final Boolean mIsLocationCollectionEnabled;
    public final Boolean mIsNewsFeedVisualIndicatorOn;
    public final Boolean mIsPushDeepLinkBackStackActivityEnabled;
    public final Boolean mIsPushWakeScreenForNotificationEnabled;
    public final Boolean mIsSdkAuthEnabled;
    public final Boolean mIsSessionStartBasedTimeoutEnabled;
    public final Boolean mIsTouchModeRequiredForHtmlInAppMessages;
    public final String mLargeNotificationIcon;
    public final List<String> mLocaleToApiMapping;
    public final String mPushDeepLinkBackStackActivityClassName;
    public final Boolean mPushHtmlRenderingEnabled;
    public final SdkFlavor mSdkFlavor;
    public final String mServerTarget;
    public final Integer mSessionTimeout;
    public final String mSmallNotificationIcon;
    public final Integer mTriggerActionMinimumTimeIntervalSeconds;

    @Keep
    public static class Builder {
        public Boolean mAdmMessagingRegistrationEnabled;
        public String mApiKey;
        public Boolean mAutomaticGeofenceRequestsEnabled;
        public Integer mBadNetworkInterval;
        public String mCustomEndpoint;
        public String mCustomHtmlWebViewActivityClassName;
        public EnumSet<LocationProviderName> mCustomLocationProviderNames;
        public Integer mDefaultNotificationAccentColor;
        public String mDefaultNotificationChannelDescription;
        public String mDefaultNotificationChannelName;
        public EnumSet<DeviceKey> mDeviceObjectAllowlist;
        public String mFirebaseCloudMessagingSenderIdKey;
        public Boolean mGeofencesEnabled;
        public Integer mGoodNetworkInterval;
        public Integer mGreatNetworkInterval;
        public Boolean mHandlePushDeepLinksAutomatically;
        public Boolean mInAppMessageTestPushEagerDisplayEnabled;
        public Integer mInAppMessageWebViewClientMaxOnPageFinishedWaitMs;
        public Boolean mIsContentCardsUnreadVisualIndicatorEnabled;
        public Boolean mIsDeviceObjectAllowlistEnabled;
        public Boolean mIsFirebaseCloudMessagingRegistrationEnabled;
        public Boolean mIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
        public Boolean mIsInAppMessageAccessibilityExclusiveModeEnabled;
        public Boolean mIsLocationCollectionEnabled;
        public Boolean mIsNewsFeedVisualIndicatorOn;
        public Boolean mIsPushDeepLinkBackStackActivityEnabled;
        public Boolean mIsPushWakeScreenForNotificationEnabled;
        public Boolean mIsSdkAuthEnabled;
        public Boolean mIsSessionStartBasedTimeoutEnabled;
        public Boolean mIsTouchModeRequiredForHtmlInAppMessages;
        public String mLargeNotificationIconName;
        public List<String> mLocaleToApiMapping;
        public String mPushDeepLinkBackStackActivityClassName;
        public Boolean mPushHtmlRenderingEnabled;
        public SdkFlavor mSdkFlavor;
        public String mServerTarget;
        public Integer mSessionTimeout;
        public String mSmallNotificationIconName;
        public Integer mTriggerActionMinimumTimeIntervalSeconds;

        public BrazeConfig build() {
            return new BrazeConfig(this);
        }

        public Builder setAdmMessagingRegistrationEnabled(boolean z) {
            this.mAdmMessagingRegistrationEnabled = Boolean.valueOf(z);
            return this;
        }

        public Builder setApiKey(String str) {
            if (!StringUtils.isNullOrBlank(str)) {
                this.mApiKey = str;
            } else {
                AppboyLogger.m5459w(BrazeConfig.TAG, "Cannot set Braze API key to null or blank string. API key field not set");
            }
            return this;
        }

        public Builder setAutomaticGeofenceRequestsEnabled(boolean z) {
            this.mAutomaticGeofenceRequestsEnabled = Boolean.valueOf(z);
            return this;
        }

        public Builder setBadNetworkDataFlushInterval(int i) {
            this.mBadNetworkInterval = Integer.valueOf(i);
            return this;
        }

        public Builder setContentCardsUnreadVisualIndicatorEnabled(boolean z) {
            this.mIsContentCardsUnreadVisualIndicatorEnabled = Boolean.valueOf(z);
            return this;
        }

        public Builder setCustomEndpoint(String str) {
            this.mCustomEndpoint = str;
            return this;
        }

        public Builder setCustomLocationProviderNames(EnumSet<LocationProviderName> enumSet) {
            this.mCustomLocationProviderNames = enumSet;
            return this;
        }

        public Builder setCustomWebViewActivityClass(Class<?> cls) {
            if (cls != null) {
                this.mCustomHtmlWebViewActivityClassName = cls.getName();
            }
            return this;
        }

        public Builder setDefaultNotificationAccentColor(int i) {
            this.mDefaultNotificationAccentColor = Integer.valueOf(i);
            return this;
        }

        public Builder setDefaultNotificationChannelDescription(String str) {
            if (!StringUtils.isNullOrBlank(str)) {
                this.mDefaultNotificationChannelDescription = str;
            } else {
                AppboyLogger.m5459w(BrazeConfig.TAG, "Cannot set Braze default NotificationChannel description to null or blank string. NotificationChannel description field not set.");
            }
            return this;
        }

        public Builder setDefaultNotificationChannelName(String str) {
            if (!StringUtils.isNullOrBlank(str)) {
                this.mDefaultNotificationChannelName = str;
            } else {
                AppboyLogger.m5459w(BrazeConfig.TAG, "Cannot set Braze default NotificationChannel name to null or blank string. NotificationChannel name field not set.");
            }
            return this;
        }

        public Builder setDeviceObjectAllowlist(EnumSet<DeviceKey> enumSet) {
            this.mDeviceObjectAllowlist = enumSet;
            return this;
        }

        public Builder setDeviceObjectAllowlistEnabled(boolean z) {
            this.mIsDeviceObjectAllowlistEnabled = Boolean.valueOf(z);
            return this;
        }

        @Deprecated
        public Builder setDeviceObjectWhitelist(EnumSet<DeviceKey> enumSet) {
            return setDeviceObjectAllowlist(enumSet);
        }

        @Deprecated
        public Builder setDeviceObjectWhitelistEnabled(boolean z) {
            return setDeviceObjectAllowlistEnabled(z);
        }

        public Builder setFirebaseCloudMessagingSenderIdKey(String str) {
            if (!StringUtils.isNullOrEmpty(str)) {
                this.mFirebaseCloudMessagingSenderIdKey = str;
            } else {
                AppboyLogger.m5459w(BrazeConfig.TAG, "Cannot set Firebase Cloud Messaging Sender Id to null or empty string. Firebase Cloud Messaging Sender Id field not set");
            }
            return this;
        }

        public Builder setGeofencesEnabled(boolean z) {
            this.mGeofencesEnabled = Boolean.valueOf(z);
            return this;
        }

        public Builder setGoodNetworkDataFlushInterval(int i) {
            this.mGoodNetworkInterval = Integer.valueOf(i);
            return this;
        }

        public Builder setGreatNetworkDataFlushInterval(int i) {
            this.mGreatNetworkInterval = Integer.valueOf(i);
            return this;
        }

        public Builder setHandlePushDeepLinksAutomatically(boolean z) {
            this.mHandlePushDeepLinksAutomatically = Boolean.valueOf(z);
            return this;
        }

        public Builder setInAppMessageTestPushEagerDisplayEnabled(boolean z) {
            this.mInAppMessageTestPushEagerDisplayEnabled = Boolean.valueOf(z);
            return this;
        }

        public Builder setInAppMessageWebViewClientMaxOnPageFinishedWaitMs(int i) {
            if (i < 0) {
                String access$3900 = BrazeConfig.TAG;
                AppboyLogger.m5459w(access$3900, "setInAppMessageWebViewClientMaxOnPageFinishedWaitMs called with negative value. Not setting timeout to: " + i);
                return this;
            }
            this.mInAppMessageWebViewClientMaxOnPageFinishedWaitMs = Integer.valueOf(i);
            return this;
        }

        public Builder setIsFirebaseCloudMessagingRegistrationEnabled(boolean z) {
            this.mIsFirebaseCloudMessagingRegistrationEnabled = Boolean.valueOf(z);
            return this;
        }

        public Builder setIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled(boolean z) {
            this.mIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled = Boolean.valueOf(z);
            return this;
        }

        public Builder setIsInAppMessageAccessibilityExclusiveModeEnabled(boolean z) {
            this.mIsInAppMessageAccessibilityExclusiveModeEnabled = Boolean.valueOf(z);
            return this;
        }

        public Builder setIsLocationCollectionEnabled(boolean z) {
            this.mIsLocationCollectionEnabled = Boolean.valueOf(z);
            return this;
        }

        public Builder setIsPushWakeScreenForNotificationEnabled(boolean z) {
            this.mIsPushWakeScreenForNotificationEnabled = Boolean.valueOf(z);
            return this;
        }

        public Builder setIsSdkAuthenticationEnabled(boolean z) {
            this.mIsSdkAuthEnabled = Boolean.valueOf(z);
            return this;
        }

        public Builder setIsSessionStartBasedTimeoutEnabled(boolean z) {
            this.mIsSessionStartBasedTimeoutEnabled = Boolean.valueOf(z);
            return this;
        }

        public Builder setIsTouchModeRequiredForHtmlInAppMessages(boolean z) {
            this.mIsTouchModeRequiredForHtmlInAppMessages = Boolean.valueOf(z);
            return this;
        }

        public Builder setLargeNotificationIcon(String str) {
            this.mLargeNotificationIconName = str;
            return this;
        }

        public Builder setLocaleToApiMapping(List<String> list) {
            if (!list.isEmpty()) {
                this.mLocaleToApiMapping = list;
            } else {
                AppboyLogger.m5459w(BrazeConfig.TAG, "Cannot set locale to API key mapping to empty list. Locale mapping not set.");
            }
            return this;
        }

        public Builder setNewsfeedVisualIndicatorOn(boolean z) {
            this.mIsNewsFeedVisualIndicatorOn = Boolean.valueOf(z);
            return this;
        }

        public Builder setPushDeepLinkBackStackActivityClass(Class<?> cls) {
            if (cls != null) {
                this.mPushDeepLinkBackStackActivityClassName = cls.getName();
            }
            return this;
        }

        public Builder setPushDeepLinkBackStackActivityEnabled(boolean z) {
            this.mIsPushDeepLinkBackStackActivityEnabled = Boolean.valueOf(z);
            return this;
        }

        public Builder setPushHtmlRenderingEnabled(boolean z) {
            this.mPushHtmlRenderingEnabled = Boolean.valueOf(z);
            return this;
        }

        public Builder setSdkFlavor(SdkFlavor sdkFlavor) {
            this.mSdkFlavor = sdkFlavor;
            return this;
        }

        public Builder setServerTarget(String str) {
            this.mServerTarget = str;
            return this;
        }

        public Builder setSessionTimeout(int i) {
            this.mSessionTimeout = Integer.valueOf(i);
            return this;
        }

        public Builder setSmallNotificationIcon(String str) {
            this.mSmallNotificationIconName = str;
            return this;
        }

        public Builder setTriggerActionMinimumTimeIntervalSeconds(int i) {
            this.mTriggerActionMinimumTimeIntervalSeconds = Integer.valueOf(i);
            return this;
        }
    }

    public BrazeConfig(Builder builder) {
        this.mApiKey = builder.mApiKey;
        this.mAdmMessagingRegistrationEnabled = builder.mAdmMessagingRegistrationEnabled;
        this.mSmallNotificationIcon = builder.mSmallNotificationIconName;
        this.mLargeNotificationIcon = builder.mLargeNotificationIconName;
        this.mCustomEndpoint = builder.mCustomEndpoint;
        this.mSessionTimeout = builder.mSessionTimeout;
        this.mLocaleToApiMapping = builder.mLocaleToApiMapping;
        this.mIsLocationCollectionEnabled = builder.mIsLocationCollectionEnabled;
        this.mDefaultNotificationAccentColor = builder.mDefaultNotificationAccentColor;
        this.mTriggerActionMinimumTimeIntervalSeconds = builder.mTriggerActionMinimumTimeIntervalSeconds;
        this.mHandlePushDeepLinksAutomatically = builder.mHandlePushDeepLinksAutomatically;
        this.mIsNewsFeedVisualIndicatorOn = builder.mIsNewsFeedVisualIndicatorOn;
        this.mBadNetworkInterval = builder.mBadNetworkInterval;
        this.mGoodNetworkInterval = builder.mGoodNetworkInterval;
        this.mGreatNetworkInterval = builder.mGreatNetworkInterval;
        this.mServerTarget = builder.mServerTarget;
        this.mSdkFlavor = builder.mSdkFlavor;
        this.mDefaultNotificationChannelName = builder.mDefaultNotificationChannelName;
        this.mDefaultNotificationChannelDescription = builder.mDefaultNotificationChannelDescription;
        this.mIsPushDeepLinkBackStackActivityEnabled = builder.mIsPushDeepLinkBackStackActivityEnabled;
        this.mPushDeepLinkBackStackActivityClassName = builder.mPushDeepLinkBackStackActivityClassName;
        this.mIsSessionStartBasedTimeoutEnabled = builder.mIsSessionStartBasedTimeoutEnabled;
        this.mFirebaseCloudMessagingSenderIdKey = builder.mFirebaseCloudMessagingSenderIdKey;
        this.mIsFirebaseCloudMessagingRegistrationEnabled = builder.mIsFirebaseCloudMessagingRegistrationEnabled;
        this.mIsContentCardsUnreadVisualIndicatorEnabled = builder.mIsContentCardsUnreadVisualIndicatorEnabled;
        this.mDeviceObjectAllowlist = builder.mDeviceObjectAllowlist;
        this.mIsDeviceObjectAllowlistEnabled = builder.mIsDeviceObjectAllowlistEnabled;
        this.mIsInAppMessageAccessibilityExclusiveModeEnabled = builder.mIsInAppMessageAccessibilityExclusiveModeEnabled;
        this.mIsPushWakeScreenForNotificationEnabled = builder.mIsPushWakeScreenForNotificationEnabled;
        this.mPushHtmlRenderingEnabled = builder.mPushHtmlRenderingEnabled;
        this.mGeofencesEnabled = builder.mGeofencesEnabled;
        this.mInAppMessageTestPushEagerDisplayEnabled = builder.mInAppMessageTestPushEagerDisplayEnabled;
        this.mCustomHtmlWebViewActivityClassName = builder.mCustomHtmlWebViewActivityClassName;
        this.mAutomaticGeofenceRequestsEnabled = builder.mAutomaticGeofenceRequestsEnabled;
        this.mInAppMessageWebViewClientMaxOnPageFinishedWaitMs = builder.mInAppMessageWebViewClientMaxOnPageFinishedWaitMs;
        this.mCustomLocationProviderNames = builder.mCustomLocationProviderNames;
        this.mIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled = builder.mIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
        this.mIsSdkAuthEnabled = builder.mIsSdkAuthEnabled;
        this.mIsTouchModeRequiredForHtmlInAppMessages = builder.mIsTouchModeRequiredForHtmlInAppMessages;
    }

    public static void buildUponToString(StringBuilder sb, String str, Object obj) {
        if (obj != null) {
            sb.append(10);
            sb.append(str);
            sb.append(" = ");
            sb.append(obj);
        }
    }

    public String toString() {
        StringBuilder r = C0016g.m34r(1024, "BrazeConfig{");
        buildUponToString(r, "ApiKey", this.mApiKey);
        buildUponToString(r, "CustomEndpoint", this.mCustomEndpoint);
        buildUponToString(r, "ServerTarget", this.mServerTarget);
        buildUponToString(r, "SdkFlavor", this.mSdkFlavor);
        buildUponToString(r, "SmallNotificationIcon", this.mSmallNotificationIcon);
        buildUponToString(r, "LargeNotificationIcon", this.mLargeNotificationIcon);
        buildUponToString(r, "SessionTimeout", this.mSessionTimeout);
        buildUponToString(r, "DefaultNotificationAccentColor", this.mDefaultNotificationAccentColor);
        buildUponToString(r, "TriggerActionMinimumTimeIntervalSeconds", this.mTriggerActionMinimumTimeIntervalSeconds);
        buildUponToString(r, "BadNetworkInterval", this.mBadNetworkInterval);
        buildUponToString(r, "GoodNetworkInterval", this.mGoodNetworkInterval);
        buildUponToString(r, "GreatNetworkInterval", this.mGreatNetworkInterval);
        buildUponToString(r, "AdmMessagingRegistrationEnabled", this.mAdmMessagingRegistrationEnabled);
        buildUponToString(r, "HandlePushDeepLinksAutomatically", this.mHandlePushDeepLinksAutomatically);
        buildUponToString(r, "IsLocationCollectionEnabled", this.mIsLocationCollectionEnabled);
        buildUponToString(r, "IsNewsFeedVisualIndicatorOn", this.mIsNewsFeedVisualIndicatorOn);
        buildUponToString(r, "LocaleToApiMapping", this.mLocaleToApiMapping);
        buildUponToString(r, "SessionStartBasedTimeoutEnabled", this.mIsSessionStartBasedTimeoutEnabled);
        buildUponToString(r, "IsFirebaseCloudMessagingRegistrationEnabled", this.mIsFirebaseCloudMessagingRegistrationEnabled);
        buildUponToString(r, "FirebaseCloudMessagingSenderIdKey", this.mFirebaseCloudMessagingSenderIdKey);
        buildUponToString(r, "IsDeviceObjectAllowlistEnabled", this.mIsDeviceObjectAllowlistEnabled);
        buildUponToString(r, "DeviceObjectAllowlist", this.mDeviceObjectAllowlist);
        buildUponToString(r, "IsInAppMessageAccessibilityExclusiveModeEnabled", this.mIsInAppMessageAccessibilityExclusiveModeEnabled);
        buildUponToString(r, "IsPushWakeScreenForNotificationEnabled", this.mIsPushWakeScreenForNotificationEnabled);
        buildUponToString(r, "PushHtmlRenderingEnabled", this.mPushHtmlRenderingEnabled);
        buildUponToString(r, "GeofencesEnabled", this.mGeofencesEnabled);
        buildUponToString(r, "InAppMessageTestPushEagerDisplayEnabled", this.mInAppMessageTestPushEagerDisplayEnabled);
        buildUponToString(r, "CustomHtmlWebViewActivityClassName", this.mCustomHtmlWebViewActivityClassName);
        buildUponToString(r, "AutomaticGeofenceRequestsEnabled", this.mAutomaticGeofenceRequestsEnabled);
        buildUponToString(r, "CustomLocationProviderNames", this.mCustomLocationProviderNames);
        buildUponToString(r, "InAppMessageWebViewClientMaxOnPageFinishedWaitMs", this.mInAppMessageWebViewClientMaxOnPageFinishedWaitMs);
        buildUponToString(r, "IsFirebaseMessagingServiceOnNewTokenRegistrationEnabled", this.mIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled);
        buildUponToString(r, "IsSdkAuthEnabled", this.mIsSdkAuthEnabled);
        r.append("\n}");
        return r.toString();
    }
}
