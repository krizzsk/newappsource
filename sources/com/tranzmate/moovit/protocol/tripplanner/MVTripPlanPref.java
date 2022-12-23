package com.tranzmate.moovit.protocol.tripplanner;

public enum MVTripPlanPref {
    LeastWalking(1),
    Fastest(2),
    LeastTransfers(3),
    Earliest(4);
    
    private final int value;

    private MVTripPlanPref(int i) {
        this.value = i;
    }

    public static MVTripPlanPref findByValue(int i) {
        if (i == 1) {
            return LeastWalking;
        }
        if (i == 2) {
            return Fastest;
        }
        if (i == 3) {
            return LeastTransfers;
        }
        if (i != 4) {
            return null;
        }
        return Earliest;
    }

    public int getValue() {
        return this.value;
    }
}
