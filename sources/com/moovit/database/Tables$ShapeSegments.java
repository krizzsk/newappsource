package com.moovit.database;

public final class Tables$ShapeSegments {
    public static String createTable() {
        return "CREATE TABLE IF NOT EXISTS shape_segments(metro_id INTEGER NOT NULL,revision INTEGER NOT NULL,segment_id INTEGER NOT NULL,from_stop_id INTEGER NOT NULL,to_stop_id INTEGER NOT NULL,segment_polyline TEXT NOT NULL,PRIMARY KEY(metro_id,revision,segment_id));";
    }
}
