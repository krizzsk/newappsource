package com.tranzmate.moovit.protocol.tripplanner;

public enum MVTimeType {
    Arrival(1),
    Departure(2),
    Last(3);
    
    private final int value;

    private MVTimeType(int i) {
        this.value = i;
    }

    public static MVTimeType findByValue(int i) {
        if (i == 1) {
            return Arrival;
        }
        if (i == 2) {
            return Departure;
        }
        if (i != 3) {
            return null;
        }
        return Last;
    }

    public int getValue() {
        return this.value;
    }
}
