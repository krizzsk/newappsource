package com.tranzmate.moovit.protocol.payments;

public enum MVPaymentAccountBadgeType {
    INFO(1),
    POSITIVE(2),
    ALERT(3),
    CRITICAL(4);
    
    private final int value;

    private MVPaymentAccountBadgeType(int i) {
        this.value = i;
    }

    public static MVPaymentAccountBadgeType findByValue(int i) {
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
