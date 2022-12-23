package com.tranzmate.moovit.protocol.ridesharing;

public enum MVRSEventRideRealTimeStatus {
    UNKNOWN(1),
    WAITINGFOR_BUS(2),
    ON_BUS(3),
    NOT_REPORTED_ON_BUS(4),
    BOARDED_ON_BUS(5);
    
    private final int value;

    private MVRSEventRideRealTimeStatus(int i) {
        this.value = i;
    }

    public static MVRSEventRideRealTimeStatus findByValue(int i) {
        if (i == 1) {
            return UNKNOWN;
        }
        if (i == 2) {
            return WAITINGFOR_BUS;
        }
        if (i == 3) {
            return ON_BUS;
        }
        if (i == 4) {
            return NOT_REPORTED_ON_BUS;
        }
        if (i != 5) {
            return null;
        }
        return BOARDED_ON_BUS;
    }

    public int getValue() {
        return this.value;
    }
}
