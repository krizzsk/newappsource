package com.moovit.database;

public final class Tables$LineSearchFts {
    public static String createTable() {
        return "CREATE VIRTUAL TABLE IF NOT EXISTS line_search_fts USING fts5(transit_type,agency,line_number,city1,city2,title,subtitle,metadata,prefix='2 3 4');";
    }

    public static String rebuild() {
        return "INSERT INTO line_search_fts(line_search_fts) VALUES('rebuild');";
    }
}
