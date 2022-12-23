package com.tranzmate.moovit.protocol.conf;

public enum MVTripPlanTimeQuickAction {
    DEPART_NOW(1),
    DEPART_AT(2),
    ARRIVE_BY(3),
    TAKE_LAST_LINE(4);
    
    private final int value;

    private MVTripPlanTimeQuickAction(int i) {
        this.value = i;
    }

    public static MVTripPlanTimeQuickAction findByValue(int i) {
        if (i == 1) {
            return DEPART_NOW;
        }
        if (i == 2) {
            return DEPART_AT;
        }
        if (i == 3) {
            return ARRIVE_BY;
        }
        if (i != 4) {
            return null;
        }
        return TAKE_LAST_LINE;
    }

    public int getValue() {
        return this.value;
    }
}
