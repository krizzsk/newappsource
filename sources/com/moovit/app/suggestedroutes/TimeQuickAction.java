package com.moovit.app.suggestedroutes;

import ce0.C21100e;
import com.tranzmate.R;

public enum TimeQuickAction {
    DEPART_NOW(R.string.time_picker_leave_now, 0, "trip_plan_edit_time_depart_now_clicked"),
    DEPART_AT(R.string.time_picker_depart_at, R.string.voice_over_tripplan_time_choose_departure_hint, "trip_plan_edit_time_set_departure_clicked"),
    ARRIVE_BY(R.string.time_picker_arrive_by, R.string.voice_over_tripplan_time_choose_arrival_hint, "trip_plan_edit_time_set_arrival_clicked"),
    TAKE_LAST_LINE(R.string.time_picker_last, R.string.voice_over_tripplan_time_choose_last_hint, "trip_plan_edit_time_last_lines_clicked");
    
    public final String analyticsConst;
    public final int contentDescriptionResId;
    public final int textResId;

    private TimeQuickAction(int i, int i2, String str) {
        this.textResId = i;
        this.contentDescriptionResId = i2;
        C21100e.m49373x(str, "analyticsConst");
        this.analyticsConst = str;
    }
}
