package com.tranzmate.moovit.protocol.crowd;

public enum MVPowerSourceType {
    POWER_SOURCE_TYPE_1(1),
    POWER_SOURCE_TYPE_2(2);
    
    private final int value;

    private MVPowerSourceType(int i) {
        this.value = i;
    }

    public static MVPowerSourceType findByValue(int i) {
        if (i == 1) {
            return POWER_SOURCE_TYPE_1;
        }
        if (i != 2) {
            return null;
        }
        return POWER_SOURCE_TYPE_2;
    }

    public int getValue() {
        return this.value;
    }
}
