package com.moovit.database;

public final class Tables$Shapes {
    public static String createTable() {
        return "CREATE TABLE IF NOT EXISTS shapes(metro_id INTEGER NOT NULL,revision INTEGER NOT NULL,shape_id INTEGER NOT NULL,shape_polyline TEXT NOT NULL,PRIMARY KEY(metro_id,revision,shape_id));";
    }
}
