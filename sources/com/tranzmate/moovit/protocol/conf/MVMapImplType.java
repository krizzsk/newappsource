package com.tranzmate.moovit.protocol.conf;

public enum MVMapImplType {
    NUTITEQ(1),
    BAIDU(2),
    GOOGLE(3);
    
    private final int value;

    private MVMapImplType(int i) {
        this.value = i;
    }

    public static MVMapImplType findByValue(int i) {
        if (i == 1) {
            return NUTITEQ;
        }
        if (i == 2) {
            return BAIDU;
        }
        if (i != 3) {
            return null;
        }
        return GOOGLE;
    }

    public int getValue() {
        return this.value;
    }
}
