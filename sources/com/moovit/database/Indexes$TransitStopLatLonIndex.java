package com.moovit.database;

public class Indexes$TransitStopLatLonIndex {
    public static String createIndex() {
        return "CREATE INDEX IF NOT EXISTS stop_lat_lon_index ON stops(stop_lat,stop_lon);";
    }
}
