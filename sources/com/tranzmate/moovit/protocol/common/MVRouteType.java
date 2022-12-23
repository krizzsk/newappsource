package com.tranzmate.moovit.protocol.common;

public enum MVRouteType {
    Tram(0),
    Subway(1),
    Rail(2),
    Bus(3),
    Ferry(4),
    Cable(5),
    Gondola(6),
    Funicular(7);
    
    private final int value;

    private MVRouteType(int i) {
        this.value = i;
    }

    public static MVRouteType findByValue(int i) {
        switch (i) {
            case 0:
                return Tram;
            case 1:
                return Subway;
            case 2:
                return Rail;
            case 3:
                return Bus;
            case 4:
                return Ferry;
            case 5:
                return Cable;
            case 6:
                return Gondola;
            case 7:
                return Funicular;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
