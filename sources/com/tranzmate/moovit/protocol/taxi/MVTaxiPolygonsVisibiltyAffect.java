package com.tranzmate.moovit.protocol.taxi;

public enum MVTaxiPolygonsVisibiltyAffect {
    NONE(1),
    VISIBLE_INSIDE(2);
    
    private final int value;

    private MVTaxiPolygonsVisibiltyAffect(int i) {
        this.value = i;
    }

    public static MVTaxiPolygonsVisibiltyAffect findByValue(int i) {
        if (i == 1) {
            return NONE;
        }
        if (i != 2) {
            return null;
        }
        return VISIBLE_INSIDE;
    }

    public int getValue() {
        return this.value;
    }
}
