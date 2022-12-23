package com.moovit.database;

public final class Tables$LineSearchData {
    public static String createTable() {
        return "CREATE TABLE IF NOT EXISTS line_search_data(metro_id INTEGER NOT NULL,revision INTEGER NOT NULL,search_data_id INTEGER NOT NULL,search_data_transit_type_id INTEGER NOT NULL,search_data_agency_id INTEGER,search_data_line_number TEXT NOT NULL,search_data_sorting_index INTEGER NOT NULL,search_data_order_index INTEGER NOT NULL,search_data_title TEXT,search_data_subtitle TEXT,search_data_image_data BLOB,search_data_metadata BLOB,search_data_city1 TEXT,search_data_city2 TEXT,PRIMARY KEY(metro_id,revision,search_data_id),FOREIGN KEY(metro_id,revision,search_data_transit_type_id) REFERENCES transit_types(metro_id,revision,transit_type_id),FOREIGN KEY(metro_id,revision,search_data_agency_id) REFERENCES agencies(metro_id,revision,agency_id));";
    }
}
