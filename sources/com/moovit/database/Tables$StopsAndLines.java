package com.moovit.database;

public final class Tables$StopsAndLines {
    public static String createTable() {
        return "CREATE TABLE IF NOT EXISTS stops_lines(metro_id INTEGER NOT NULL,revision INTEGER NOT NULL,stop_id INTEGER NOT NULL,line_id INTEGER NOT NULL,platform_name TEXT,line_order_index INTEGER NOT NULL,PRIMARY KEY(metro_id,revision,stop_id,line_id)FOREIGN KEY(metro_id,revision,stop_id) REFERENCES stops(metro_id,revision,stop_id));";
    }
}
