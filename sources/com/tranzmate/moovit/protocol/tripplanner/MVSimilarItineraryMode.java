package com.tranzmate.moovit.protocol.tripplanner;

public enum MVSimilarItineraryMode {
    PREV(0),
    NEXT(1),
    REFRESH(2);
    
    private final int value;

    private MVSimilarItineraryMode(int i) {
        this.value = i;
    }

    public static MVSimilarItineraryMode findByValue(int i) {
        if (i == 0) {
            return PREV;
        }
        if (i == 1) {
            return NEXT;
        }
        if (i != 2) {
            return null;
        }
        return REFRESH;
    }

    public int getValue() {
        return this.value;
    }
}
