package com.tranzmate.moovit.protocol.tripplanner;

public enum MVCarPoolSource {
    Moovit(1),
    Waze(2),
    Idfm_klaxit(3),
    Idfm_karos(4),
    Idfm_blablalines(5),
    BlaBla(6);
    
    private final int value;

    private MVCarPoolSource(int i) {
        this.value = i;
    }

    public static MVCarPoolSource findByValue(int i) {
        switch (i) {
            case 1:
                return Moovit;
            case 2:
                return Waze;
            case 3:
                return Idfm_klaxit;
            case 4:
                return Idfm_karos;
            case 5:
                return Idfm_blablalines;
            case 6:
                return BlaBla;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
