package com.tranzmate.moovit.protocol.linearrivals;

public enum MVArrivalStatus2 {
    ON_TIME(1),
    DELAYED(2),
    CANCELLED(3),
    AHEAD_OF_TIME(4);
    
    private final int value;

    private MVArrivalStatus2(int i) {
        this.value = i;
    }

    public static MVArrivalStatus2 findByValue(int i) {
        if (i == 1) {
            return ON_TIME;
        }
        if (i == 2) {
            return DELAYED;
        }
        if (i == 3) {
            return CANCELLED;
        }
        if (i != 4) {
            return null;
        }
        return AHEAD_OF_TIME;
    }

    public int getValue() {
        return this.value;
    }
}
