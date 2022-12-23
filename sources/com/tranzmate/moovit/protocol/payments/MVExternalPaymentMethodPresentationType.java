package com.tranzmate.moovit.protocol.payments;

public enum MVExternalPaymentMethodPresentationType {
    TITLE_EMPHASIS(1),
    SUBTITLE_EMPHASIS(2);
    
    private final int value;

    private MVExternalPaymentMethodPresentationType(int i) {
        this.value = i;
    }

    public static MVExternalPaymentMethodPresentationType findByValue(int i) {
        if (i == 1) {
            return TITLE_EMPHASIS;
        }
        if (i != 2) {
            return null;
        }
        return SUBTITLE_EMPHASIS;
    }

    public int getValue() {
        return this.value;
    }
}
