package com.moovit.sdk.protocol;

public enum ProtocolEnums$MVDCProfilerType {
    ANDROID_LOCATIONS(1),
    ANDROID_ACTIVITY(2),
    IOS_VISIT(3),
    IOS_LOCATION_CHANGE(4),
    ANDROID_WIFI(5),
    ANDROID_BT(6),
    ANDROID_POWER_SOURCE(7),
    ANDROID_WIFI_SCANS(8),
    ANDROID_BEACONS_SCAN(9),
    ANDROID_STEPS_COUNTER(10),
    ANDROID_ACTIVITY_TRANSITION(11);
    
    private final int value;

    private ProtocolEnums$MVDCProfilerType(int i) {
        this.value = i;
    }

    public static ProtocolEnums$MVDCProfilerType findByValue(int i) {
        switch (i) {
            case 1:
                return ANDROID_LOCATIONS;
            case 2:
                return ANDROID_ACTIVITY;
            case 3:
                return IOS_VISIT;
            case 4:
                return IOS_LOCATION_CHANGE;
            case 5:
                return ANDROID_WIFI;
            case 6:
                return ANDROID_BT;
            case 7:
                return ANDROID_POWER_SOURCE;
            case 8:
                return ANDROID_WIFI_SCANS;
            case 9:
                return ANDROID_BEACONS_SCAN;
            case 10:
                return ANDROID_STEPS_COUNTER;
            case 11:
                return ANDROID_ACTIVITY_TRANSITION;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
