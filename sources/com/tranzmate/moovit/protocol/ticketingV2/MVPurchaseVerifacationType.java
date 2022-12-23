package com.tranzmate.moovit.protocol.ticketingV2;

public enum MVPurchaseVerifacationType {
    NONE(1),
    CVV(2);
    
    private final int value;

    private MVPurchaseVerifacationType(int i) {
        this.value = i;
    }

    public static MVPurchaseVerifacationType findByValue(int i) {
        if (i == 1) {
            return NONE;
        }
        if (i != 2) {
            return null;
        }
        return CVV;
    }

    public int getValue() {
        return this.value;
    }
}
