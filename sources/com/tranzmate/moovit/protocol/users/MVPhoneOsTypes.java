package com.tranzmate.moovit.protocol.users;

public enum MVPhoneOsTypes {
    IPhone(1),
    Android(2),
    WinPhone(3);
    
    private final int value;

    private MVPhoneOsTypes(int i) {
        this.value = i;
    }

    public static MVPhoneOsTypes findByValue(int i) {
        if (i == 1) {
            return IPhone;
        }
        if (i == 2) {
            return Android;
        }
        if (i != 3) {
            return null;
        }
        return WinPhone;
    }

    public int getValue() {
        return this.value;
    }
}
