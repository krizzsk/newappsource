package com.tranzmate.moovit.protocol.tripplanner;

public enum MVLocationSourceType {
    LocationSearch(1),
    Geocoder(2),
    TapOnMap(3),
    ExternalRequest(4),
    UserLocation(5);
    
    private final int value;

    private MVLocationSourceType(int i) {
        this.value = i;
    }

    public static MVLocationSourceType findByValue(int i) {
        if (i == 1) {
            return LocationSearch;
        }
        if (i == 2) {
            return Geocoder;
        }
        if (i == 3) {
            return TapOnMap;
        }
        if (i == 4) {
            return ExternalRequest;
        }
        if (i != 5) {
            return null;
        }
        return UserLocation;
    }

    public int getValue() {
        return this.value;
    }
}
