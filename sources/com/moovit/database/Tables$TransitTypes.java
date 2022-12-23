package com.moovit.database;

public final class Tables$TransitTypes {
    public static String createTable() {
        return "CREATE TABLE IF NOT EXISTS transit_types(metro_id INTEGER NOT NULL,revision INTEGER NOT NULL,transit_type_id INTEGER NOT NULL,transit_type_order_index INTEGER NOT NULL,transit_type_name_external_text_id INTEGER NOT NULL,transit_type_image_data BLOB NOT NULL,transit_type_vehicle_type INTEGER NOT NULL,transit_type_view_type INTEGER NOT NULL,PRIMARY KEY(metro_id,revision,transit_type_id));";
    }
}
