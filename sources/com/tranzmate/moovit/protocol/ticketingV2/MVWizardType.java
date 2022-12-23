package com.tranzmate.moovit.protocol.ticketingV2;

public enum MVWizardType {
    FLAT(1),
    FILTERED(2),
    STOP_TO_STOP(3);
    
    private final int value;

    private MVWizardType(int i) {
        this.value = i;
    }

    public static MVWizardType findByValue(int i) {
        if (i == 1) {
            return FLAT;
        }
        if (i == 2) {
            return FILTERED;
        }
        if (i != 3) {
            return null;
        }
        return STOP_TO_STOP;
    }

    public int getValue() {
        return this.value;
    }
}
