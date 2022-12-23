package com.tranzmate.moovit.protocol.carpool;

public enum MVCouponType {
    REFERRAL(1),
    SOCIAL(2);
    
    private final int value;

    private MVCouponType(int i) {
        this.value = i;
    }

    public static MVCouponType findByValue(int i) {
        if (i == 1) {
            return REFERRAL;
        }
        if (i != 2) {
            return null;
        }
        return SOCIAL;
    }

    public int getValue() {
        return this.value;
    }
}
