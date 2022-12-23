package com.tranzmate.moovit.protocol.presentation;

public enum MVDelimiterToken {
    Empty(1),
    Arrow(2),
    BiDirectionalArrow(4),
    Dot(5);
    
    private final int value;

    private MVDelimiterToken(int i) {
        this.value = i;
    }

    public static MVDelimiterToken findByValue(int i) {
        if (i == 1) {
            return Empty;
        }
        if (i == 2) {
            return Arrow;
        }
        if (i == 4) {
            return BiDirectionalArrow;
        }
        if (i != 5) {
            return null;
        }
        return Dot;
    }

    public int getValue() {
        return this.value;
    }
}
