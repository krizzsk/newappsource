package com.tranzmate.moovit.protocol.conf;

public enum MVARExperiment {
    DISABLED(1),
    OPT_IN(2),
    OPT_OUT(3),
    ACTIVE(4);
    
    private final int value;

    private MVARExperiment(int i) {
        this.value = i;
    }

    public static MVARExperiment findByValue(int i) {
        if (i == 1) {
            return DISABLED;
        }
        if (i == 2) {
            return OPT_IN;
        }
        if (i == 3) {
            return OPT_OUT;
        }
        if (i != 4) {
            return null;
        }
        return ACTIVE;
    }

    public int getValue() {
        return this.value;
    }
}
