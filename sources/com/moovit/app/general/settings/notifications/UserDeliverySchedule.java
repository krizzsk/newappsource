package com.moovit.app.general.settings.notifications;

import ce0.C21100e;
import com.tranzmate.R;

public enum UserDeliverySchedule {
    CommuteHours(R.string.commute_hours_only, "user_delivery_schedule_commute_hours"),
    AnyTime(R.string.any_time, "user_delivery_schedule_any_time"),
    Never(R.string.never, "user_delivery_schedule_never");
    
    public final String analyticsName;
    public final int name;

    private UserDeliverySchedule(int i, String str) {
        this.name = i;
        C21100e.m49373x(str, "analyticsName");
        this.analyticsName = str;
    }
}
