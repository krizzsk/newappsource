package com.tranzmate.moovit.protocol.payments;

public enum MVPaymentSummarySecondaryAction {
    ADD_VOUCHER(1);
    
    private final int value;

    private MVPaymentSummarySecondaryAction(int i) {
        this.value = i;
    }

    public static MVPaymentSummarySecondaryAction findByValue(int i) {
        if (i != 1) {
            return null;
        }
        return ADD_VOUCHER;
    }

    public int getValue() {
        return this.value;
    }
}
