package com.tranzmate.moovit.protocol.conf;

public enum MVAdsConsentLayoutABTestGroup {
    CONTROL(1),
    TEST_A(2),
    TEST_B(3),
    TEST_C(4);
    
    private final int value;

    private MVAdsConsentLayoutABTestGroup(int i) {
        this.value = i;
    }

    public static MVAdsConsentLayoutABTestGroup findByValue(int i) {
        if (i == 1) {
            return CONTROL;
        }
        if (i == 2) {
            return TEST_A;
        }
        if (i == 3) {
            return TEST_B;
        }
        if (i != 4) {
            return null;
        }
        return TEST_C;
    }

    public int getValue() {
        return this.value;
    }
}
