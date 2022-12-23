package com.tranzmate.moovit.protocol.common;

public enum MVDirection {
    Forward(0),
    Backward(1),
    Unspecified(2);
    
    private final int value;

    private MVDirection(int i) {
        this.value = i;
    }

    public static MVDirection findByValue(int i) {
        if (i == 0) {
            return Forward;
        }
        if (i == 1) {
            return Backward;
        }
        if (i != 2) {
            return null;
        }
        return Unspecified;
    }

    public int getValue() {
        return this.value;
    }
}
