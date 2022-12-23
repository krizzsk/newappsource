package com.tranzmate.moovit.protocol.users;

public enum MVGender {
    Male(0),
    Female(1);
    
    private final int value;

    private MVGender(int i) {
        this.value = i;
    }

    public static MVGender findByValue(int i) {
        if (i == 0) {
            return Male;
        }
        if (i != 1) {
            return null;
        }
        return Female;
    }

    public int getValue() {
        return this.value;
    }
}
