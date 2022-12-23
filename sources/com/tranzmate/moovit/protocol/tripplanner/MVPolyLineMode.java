package com.tranzmate.moovit.protocol.tripplanner;

public enum MVPolyLineMode {
    WALK(0),
    CAR(1);
    
    private final int value;

    private MVPolyLineMode(int i) {
        this.value = i;
    }

    public static MVPolyLineMode findByValue(int i) {
        if (i == 0) {
            return WALK;
        }
        if (i != 1) {
            return null;
        }
        return CAR;
    }

    public int getValue() {
        return this.value;
    }
}
