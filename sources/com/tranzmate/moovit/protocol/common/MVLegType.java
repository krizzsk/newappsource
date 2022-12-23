package com.tranzmate.moovit.protocol.common;

public enum MVLegType {
    Walk(0),
    Bicycle(1),
    Car(2),
    Tram(3),
    Subway(4),
    Rail(5),
    Bus(6),
    Ferry(7),
    Cable(8),
    Gondola(9),
    Funicular(10),
    Transit(11),
    Trainish(12),
    Busish(13),
    LegSwith(14),
    CustomMotorVehicle(15),
    CarPoolRide(16),
    PathWayWalk(17),
    Wait(18),
    WaitToTaxi(19),
    WaitOnVehicle(20),
    RideSharingEvent(21),
    Parking(22),
    Dockless(23),
    PTRoad(24),
    PersonalCar(25);
    
    private final int value;

    private MVLegType(int i) {
        this.value = i;
    }

    public static MVLegType findByValue(int i) {
        switch (i) {
            case 0:
                return Walk;
            case 1:
                return Bicycle;
            case 2:
                return Car;
            case 3:
                return Tram;
            case 4:
                return Subway;
            case 5:
                return Rail;
            case 6:
                return Bus;
            case 7:
                return Ferry;
            case 8:
                return Cable;
            case 9:
                return Gondola;
            case 10:
                return Funicular;
            case 11:
                return Transit;
            case 12:
                return Trainish;
            case 13:
                return Busish;
            case 14:
                return LegSwith;
            case 15:
                return CustomMotorVehicle;
            case 16:
                return CarPoolRide;
            case 17:
                return PathWayWalk;
            case 18:
                return Wait;
            case 19:
                return WaitToTaxi;
            case 20:
                return WaitOnVehicle;
            case 21:
                return RideSharingEvent;
            case 22:
                return Parking;
            case 23:
                return Dockless;
            case 24:
                return PTRoad;
            case 25:
                return PersonalCar;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
