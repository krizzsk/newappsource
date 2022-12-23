package com.tranzmate.moovit.protocol.carpool;

public enum MVParkingStatus {
    NOT_ELIGIBLE(0),
    ELIGIBLE(1),
    PARKED(2);
    
    private final int value;

    private MVParkingStatus(int i) {
        this.value = i;
    }

    public static MVParkingStatus findByValue(int i) {
        if (i == 0) {
            return NOT_ELIGIBLE;
        }
        if (i == 1) {
            return ELIGIBLE;
        }
        if (i != 2) {
            return null;
        }
        return PARKED;
    }

    public int getValue() {
        return this.value;
    }
}
