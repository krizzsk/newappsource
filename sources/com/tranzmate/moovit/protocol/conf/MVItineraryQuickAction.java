package com.tranzmate.moovit.protocol.conf;

public enum MVItineraryQuickAction {
    SHARE(1),
    REPORT(2),
    NAVIGATE(3),
    VALIDATE(4),
    PURCHASE_TICKET(5),
    NOTIFY_DRIVER(6),
    LIVE_LOCATION(7);
    
    private final int value;

    private MVItineraryQuickAction(int i) {
        this.value = i;
    }

    public static MVItineraryQuickAction findByValue(int i) {
        switch (i) {
            case 1:
                return SHARE;
            case 2:
                return REPORT;
            case 3:
                return NAVIGATE;
            case 4:
                return VALIDATE;
            case 5:
                return PURCHASE_TICKET;
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
