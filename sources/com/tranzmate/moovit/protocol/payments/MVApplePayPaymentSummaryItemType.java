package com.tranzmate.moovit.protocol.payments;

public enum MVApplePayPaymentSummaryItemType {
    FINAL(0),
    PENDING(1);
    
    private final int value;

    private MVApplePayPaymentSummaryItemType(int i) {
        this.value = i;
    }

    public static MVApplePayPaymentSummaryItemType findByValue(int i) {
        if (i == 0) {
            return FINAL;
        }
        if (i != 1) {
            return null;
        }
        return PENDING;
    }

    public int getValue() {
        return this.value;
    }
}
