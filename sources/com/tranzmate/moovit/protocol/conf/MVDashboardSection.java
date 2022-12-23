package com.tranzmate.moovit.protocol.conf;

public enum MVDashboardSection {
    ACTIVE_NAVIGATION(1),
    RIDE_SHARING(2),
    CARPOOL(3),
    TAXI(4),
    TOPUP(5),
    COMMUNITY(6),
    FAVORITE_LOCATIONS(7),
    RECENT_ITINERARIES(8),
    NO_GPS(9),
    CALENDAR(10),
    TOD(11),
    PROMOTION(12),
    ATAF_TICKETS(13),
    TICKETS(14),
    MOT(15),
    WE_RIDE_TOD(16),
    ON_DEMAND_TAXI(17),
    WEB_PAGES(18),
    BUSITALIA_TOD(19),
    UMO_ADS(20),
    WALLET(21),
    GTT_TOD(22),
    FAVORITE_STATIONS(23),
    SCOTTISH_BORDERS_TOD(24),
    ADS(25),
    GENERAL(26),
    SUGGESTIONS(27);
    
    private final int value;

    private MVDashboardSection(int i) {
        this.value = i;
    }

    public static MVDashboardSection findByValue(int i) {
        switch (i) {
            case 1:
                return ACTIVE_NAVIGATION;
            case 2:
                return RIDE_SHARING;
            case 3:
                return CARPOOL;
            case 4:
                return TAXI;
            case 5:
                return TOPUP;
            case 6:
                return COMMUNITY;
            case 7:
                return FAVORITE_LOCATIONS;
            case 8:
                return RECENT_ITINERARIES;
            case 9:
                return NO_GPS;
            case 10:
                return CALENDAR;
            case 11:
                return TOD;
            case 12:
                return PROMOTION;
            case 13:
                return ATAF_TICKETS;
            case 14:
                return TICKETS;
            case 15:
                return MOT;
            case 16:
                return WE_RIDE_TOD;
            case 17:
                return ON_DEMAND_TAXI;
            case 18:
                return WEB_PAGES;
            case 19:
                return BUSITALIA_TOD;
            case 20:
                return UMO_ADS;
            case 21:
                return WALLET;
            case 22:
                return GTT_TOD;
            case 23:
                return FAVORITE_STATIONS;
            case 24:
                return SCOTTISH_BORDERS_TOD;
            case 25:
                return ADS;
            case 26:
                return GENERAL;
            case 27:
                return SUGGESTIONS;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
