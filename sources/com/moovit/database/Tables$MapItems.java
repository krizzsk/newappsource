package com.moovit.database;

public final class Tables$MapItems {
    public static String createTable() {
        return "CREATE TABLE IF NOT EXISTS map_items(metro_id INTEGER NOT NULL,revision INTEGER NOT NULL,map_items_type INTEGER NOT NULL,map_items_tile_x INTEGER NOT NULL,map_items_tile_y INTEGER NOT NULL,map_items_data BLOB NOT NULL,PRIMARY KEY(metro_id,revision,map_items_type,map_items_tile_x,map_items_tile_y));";
    }
}
