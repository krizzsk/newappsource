package com.tranzmate.moovit.protocol.payments;

public enum MVVerificationStatus {
    PENDING(1),
    VALIDATED(2),
    NOTVALID(3),
    NOTUPLOADED(4),
    EXPIRED(5);
    
    private final int value;

    private MVVerificationStatus(int i) {
        this.value = i;
    }

    public static MVVerificationStatus findByValue(int i) {
        if (i == 1) {
            return PENDING;
        }
        if (i == 2) {
            return VALIDATED;
        }
        if (i == 3) {
            return NOTVALID;
        }
        if (i == 4) {
            return NOTUPLOADED;
        }
        if (i != 5) {
            return null;
        }
        return EXPIRED;
    }

    public int getValue() {
        return this.value;
    }
}
