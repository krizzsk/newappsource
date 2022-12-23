package com.moovit.app.tod.model;

import com.tranzmate.R;
import p810sz.C19577c;

public enum TodRideStatus {
    FUTURE(R.drawable.ic_alert_future_16_info, R.string.tod_passenger_ride_status_future, R.attr.colorInfo),
    ACTIVE(R.drawable.ic_alert_active_16_good, R.string.tod_passenger_ride_status_active, R.attr.colorGood),
    CANCELLED(R.drawable.ic_alert_cancelled_16_critical, R.string.tod_passenger_ride_status_canceled, R.attr.colorCritical),
    COMPLETED(R.drawable.ic_alert_complete_16_good, R.string.tod_passenger_ride_status_completed, R.attr.colorGood),
    PASSENGER_NOT_SHOWN(R.drawable.ic_alert_warning_16_problem, R.string.tod_passenger_ride_status_passenger_not_shown, R.attr.colorProblem),
    DECLINED(R.drawable.ic_alert_denied_16_critical, R.string.tod_passenger_ride_status_denied, R.attr.colorCritical);
    
    public static final C19577c<TodRideStatus> CODER = null;
    public final int iconResId;
    public final int textColorAttrId;
    public final int textResId;

    /* access modifiers changed from: public */
    static {
        TodRideStatus todRideStatus;
        TodRideStatus todRideStatus2;
        TodRideStatus todRideStatus3;
        TodRideStatus todRideStatus4;
        TodRideStatus todRideStatus5;
        TodRideStatus todRideStatus6;
        CODER = new C19577c<>(TodRideStatus.class, todRideStatus, todRideStatus2, todRideStatus3, todRideStatus4, todRideStatus5, todRideStatus6);
    }

    private TodRideStatus(int i, int i2, int i3) {
        this.iconResId = i;
        this.textResId = i2;
        this.textColorAttrId = i3;
    }
}
