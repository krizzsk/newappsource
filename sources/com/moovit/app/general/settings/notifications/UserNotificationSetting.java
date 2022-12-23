package com.moovit.app.general.settings.notifications;

import ce0.C21100e;

public enum UserNotificationSetting {
    PushNotificationNewsAndUpdate(1, "push_notification_general_news"),
    PushNotificationMyFavorite(2, "push_notification_favorite_lines_alerts"),
    PushNotificationServiceAlert(3, "push_notification_metro_area_alerts"),
    PushNotificationMobileTicketing(4, "push_notification_mobile_ticketing"),
    PushNotificationStopGeofence(9, "push_notification_nearby_favorite_line_alert");
    
    private final String analyticsName;

    /* renamed from: id */
    private final int f38066id;

    private UserNotificationSetting(int i, String str) {
        this.f38066id = i;
        C21100e.m49373x(str, "analyticsName");
        this.analyticsName = str;
    }

    public String getAnalyticsName() {
        return this.analyticsName;
    }

    public String getId() {
        return String.valueOf(this.f38066id);
    }
}
