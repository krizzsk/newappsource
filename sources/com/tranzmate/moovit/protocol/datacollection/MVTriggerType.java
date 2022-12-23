package com.tranzmate.moovit.protocol.datacollection;

public enum MVTriggerType {
    TRIP_PLAN(1),
    ITINERARY(2),
    RIDE_MODE(3),
    STOP(4),
    NEAR_ME(5),
    LINE(6),
    FAVORITES(7),
    GEO_FENCE_FAVORITES_LOCATIONS(8),
    GEO_FENCE_FAVORITES_STOPS(9),
    PUSH(10),
    SCHEDULE(11),
    LIVE_DIRECTION(12),
    GEO_FENCE_DYNAMIC_LOCATION_EXIT(13),
    CAR_POOL_RIDE(14),
    GEO_FENCE_ITINERARIES(15),
    NB_LOG(16),
    THIRD_PARTY(17),
    DRIVER_DC(18),
    GEO_FENCE_DYNAMIC_LOCATION_ENTER(19),
    CONNECT_TO_WIFI(20);
    
    private final int value;

    private MVTriggerType(int i) {
        this.value = i;
    }

    public static MVTriggerType findByValue(int i) {
        switch (i) {
            case 1:
                return TRIP_PLAN;
            case 2:
                return ITINERARY;
            case 3:
                return RIDE_MODE;
            case 4:
                return STOP;
            case 5:
                return NEAR_ME;
            case 6:
                return LINE;
            case 7:
                return FAVORITES;
            case 8:
                return GEO_FENCE_FAVORITES_LOCATIONS;
            case 9:
                return GEO_FENCE_FAVORITES_STOPS;
            case 10:
                return PUSH;
            case 11:
                return SCHEDULE;
            case 12:
                return LIVE_DIRECTION;
            case 13:
                return GEO_FENCE_DYNAMIC_LOCATION_EXIT;
            case 14:
                return CAR_POOL_RIDE;
            case 15:
                return GEO_FENCE_ITINERARIES;
            case 16:
                return NB_LOG;
            case 17:
                return THIRD_PARTY;
            case 18:
                return DRIVER_DC;
            case 19:
                return GEO_FENCE_DYNAMIC_LOCATION_ENTER;
            case 20:
                return CONNECT_TO_WIFI;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
