package com.tranzmate.moovit.protocol.common;

public enum MVDayOfWeek {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);
    
    private final int value;

    private MVDayOfWeek(int i) {
        this.value = i;
    }

    public static MVDayOfWeek findByValue(int i) {
        switch (i) {
            case 1:
                return SUNDAY;
            case 2:
                return MONDAY;
            case 3:
                return TUESDAY;
            case 4:
                return WEDNESDAY;
            case 5:
                return THURSDAY;
            case 6:
                return FRIDAY;
            case 7:
                return SATURDAY;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
