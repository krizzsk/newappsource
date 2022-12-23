package com.tranzmate.moovit.protocol.payments;

public enum MVIdentificationType {
    LOCAL_ID(1),
    LOCAL_PASSPORT(2);
    
    private final int value;

    private MVIdentificationType(int i) {
        this.value = i;
    }

    public static MVIdentificationType findByValue(int i) {
        if (i == 1) {
            return LOCAL_ID;
        }
        if (i != 2) {
            return null;
        }
        return LOCAL_PASSPORT;
    }

    public int getValue() {
        return this.value;
    }
}
