package com.tranzmate.moovit.protocol.search;

public enum MVSearchResultType {
    STOP(1),
    STREET(2),
    SITE(3),
    CITY(4),
    GEOCODE(5);
    
    private final int value;

    private MVSearchResultType(int i) {
        this.value = i;
    }

    public static MVSearchResultType findByValue(int i) {
        if (i == 1) {
            return STOP;
        }
        if (i == 2) {
            return STREET;
        }
        if (i == 3) {
            return SITE;
        }
        if (i == 4) {
            return CITY;
        }
        if (i != 5) {
            return null;
        }
        return GEOCODE;
    }

    public int getValue() {
        return this.value;
    }
}
