package com.tranzmate.moovit.protocol.common;

public enum MVViewType {
    DEFAULT(1),
    TRIPS(2),
    PLATFORMS(3);
    
    private final int value;

    private MVViewType(int i) {
        this.value = i;
    }

    public static MVViewType findByValue(int i) {
        if (i == 1) {
            return DEFAULT;
        }
        if (i == 2) {
            return TRIPS;
        }
        if (i != 3) {
            return null;
        }
        return PLATFORMS;
    }

    public int getValue() {
        return this.value;
    }
}
