package com.moovit.database;

public class Indexes$AgenciesMetroIndex {
    public static String createIndex() {
        return "CREATE INDEX IF NOT EXISTS agencies_metro_index ON agencies(metro_id);";
    }
}
