package com.moovit.app.tod.bookingflow.model;

import com.tranzmate.R;

public enum FailureReason {
    NONE(0, (int) null),
    OUT_OF_AREA(R.string.tod_order_map_selection_error_out_of_area, "out_of_area"),
    DISTANCE_TOO_CLOSE(R.string.tod_order_map_selection_error_destination_too_close, "destination_too_close");
    
    private final String description;
    private final int resId;

    private FailureReason(int i, String str) {
        this.resId = i;
        this.description = str;
    }

    public String getDescription() {
        return this.description;
    }

    public int getResId() {
        return this.resId;
    }
}
