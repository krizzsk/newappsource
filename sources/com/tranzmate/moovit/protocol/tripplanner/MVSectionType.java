package com.tranzmate.moovit.protocol.tripplanner;

public enum MVSectionType {
    UNDEFINED(1),
    WALK_AND_RIDE(2),
    ROUTES_WITH_BIKE(3),
    WALK_ONLY(4),
    CARPOOL(5),
    WHEEL_CHAIR_ACCESSIBLE(6),
    ROUTES_WITH_RENTAL_BIKE(7),
    ROUTES_WITH_SPECIFIC_AGENCIES(8),
    EVENT(9),
    MULTI_MODAL(10),
    ROUTES_WITH_DOCKLESS(11),
    TOD(12),
    FLEX_TIME(13),
    TO_HUBS(14),
    NO_GROUPING(15);
    
    private final int value;

    private MVSectionType(int i) {
        this.value = i;
    }

    public static MVSectionType findByValue(int i) {
        switch (i) {
            case 1:
                return UNDEFINED;
            case 2:
                return WALK_AND_RIDE;
            case 3:
                return ROUTES_WITH_BIKE;
            case 4:
                return WALK_ONLY;
            case 5:
                return CARPOOL;
            case 6:
                return WHEEL_CHAIR_ACCESSIBLE;
            case 7:
                return ROUTES_WITH_RENTAL_BIKE;
            case 8:
                return ROUTES_WITH_SPECIFIC_AGENCIES;
            case 9:
                return EVENT;
            case 10:
                return MULTI_MODAL;
            case 11:
                return ROUTES_WITH_DOCKLESS;
            case 12:
                return TOD;
            case 13:
                return FLEX_TIME;
            case 14:
                return TO_HUBS;
            case 15:
                return NO_GROUPING;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
