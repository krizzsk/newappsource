package com.tranzmate.moovit.protocol.tripplanner;

public enum MVAdvertismentProvider {
    BUTTON(1),
    FACEBOOOK(2);
    
    private final int value;

    private MVAdvertismentProvider(int i) {
        this.value = i;
    }

    public static MVAdvertismentProvider findByValue(int i) {
        if (i == 1) {
            return BUTTON;
        }
        if (i != 2) {
            return null;
        }
        return FACEBOOOK;
    }

    public int getValue() {
        return this.value;
    }
}
