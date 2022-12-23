package com.tranzmate.moovit.protocol.tripplanner;

public enum MVAlgorithmType {
    FILTER(0),
    PREFERRED(1);
    
    private final int value;

    private MVAlgorithmType(int i) {
        this.value = i;
    }

    public static MVAlgorithmType findByValue(int i) {
        if (i == 0) {
            return FILTER;
        }
        if (i != 1) {
            return null;
        }
        return PREFERRED;
    }

    public int getValue() {
        return this.value;
    }
}
