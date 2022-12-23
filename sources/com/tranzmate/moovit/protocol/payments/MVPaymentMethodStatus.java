package com.tranzmate.moovit.protocol.payments;

public enum MVPaymentMethodStatus {
    f27507OK(1),
    EXPIRED(2);
    
    private final int value;

    private MVPaymentMethodStatus(int i) {
        this.value = i;
    }

    public static MVPaymentMethodStatus findByValue(int i) {
        if (i == 1) {
            return f27507OK;
        }
        if (i != 2) {
            return null;
        }
        return EXPIRED;
    }

    public int getValue() {
        return this.value;
    }
}
