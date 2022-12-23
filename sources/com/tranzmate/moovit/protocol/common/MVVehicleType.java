package com.tranzmate.moovit.protocol.common;

public enum MVVehicleType {
    BUS(1),
    MINIBUS(2),
    TAXI(3);
    
    private final int value;

    private MVVehicleType(int i) {
        this.value = i;
    }

    public static MVVehicleType findByValue(int i) {
        if (i == 1) {
            return BUS;
        }
        if (i == 2) {
            return MINIBUS;
        }
        if (i != 3) {
            return null;
        }
        return TAXI;
    }

    public int getValue() {
        return this.value;
    }
}
