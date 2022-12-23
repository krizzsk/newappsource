package com.tranzmate.moovit.protocol.conf;

public enum MVSuggestedRoutesCellImprovementsExperiment {
    CONTROL(1),
    A(2),
    B(3),
    C(4),
    D(5);
    
    private final int value;

    private MVSuggestedRoutesCellImprovementsExperiment(int i) {
        this.value = i;
    }

    public static MVSuggestedRoutesCellImprovementsExperiment findByValue(int i) {
        if (i == 1) {
            return CONTROL;
        }
        if (i == 2) {
            return A;
        }
        if (i == 3) {
            return B;
        }
        if (i == 4) {
            return C;
        }
        if (i != 5) {
            return null;
        }
        return D;
    }

    public int getValue() {
        return this.value;
    }
}
