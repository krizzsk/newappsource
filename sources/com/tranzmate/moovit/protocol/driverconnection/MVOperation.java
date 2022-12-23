package com.tranzmate.moovit.protocol.driverconnection;

public enum MVOperation {
    BOARDING(1),
    ALIGHTING(2);
    
    private final int value;

    private MVOperation(int i) {
        this.value = i;
    }

    public static MVOperation findByValue(int i) {
        if (i == 1) {
            return BOARDING;
        }
        if (i != 2) {
            return null;
        }
        return ALIGHTING;
    }

    public int getValue() {
        return this.value;
    }
}
