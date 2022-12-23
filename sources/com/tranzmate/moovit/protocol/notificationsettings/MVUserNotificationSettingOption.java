package com.tranzmate.moovit.protocol.notificationsettings;

public enum MVUserNotificationSettingOption {
    CommuteHours(1),
    AnyTime(2),
    Never(3);
    
    private final int value;

    private MVUserNotificationSettingOption(int i) {
        this.value = i;
    }

    public static MVUserNotificationSettingOption findByValue(int i) {
        if (i == 1) {
            return CommuteHours;
        }
        if (i == 2) {
            return AnyTime;
        }
        if (i != 3) {
            return null;
        }
        return Never;
    }

    public int getValue() {
        return this.value;
    }
}
