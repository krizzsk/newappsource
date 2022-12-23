package com.tranzmate.moovit.protocol.kinesis;

public enum MVServerServiceType {
    STOPS_SCHEDULE(1),
    STOP_DETAILS(2),
    LINE_DETAILS(3),
    GET_CONFIG(4),
    CLOUD_SEARCH_FULL_SEARCH(5),
    CLOUD_SEARCH_FIND_LINES(6),
    ACKNOWLEDGEMENTS(7),
    COUNTRIES(8),
    EXTERNAL_WEB_PAGES(9),
    TRIP_PLAN_SEARCH(10),
    SIMILAR_ITINERARY(11),
    WALK_POLYLINE(12),
    SYNC_ENTITIES(13),
    CHANGE_USER_LANG(14),
    USER_PROFILE(15),
    ALL_TROPHIES(16),
    AVAILABLE_AVATARS(17),
    UPDATE_AVATAR(18),
    MAP_ITEMS_STOPS(19),
    MAP_ITEMS_USERS(20),
    MAP_ITEMS_ADS(21),
    CHANGE_USER_METRO(22),
    PERFORM_CHECKIN(23),
    REFRESH_CHECKIN(24),
    CHECKOUT(25),
    SYNC_STOP_ENTITIES(26),
    SYNC_IMAGE_ENTITIES(27),
    LINE_GROUP_STOPS(28),
    STATIC_LINE_MAPS(30),
    COUNTRIES_WITH_FLAGS(31),
    SYNC_LINE_ENTITIES(32),
    CREATE_USER(33),
    UPGRADE_USER(34),
    MIGRATE_FAVORITES(35),
    TAXI_REGISTRATION_PHONE_NUMBER(36),
    TAXI_REGISTRATION_VERIFICATION_CODE(37),
    TAXI_CREATE_ORDER(38),
    TAXI_ORDER_DETAILS(39),
    CANCEL_TAXI_ORDER(40),
    TAXI_REGISTRATION(41),
    CONFIRM_TAXI_ARRIVAL(42),
    WIFI_LOCATION_REQUEST(43),
    LINE_GAME_REPORT_REQUEST(44),
    NAVIGATION(45),
    LAST_KNOWN_LOCATION(46),
    DYNAMIC_FAVORITE(47),
    DATA_COLLECTION_CONFIGURATION(48),
    GEOFENCE_TRIGGERED_ACTIONS(49),
    TV_TOOL(50),
    STOPS_ARRIVALS(51),
    LINE_ARRIVALS(52),
    EXTERNAL_API(53),
    GET_ACTIVATION_PRICE(54),
    TICKETING(55),
    GET_RT(56),
    GET_COMMERCIAL_DETAILS(57),
    NOT_SPECIFIED(998);
    
    private final int value;

    private MVServerServiceType(int i) {
        this.value = i;
    }

    public static MVServerServiceType findByValue(int i) {
        if (i == 998) {
            return NOT_SPECIFIED;
        }
        switch (i) {
            case 1:
                return STOPS_SCHEDULE;
            case 2:
                return STOP_DETAILS;
            case 3:
                return LINE_DETAILS;
            case 4:
                return GET_CONFIG;
            case 5:
                return CLOUD_SEARCH_FULL_SEARCH;
            case 6:
                return CLOUD_SEARCH_FIND_LINES;
            case 7:
                return ACKNOWLEDGEMENTS;
            case 8:
                return COUNTRIES;
            case 9:
                return EXTERNAL_WEB_PAGES;
            case 10:
                return TRIP_PLAN_SEARCH;
            case 11:
                return SIMILAR_ITINERARY;
            case 12:
                return WALK_POLYLINE;
            case 13:
                return SYNC_ENTITIES;
            case 14:
                return CHANGE_USER_LANG;
            case 15:
                return USER_PROFILE;
            case 16:
                return ALL_TROPHIES;
            case 17:
                return AVAILABLE_AVATARS;
            case 18:
                return UPDATE_AVATAR;
            case 19:
                return MAP_ITEMS_STOPS;
            case 20:
                return MAP_ITEMS_USERS;
            case 21:
                return MAP_ITEMS_ADS;
            case 22:
                return CHANGE_USER_METRO;
            case 23:
                return PERFORM_CHECKIN;
            case 24:
                return REFRESH_CHECKIN;
            case 25:
                return CHECKOUT;
            case 26:
                return SYNC_STOP_ENTITIES;
            case 27:
                return SYNC_IMAGE_ENTITIES;
            case 28:
                return LINE_GROUP_STOPS;
            default:
                switch (i) {
                    case 30:
                        return STATIC_LINE_MAPS;
                    case 31:
                        return COUNTRIES_WITH_FLAGS;
                    case 32:
                        return SYNC_LINE_ENTITIES;
                    case 33:
                        return CREATE_USER;
                    case 34:
                        return UPGRADE_USER;
                    case 35:
                        return MIGRATE_FAVORITES;
                    case 36:
                        return TAXI_REGISTRATION_PHONE_NUMBER;
                    case 37:
                        return TAXI_REGISTRATION_VERIFICATION_CODE;
                    case 38:
                        return TAXI_CREATE_ORDER;
                    case 39:
                        return TAXI_ORDER_DETAILS;
                    case 40:
                        return CANCEL_TAXI_ORDER;
                    case 41:
                        return TAXI_REGISTRATION;
                    case 42:
                        return CONFIRM_TAXI_ARRIVAL;
                    case 43:
                        return WIFI_LOCATION_REQUEST;
                    case 44:
                        return LINE_GAME_REPORT_REQUEST;
                    case 45:
                        return NAVIGATION;
                    case 46:
                        return LAST_KNOWN_LOCATION;
                    case 47:
                        return DYNAMIC_FAVORITE;
                    case 48:
                        return DATA_COLLECTION_CONFIGURATION;
                    case 49:
                        return GEOFENCE_TRIGGERED_ACTIONS;
                    case 50:
                        return TV_TOOL;
                    case 51:
                        return STOPS_ARRIVALS;
                    case 52:
                        return LINE_ARRIVALS;
                    case 53:
                        return EXTERNAL_API;
                    case 54:
                        return GET_ACTIVATION_PRICE;
                    case 55:
                        return TICKETING;
                    case 56:
                        return GET_RT;
                    case 57:
                        return GET_COMMERCIAL_DETAILS;
                    default:
                        return null;
                }
        }
    }

    public int getValue() {
        return this.value;
    }
}
