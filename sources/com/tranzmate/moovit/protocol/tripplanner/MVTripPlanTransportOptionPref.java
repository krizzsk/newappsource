package com.tranzmate.moovit.protocol.tripplanner;

public enum MVTripPlanTransportOptionPref {
    BICYCLE(1),
    SCOOTER(2),
    MOPED(3),
    CAR(4),
    PERSONAL_CAR(5);
    
    private final int value;

    private MVTripPlanTransportOptionPref(int i) {
        this.value = i;
    }

    public static MVTripPlanTransportOptionPref findByValue(int i) {
        if (i == 1) {
            return BICYCLE;
        }
        if (i == 2) {
            return SCOOTER;
        }
        if (i == 3) {
            return MOPED;
        }
        if (i == 4) {
            return CAR;
        }
        if (i != 5) {
            return null;
        }
        return PERSONAL_CAR;
    }

    public int getValue() {
        return this.value;
    }
}
