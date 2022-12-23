package com.tranzmate.moovit.protocol.conf;

public enum MVTripPlanOption {
    LEAST_WALKING(1),
    FASTEST(2),
    LEAST_TRANSFERS(3);
    
    private final int value;

    private MVTripPlanOption(int i) {
        this.value = i;
    }

    public static MVTripPlanOption findByValue(int i) {
        if (i == 1) {
            return LEAST_WALKING;
        }
        if (i == 2) {
            return FASTEST;
        }
        if (i != 3) {
            return null;
        }
        return LEAST_TRANSFERS;
    }

    public int getValue() {
        return this.value;
    }
}
