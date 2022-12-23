package com.tranzmate.moovit.protocol.conf;

public enum MVSearchLocationHintABTestingType {
    HINT_TYPE_CONTROL(0),
    HINT_TYPE_A(1),
    HINT_TYPE_B(2),
    HINT_TYPE_C(3),
    HINT_TYPE_D(4);
    
    private final int value;

    private MVSearchLocationHintABTestingType(int i) {
        this.value = i;
    }

    public static MVSearchLocationHintABTestingType findByValue(int i) {
        if (i == 0) {
            return HINT_TYPE_CONTROL;
        }
        if (i == 1) {
            return HINT_TYPE_A;
        }
        if (i == 2) {
            return HINT_TYPE_B;
        }
        if (i == 3) {
            return HINT_TYPE_C;
        }
        if (i != 4) {
            return null;
        }
        return HINT_TYPE_D;
    }

    public int getValue() {
        return this.value;
    }
}
