package com.tranzmate.moovit.protocol.wondo;

public enum MVWondoRewardStatus {
    BOUGHT(0),
    USED(1),
    CANCELLED(2),
    TEST_CODE(99);
    
    private final int value;

    private MVWondoRewardStatus(int i) {
        this.value = i;
    }

    public static MVWondoRewardStatus findByValue(int i) {
        if (i == 0) {
            return BOUGHT;
        }
        if (i == 1) {
            return USED;
        }
        if (i == 2) {
            return CANCELLED;
        }
        if (i != 99) {
            return null;
        }
        return TEST_CODE;
    }

    public int getValue() {
        return this.value;
    }
}
