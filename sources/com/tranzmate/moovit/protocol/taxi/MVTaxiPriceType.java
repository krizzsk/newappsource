package com.tranzmate.moovit.protocol.taxi;

public enum MVTaxiPriceType {
    Range(1),
    Fix(2),
    Metered(3);
    
    private final int value;

    private MVTaxiPriceType(int i) {
        this.value = i;
    }

    public static MVTaxiPriceType findByValue(int i) {
        if (i == 1) {
            return Range;
        }
        if (i == 2) {
            return Fix;
        }
        if (i != 3) {
            return null;
        }
        return Metered;
    }

    public int getValue() {
        return this.value;
    }
}
