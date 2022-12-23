package com.tranzmate.moovit.protocol.payments;

public enum MVTokenizeStatus {
    SUCCESS(1),
    REJECTED(2),
    FAILED(3),
    CANCELLED(4),
    NOT_PROCESSED(5);
    
    private final int value;

    private MVTokenizeStatus(int i) {
        this.value = i;
    }

    public static MVTokenizeStatus findByValue(int i) {
        if (i == 1) {
            return SUCCESS;
        }
        if (i == 2) {
            return REJECTED;
        }
        if (i == 3) {
            return FAILED;
        }
        if (i == 4) {
            return CANCELLED;
        }
        if (i != 5) {
            return null;
        }
        return NOT_PROCESSED;
    }

    public int getValue() {
        return this.value;
    }
}
