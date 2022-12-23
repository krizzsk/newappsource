package com.tranzmate.moovit.protocol.tripplanner;

public enum MVSectionSortType {
    NO_CLIENT_SORTING(0),
    DURATION(1),
    PRICE(2),
    CO2(3),
    LEAST_WALKING(4),
    LEAST_TRANSFERS(5),
    EARLIEST_DEPARTURE(6),
    EARLIEST_ARRIVAL(7);
    
    private final int value;

    private MVSectionSortType(int i) {
        this.value = i;
    }

    public static MVSectionSortType findByValue(int i) {
        switch (i) {
            case 0:
                return NO_CLIENT_SORTING;
            case 1:
                return DURATION;
            case 2:
                return PRICE;
            case 3:
                return CO2;
            case 4:
                return LEAST_WALKING;
            case 5:
                return LEAST_TRANSFERS;
            case 6:
                return EARLIEST_DEPARTURE;
            case 7:
                return EARLIEST_ARRIVAL;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
