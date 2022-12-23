package com.tranzmate.moovit.protocol.common;

public enum MVEntityType {
    Stop(0),
    Line(1),
    LineGroup(2);
    
    private final int value;

    private MVEntityType(int i) {
        this.value = i;
    }

    public static MVEntityType findByValue(int i) {
        if (i == 0) {
            return Stop;
        }
        if (i == 1) {
            return Line;
        }
        if (i != 2) {
            return null;
        }
        return LineGroup;
    }

    public int getValue() {
        return this.value;
    }
}
