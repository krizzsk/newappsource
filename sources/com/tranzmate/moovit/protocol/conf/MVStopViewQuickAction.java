package com.tranzmate.moovit.protocol.conf;

public enum MVStopViewQuickAction {
    FAVORITE(1),
    REPORT(2),
    VALIDATE(3),
    PURCHASE(4),
    NOTIFY_DRIVER(6),
    LIVE_LOCATION(7);
    
    private final int value;

    private MVStopViewQuickAction(int i) {
        this.value = i;
    }

    public static MVStopViewQuickAction findByValue(int i) {
        if (i == 1) {
            return FAVORITE;
        }
        if (i == 2) {
            return REPORT;
        }
        if (i == 3) {
            return VALIDATE;
        }
        if (i == 4) {
            return PURCHASE;
        }
        if (i == 6) {
            return NOTIFY_DRIVER;
        }
        if (i != 7) {
            return null;
        }
        return LIVE_LOCATION;
    }

    public int getValue() {
        return this.value;
    }
}
