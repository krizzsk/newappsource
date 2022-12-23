package com.tranzmate.moovit.protocol.navigation;

public enum MVNavigationLegType {
    TRANSIT(1),
    WALK(2),
    WAIT(3),
    TAXI(4),
    BICYCLE(5),
    DOCKLESS(6),
    PERSONAL_CAR(7);
    
    private final int value;

    private MVNavigationLegType(int i) {
        this.value = i;
    }

    public static MVNavigationLegType findByValue(int i) {
        switch (i) {
            case 1:
                return TRANSIT;
            case 2:
                return WALK;
            case 3:
                return WAIT;
            case 4:
                return TAXI;
            case 5:
                return BICYCLE;
            case 6:
                return DOCKLESS;
            case 7:
                return PERSONAL_CAR;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
