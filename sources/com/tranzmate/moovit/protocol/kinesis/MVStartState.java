package com.tranzmate.moovit.protocol.kinesis;

public enum MVStartState {
    f26090OK(1),
    RECOVERIBLE(2),
    UNRECOVERIABLE(3);
    
    private final int value;

    private MVStartState(int i) {
        this.value = i;
    }

    public static MVStartState findByValue(int i) {
        if (i == 1) {
            return f26090OK;
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
