package com.tranzmate.moovit.protocol.fare;

public enum MVFareUsage {
    Pay(1),
    Transfer(2),
    Continue(3),
    Upgrade(4),
    Deleted(5);
    
    private final int value;

    private MVFareUsage(int i) {
        this.value = i;
    }

    public static MVFareUsage findByValue(int i) {
        if (i == 1) {
            return Pay;
        }
        if (i == 2) {
            return Transfer;
        }
        if (i == 3) {
            return Continue;
        }
        if (i == 4) {
            return Upgrade;
        }
        if (i != 5) {
            return null;
        }
        return Deleted;
    }

    public int getValue() {
        return this.value;
    }
}
