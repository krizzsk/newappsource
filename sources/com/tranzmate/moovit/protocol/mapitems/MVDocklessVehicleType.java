package com.tranzmate.moovit.protocol.mapitems;

public enum MVDocklessVehicleType {
    BIKE(1),
    ELECTRIC_BIKE(2),
    ELECTRIC_SCOOTER(3),
    KICK_SCOOTER(4),
    MOPED(5),
    CAR(-1);
    
    private final int value;

    private MVDocklessVehicleType(int i) {
        this.value = i;
    }

    public static MVDocklessVehicleType findByValue(int i) {
        if (i == -1) {
            return CAR;
        }
        if (i == 1) {
            return BIKE;
        }
        if (i == 2) {
            return ELECTRIC_BIKE;
        }
        if (i == 3) {
            return ELECTRIC_SCOOTER;
        }
        if (i == 4) {
            return KICK_SCOOTER;
        }
        if (i != 5) {
            return null;
        }
        return MOPED;
    }

    public int getValue() {
        return this.value;
    }
}
