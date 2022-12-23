package com.moovit.sdk.protocol;

public enum ProtocolEnums$MVLocationMode {
    LOCATION_MODE_OFF(0),
    LOCATION_MODE_HIGH_ACCURACY(1),
    LOCATION_MODE_SENSORS_ONLY(2),
    LOCATION_MODE_BATTERY_SAVING(3),
    LOCATION_MODE_KITKAT_NETWORK_ONLY(4),
    LOCATION_MODE_UNKNOWN(5);
    
    private final int value;

    private ProtocolEnums$MVLocationMode(int i) {
        this.value = i;
    }

    public static ProtocolEnums$MVLocationMode findByValue(int i) {
        if (i == 0) {
            return LOCATION_MODE_OFF;
        }
        if (i == 1) {
            return LOCATION_MODE_HIGH_ACCURACY;
        }
        if (i == 2) {
            return LOCATION_MODE_SENSORS_ONLY;
        }
        if (i == 3) {
            return LOCATION_MODE_BATTERY_SAVING;
        }
        if (i == 4) {
            return LOCATION_MODE_KITKAT_NETWORK_ONLY;
        }
        if (i != 5) {
            return null;
        }
        return LOCATION_MODE_UNKNOWN;
    }

    public int getValue() {
        return this.value;
    }
}
