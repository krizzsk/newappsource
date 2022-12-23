package com.moovit.sdk.protocol;

public enum ProtocolEnums$MVStartState {
    f23111OK(1),
    RECOVERIBLE(2),
    UNRECOVERIABLE(3);
    
    private final int value;

    private ProtocolEnums$MVStartState(int i) {
        this.value = i;
    }

    public static ProtocolEnums$MVStartState findByValue(int i) {
        if (i == 1) {
            return f23111OK;
        }
        if (i == 2) {
            return RECOVERIBLE;
        }
        if (i != 3) {
            return null;
        }
        return UNRECOVERIABLE;
    }

    public int getValue() {
        return this.value;
    }
}
