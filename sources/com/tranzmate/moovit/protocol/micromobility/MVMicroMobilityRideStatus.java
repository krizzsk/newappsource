package com.tranzmate.moovit.protocol.micromobility;

public enum MVMicroMobilityRideStatus {
    Reserved(1),
    Active(2),
    Completed(3),
    Cancelled(4),
    Expired(5),
    Paused(6),
    Pending(7);
    
    private final int value;

    private MVMicroMobilityRideStatus(int i) {
        this.value = i;
    }

    public static MVMicroMobilityRideStatus findByValue(int i) {
        switch (i) {
            case 1:
                return Reserved;
            case 2:
                return Active;
            case 3:
                return Completed;
            case 4:
                return Cancelled;
            case 5:
                return Expired;
            case 6:
                return Paused;
            case 7:
                return Pending;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
