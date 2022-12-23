package com.moovit.database;

public final class Tables$BicycleProviders {
    public static String createTable() {
        return "CREATE TABLE IF NOT EXISTS bicycle_providers(metro_id INTEGER NOT NULL,revision INTEGER NOT NULL,provider_id INTEGER NOT NULL,provider_name TEXT NOT NULL,provider_primary_color INTEGER NOT NULL,provider_secondary_color INTEGER NOT NULL,provider_real_time_indicator BOOLEAN NOT NULL,provider_image_data BLOB,provider_order_index INTEGER NOT NULL,PRIMARY KEY(metro_id,revision,provider_id));";
    }
}
