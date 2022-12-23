package com.tranzmate.moovit.protocol.kinesis;

public enum MVAnalyticsProducer {
    APP_SERVER(1),
    SECURE_SERVER(3),
    SURVEY_SERVER(5);
    
    private final int value;

    private MVAnalyticsProducer(int i) {
        this.value = i;
    }

    public static MVAnalyticsProducer findByValue(int i) {
        if (i == 1) {
            return APP_SERVER;
        }
        if (i == 3) {
            return SECURE_SERVER;
        }
        if (i != 5) {
            return null;
        }
        return SURVEY_SERVER;
    }

    public int getValue() {
        return this.value;
    }
}
