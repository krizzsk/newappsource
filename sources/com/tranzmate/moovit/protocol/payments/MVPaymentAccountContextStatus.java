package com.tranzmate.moovit.protocol.payments;

public enum MVPaymentAccountContextStatus {
    INCOMPLETE(1),
    CONNECTED(2),
    DISCONNECTED(3),
    BLACKLIST(4),
    BLOCK(5);
    
    private final int value;

    private MVPaymentAccountContextStatus(int i) {
        this.value = i;
    }

    public static MVPaymentAccountContextStatus findByValue(int i) {
        if (i == 1) {
            return INCOMPLETE;
        }
        if (i == 2) {
            return CONNECTED;
        }
        if (i == 3) {
            return DISCONNECTED;
        }
        if (i == 4) {
            return BLACKLIST;
        }
        if (i != 5) {
            return null;
        }
        return BLOCK;
    }

    public int getValue() {
        return this.value;
    }
}
