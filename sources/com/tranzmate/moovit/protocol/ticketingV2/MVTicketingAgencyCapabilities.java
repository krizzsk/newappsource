package com.tranzmate.moovit.protocol.ticketingV2;

public enum MVTicketingAgencyCapabilities {
    TICKETS_FLAT_PURCHASE(1),
    STORED_VALUE_PURCHASE(2),
    SPLIT_FARE_PAYMENTS(3),
    PROVIDER_LEVEL_VALIDATION_INFO(4),
    SUPPORT_ZONES(5),
    OFFLINE_MODE(6),
    TICKETS_JOURNEY_PURCHASE(7),
    PURCHASE_PAYMENT_ACCOUNT_SENSITIVE(8),
    STORED_VALUE_AUTOLOAD(9);
    
    private final int value;

    private MVTicketingAgencyCapabilities(int i) {
        this.value = i;
    }

    public static MVTicketingAgencyCapabilities findByValue(int i) {
        switch (i) {
            case 1:
                return TICKETS_FLAT_PURCHASE;
            case 2:
                return STORED_VALUE_PURCHASE;
            case 3:
                return SPLIT_FARE_PAYMENTS;
            case 4:
                return PROVIDER_LEVEL_VALIDATION_INFO;
            case 5:
                return SUPPORT_ZONES;
            case 6:
                return OFFLINE_MODE;
            case 7:
                return TICKETS_JOURNEY_PURCHASE;
            case 8:
                return PURCHASE_PAYMENT_ACCOUNT_SENSITIVE;
            case 9:
                return STORED_VALUE_AUTOLOAD;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
