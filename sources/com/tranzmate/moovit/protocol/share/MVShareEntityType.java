package com.tranzmate.moovit.protocol.share;

public enum MVShareEntityType {
    ITINERARY(1);
    
    private final int value;

    private MVShareEntityType(int i) {
        this.value = i;
    }

    public static MVShareEntityType findByValue(int i) {
        if (i != 1) {
            return null;
        }
        return ITINERARY;
    }

    public int getValue() {
        return this.value;
    }
}
