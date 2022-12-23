package com.tranzmate.moovit.protocol.tod.passenger;

public enum MVTodPassengerActionRequiredInfoType {
    NONE(1),
    QR_CODE(2),
    PIN_CODE(3);
    
    private final int value;

    private MVTodPassengerActionRequiredInfoType(int i) {
        this.value = i;
    }

    public static MVTodPassengerActionRequiredInfoType findByValue(int i) {
        if (i == 1) {
            return NONE;
        }
        if (i == 2) {
            return QR_CODE;
        }
        if (i != 3) {
            return null;
        }
        return PIN_CODE;
    }

    public int getValue() {
        return this.value;
    }
}
