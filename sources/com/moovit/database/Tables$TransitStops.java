package com.moovit.database;

public final class Tables$TransitStops {
    public static String createTable() {
        return "CREATE TABLE IF NOT EXISTS stops(metro_id INTEGER NOT NULL,revision INTEGER NOT NULL,stop_id INTEGER NOT NULL,stop_name TEXT NOT NULL,stop_code TEXT,stop_lat INTEGER NOT NULL,stop_lon INTEGER NOT NULL,stop_image_data BLOB,stop_map_images_data BLOB NOT NULL,stop_pathways_data BLOB NOT NULL,stop_main_transit_type_id INTEGER NOT NULL,stop_amenities INTEGER NOT NULL DEFAULT 0,PRIMARY KEY(metro_id,revision,stop_id));";
    }
}
