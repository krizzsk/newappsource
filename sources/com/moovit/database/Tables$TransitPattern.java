package com.moovit.database;

public final class Tables$TransitPattern {
    public static String createTable() {
        return "CREATE TABLE IF NOT EXISTS patterns(metro_id INTEGER NOT NULL,revision INTEGER NOT NULL,pattern_id INTEGER NOT NULL,pattern_stop_id INTEGER NOT NULL,pattern_stop_name TEXT NOT NULL,pattern_stop_order_index INTEGER NOT NULL,PRIMARY KEY(metro_id,revision,pattern_id,pattern_stop_id,pattern_stop_order_index));";
    }
}
