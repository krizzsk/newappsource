package com.tranzmate.moovit.protocol.tripplanner;

public enum MVMultiModalCarLeg {
    FIRST(1),
    LAST(2);
    
    private final int value;

    private MVMultiModalCarLeg(int i) {
        this.value = i;
    }

    public static MVMultiModalCarLeg findByValue(int i) {
        if (i == 1) {
            return FIRST;
        }
        if (i != 2) {
            return null;
        }
        return LAST;
    }

    public int getValue() {
        return this.value;
    }
}
