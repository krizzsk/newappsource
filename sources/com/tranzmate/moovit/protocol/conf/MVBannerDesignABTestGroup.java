package com.tranzmate.moovit.protocol.conf;

public enum MVBannerDesignABTestGroup {
    CONTROL(1),
    TEST_GROUP_A(2),
    TEST_GROUP_B(3),
    TEST_GROUP_C(4),
    TEST_GROUP_D(5),
    TEST_GROUP_E(6);
    
    private final int value;

    private MVBannerDesignABTestGroup(int i) {
        this.value = i;
    }

    public static MVBannerDesignABTestGroup findByValue(int i) {
        switch (i) {
            case 1:
                return CONTROL;
            case 2:
                return TEST_GROUP_A;
            case 3:
                return TEST_GROUP_B;
            case 4:
                return TEST_GROUP_C;
            case 5:
                return TEST_GROUP_D;
            case 6:
                return TEST_GROUP_E;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
