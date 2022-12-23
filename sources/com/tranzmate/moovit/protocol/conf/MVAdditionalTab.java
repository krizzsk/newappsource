package com.tranzmate.moovit.protocol.conf;

public enum MVAdditionalTab {
    CAR_POOL(1),
    TOPUP(2),
    SERVICE_ALERTS(3);
    
    private final int value;

    private MVAdditionalTab(int i) {
        this.value = i;
    }

    public static MVAdditionalTab findByValue(int i) {
        if (i == 1) {
            return CAR_POOL;
        }
        if (i == 2) {
            return TOPUP;
        }
        if (i != 3) {
            return null;
        }
        return SERVICE_ALERTS;
    }

    public int getValue() {
        return this.value;
    }
}
