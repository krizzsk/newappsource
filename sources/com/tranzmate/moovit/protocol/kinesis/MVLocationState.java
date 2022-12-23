package com.tranzmate.moovit.protocol.kinesis;

public enum MVLocationState {
    LOCATION_AVAILABLE(1),
    LOCATION_NOT_AVAILABLE(2),
    NO_PERMISSION(3),
    UNKNOWN(4);
    
    private final int value;

    private MVLocationState(int i) {
        this.value = i;
    }

    public static MVLocationState findByValue(int i) {
        if (i == 1) {
            return LOCATION_AVAILABLE;
        }
        if (i == 2) {
            return LOCATION_NOT_AVAILABLE;
        }
        if (i == 3) {
            return NO_PERMISSION;
        }
        if (i != 4) {
            return null;
        }
        return UNKNOWN;
    }

    public int getValue() {
        return this.value;
    }
}
