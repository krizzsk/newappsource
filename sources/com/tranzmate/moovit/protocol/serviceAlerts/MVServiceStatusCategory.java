package com.tranzmate.moovit.protocol.serviceAlerts;

public enum MVServiceStatusCategory {
    None(0),
    Regular(1),
    Info(2),
    Modified(3),
    Critical(4);
    
    private final int value;

    private MVServiceStatusCategory(int i) {
        this.value = i;
    }

    public static MVServiceStatusCategory findByValue(int i) {
        if (i == 0) {
            return None;
        }
        if (i == 1) {
            return Regular;
        }
        if (i == 2) {
            return Info;
        }
        if (i == 3) {
            return Modified;
        }
        if (i != 4) {
            return null;
        }
        return Critical;
    }

    public int getValue() {
        return this.value;
    }
}
