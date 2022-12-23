package com.tranzmate.moovit.protocol.ticketingV2;

public enum MVTicketAlert {
    EXPIRING(1),
    PASSBOOK_LOW_TRIP(2),
    PURCHASE_FAILURE(3);
    
    private final int value;

    private MVTicketAlert(int i) {
        this.value = i;
    }

    public static MVTicketAlert findByValue(int i) {
        if (i == 1) {
            return EXPIRING;
        }
        if (i == 2) {
            return PASSBOOK_LOW_TRIP;
        }
        if (i != 3) {
            return null;
        }
        return PURCHASE_FAILURE;
    }

    public int getValue() {
        return this.value;
    }
}
