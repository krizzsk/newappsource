package com.moovit.database;

public final class Tables$TransportationMaps {
    public static String createTable() {
        return "CREATE TABLE IF NOT EXISTS transportation_maps(metro_id INTEGER NOT NULL,revision INTEGER NOT NULL,transportation_map_id INTEGER NOT NULL,transportation_map_order_index INTEGER NOT NULL,transportation_map_name TEXT NOT NULL,transportation_map_url TEXT NOT NULL,transportation_map_version INTEGER NOT NULL,transportation_map_download_id INTEGER NOT NULL,transportation_map_download_version INTEGER NOT NULL,PRIMARY KEY(metro_id,revision,transportation_map_id));";
    }
}
