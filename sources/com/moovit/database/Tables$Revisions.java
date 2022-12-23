package com.moovit.database;

public final class Tables$Revisions {
    public static String createTable() {
        return "CREATE TABLE IF NOT EXISTS revisions(metro_id INTEGER NOT NULL,revision INTEGER NOT NULL,active BOOLEAN NOT NULL DEFAULT 0,deprecated BOOLEAN NOT NULL DEFAULT 0,metro_info_data_loaded BOOLEAN NOT NULL DEFAULT 0,line_search_data_loaded BOOLEAN NOT NULL DEFAULT 0,line_search_fts_locale TEXT,stop_map_items_data_loaded BOOLEAN NOT NULL DEFAULT 0,syncable_transit_line_group_ids_data_loaded BOOLEAN NOT NULL DEFAULT 0,stop_search_fts_locale TEXT,gtfs_line_groups BOOLEAN NOT NULL DEFAULT 0,gtfs_stops BOOLEAN NOT NULL DEFAULT 0,gtfs_patterns BOOLEAN NOT NULL DEFAULT 0,gtfs_remote_images BOOLEAN NOT NULL DEFAULT 0,gtfs_bicycle_stops BOOLEAN NOT NULL DEFAULT 0,gtfs_shapes BOOLEAN NOT NULL DEFAULT 0,gtfs_frequencies BOOLEAN NOT NULL DEFAULT 0,custom_poi_search_data_loaded BOOLEAN NOT NULL DEFAULT 0,custom_poi_search_fts_locale TEXT,gtfs_shape_segments BOOLEAN NOT NULL DEFAULT 0,PRIMARY KEY(metro_id,revision));";
    }
}
