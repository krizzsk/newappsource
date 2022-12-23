package com.tranzmate.moovit.protocol.taxi;

public enum MVTaxiVisibility {
    ALWAYS(1),
    NOT_INSTALLED(2),
    PAYMENT_ACCOUNT_CONNECTED(3);
    
    private final int value;

    private MVTaxiVisibility(int i) {
        this.value = i;
    }

    public static MVTaxiVisibility findByValue(int i) {
        if (i == 1) {
            return ALWAYS;
        }
        if (i == 2) {
            return NOT_INSTALLED;
        }
        if (i != 3) {
            return null;
        }
        return PAYMENT_ACCOUNT_CONNECTED;
    }

    public int getValue() {
        return this.value;
    }
}
