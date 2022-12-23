package com.tranzmate.moovit.protocol.favorites;

public enum MVFavoriteLocationType {
    HOME(1),
    WORK(2),
    ADDRESS(3);
    
    private final int value;

    private MVFavoriteLocationType(int i) {
        this.value = i;
    }

    public static MVFavoriteLocationType findByValue(int i) {
        if (i == 1) {
            return HOME;
        }
        if (i == 2) {
            return WORK;
        }
        if (i != 3) {
            return null;
        }
        return ADDRESS;
    }

    public int getValue() {
        return this.value;
    }
}
