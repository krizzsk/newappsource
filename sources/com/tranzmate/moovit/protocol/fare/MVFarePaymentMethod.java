package com.tranzmate.moovit.protocol.fare;

public enum MVFarePaymentMethod {
    ON_BOARD(0),
    BEFORE_BOARDING(1);
    
    private final int value;

    private MVFarePaymentMethod(int i) {
        this.value = i;
    }

    public static MVFarePaymentMethod findByValue(int i) {
        if (i == 0) {
            return ON_BOARD;
        }
        if (i != 1) {
            return null;
        }
        return BEFORE_BOARDING;
    }

    public int getValue() {
        return this.value;
    }
}
