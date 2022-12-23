package com.tranzmate.moovit.protocol.tod.passenger;

public enum MVTodRideWayPointType {
    PrePickup(1),
    Pickup(2),
    Ride(3),
    DropOff(4);
    
    private final int value;

    private MVTodRideWayPointType(int i) {
        this.value = i;
    }

    public static MVTodRideWayPointType findByValue(int i) {
        if (i == 1) {
            return PrePickup;
        }
        if (i == 2) {
            return Pickup;
        }
        if (i == 3) {
            return Ride;
        }
        if (i != 4) {
            return null;
        }
        return DropOff;
    }

    public int getValue() {
        return this.value;
    }
}
