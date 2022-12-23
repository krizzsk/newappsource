package com.tranzmate.moovit.protocol.ptb.activations;

public enum MVPTBActivationStatus {
    ACTIVE(1),
    COMPLETED(2),
    HISTORICAL(3);
    
    private final int value;

    private MVPTBActivationStatus(int i) {
        this.value = i;
    }

    public static MVPTBActivationStatus findByValue(int i) {
        if (i == 1) {
            return ACTIVE;
        }
        if (i == 2) {
            return COMPLETED;
        }
        if (i != 3) {
            return null;
        }
        return HISTORICAL;
    }

    public int getValue() {
        return this.value;
    }
}
