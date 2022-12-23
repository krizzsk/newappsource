package com.tranzmate.moovit.protocol.checkin;

public enum MVPathReliability {
    RELIABLE(1),
    NOT_RELIABLE(2),
    IRRELEVANT(3);
    
    private final int value;

    private MVPathReliability(int i) {
        this.value = i;
    }

    public static MVPathReliability findByValue(int i) {
        if (i == 1) {
            return RELIABLE;
        }
        if (i == 2) {
            return NOT_RELIABLE;
        }
        if (i != 3) {
            return null;
        }
        return IRRELEVANT;
    }

    public int getValue() {
        return this.value;
    }
}
