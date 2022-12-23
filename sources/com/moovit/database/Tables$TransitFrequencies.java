package com.moovit.database;

public final class Tables$TransitFrequencies {
    public static String createTable() {
        return "CREATE TABLE IF NOT EXISTS transit_frequencies(metro_id INTEGER NOT NULL,revision INTEGER NOT NULL,transit_frequency_id INTEGER NOT NULL,min_interval_in_seconds INTEGER NOT NULL,max_interval_in_seconds INTEGER NOT NULL,min_window_in_seconds INTEGER NOT NULL,max_window_in_seconds INTEGER NOT NULL,PRIMARY KEY(metro_id,revision,transit_frequency_id,min_window_in_seconds,max_window_in_seconds));";
    }
}
