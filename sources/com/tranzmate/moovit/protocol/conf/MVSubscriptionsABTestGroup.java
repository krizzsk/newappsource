package com.tranzmate.moovit.protocol.conf;

public enum MVSubscriptionsABTestGroup {
    TEST_GROUP_A(1),
    TEST_GROUP_B(2);
    
    private final int value;

    private MVSubscriptionsABTestGroup(int i) {
        this.value = i;
    }

    public static MVSubscriptionsABTestGroup findByValue(int i) {
        if (i == 1) {
            return TEST_GROUP_A;
        }
        if (i != 2) {
            return null;
        }
        return TEST_GROUP_B;
    }

    public int getValue() {
        return this.value;
    }
}
