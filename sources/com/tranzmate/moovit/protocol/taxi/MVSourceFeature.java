package com.tranzmate.moovit.protocol.taxi;

public enum MVSourceFeature {
    CAR_POOL(1),
    RIDE_SHARING(2),
    TOD(3),
    CAR_POOL_DRIVER(4),
    TICKETING(5);
    
    private final int value;

    private MVSourceFeature(int i) {
        this.value = i;
    }

    public static MVSourceFeature findByValue(int i) {
        if (i == 1) {
            return CAR_POOL;
        }
        if (i == 2) {
            return RIDE_SHARING;
        }
        if (i == 3) {
            return TOD;
        }
        if (i == 4) {
            return CAR_POOL_DRIVER;
        }
        if (i != 5) {
            return null;
        }
        return TICKETING;
    }

    public int getValue() {
        return this.value;
    }
}
