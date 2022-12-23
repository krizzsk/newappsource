package com.moovit.genies;

import android.content.Context;
import android.content.SharedPreferences;
import ce0.C21100e;
import f00.C16914b;
import f00.C16915c;
import f00.C16916d;
import f00.C16917e;
import f00.C16919g;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import m10.C18321b;
import p810sz.C19577c;
import p824tp.C19746x;

public enum Genie {
    LINE_VIEW_DIRECTIONS(r3, "ginie_line_change_direction", 1, Arrays.asList(new C16914b[]{new C16916d(new C16917e(C18321b.f46725c)), new C16915c(r12, 1)}), 1, true),
    SUGGESTED_ROUTES_FIRST_ITINERARY(C19746x.genie_suggested_route_1, "ginie_suggested_routes_tap_on_cell", 1, Collections.singletonList(new C16916d(new C16917e(C18321b.f46724b))), 5, false),
    LINE_VIEW_REPORT(C19746x.genie_report_line, "genie_report_line", 3, Arrays.asList(new C16914b[]{new C16916d(new C16917e(C18321b.f46726d)), new C16915c(r12, 4)}), 3, true),
    SUGGESTED_ROUTES_MULTI_ROUTES(C19746x.genie_suggested_route_alternatives, "genie_suggested_route_alternatives", 1, Collections.emptyList(), 5, false),
    DASHBOARD_METRO_NAME(C19746x.change_metro_switch_genie, "genie_metro_area", 2, Collections.singletonList(new C16917e(C18321b.f46723a)), 3, true),
    CARPOOL_PROMOTION(C19746x.genie_carpool_passenger_notifications, "genie_carpool_cell", 1, Collections.emptyList(), 1, true),
    SHOW_ON_MAP(C19746x.genie_tripplan_show_map, "genie_show_on_map", 1, Collections.emptyList(), 3, false),
    DRAWER_BADGE(C19746x.genie_notification_center_menu, "genie_drawer_badge", 2, Collections.emptyList(), 1, true),
    MOT_STOP_DETAIL_LOGGED_IN(C19746x.payment_validation_stops_connected_genie, "genie_mot_stop_detail_logged_in", 2, Collections.emptyList(), 4, true),
    MOT_STOP_DETAIL_NOT_LOGGED_IN(C19746x.payment_validation_stops_first_use_genie, "genie_mot_stop_detail_not_logged_in", 2, Collections.emptyList(), 4, true),
    MOT_LINE_DETAIL_LOGGED_IN(C19746x.payment_validation_lines_connected_genie, "genie_mot_line_detail_logged_in", 2, Collections.emptyList(), 5, true),
    MOT_LINE_DETAIL_NOT_LOGGED_IN(C19746x.payment_validation_lines_first_use_genie, "genie_mot_line_detail_not_logged_in", 2, Collections.emptyList(), 5, true),
    MOT_ITINERARY_LOGGED_IN(C19746x.payment_validation_itinerary_connected_genie, "genie_mot_itinerary_logged_in", 2, Collections.emptyList(), 5, true),
    MOT_ITINERARY_NOT_LOGGED_IN(C19746x.payment_validation_itinerary_first_use_genie, "genie_mot_itinerary_not_logged_in", 2, Collections.emptyList(), 5, true),
    FLEX_TIME_BANNER(C19746x.flex_time_genie, "genie_flextime_banner", 2, Collections.emptyList(), 6, true),
    SEARCH_LOCATIONS(C19746x.search_locations_genie, "genie_search_locations", 2, Collections.emptyList(), 1, true),
    TRIP_PLAN_PREFERENCES(C19746x.trip_plan_preferences_set_genie, "genie_trip_plan_preferences", 2, Collections.emptyList(), 3, true),
    RETURN_TRIP_REMINDER(C19746x.return_trip_reminder_genie, "genie_return_trip_reminder", 2, Collections.emptyList(), 3, true),
    PERSONALIZED_SUGGESTIONS(C19746x.personalized_genie, "genie_suggestions", 2, Collections.emptyList(), 1, true),
    PERSONALIZED_SUGGESTIONS_LATEST_ROUTE(C19746x.smart_component_recently_viewed_trip_genie, "genie_suggestions_latest_route", 2, Collections.emptyList(), 4, true),
    STOP_VIEW_LIVE_LOCATION(r28, "genie_stop_view_live_location", 2, Collections.emptyList(), 5, true),
    LINE_VIEW_LIVE_LOCATION(r28, "genie_line_view_live_location", 2, Collections.emptyList(), 5, true),
    ITINERARY_VIEW_LIVE_LOCATION(r28, "genie_itinerary_view_live_location", 2, Collections.emptyList(), 5, true);
    
    public static final C19577c<Genie> GENIE_CODER = null;
    private final String analyticsConst;
    private final int arrowPosition;
    private final List<? extends C16914b<?>> conditions;
    private final int dismissType;
    private final int textResId;
    private final boolean useDefaultDelay;

    /* access modifiers changed from: public */
    static {
        Genie genie;
        Genie genie2;
        Genie genie3;
        Genie genie4;
        Genie genie5;
        Genie genie6;
        Genie genie7;
        Genie genie8;
        Genie genie9;
        Genie genie10;
        Genie genie11;
        Genie genie12;
        Genie genie13;
        Genie genie14;
        Genie genie15;
        Genie genie16;
        Genie genie17;
        Genie genie18;
        Genie genie19;
        Genie genie20;
        Genie genie21;
        Genie genie22;
        Genie genie23;
        GENIE_CODER = new C19577c<>(Genie.class, genie, genie2, genie3, genie4, genie5, genie6, genie7, genie8, genie9, genie10, genie11, genie12, genie13, genie14, genie15, genie16, genie17, genie18, genie19, genie20, genie21, genie22, genie23);
    }

    private Genie(int i, String str, int i2, List<? extends C16914b<?>> list, int i3, boolean z) {
        this.textResId = i;
        this.analyticsConst = str;
        this.dismissType = i2;
        this.conditions = list;
        this.arrowPosition = i3;
        this.useDefaultDelay = z;
    }

    public boolean canBeShown(Context context) {
        C16919g.C16920a aVar = C18321b.f46723a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("genies_prefs", 0);
        String str = "wasSeen_" + GENIE_CODER.mo51917b(this);
        C21100e.m49373x(str, "name");
        if (Boolean.valueOf(sharedPreferences.getBoolean(str, false)).booleanValue()) {
            return false;
        }
        for (C16914b a : this.conditions) {
            if (!a.mo49541a(sharedPreferences)) {
                return false;
            }
        }
        return true;
    }

    public String getAnalyticsConst() {
        return this.analyticsConst;
    }

    public int getArrowPosition() {
        return this.arrowPosition;
    }

    public int getDismissType() {
        return this.dismissType;
    }

    public int getTextResId() {
        return this.textResId;
    }

    public void setSeen(Context context) {
        new C16919g.C16920a(C16759e.m42349e("wasSeen_", GENIE_CODER.mo51917b(this)), false).mo49545d(context.getSharedPreferences("genies_prefs", 0), Boolean.TRUE);
    }

    public boolean useDefaultDelay() {
        return this.useDefaultDelay;
    }
}
