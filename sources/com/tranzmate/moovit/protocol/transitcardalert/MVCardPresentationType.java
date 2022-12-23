package com.tranzmate.moovit.protocol.transitcardalert;

public enum MVCardPresentationType {
    REGULAR(0),
    BALANCE(1);
    
    private final int value;

    private MVCardPresentationType(int i) {
        this.value = i;
    }

    public static MVCardPresentationType findByValue(int i) {
        if (i == 0) {
            return REGULAR;
        }
        if (i != 1) {
            return null;
        }
        return BALANCE;
    }

    public int getValue() {
        return this.value;
    }
}
