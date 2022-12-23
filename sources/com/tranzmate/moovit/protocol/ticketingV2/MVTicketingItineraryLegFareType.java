package com.tranzmate.moovit.protocol.ticketingV2;

public enum MVTicketingItineraryLegFareType {
    PURCHASABLE(1),
    INCLUDED(2);
    
    private final int value;

    private MVTicketingItineraryLegFareType(int i) {
        this.value = i;
    }

    public static MVTicketingItineraryLegFareType findByValue(int i) {
        if (i == 1) {
            return PURCHASABLE;
        }
        if (i != 2) {
            return null;
        }
        return INCLUDED;
    }

    public int getValue() {
        return this.value;
    }
}
