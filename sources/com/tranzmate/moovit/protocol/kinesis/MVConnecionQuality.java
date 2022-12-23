package com.tranzmate.moovit.protocol.kinesis;

public enum MVConnecionQuality {
    POOR(1),
    MODERATE(2),
    GOOD(3),
    EXCELLENT(4),
    UNKNOWN(5);
    
    private final int value;

    private MVConnecionQuality(int i) {
        this.value = i;
    }

    public static MVConnecionQuality findByValue(int i) {
        if (i == 1) {
            return POOR;
        }
        if (i == 2) {
            return MODERATE;
        }
        if (i == 3) {
            return GOOD;
        }
        if (i == 4) {
            return EXCELLENT;
        }
        if (i != 5) {
            return null;
        }
        return UNKNOWN;
    }

    public int getValue() {
        return this.value;
    }
}
