package com.moovit.app.tod.model;

import com.tranzmate.R;

public enum TodJourneyStatus {
    HEADING_PICKUP(R.string.tod_passenger_ride_real_time_heading_pickup),
    ARRIVING_PICKUP(R.string.tod_passenger_ride_real_time_arriving_pickup),
    ARRIVED_PICKUP(R.string.tod_passenger_ride_real_time_arrived_pickup),
    HEADING_DROP_OFF(R.string.tod_passenger_ride_real_time_heading_drop_off),
    ARRIVING_DROP_OFF(R.string.tod_passenger_ride_real_time_arriving_drop_off),
    ARRIVED_DROP_OFF(R.string.tod_passenger_ride_real_time_arrived_drop_off);
    
    public final int titleResId;

    private TodJourneyStatus(int i) {
        this.titleResId = i;
    }

    public boolean isPickedUp() {
        return ordinal() >= HEADING_DROP_OFF.ordinal();
    }
}
