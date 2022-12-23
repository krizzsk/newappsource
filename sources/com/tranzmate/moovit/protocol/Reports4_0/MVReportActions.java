package com.tranzmate.moovit.protocol.Reports4_0;

public enum MVReportActions {
    Like(0),
    Unlike(1),
    Reset(2),
    Flag(3),
    Unflag(4),
    Delete(5);
    
    private final int value;

    private MVReportActions(int i) {
        this.value = i;
    }

    public static MVReportActions findByValue(int i) {
        if (i == 0) {
            return Like;
        }
        if (i == 1) {
            return Unlike;
        }
        if (i == 2) {
            return Reset;
        }
        if (i == 3) {
            return Flag;
        }
        if (i == 4) {
            return Unflag;
        }
        if (i != 5) {
            return null;
        }
        return Delete;
    }

    public int getValue() {
        return this.value;
    }
}
