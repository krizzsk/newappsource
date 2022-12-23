package com.moovit.sdk.protocol;

public enum ProtocolEnums$MVRecordingType {
    DC_RECORDING(0),
    ACTIVITY_PROFILER(1),
    ANAGOG_PROFILER(2),
    BATTERY_PROFILER(3),
    HOME_PROFILER(4),
    LOCATIONS_PROFILER(5),
    WIFI_PROFILER(6),
    BT_PROFILER(7),
    CHARGE_PROFILER(8),
    IOS_LOCATION_PROFILER(9),
    IOS_VISIT_PROFILER(10),
    WIFI_SCAN_PROFILER(11),
    ANDROID_BEACONS_SCAN(12),
    ANDROID_STEP_COUNTER(13),
    ACTIVITY_TRANSITION_PROFILER(14);
    
    private final int value;

    private ProtocolEnums$MVRecordingType(int i) {
        this.value = i;
    }

    public static ProtocolEnums$MVRecordingType findByValue(int i) {
        switch (i) {
            case 0:
                return DC_RECORDING;
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
                return WIFI_PROFILER;
            case 7:
                return BT_PROFILER;
            case 8:
                return CHARGE_PROFILER;
            case 9:
                return IOS_LOCATION_PROFILER;
            case 10:
                return IOS_VISIT_PROFILER;
            case 11:
                return WIFI_SCAN_PROFILER;
            case 12:
                return ANDROID_BEACONS_SCAN;
            case 13:
                return ANDROID_STEP_COUNTER;
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
