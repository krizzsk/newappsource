package com.tranzmate.moovit.protocol.ticketingV2;

public enum MVStoredValueStatus {
    f29111OK(1),
    LOW_BALANCE(2);
    
    private final int value;

    private MVStoredValueStatus(int i) {
        this.value = i;
    }

    public static MVStoredValueStatus findByValue(int i) {
        if (i == 1) {
            return f29111OK;
        }
        if (i != 2) {
            return null;
        }
        return LOW_BALANCE;
    }

    public int getValue() {
        return this.value;
    }
}
