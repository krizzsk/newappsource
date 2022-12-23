package com.tranzmate.moovit.protocol.conf;

public enum MVSmartComponentRandomABTestingGroup {
    CONTROL(1),
    GROUP_A(2),
    GROUP_B(3);
    
    private final int value;

    private MVSmartComponentRandomABTestingGroup(int i) {
        this.value = i;
    }

    public static MVSmartComponentRandomABTestingGroup findByValue(int i) {
        if (i == 1) {
            return CONTROL;
        }
        if (i == 2) {
            return GROUP_A;
        }
        if (i != 3) {
            return null;
        }
        return GROUP_B;
    }

    public int getValue() {
        return this.value;
    }
}
