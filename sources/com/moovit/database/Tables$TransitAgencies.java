package com.moovit.database;

public final class Tables$TransitAgencies {
    public static String createTable() {
        return "CREATE TABLE IF NOT EXISTS agencies(metro_id INTEGER NOT NULL,revision INTEGER NOT NULL,agency_id INTEGER NOT NULL,agency_name TEXT NOT NULL,agency_transit_type_id INTEGER NOT NULL,agency_image_data BLOB,PRIMARY KEY(metro_id,revision,agency_id),FOREIGN KEY(metro_id,revision,agency_transit_type_id) REFERENCES transit_types(metro_id,revision,transit_type_id));";
    }
}
