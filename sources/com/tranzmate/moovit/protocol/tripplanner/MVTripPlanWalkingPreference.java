package com.tranzmate.moovit.protocol.tripplanner;

public enum MVTripPlanWalkingPreference {
    SLOW_WALKING(1),
    MAX_WALKING_TIME(2);
    
    private final int value;

    private MVTripPlanWalkingPreference(int i) {
        this.value = i;
    }

    public static MVTripPlanWalkingPreference findByValue(int i) {
        if (i == 1) {
            return SLOW_WALKING;
        }
        if (i != 2) {
            return null;
        }
        return MAX_WALKING_TIME;
    }

    public int getValue() {
        return this.value;
    }
}
