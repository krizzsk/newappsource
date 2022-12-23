package com.tranzmate.moovit.protocol.twitterservicealerts;

public enum MVTwitterFeedType {
    AGENCY(1),
    LINE(2);
    
    private final int value;

    private MVTwitterFeedType(int i) {
        this.value = i;
    }

    public static MVTwitterFeedType findByValue(int i) {
        if (i == 1) {
            return AGENCY;
        }
        if (i != 2) {
            return null;
        }
        return LINE;
    }

    public int getValue() {
        return this.value;
    }
}
