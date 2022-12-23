package com.tranzmate.moovit.protocol.common;

public enum MVTextFormat {
    PLAIN(0),
    HTML(1);
    
    private final int value;

    private MVTextFormat(int i) {
        this.value = i;
    }

    public static MVTextFormat findByValue(int i) {
        if (i == 0) {
            return PLAIN;
        }
        if (i != 1) {
            return null;
        }
        return HTML;
    }

    public int getValue() {
        return this.value;
    }
}
