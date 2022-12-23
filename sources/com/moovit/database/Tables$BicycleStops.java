package com.moovit.database;

public final class Tables$BicycleStops {
    public static String createTable() {
        return "CREATE TABLE IF NOT EXISTS bicycle_stops(metro_id INTEGER NOT NULL,revision INTEGER NOT NULL,stop_provider_id INTEGER NOT NULL,stop_id INTEGER NOT NULL,stop_name TEXT NOT NULL,stop_address TEXT,stop_lat INTEGER NOT NULL,stop_lon INTEGER NOT NULL,PRIMARY KEY(metro_id,revision,stop_id),FOREIGN KEY(metro_id,revision,stop_provider_id) REFERENCES bicycle_providers(metro_id,revision,provider_id));";
    }
}
