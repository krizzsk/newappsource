package com.tranzmate.moovit.protocol.payment;

public enum MVZoozVersion {
    ZOOZ(0),
    PAYMENTSOS(1);
    
    private final int value;

    private MVZoozVersion(int i) {
        this.value = i;
    }

    public static MVZoozVersion findByValue(int i) {
        if (i == 0) {
            return ZOOZ;
        }
        if (i != 1) {
            return null;
        }
        return PAYMENTSOS;
    }

    public int getValue() {
        return this.value;
    }
}
