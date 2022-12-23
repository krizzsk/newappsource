package com.moovit.database;

public final class Tables$Configuration {
    public static String createTable() {
        return "CREATE TABLE IF NOT EXISTS configuration(metro_id INTEGER NOT NULL,configuration_data BLOB NOT NULL,PRIMARY KEY(metro_id));";
    }
}
