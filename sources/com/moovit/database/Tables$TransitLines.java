package com.moovit.database;

public final class Tables$TransitLines {
    public static String createTable() {
        return "CREATE TABLE IF NOT EXISTS lines(metro_id INTEGER NOT NULL,revision INTEGER NOT NULL,line_id INTEGER NOT NULL,line_group_id INTEGER NOT NULL,line_group_order_index INTEGER NOT NULL,line_origin TEXT,line_destination TEXT NOT NULL,line_long_name TEXT,line_direction_name TEXT,PRIMARY KEY(metro_id,revision,line_id),FOREIGN KEY(metro_id,revision,line_group_id) REFERENCES line_groups(metro_id,revision,line_group_id));";
    }
}
