package com.tranzmate.moovit.protocol.carpool;

public enum MVRideConfirmationStatus {
    PER_RIDE(1),
    PER_DAY(2),
    AUTO_CONFIRM(3);
    
    private final int value;

    private MVRideConfirmationStatus(int i) {
        this.value = i;
    }

    public static MVRideConfirmationStatus findByValue(int i) {
        if (i == 1) {
            return PER_RIDE;
        }
        if (i == 2) {
            return PER_DAY;
        }
        if (i != 3) {
            return null;
        }
        return AUTO_CONFIRM;
    }

    public int getValue() {
        return this.value;
    }
}
