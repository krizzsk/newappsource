package com.tranzmate.moovit.protocol.common;

public enum MVOptionSelectionPresentationType {
    Indicators(0),
    Cards(1);
    
    private final int value;

    private MVOptionSelectionPresentationType(int i) {
        this.value = i;
    }

    public static MVOptionSelectionPresentationType findByValue(int i) {
        if (i == 0) {
            return Indicators;
        }
        if (i != 1) {
            return null;
        }
        return Cards;
    }

    public int getValue() {
        return this.value;
    }
}
