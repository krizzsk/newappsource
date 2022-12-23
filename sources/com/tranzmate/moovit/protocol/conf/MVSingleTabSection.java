package com.tranzmate.moovit.protocol.conf;

public enum MVSingleTabSection {
    DIRECTIONS(1),
    SERVICE_STATUS(2),
    NEARBY_LINES(3),
    LINE_SEARCH(4),
    LIVE_MAP(5),
    OFFLINE_MAPS(6);
    
    private final int value;

    private MVSingleTabSection(int i) {
        this.value = i;
    }

    public static MVSingleTabSection findByValue(int i) {
        switch (i) {
            case 1:
                return DIRECTIONS;
            case 2:
                return SERVICE_STATUS;
            case 3:
                return NEARBY_LINES;
            case 4:
                return LINE_SEARCH;
            case 5:
                return LIVE_MAP;
            case 6:
                return OFFLINE_MAPS;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
