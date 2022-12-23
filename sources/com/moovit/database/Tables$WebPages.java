package com.moovit.database;

public final class Tables$WebPages {
    public static String createTable() {
        return "CREATE TABLE IF NOT EXISTS web_pages(metro_id INTEGER NOT NULL,revision INTEGER NOT NULL,web_page_id INTEGER NOT NULL,web_page_type INTEGER NOT NULL,web_page_new_index INTEGER NOT NULL,web_page_name TEXT NOT NULL,web_page_url TEXT NOT NULL,web_page_embedded BOOLEAN NOT NULL,web_page_version INTEGER NOT NULL,web_page_shown_version INTEGER NOT NULL,web_page_image_data BLOB,web_page_bg_color INTEGER,PRIMARY KEY(metro_id,revision,web_page_id));";
    }
}
