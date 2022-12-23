package com.tranzmate.moovit.protocol.gtfs;

public enum MVRouteSortingMethods {
    Lexicographically(1),
    PrimarilyByNumbers(2),
    PrimarilyByLetters(3);
    
    private final int value;

    private MVRouteSortingMethods(int i) {
        this.value = i;
    }

    public static MVRouteSortingMethods findByValue(int i) {
        if (i == 1) {
            return Lexicographically;
        }
        if (i == 2) {
            return PrimarilyByNumbers;
        }
        if (i != 3) {
            return null;
        }
        return PrimarilyByLetters;
    }

    public int getValue() {
        return this.value;
    }
}
