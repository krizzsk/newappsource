package com.tranzmate.moovit.protocol.gtfs;

public enum MVPathwayType {
    BOTH(1),
    ENTRANCE(2),
    EXIT(3);
    
    private final int value;

    private MVPathwayType(int i) {
        this.value = i;
    }

    public static MVPathwayType findByValue(int i) {
        if (i == 1) {
            return BOTH;
        }
        if (i == 2) {
            return ENTRANCE;
        }
        if (i != 3) {
            return null;
        }
        return EXIT;
    }

    public int getValue() {
        return this.value;
    }
}
