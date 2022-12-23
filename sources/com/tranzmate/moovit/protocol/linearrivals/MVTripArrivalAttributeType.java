package com.tranzmate.moovit.protocol.linearrivals;

public enum MVTripArrivalAttributeType {
    MAIN_TRIP_STOPS(1);
    
    private final int value;

    private MVTripArrivalAttributeType(int i) {
        this.value = i;
    }

    public static MVTripArrivalAttributeType findByValue(int i) {
        if (i != 1) {
            return null;
        }
        return MAIN_TRIP_STOPS;
    }

    public int getValue() {
        return this.value;
    }
}
