package com.tranzmate.moovit.protocol.ticketingV2;

public enum MVTicketStatus {
    PURCHASED(2),
    ACTIVE(3),
    EXPIRED(5),
    AUTO_ACTIVE(7),
    NOT_YET_VALID(8),
    ISSUING_IN_PROGRESS(10);
    
    private final int value;

    private MVTicketStatus(int i) {
        this.value = i;
    }

    public static MVTicketStatus findByValue(int i) {
        if (i == 2) {
            return PURCHASED;
        }
        if (i == 3) {
            return ACTIVE;
        }
        if (i == 5) {
            return EXPIRED;
        }
        if (i == 10) {
            return ISSUING_IN_PROGRESS;
        }
        if (i == 7) {
            return AUTO_ACTIVE;
        }
        if (i != 8) {
            return null;
        }
        return NOT_YET_VALID;
    }

    public int getValue() {
        return this.value;
    }
}
