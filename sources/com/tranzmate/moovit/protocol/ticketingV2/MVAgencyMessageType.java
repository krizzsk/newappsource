package com.tranzmate.moovit.protocol.ticketingV2;

public enum MVAgencyMessageType {
    INFO(1),
    POSITIVE(2),
    ALERT(3),
    CRITICAL(4);
    
    private final int value;

    private MVAgencyMessageType(int i) {
        this.value = i;
    }

    public static MVAgencyMessageType findByValue(int i) {
        if (i == 1) {
            return INFO;
        }
        if (i == 2) {
            return POSITIVE;
        }
        if (i == 3) {
            return ALERT;
        }
        if (i != 4) {
            return null;
        }
        return CRITICAL;
    }

    public int getValue() {
        return this.value;
    }
}
