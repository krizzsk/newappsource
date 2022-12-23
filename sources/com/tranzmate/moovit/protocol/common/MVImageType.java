package com.tranzmate.moovit.protocol.common;

public enum MVImageType {
    PNG(1),
    MVF(2),
    NINE_PATCH(3);
    
    private final int value;

    private MVImageType(int i) {
        this.value = i;
    }

    public static MVImageType findByValue(int i) {
        if (i == 1) {
            return PNG;
        }
        if (i == 2) {
            return MVF;
        }
        if (i != 3) {
            return null;
        }
        return NINE_PATCH;
    }

    public int getValue() {
        return this.value;
    }
}
