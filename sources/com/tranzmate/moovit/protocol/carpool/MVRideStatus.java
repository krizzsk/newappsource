package com.tranzmate.moovit.protocol.carpool;

public enum MVRideStatus {
    NOT_STARTED(0),
    DRIVING_TO_PICKUP_LOCATION(1),
    AT_PICKUP_LOCATION(2),
    DRIVING_TO_DESTINATION(3),
    FINISHED(4);
    
    private final int value;

    private MVRideStatus(int i) {
        this.value = i;
    }

    public static MVRideStatus findByValue(int i) {
        if (i == 0) {
            return NOT_STARTED;
        }
        if (i == 1) {
            return DRIVING_TO_PICKUP_LOCATION;
        }
        if (i == 2) {
            return AT_PICKUP_LOCATION;
        }
        if (i == 3) {
            return DRIVING_TO_DESTINATION;
        }
        if (i != 4) {
            return null;
        }
        return FINISHED;
    }

    public int getValue() {
        return this.value;
    }
}
