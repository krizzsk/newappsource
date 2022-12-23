package com.tranzmate.moovit.protocol.conf;

public enum MVLineViewQuickAction {
    FAVORITE(1),
    REPORT(2),
    GET_OFF_ALERTS(3),
    VALIDATE(4),
    PURCHASE(5),
    NOTIFY_DRIVER(6),
    LIVE_LOCATION(7);
    
    private final int value;

    private MVLineViewQuickAction(int i) {
        this.value = i;
    }

    public static MVLineViewQuickAction findByValue(int i) {
        switch (i) {
            case 1:
                return FAVORITE;
            case 2:
                return REPORT;
            case 3:
                return GET_OFF_ALERTS;
            case 4:
                return VALIDATE;
            case 5:
                return PURCHASE;
            case 6:
                return NOTIFY_DRIVER;
            case 7:
                return LIVE_LOCATION;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
