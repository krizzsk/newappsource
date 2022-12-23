package com.moovit.database;

public final class Tables$MetroInfo {
    public static String createTable() {
        return "CREATE TABLE IF NOT EXISTS metro_info(metro_id INTEGER NOT NULL,revision INTEGER NOT NULL,metro_language TEXT,metro_name TEXT NOT NULL,metro_class TEXT NOT NULL,time_zone_id INTEGER NOT NULL,bounds BLOB NOT NULL,default_location BLOB NOT NULL,templates_presentation_conf_data BLOB NOT NULL,templates_data BLOB NOT NULL,stops_category_report_data BLOB NOT NULL,lines_category_report_data BLOB NOT NULL,country_id INTEGER NOT NULL,country_name TEXT NOT NULL,country_code TEXT NOT NULL,local_day_change_time INTEGER NOT NULL,PRIMARY KEY(metro_id,revision));";
    }
}
