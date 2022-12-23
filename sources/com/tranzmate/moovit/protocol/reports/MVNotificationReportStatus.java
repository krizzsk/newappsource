package com.tranzmate.moovit.protocol.reports;

public enum MVNotificationReportStatus {
    RECEIVED(1),
    EXECUTED(2),
    FAILED(3);
    
    private final int value;

    private MVNotificationReportStatus(int i) {
        this.value = i;
    }

    public static MVNotificationReportStatus findByValue(int i) {
        if (i == 1) {
            return RECEIVED;
        }
        if (i == 2) {
            return EXECUTED;
        }
        if (i != 3) {
            return null;
        }
        return FAILED;
    }

    public int getValue() {
        return this.value;
    }
}
