package com.tranzmate.moovit.protocol.ptb.activations;

public enum MVPTBPaymentMethodType {
    PANGO(1),
    BIT(2);
    
    private final int value;

    private MVPTBPaymentMethodType(int i) {
        this.value = i;
    }

    public static MVPTBPaymentMethodType findByValue(int i) {
        if (i == 1) {
            return PANGO;
        }
        if (i != 2) {
            return null;
        }
        return BIT;
    }

    public int getValue() {
        return this.value;
    }
}
