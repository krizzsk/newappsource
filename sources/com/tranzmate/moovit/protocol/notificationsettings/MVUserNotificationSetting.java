package com.tranzmate.moovit.protocol.notificationsettings;

public enum MVUserNotificationSetting {
    PushNotificationNewsAndUpdate(1),
    PushNotificationServiceAlert(2),
    EmailNewsAndUpdate(3),
    EmailServiceAlert(4),
    InAppPoppNewsAndUpdate(5),
    InAppPoppServiceAlert(6),
    visibility(7),
    PushNotificationMobileTicketing(8),
    PushNotificationMyFavorite(9),
    PushNotificationStopGeofence(10),
    AccessibilityEnabled(20);
    
    private final int value;

    private MVUserNotificationSetting(int i) {
        this.value = i;
    }

    public static MVUserNotificationSetting findByValue(int i) {
        if (i == 20) {
            return AccessibilityEnabled;
        }
        switch (i) {
            case 1:
                return PushNotificationNewsAndUpdate;
            case 2:
                return PushNotificationServiceAlert;
            case 3:
                return EmailNewsAndUpdate;
            case 4:
                return EmailServiceAlert;
            case 5:
                return InAppPoppNewsAndUpdate;
            case 6:
                return InAppPoppServiceAlert;
            case 7:
                return visibility;
            case 8:
                return PushNotificationMobileTicketing;
            case 9:
                return PushNotificationMyFavorite;
            case 10:
                return PushNotificationStopGeofence;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
