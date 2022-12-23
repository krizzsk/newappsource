package com.tranzmate.moovit.protocol.kinesis;

public enum MVUserActionType {
    TELL_A_FRIEND(1),
    RATE_ON_STORE(2),
    LINES_SEARCH(3);
    
    private final int value;

    private MVUserActionType(int i) {
        this.value = i;
    }

    public static MVUserActionType findByValue(int i) {
        if (i == 1) {
            return TELL_A_FRIEND;
        }
        if (i == 2) {
            return RATE_ON_STORE;
        }
        if (i != 3) {
            return null;
        }
        return LINES_SEARCH;
    }

    public int getValue() {
        return this.value;
    }
}
