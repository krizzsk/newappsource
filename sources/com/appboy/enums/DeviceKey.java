package com.appboy.enums;

import androidx.annotation.Keep;
import com.appsflyer.ServerParameters;

@Keep
public enum DeviceKey {
    ANDROID_VERSION("os_version"),
    CARRIER(ServerParameters.CARRIER),
    MODEL(ServerParameters.MODEL),
    RESOLUTION("resolution"),
    LOCALE("locale"),
    TIMEZONE("time_zone"),
    NOTIFICATIONS_ENABLED("remote_notification_enabled"),
    IS_BACKGROUND_RESTRICTED("android_is_background_restricted"),
    GOOGLE_ADVERTISING_ID("google_ad_id"),
    AD_TRACKING_ENABLED("ad_tracking_enabled");
    
    public final String mKey;

    /* access modifiers changed from: public */
    DeviceKey(String str) {
        this.mKey = str;
    }

    public String getKey() {
        return this.mKey;
    }
}
