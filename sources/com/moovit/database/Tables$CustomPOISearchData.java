package com.moovit.database;

public final class Tables$CustomPOISearchData {
    public static String createTable() {
        return "CREATE TABLE IF NOT EXISTS custom_poi_data(metro_id INTEGER NOT NULL,revision INTEGER NOT NULL,poi_data_id INTEGER NOT NULL,poi_data_image BLOB,poi_data_title TEXT,poi_data_subtitle TEXT,poi_data_lat INTEGER NOT NULL,poi_data_lon INTEGER NOT NULL,PRIMARY KEY(metro_id,revision,poi_data_id));";
    }
}
