package com.tranzmate.moovit.protocol.payments;

public enum MVPaymentAccountProductType {
    SUBSCRIPTION(1);
    
    private final int value;

    private MVPaymentAccountProductType(int i) {
        this.value = i;
    }

    public static MVPaymentAccountProductType findByValue(int i) {
        if (i != 1) {
            return null;
        }
        return SUBSCRIPTION;
    }

    public int getValue() {
        return this.value;
    }
}
