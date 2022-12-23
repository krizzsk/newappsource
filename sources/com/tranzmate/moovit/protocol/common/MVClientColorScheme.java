package com.tranzmate.moovit.protocol.common;

public enum MVClientColorScheme {
    PRIMARY(1),
    SECONDARY(2),
    TERTIARY(3),
    GOOD(4),
    PROBLEM(5),
    CRITICAL(6),
    INFO(7),
    ON_SURFACE(8),
    ON_SURFACE_EMPHASIS_HIGH(9),
    ON_SURFACE_EMPHASIS_MEDIUM(10),
    ON_SURFACE_EMPHASIS_LOW(11),
    SURFACE_GOOD(12),
    SURFACE_PROBLEM(13),
    SURFACE_CRITICAL(14),
    SURFACE_INFO(15);
    
    private final int value;

    private MVClientColorScheme(int i) {
        this.value = i;
    }

    public static MVClientColorScheme findByValue(int i) {
        switch (i) {
            case 1:
                return PRIMARY;
            case 2:
                return SECONDARY;
            case 3:
                return TERTIARY;
            case 4:
                return GOOD;
            case 5:
                return PROBLEM;
            case 6:
                return CRITICAL;
            case 7:
                return INFO;
            case 8:
                return ON_SURFACE;
            case 9:
                return ON_SURFACE_EMPHASIS_HIGH;
            case 10:
                return ON_SURFACE_EMPHASIS_MEDIUM;
            case 11:
                return ON_SURFACE_EMPHASIS_LOW;
            case 12:
                return SURFACE_GOOD;
            case 13:
                return SURFACE_PROBLEM;
            case 14:
                return SURFACE_CRITICAL;
            case 15:
                return SURFACE_INFO;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
