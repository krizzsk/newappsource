package com.tranzmate.moovit.protocol.ptb.activations;

public enum MVPTBTransitType {
    CityBus(1),
    InterBus(2),
    CityShuttleBus(3),
    InterShuttleBus(4),
    CityLightRail(5),
    CityLightRailStation(6),
    TrainStation(7),
    CarmelitLightRail(8),
    ExpressCableCar(9);
    
    private final int value;

    private MVPTBTransitType(int i) {
        this.value = i;
    }

    public static MVPTBTransitType findByValue(int i) {
        switch (i) {
            case 1:
                return CityBus;
            case 2:
                return InterBus;
            case 3:
                return CityShuttleBus;
            case 4:
                return InterShuttleBus;
            case 5:
                return CityLightRail;
            case 6:
                return CityLightRailStation;
            case 7:
                return TrainStation;
            case 8:
                return CarmelitLightRail;
            case 9:
                return ExpressCableCar;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
