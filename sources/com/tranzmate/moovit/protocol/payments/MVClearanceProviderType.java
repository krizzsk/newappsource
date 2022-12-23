package com.tranzmate.moovit.protocol.payments;

public enum MVClearanceProviderType {
    SPREEDLY(1),
    STRIPE(2),
    CUBIC(3),
    ICEPAY(4),
    WUNDER(5),
    BUCKAROO(6),
    GENFARE(7);
    
    private final int value;

    private MVClearanceProviderType(int i) {
        this.value = i;
    }

    public static MVClearanceProviderType findByValue(int i) {
        switch (i) {
            case 1:
                return SPREEDLY;
            case 2:
                return STRIPE;
            case 3:
                return CUBIC;
            case 4:
                return ICEPAY;
            case 5:
                return WUNDER;
            case 6:
                return BUCKAROO;
            case 7:
                return GENFARE;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
