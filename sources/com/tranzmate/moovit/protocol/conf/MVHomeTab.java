package com.tranzmate.moovit.protocol.conf;

public enum MVHomeTab {
    DASHBOARD(1),
    NEARBY(2),
    LINES(3),
    TRIP_PLANNER(4),
    TRANSIT_TYPE_STATIONS(5),
    TRANSIT_TYPE_LINES(6),
    ALL_IN_ONE(7),
    EXPLORE(8),
    WONDO_NEARBY(9),
    TICKETING_WALLET(10),
    GAMES(11);
    
    private final int value;

    private MVHomeTab(int i) {
        this.value = i;
    }

    public static MVHomeTab findByValue(int i) {
        switch (i) {
            case 1:
                return DASHBOARD;
            case 2:
                return NEARBY;
            case 3:
                return LINES;
            case 4:
                return TRIP_PLANNER;
            case 5:
                return TRANSIT_TYPE_STATIONS;
            case 6:
                return TRANSIT_TYPE_LINES;
            case 7:
                return ALL_IN_ONE;
            case 8:
                return EXPLORE;
            case 9:
                return WONDO_NEARBY;
            case 10:
                return TICKETING_WALLET;
            case 11:
                return GAMES;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
