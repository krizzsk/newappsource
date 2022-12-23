package com.tranzmate.moovit.protocol.carpool;

public enum MVRideRequestStatus {
    WAITING(3),
    CANCELED_BY_PASSENGER(4),
    FULFILLED(5),
    UNFULFILLED(6);
    
    private final int value;

    private MVRideRequestStatus(int i) {
        this.value = i;
    }

    public static MVRideRequestStatus findByValue(int i) {
        if (i == 3) {
            return WAITING;
        }
        if (i == 4) {
            return CANCELED_BY_PASSENGER;
        }
        if (i == 5) {
            return FULFILLED;
        }
        if (i != 6) {
            return null;
        }
        return UNFULFILLED;
    }

    public int getValue() {
        return this.value;
    }
}
