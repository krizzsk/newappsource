package com.tranzmate.moovit.protocol.mapitems;

public enum MVDirectAdOperator {
    IS_ANY_OF(1),
    IS_NONE_OF(2);
    
    private final int value;

    private MVDirectAdOperator(int i) {
        this.value = i;
    }

    public static MVDirectAdOperator findByValue(int i) {
        if (i == 1) {
            return IS_ANY_OF;
        }
        if (i != 2) {
            return null;
        }
        return IS_NONE_OF;
    }

    public int getValue() {
        return this.value;
    }
}
