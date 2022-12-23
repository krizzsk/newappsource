package com.moovit.app.ads;

import ce0.C21100e;
import p849uq.C19979c;
import p849uq.C19981e;
import p849uq.C19983g;
import p849uq.C19985i;

public enum AdSource {
    APP_OPEN("ads_app_open_ad_unit_id", new C19981e(), false),
    OPEN_APP_INTERSTITIAL("ads_open_app_interstitial_ad_unit_id", new C19983g(), false),
    TRANSITION_INTERSTITIAL("ads_transition_interstitial_ad_unit_id", new C19983g(), false),
    DASHBOARD_BANNER("ads_dashboard_banner_ad_unit_id", (int) null, true),
    NEARBY_BANNER("ads_nearby_banner_ad_unit_id", (int) null, true),
    LINES_BANNER("ads_lines_banner_ad_unit_id", (int) null, true),
    SUGGESTED_ROUTES_BANNER("ads_suggested_routes_banner_ad_unit_id", (int) null, true),
    STATION_SCREEN_BANNER("ads_station_screen_banner_ad_unit_id", (int) null, true),
    LINE_SCREEN_BANNER("ads_line_screen_banner_ad_unit_id", (int) null, true),
    ITINERARY_SCREEN_BANNER("ads_itinerary_screen_banner_ad_unit_id", (int) null, true),
    ITINERARY_PREVIEW_SCREEN_BANNER("ads_itinerary_preview_screen_banner_ad_unit_id", (int) null, true),
    NAVIGATION_SCREEN_BANNER("ads_navigation_screen_banner_ad_unit_id", (int) null, true),
    ITINERARY_SCHEDULE_SCREEN_BANNER("ads_itinerary_stop_schedule_screen_banner_ad_unit_id", (int) null, true),
    LINE_SCHEDULE_SCREEN_BANNER("ads_line_schedule_screen_banner_ad_unit_id", (int) null, true),
    TRAIN_SCHEDULE_SCREEN_BANNER("ads_train_schedule_screen_banner_ad_unit_id", (int) null, true),
    REPORTS_SCREEN_BANNER("ads_line_news_screen_banner_ad_unit_id", (int) null, true),
    SERVICE_ALERT_SCREEN_BANNER("ads_service_alert_details_screen_banner_ad_unit_id", (int) null, true),
    STOP_ARRIVALS_SCREEN_BANNER("ads_stop_arrivals_screen_banner_ad_unit_id", (int) null, true),
    DASHBOARD_SECTION_BANNER("ads_dashboard_section_banner_ad_unit_id", (int) null, true),
    NEARBY_INLINE_BANNER("ads_nearby_inline_banner_ad_unit_id", (int) null, true),
    SUGGESTED_ROUTES_NATIVE_AD("ads_suggested_routes_native_banner_ad_unit_id", new C19985i(), true);
    
    public final boolean accessibilitySupported;
    public final String adUnitIdKey;
    public final C19979c<?, ?> loader;

    private AdSource(String str, C19979c<?, ?> cVar, boolean z) {
        C21100e.m49373x(str, "adUnitIdKey");
        this.adUnitIdKey = str;
        this.loader = cVar;
        this.accessibilitySupported = z;
    }
}
