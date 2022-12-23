package com.tranzmate.moovit.protocol.tod.passenger;

public enum MVTodOrderMode {
    ONLINE(0),
    OFFLINE(1),
    FRG(2),
    SHUTTLE(3);
    
    private final int value;

    private MVTodOrderMode(int i) {
        this.value = i;
    }

    public static MVTodOrderMode findByValue(int i) {
        if (i == 0) {
            return ONLINE;
        }
        if (i == 1) {
            return OFFLINE;
        }
        if (i == 2) {
            return FRG;
        }
        if (i != 3) {
            return null;
        }
        return SHUTTLE;
    }

    public int getValue() {
        return this.value;
    }
}
