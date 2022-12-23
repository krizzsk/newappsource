package com.tranzmate.moovit.protocol.conf;

public enum MVHomeWorkExperiment {
    CONTROL(1),
    A(2),
    B(3);
    
    private final int value;

    private MVHomeWorkExperiment(int i) {
        this.value = i;
    }

    public static MVHomeWorkExperiment findByValue(int i) {
        if (i == 1) {
            return CONTROL;
        }
        if (i == 2) {
            return A;
        }
        if (i != 3) {
            return null;
        }
        return B;
    }

    public int getValue() {
        return this.value;
    }
}
