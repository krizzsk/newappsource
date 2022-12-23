package com.tranzmate.moovit.protocol.ticketingV2;

public enum MVTicketClinetEngine {
    MASABI(3),
    XIMEDES(6);
    
    private final int value;

    private MVTicketClinetEngine(int i) {
        this.value = i;
    }

    public static MVTicketClinetEngine findByValue(int i) {
        if (i == 3) {
            return MASABI;
        }
        if (i != 6) {
            return null;
        }
        return XIMEDES;
    }

    public int getValue() {
        return this.value;
    }
}
