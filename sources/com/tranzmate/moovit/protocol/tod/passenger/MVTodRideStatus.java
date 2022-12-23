package com.tranzmate.moovit.protocol.tod.passenger;

public enum MVTodRideStatus {
    ACTIVE(1),
    CANCELLED(2),
    COMPLETED(3),
    NO_SHOW(4),
    FUTURE(5),
    DECLINED(6);
    
    private final int value;

    private MVTodRideStatus(int i) {
        this.value = i;
    }

    public static MVTodRideStatus findByValue(int i) {
        switch (i) {
            case 1:
                return ACTIVE;
            case 2:
                return CANCELLED;
            case 3:
                return COMPLETED;
            case 4:
                return NO_SHOW;
            case 5:
                return FUTURE;
            case 6:
                return DECLINED;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
