package com.moovit.database;

public final class Tables$CustomPOISearchFts {
    public static String createTable() {
        return "CREATE VIRTUAL TABLE IF NOT EXISTS custom_poi_fts USING fts5(poi_title,poi_subtitle,prefix='1 2 3 4');";
    }

    public static String rebuild() {
        return "INSERT INTO custom_poi_fts(custom_poi_fts) VALUES('rebuild');";
    }
}
