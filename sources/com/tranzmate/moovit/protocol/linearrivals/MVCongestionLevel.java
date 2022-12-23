package com.tranzmate.moovit.protocol.linearrivals;

public enum MVCongestionLevel {
    EMPTY(0),
    FEW(1),
    LOW(2),
    MED(3),
    HIGH(4),
    FULL(5),
    PACKED(6);
    
    private final int value;

    private MVCongestionLevel(int i) {
        this.value = i;
    }

    public static MVCongestionLevel findByValue(int i) {
        switch (i) {
            case 0:
                return EMPTY;
            case 1:
                return FEW;
            case 2:
                return LOW;
            case 3:
                return MED;
            case 4:
                return HIGH;
            case 5:
                return FULL;
            case 6:
                return PACKED;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
