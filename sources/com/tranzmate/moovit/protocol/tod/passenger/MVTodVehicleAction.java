package com.tranzmate.moovit.protocol.tod.passenger;

public enum MVTodVehicleAction {
    COLOR_BAR(1),
    AC(2),
    AUDIO(3),
    BEEP(4),
    FLASH(5);
    
    private final int value;

    private MVTodVehicleAction(int i) {
        this.value = i;
    }

    public static MVTodVehicleAction findByValue(int i) {
        if (i == 1) {
            return COLOR_BAR;
        }
        if (i == 2) {
            return AC;
        }
        if (i == 3) {
            return AUDIO;
        }
        if (i == 4) {
            return BEEP;
        }
        if (i != 5) {
            return null;
        }
        return FLASH;
    }

    public int getValue() {
        return this.value;
    }
}
