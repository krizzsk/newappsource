package com.tranzmate.moovit.protocol.conf;

public enum MVSearchExamplesABTestGroup {
    CONTROL(1),
    TEST(2);
    
    private final int value;

    private MVSearchExamplesABTestGroup(int i) {
        this.value = i;
    }

    public static MVSearchExamplesABTestGroup findByValue(int i) {
        if (i == 1) {
            return CONTROL;
        }
        if (i != 2) {
            return null;
        }
        return TEST;
    }

    public int getValue() {
        return this.value;
    }
}
