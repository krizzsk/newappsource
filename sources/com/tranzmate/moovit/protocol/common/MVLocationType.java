package com.tranzmate.moovit.protocol.common;

public enum MVLocationType {
    LatLon(1),
    City(2),
    Street(3),
    Site(4),
    Stop(5),
    Geocoder(6),
    BicycleStop(7),
    ParkingLot(8),
    UserLocation(9);
    
    private final int value;

    private MVLocationType(int i) {
        this.value = i;
    }

    public static MVLocationType findByValue(int i) {
        switch (i) {
            case 1:
                return LatLon;
            case 2:
                return City;
            case 3:
                return Street;
            case 4:
                return Site;
            case 5:
                return Stop;
            case 6:
                return Geocoder;
            case 7:
                return BicycleStop;
            case 8:
                return ParkingLot;
            case 9:
                return UserLocation;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
