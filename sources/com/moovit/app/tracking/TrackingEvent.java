package com.moovit.app.tracking;

import p810sz.C19577c;

@Deprecated
public enum TrackingEvent {
    ITINERARY_LIVE_NAVIGATION_HINT_DISPLAYED(1),
    STEP_BY_STEP_LIVE_NAVIGATION_HINT_DISPLAYED(1),
    NAVIGATION_CHANGE_DESTINATION_HINT_DISPLAYED(1),
    LINE_DETAIL_NAVIGATION_HINT_DISPLAYED(1),
    LIVE_DIRECTION_NOTIFICATION_DIALOG_DISPLAYED(1),
    CARPOOL_LOCATION_ON_MAP_STREET_VIEW_HINT_DISPLAYED(1),
    FAVORITE_LOCATION_CONNECT_POP_UP_DISPLAYED(1),
    FAVORITE_LINE_CONNECT_POP_UP_DISPLAYED(1),
    EDITOR_WELCOME_SCREEN_ACKNOWLEDGED(1),
    EDIT_STOP_TAKE_PHOTO_POP_UP_DISPLAYED(1),
    DASHBOARD_CARPOOL_PROMO_DISPLAYED(2),
    NEW_FAVORITE_LINE_ADDED(1),
    FAVORITE_LINES_TAB_WITH_NEW_BADGE_CLICKED(1),
    SELECT_FAVORITE_LINE_STOPS_LINE_ADDED_POP_UP_DISPLAYED(1),
    LINE_DETAIL_FAVORITE_LINES_TAB_SNACK_BAR_DISPLAYED(1),
    COMMUNITY_DASHBOARD_SECTION_DISPLAYED(7),
    REAL_TIME_HELP_BANNER(Integer.MAX_VALUE),
    TRIP_PLAN_TRANSPORT_TYPE_DIALOG_DISPLAYED(1),
    WAZE_CARPOOL_EXPLANATION_DIALOG_DISPLAYED(3),
    WONDO_USER_CONSENT(1),
    ON_BOARDING_CAMPAIGN(1),
    MOT_ACCOUNT_CREATION_WELCOME(1),
    MOT_SCAN_EXPLANATION_DIALOG_DISPLAYED(1),
    MOT_STATION_EXIT_VERIFICATION_DIALOG_DISPLAYED(1),
    MOT_ACCOUNT_BLACKLIST_CLICKED(2),
    MOT_STATION_ENTRANCE_EXPLANATION_DIALOG_DISPLAYED(1),
    SUBSCRIPTIONS_INDICATOR(1);
    
    public static final C19577c<TrackingEvent> CODER = null;
    private final int maxOccurrences;

    /* access modifiers changed from: public */
    static {
        TrackingEvent trackingEvent;
        TrackingEvent trackingEvent2;
        TrackingEvent trackingEvent3;
        TrackingEvent trackingEvent4;
        TrackingEvent trackingEvent5;
        TrackingEvent trackingEvent6;
        TrackingEvent trackingEvent7;
        TrackingEvent trackingEvent8;
        TrackingEvent trackingEvent9;
        TrackingEvent trackingEvent10;
        TrackingEvent trackingEvent11;
        TrackingEvent trackingEvent12;
        TrackingEvent trackingEvent13;
        TrackingEvent trackingEvent14;
        TrackingEvent trackingEvent15;
        TrackingEvent trackingEvent16;
        TrackingEvent trackingEvent17;
        TrackingEvent trackingEvent18;
        TrackingEvent trackingEvent19;
        TrackingEvent trackingEvent20;
        TrackingEvent trackingEvent21;
        TrackingEvent trackingEvent22;
        TrackingEvent trackingEvent23;
        TrackingEvent trackingEvent24;
        TrackingEvent trackingEvent25;
        TrackingEvent trackingEvent26;
        TrackingEvent trackingEvent27;
        CODER = new C19577c<>(TrackingEvent.class, trackingEvent, trackingEvent2, trackingEvent3, trackingEvent4, trackingEvent5, trackingEvent6, trackingEvent7, trackingEvent8, trackingEvent9, trackingEvent10, trackingEvent11, trackingEvent12, trackingEvent13, null, trackingEvent14, trackingEvent15, trackingEvent16, trackingEvent17, trackingEvent18, trackingEvent19, trackingEvent20, trackingEvent21, trackingEvent22, trackingEvent23, trackingEvent24, trackingEvent25, trackingEvent27, trackingEvent26);
    }

    private TrackingEvent(int i) {
        this.maxOccurrences = i;
    }

    public int getMaxOccurrences() {
        return this.maxOccurrences;
    }

    public String getPrefsKey() {
        return String.valueOf(CODER.mo51917b(this));
    }
}
