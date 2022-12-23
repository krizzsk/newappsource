package com.tranzmate.moovit.protocol.payments;

public enum MVApplePayContactField {
    POSTAL_ADDRESS(0),
    EMAIL_ADDRESS(1),
    PHONE_NUMBER(2),
    NAME(3),
    PHONETIC_NAME(4);
    
    private final int value;

    private MVApplePayContactField(int i) {
        this.value = i;
    }

    public static MVApplePayContactField findByValue(int i) {
        if (i == 0) {
            return POSTAL_ADDRESS;
        }
        if (i == 1) {
            return EMAIL_ADDRESS;
        }
        if (i == 2) {
            return PHONE_NUMBER;
        }
        if (i == 3) {
            return NAME;
        }
        if (i != 4) {
            return null;
        }
        return PHONETIC_NAME;
    }

    public int getValue() {
        return this.value;
    }
}
