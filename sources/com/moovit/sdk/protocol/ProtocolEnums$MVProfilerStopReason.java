package com.moovit.sdk.protocol;

public enum ProtocolEnums$MVProfilerStopReason {
    PUSH(1),
    EXPIRED(2);
    
    private final int value;

    private ProtocolEnums$MVProfilerStopReason(int i) {
        this.value = i;
    }

    public static ProtocolEnums$MVProfilerStopReason findByValue(int i) {
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
