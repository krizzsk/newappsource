package com.moovit.app.ads;

public enum MapAdSource {
    STATIONS("map_ads_stations_placement_id");
    
    public final String adUnitIdKey;

    private MapAdSource(String str) {
        this.adUnitIdKey = str;
    }
}
