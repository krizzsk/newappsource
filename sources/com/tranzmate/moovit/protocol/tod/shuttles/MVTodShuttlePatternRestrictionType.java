package com.tranzmate.moovit.protocol.tod.shuttles;

public enum MVTodShuttlePatternRestrictionType {
    PICKUP_ONLY(1),
    DROP_OFF_ONLY(2);
    
    private final int value;

    private MVTodShuttlePatternRestrictionType(int i) {
        this.value = i;
    }

    public static MVTodShuttlePatternRestrictionType findByValue(int i) {
        if (i == 1) {
            return PICKUP_ONLY;
        }
        if (i != 2) {
            return null;
        }
        return DROP_OFF_ONLY;
    }

    public int getValue() {
        return this.value;
    }
}
