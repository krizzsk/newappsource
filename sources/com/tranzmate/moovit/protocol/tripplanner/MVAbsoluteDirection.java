package com.tranzmate.moovit.protocol.tripplanner;

public enum MVAbsoluteDirection {
    North(1),
    Northeast(2),
    east(3),
    Southeast(4),
    South(5),
    Southwest(6),
    West(7),
    Northwest(8);
    
    private final int value;

    private MVAbsoluteDirection(int i) {
        this.value = i;
    }

    public static MVAbsoluteDirection findByValue(int i) {
        switch (i) {
            case 1:
                return North;
            case 2:
                return Northeast;
            case 3:
                return east;
            case 4:
                return Southeast;
            case 5:
                return South;
            case 6:
                return Southwest;
            case 7:
                return West;
            case 8:
                return Northwest;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
