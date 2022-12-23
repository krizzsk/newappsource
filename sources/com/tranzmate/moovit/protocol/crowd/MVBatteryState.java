package com.tranzmate.moovit.protocol.crowd;

public enum MVBatteryState {
    Draining(0),
    Charging(1);
    
    private final int value;

    private MVBatteryState(int i) {
        this.value = i;
    }

    public static MVBatteryState findByValue(int i) {
        if (i == 0) {
            return Draining;
        }
        if (i != 1) {
            return null;
        }
        return Charging;
    }

    public int getValue() {
        return this.value;
    }
}
