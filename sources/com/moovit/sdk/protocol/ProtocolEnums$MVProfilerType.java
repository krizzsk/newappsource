package com.moovit.sdk.protocol;

public enum ProtocolEnums$MVProfilerType {
    ACTIVITY_PROFILER(1),
    ANAGOG_PROFILER(2),
    BATTERY_PROFILER(3),
    HOME_PROFILER(4),
    LOCATIONS_PROFILER(5),
    WIFI_CONNECTIVITY_PROFILER(6),
    BT_CONNECTIVITY_PROFILER(7),
    POWER_SOURCE_CONNECTIVITY_PROFILER(8),
    IOS_LOCATION(9),
    IOS_VISIT(10),
    WIFI_SCANS_PROFILER(11),
    ANDROID_BEACONS_SCAN(12),
    STEP_COUNTER(13),
    ACTIVITY_TRANSITION_PROFILER(14);
    
    private final int value;

    private ProtocolEnums$MVProfilerType(int i) {
        this.value = i;
    }

    public static ProtocolEnums$MVProfilerType findByValue(int i) {
        switch (i) {
            case 1:
                return ACTIVITY_PROFILER;
            case 2:
                return ANAGOG_PROFILER;
            case 3:
                return BATTERY_PROFILER;
            case 4:
                return HOME_PROFILER;
            case 5:
                return LOCATIONS_PROFILER;
            case 6:
                return WIFI_CONNECTIVITY_PROFILER;
            case 7:
                return BT_CONNECTIVITY_PROFILER;
            case 8:
                return POWER_SOURCE_CONNECTIVITY_PROFILER;
            case 9:
                return IOS_LOCATION;
            case 10:
                return IOS_VISIT;
            case 11:
                return WIFI_SCANS_PROFILER;
            case 12:
                return ANDROID_BEACONS_SCAN;
            case 13:
                return STEP_COUNTER;
            case 14:
                return ACTIVITY_TRANSITION_PROFILER;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
