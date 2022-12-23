package com.tranzmate.moovit.protocol.tripplanner;

public enum MVCarpoolType {
    ANONYMOUS(1),
    SINGLE_DRIVER(2),
    NEARBY_DRIVERS(3);
    
    private final int value;

    private MVCarpoolType(int i) {
        this.value = i;
    }

    public static MVCarpoolType findByValue(int i) {
        if (i == 1) {
            return ANONYMOUS;
        }
        if (i == 2) {
            return SINGLE_DRIVER;
        }
        if (i != 3) {
            return null;
        }
        return NEARBY_DRIVERS;
    }

    public int getValue() {
        return this.value;
    }
}
