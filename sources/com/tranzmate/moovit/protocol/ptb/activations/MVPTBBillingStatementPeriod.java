package com.tranzmate.moovit.protocol.ptb.activations;

public enum MVPTBBillingStatementPeriod {
    DAY(1),
    MONTH(2);
    
    private final int value;

    private MVPTBBillingStatementPeriod(int i) {
        this.value = i;
    }

    public static MVPTBBillingStatementPeriod findByValue(int i) {
        if (i == 1) {
            return DAY;
        }
        if (i != 2) {
            return null;
        }
        return MONTH;
    }

    public int getValue() {
        return this.value;
    }
}
