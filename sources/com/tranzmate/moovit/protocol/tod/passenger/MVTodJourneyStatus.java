package com.tranzmate.moovit.protocol.tod.passenger;

public enum MVTodJourneyStatus {
    UNKNOWN(1),
    HEADING_PICKUP(2),
    APPROACHING_PICKUP(3),
    ARRIVED_PICKUP(4),
    HEADING_DROP_OFF(5),
    APPROACHING_DROP_OFF(6),
    ARRIVED_DROP_OFF(7);
    
    private final int value;

    private MVTodJourneyStatus(int i) {
        this.value = i;
    }

    public static MVTodJourneyStatus findByValue(int i) {
        switch (i) {
            case 1:
                return UNKNOWN;
            case 2:
                return HEADING_PICKUP;
            case 3:
                return APPROACHING_PICKUP;
            case 4:
                return ARRIVED_PICKUP;
            case 5:
                return HEADING_DROP_OFF;
            case 6:
                return APPROACHING_DROP_OFF;
            case 7:
                return ARRIVED_DROP_OFF;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
