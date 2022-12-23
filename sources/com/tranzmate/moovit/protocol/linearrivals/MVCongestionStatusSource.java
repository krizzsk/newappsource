package com.tranzmate.moovit.protocol.linearrivals;

public enum MVCongestionStatusSource {
    SENSOR(1),
    USER(2),
    PREDICTION(3);
    
    private final int value;

    private MVCongestionStatusSource(int i) {
        this.value = i;
    }

    public static MVCongestionStatusSource findByValue(int i) {
        if (i == 1) {
            return SENSOR;
        }
        if (i == 2) {
            return USER;
        }
        if (i != 3) {
            return null;
        }
        return PREDICTION;
    }

    public int getValue() {
        return this.value;
    }
}
