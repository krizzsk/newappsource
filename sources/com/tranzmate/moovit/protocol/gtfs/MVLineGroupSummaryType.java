package com.tranzmate.moovit.protocol.gtfs;

public enum MVLineGroupSummaryType {
    REGULAR(1),
    DIRECTIONAL(2);
    
    private final int value;

    private MVLineGroupSummaryType(int i) {
        this.value = i;
    }

    public static MVLineGroupSummaryType findByValue(int i) {
        if (i == 1) {
            return REGULAR;
        }
        if (i != 2) {
            return null;
        }
        return DIRECTIONAL;
    }

    public int getValue() {
        return this.value;
    }
}
