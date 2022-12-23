package com.tranzmate.moovit.protocol.reports;

public enum MVReportMode {
    None(1),
    BatteryEfficient(2),
    Always(3);
    
    private final int value;

    private MVReportMode(int i) {
        this.value = i;
    }

    public static MVReportMode findByValue(int i) {
        if (i == 1) {
            return None;
        }
        if (i == 2) {
            return BatteryEfficient;
        }
        if (i != 3) {
            return null;
        }
        return Always;
    }

    public int getValue() {
        return this.value;
    }
}
