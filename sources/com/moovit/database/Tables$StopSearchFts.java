package com.moovit.database;

public final class Tables$StopSearchFts {
    public static String createTable() {
        return "CREATE VIRTUAL TABLE IF NOT EXISTS stop_search_fts USING fts5(transit_types,content,prefix='1 2 3 4');";
    }

    public static String optimize() {
        return "INSERT INTO stop_search_fts(stop_search_fts) VALUES('optimize');";
    }
}
