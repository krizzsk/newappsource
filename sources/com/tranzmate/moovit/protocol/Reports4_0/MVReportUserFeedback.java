package com.tranzmate.moovit.protocol.Reports4_0;

public enum MVReportUserFeedback {
    None(0),
    Like(1),
    Notlike(2);
    
    private final int value;

    private MVReportUserFeedback(int i) {
        this.value = i;
    }

    public static MVReportUserFeedback findByValue(int i) {
        if (i == 0) {
            return None;
        }
        if (i == 1) {
            return Like;
        }
        if (i != 2) {
            return null;
        }
        return Notlike;
    }

    public int getValue() {
        return this.value;
    }
}
