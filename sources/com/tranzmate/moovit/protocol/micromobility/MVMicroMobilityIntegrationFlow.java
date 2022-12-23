package com.tranzmate.moovit.protocol.micromobility;

public enum MVMicroMobilityIntegrationFlow {
    DEEP_LINK(1),
    RESERVE(2),
    UNLOCK(3);
    
    private final int value;

    private MVMicroMobilityIntegrationFlow(int i) {
        this.value = i;
    }

    public static MVMicroMobilityIntegrationFlow findByValue(int i) {
        if (i == 1) {
            return DEEP_LINK;
        }
        if (i == 2) {
            return RESERVE;
        }
        if (i != 3) {
            return null;
        }
        return UNLOCK;
    }

    public int getValue() {
        return this.value;
    }
}
