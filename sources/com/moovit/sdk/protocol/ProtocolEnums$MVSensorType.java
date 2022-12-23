package com.moovit.sdk.protocol;

public enum ProtocolEnums$MVSensorType {
    WIFI(1),
    BLUETOOTH(2),
    ACTIVITY_RECOGNITION(3),
    MAGNETIC(4),
    ACCELEROMETER(5),
    GYRO(6),
    LOCATION(7),
    CONNECTIVITY(8),
    BATTERY(9),
    APP_STATE(10),
    DEVICE_MOTION(11),
    CLOCK_OFFSET(12),
    TRIGGER(13),
    FUSED_LOCATION(14),
    LOW_POWER_LOCATION(15),
    HOME_PROFILER(16),
    ANAGOG_LOCATION(17),
    WIFI_EXTENDED(18),
    TOURMALLINE(19),
    VISIT(20),
    WIFI_CONNECTIVITY(21),
    BT_CONNECTIVITY(22),
    POWER_SOURCE_CONNECTIVITY(23),
    STEP_COUNTER(24),
    BEACON(25),
    ACTIVITY_TRANSITION_RECOGNITION(26);
    
    private final int value;

    private ProtocolEnums$MVSensorType(int i) {
        this.value = i;
    }

    public static ProtocolEnums$MVSensorType findByValue(int i) {
        switch (i) {
            case 1:
                return WIFI;
            case 2:
                return BLUETOOTH;
            case 3:
                return ACTIVITY_RECOGNITION;
            case 4:
                return MAGNETIC;
            case 5:
                return ACCELEROMETER;
            case 6:
                return GYRO;
            case 7:
                return LOCATION;
            case 8:
                return CONNECTIVITY;
            case 9:
                return BATTERY;
            case 10:
                return APP_STATE;
            case 11:
                return DEVICE_MOTION;
            case 12:
                return CLOCK_OFFSET;
            case 13:
                return TRIGGER;
            case 14:
                return FUSED_LOCATION;
            case 15:
                return LOW_POWER_LOCATION;
            case 16:
                return HOME_PROFILER;
            case 17:
                return ANAGOG_LOCATION;
            case 18:
                return WIFI_EXTENDED;
            case 19:
                return TOURMALLINE;
            case 20:
                return VISIT;
            case 21:
                return WIFI_CONNECTIVITY;
            case 22:
                return BT_CONNECTIVITY;
            case 23:
                return POWER_SOURCE_CONNECTIVITY;
            case 24:
                return STEP_COUNTER;
            case 25:
                return BEACON;
            case 26:
                return ACTIVITY_TRANSITION_RECOGNITION;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
