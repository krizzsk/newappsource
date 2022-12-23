package com.tranzmate.moovit.protocol.kinesis;

public enum MVProfilerStopReason {
    PUSH(1),
    EXPIRED(2);
    
    private final int value;

    private MVProfilerStopReason(int i) {
        this.value = i;
    }

    public static MVProfilerStopReason findByValue(int i) {
        if (i == 1) {
            return PUSH;
        }
        if (i != 2) {
            return null;
        }
        return EXPIRED;
    }

    public int getValue() {
        return this.value;
    }
}
