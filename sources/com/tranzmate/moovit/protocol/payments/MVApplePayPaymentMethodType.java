package com.tranzmate.moovit.protocol.payments;

public enum MVApplePayPaymentMethodType {
    UNKNOWN(0),
    DEBIT(1),
    EMONEY(2),
    CREDIT(3),
    PREPAID(4),
    STORE(5);
    
    private final int value;

    private MVApplePayPaymentMethodType(int i) {
        this.value = i;
    }

    public static MVApplePayPaymentMethodType findByValue(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return DEBIT;
        }
        if (i == 2) {
            return EMONEY;
        }
        if (i == 3) {
            return CREDIT;
        }
        if (i == 4) {
            return PREPAID;
        }
        if (i != 5) {
            return null;
        }
        return STORE;
    }

    public int getValue() {
        return this.value;
    }
}
