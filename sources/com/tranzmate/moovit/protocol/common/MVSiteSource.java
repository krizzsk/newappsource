package com.tranzmate.moovit.protocol.common;

public enum MVSiteSource {
    UNDEFINED(0),
    EVENT(1);
    
    private final int value;

    private MVSiteSource(int i) {
        this.value = i;
    }

    public static MVSiteSource findByValue(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i != 1) {
            return null;
        }
        return EVENT;
    }

    public int getValue() {
        return this.value;
    }
}
