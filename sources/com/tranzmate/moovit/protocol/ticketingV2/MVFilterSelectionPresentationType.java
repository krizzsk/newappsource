package com.tranzmate.moovit.protocol.ticketingV2;

public enum MVFilterSelectionPresentationType {
    Indicators(0),
    Cards(1);
    
    private final int value;

    private MVFilterSelectionPresentationType(int i) {
        this.value = i;
    }

    public static MVFilterSelectionPresentationType findByValue(int i) {
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
