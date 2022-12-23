package com.tranzmate.moovit.protocol.tripplanner;

public enum MVCarpoolRideAttributes {
    INSTANT_BOOKING(1);
    
    private final int value;

    private MVCarpoolRideAttributes(int i) {
        this.value = i;
    }

    public static MVCarpoolRideAttributes findByValue(int i) {
        if (i != 1) {
            return null;
        }
        return INSTANT_BOOKING;
    }

    public int getValue() {
        return this.value;
    }
}
