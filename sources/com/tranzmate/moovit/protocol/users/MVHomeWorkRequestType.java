package com.tranzmate.moovit.protocol.users;

public enum MVHomeWorkRequestType {
    CAR_POOL(1),
    AUTO_TP(2);
    
    private final int value;

    private MVHomeWorkRequestType(int i) {
        this.value = i;
    }

    public static MVHomeWorkRequestType findByValue(int i) {
        if (i == 1) {
            return CAR_POOL;
        }
        if (i != 2) {
            return null;
        }
        return AUTO_TP;
    }

    public int getValue() {
        return this.value;
    }
}
