package com.tranzmate.moovit.protocol.payments;

public enum MVInputFieldType {
    USERNAME(1),
    EMAIL(2),
    PASSWORD(3),
    TEXT(4),
    NUMBER(5),
    DEVICEID(6);
    
    private final int value;

    private MVInputFieldType(int i) {
        this.value = i;
    }

    public static MVInputFieldType findByValue(int i) {
        switch (i) {
            case 1:
                return USERNAME;
            case 2:
                return EMAIL;
            case 3:
                return PASSWORD;
            case 4:
                return TEXT;
            case 5:
                return NUMBER;
            case 6:
                return DEVICEID;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
