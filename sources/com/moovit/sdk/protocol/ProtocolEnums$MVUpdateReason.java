package com.moovit.sdk.protocol;

public enum ProtocolEnums$MVUpdateReason {
    PERIODIC(1),
    PROPERTIES_CHANGED(2);
    
    private final int value;

    private ProtocolEnums$MVUpdateReason(int i) {
        this.value = i;
    }

    public static ProtocolEnums$MVUpdateReason findByValue(int i) {
        if (i == 1) {
            return PERIODIC;
        }
        if (i != 2) {
            return null;
        }
        return PROPERTIES_CHANGED;
    }

    public int getValue() {
        return this.value;
    }
}
