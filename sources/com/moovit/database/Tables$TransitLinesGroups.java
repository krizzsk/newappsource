package com.moovit.database;

public final class Tables$TransitLinesGroups {
    public static String createTable() {
        return "CREATE TABLE IF NOT EXISTS line_groups(metro_id INTEGER NOT NULL,revision INTEGER NOT NULL,line_group_id INTEGER NOT NULL,line_group_type INTEGER NOT NULL,agency_id INTEGER NOT NULL,line_number TEXT NOT NULL,primary_caption TEXT,secondary_caption TEXT,line_color INTEGER,image_ref_set_data BLOB NOT NULL,inner_image_ids_data BLOB NOT NULL,PRIMARY KEY(metro_id,revision,line_group_id));";
    }
}
