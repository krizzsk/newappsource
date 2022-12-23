package com.tranzmate.moovit.protocol.tripplanner;

public enum MVGroupType {
    NONE(1),
    NO_GROUPING(2),
    LINE_GROUPING(3),
    STOP_GROUPING(4);
    
    private final int value;

    private MVGroupType(int i) {
        this.value = i;
    }

    public static MVGroupType findByValue(int i) {
        if (i == 1) {
            return NONE;
        }
        if (i == 2) {
            return NO_GROUPING;
        }
        if (i == 3) {
            return LINE_GROUPING;
        }
        if (i != 4) {
            return null;
        }
        return STOP_GROUPING;
    }

    public int getValue() {
        return this.value;
    }
}
