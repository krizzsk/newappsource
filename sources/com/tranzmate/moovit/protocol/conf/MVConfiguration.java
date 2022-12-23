package com.tranzmate.moovit.protocol.conf;

import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import p001a0.C0016g;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVConfiguration implements TBase<MVConfiguration, _Fields>, Serializable, Cloneable, Comparable<MVConfiguration> {

    /* renamed from: A */
    public static final C25113c f25185A = new C25113c("location_trigger_dwell_delay_sec", (byte) 8, 26);

    /* renamed from: A0 */
    public static final C25113c f25186A0 = new C25113c("showRideRequestSection", (byte) 2, 65);

    /* renamed from: B */
    public static final C25113c f25187B = new C25113c("location_trigger_geofence_radius_meters", (byte) 8, 27);

    /* renamed from: B0 */
    public static final C25113c f25188B0 = new C25113c("searchMaxFutureDays", (byte) 8, 66);

    /* renamed from: C */
    public static final C25113c f25189C = new C25113c("IS_BIKE_SHARING_SUPPORT", (byte) 2, 28);

    /* renamed from: C0 */
    public static final C25113c f25190C0 = new C25113c("homeTabs", (byte) 15, 67);

    /* renamed from: D */
    public static final C25113c f25191D = new C25113c("IS_CAR_SHARING_SUPPORT", (byte) 2, 29);

    /* renamed from: D0 */
    public static final C25113c f25192D0 = new C25113c("service_status_card_is_subway", (byte) 2, 68);

    /* renamed from: E */
    public static final C25113c f25193E = new C25113c("IS_CAR_POOL_SUPPORT", (byte) 2, 30);

    /* renamed from: E0 */
    public static final C25113c f25194E0 = new C25113c("sectionsOrder", (byte) 15, 69);

    /* renamed from: F */
    public static final C25113c f25195F = new C25113c("USE_ROLLOUT", (byte) 2, 31);

    /* renamed from: F0 */
    public static final C25113c f25196F0 = new C25113c("scheduleDisplayExperiment", (byte) 8, 70);

    /* renamed from: G */
    public static final C25113c f25197G = new C25113c("IS_TRIP_PLAN_RATING_SUPPORT", (byte) 2, 32);

    /* renamed from: G0 */
    public static final C25113c f25198G0 = new C25113c("IS_RIDE_SHARING_SUPPORT", (byte) 2, 71);

    /* renamed from: H */
    public static final C25113c f25199H = new C25113c("topup_tab_link", (byte) 11, 33);

    /* renamed from: H0 */
    public static final C25113c f25200H0 = new C25113c("IS_FREQUENCY_SUPPORTED", (byte) 2, 72);

    /* renamed from: I */
    public static final C25113c f25201I = new C25113c("IS_ADS_SUPPORT", (byte) 2, 34);

    /* renamed from: I0 */
    public static final C25113c f25202I0 = new C25113c("IS_DOCKLESS_BIKES_SUPPORTED", (byte) 2, 73);

    /* renamed from: J */
    public static final C25113c f25203J = new C25113c("SUBWAY_LAYER_URL", (byte) 11, 35);

    /* renamed from: J0 */
    public static final C25113c f25204J0 = new C25113c("IS_DOCKLESS_SCOOTERS_SUPPORTED", (byte) 2, 74);

    /* renamed from: K */
    public static final C25113c f25205K = new C25113c("PATHWAY_LAYERS_URL", (byte) 11, 36);

    /* renamed from: K0 */
    public static final C25113c f25206K0 = new C25113c("IS_DOCKLESS_KICK_SCOOTERS_SUPPORTED", (byte) 2, 75);

    /* renamed from: L */
    public static final C25113c f25207L = new C25113c("IS_STOP_MAP_ITEMS_PRELOAD_SUPPORTED", (byte) 2, 37);

    /* renamed from: L0 */
    public static final C25113c f25208L0 = new C25113c("IS_DOCKLESS_MOPED_SUPPORTED", (byte) 2, 76);

    /* renamed from: M */
    public static final C25113c f25209M = new C25113c("additionalTab", (byte) 8, 38);

    /* renamed from: M0 */
    public static final C25113c f25210M0 = new C25113c("GTFS_CONFIG_FILES", (byte) 11, 77);

    /* renamed from: N */
    public static final C25113c f25211N = new C25113c("additionalTabPosition", (byte) 8, 39);

    /* renamed from: N0 */
    public static final C25113c f25212N0 = new C25113c("GTFS_CONFIG_GRAPH_NUM_OF_DAYS", (byte) 8, 78);

    /* renamed from: O */
    public static final C25113c f25213O = new C25113c("MAX_ZOOM_FOR_SUBWAY_LAYER", (byte) 6, 40);

    /* renamed from: O0 */
    public static final C25113c f25214O0 = new C25113c("GTFS_CONFIG_GRAPH_HOURS", (byte) 8, 79);

    /* renamed from: P */
    public static final C25113c f25215P = new C25113c("MIN_ZOOM_FOR_SUBWAY_LAYER", (byte) 6, 41);

    /* renamed from: P0 */
    public static final C25113c f25216P0 = new C25113c("SEARCH_LOCATIONS_DELAY", (byte) 8, 80);

    /* renamed from: Q */
    public static final C25113c f25217Q = new C25113c("MAP_IMPL_TYPE", (byte) 8, 42);

    /* renamed from: Q0 */
    public static final C25113c f25218Q0 = new C25113c("TRIP_PLAN_PERSONALIZATION_POPUP_ENABLED", (byte) 2, 81);

    /* renamed from: R */
    public static final C25113c f25219R = new C25113c("MIN_ARRIVALS_TO_RETRIEVE", (byte) 8, 43);

    /* renamed from: R0 */
    public static final C25113c f25220R0 = new C25113c("suggestedRoutesCellImprovementsExperiment", (byte) 8, 82);

    /* renamed from: S */
    public static final C25113c f25221S = new C25113c("MINUTES_CONSIDER_ARRIVALS", (byte) 8, 44);

    /* renamed from: S0 */
    public static final C25113c f25222S0 = new C25113c("homeWorkExperiment", (byte) 8, 83);

    /* renamed from: T */
    public static final C25113c f25223T = new C25113c("IS_STOP_EDITING_SUPPORTED", (byte) 2, 45);

    /* renamed from: T0 */
    public static final C25113c f25224T0 = new C25113c("IS_PRIVATE_BIKE_SUPPORTED", (byte) 2, 84);

    /* renamed from: U */
    public static final C25113c f25225U = new C25113c("SEARCH_LAST_INTERVAL_IN_SECONDS", (byte) 8, 46);

    /* renamed from: U0 */
    public static final C25113c f25226U0 = new C25113c("USE_GOOGLE_PLACES", (byte) 2, 85);

    /* renamed from: V0 */
    public static final C25113c f25227V0 = new C25113c("DASHBOARD_SECTIONS", (byte) 15, 86);

    /* renamed from: W0 */
    public static final C25113c f25228W0 = new C25113c("wazeCarpoolInstallationLink", (byte) 11, 87);

    /* renamed from: X */
    public static final C25113c f25229X = new C25113c("SHOW_NEW_ITINERARIES_HINT", (byte) 2, 47);

    /* renamed from: X0 */
    public static final C25113c f25230X0 = new C25113c("wazeCarpoolDeepLink", (byte) 11, 88);

    /* renamed from: Y */
    public static final C25113c f25231Y = new C25113c("TopUpText", (byte) 11, 48);

    /* renamed from: Y0 */
    public static final C25113c f25232Y0 = new C25113c("IS_TICKETING_V2_SUPPORTED", (byte) 2, 90);

    /* renamed from: Z */
    public static final C25113c f25233Z = new C25113c("CarPoolAttributionImageUrl", (byte) 11, 49);

    /* renamed from: Z0 */
    public static final C25113c f25234Z0 = new C25113c("arExperiment", (byte) 8, 91);

    /* renamed from: a1 */
    public static final C25113c f25235a1 = new C25113c("itineraryQuickActions", (byte) 15, 92);

    /* renamed from: b */
    public static final C25113c f25236b = new C25113c("latestAppVersionCode", (byte) 8, 1);

    /* renamed from: b1 */
    public static final C25113c f25237b1 = new C25113c("lineViewQuickActions", (byte) 15, 93);

    /* renamed from: c */
    public static final C25113c f25238c = new C25113c("defaultTripPlanOption", (byte) 8, 2);

    /* renamed from: c1 */
    public static final C25113c f25239c1 = new C25113c("stopViewQuickActions", (byte) 15, 94);

    /* renamed from: d */
    public static final C25113c f25240d = new C25113c("twitterPostActivityNames", (byte) 15, 3);

    /* renamed from: d1 */
    public static final C25113c f25241d1 = new C25113c("onboardingFavoritesTestingGroup", (byte) 8, 95);

    /* renamed from: e */
    public static final C25113c f25242e = new C25113c("latestRelease_iPhone", (byte) 11, 4);

    /* renamed from: e1 */
    public static final C25113c f25243e1 = new C25113c("searchExamplesAbTestingGroup", (byte) 8, 96);

    /* renamed from: f */
    public static final C25113c f25244f = new C25113c("latestRelease_android", (byte) 11, 5);

    /* renamed from: f1 */
    public static final C25113c f25245f1 = new C25113c("searchLocationHintABTestingType", (byte) 8, 97);

    /* renamed from: g */
    public static final C25113c f25246g = new C25113c("whatsNewURL_iPhone", (byte) 11, 6);

    /* renamed from: g1 */
    public static final C25113c f25247g1 = new C25113c("mainSearchButtonABTestingGroup", (byte) 8, 98);

    /* renamed from: h */
    public static final C25113c f25248h = new C25113c("whatsNewURL_android", (byte) 11, 7);

    /* renamed from: h1 */
    public static final C25113c f25249h1 = new C25113c("mvUserProfileAccessibilityPref", (byte) 8, 99);

    /* renamed from: i */
    public static final C25113c f25250i = new C25113c("feedBackEmailAddress", (byte) 11, 8);

    /* renamed from: i1 */
    public static final C25113c f25251i1 = new C25113c("adsConsentLayoutABTestGroup", (byte) 8, 100);

    /* renamed from: j */
    public static final C25113c f25252j = new C25113c("USE_MOOVIT_TILES", (byte) 2, 9);

    /* renamed from: j1 */
    public static final C25113c f25253j1 = new C25113c("subscriptionABTestGroup", (byte) 8, 101);

    /* renamed from: k */
    public static final C25113c f25254k = new C25113c("MOOVIT_TILES_URL", (byte) 11, 10);

    /* renamed from: k1 */
    public static final C25113c f25255k1 = new C25113c("bannerDesignABTestGroup", (byte) 8, 102);

    /* renamed from: l */
    public static final C25113c f25256l = new C25113c("near_me_default_stop_radius", (byte) 8, 11);

    /* renamed from: l0 */
    public static final C25113c f25257l0 = new C25113c("CarPoolAttributionText", (byte) 11, 50);

    /* renamed from: l1 */
    public static final C25113c f25258l1 = new C25113c("attPermissionsABTestingGroup", (byte) 8, 103);

    /* renamed from: m */
    public static final C25113c f25259m = new C25113c("near_me_default_stop_detail_radius", (byte) 8, 12);

    /* renamed from: m0 */
    public static final C25113c f25260m0 = new C25113c("MAP_IMPL_TYPE_V5", (byte) 8, 51);

    /* renamed from: m1 */
    public static final C25113c f25261m1 = new C25113c("directToItineraryABTestGroup", (byte) 8, 104);

    /* renamed from: n */
    public static final C25113c f25262n = new C25113c("near_me_default_stop_detail_max_lines", (byte) 8, 13);

    /* renamed from: n0 */
    public static final C25113c f25263n0 = new C25113c("near_me_favorite_stop_detail_max_lines", (byte) 8, 52);

    /* renamed from: n1 */
    public static final C25113c f25264n1 = new C25113c("smartComponentRandomABTestingGroup", (byte) 8, 105);

    /* renamed from: o */
    public static final C25113c f25265o = new C25113c("near_me_map_sensitivity", (byte) 8, 14);

    /* renamed from: o0 */
    public static final C25113c f25266o0 = new C25113c("is_trip_plan_car_pool_experiment_on", (byte) 2, 53);

    /* renamed from: o1 */
    public static final C25113c f25267o1 = new C25113c("lineViewWalkthroughABTestingGroup", (byte) 8, 106);

    /* renamed from: p */
    public static final C25113c f25268p = new C25113c("walking_speed_factor", (byte) 4, 15);

    /* renamed from: p0 */
    public static final C25113c f25269p0 = new C25113c("isInterstitialAdsSupported", (byte) 2, 54);

    /* renamed from: p1 */
    public static final HashMap f25270p1;

    /* renamed from: q */
    public static final C25113c f25271q = new C25113c("DEFAULT_INTERMEDIATE_DURATION", (byte) 11, 16);

    /* renamed from: q0 */
    public static final C25113c f25272q0 = new C25113c("PCT_OF_SERVER_LOG", (byte) 8, 55);

    /* renamed from: q1 */
    public static final Map<_Fields, FieldMetaData> f25273q1;

    /* renamed from: r */
    public static final C25113c f25274r = new C25113c("TIME_DELTA_UPDATES", (byte) 11, 17);

    /* renamed from: r0 */
    public static final C25113c f25275r0 = new C25113c("USE_SERVER_FOR_FORWARD_GEOCODE", (byte) 2, 56);

    /* renamed from: s */
    public static final C25113c f25276s = new C25113c("DISTANCE_DELTA_UPDATES", (byte) 11, 18);

    /* renamed from: s0 */
    public static final C25113c f25277s0 = new C25113c("ACTIVE_PROFILER_PCT", (byte) 8, 57);

    /* renamed from: t */
    public static final C25113c f25278t = new C25113c("SCHEDULE_TIME_JOIN_RT_GTFS_SECONDS", (byte) 8, 19);

    /* renamed from: t0 */
    public static final C25113c f25279t0 = new C25113c("carPoolReferralIndication", (byte) 2, 58);

    /* renamed from: u */
    public static final C25113c f25280u = new C25113c("IS_TAXI_SUPPORT", (byte) 2, 20);

    /* renamed from: u0 */
    public static final C25113c f25281u0 = new C25113c("NEAR_ME_RT_ENABLED", (byte) 2, 59);

    /* renamed from: v */
    public static final C25113c f25282v = new C25113c("HAS_MAP_CAMPAIGNS", (byte) 2, 21);

    /* renamed from: v0 */
    public static final C25113c f25283v0 = new C25113c("IS_USER_REPORTS_ENABLED", (byte) 2, 60);

    /* renamed from: w */
    public static final C25113c f25284w = new C25113c("SUPPORT_SERVICE_ALERTS_TAB", (byte) 2, 22);

    /* renamed from: w0 */
    public static final C25113c f25285w0 = new C25113c("fgWifiScanSec", (byte) 8, 61);

    /* renamed from: x */
    public static final C25113c f25286x = new C25113c("STOP_GAME_ENABLED", (byte) 2, 23);

    /* renamed from: x0 */
    public static final C25113c f25287x0 = new C25113c("fgBeaconScanSec", (byte) 8, 62);

    /* renamed from: y */
    public static final C25113c f25288y = new C25113c("is_location_triggers_enable", (byte) 2, 24);

    /* renamed from: y0 */
    public static final C25113c f25289y0 = new C25113c("isReportMetrics", (byte) 2, 63);

    /* renamed from: z */
    public static final C25113c f25290z = new C25113c("is_topup_tab_enable", (byte) 2, 25);

    /* renamed from: z0 */
    public static final C25113c f25291z0 = new C25113c("showCommunitySection", (byte) 2, 64);
    public int ACTIVE_PROFILER_PCT;
    public String CarPoolAttributionImageUrl;
    public String CarPoolAttributionText;
    public List<MVDashboardSection> DASHBOARD_SECTIONS;
    public String DEFAULT_INTERMEDIATE_DURATION;
    public String DISTANCE_DELTA_UPDATES;
    public String GTFS_CONFIG_FILES;
    public int GTFS_CONFIG_GRAPH_HOURS;
    public int GTFS_CONFIG_GRAPH_NUM_OF_DAYS;
    public boolean HAS_MAP_CAMPAIGNS;
    public boolean IS_ADS_SUPPORT;
    public boolean IS_BIKE_SHARING_SUPPORT;
    public boolean IS_CAR_POOL_SUPPORT;
    public boolean IS_CAR_SHARING_SUPPORT;
    public boolean IS_DOCKLESS_BIKES_SUPPORTED;
    public boolean IS_DOCKLESS_KICK_SCOOTERS_SUPPORTED;
    public boolean IS_DOCKLESS_MOPED_SUPPORTED;
    public boolean IS_DOCKLESS_SCOOTERS_SUPPORTED;
    public boolean IS_FREQUENCY_SUPPORTED;
    public boolean IS_PRIVATE_BIKE_SUPPORTED;
    public boolean IS_RIDE_SHARING_SUPPORT;
    public boolean IS_STOP_EDITING_SUPPORTED;
    public boolean IS_STOP_MAP_ITEMS_PRELOAD_SUPPORTED;
    public boolean IS_TAXI_SUPPORT;
    public boolean IS_TICKETING_V2_SUPPORTED;
    public boolean IS_TRIP_PLAN_RATING_SUPPORT;
    public boolean IS_USER_REPORTS_ENABLED;
    public MVMapImplType MAP_IMPL_TYPE;
    public MVMapImplType MAP_IMPL_TYPE_V5;
    public short MAX_ZOOM_FOR_SUBWAY_LAYER;
    public int MINUTES_CONSIDER_ARRIVALS;
    public int MIN_ARRIVALS_TO_RETRIEVE;
    public short MIN_ZOOM_FOR_SUBWAY_LAYER;
    public String MOOVIT_TILES_URL;
    public boolean NEAR_ME_RT_ENABLED;
    public String PATHWAY_LAYERS_URL;
    public int PCT_OF_SERVER_LOG;
    public int SCHEDULE_TIME_JOIN_RT_GTFS_SECONDS;
    public int SEARCH_LAST_INTERVAL_IN_SECONDS;
    public int SEARCH_LOCATIONS_DELAY;
    public boolean SHOW_NEW_ITINERARIES_HINT;
    public boolean STOP_GAME_ENABLED;
    public String SUBWAY_LAYER_URL;
    public boolean SUPPORT_SERVICE_ALERTS_TAB;
    public String TIME_DELTA_UPDATES;
    public boolean TRIP_PLAN_PERSONALIZATION_POPUP_ENABLED;
    public String TopUpText;
    public boolean USE_GOOGLE_PLACES;
    public boolean USE_MOOVIT_TILES;
    public boolean USE_ROLLOUT;
    public boolean USE_SERVER_FOR_FORWARD_GEOCODE;
    private long __isset_bitfield = 0;
    public MVAdditionalTab additionalTab;
    public int additionalTabPosition;
    public MVAdsConsentLayoutABTestGroup adsConsentLayoutABTestGroup;
    public MVARExperiment arExperiment;
    public MVATTPermissionsABTestingGroup attPermissionsABTestingGroup;
    public MVBannerDesignABTestGroup bannerDesignABTestGroup;
    public boolean carPoolReferralIndication;
    public MVTripPlanOption defaultTripPlanOption;
    public MVDirectToItineraryABTestGroup directToItineraryABTestGroup;
    public String feedBackEmailAddress;
    public int fgBeaconScanSec;
    public int fgWifiScanSec;
    public List<MVHomeTab> homeTabs;
    public MVHomeWorkExperiment homeWorkExperiment;
    public boolean isInterstitialAdsSupported;
    public boolean isReportMetrics;
    public boolean is_location_triggers_enable;
    public boolean is_topup_tab_enable;
    public boolean is_trip_plan_car_pool_experiment_on;
    public List<MVItineraryQuickAction> itineraryQuickActions;
    public int latestAppVersionCode;
    public String latestRelease_android;
    public String latestRelease_iPhone;
    public List<MVLineViewQuickAction> lineViewQuickActions;
    public MVLineViewWalkthroughABTestingGroup lineViewWalkthroughABTestingGroup;
    public int location_trigger_dwell_delay_sec;
    public int location_trigger_geofence_radius_meters;
    public MVMainSearchButtonABTestingGroup mainSearchButtonABTestingGroup;
    public MVUserProfileAccessibilityPref mvUserProfileAccessibilityPref;
    public int near_me_default_stop_detail_max_lines;
    public int near_me_default_stop_detail_radius;
    public int near_me_default_stop_radius;
    public int near_me_favorite_stop_detail_max_lines;
    public int near_me_map_sensitivity;
    public MVOnboardingFavoritesABTestingGroup onboardingFavoritesTestingGroup;
    private _Fields[] optionals = {_Fields.SCHEDULE_DISPLAY_EXPERIMENT};
    public MVScheduleDisplayExperiment scheduleDisplayExperiment;
    public MVSearchExamplesABTestGroup searchExamplesAbTestingGroup;
    public MVSearchLocationHintABTestingType searchLocationHintABTestingType;
    public int searchMaxFutureDays;
    public List<MVSingleTabSection> sectionsOrder;
    public boolean service_status_card_is_subway;
    public boolean showCommunitySection;
    public boolean showRideRequestSection;
    public MVSmartComponentRandomABTestingGroup smartComponentRandomABTestingGroup;
    public List<MVStopViewQuickAction> stopViewQuickActions;
    public MVSubscriptionsABTestGroup subscriptionABTestGroup;
    public MVSuggestedRoutesCellImprovementsExperiment suggestedRoutesCellImprovementsExperiment;
    public String topup_tab_link;
    public List<String> twitterPostActivityNames;
    public double walking_speed_factor;
    public String wazeCarpoolDeepLink;
    public String wazeCarpoolInstallationLink;
    public String whatsNewURL_android;
    public String whatsNewURL_iPhone;

    public enum _Fields implements C25085c {
        LATEST_APP_VERSION_CODE(1, "latestAppVersionCode"),
        DEFAULT_TRIP_PLAN_OPTION(2, "defaultTripPlanOption"),
        TWITTER_POST_ACTIVITY_NAMES(3, "twitterPostActivityNames"),
        LATEST_RELEASE_I_PHONE(4, "latestRelease_iPhone"),
        LATEST_RELEASE_ANDROID(5, "latestRelease_android"),
        WHATS_NEW_URL_I_PHONE(6, "whatsNewURL_iPhone"),
        WHATS_NEW_URL_ANDROID(7, "whatsNewURL_android"),
        FEED_BACK_EMAIL_ADDRESS(8, "feedBackEmailAddress"),
        USE__MOOVIT__TILES(9, "USE_MOOVIT_TILES"),
        MOOVIT__TILES__URL(10, "MOOVIT_TILES_URL"),
        NEAR_ME_DEFAULT_STOP_RADIUS(11, "near_me_default_stop_radius"),
        NEAR_ME_DEFAULT_STOP_DETAIL_RADIUS(12, "near_me_default_stop_detail_radius"),
        NEAR_ME_DEFAULT_STOP_DETAIL_MAX_LINES(13, "near_me_default_stop_detail_max_lines"),
        NEAR_ME_MAP_SENSITIVITY(14, "near_me_map_sensitivity"),
        WALKING_SPEED_FACTOR(15, "walking_speed_factor"),
        DEFAULT__INTERMEDIATE__DURATION(16, "DEFAULT_INTERMEDIATE_DURATION"),
        TIME__DELTA__UPDATES(17, "TIME_DELTA_UPDATES"),
        DISTANCE__DELTA__UPDATES(18, "DISTANCE_DELTA_UPDATES"),
        SCHEDULE__TIME__JOIN__RT__GTFS__SECONDS(19, "SCHEDULE_TIME_JOIN_RT_GTFS_SECONDS"),
        IS__TAXI__SUPPORT(20, "IS_TAXI_SUPPORT"),
        HAS__MAP__CAMPAIGNS(21, "HAS_MAP_CAMPAIGNS"),
        SUPPORT__SERVICE__ALERTS__TAB(22, "SUPPORT_SERVICE_ALERTS_TAB"),
        STOP__GAME__ENABLED(23, "STOP_GAME_ENABLED"),
        IS_LOCATION_TRIGGERS_ENABLE(24, "is_location_triggers_enable"),
        IS_TOPUP_TAB_ENABLE(25, "is_topup_tab_enable"),
        LOCATION_TRIGGER_DWELL_DELAY_SEC(26, "location_trigger_dwell_delay_sec"),
        LOCATION_TRIGGER_GEOFENCE_RADIUS_METERS(27, "location_trigger_geofence_radius_meters"),
        IS__BIKE__SHARING__SUPPORT(28, "IS_BIKE_SHARING_SUPPORT"),
        IS__CAR__SHARING__SUPPORT(29, "IS_CAR_SHARING_SUPPORT"),
        IS__CAR__POOL__SUPPORT(30, "IS_CAR_POOL_SUPPORT"),
        USE__ROLLOUT(31, "USE_ROLLOUT"),
        IS__TRIP__PLAN__RATING__SUPPORT(32, "IS_TRIP_PLAN_RATING_SUPPORT"),
        TOPUP_TAB_LINK(33, "topup_tab_link"),
        IS__ADS__SUPPORT(34, "IS_ADS_SUPPORT"),
        SUBWAY__LAYER__URL(35, "SUBWAY_LAYER_URL"),
        PATHWAY__LAYERS__URL(36, "PATHWAY_LAYERS_URL"),
        IS__STOP__MAP__ITEMS__PRELOAD__SUPPORTED(37, "IS_STOP_MAP_ITEMS_PRELOAD_SUPPORTED"),
        ADDITIONAL_TAB(38, "additionalTab"),
        ADDITIONAL_TAB_POSITION(39, "additionalTabPosition"),
        MAX__ZOOM__FOR__SUBWAY__LAYER(40, "MAX_ZOOM_FOR_SUBWAY_LAYER"),
        MIN__ZOOM__FOR__SUBWAY__LAYER(41, "MIN_ZOOM_FOR_SUBWAY_LAYER"),
        MAP__IMPL__TYPE(42, "MAP_IMPL_TYPE"),
        MIN__ARRIVALS__TO__RETRIEVE(43, "MIN_ARRIVALS_TO_RETRIEVE"),
        MINUTES__CONSIDER__ARRIVALS(44, "MINUTES_CONSIDER_ARRIVALS"),
        IS__STOP__EDITING__SUPPORTED(45, "IS_STOP_EDITING_SUPPORTED"),
        SEARCH__LAST__INTERVAL__IN__SECONDS(46, "SEARCH_LAST_INTERVAL_IN_SECONDS"),
        SHOW__NEW__ITINERARIES__HINT(47, "SHOW_NEW_ITINERARIES_HINT"),
        TOP_UP_TEXT(48, "TopUpText"),
        CAR_POOL_ATTRIBUTION_IMAGE_URL(49, "CarPoolAttributionImageUrl"),
        CAR_POOL_ATTRIBUTION_TEXT(50, "CarPoolAttributionText"),
        MAP__IMPL__TYPE__V5(51, "MAP_IMPL_TYPE_V5"),
        NEAR_ME_FAVORITE_STOP_DETAIL_MAX_LINES(52, "near_me_favorite_stop_detail_max_lines"),
        IS_TRIP_PLAN_CAR_POOL_EXPERIMENT_ON(53, "is_trip_plan_car_pool_experiment_on"),
        IS_INTERSTITIAL_ADS_SUPPORTED(54, "isInterstitialAdsSupported"),
        PCT__OF__SERVER__LOG(55, "PCT_OF_SERVER_LOG"),
        USE__SERVER__FOR__FORWARD__GEOCODE(56, "USE_SERVER_FOR_FORWARD_GEOCODE"),
        ACTIVE__PROFILER__PCT(57, "ACTIVE_PROFILER_PCT"),
        CAR_POOL_REFERRAL_INDICATION(58, "carPoolReferralIndication"),
        NEAR__ME__RT__ENABLED(59, "NEAR_ME_RT_ENABLED"),
        IS__USER__REPORTS__ENABLED(60, "IS_USER_REPORTS_ENABLED"),
        FG_WIFI_SCAN_SEC(61, "fgWifiScanSec"),
        FG_BEACON_SCAN_SEC(62, "fgBeaconScanSec"),
        IS_REPORT_METRICS(63, "isReportMetrics"),
        SHOW_COMMUNITY_SECTION(64, "showCommunitySection"),
        SHOW_RIDE_REQUEST_SECTION(65, "showRideRequestSection"),
        SEARCH_MAX_FUTURE_DAYS(66, "searchMaxFutureDays"),
        HOME_TABS(67, "homeTabs"),
        SERVICE_STATUS_CARD_IS_SUBWAY(68, "service_status_card_is_subway"),
        SECTIONS_ORDER(69, "sectionsOrder"),
        SCHEDULE_DISPLAY_EXPERIMENT(70, "scheduleDisplayExperiment"),
        IS__RIDE__SHARING__SUPPORT(71, "IS_RIDE_SHARING_SUPPORT"),
        IS__FREQUENCY__SUPPORTED(72, "IS_FREQUENCY_SUPPORTED"),
        IS__DOCKLESS__BIKES__SUPPORTED(73, "IS_DOCKLESS_BIKES_SUPPORTED"),
        IS__DOCKLESS__SCOOTERS__SUPPORTED(74, "IS_DOCKLESS_SCOOTERS_SUPPORTED"),
        IS__DOCKLESS__KICK__SCOOTERS__SUPPORTED(75, "IS_DOCKLESS_KICK_SCOOTERS_SUPPORTED"),
        IS__DOCKLESS__MOPED__SUPPORTED(76, "IS_DOCKLESS_MOPED_SUPPORTED"),
        GTFS__CONFIG__FILES(77, "GTFS_CONFIG_FILES"),
        GTFS__CONFIG__GRAPH__NUM__OF__DAYS(78, "GTFS_CONFIG_GRAPH_NUM_OF_DAYS"),
        GTFS__CONFIG__GRAPH__HOURS(79, "GTFS_CONFIG_GRAPH_HOURS"),
        SEARCH__LOCATIONS__DELAY(80, "SEARCH_LOCATIONS_DELAY"),
        TRIP__PLAN__PERSONALIZATION__POPUP__ENABLED(81, "TRIP_PLAN_PERSONALIZATION_POPUP_ENABLED"),
        SUGGESTED_ROUTES_CELL_IMPROVEMENTS_EXPERIMENT(82, "suggestedRoutesCellImprovementsExperiment"),
        HOME_WORK_EXPERIMENT(83, "homeWorkExperiment"),
        IS__PRIVATE__BIKE__SUPPORTED(84, "IS_PRIVATE_BIKE_SUPPORTED"),
        USE__GOOGLE__PLACES(85, "USE_GOOGLE_PLACES"),
        DASHBOARD__SECTIONS(86, "DASHBOARD_SECTIONS"),
        WAZE_CARPOOL_INSTALLATION_LINK(87, "wazeCarpoolInstallationLink"),
        WAZE_CARPOOL_DEEP_LINK(88, "wazeCarpoolDeepLink"),
        IS__TICKETING__V2__SUPPORTED(90, "IS_TICKETING_V2_SUPPORTED"),
        AR_EXPERIMENT(91, "arExperiment"),
        ITINERARY_QUICK_ACTIONS(92, "itineraryQuickActions"),
        LINE_VIEW_QUICK_ACTIONS(93, "lineViewQuickActions"),
        STOP_VIEW_QUICK_ACTIONS(94, "stopViewQuickActions"),
        ONBOARDING_FAVORITES_TESTING_GROUP(95, "onboardingFavoritesTestingGroup"),
        SEARCH_EXAMPLES_AB_TESTING_GROUP(96, "searchExamplesAbTestingGroup"),
        SEARCH_LOCATION_HINT_ABTESTING_TYPE(97, "searchLocationHintABTestingType"),
        MAIN_SEARCH_BUTTON_ABTESTING_GROUP(98, "mainSearchButtonABTestingGroup"),
        MV_USER_PROFILE_ACCESSIBILITY_PREF(99, "mvUserProfileAccessibilityPref"),
        ADS_CONSENT_LAYOUT_ABTEST_GROUP(100, "adsConsentLayoutABTestGroup"),
        SUBSCRIPTION_ABTEST_GROUP(101, "subscriptionABTestGroup"),
        BANNER_DESIGN_ABTEST_GROUP(102, "bannerDesignABTestGroup"),
        ATT_PERMISSIONS_ABTESTING_GROUP(103, "attPermissionsABTestingGroup"),
        DIRECT_TO_ITINERARY_ABTEST_GROUP(104, "directToItineraryABTestGroup"),
        SMART_COMPONENT_RANDOM_ABTESTING_GROUP(105, "smartComponentRandomABTestingGroup"),
        LINE_VIEW_WALKTHROUGH_ABTESTING_GROUP(106, "lineViewWalkthroughABTestingGroup");
        
        private static final Map<String, _Fields> byName = null;
        private final String _fieldName;
        private final short _thriftId;

        /* access modifiers changed from: public */
        static {
            byName = new HashMap();
            Iterator<E> it = EnumSet.allOf(_Fields.class).iterator();
            while (it.hasNext()) {
                _Fields _fields = (_Fields) it.next();
                byName.put(_fields.getFieldName(), _fields);
            }
        }

        private _Fields(short s, String str) {
            this._thriftId = s;
            this._fieldName = str;
        }

        public static _Fields findByName(String str) {
            return byName.get(str);
        }

        public static _Fields findByThriftId(int i) {
            switch (i) {
                case 1:
                    return LATEST_APP_VERSION_CODE;
                case 2:
                    return DEFAULT_TRIP_PLAN_OPTION;
                case 3:
                    return TWITTER_POST_ACTIVITY_NAMES;
                case 4:
                    return LATEST_RELEASE_I_PHONE;
                case 5:
                    return LATEST_RELEASE_ANDROID;
                case 6:
                    return WHATS_NEW_URL_I_PHONE;
                case 7:
                    return WHATS_NEW_URL_ANDROID;
                case 8:
                    return FEED_BACK_EMAIL_ADDRESS;
                case 9:
                    return USE__MOOVIT__TILES;
                case 10:
                    return MOOVIT__TILES__URL;
                case 11:
                    return NEAR_ME_DEFAULT_STOP_RADIUS;
                case 12:
                    return NEAR_ME_DEFAULT_STOP_DETAIL_RADIUS;
                case 13:
                    return NEAR_ME_DEFAULT_STOP_DETAIL_MAX_LINES;
                case 14:
                    return NEAR_ME_MAP_SENSITIVITY;
                case 15:
                    return WALKING_SPEED_FACTOR;
                case 16:
                    return DEFAULT__INTERMEDIATE__DURATION;
                case 17:
                    return TIME__DELTA__UPDATES;
                case 18:
                    return DISTANCE__DELTA__UPDATES;
                case 19:
                    return SCHEDULE__TIME__JOIN__RT__GTFS__SECONDS;
                case 20:
                    return IS__TAXI__SUPPORT;
                case 21:
                    return HAS__MAP__CAMPAIGNS;
                case 22:
                    return SUPPORT__SERVICE__ALERTS__TAB;
                case 23:
                    return STOP__GAME__ENABLED;
                case 24:
                    return IS_LOCATION_TRIGGERS_ENABLE;
                case 25:
                    return IS_TOPUP_TAB_ENABLE;
                case 26:
                    return LOCATION_TRIGGER_DWELL_DELAY_SEC;
                case 27:
                    return LOCATION_TRIGGER_GEOFENCE_RADIUS_METERS;
                case 28:
                    return IS__BIKE__SHARING__SUPPORT;
                case 29:
                    return IS__CAR__SHARING__SUPPORT;
                case 30:
                    return IS__CAR__POOL__SUPPORT;
                case 31:
                    return USE__ROLLOUT;
                case 32:
                    return IS__TRIP__PLAN__RATING__SUPPORT;
                case 33:
                    return TOPUP_TAB_LINK;
                case 34:
                    return IS__ADS__SUPPORT;
                case 35:
                    return SUBWAY__LAYER__URL;
                case 36:
                    return PATHWAY__LAYERS__URL;
                case 37:
                    return IS__STOP__MAP__ITEMS__PRELOAD__SUPPORTED;
                case 38:
                    return ADDITIONAL_TAB;
                case 39:
                    return ADDITIONAL_TAB_POSITION;
                case 40:
                    return MAX__ZOOM__FOR__SUBWAY__LAYER;
                case 41:
                    return MIN__ZOOM__FOR__SUBWAY__LAYER;
                case 42:
                    return MAP__IMPL__TYPE;
                case 43:
                    return MIN__ARRIVALS__TO__RETRIEVE;
                case 44:
                    return MINUTES__CONSIDER__ARRIVALS;
                case 45:
                    return IS__STOP__EDITING__SUPPORTED;
                case 46:
                    return SEARCH__LAST__INTERVAL__IN__SECONDS;
                case 47:
                    return SHOW__NEW__ITINERARIES__HINT;
                case 48:
                    return TOP_UP_TEXT;
                case 49:
                    return CAR_POOL_ATTRIBUTION_IMAGE_URL;
                case 50:
                    return CAR_POOL_ATTRIBUTION_TEXT;
                case 51:
                    return MAP__IMPL__TYPE__V5;
                case 52:
                    return NEAR_ME_FAVORITE_STOP_DETAIL_MAX_LINES;
                case 53:
                    return IS_TRIP_PLAN_CAR_POOL_EXPERIMENT_ON;
                case 54:
                    return IS_INTERSTITIAL_ADS_SUPPORTED;
                case 55:
                    return PCT__OF__SERVER__LOG;
                case 56:
                    return USE__SERVER__FOR__FORWARD__GEOCODE;
                case 57:
                    return ACTIVE__PROFILER__PCT;
                case 58:
                    return CAR_POOL_REFERRAL_INDICATION;
                case 59:
                    return NEAR__ME__RT__ENABLED;
                case 60:
                    return IS__USER__REPORTS__ENABLED;
                case 61:
                    return FG_WIFI_SCAN_SEC;
                case 62:
                    return FG_BEACON_SCAN_SEC;
                case 63:
                    return IS_REPORT_METRICS;
                case 64:
                    return SHOW_COMMUNITY_SECTION;
                case 65:
                    return SHOW_RIDE_REQUEST_SECTION;
                case 66:
                    return SEARCH_MAX_FUTURE_DAYS;
                case 67:
                    return HOME_TABS;
                case 68:
                    return SERVICE_STATUS_CARD_IS_SUBWAY;
                case 69:
                    return SECTIONS_ORDER;
                case 70:
                    return SCHEDULE_DISPLAY_EXPERIMENT;
                case 71:
                    return IS__RIDE__SHARING__SUPPORT;
                case 72:
                    return IS__FREQUENCY__SUPPORTED;
                case 73:
                    return IS__DOCKLESS__BIKES__SUPPORTED;
                case 74:
                    return IS__DOCKLESS__SCOOTERS__SUPPORTED;
                case 75:
                    return IS__DOCKLESS__KICK__SCOOTERS__SUPPORTED;
                case 76:
                    return IS__DOCKLESS__MOPED__SUPPORTED;
                case 77:
                    return GTFS__CONFIG__FILES;
                case 78:
                    return GTFS__CONFIG__GRAPH__NUM__OF__DAYS;
                case 79:
                    return GTFS__CONFIG__GRAPH__HOURS;
                case 80:
                    return SEARCH__LOCATIONS__DELAY;
                case 81:
                    return TRIP__PLAN__PERSONALIZATION__POPUP__ENABLED;
                case 82:
                    return SUGGESTED_ROUTES_CELL_IMPROVEMENTS_EXPERIMENT;
                case 83:
                    return HOME_WORK_EXPERIMENT;
                case 84:
                    return IS__PRIVATE__BIKE__SUPPORTED;
                case 85:
                    return USE__GOOGLE__PLACES;
                case 86:
                    return DASHBOARD__SECTIONS;
                case 87:
                    return WAZE_CARPOOL_INSTALLATION_LINK;
                case 88:
                    return WAZE_CARPOOL_DEEP_LINK;
                case 90:
                    return IS__TICKETING__V2__SUPPORTED;
                case 91:
                    return AR_EXPERIMENT;
                case 92:
                    return ITINERARY_QUICK_ACTIONS;
                case 93:
                    return LINE_VIEW_QUICK_ACTIONS;
                case 94:
                    return STOP_VIEW_QUICK_ACTIONS;
                case 95:
                    return ONBOARDING_FAVORITES_TESTING_GROUP;
                case 96:
                    return SEARCH_EXAMPLES_AB_TESTING_GROUP;
                case 97:
                    return SEARCH_LOCATION_HINT_ABTESTING_TYPE;
                case 98:
                    return MAIN_SEARCH_BUTTON_ABTESTING_GROUP;
                case 99:
                    return MV_USER_PROFILE_ACCESSIBILITY_PREF;
                case 100:
                    return ADS_CONSENT_LAYOUT_ABTEST_GROUP;
                case 101:
                    return SUBSCRIPTION_ABTEST_GROUP;
                case 102:
                    return BANNER_DESIGN_ABTEST_GROUP;
                case 103:
                    return ATT_PERMISSIONS_ABTESTING_GROUP;
                case 104:
                    return DIRECT_TO_ITINERARY_ABTEST_GROUP;
                case 105:
                    return SMART_COMPONENT_RANDOM_ABTESTING_GROUP;
                case 106:
                    return LINE_VIEW_WALKTHROUGH_ABTESTING_GROUP;
                default:
                    return null;
            }
        }

        public static _Fields findByThriftIdOrThrow(int i) {
            _Fields findByThriftId = findByThriftId(i);
            if (findByThriftId != null) {
                return findByThriftId;
            }
            throw new IllegalArgumentException(C25541a.m63878h("Field ", i, " doesn't exist!"));
        }

        public String getFieldName() {
            return this._fieldName;
        }

        public short getThriftFieldId() {
            return this._thriftId;
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.conf.MVConfiguration$a */
    public static class C8517a extends C25239c<MVConfiguration> {
        public C8517a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVConfiguration mVConfiguration = (MVConfiguration) tBase;
            mVConfiguration.getClass();
            C25113c cVar = MVConfiguration.f25236b;
            gVar.mo61687K();
            gVar.mo61711x(MVConfiguration.f25236b);
            gVar.mo61678B(mVConfiguration.latestAppVersionCode);
            gVar.mo61712y();
            if (mVConfiguration.defaultTripPlanOption != null) {
                gVar.mo61711x(MVConfiguration.f25238c);
                gVar.mo61678B(mVConfiguration.defaultTripPlanOption.getValue());
                gVar.mo61712y();
            }
            if (mVConfiguration.twitterPostActivityNames != null) {
                gVar.mo61711x(MVConfiguration.f25240d);
                gVar.mo61680D(new C25119e((byte) 11, mVConfiguration.twitterPostActivityNames.size()));
                for (String J : mVConfiguration.twitterPostActivityNames) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVConfiguration.latestRelease_iPhone != null) {
                gVar.mo61711x(MVConfiguration.f25242e);
                gVar.mo61686J(mVConfiguration.latestRelease_iPhone);
                gVar.mo61712y();
            }
            if (mVConfiguration.latestRelease_android != null) {
                gVar.mo61711x(MVConfiguration.f25244f);
                gVar.mo61686J(mVConfiguration.latestRelease_android);
                gVar.mo61712y();
            }
            if (mVConfiguration.whatsNewURL_iPhone != null) {
                gVar.mo61711x(MVConfiguration.f25246g);
                gVar.mo61686J(mVConfiguration.whatsNewURL_iPhone);
                gVar.mo61712y();
            }
            if (mVConfiguration.whatsNewURL_android != null) {
                gVar.mo61711x(MVConfiguration.f25248h);
                gVar.mo61686J(mVConfiguration.whatsNewURL_android);
                gVar.mo61712y();
            }
            if (mVConfiguration.feedBackEmailAddress != null) {
                gVar.mo61711x(MVConfiguration.f25250i);
                gVar.mo61686J(mVConfiguration.feedBackEmailAddress);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVConfiguration.f25252j);
            gVar.mo61708u(mVConfiguration.USE_MOOVIT_TILES);
            gVar.mo61712y();
            if (mVConfiguration.MOOVIT_TILES_URL != null) {
                gVar.mo61711x(MVConfiguration.f25254k);
                gVar.mo61686J(mVConfiguration.MOOVIT_TILES_URL);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVConfiguration.f25256l);
            gVar.mo61678B(mVConfiguration.near_me_default_stop_radius);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25259m);
            gVar.mo61678B(mVConfiguration.near_me_default_stop_detail_radius);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25262n);
            gVar.mo61678B(mVConfiguration.near_me_default_stop_detail_max_lines);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25265o);
            gVar.mo61678B(mVConfiguration.near_me_map_sensitivity);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25268p);
            gVar.mo61710w(mVConfiguration.walking_speed_factor);
            gVar.mo61712y();
            if (mVConfiguration.DEFAULT_INTERMEDIATE_DURATION != null) {
                gVar.mo61711x(MVConfiguration.f25271q);
                gVar.mo61686J(mVConfiguration.DEFAULT_INTERMEDIATE_DURATION);
                gVar.mo61712y();
            }
            if (mVConfiguration.TIME_DELTA_UPDATES != null) {
                gVar.mo61711x(MVConfiguration.f25274r);
                gVar.mo61686J(mVConfiguration.TIME_DELTA_UPDATES);
                gVar.mo61712y();
            }
            if (mVConfiguration.DISTANCE_DELTA_UPDATES != null) {
                gVar.mo61711x(MVConfiguration.f25276s);
                gVar.mo61686J(mVConfiguration.DISTANCE_DELTA_UPDATES);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVConfiguration.f25278t);
            gVar.mo61678B(mVConfiguration.SCHEDULE_TIME_JOIN_RT_GTFS_SECONDS);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25280u);
            gVar.mo61708u(mVConfiguration.IS_TAXI_SUPPORT);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25282v);
            gVar.mo61708u(mVConfiguration.HAS_MAP_CAMPAIGNS);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25284w);
            gVar.mo61708u(mVConfiguration.SUPPORT_SERVICE_ALERTS_TAB);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25286x);
            gVar.mo61708u(mVConfiguration.STOP_GAME_ENABLED);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25288y);
            gVar.mo61708u(mVConfiguration.is_location_triggers_enable);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25290z);
            gVar.mo61708u(mVConfiguration.is_topup_tab_enable);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25185A);
            gVar.mo61678B(mVConfiguration.location_trigger_dwell_delay_sec);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25187B);
            gVar.mo61678B(mVConfiguration.location_trigger_geofence_radius_meters);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25189C);
            gVar.mo61708u(mVConfiguration.IS_BIKE_SHARING_SUPPORT);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25191D);
            gVar.mo61708u(mVConfiguration.IS_CAR_SHARING_SUPPORT);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25193E);
            gVar.mo61708u(mVConfiguration.IS_CAR_POOL_SUPPORT);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25195F);
            gVar.mo61708u(mVConfiguration.USE_ROLLOUT);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25197G);
            gVar.mo61708u(mVConfiguration.IS_TRIP_PLAN_RATING_SUPPORT);
            gVar.mo61712y();
            if (mVConfiguration.topup_tab_link != null) {
                gVar.mo61711x(MVConfiguration.f25199H);
                gVar.mo61686J(mVConfiguration.topup_tab_link);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVConfiguration.f25201I);
            gVar.mo61708u(mVConfiguration.IS_ADS_SUPPORT);
            gVar.mo61712y();
            if (mVConfiguration.SUBWAY_LAYER_URL != null) {
                gVar.mo61711x(MVConfiguration.f25203J);
                gVar.mo61686J(mVConfiguration.SUBWAY_LAYER_URL);
                gVar.mo61712y();
            }
            if (mVConfiguration.PATHWAY_LAYERS_URL != null) {
                gVar.mo61711x(MVConfiguration.f25205K);
                gVar.mo61686J(mVConfiguration.PATHWAY_LAYERS_URL);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVConfiguration.f25207L);
            gVar.mo61708u(mVConfiguration.IS_STOP_MAP_ITEMS_PRELOAD_SUPPORTED);
            gVar.mo61712y();
            if (mVConfiguration.additionalTab != null) {
                gVar.mo61711x(MVConfiguration.f25209M);
                gVar.mo61678B(mVConfiguration.additionalTab.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVConfiguration.f25211N);
            gVar.mo61678B(mVConfiguration.additionalTabPosition);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25213O);
            gVar.mo61677A(mVConfiguration.MAX_ZOOM_FOR_SUBWAY_LAYER);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25215P);
            gVar.mo61677A(mVConfiguration.MIN_ZOOM_FOR_SUBWAY_LAYER);
            gVar.mo61712y();
            if (mVConfiguration.MAP_IMPL_TYPE != null) {
                gVar.mo61711x(MVConfiguration.f25217Q);
                gVar.mo61678B(mVConfiguration.MAP_IMPL_TYPE.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVConfiguration.f25219R);
            gVar.mo61678B(mVConfiguration.MIN_ARRIVALS_TO_RETRIEVE);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25221S);
            gVar.mo61678B(mVConfiguration.MINUTES_CONSIDER_ARRIVALS);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25223T);
            gVar.mo61708u(mVConfiguration.IS_STOP_EDITING_SUPPORTED);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25225U);
            gVar.mo61678B(mVConfiguration.SEARCH_LAST_INTERVAL_IN_SECONDS);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25229X);
            gVar.mo61708u(mVConfiguration.SHOW_NEW_ITINERARIES_HINT);
            gVar.mo61712y();
            if (mVConfiguration.TopUpText != null) {
                gVar.mo61711x(MVConfiguration.f25231Y);
                gVar.mo61686J(mVConfiguration.TopUpText);
                gVar.mo61712y();
            }
            if (mVConfiguration.CarPoolAttributionImageUrl != null) {
                gVar.mo61711x(MVConfiguration.f25233Z);
                gVar.mo61686J(mVConfiguration.CarPoolAttributionImageUrl);
                gVar.mo61712y();
            }
            if (mVConfiguration.CarPoolAttributionText != null) {
                gVar.mo61711x(MVConfiguration.f25257l0);
                gVar.mo61686J(mVConfiguration.CarPoolAttributionText);
                gVar.mo61712y();
            }
            if (mVConfiguration.MAP_IMPL_TYPE_V5 != null) {
                gVar.mo61711x(MVConfiguration.f25260m0);
                gVar.mo61678B(mVConfiguration.MAP_IMPL_TYPE_V5.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVConfiguration.f25263n0);
            gVar.mo61678B(mVConfiguration.near_me_favorite_stop_detail_max_lines);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25266o0);
            gVar.mo61708u(mVConfiguration.is_trip_plan_car_pool_experiment_on);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25269p0);
            gVar.mo61708u(mVConfiguration.isInterstitialAdsSupported);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25272q0);
            gVar.mo61678B(mVConfiguration.PCT_OF_SERVER_LOG);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25275r0);
            gVar.mo61708u(mVConfiguration.USE_SERVER_FOR_FORWARD_GEOCODE);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25277s0);
            gVar.mo61678B(mVConfiguration.ACTIVE_PROFILER_PCT);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25279t0);
            gVar.mo61708u(mVConfiguration.carPoolReferralIndication);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25281u0);
            gVar.mo61708u(mVConfiguration.NEAR_ME_RT_ENABLED);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25283v0);
            gVar.mo61708u(mVConfiguration.IS_USER_REPORTS_ENABLED);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25285w0);
            gVar.mo61678B(mVConfiguration.fgWifiScanSec);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25287x0);
            gVar.mo61678B(mVConfiguration.fgBeaconScanSec);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25289y0);
            gVar.mo61708u(mVConfiguration.isReportMetrics);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25291z0);
            gVar.mo61708u(mVConfiguration.showCommunitySection);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25186A0);
            gVar.mo61708u(mVConfiguration.showRideRequestSection);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25188B0);
            gVar.mo61678B(mVConfiguration.searchMaxFutureDays);
            gVar.mo61712y();
            if (mVConfiguration.homeTabs != null) {
                gVar.mo61711x(MVConfiguration.f25190C0);
                gVar.mo61680D(new C25119e((byte) 8, mVConfiguration.homeTabs.size()));
                for (MVHomeTab value : mVConfiguration.homeTabs) {
                    gVar.mo61678B(value.getValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVConfiguration.f25192D0);
            gVar.mo61708u(mVConfiguration.service_status_card_is_subway);
            gVar.mo61712y();
            if (mVConfiguration.sectionsOrder != null) {
                gVar.mo61711x(MVConfiguration.f25194E0);
                gVar.mo61680D(new C25119e((byte) 8, mVConfiguration.sectionsOrder.size()));
                for (MVSingleTabSection value2 : mVConfiguration.sectionsOrder) {
                    gVar.mo61678B(value2.getValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVConfiguration.scheduleDisplayExperiment != null && mVConfiguration.mo26512O0()) {
                gVar.mo61711x(MVConfiguration.f25196F0);
                gVar.mo61678B(mVConfiguration.scheduleDisplayExperiment.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVConfiguration.f25198G0);
            gVar.mo61708u(mVConfiguration.IS_RIDE_SHARING_SUPPORT);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25200H0);
            gVar.mo61708u(mVConfiguration.IS_FREQUENCY_SUPPORTED);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25202I0);
            gVar.mo61708u(mVConfiguration.IS_DOCKLESS_BIKES_SUPPORTED);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25204J0);
            gVar.mo61708u(mVConfiguration.IS_DOCKLESS_SCOOTERS_SUPPORTED);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25206K0);
            gVar.mo61708u(mVConfiguration.IS_DOCKLESS_KICK_SCOOTERS_SUPPORTED);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25208L0);
            gVar.mo61708u(mVConfiguration.IS_DOCKLESS_MOPED_SUPPORTED);
            gVar.mo61712y();
            if (mVConfiguration.GTFS_CONFIG_FILES != null) {
                gVar.mo61711x(MVConfiguration.f25210M0);
                gVar.mo61686J(mVConfiguration.GTFS_CONFIG_FILES);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVConfiguration.f25212N0);
            gVar.mo61678B(mVConfiguration.GTFS_CONFIG_GRAPH_NUM_OF_DAYS);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25214O0);
            gVar.mo61678B(mVConfiguration.GTFS_CONFIG_GRAPH_HOURS);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25216P0);
            gVar.mo61678B(mVConfiguration.SEARCH_LOCATIONS_DELAY);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25218Q0);
            gVar.mo61708u(mVConfiguration.TRIP_PLAN_PERSONALIZATION_POPUP_ENABLED);
            gVar.mo61712y();
            if (mVConfiguration.suggestedRoutesCellImprovementsExperiment != null) {
                gVar.mo61711x(MVConfiguration.f25220R0);
                gVar.mo61678B(mVConfiguration.suggestedRoutesCellImprovementsExperiment.getValue());
                gVar.mo61712y();
            }
            if (mVConfiguration.homeWorkExperiment != null) {
                gVar.mo61711x(MVConfiguration.f25222S0);
                gVar.mo61678B(mVConfiguration.homeWorkExperiment.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVConfiguration.f25224T0);
            gVar.mo61708u(mVConfiguration.IS_PRIVATE_BIKE_SUPPORTED);
            gVar.mo61712y();
            gVar.mo61711x(MVConfiguration.f25226U0);
            gVar.mo61708u(mVConfiguration.USE_GOOGLE_PLACES);
            gVar.mo61712y();
            if (mVConfiguration.DASHBOARD_SECTIONS != null) {
                gVar.mo61711x(MVConfiguration.f25227V0);
                gVar.mo61680D(new C25119e((byte) 8, mVConfiguration.DASHBOARD_SECTIONS.size()));
                for (MVDashboardSection value3 : mVConfiguration.DASHBOARD_SECTIONS) {
                    gVar.mo61678B(value3.getValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVConfiguration.wazeCarpoolInstallationLink != null) {
                gVar.mo61711x(MVConfiguration.f25228W0);
                gVar.mo61686J(mVConfiguration.wazeCarpoolInstallationLink);
                gVar.mo61712y();
            }
            if (mVConfiguration.wazeCarpoolDeepLink != null) {
                gVar.mo61711x(MVConfiguration.f25230X0);
                gVar.mo61686J(mVConfiguration.wazeCarpoolDeepLink);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVConfiguration.f25232Y0);
            gVar.mo61708u(mVConfiguration.IS_TICKETING_V2_SUPPORTED);
            gVar.mo61712y();
            if (mVConfiguration.arExperiment != null) {
                gVar.mo61711x(MVConfiguration.f25234Z0);
                gVar.mo61678B(mVConfiguration.arExperiment.getValue());
                gVar.mo61712y();
            }
            if (mVConfiguration.itineraryQuickActions != null) {
                gVar.mo61711x(MVConfiguration.f25235a1);
                gVar.mo61680D(new C25119e((byte) 8, mVConfiguration.itineraryQuickActions.size()));
                for (MVItineraryQuickAction value4 : mVConfiguration.itineraryQuickActions) {
                    gVar.mo61678B(value4.getValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVConfiguration.lineViewQuickActions != null) {
                gVar.mo61711x(MVConfiguration.f25237b1);
                gVar.mo61680D(new C25119e((byte) 8, mVConfiguration.lineViewQuickActions.size()));
                for (MVLineViewQuickAction value5 : mVConfiguration.lineViewQuickActions) {
                    gVar.mo61678B(value5.getValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVConfiguration.stopViewQuickActions != null) {
                gVar.mo61711x(MVConfiguration.f25239c1);
                gVar.mo61680D(new C25119e((byte) 8, mVConfiguration.stopViewQuickActions.size()));
                for (MVStopViewQuickAction value6 : mVConfiguration.stopViewQuickActions) {
                    gVar.mo61678B(value6.getValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVConfiguration.onboardingFavoritesTestingGroup != null) {
                gVar.mo61711x(MVConfiguration.f25241d1);
                gVar.mo61678B(mVConfiguration.onboardingFavoritesTestingGroup.getValue());
                gVar.mo61712y();
            }
            if (mVConfiguration.searchExamplesAbTestingGroup != null) {
                gVar.mo61711x(MVConfiguration.f25243e1);
                gVar.mo61678B(mVConfiguration.searchExamplesAbTestingGroup.getValue());
                gVar.mo61712y();
            }
            if (mVConfiguration.searchLocationHintABTestingType != null) {
                gVar.mo61711x(MVConfiguration.f25245f1);
                gVar.mo61678B(mVConfiguration.searchLocationHintABTestingType.getValue());
                gVar.mo61712y();
            }
            if (mVConfiguration.mainSearchButtonABTestingGroup != null) {
                gVar.mo61711x(MVConfiguration.f25247g1);
                gVar.mo61678B(mVConfiguration.mainSearchButtonABTestingGroup.getValue());
                gVar.mo61712y();
            }
            if (mVConfiguration.mvUserProfileAccessibilityPref != null) {
                gVar.mo61711x(MVConfiguration.f25249h1);
                gVar.mo61678B(mVConfiguration.mvUserProfileAccessibilityPref.getValue());
                gVar.mo61712y();
            }
            if (mVConfiguration.adsConsentLayoutABTestGroup != null) {
                gVar.mo61711x(MVConfiguration.f25251i1);
                gVar.mo61678B(mVConfiguration.adsConsentLayoutABTestGroup.getValue());
                gVar.mo61712y();
            }
            if (mVConfiguration.subscriptionABTestGroup != null) {
                gVar.mo61711x(MVConfiguration.f25253j1);
                gVar.mo61678B(mVConfiguration.subscriptionABTestGroup.getValue());
                gVar.mo61712y();
            }
            if (mVConfiguration.bannerDesignABTestGroup != null) {
                gVar.mo61711x(MVConfiguration.f25255k1);
                gVar.mo61678B(mVConfiguration.bannerDesignABTestGroup.getValue());
                gVar.mo61712y();
            }
            if (mVConfiguration.attPermissionsABTestingGroup != null) {
                gVar.mo61711x(MVConfiguration.f25258l1);
                gVar.mo61678B(mVConfiguration.attPermissionsABTestingGroup.getValue());
                gVar.mo61712y();
            }
            if (mVConfiguration.directToItineraryABTestGroup != null) {
                gVar.mo61711x(MVConfiguration.f25261m1);
                gVar.mo61678B(mVConfiguration.directToItineraryABTestGroup.getValue());
                gVar.mo61712y();
            }
            if (mVConfiguration.smartComponentRandomABTestingGroup != null) {
                gVar.mo61711x(MVConfiguration.f25264n1);
                gVar.mo61678B(mVConfiguration.smartComponentRandomABTestingGroup.getValue());
                gVar.mo61712y();
            }
            if (mVConfiguration.lineViewWalkthroughABTestingGroup != null) {
                gVar.mo61711x(MVConfiguration.f25267o1);
                gVar.mo61678B(mVConfiguration.lineViewWalkthroughABTestingGroup.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVConfiguration mVConfiguration = (MVConfiguration) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVConfiguration.getClass();
                    return;
                }
                int i = 0;
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.latestAppVersionCode = gVar.mo61696i();
                            mVConfiguration.mo26535W1();
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.defaultTripPlanOption = MVTripPlanOption.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 3:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVConfiguration.twitterPostActivityNames = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                mVConfiguration.twitterPostActivityNames.add(gVar.mo61704q());
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.latestRelease_iPhone = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.latestRelease_android = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.whatsNewURL_iPhone = gVar.mo61704q();
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.whatsNewURL_android = gVar.mo61704q();
                            break;
                        }
                    case 8:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.feedBackEmailAddress = gVar.mo61704q();
                            break;
                        }
                    case 9:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.USE_MOOVIT_TILES = gVar.mo61690c();
                            mVConfiguration.mo26632w2();
                            break;
                        }
                    case 10:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.MOOVIT_TILES_URL = gVar.mo61704q();
                            break;
                        }
                    case 11:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.near_me_default_stop_radius = gVar.mo61696i();
                            mVConfiguration.mo26568g2();
                            break;
                        }
                    case 12:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.near_me_default_stop_detail_radius = gVar.mo61696i();
                            mVConfiguration.mo26564f2();
                            break;
                        }
                    case 13:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.near_me_default_stop_detail_max_lines = gVar.mo61696i();
                            mVConfiguration.mo26559e2();
                            break;
                        }
                    case 14:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.near_me_map_sensitivity = gVar.mo61696i();
                            mVConfiguration.mo26577i2();
                            break;
                        }
                    case 15:
                        if (b != 4) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.walking_speed_factor = gVar.mo61692e();
                            mVConfiguration.mo26642z2();
                            break;
                        }
                    case 16:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.DEFAULT_INTERMEDIATE_DURATION = gVar.mo61704q();
                            break;
                        }
                    case 17:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.TIME_DELTA_UPDATES = gVar.mo61704q();
                            break;
                        }
                    case 18:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.DISTANCE_DELTA_UPDATES = gVar.mo61704q();
                            break;
                        }
                    case 19:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.SCHEDULE_TIME_JOIN_RT_GTFS_SECONDS = gVar.mo61696i();
                            mVConfiguration.mo26585k2();
                            break;
                        }
                    case 20:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.IS_TAXI_SUPPORT = gVar.mo61690c();
                            mVConfiguration.mo26510N1();
                            break;
                        }
                    case 21:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.HAS_MAP_CAMPAIGNS = gVar.mo61690c();
                            mVConfiguration.mo26638y1();
                            break;
                        }
                    case 22:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.SUPPORT_SERVICE_ALERTS_TAB = gVar.mo61690c();
                            mVConfiguration.mo26603p2();
                            break;
                        }
                    case 23:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.STOP_GAME_ENABLED = gVar.mo61690c();
                            mVConfiguration.mo26599o2();
                            break;
                        }
                    case 24:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.is_location_triggers_enable = gVar.mo61690c();
                            mVConfiguration.mo26526T1();
                            break;
                        }
                    case 25:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.is_topup_tab_enable = gVar.mo61690c();
                            mVConfiguration.mo26529U1();
                            break;
                        }
                    case 26:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.location_trigger_dwell_delay_sec = gVar.mo61696i();
                            mVConfiguration.mo26537X1();
                            break;
                        }
                    case 27:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.location_trigger_geofence_radius_meters = gVar.mo61696i();
                            mVConfiguration.mo26540Y1();
                            break;
                        }
                    case 28:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.IS_BIKE_SHARING_SUPPORT = gVar.mo61690c();
                            mVConfiguration.mo26476A1();
                            break;
                        }
                    case 29:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.IS_CAR_SHARING_SUPPORT = gVar.mo61690c();
                            mVConfiguration.mo26482D1();
                            break;
                        }
                    case 30:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.IS_CAR_POOL_SUPPORT = gVar.mo61690c();
                            mVConfiguration.mo26478B1();
                            break;
                        }
                    case 31:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.USE_ROLLOUT = gVar.mo61690c();
                            mVConfiguration.mo26635x2();
                            break;
                        }
                    case 32:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.IS_TRIP_PLAN_RATING_SUPPORT = gVar.mo61690c();
                            mVConfiguration.mo26516P1();
                            break;
                        }
                    case 33:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.topup_tab_link = gVar.mo61704q();
                            break;
                        }
                    case 34:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.IS_ADS_SUPPORT = gVar.mo61690c();
                            mVConfiguration.mo26641z1();
                            break;
                        }
                    case 35:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.SUBWAY_LAYER_URL = gVar.mo61704q();
                            break;
                        }
                    case 36:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.PATHWAY_LAYERS_URL = gVar.mo61704q();
                            break;
                        }
                    case 37:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.IS_STOP_MAP_ITEMS_PRELOAD_SUPPORTED = gVar.mo61690c();
                            mVConfiguration.mo26507M1();
                            break;
                        }
                    case 38:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.additionalTab = MVAdditionalTab.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 39:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.additionalTabPosition = gVar.mo61696i();
                            mVConfiguration.mo26614s1();
                            break;
                        }
                    case 40:
                        if (b != 6) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.MAX_ZOOM_FOR_SUBWAY_LAYER = gVar.mo61695h();
                            mVConfiguration.mo26543Z1();
                            break;
                        }
                    case 41:
                        if (b != 6) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.MIN_ZOOM_FOR_SUBWAY_LAYER = gVar.mo61695h();
                            mVConfiguration.mo26552c2();
                            break;
                        }
                    case 42:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.MAP_IMPL_TYPE = MVMapImplType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 43:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.MIN_ARRIVALS_TO_RETRIEVE = gVar.mo61696i();
                            mVConfiguration.mo26549b2();
                            break;
                        }
                    case 44:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.MINUTES_CONSIDER_ARRIVALS = gVar.mo61696i();
                            mVConfiguration.mo26546a2();
                            break;
                        }
                    case 45:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.IS_STOP_EDITING_SUPPORTED = gVar.mo61690c();
                            mVConfiguration.mo26504L1();
                            break;
                        }
                    case 46:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.SEARCH_LAST_INTERVAL_IN_SECONDS = gVar.mo61696i();
                            mVConfiguration.mo26589l2();
                            break;
                        }
                    case 47:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.SHOW_NEW_ITINERARIES_HINT = gVar.mo61690c();
                            mVConfiguration.mo26595n2();
                            break;
                        }
                    case 48:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.TopUpText = gVar.mo61704q();
                            break;
                        }
                    case 49:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.CarPoolAttributionImageUrl = gVar.mo61704q();
                            break;
                        }
                    case 50:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.CarPoolAttributionText = gVar.mo61704q();
                            break;
                        }
                    case 51:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.MAP_IMPL_TYPE_V5 = MVMapImplType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 52:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.near_me_favorite_stop_detail_max_lines = gVar.mo61696i();
                            mVConfiguration.mo26572h2();
                            break;
                        }
                    case 53:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.is_trip_plan_car_pool_experiment_on = gVar.mo61690c();
                            mVConfiguration.mo26532V1();
                            break;
                        }
                    case 54:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.isInterstitialAdsSupported = gVar.mo61690c();
                            mVConfiguration.mo26522R1();
                            break;
                        }
                    case 55:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.PCT_OF_SERVER_LOG = gVar.mo61696i();
                            mVConfiguration.mo26581j2();
                            break;
                        }
                    case 56:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.USE_SERVER_FOR_FORWARD_GEOCODE = gVar.mo61690c();
                            mVConfiguration.mo26639y2();
                            break;
                        }
                    case 57:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.ACTIVE_PROFILER_PCT = gVar.mo61696i();
                            mVConfiguration.mo26610r1();
                            break;
                        }
                    case 58:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.carPoolReferralIndication = gVar.mo61690c();
                            mVConfiguration.mo26618t1();
                            break;
                        }
                    case 59:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.NEAR_ME_RT_ENABLED = gVar.mo61690c();
                            mVConfiguration.mo26556d2();
                            break;
                        }
                    case 60:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.IS_USER_REPORTS_ENABLED = gVar.mo61690c();
                            mVConfiguration.mo26519Q1();
                            break;
                        }
                    case 61:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.fgWifiScanSec = gVar.mo61696i();
                            mVConfiguration.mo26627v1();
                            break;
                        }
                    case 62:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.fgBeaconScanSec = gVar.mo61696i();
                            mVConfiguration.mo26623u1();
                            break;
                        }
                    case 63:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.isReportMetrics = gVar.mo61690c();
                            mVConfiguration.mo26524S1();
                            break;
                        }
                    case 64:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.showCommunitySection = gVar.mo61690c();
                            mVConfiguration.mo26615s2();
                            break;
                        }
                    case 65:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.showRideRequestSection = gVar.mo61690c();
                            mVConfiguration.mo26619t2();
                            break;
                        }
                    case 66:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.searchMaxFutureDays = gVar.mo61696i();
                            mVConfiguration.mo26607q2();
                            break;
                        }
                    case 67:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k2 = gVar.mo61698k();
                            mVConfiguration.homeTabs = new ArrayList(k2.f63395b);
                            while (i < k2.f63395b) {
                                mVConfiguration.homeTabs.add(MVHomeTab.findByValue(gVar.mo61696i()));
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 68:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.service_status_card_is_subway = gVar.mo61690c();
                            mVConfiguration.mo26611r2();
                            break;
                        }
                    case 69:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k3 = gVar.mo61698k();
                            mVConfiguration.sectionsOrder = new ArrayList(k3.f63395b);
                            while (i < k3.f63395b) {
                                mVConfiguration.sectionsOrder.add(MVSingleTabSection.findByValue(gVar.mo61696i()));
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 70:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.scheduleDisplayExperiment = MVScheduleDisplayExperiment.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 71:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.IS_RIDE_SHARING_SUPPORT = gVar.mo61690c();
                            mVConfiguration.mo26501K1();
                            break;
                        }
                    case 72:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.IS_FREQUENCY_SUPPORTED = gVar.mo61690c();
                            mVConfiguration.mo26497I1();
                            break;
                        }
                    case 73:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.IS_DOCKLESS_BIKES_SUPPORTED = gVar.mo61690c();
                            mVConfiguration.mo26485E1();
                            break;
                        }
                    case 74:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.IS_DOCKLESS_SCOOTERS_SUPPORTED = gVar.mo61690c();
                            mVConfiguration.mo26494H1();
                            break;
                        }
                    case 75:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.IS_DOCKLESS_KICK_SCOOTERS_SUPPORTED = gVar.mo61690c();
                            mVConfiguration.mo26488F1();
                            break;
                        }
                    case 76:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.IS_DOCKLESS_MOPED_SUPPORTED = gVar.mo61690c();
                            mVConfiguration.mo26491G1();
                            break;
                        }
                    case 77:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.GTFS_CONFIG_FILES = gVar.mo61704q();
                            break;
                        }
                    case 78:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.GTFS_CONFIG_GRAPH_NUM_OF_DAYS = gVar.mo61696i();
                            mVConfiguration.mo26634x1();
                            break;
                        }
                    case 79:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.GTFS_CONFIG_GRAPH_HOURS = gVar.mo61696i();
                            mVConfiguration.mo26631w1();
                            break;
                        }
                    case 80:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.SEARCH_LOCATIONS_DELAY = gVar.mo61696i();
                            mVConfiguration.mo26592m2();
                            break;
                        }
                    case 81:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.TRIP_PLAN_PERSONALIZATION_POPUP_ENABLED = gVar.mo61690c();
                            mVConfiguration.mo26624u2();
                            break;
                        }
                    case 82:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.suggestedRoutesCellImprovementsExperiment = MVSuggestedRoutesCellImprovementsExperiment.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 83:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.homeWorkExperiment = MVHomeWorkExperiment.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 84:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.IS_PRIVATE_BIKE_SUPPORTED = gVar.mo61690c();
                            mVConfiguration.mo26500J1();
                            break;
                        }
                    case 85:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.USE_GOOGLE_PLACES = gVar.mo61690c();
                            mVConfiguration.mo26628v2();
                            break;
                        }
                    case 86:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k4 = gVar.mo61698k();
                            mVConfiguration.DASHBOARD_SECTIONS = new ArrayList(k4.f63395b);
                            while (i < k4.f63395b) {
                                mVConfiguration.DASHBOARD_SECTIONS.add(MVDashboardSection.findByValue(gVar.mo61696i()));
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 87:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.wazeCarpoolInstallationLink = gVar.mo61704q();
                            break;
                        }
                    case 88:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.wazeCarpoolDeepLink = gVar.mo61704q();
                            break;
                        }
                    case 90:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.IS_TICKETING_V2_SUPPORTED = gVar.mo61690c();
                            mVConfiguration.mo26513O1();
                            break;
                        }
                    case 91:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.arExperiment = MVARExperiment.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 92:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k5 = gVar.mo61698k();
                            mVConfiguration.itineraryQuickActions = new ArrayList(k5.f63395b);
                            while (i < k5.f63395b) {
                                mVConfiguration.itineraryQuickActions.add(MVItineraryQuickAction.findByValue(gVar.mo61696i()));
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 93:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k6 = gVar.mo61698k();
                            mVConfiguration.lineViewQuickActions = new ArrayList(k6.f63395b);
                            while (i < k6.f63395b) {
                                mVConfiguration.lineViewQuickActions.add(MVLineViewQuickAction.findByValue(gVar.mo61696i()));
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 94:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k7 = gVar.mo61698k();
                            mVConfiguration.stopViewQuickActions = new ArrayList(k7.f63395b);
                            while (i < k7.f63395b) {
                                mVConfiguration.stopViewQuickActions.add(MVStopViewQuickAction.findByValue(gVar.mo61696i()));
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 95:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.onboardingFavoritesTestingGroup = MVOnboardingFavoritesABTestingGroup.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 96:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.searchExamplesAbTestingGroup = MVSearchExamplesABTestGroup.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 97:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.searchLocationHintABTestingType = MVSearchLocationHintABTestingType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 98:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.mainSearchButtonABTestingGroup = MVMainSearchButtonABTestingGroup.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 99:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.mvUserProfileAccessibilityPref = MVUserProfileAccessibilityPref.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 100:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.adsConsentLayoutABTestGroup = MVAdsConsentLayoutABTestGroup.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 101:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.subscriptionABTestGroup = MVSubscriptionsABTestGroup.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 102:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.bannerDesignABTestGroup = MVBannerDesignABTestGroup.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 103:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.attPermissionsABTestingGroup = MVATTPermissionsABTestingGroup.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 104:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.directToItineraryABTestGroup = MVDirectToItineraryABTestGroup.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 105:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.smartComponentRandomABTestingGroup = MVSmartComponentRandomABTestingGroup.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 106:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVConfiguration.lineViewWalkthroughABTestingGroup = MVLineViewWalkthroughABTestingGroup.findByValue(gVar.mo61696i());
                            break;
                        }
                    default:
                        C25122h.m63098a(gVar, b);
                        break;
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.conf.MVConfiguration$b */
    public static class C8518b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8517a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.conf.MVConfiguration$c */
    public static class C8519c extends C25240d<MVConfiguration> {
        public C8519c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVConfiguration mVConfiguration = (MVConfiguration) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVConfiguration.mo26570h0()) {
                bitSet.set(0);
            }
            if (mVConfiguration.mo26616t()) {
                bitSet.set(1);
            }
            if (mVConfiguration.mo26567g1()) {
                bitSet.set(2);
            }
            if (mVConfiguration.mo26579j0()) {
                bitSet.set(3);
            }
            if (mVConfiguration.mo26575i0()) {
                bitSet.set(4);
            }
            if (mVConfiguration.mo26606q1()) {
                bitSet.set(5);
            }
            if (mVConfiguration.mo26602p1()) {
                bitSet.set(6);
            }
            if (mVConfiguration.mo26625v()) {
                bitSet.set(7);
            }
            if (mVConfiguration.mo26576i1()) {
                bitSet.set(8);
            }
            if (mVConfiguration.mo26622u0()) {
                bitSet.set(9);
            }
            if (mVConfiguration.mo26475A0()) {
                bitSet.set(10);
            }
            if (mVConfiguration.mo26640z0()) {
                bitSet.set(11);
            }
            if (mVConfiguration.mo26637y0()) {
                bitSet.set(12);
            }
            if (mVConfiguration.mo26479C0()) {
                bitSet.set(13);
            }
            if (mVConfiguration.mo26588l1()) {
                bitSet.set(14);
            }
            if (mVConfiguration.mo26608r()) {
                bitSet.set(15);
            }
            if (mVConfiguration.mo26551c1()) {
                bitSet.set(16);
            }
            if (mVConfiguration.mo26612s()) {
                bitSet.set(17);
            }
            if (mVConfiguration.mo26490G0()) {
                bitSet.set(18);
            }
            if (mVConfiguration.mo26536X()) {
                bitSet.set(19);
            }
            if (mVConfiguration.mo26486F()) {
                bitSet.set(20);
            }
            if (mVConfiguration.mo26509N0()) {
                bitSet.set(21);
            }
            if (mVConfiguration.mo26503L0()) {
                bitSet.set(22);
            }
            if (mVConfiguration.mo26554d0()) {
                bitSet.set(23);
            }
            if (mVConfiguration.mo26557e0()) {
                bitSet.set(24);
            }
            if (mVConfiguration.mo26591m0()) {
                bitSet.set(25);
            }
            if (mVConfiguration.mo26593n0()) {
                bitSet.set(26);
            }
            if (mVConfiguration.mo26498J()) {
                bitSet.set(27);
            }
            if (mVConfiguration.mo26505M()) {
                bitSet.set(28);
            }
            if (mVConfiguration.mo26502L()) {
                bitSet.set(29);
            }
            if (mVConfiguration.mo26580j1()) {
                bitSet.set(30);
            }
            if (mVConfiguration.mo26541Z()) {
                bitSet.set(31);
            }
            if (mVConfiguration.mo26563f1()) {
                bitSet.set(32);
            }
            if (mVConfiguration.mo26495I()) {
                bitSet.set(33);
            }
            if (mVConfiguration.mo26506M0()) {
                bitSet.set(34);
            }
            if (mVConfiguration.mo26484E0()) {
                bitSet.set(35);
            }
            if (mVConfiguration.mo26533W()) {
                bitSet.set(36);
            }
            if (mVConfiguration.mo26565g()) {
                bitSet.set(37);
            }
            if (mVConfiguration.mo26569h()) {
                bitSet.set(38);
            }
            if (mVConfiguration.mo26605q0()) {
                bitSet.set(39);
            }
            if (mVConfiguration.mo26617t0()) {
                bitSet.set(40);
            }
            if (mVConfiguration.mo26597o0()) {
                bitSet.set(41);
            }
            if (mVConfiguration.mo26613s0()) {
                bitSet.set(42);
            }
            if (mVConfiguration.mo26609r0()) {
                bitSet.set(43);
            }
            if (mVConfiguration.mo26530V()) {
                bitSet.set(44);
            }
            if (mVConfiguration.mo26493H0()) {
                bitSet.set(45);
            }
            if (mVConfiguration.mo26499J0()) {
                bitSet.set(46);
            }
            if (mVConfiguration.mo26558e1()) {
                bitSet.set(47);
            }
            if (mVConfiguration.mo26590m()) {
                bitSet.set(48);
            }
            if (mVConfiguration.mo26596o()) {
                bitSet.set(49);
            }
            if (mVConfiguration.mo26601p0()) {
                bitSet.set(50);
            }
            if (mVConfiguration.mo26477B0()) {
                bitSet.set(51);
            }
            if (mVConfiguration.mo26562f0()) {
                bitSet.set(52);
            }
            if (mVConfiguration.mo26547b0()) {
                bitSet.set(53);
            }
            if (mVConfiguration.mo26487F0()) {
                bitSet.set(54);
            }
            if (mVConfiguration.mo26584k1()) {
                bitSet.set(55);
            }
            if (mVConfiguration.mo26561f()) {
                bitSet.set(56);
            }
            if (mVConfiguration.mo26600p()) {
                bitSet.set(57);
            }
            if (mVConfiguration.mo26633x0()) {
                bitSet.set(58);
            }
            if (mVConfiguration.mo26544a0()) {
                bitSet.set(59);
            }
            if (mVConfiguration.mo26636y()) {
                bitSet.set(60);
            }
            if (mVConfiguration.mo26629w()) {
                bitSet.set(61);
            }
            if (mVConfiguration.mo26550c0()) {
                bitSet.set(62);
            }
            if (mVConfiguration.mo26531V0()) {
                bitSet.set(63);
            }
            if (mVConfiguration.mo26534W0()) {
                bitSet.set(64);
            }
            if (mVConfiguration.mo26521R0()) {
                bitSet.set(65);
            }
            if (mVConfiguration.mo26489G()) {
                bitSet.set(66);
            }
            if (mVConfiguration.mo26528U0()) {
                bitSet.set(67);
            }
            if (mVConfiguration.mo26525T0()) {
                bitSet.set(68);
            }
            if (mVConfiguration.mo26512O0()) {
                bitSet.set(69);
            }
            if (mVConfiguration.mo26527U()) {
                bitSet.set(70);
            }
            if (mVConfiguration.mo26520R()) {
                bitSet.set(71);
            }
            if (mVConfiguration.mo26508N()) {
                bitSet.set(72);
            }
            if (mVConfiguration.mo26517Q()) {
                bitSet.set(73);
            }
            if (mVConfiguration.mo26511O()) {
                bitSet.set(74);
            }
            if (mVConfiguration.mo26514P()) {
                bitSet.set(75);
            }
            if (mVConfiguration.mo26474A()) {
                bitSet.set(76);
            }
            if (mVConfiguration.mo26483E()) {
                bitSet.set(77);
            }
            if (mVConfiguration.mo26480D()) {
                bitSet.set(78);
            }
            if (mVConfiguration.mo26496I0()) {
                bitSet.set(79);
            }
            if (mVConfiguration.mo26555d1()) {
                bitSet.set(80);
            }
            if (mVConfiguration.mo26548b1()) {
                bitSet.set(81);
            }
            if (mVConfiguration.mo26492H()) {
                bitSet.set(82);
            }
            if (mVConfiguration.mo26523S()) {
                bitSet.set(83);
            }
            if (mVConfiguration.mo26571h1()) {
                bitSet.set(84);
            }
            if (mVConfiguration.mo26604q()) {
                bitSet.set(85);
            }
            if (mVConfiguration.mo26598o1()) {
                bitSet.set(86);
            }
            if (mVConfiguration.mo26594n1()) {
                bitSet.set(87);
            }
            if (mVConfiguration.mo26538Y()) {
                bitSet.set(88);
            }
            if (mVConfiguration.mo26578j()) {
                bitSet.set(89);
            }
            if (mVConfiguration.mo26566g0()) {
                bitSet.set(90);
            }
            if (mVConfiguration.mo26583k0()) {
                bitSet.set(91);
            }
            if (mVConfiguration.mo26542Z0()) {
                bitSet.set(92);
            }
            if (mVConfiguration.mo26481D0()) {
                bitSet.set(93);
            }
            if (mVConfiguration.mo26515P0()) {
                bitSet.set(94);
            }
            if (mVConfiguration.mo26518Q0()) {
                bitSet.set(95);
            }
            if (mVConfiguration.mo26626v0()) {
                bitSet.set(96);
            }
            if (mVConfiguration.mo26630w0()) {
                bitSet.set(97);
            }
            if (mVConfiguration.mo26574i()) {
                bitSet.set(98);
            }
            if (mVConfiguration.mo26545a1()) {
                bitSet.set(99);
            }
            if (mVConfiguration.mo26586l()) {
                bitSet.set(100);
            }
            if (mVConfiguration.mo26582k()) {
                bitSet.set(101);
            }
            if (mVConfiguration.mo26621u()) {
                bitSet.set(102);
            }
            if (mVConfiguration.mo26539Y0()) {
                bitSet.set(103);
            }
            if (mVConfiguration.mo26587l0()) {
                bitSet.set(104);
            }
            jVar.mo61738U(bitSet, 105);
            if (mVConfiguration.mo26570h0()) {
                jVar.mo61678B(mVConfiguration.latestAppVersionCode);
            }
            if (mVConfiguration.mo26616t()) {
                jVar.mo61678B(mVConfiguration.defaultTripPlanOption.getValue());
            }
            if (mVConfiguration.mo26567g1()) {
                jVar.mo61678B(mVConfiguration.twitterPostActivityNames.size());
                for (String J : mVConfiguration.twitterPostActivityNames) {
                    jVar.mo61686J(J);
                }
            }
            if (mVConfiguration.mo26579j0()) {
                jVar.mo61686J(mVConfiguration.latestRelease_iPhone);
            }
            if (mVConfiguration.mo26575i0()) {
                jVar.mo61686J(mVConfiguration.latestRelease_android);
            }
            if (mVConfiguration.mo26606q1()) {
                jVar.mo61686J(mVConfiguration.whatsNewURL_iPhone);
            }
            if (mVConfiguration.mo26602p1()) {
                jVar.mo61686J(mVConfiguration.whatsNewURL_android);
            }
            if (mVConfiguration.mo26625v()) {
                jVar.mo61686J(mVConfiguration.feedBackEmailAddress);
            }
            if (mVConfiguration.mo26576i1()) {
                jVar.mo61708u(mVConfiguration.USE_MOOVIT_TILES);
            }
            if (mVConfiguration.mo26622u0()) {
                jVar.mo61686J(mVConfiguration.MOOVIT_TILES_URL);
            }
            if (mVConfiguration.mo26475A0()) {
                jVar.mo61678B(mVConfiguration.near_me_default_stop_radius);
            }
            if (mVConfiguration.mo26640z0()) {
                jVar.mo61678B(mVConfiguration.near_me_default_stop_detail_radius);
            }
            if (mVConfiguration.mo26637y0()) {
                jVar.mo61678B(mVConfiguration.near_me_default_stop_detail_max_lines);
            }
            if (mVConfiguration.mo26479C0()) {
                jVar.mo61678B(mVConfiguration.near_me_map_sensitivity);
            }
            if (mVConfiguration.mo26588l1()) {
                jVar.mo61710w(mVConfiguration.walking_speed_factor);
            }
            if (mVConfiguration.mo26608r()) {
                jVar.mo61686J(mVConfiguration.DEFAULT_INTERMEDIATE_DURATION);
            }
            if (mVConfiguration.mo26551c1()) {
                jVar.mo61686J(mVConfiguration.TIME_DELTA_UPDATES);
            }
            if (mVConfiguration.mo26612s()) {
                jVar.mo61686J(mVConfiguration.DISTANCE_DELTA_UPDATES);
            }
            if (mVConfiguration.mo26490G0()) {
                jVar.mo61678B(mVConfiguration.SCHEDULE_TIME_JOIN_RT_GTFS_SECONDS);
            }
            if (mVConfiguration.mo26536X()) {
                jVar.mo61708u(mVConfiguration.IS_TAXI_SUPPORT);
            }
            if (mVConfiguration.mo26486F()) {
                jVar.mo61708u(mVConfiguration.HAS_MAP_CAMPAIGNS);
            }
            if (mVConfiguration.mo26509N0()) {
                jVar.mo61708u(mVConfiguration.SUPPORT_SERVICE_ALERTS_TAB);
            }
            if (mVConfiguration.mo26503L0()) {
                jVar.mo61708u(mVConfiguration.STOP_GAME_ENABLED);
            }
            if (mVConfiguration.mo26554d0()) {
                jVar.mo61708u(mVConfiguration.is_location_triggers_enable);
            }
            if (mVConfiguration.mo26557e0()) {
                jVar.mo61708u(mVConfiguration.is_topup_tab_enable);
            }
            if (mVConfiguration.mo26591m0()) {
                jVar.mo61678B(mVConfiguration.location_trigger_dwell_delay_sec);
            }
            if (mVConfiguration.mo26593n0()) {
                jVar.mo61678B(mVConfiguration.location_trigger_geofence_radius_meters);
            }
            if (mVConfiguration.mo26498J()) {
                jVar.mo61708u(mVConfiguration.IS_BIKE_SHARING_SUPPORT);
            }
            if (mVConfiguration.mo26505M()) {
                jVar.mo61708u(mVConfiguration.IS_CAR_SHARING_SUPPORT);
            }
            if (mVConfiguration.mo26502L()) {
                jVar.mo61708u(mVConfiguration.IS_CAR_POOL_SUPPORT);
            }
            if (mVConfiguration.mo26580j1()) {
                jVar.mo61708u(mVConfiguration.USE_ROLLOUT);
            }
            if (mVConfiguration.mo26541Z()) {
                jVar.mo61708u(mVConfiguration.IS_TRIP_PLAN_RATING_SUPPORT);
            }
            if (mVConfiguration.mo26563f1()) {
                jVar.mo61686J(mVConfiguration.topup_tab_link);
            }
            if (mVConfiguration.mo26495I()) {
                jVar.mo61708u(mVConfiguration.IS_ADS_SUPPORT);
            }
            if (mVConfiguration.mo26506M0()) {
                jVar.mo61686J(mVConfiguration.SUBWAY_LAYER_URL);
            }
            if (mVConfiguration.mo26484E0()) {
                jVar.mo61686J(mVConfiguration.PATHWAY_LAYERS_URL);
            }
            if (mVConfiguration.mo26533W()) {
                jVar.mo61708u(mVConfiguration.IS_STOP_MAP_ITEMS_PRELOAD_SUPPORTED);
            }
            if (mVConfiguration.mo26565g()) {
                jVar.mo61678B(mVConfiguration.additionalTab.getValue());
            }
            if (mVConfiguration.mo26569h()) {
                jVar.mo61678B(mVConfiguration.additionalTabPosition);
            }
            if (mVConfiguration.mo26605q0()) {
                jVar.mo61677A(mVConfiguration.MAX_ZOOM_FOR_SUBWAY_LAYER);
            }
            if (mVConfiguration.mo26617t0()) {
                jVar.mo61677A(mVConfiguration.MIN_ZOOM_FOR_SUBWAY_LAYER);
            }
            if (mVConfiguration.mo26597o0()) {
                jVar.mo61678B(mVConfiguration.MAP_IMPL_TYPE.getValue());
            }
            if (mVConfiguration.mo26613s0()) {
                jVar.mo61678B(mVConfiguration.MIN_ARRIVALS_TO_RETRIEVE);
            }
            if (mVConfiguration.mo26609r0()) {
                jVar.mo61678B(mVConfiguration.MINUTES_CONSIDER_ARRIVALS);
            }
            if (mVConfiguration.mo26530V()) {
                jVar.mo61708u(mVConfiguration.IS_STOP_EDITING_SUPPORTED);
            }
            if (mVConfiguration.mo26493H0()) {
                jVar.mo61678B(mVConfiguration.SEARCH_LAST_INTERVAL_IN_SECONDS);
            }
            if (mVConfiguration.mo26499J0()) {
                jVar.mo61708u(mVConfiguration.SHOW_NEW_ITINERARIES_HINT);
            }
            if (mVConfiguration.mo26558e1()) {
                jVar.mo61686J(mVConfiguration.TopUpText);
            }
            if (mVConfiguration.mo26590m()) {
                jVar.mo61686J(mVConfiguration.CarPoolAttributionImageUrl);
            }
            if (mVConfiguration.mo26596o()) {
                jVar.mo61686J(mVConfiguration.CarPoolAttributionText);
            }
            if (mVConfiguration.mo26601p0()) {
                jVar.mo61678B(mVConfiguration.MAP_IMPL_TYPE_V5.getValue());
            }
            if (mVConfiguration.mo26477B0()) {
                jVar.mo61678B(mVConfiguration.near_me_favorite_stop_detail_max_lines);
            }
            if (mVConfiguration.mo26562f0()) {
                jVar.mo61708u(mVConfiguration.is_trip_plan_car_pool_experiment_on);
            }
            if (mVConfiguration.mo26547b0()) {
                jVar.mo61708u(mVConfiguration.isInterstitialAdsSupported);
            }
            if (mVConfiguration.mo26487F0()) {
                jVar.mo61678B(mVConfiguration.PCT_OF_SERVER_LOG);
            }
            if (mVConfiguration.mo26584k1()) {
                jVar.mo61708u(mVConfiguration.USE_SERVER_FOR_FORWARD_GEOCODE);
            }
            if (mVConfiguration.mo26561f()) {
                jVar.mo61678B(mVConfiguration.ACTIVE_PROFILER_PCT);
            }
            if (mVConfiguration.mo26600p()) {
                jVar.mo61708u(mVConfiguration.carPoolReferralIndication);
            }
            if (mVConfiguration.mo26633x0()) {
                jVar.mo61708u(mVConfiguration.NEAR_ME_RT_ENABLED);
            }
            if (mVConfiguration.mo26544a0()) {
                jVar.mo61708u(mVConfiguration.IS_USER_REPORTS_ENABLED);
            }
            if (mVConfiguration.mo26636y()) {
                jVar.mo61678B(mVConfiguration.fgWifiScanSec);
            }
            if (mVConfiguration.mo26629w()) {
                jVar.mo61678B(mVConfiguration.fgBeaconScanSec);
            }
            if (mVConfiguration.mo26550c0()) {
                jVar.mo61708u(mVConfiguration.isReportMetrics);
            }
            if (mVConfiguration.mo26531V0()) {
                jVar.mo61708u(mVConfiguration.showCommunitySection);
            }
            if (mVConfiguration.mo26534W0()) {
                jVar.mo61708u(mVConfiguration.showRideRequestSection);
            }
            if (mVConfiguration.mo26521R0()) {
                jVar.mo61678B(mVConfiguration.searchMaxFutureDays);
            }
            if (mVConfiguration.mo26489G()) {
                jVar.mo61678B(mVConfiguration.homeTabs.size());
                for (MVHomeTab value : mVConfiguration.homeTabs) {
                    jVar.mo61678B(value.getValue());
                }
            }
            if (mVConfiguration.mo26528U0()) {
                jVar.mo61708u(mVConfiguration.service_status_card_is_subway);
            }
            if (mVConfiguration.mo26525T0()) {
                jVar.mo61678B(mVConfiguration.sectionsOrder.size());
                for (MVSingleTabSection value2 : mVConfiguration.sectionsOrder) {
                    jVar.mo61678B(value2.getValue());
                }
            }
            if (mVConfiguration.mo26512O0()) {
                jVar.mo61678B(mVConfiguration.scheduleDisplayExperiment.getValue());
            }
            if (mVConfiguration.mo26527U()) {
                jVar.mo61708u(mVConfiguration.IS_RIDE_SHARING_SUPPORT);
            }
            if (mVConfiguration.mo26520R()) {
                jVar.mo61708u(mVConfiguration.IS_FREQUENCY_SUPPORTED);
            }
            if (mVConfiguration.mo26508N()) {
                jVar.mo61708u(mVConfiguration.IS_DOCKLESS_BIKES_SUPPORTED);
            }
            if (mVConfiguration.mo26517Q()) {
                jVar.mo61708u(mVConfiguration.IS_DOCKLESS_SCOOTERS_SUPPORTED);
            }
            if (mVConfiguration.mo26511O()) {
                jVar.mo61708u(mVConfiguration.IS_DOCKLESS_KICK_SCOOTERS_SUPPORTED);
            }
            if (mVConfiguration.mo26514P()) {
                jVar.mo61708u(mVConfiguration.IS_DOCKLESS_MOPED_SUPPORTED);
            }
            if (mVConfiguration.mo26474A()) {
                jVar.mo61686J(mVConfiguration.GTFS_CONFIG_FILES);
            }
            if (mVConfiguration.mo26483E()) {
                jVar.mo61678B(mVConfiguration.GTFS_CONFIG_GRAPH_NUM_OF_DAYS);
            }
            if (mVConfiguration.mo26480D()) {
                jVar.mo61678B(mVConfiguration.GTFS_CONFIG_GRAPH_HOURS);
            }
            if (mVConfiguration.mo26496I0()) {
                jVar.mo61678B(mVConfiguration.SEARCH_LOCATIONS_DELAY);
            }
            if (mVConfiguration.mo26555d1()) {
                jVar.mo61708u(mVConfiguration.TRIP_PLAN_PERSONALIZATION_POPUP_ENABLED);
            }
            if (mVConfiguration.mo26548b1()) {
                jVar.mo61678B(mVConfiguration.suggestedRoutesCellImprovementsExperiment.getValue());
            }
            if (mVConfiguration.mo26492H()) {
                jVar.mo61678B(mVConfiguration.homeWorkExperiment.getValue());
            }
            if (mVConfiguration.mo26523S()) {
                jVar.mo61708u(mVConfiguration.IS_PRIVATE_BIKE_SUPPORTED);
            }
            if (mVConfiguration.mo26571h1()) {
                jVar.mo61708u(mVConfiguration.USE_GOOGLE_PLACES);
            }
            if (mVConfiguration.mo26604q()) {
                jVar.mo61678B(mVConfiguration.DASHBOARD_SECTIONS.size());
                for (MVDashboardSection value3 : mVConfiguration.DASHBOARD_SECTIONS) {
                    jVar.mo61678B(value3.getValue());
                }
            }
            if (mVConfiguration.mo26598o1()) {
                jVar.mo61686J(mVConfiguration.wazeCarpoolInstallationLink);
            }
            if (mVConfiguration.mo26594n1()) {
                jVar.mo61686J(mVConfiguration.wazeCarpoolDeepLink);
            }
            if (mVConfiguration.mo26538Y()) {
                jVar.mo61708u(mVConfiguration.IS_TICKETING_V2_SUPPORTED);
            }
            if (mVConfiguration.mo26578j()) {
                jVar.mo61678B(mVConfiguration.arExperiment.getValue());
            }
            if (mVConfiguration.mo26566g0()) {
                jVar.mo61678B(mVConfiguration.itineraryQuickActions.size());
                for (MVItineraryQuickAction value4 : mVConfiguration.itineraryQuickActions) {
                    jVar.mo61678B(value4.getValue());
                }
            }
            if (mVConfiguration.mo26583k0()) {
                jVar.mo61678B(mVConfiguration.lineViewQuickActions.size());
                for (MVLineViewQuickAction value5 : mVConfiguration.lineViewQuickActions) {
                    jVar.mo61678B(value5.getValue());
                }
            }
            if (mVConfiguration.mo26542Z0()) {
                jVar.mo61678B(mVConfiguration.stopViewQuickActions.size());
                for (MVStopViewQuickAction value6 : mVConfiguration.stopViewQuickActions) {
                    jVar.mo61678B(value6.getValue());
                }
            }
            if (mVConfiguration.mo26481D0()) {
                jVar.mo61678B(mVConfiguration.onboardingFavoritesTestingGroup.getValue());
            }
            if (mVConfiguration.mo26515P0()) {
                jVar.mo61678B(mVConfiguration.searchExamplesAbTestingGroup.getValue());
            }
            if (mVConfiguration.mo26518Q0()) {
                jVar.mo61678B(mVConfiguration.searchLocationHintABTestingType.getValue());
            }
            if (mVConfiguration.mo26626v0()) {
                jVar.mo61678B(mVConfiguration.mainSearchButtonABTestingGroup.getValue());
            }
            if (mVConfiguration.mo26630w0()) {
                jVar.mo61678B(mVConfiguration.mvUserProfileAccessibilityPref.getValue());
            }
            if (mVConfiguration.mo26574i()) {
                jVar.mo61678B(mVConfiguration.adsConsentLayoutABTestGroup.getValue());
            }
            if (mVConfiguration.mo26545a1()) {
                jVar.mo61678B(mVConfiguration.subscriptionABTestGroup.getValue());
            }
            if (mVConfiguration.mo26586l()) {
                jVar.mo61678B(mVConfiguration.bannerDesignABTestGroup.getValue());
            }
            if (mVConfiguration.mo26582k()) {
                jVar.mo61678B(mVConfiguration.attPermissionsABTestingGroup.getValue());
            }
            if (mVConfiguration.mo26621u()) {
                jVar.mo61678B(mVConfiguration.directToItineraryABTestGroup.getValue());
            }
            if (mVConfiguration.mo26539Y0()) {
                jVar.mo61678B(mVConfiguration.smartComponentRandomABTestingGroup.getValue());
            }
            if (mVConfiguration.mo26587l0()) {
                jVar.mo61678B(mVConfiguration.lineViewWalkthroughABTestingGroup.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVConfiguration mVConfiguration = (MVConfiguration) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(105);
            if (T.get(0)) {
                mVConfiguration.latestAppVersionCode = jVar.mo61696i();
                mVConfiguration.mo26535W1();
            }
            if (T.get(1)) {
                mVConfiguration.defaultTripPlanOption = MVTripPlanOption.findByValue(jVar.mo61696i());
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVConfiguration.twitterPostActivityNames = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVConfiguration.twitterPostActivityNames.add(jVar.mo61704q());
                }
            }
            if (T.get(3)) {
                mVConfiguration.latestRelease_iPhone = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVConfiguration.latestRelease_android = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVConfiguration.whatsNewURL_iPhone = jVar.mo61704q();
            }
            if (T.get(6)) {
                mVConfiguration.whatsNewURL_android = jVar.mo61704q();
            }
            if (T.get(7)) {
                mVConfiguration.feedBackEmailAddress = jVar.mo61704q();
            }
            if (T.get(8)) {
                mVConfiguration.USE_MOOVIT_TILES = jVar.mo61690c();
                mVConfiguration.mo26632w2();
            }
            if (T.get(9)) {
                mVConfiguration.MOOVIT_TILES_URL = jVar.mo61704q();
            }
            if (T.get(10)) {
                mVConfiguration.near_me_default_stop_radius = jVar.mo61696i();
                mVConfiguration.mo26568g2();
            }
            if (T.get(11)) {
                mVConfiguration.near_me_default_stop_detail_radius = jVar.mo61696i();
                mVConfiguration.mo26564f2();
            }
            if (T.get(12)) {
                mVConfiguration.near_me_default_stop_detail_max_lines = jVar.mo61696i();
                mVConfiguration.mo26559e2();
            }
            if (T.get(13)) {
                mVConfiguration.near_me_map_sensitivity = jVar.mo61696i();
                mVConfiguration.mo26577i2();
            }
            if (T.get(14)) {
                mVConfiguration.walking_speed_factor = jVar.mo61692e();
                mVConfiguration.mo26642z2();
            }
            if (T.get(15)) {
                mVConfiguration.DEFAULT_INTERMEDIATE_DURATION = jVar.mo61704q();
            }
            if (T.get(16)) {
                mVConfiguration.TIME_DELTA_UPDATES = jVar.mo61704q();
            }
            if (T.get(17)) {
                mVConfiguration.DISTANCE_DELTA_UPDATES = jVar.mo61704q();
            }
            if (T.get(18)) {
                mVConfiguration.SCHEDULE_TIME_JOIN_RT_GTFS_SECONDS = jVar.mo61696i();
                mVConfiguration.mo26585k2();
            }
            if (T.get(19)) {
                mVConfiguration.IS_TAXI_SUPPORT = jVar.mo61690c();
                mVConfiguration.mo26510N1();
            }
            if (T.get(20)) {
                mVConfiguration.HAS_MAP_CAMPAIGNS = jVar.mo61690c();
                mVConfiguration.mo26638y1();
            }
            if (T.get(21)) {
                mVConfiguration.SUPPORT_SERVICE_ALERTS_TAB = jVar.mo61690c();
                mVConfiguration.mo26603p2();
            }
            if (T.get(22)) {
                mVConfiguration.STOP_GAME_ENABLED = jVar.mo61690c();
                mVConfiguration.mo26599o2();
            }
            if (T.get(23)) {
                mVConfiguration.is_location_triggers_enable = jVar.mo61690c();
                mVConfiguration.mo26526T1();
            }
            if (T.get(24)) {
                mVConfiguration.is_topup_tab_enable = jVar.mo61690c();
                mVConfiguration.mo26529U1();
            }
            if (T.get(25)) {
                mVConfiguration.location_trigger_dwell_delay_sec = jVar.mo61696i();
                mVConfiguration.mo26537X1();
            }
            if (T.get(26)) {
                mVConfiguration.location_trigger_geofence_radius_meters = jVar.mo61696i();
                mVConfiguration.mo26540Y1();
            }
            if (T.get(27)) {
                mVConfiguration.IS_BIKE_SHARING_SUPPORT = jVar.mo61690c();
                mVConfiguration.mo26476A1();
            }
            if (T.get(28)) {
                mVConfiguration.IS_CAR_SHARING_SUPPORT = jVar.mo61690c();
                mVConfiguration.mo26482D1();
            }
            if (T.get(29)) {
                mVConfiguration.IS_CAR_POOL_SUPPORT = jVar.mo61690c();
                mVConfiguration.mo26478B1();
            }
            if (T.get(30)) {
                mVConfiguration.USE_ROLLOUT = jVar.mo61690c();
                mVConfiguration.mo26635x2();
            }
            if (T.get(31)) {
                mVConfiguration.IS_TRIP_PLAN_RATING_SUPPORT = jVar.mo61690c();
                mVConfiguration.mo26516P1();
            }
            if (T.get(32)) {
                mVConfiguration.topup_tab_link = jVar.mo61704q();
            }
            if (T.get(33)) {
                mVConfiguration.IS_ADS_SUPPORT = jVar.mo61690c();
                mVConfiguration.mo26641z1();
            }
            if (T.get(34)) {
                mVConfiguration.SUBWAY_LAYER_URL = jVar.mo61704q();
            }
            if (T.get(35)) {
                mVConfiguration.PATHWAY_LAYERS_URL = jVar.mo61704q();
            }
            if (T.get(36)) {
                mVConfiguration.IS_STOP_MAP_ITEMS_PRELOAD_SUPPORTED = jVar.mo61690c();
                mVConfiguration.mo26507M1();
            }
            if (T.get(37)) {
                mVConfiguration.additionalTab = MVAdditionalTab.findByValue(jVar.mo61696i());
            }
            if (T.get(38)) {
                mVConfiguration.additionalTabPosition = jVar.mo61696i();
                mVConfiguration.mo26614s1();
            }
            if (T.get(39)) {
                mVConfiguration.MAX_ZOOM_FOR_SUBWAY_LAYER = jVar.mo61695h();
                mVConfiguration.mo26543Z1();
            }
            if (T.get(40)) {
                mVConfiguration.MIN_ZOOM_FOR_SUBWAY_LAYER = jVar.mo61695h();
                mVConfiguration.mo26552c2();
            }
            if (T.get(41)) {
                mVConfiguration.MAP_IMPL_TYPE = MVMapImplType.findByValue(jVar.mo61696i());
            }
            if (T.get(42)) {
                mVConfiguration.MIN_ARRIVALS_TO_RETRIEVE = jVar.mo61696i();
                mVConfiguration.mo26549b2();
            }
            if (T.get(43)) {
                mVConfiguration.MINUTES_CONSIDER_ARRIVALS = jVar.mo61696i();
                mVConfiguration.mo26546a2();
            }
            if (T.get(44)) {
                mVConfiguration.IS_STOP_EDITING_SUPPORTED = jVar.mo61690c();
                mVConfiguration.mo26504L1();
            }
            if (T.get(45)) {
                mVConfiguration.SEARCH_LAST_INTERVAL_IN_SECONDS = jVar.mo61696i();
                mVConfiguration.mo26589l2();
            }
            if (T.get(46)) {
                mVConfiguration.SHOW_NEW_ITINERARIES_HINT = jVar.mo61690c();
                mVConfiguration.mo26595n2();
            }
            if (T.get(47)) {
                mVConfiguration.TopUpText = jVar.mo61704q();
            }
            if (T.get(48)) {
                mVConfiguration.CarPoolAttributionImageUrl = jVar.mo61704q();
            }
            if (T.get(49)) {
                mVConfiguration.CarPoolAttributionText = jVar.mo61704q();
            }
            if (T.get(50)) {
                mVConfiguration.MAP_IMPL_TYPE_V5 = MVMapImplType.findByValue(jVar.mo61696i());
            }
            if (T.get(51)) {
                mVConfiguration.near_me_favorite_stop_detail_max_lines = jVar.mo61696i();
                mVConfiguration.mo26572h2();
            }
            if (T.get(52)) {
                mVConfiguration.is_trip_plan_car_pool_experiment_on = jVar.mo61690c();
                mVConfiguration.mo26532V1();
            }
            if (T.get(53)) {
                mVConfiguration.isInterstitialAdsSupported = jVar.mo61690c();
                mVConfiguration.mo26522R1();
            }
            if (T.get(54)) {
                mVConfiguration.PCT_OF_SERVER_LOG = jVar.mo61696i();
                mVConfiguration.mo26581j2();
            }
            if (T.get(55)) {
                mVConfiguration.USE_SERVER_FOR_FORWARD_GEOCODE = jVar.mo61690c();
                mVConfiguration.mo26639y2();
            }
            if (T.get(56)) {
                mVConfiguration.ACTIVE_PROFILER_PCT = jVar.mo61696i();
                mVConfiguration.mo26610r1();
            }
            if (T.get(57)) {
                mVConfiguration.carPoolReferralIndication = jVar.mo61690c();
                mVConfiguration.mo26618t1();
            }
            if (T.get(58)) {
                mVConfiguration.NEAR_ME_RT_ENABLED = jVar.mo61690c();
                mVConfiguration.mo26556d2();
            }
            if (T.get(59)) {
                mVConfiguration.IS_USER_REPORTS_ENABLED = jVar.mo61690c();
                mVConfiguration.mo26519Q1();
            }
            if (T.get(60)) {
                mVConfiguration.fgWifiScanSec = jVar.mo61696i();
                mVConfiguration.mo26627v1();
            }
            if (T.get(61)) {
                mVConfiguration.fgBeaconScanSec = jVar.mo61696i();
                mVConfiguration.mo26623u1();
            }
            if (T.get(62)) {
                mVConfiguration.isReportMetrics = jVar.mo61690c();
                mVConfiguration.mo26524S1();
            }
            if (T.get(63)) {
                mVConfiguration.showCommunitySection = jVar.mo61690c();
                mVConfiguration.mo26615s2();
            }
            if (T.get(64)) {
                mVConfiguration.showRideRequestSection = jVar.mo61690c();
                mVConfiguration.mo26619t2();
            }
            if (T.get(65)) {
                mVConfiguration.searchMaxFutureDays = jVar.mo61696i();
                mVConfiguration.mo26607q2();
            }
            if (T.get(66)) {
                int i3 = jVar.mo61696i();
                mVConfiguration.homeTabs = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    mVConfiguration.homeTabs.add(MVHomeTab.findByValue(jVar.mo61696i()));
                }
            }
            if (T.get(67)) {
                mVConfiguration.service_status_card_is_subway = jVar.mo61690c();
                mVConfiguration.mo26611r2();
            }
            if (T.get(68)) {
                int i5 = jVar.mo61696i();
                mVConfiguration.sectionsOrder = new ArrayList(i5);
                for (int i6 = 0; i6 < i5; i6++) {
                    mVConfiguration.sectionsOrder.add(MVSingleTabSection.findByValue(jVar.mo61696i()));
                }
            }
            if (T.get(69)) {
                mVConfiguration.scheduleDisplayExperiment = MVScheduleDisplayExperiment.findByValue(jVar.mo61696i());
            }
            if (T.get(70)) {
                mVConfiguration.IS_RIDE_SHARING_SUPPORT = jVar.mo61690c();
                mVConfiguration.mo26501K1();
            }
            if (T.get(71)) {
                mVConfiguration.IS_FREQUENCY_SUPPORTED = jVar.mo61690c();
                mVConfiguration.mo26497I1();
            }
            if (T.get(72)) {
                mVConfiguration.IS_DOCKLESS_BIKES_SUPPORTED = jVar.mo61690c();
                mVConfiguration.mo26485E1();
            }
            if (T.get(73)) {
                mVConfiguration.IS_DOCKLESS_SCOOTERS_SUPPORTED = jVar.mo61690c();
                mVConfiguration.mo26494H1();
            }
            if (T.get(74)) {
                mVConfiguration.IS_DOCKLESS_KICK_SCOOTERS_SUPPORTED = jVar.mo61690c();
                mVConfiguration.mo26488F1();
            }
            if (T.get(75)) {
                mVConfiguration.IS_DOCKLESS_MOPED_SUPPORTED = jVar.mo61690c();
                mVConfiguration.mo26491G1();
            }
            if (T.get(76)) {
                mVConfiguration.GTFS_CONFIG_FILES = jVar.mo61704q();
            }
            if (T.get(77)) {
                mVConfiguration.GTFS_CONFIG_GRAPH_NUM_OF_DAYS = jVar.mo61696i();
                mVConfiguration.mo26634x1();
            }
            if (T.get(78)) {
                mVConfiguration.GTFS_CONFIG_GRAPH_HOURS = jVar.mo61696i();
                mVConfiguration.mo26631w1();
            }
            if (T.get(79)) {
                mVConfiguration.SEARCH_LOCATIONS_DELAY = jVar.mo61696i();
                mVConfiguration.mo26592m2();
            }
            if (T.get(80)) {
                mVConfiguration.TRIP_PLAN_PERSONALIZATION_POPUP_ENABLED = jVar.mo61690c();
                mVConfiguration.mo26624u2();
            }
            if (T.get(81)) {
                mVConfiguration.suggestedRoutesCellImprovementsExperiment = MVSuggestedRoutesCellImprovementsExperiment.findByValue(jVar.mo61696i());
            }
            if (T.get(82)) {
                mVConfiguration.homeWorkExperiment = MVHomeWorkExperiment.findByValue(jVar.mo61696i());
            }
            if (T.get(83)) {
                mVConfiguration.IS_PRIVATE_BIKE_SUPPORTED = jVar.mo61690c();
                mVConfiguration.mo26500J1();
            }
            if (T.get(84)) {
                mVConfiguration.USE_GOOGLE_PLACES = jVar.mo61690c();
                mVConfiguration.mo26628v2();
            }
            if (T.get(85)) {
                int i7 = jVar.mo61696i();
                mVConfiguration.DASHBOARD_SECTIONS = new ArrayList(i7);
                for (int i8 = 0; i8 < i7; i8++) {
                    mVConfiguration.DASHBOARD_SECTIONS.add(MVDashboardSection.findByValue(jVar.mo61696i()));
                }
            }
            if (T.get(86)) {
                mVConfiguration.wazeCarpoolInstallationLink = jVar.mo61704q();
            }
            if (T.get(87)) {
                mVConfiguration.wazeCarpoolDeepLink = jVar.mo61704q();
            }
            if (T.get(88)) {
                mVConfiguration.IS_TICKETING_V2_SUPPORTED = jVar.mo61690c();
                mVConfiguration.mo26513O1();
            }
            if (T.get(89)) {
                mVConfiguration.arExperiment = MVARExperiment.findByValue(jVar.mo61696i());
            }
            if (T.get(90)) {
                int i9 = jVar.mo61696i();
                mVConfiguration.itineraryQuickActions = new ArrayList(i9);
                for (int i11 = 0; i11 < i9; i11++) {
                    mVConfiguration.itineraryQuickActions.add(MVItineraryQuickAction.findByValue(jVar.mo61696i()));
                }
            }
            if (T.get(91)) {
                int i12 = jVar.mo61696i();
                mVConfiguration.lineViewQuickActions = new ArrayList(i12);
                for (int i13 = 0; i13 < i12; i13++) {
                    mVConfiguration.lineViewQuickActions.add(MVLineViewQuickAction.findByValue(jVar.mo61696i()));
                }
            }
            if (T.get(92)) {
                int i14 = jVar.mo61696i();
                mVConfiguration.stopViewQuickActions = new ArrayList(i14);
                for (int i15 = 0; i15 < i14; i15++) {
                    mVConfiguration.stopViewQuickActions.add(MVStopViewQuickAction.findByValue(jVar.mo61696i()));
                }
            }
            if (T.get(93)) {
                mVConfiguration.onboardingFavoritesTestingGroup = MVOnboardingFavoritesABTestingGroup.findByValue(jVar.mo61696i());
            }
            if (T.get(94)) {
                mVConfiguration.searchExamplesAbTestingGroup = MVSearchExamplesABTestGroup.findByValue(jVar.mo61696i());
            }
            if (T.get(95)) {
                mVConfiguration.searchLocationHintABTestingType = MVSearchLocationHintABTestingType.findByValue(jVar.mo61696i());
            }
            if (T.get(96)) {
                mVConfiguration.mainSearchButtonABTestingGroup = MVMainSearchButtonABTestingGroup.findByValue(jVar.mo61696i());
            }
            if (T.get(97)) {
                mVConfiguration.mvUserProfileAccessibilityPref = MVUserProfileAccessibilityPref.findByValue(jVar.mo61696i());
            }
            if (T.get(98)) {
                mVConfiguration.adsConsentLayoutABTestGroup = MVAdsConsentLayoutABTestGroup.findByValue(jVar.mo61696i());
            }
            if (T.get(99)) {
                mVConfiguration.subscriptionABTestGroup = MVSubscriptionsABTestGroup.findByValue(jVar.mo61696i());
            }
            if (T.get(100)) {
                mVConfiguration.bannerDesignABTestGroup = MVBannerDesignABTestGroup.findByValue(jVar.mo61696i());
            }
            if (T.get(101)) {
                mVConfiguration.attPermissionsABTestingGroup = MVATTPermissionsABTestingGroup.findByValue(jVar.mo61696i());
            }
            if (T.get(102)) {
                mVConfiguration.directToItineraryABTestGroup = MVDirectToItineraryABTestGroup.findByValue(jVar.mo61696i());
            }
            if (T.get(103)) {
                mVConfiguration.smartComponentRandomABTestingGroup = MVSmartComponentRandomABTestingGroup.findByValue(jVar.mo61696i());
            }
            if (T.get(104)) {
                mVConfiguration.lineViewWalkthroughABTestingGroup = MVLineViewWalkthroughABTestingGroup.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.conf.MVConfiguration$d */
    public static class C8520d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8519c(0);
        }
    }

    static {
        new C17394d0("MVConfiguration");
        HashMap hashMap = new HashMap();
        f25270p1 = hashMap;
        hashMap.put(C25239c.class, new C8518b());
        hashMap.put(C25240d.class, new C8520d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LATEST_APP_VERSION_CODE, new FieldMetaData("latestAppVersionCode", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DEFAULT_TRIP_PLAN_OPTION, new FieldMetaData("defaultTripPlanOption", (byte) 3, new EnumMetaData(MVTripPlanOption.class)));
        enumMap.put(_Fields.TWITTER_POST_ACTIVITY_NAMES, new FieldMetaData("twitterPostActivityNames", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 11, false))));
        enumMap.put(_Fields.LATEST_RELEASE_I_PHONE, new FieldMetaData("latestRelease_iPhone", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LATEST_RELEASE_ANDROID, new FieldMetaData("latestRelease_android", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.WHATS_NEW_URL_I_PHONE, new FieldMetaData("whatsNewURL_iPhone", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.WHATS_NEW_URL_ANDROID, new FieldMetaData("whatsNewURL_android", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FEED_BACK_EMAIL_ADDRESS, new FieldMetaData("feedBackEmailAddress", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.USE__MOOVIT__TILES, new FieldMetaData("USE_MOOVIT_TILES", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.MOOVIT__TILES__URL, new FieldMetaData("MOOVIT_TILES_URL", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.NEAR_ME_DEFAULT_STOP_RADIUS, new FieldMetaData("near_me_default_stop_radius", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.NEAR_ME_DEFAULT_STOP_DETAIL_RADIUS, new FieldMetaData("near_me_default_stop_detail_radius", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.NEAR_ME_DEFAULT_STOP_DETAIL_MAX_LINES, new FieldMetaData("near_me_default_stop_detail_max_lines", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.NEAR_ME_MAP_SENSITIVITY, new FieldMetaData("near_me_map_sensitivity", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.WALKING_SPEED_FACTOR, new FieldMetaData("walking_speed_factor", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.DEFAULT__INTERMEDIATE__DURATION, new FieldMetaData("DEFAULT_INTERMEDIATE_DURATION", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TIME__DELTA__UPDATES, new FieldMetaData("TIME_DELTA_UPDATES", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DISTANCE__DELTA__UPDATES, new FieldMetaData("DISTANCE_DELTA_UPDATES", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SCHEDULE__TIME__JOIN__RT__GTFS__SECONDS, new FieldMetaData("SCHEDULE_TIME_JOIN_RT_GTFS_SECONDS", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.IS__TAXI__SUPPORT, new FieldMetaData("IS_TAXI_SUPPORT", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.HAS__MAP__CAMPAIGNS, new FieldMetaData("HAS_MAP_CAMPAIGNS", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.SUPPORT__SERVICE__ALERTS__TAB, new FieldMetaData("SUPPORT_SERVICE_ALERTS_TAB", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.STOP__GAME__ENABLED, new FieldMetaData("STOP_GAME_ENABLED", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.IS_LOCATION_TRIGGERS_ENABLE, new FieldMetaData("is_location_triggers_enable", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.IS_TOPUP_TAB_ENABLE, new FieldMetaData("is_topup_tab_enable", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.LOCATION_TRIGGER_DWELL_DELAY_SEC, new FieldMetaData("location_trigger_dwell_delay_sec", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.LOCATION_TRIGGER_GEOFENCE_RADIUS_METERS, new FieldMetaData("location_trigger_geofence_radius_meters", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.IS__BIKE__SHARING__SUPPORT, new FieldMetaData("IS_BIKE_SHARING_SUPPORT", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.IS__CAR__SHARING__SUPPORT, new FieldMetaData("IS_CAR_SHARING_SUPPORT", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.IS__CAR__POOL__SUPPORT, new FieldMetaData("IS_CAR_POOL_SUPPORT", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.USE__ROLLOUT, new FieldMetaData("USE_ROLLOUT", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.IS__TRIP__PLAN__RATING__SUPPORT, new FieldMetaData("IS_TRIP_PLAN_RATING_SUPPORT", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.TOPUP_TAB_LINK, new FieldMetaData("topup_tab_link", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IS__ADS__SUPPORT, new FieldMetaData("IS_ADS_SUPPORT", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.SUBWAY__LAYER__URL, new FieldMetaData("SUBWAY_LAYER_URL", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PATHWAY__LAYERS__URL, new FieldMetaData("PATHWAY_LAYERS_URL", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IS__STOP__MAP__ITEMS__PRELOAD__SUPPORTED, new FieldMetaData("IS_STOP_MAP_ITEMS_PRELOAD_SUPPORTED", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.ADDITIONAL_TAB, new FieldMetaData("additionalTab", (byte) 3, new EnumMetaData(MVAdditionalTab.class)));
        enumMap.put(_Fields.ADDITIONAL_TAB_POSITION, new FieldMetaData("additionalTabPosition", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.MAX__ZOOM__FOR__SUBWAY__LAYER, new FieldMetaData("MAX_ZOOM_FOR_SUBWAY_LAYER", (byte) 3, new FieldValueMetaData((byte) 6, false)));
        enumMap.put(_Fields.MIN__ZOOM__FOR__SUBWAY__LAYER, new FieldMetaData("MIN_ZOOM_FOR_SUBWAY_LAYER", (byte) 3, new FieldValueMetaData((byte) 6, false)));
        enumMap.put(_Fields.MAP__IMPL__TYPE, new FieldMetaData("MAP_IMPL_TYPE", (byte) 3, new EnumMetaData(MVMapImplType.class)));
        enumMap.put(_Fields.MIN__ARRIVALS__TO__RETRIEVE, new FieldMetaData("MIN_ARRIVALS_TO_RETRIEVE", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.MINUTES__CONSIDER__ARRIVALS, new FieldMetaData("MINUTES_CONSIDER_ARRIVALS", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.IS__STOP__EDITING__SUPPORTED, new FieldMetaData("IS_STOP_EDITING_SUPPORTED", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.SEARCH__LAST__INTERVAL__IN__SECONDS, new FieldMetaData("SEARCH_LAST_INTERVAL_IN_SECONDS", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.SHOW__NEW__ITINERARIES__HINT, new FieldMetaData("SHOW_NEW_ITINERARIES_HINT", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.TOP_UP_TEXT, new FieldMetaData("TopUpText", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CAR_POOL_ATTRIBUTION_IMAGE_URL, new FieldMetaData("CarPoolAttributionImageUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CAR_POOL_ATTRIBUTION_TEXT, new FieldMetaData("CarPoolAttributionText", (byte) 3, new FieldValueMetaData((byte) 11)));
        enumMap.put(_Fields.MAP__IMPL__TYPE__V5, new FieldMetaData("MAP_IMPL_TYPE_V5", (byte) 3, new EnumMetaData(MVMapImplType.class)));
        enumMap.put(_Fields.NEAR_ME_FAVORITE_STOP_DETAIL_MAX_LINES, new FieldMetaData("near_me_favorite_stop_detail_max_lines", (byte) 3, new FieldValueMetaData((byte) 8)));
        enumMap.put(_Fields.IS_TRIP_PLAN_CAR_POOL_EXPERIMENT_ON, new FieldMetaData("is_trip_plan_car_pool_experiment_on", (byte) 3, new FieldValueMetaData((byte) 2)));
        enumMap.put(_Fields.IS_INTERSTITIAL_ADS_SUPPORTED, new FieldMetaData("isInterstitialAdsSupported", (byte) 3, new FieldValueMetaData((byte) 2)));
        enumMap.put(_Fields.PCT__OF__SERVER__LOG, new FieldMetaData("PCT_OF_SERVER_LOG", (byte) 3, new FieldValueMetaData((byte) 8)));
        enumMap.put(_Fields.USE__SERVER__FOR__FORWARD__GEOCODE, new FieldMetaData("USE_SERVER_FOR_FORWARD_GEOCODE", (byte) 3, new FieldValueMetaData((byte) 2)));
        enumMap.put(_Fields.ACTIVE__PROFILER__PCT, new FieldMetaData("ACTIVE_PROFILER_PCT", (byte) 3, new FieldValueMetaData((byte) 8)));
        enumMap.put(_Fields.CAR_POOL_REFERRAL_INDICATION, new FieldMetaData("carPoolReferralIndication", (byte) 3, new FieldValueMetaData((byte) 2)));
        enumMap.put(_Fields.NEAR__ME__RT__ENABLED, new FieldMetaData("NEAR_ME_RT_ENABLED", (byte) 3, new FieldValueMetaData((byte) 2)));
        enumMap.put(_Fields.IS__USER__REPORTS__ENABLED, new FieldMetaData("IS_USER_REPORTS_ENABLED", (byte) 3, new FieldValueMetaData((byte) 2)));
        enumMap.put(_Fields.FG_WIFI_SCAN_SEC, new FieldMetaData("fgWifiScanSec", (byte) 3, new FieldValueMetaData((byte) 8)));
        enumMap.put(_Fields.FG_BEACON_SCAN_SEC, new FieldMetaData("fgBeaconScanSec", (byte) 3, new FieldValueMetaData((byte) 8)));
        enumMap.put(_Fields.IS_REPORT_METRICS, new FieldMetaData("isReportMetrics", (byte) 3, new FieldValueMetaData((byte) 2)));
        enumMap.put(_Fields.SHOW_COMMUNITY_SECTION, new FieldMetaData("showCommunitySection", (byte) 3, new FieldValueMetaData((byte) 2)));
        enumMap.put(_Fields.SHOW_RIDE_REQUEST_SECTION, new FieldMetaData("showRideRequestSection", (byte) 3, new FieldValueMetaData((byte) 2)));
        enumMap.put(_Fields.SEARCH_MAX_FUTURE_DAYS, new FieldMetaData("searchMaxFutureDays", (byte) 3, new FieldValueMetaData((byte) 8)));
        enumMap.put(_Fields.HOME_TABS, new FieldMetaData("homeTabs", (byte) 3, new ListMetaData(new EnumMetaData(MVHomeTab.class))));
        enumMap.put(_Fields.SERVICE_STATUS_CARD_IS_SUBWAY, new FieldMetaData("service_status_card_is_subway", (byte) 3, new FieldValueMetaData((byte) 2)));
        enumMap.put(_Fields.SECTIONS_ORDER, new FieldMetaData("sectionsOrder", (byte) 3, new ListMetaData(new EnumMetaData(MVSingleTabSection.class))));
        enumMap.put(_Fields.SCHEDULE_DISPLAY_EXPERIMENT, new FieldMetaData("scheduleDisplayExperiment", (byte) 2, new EnumMetaData(MVScheduleDisplayExperiment.class)));
        enumMap.put(_Fields.IS__RIDE__SHARING__SUPPORT, new FieldMetaData("IS_RIDE_SHARING_SUPPORT", (byte) 3, new FieldValueMetaData((byte) 2)));
        enumMap.put(_Fields.IS__FREQUENCY__SUPPORTED, new FieldMetaData("IS_FREQUENCY_SUPPORTED", (byte) 3, new FieldValueMetaData((byte) 2)));
        enumMap.put(_Fields.IS__DOCKLESS__BIKES__SUPPORTED, new FieldMetaData("IS_DOCKLESS_BIKES_SUPPORTED", (byte) 3, new FieldValueMetaData((byte) 2)));
        enumMap.put(_Fields.IS__DOCKLESS__SCOOTERS__SUPPORTED, new FieldMetaData("IS_DOCKLESS_SCOOTERS_SUPPORTED", (byte) 3, new FieldValueMetaData((byte) 2)));
        enumMap.put(_Fields.IS__DOCKLESS__KICK__SCOOTERS__SUPPORTED, new FieldMetaData("IS_DOCKLESS_KICK_SCOOTERS_SUPPORTED", (byte) 3, new FieldValueMetaData((byte) 2)));
        enumMap.put(_Fields.IS__DOCKLESS__MOPED__SUPPORTED, new FieldMetaData("IS_DOCKLESS_MOPED_SUPPORTED", (byte) 3, new FieldValueMetaData((byte) 2)));
        enumMap.put(_Fields.GTFS__CONFIG__FILES, new FieldMetaData("GTFS_CONFIG_FILES", (byte) 3, new FieldValueMetaData((byte) 11)));
        enumMap.put(_Fields.GTFS__CONFIG__GRAPH__NUM__OF__DAYS, new FieldMetaData("GTFS_CONFIG_GRAPH_NUM_OF_DAYS", (byte) 3, new FieldValueMetaData((byte) 8)));
        enumMap.put(_Fields.GTFS__CONFIG__GRAPH__HOURS, new FieldMetaData("GTFS_CONFIG_GRAPH_HOURS", (byte) 3, new FieldValueMetaData((byte) 8)));
        enumMap.put(_Fields.SEARCH__LOCATIONS__DELAY, new FieldMetaData("SEARCH_LOCATIONS_DELAY", (byte) 3, new FieldValueMetaData((byte) 8)));
        enumMap.put(_Fields.TRIP__PLAN__PERSONALIZATION__POPUP__ENABLED, new FieldMetaData("TRIP_PLAN_PERSONALIZATION_POPUP_ENABLED", (byte) 3, new FieldValueMetaData((byte) 2)));
        enumMap.put(_Fields.SUGGESTED_ROUTES_CELL_IMPROVEMENTS_EXPERIMENT, new FieldMetaData("suggestedRoutesCellImprovementsExperiment", (byte) 3, new EnumMetaData(MVSuggestedRoutesCellImprovementsExperiment.class)));
        enumMap.put(_Fields.HOME_WORK_EXPERIMENT, new FieldMetaData("homeWorkExperiment", (byte) 3, new EnumMetaData(MVHomeWorkExperiment.class)));
        enumMap.put(_Fields.IS__PRIVATE__BIKE__SUPPORTED, new FieldMetaData("IS_PRIVATE_BIKE_SUPPORTED", (byte) 3, new FieldValueMetaData((byte) 2)));
        enumMap.put(_Fields.USE__GOOGLE__PLACES, new FieldMetaData("USE_GOOGLE_PLACES", (byte) 3, new FieldValueMetaData((byte) 2)));
        enumMap.put(_Fields.DASHBOARD__SECTIONS, new FieldMetaData("DASHBOARD_SECTIONS", (byte) 3, new ListMetaData(new EnumMetaData(MVDashboardSection.class))));
        enumMap.put(_Fields.WAZE_CARPOOL_INSTALLATION_LINK, new FieldMetaData("wazeCarpoolInstallationLink", (byte) 3, new FieldValueMetaData((byte) 11)));
        enumMap.put(_Fields.WAZE_CARPOOL_DEEP_LINK, new FieldMetaData("wazeCarpoolDeepLink", (byte) 3, new FieldValueMetaData((byte) 11)));
        enumMap.put(_Fields.IS__TICKETING__V2__SUPPORTED, new FieldMetaData("IS_TICKETING_V2_SUPPORTED", (byte) 3, new FieldValueMetaData((byte) 2)));
        enumMap.put(_Fields.AR_EXPERIMENT, new FieldMetaData("arExperiment", (byte) 3, new EnumMetaData(MVARExperiment.class)));
        enumMap.put(_Fields.ITINERARY_QUICK_ACTIONS, new FieldMetaData("itineraryQuickActions", (byte) 3, new ListMetaData(new EnumMetaData(MVItineraryQuickAction.class))));
        enumMap.put(_Fields.LINE_VIEW_QUICK_ACTIONS, new FieldMetaData("lineViewQuickActions", (byte) 3, new ListMetaData(new EnumMetaData(MVLineViewQuickAction.class))));
        enumMap.put(_Fields.STOP_VIEW_QUICK_ACTIONS, new FieldMetaData("stopViewQuickActions", (byte) 3, new ListMetaData(new EnumMetaData(MVStopViewQuickAction.class))));
        enumMap.put(_Fields.ONBOARDING_FAVORITES_TESTING_GROUP, new FieldMetaData("onboardingFavoritesTestingGroup", (byte) 3, new EnumMetaData(MVOnboardingFavoritesABTestingGroup.class)));
        enumMap.put(_Fields.SEARCH_EXAMPLES_AB_TESTING_GROUP, new FieldMetaData("searchExamplesAbTestingGroup", (byte) 3, new EnumMetaData(MVSearchExamplesABTestGroup.class)));
        enumMap.put(_Fields.SEARCH_LOCATION_HINT_ABTESTING_TYPE, new FieldMetaData("searchLocationHintABTestingType", (byte) 3, new EnumMetaData(MVSearchLocationHintABTestingType.class)));
        enumMap.put(_Fields.MAIN_SEARCH_BUTTON_ABTESTING_GROUP, new FieldMetaData("mainSearchButtonABTestingGroup", (byte) 3, new EnumMetaData(MVMainSearchButtonABTestingGroup.class)));
        enumMap.put(_Fields.MV_USER_PROFILE_ACCESSIBILITY_PREF, new FieldMetaData("mvUserProfileAccessibilityPref", (byte) 3, new EnumMetaData(MVUserProfileAccessibilityPref.class)));
        enumMap.put(_Fields.ADS_CONSENT_LAYOUT_ABTEST_GROUP, new FieldMetaData("adsConsentLayoutABTestGroup", (byte) 3, new EnumMetaData(MVAdsConsentLayoutABTestGroup.class)));
        enumMap.put(_Fields.SUBSCRIPTION_ABTEST_GROUP, new FieldMetaData("subscriptionABTestGroup", (byte) 3, new EnumMetaData(MVSubscriptionsABTestGroup.class)));
        enumMap.put(_Fields.BANNER_DESIGN_ABTEST_GROUP, new FieldMetaData("bannerDesignABTestGroup", (byte) 3, new EnumMetaData(MVBannerDesignABTestGroup.class)));
        enumMap.put(_Fields.ATT_PERMISSIONS_ABTESTING_GROUP, new FieldMetaData("attPermissionsABTestingGroup", (byte) 3, new EnumMetaData(MVATTPermissionsABTestingGroup.class)));
        enumMap.put(_Fields.DIRECT_TO_ITINERARY_ABTEST_GROUP, new FieldMetaData("directToItineraryABTestGroup", (byte) 3, new EnumMetaData(MVDirectToItineraryABTestGroup.class)));
        enumMap.put(_Fields.SMART_COMPONENT_RANDOM_ABTESTING_GROUP, new FieldMetaData("smartComponentRandomABTestingGroup", (byte) 3, new EnumMetaData(MVSmartComponentRandomABTestingGroup.class)));
        enumMap.put(_Fields.LINE_VIEW_WALKTHROUGH_ABTESTING_GROUP, new FieldMetaData("lineViewWalkthroughABTestingGroup", (byte) 3, new EnumMetaData(MVLineViewWalkthroughABTestingGroup.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25273q1 = unmodifiableMap;
        FieldMetaData.m61947a(MVConfiguration.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = 0;
            mo25201C1(new C25112b(new C25276a((InputStream) objectInputStream)));
        } catch (TException e) {
            throw new IOException(e);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            mo25202X0(new C25112b(new C25276a((OutputStream) objectOutputStream)));
        } catch (TException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: A */
    public final boolean mo26474A() {
        return this.GTFS_CONFIG_FILES != null;
    }

    /* renamed from: A0 */
    public final boolean mo26475A0() {
        return C13637c.m34054I(2, this.__isset_bitfield);
    }

    /* renamed from: A1 */
    public final void mo26476A1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 16, true);
    }

    /* renamed from: B0 */
    public final boolean mo26477B0() {
        return C13637c.m34054I(31, this.__isset_bitfield);
    }

    /* renamed from: B1 */
    public final void mo26478B1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 18, true);
    }

    /* renamed from: C0 */
    public final boolean mo26479C0() {
        return C13637c.m34054I(5, this.__isset_bitfield);
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f25270p1.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: D */
    public final boolean mo26480D() {
        return C13637c.m34054I(54, this.__isset_bitfield);
    }

    /* renamed from: D0 */
    public final boolean mo26481D0() {
        return this.onboardingFavoritesTestingGroup != null;
    }

    /* renamed from: D1 */
    public final void mo26482D1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 17, true);
    }

    /* renamed from: E */
    public final boolean mo26483E() {
        return C13637c.m34054I(53, this.__isset_bitfield);
    }

    /* renamed from: E0 */
    public final boolean mo26484E0() {
        return this.PATHWAY_LAYERS_URL != null;
    }

    /* renamed from: E1 */
    public final void mo26485E1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 49, true);
    }

    /* renamed from: F */
    public final boolean mo26486F() {
        return C13637c.m34054I(9, this.__isset_bitfield);
    }

    /* renamed from: F0 */
    public final boolean mo26487F0() {
        return C13637c.m34054I(34, this.__isset_bitfield);
    }

    /* renamed from: F1 */
    public final void mo26488F1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 51, true);
    }

    /* renamed from: G */
    public final boolean mo26489G() {
        return this.homeTabs != null;
    }

    /* renamed from: G0 */
    public final boolean mo26490G0() {
        return C13637c.m34054I(7, this.__isset_bitfield);
    }

    /* renamed from: G1 */
    public final void mo26491G1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 52, true);
    }

    /* renamed from: H */
    public final boolean mo26492H() {
        return this.homeWorkExperiment != null;
    }

    /* renamed from: H0 */
    public final boolean mo26493H0() {
        return C13637c.m34054I(29, this.__isset_bitfield);
    }

    /* renamed from: H1 */
    public final void mo26494H1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 50, true);
    }

    /* renamed from: I */
    public final boolean mo26495I() {
        return C13637c.m34054I(21, this.__isset_bitfield);
    }

    /* renamed from: I0 */
    public final boolean mo26496I0() {
        return C13637c.m34054I(55, this.__isset_bitfield);
    }

    /* renamed from: I1 */
    public final void mo26497I1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 48, true);
    }

    /* renamed from: J */
    public final boolean mo26498J() {
        return C13637c.m34054I(16, this.__isset_bitfield);
    }

    /* renamed from: J0 */
    public final boolean mo26499J0() {
        return C13637c.m34054I(30, this.__isset_bitfield);
    }

    /* renamed from: J1 */
    public final void mo26500J1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 57, true);
    }

    /* renamed from: K1 */
    public final void mo26501K1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 47, true);
    }

    /* renamed from: L */
    public final boolean mo26502L() {
        return C13637c.m34054I(18, this.__isset_bitfield);
    }

    /* renamed from: L0 */
    public final boolean mo26503L0() {
        return C13637c.m34054I(11, this.__isset_bitfield);
    }

    /* renamed from: L1 */
    public final void mo26504L1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 28, true);
    }

    /* renamed from: M */
    public final boolean mo26505M() {
        return C13637c.m34054I(17, this.__isset_bitfield);
    }

    /* renamed from: M0 */
    public final boolean mo26506M0() {
        return this.SUBWAY_LAYER_URL != null;
    }

    /* renamed from: M1 */
    public final void mo26507M1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 22, true);
    }

    /* renamed from: N */
    public final boolean mo26508N() {
        return C13637c.m34054I(49, this.__isset_bitfield);
    }

    /* renamed from: N0 */
    public final boolean mo26509N0() {
        return C13637c.m34054I(10, this.__isset_bitfield);
    }

    /* renamed from: N1 */
    public final void mo26510N1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 8, true);
    }

    /* renamed from: O */
    public final boolean mo26511O() {
        return C13637c.m34054I(51, this.__isset_bitfield);
    }

    /* renamed from: O0 */
    public final boolean mo26512O0() {
        return this.scheduleDisplayExperiment != null;
    }

    /* renamed from: O1 */
    public final void mo26513O1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 59, true);
    }

    /* renamed from: P */
    public final boolean mo26514P() {
        return C13637c.m34054I(52, this.__isset_bitfield);
    }

    /* renamed from: P0 */
    public final boolean mo26515P0() {
        return this.searchExamplesAbTestingGroup != null;
    }

    /* renamed from: P1 */
    public final void mo26516P1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 20, true);
    }

    /* renamed from: Q */
    public final boolean mo26517Q() {
        return C13637c.m34054I(50, this.__isset_bitfield);
    }

    /* renamed from: Q0 */
    public final boolean mo26518Q0() {
        return this.searchLocationHintABTestingType != null;
    }

    /* renamed from: Q1 */
    public final void mo26519Q1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 39, true);
    }

    /* renamed from: R */
    public final boolean mo26520R() {
        return C13637c.m34054I(48, this.__isset_bitfield);
    }

    /* renamed from: R0 */
    public final boolean mo26521R0() {
        return C13637c.m34054I(45, this.__isset_bitfield);
    }

    /* renamed from: R1 */
    public final void mo26522R1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 33, true);
    }

    /* renamed from: S */
    public final boolean mo26523S() {
        return C13637c.m34054I(57, this.__isset_bitfield);
    }

    /* renamed from: S1 */
    public final void mo26524S1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 42, true);
    }

    /* renamed from: T0 */
    public final boolean mo26525T0() {
        return this.sectionsOrder != null;
    }

    /* renamed from: T1 */
    public final void mo26526T1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 12, true);
    }

    /* renamed from: U */
    public final boolean mo26527U() {
        return C13637c.m34054I(47, this.__isset_bitfield);
    }

    /* renamed from: U0 */
    public final boolean mo26528U0() {
        return C13637c.m34054I(46, this.__isset_bitfield);
    }

    /* renamed from: U1 */
    public final void mo26529U1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 13, true);
    }

    /* renamed from: V */
    public final boolean mo26530V() {
        return C13637c.m34054I(28, this.__isset_bitfield);
    }

    /* renamed from: V0 */
    public final boolean mo26531V0() {
        return C13637c.m34054I(43, this.__isset_bitfield);
    }

    /* renamed from: V1 */
    public final void mo26532V1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 32, true);
    }

    /* renamed from: W */
    public final boolean mo26533W() {
        return C13637c.m34054I(22, this.__isset_bitfield);
    }

    /* renamed from: W0 */
    public final boolean mo26534W0() {
        return C13637c.m34054I(44, this.__isset_bitfield);
    }

    /* renamed from: W1 */
    public final void mo26535W1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 0, true);
    }

    /* renamed from: X */
    public final boolean mo26536X() {
        return C13637c.m34054I(8, this.__isset_bitfield);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25270p1.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: X1 */
    public final void mo26537X1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 14, true);
    }

    /* renamed from: Y */
    public final boolean mo26538Y() {
        return C13637c.m34054I(59, this.__isset_bitfield);
    }

    /* renamed from: Y0 */
    public final boolean mo26539Y0() {
        return this.smartComponentRandomABTestingGroup != null;
    }

    /* renamed from: Y1 */
    public final void mo26540Y1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 15, true);
    }

    /* renamed from: Z */
    public final boolean mo26541Z() {
        return C13637c.m34054I(20, this.__isset_bitfield);
    }

    /* renamed from: Z0 */
    public final boolean mo26542Z0() {
        return this.stopViewQuickActions != null;
    }

    /* renamed from: Z1 */
    public final void mo26543Z1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 24, true);
    }

    /* renamed from: a0 */
    public final boolean mo26544a0() {
        return C13637c.m34054I(39, this.__isset_bitfield);
    }

    /* renamed from: a1 */
    public final boolean mo26545a1() {
        return this.subscriptionABTestGroup != null;
    }

    /* renamed from: a2 */
    public final void mo26546a2() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 27, true);
    }

    /* renamed from: b0 */
    public final boolean mo26547b0() {
        return C13637c.m34054I(33, this.__isset_bitfield);
    }

    /* renamed from: b1 */
    public final boolean mo26548b1() {
        return this.suggestedRoutesCellImprovementsExperiment != null;
    }

    /* renamed from: b2 */
    public final void mo26549b2() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 26, true);
    }

    /* renamed from: c0 */
    public final boolean mo26550c0() {
        return C13637c.m34054I(42, this.__isset_bitfield);
    }

    /* renamed from: c1 */
    public final boolean mo26551c1() {
        return this.TIME_DELTA_UPDATES != null;
    }

    /* renamed from: c2 */
    public final void mo26552c2() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 25, true);
    }

    public final int compareTo(Object obj) {
        int e;
        MVConfiguration mVConfiguration = (MVConfiguration) obj;
        if (!getClass().equals(mVConfiguration.getClass())) {
            return getClass().getName().compareTo(mVConfiguration.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26570h0()).compareTo(Boolean.valueOf(mVConfiguration.mo26570h0()));
        if (compareTo != 0 || ((mo26570h0() && (compareTo = C25082a.m62839c(this.latestAppVersionCode, mVConfiguration.latestAppVersionCode)) != 0) || (compareTo = Boolean.valueOf(mo26616t()).compareTo(Boolean.valueOf(mVConfiguration.mo26616t()))) != 0 || ((mo26616t() && (compareTo = this.defaultTripPlanOption.compareTo(mVConfiguration.defaultTripPlanOption)) != 0) || (compareTo = Boolean.valueOf(mo26567g1()).compareTo(Boolean.valueOf(mVConfiguration.mo26567g1()))) != 0 || ((mo26567g1() && (compareTo = C25082a.m62844h(this.twitterPostActivityNames, mVConfiguration.twitterPostActivityNames)) != 0) || (compareTo = Boolean.valueOf(mo26579j0()).compareTo(Boolean.valueOf(mVConfiguration.mo26579j0()))) != 0 || ((mo26579j0() && (compareTo = this.latestRelease_iPhone.compareTo(mVConfiguration.latestRelease_iPhone)) != 0) || (compareTo = Boolean.valueOf(mo26575i0()).compareTo(Boolean.valueOf(mVConfiguration.mo26575i0()))) != 0 || ((mo26575i0() && (compareTo = this.latestRelease_android.compareTo(mVConfiguration.latestRelease_android)) != 0) || (compareTo = Boolean.valueOf(mo26606q1()).compareTo(Boolean.valueOf(mVConfiguration.mo26606q1()))) != 0 || ((mo26606q1() && (compareTo = this.whatsNewURL_iPhone.compareTo(mVConfiguration.whatsNewURL_iPhone)) != 0) || (compareTo = Boolean.valueOf(mo26602p1()).compareTo(Boolean.valueOf(mVConfiguration.mo26602p1()))) != 0 || ((mo26602p1() && (compareTo = this.whatsNewURL_android.compareTo(mVConfiguration.whatsNewURL_android)) != 0) || (compareTo = Boolean.valueOf(mo26625v()).compareTo(Boolean.valueOf(mVConfiguration.mo26625v()))) != 0 || ((mo26625v() && (compareTo = this.feedBackEmailAddress.compareTo(mVConfiguration.feedBackEmailAddress)) != 0) || (compareTo = Boolean.valueOf(mo26576i1()).compareTo(Boolean.valueOf(mVConfiguration.mo26576i1()))) != 0 || ((mo26576i1() && (compareTo = C25082a.m62848l(this.USE_MOOVIT_TILES, mVConfiguration.USE_MOOVIT_TILES)) != 0) || (compareTo = Boolean.valueOf(mo26622u0()).compareTo(Boolean.valueOf(mVConfiguration.mo26622u0()))) != 0 || ((mo26622u0() && (compareTo = this.MOOVIT_TILES_URL.compareTo(mVConfiguration.MOOVIT_TILES_URL)) != 0) || (compareTo = Boolean.valueOf(mo26475A0()).compareTo(Boolean.valueOf(mVConfiguration.mo26475A0()))) != 0 || ((mo26475A0() && (compareTo = C25082a.m62839c(this.near_me_default_stop_radius, mVConfiguration.near_me_default_stop_radius)) != 0) || (compareTo = Boolean.valueOf(mo26640z0()).compareTo(Boolean.valueOf(mVConfiguration.mo26640z0()))) != 0 || ((mo26640z0() && (compareTo = C25082a.m62839c(this.near_me_default_stop_detail_radius, mVConfiguration.near_me_default_stop_detail_radius)) != 0) || (compareTo = Boolean.valueOf(mo26637y0()).compareTo(Boolean.valueOf(mVConfiguration.mo26637y0()))) != 0 || ((mo26637y0() && (compareTo = C25082a.m62839c(this.near_me_default_stop_detail_max_lines, mVConfiguration.near_me_default_stop_detail_max_lines)) != 0) || (compareTo = Boolean.valueOf(mo26479C0()).compareTo(Boolean.valueOf(mVConfiguration.mo26479C0()))) != 0 || ((mo26479C0() && (compareTo = C25082a.m62839c(this.near_me_map_sensitivity, mVConfiguration.near_me_map_sensitivity)) != 0) || (compareTo = Boolean.valueOf(mo26588l1()).compareTo(Boolean.valueOf(mVConfiguration.mo26588l1()))) != 0 || ((mo26588l1() && (compareTo = C25082a.m62838b(this.walking_speed_factor, mVConfiguration.walking_speed_factor)) != 0) || (compareTo = Boolean.valueOf(mo26608r()).compareTo(Boolean.valueOf(mVConfiguration.mo26608r()))) != 0 || ((mo26608r() && (compareTo = this.DEFAULT_INTERMEDIATE_DURATION.compareTo(mVConfiguration.DEFAULT_INTERMEDIATE_DURATION)) != 0) || (compareTo = Boolean.valueOf(mo26551c1()).compareTo(Boolean.valueOf(mVConfiguration.mo26551c1()))) != 0 || ((mo26551c1() && (compareTo = this.TIME_DELTA_UPDATES.compareTo(mVConfiguration.TIME_DELTA_UPDATES)) != 0) || (compareTo = Boolean.valueOf(mo26612s()).compareTo(Boolean.valueOf(mVConfiguration.mo26612s()))) != 0 || ((mo26612s() && (compareTo = this.DISTANCE_DELTA_UPDATES.compareTo(mVConfiguration.DISTANCE_DELTA_UPDATES)) != 0) || (compareTo = Boolean.valueOf(mo26490G0()).compareTo(Boolean.valueOf(mVConfiguration.mo26490G0()))) != 0 || ((mo26490G0() && (compareTo = C25082a.m62839c(this.SCHEDULE_TIME_JOIN_RT_GTFS_SECONDS, mVConfiguration.SCHEDULE_TIME_JOIN_RT_GTFS_SECONDS)) != 0) || (compareTo = Boolean.valueOf(mo26536X()).compareTo(Boolean.valueOf(mVConfiguration.mo26536X()))) != 0 || ((mo26536X() && (compareTo = C25082a.m62848l(this.IS_TAXI_SUPPORT, mVConfiguration.IS_TAXI_SUPPORT)) != 0) || (compareTo = Boolean.valueOf(mo26486F()).compareTo(Boolean.valueOf(mVConfiguration.mo26486F()))) != 0 || ((mo26486F() && (compareTo = C25082a.m62848l(this.HAS_MAP_CAMPAIGNS, mVConfiguration.HAS_MAP_CAMPAIGNS)) != 0) || (compareTo = Boolean.valueOf(mo26509N0()).compareTo(Boolean.valueOf(mVConfiguration.mo26509N0()))) != 0 || ((mo26509N0() && (compareTo = C25082a.m62848l(this.SUPPORT_SERVICE_ALERTS_TAB, mVConfiguration.SUPPORT_SERVICE_ALERTS_TAB)) != 0) || (compareTo = Boolean.valueOf(mo26503L0()).compareTo(Boolean.valueOf(mVConfiguration.mo26503L0()))) != 0 || ((mo26503L0() && (compareTo = C25082a.m62848l(this.STOP_GAME_ENABLED, mVConfiguration.STOP_GAME_ENABLED)) != 0) || (compareTo = Boolean.valueOf(mo26554d0()).compareTo(Boolean.valueOf(mVConfiguration.mo26554d0()))) != 0 || ((mo26554d0() && (compareTo = C25082a.m62848l(this.is_location_triggers_enable, mVConfiguration.is_location_triggers_enable)) != 0) || (compareTo = Boolean.valueOf(mo26557e0()).compareTo(Boolean.valueOf(mVConfiguration.mo26557e0()))) != 0 || ((mo26557e0() && (compareTo = C25082a.m62848l(this.is_topup_tab_enable, mVConfiguration.is_topup_tab_enable)) != 0) || (compareTo = Boolean.valueOf(mo26591m0()).compareTo(Boolean.valueOf(mVConfiguration.mo26591m0()))) != 0 || ((mo26591m0() && (compareTo = C25082a.m62839c(this.location_trigger_dwell_delay_sec, mVConfiguration.location_trigger_dwell_delay_sec)) != 0) || (compareTo = Boolean.valueOf(mo26593n0()).compareTo(Boolean.valueOf(mVConfiguration.mo26593n0()))) != 0 || ((mo26593n0() && (compareTo = C25082a.m62839c(this.location_trigger_geofence_radius_meters, mVConfiguration.location_trigger_geofence_radius_meters)) != 0) || (compareTo = Boolean.valueOf(mo26498J()).compareTo(Boolean.valueOf(mVConfiguration.mo26498J()))) != 0 || ((mo26498J() && (compareTo = C25082a.m62848l(this.IS_BIKE_SHARING_SUPPORT, mVConfiguration.IS_BIKE_SHARING_SUPPORT)) != 0) || (compareTo = Boolean.valueOf(mo26505M()).compareTo(Boolean.valueOf(mVConfiguration.mo26505M()))) != 0 || ((mo26505M() && (compareTo = C25082a.m62848l(this.IS_CAR_SHARING_SUPPORT, mVConfiguration.IS_CAR_SHARING_SUPPORT)) != 0) || (compareTo = Boolean.valueOf(mo26502L()).compareTo(Boolean.valueOf(mVConfiguration.mo26502L()))) != 0 || ((mo26502L() && (compareTo = C25082a.m62848l(this.IS_CAR_POOL_SUPPORT, mVConfiguration.IS_CAR_POOL_SUPPORT)) != 0) || (compareTo = Boolean.valueOf(mo26580j1()).compareTo(Boolean.valueOf(mVConfiguration.mo26580j1()))) != 0 || ((mo26580j1() && (compareTo = C25082a.m62848l(this.USE_ROLLOUT, mVConfiguration.USE_ROLLOUT)) != 0) || (compareTo = Boolean.valueOf(mo26541Z()).compareTo(Boolean.valueOf(mVConfiguration.mo26541Z()))) != 0 || ((mo26541Z() && (compareTo = C25082a.m62848l(this.IS_TRIP_PLAN_RATING_SUPPORT, mVConfiguration.IS_TRIP_PLAN_RATING_SUPPORT)) != 0) || (compareTo = Boolean.valueOf(mo26563f1()).compareTo(Boolean.valueOf(mVConfiguration.mo26563f1()))) != 0 || ((mo26563f1() && (compareTo = this.topup_tab_link.compareTo(mVConfiguration.topup_tab_link)) != 0) || (compareTo = Boolean.valueOf(mo26495I()).compareTo(Boolean.valueOf(mVConfiguration.mo26495I()))) != 0 || ((mo26495I() && (compareTo = C25082a.m62848l(this.IS_ADS_SUPPORT, mVConfiguration.IS_ADS_SUPPORT)) != 0) || (compareTo = Boolean.valueOf(mo26506M0()).compareTo(Boolean.valueOf(mVConfiguration.mo26506M0()))) != 0 || ((mo26506M0() && (compareTo = this.SUBWAY_LAYER_URL.compareTo(mVConfiguration.SUBWAY_LAYER_URL)) != 0) || (compareTo = Boolean.valueOf(mo26484E0()).compareTo(Boolean.valueOf(mVConfiguration.mo26484E0()))) != 0 || ((mo26484E0() && (compareTo = this.PATHWAY_LAYERS_URL.compareTo(mVConfiguration.PATHWAY_LAYERS_URL)) != 0) || (compareTo = Boolean.valueOf(mo26533W()).compareTo(Boolean.valueOf(mVConfiguration.mo26533W()))) != 0 || ((mo26533W() && (compareTo = C25082a.m62848l(this.IS_STOP_MAP_ITEMS_PRELOAD_SUPPORTED, mVConfiguration.IS_STOP_MAP_ITEMS_PRELOAD_SUPPORTED)) != 0) || (compareTo = Boolean.valueOf(mo26565g()).compareTo(Boolean.valueOf(mVConfiguration.mo26565g()))) != 0 || ((mo26565g() && (compareTo = this.additionalTab.compareTo(mVConfiguration.additionalTab)) != 0) || (compareTo = Boolean.valueOf(mo26569h()).compareTo(Boolean.valueOf(mVConfiguration.mo26569h()))) != 0 || ((mo26569h() && (compareTo = C25082a.m62839c(this.additionalTabPosition, mVConfiguration.additionalTabPosition)) != 0) || (compareTo = Boolean.valueOf(mo26605q0()).compareTo(Boolean.valueOf(mVConfiguration.mo26605q0()))) != 0 || ((mo26605q0() && (compareTo = C25082a.m62847k(this.MAX_ZOOM_FOR_SUBWAY_LAYER, mVConfiguration.MAX_ZOOM_FOR_SUBWAY_LAYER)) != 0) || (compareTo = Boolean.valueOf(mo26617t0()).compareTo(Boolean.valueOf(mVConfiguration.mo26617t0()))) != 0 || ((mo26617t0() && (compareTo = C25082a.m62847k(this.MIN_ZOOM_FOR_SUBWAY_LAYER, mVConfiguration.MIN_ZOOM_FOR_SUBWAY_LAYER)) != 0) || (compareTo = Boolean.valueOf(mo26597o0()).compareTo(Boolean.valueOf(mVConfiguration.mo26597o0()))) != 0 || ((mo26597o0() && (compareTo = this.MAP_IMPL_TYPE.compareTo(mVConfiguration.MAP_IMPL_TYPE)) != 0) || (compareTo = Boolean.valueOf(mo26613s0()).compareTo(Boolean.valueOf(mVConfiguration.mo26613s0()))) != 0 || ((mo26613s0() && (compareTo = C25082a.m62839c(this.MIN_ARRIVALS_TO_RETRIEVE, mVConfiguration.MIN_ARRIVALS_TO_RETRIEVE)) != 0) || (compareTo = Boolean.valueOf(mo26609r0()).compareTo(Boolean.valueOf(mVConfiguration.mo26609r0()))) != 0 || ((mo26609r0() && (compareTo = C25082a.m62839c(this.MINUTES_CONSIDER_ARRIVALS, mVConfiguration.MINUTES_CONSIDER_ARRIVALS)) != 0) || (compareTo = Boolean.valueOf(mo26530V()).compareTo(Boolean.valueOf(mVConfiguration.mo26530V()))) != 0 || ((mo26530V() && (compareTo = C25082a.m62848l(this.IS_STOP_EDITING_SUPPORTED, mVConfiguration.IS_STOP_EDITING_SUPPORTED)) != 0) || (compareTo = Boolean.valueOf(mo26493H0()).compareTo(Boolean.valueOf(mVConfiguration.mo26493H0()))) != 0 || ((mo26493H0() && (compareTo = C25082a.m62839c(this.SEARCH_LAST_INTERVAL_IN_SECONDS, mVConfiguration.SEARCH_LAST_INTERVAL_IN_SECONDS)) != 0) || (compareTo = Boolean.valueOf(mo26499J0()).compareTo(Boolean.valueOf(mVConfiguration.mo26499J0()))) != 0 || ((mo26499J0() && (compareTo = C25082a.m62848l(this.SHOW_NEW_ITINERARIES_HINT, mVConfiguration.SHOW_NEW_ITINERARIES_HINT)) != 0) || (compareTo = Boolean.valueOf(mo26558e1()).compareTo(Boolean.valueOf(mVConfiguration.mo26558e1()))) != 0 || ((mo26558e1() && (compareTo = this.TopUpText.compareTo(mVConfiguration.TopUpText)) != 0) || (compareTo = Boolean.valueOf(mo26590m()).compareTo(Boolean.valueOf(mVConfiguration.mo26590m()))) != 0 || ((mo26590m() && (compareTo = this.CarPoolAttributionImageUrl.compareTo(mVConfiguration.CarPoolAttributionImageUrl)) != 0) || (compareTo = Boolean.valueOf(mo26596o()).compareTo(Boolean.valueOf(mVConfiguration.mo26596o()))) != 0 || ((mo26596o() && (compareTo = this.CarPoolAttributionText.compareTo(mVConfiguration.CarPoolAttributionText)) != 0) || (compareTo = Boolean.valueOf(mo26601p0()).compareTo(Boolean.valueOf(mVConfiguration.mo26601p0()))) != 0 || ((mo26601p0() && (compareTo = this.MAP_IMPL_TYPE_V5.compareTo(mVConfiguration.MAP_IMPL_TYPE_V5)) != 0) || (compareTo = Boolean.valueOf(mo26477B0()).compareTo(Boolean.valueOf(mVConfiguration.mo26477B0()))) != 0 || ((mo26477B0() && (compareTo = C25082a.m62839c(this.near_me_favorite_stop_detail_max_lines, mVConfiguration.near_me_favorite_stop_detail_max_lines)) != 0) || (compareTo = Boolean.valueOf(mo26562f0()).compareTo(Boolean.valueOf(mVConfiguration.mo26562f0()))) != 0 || ((mo26562f0() && (compareTo = C25082a.m62848l(this.is_trip_plan_car_pool_experiment_on, mVConfiguration.is_trip_plan_car_pool_experiment_on)) != 0) || (compareTo = Boolean.valueOf(mo26547b0()).compareTo(Boolean.valueOf(mVConfiguration.mo26547b0()))) != 0 || ((mo26547b0() && (compareTo = C25082a.m62848l(this.isInterstitialAdsSupported, mVConfiguration.isInterstitialAdsSupported)) != 0) || (compareTo = Boolean.valueOf(mo26487F0()).compareTo(Boolean.valueOf(mVConfiguration.mo26487F0()))) != 0 || ((mo26487F0() && (compareTo = C25082a.m62839c(this.PCT_OF_SERVER_LOG, mVConfiguration.PCT_OF_SERVER_LOG)) != 0) || (compareTo = Boolean.valueOf(mo26584k1()).compareTo(Boolean.valueOf(mVConfiguration.mo26584k1()))) != 0 || ((mo26584k1() && (compareTo = C25082a.m62848l(this.USE_SERVER_FOR_FORWARD_GEOCODE, mVConfiguration.USE_SERVER_FOR_FORWARD_GEOCODE)) != 0) || (compareTo = Boolean.valueOf(mo26561f()).compareTo(Boolean.valueOf(mVConfiguration.mo26561f()))) != 0 || ((mo26561f() && (compareTo = C25082a.m62839c(this.ACTIVE_PROFILER_PCT, mVConfiguration.ACTIVE_PROFILER_PCT)) != 0) || (compareTo = Boolean.valueOf(mo26600p()).compareTo(Boolean.valueOf(mVConfiguration.mo26600p()))) != 0 || ((mo26600p() && (compareTo = C25082a.m62848l(this.carPoolReferralIndication, mVConfiguration.carPoolReferralIndication)) != 0) || (compareTo = Boolean.valueOf(mo26633x0()).compareTo(Boolean.valueOf(mVConfiguration.mo26633x0()))) != 0 || ((mo26633x0() && (compareTo = C25082a.m62848l(this.NEAR_ME_RT_ENABLED, mVConfiguration.NEAR_ME_RT_ENABLED)) != 0) || (compareTo = Boolean.valueOf(mo26544a0()).compareTo(Boolean.valueOf(mVConfiguration.mo26544a0()))) != 0 || ((mo26544a0() && (compareTo = C25082a.m62848l(this.IS_USER_REPORTS_ENABLED, mVConfiguration.IS_USER_REPORTS_ENABLED)) != 0) || (compareTo = Boolean.valueOf(mo26636y()).compareTo(Boolean.valueOf(mVConfiguration.mo26636y()))) != 0 || ((mo26636y() && (compareTo = C25082a.m62839c(this.fgWifiScanSec, mVConfiguration.fgWifiScanSec)) != 0) || (compareTo = Boolean.valueOf(mo26629w()).compareTo(Boolean.valueOf(mVConfiguration.mo26629w()))) != 0 || ((mo26629w() && (compareTo = C25082a.m62839c(this.fgBeaconScanSec, mVConfiguration.fgBeaconScanSec)) != 0) || (compareTo = Boolean.valueOf(mo26550c0()).compareTo(Boolean.valueOf(mVConfiguration.mo26550c0()))) != 0 || ((mo26550c0() && (compareTo = C25082a.m62848l(this.isReportMetrics, mVConfiguration.isReportMetrics)) != 0) || (compareTo = Boolean.valueOf(mo26531V0()).compareTo(Boolean.valueOf(mVConfiguration.mo26531V0()))) != 0 || ((mo26531V0() && (compareTo = C25082a.m62848l(this.showCommunitySection, mVConfiguration.showCommunitySection)) != 0) || (compareTo = Boolean.valueOf(mo26534W0()).compareTo(Boolean.valueOf(mVConfiguration.mo26534W0()))) != 0 || ((mo26534W0() && (compareTo = C25082a.m62848l(this.showRideRequestSection, mVConfiguration.showRideRequestSection)) != 0) || (compareTo = Boolean.valueOf(mo26521R0()).compareTo(Boolean.valueOf(mVConfiguration.mo26521R0()))) != 0 || ((mo26521R0() && (compareTo = C25082a.m62839c(this.searchMaxFutureDays, mVConfiguration.searchMaxFutureDays)) != 0) || (compareTo = Boolean.valueOf(mo26489G()).compareTo(Boolean.valueOf(mVConfiguration.mo26489G()))) != 0 || ((mo26489G() && (compareTo = C25082a.m62844h(this.homeTabs, mVConfiguration.homeTabs)) != 0) || (compareTo = Boolean.valueOf(mo26528U0()).compareTo(Boolean.valueOf(mVConfiguration.mo26528U0()))) != 0 || ((mo26528U0() && (compareTo = C25082a.m62848l(this.service_status_card_is_subway, mVConfiguration.service_status_card_is_subway)) != 0) || (compareTo = Boolean.valueOf(mo26525T0()).compareTo(Boolean.valueOf(mVConfiguration.mo26525T0()))) != 0 || ((mo26525T0() && (compareTo = C25082a.m62844h(this.sectionsOrder, mVConfiguration.sectionsOrder)) != 0) || (compareTo = Boolean.valueOf(mo26512O0()).compareTo(Boolean.valueOf(mVConfiguration.mo26512O0()))) != 0 || ((mo26512O0() && (compareTo = C25082a.m62841e(this.scheduleDisplayExperiment, mVConfiguration.scheduleDisplayExperiment)) != 0) || (compareTo = Boolean.valueOf(mo26527U()).compareTo(Boolean.valueOf(mVConfiguration.mo26527U()))) != 0 || ((mo26527U() && (compareTo = C25082a.m62848l(this.IS_RIDE_SHARING_SUPPORT, mVConfiguration.IS_RIDE_SHARING_SUPPORT)) != 0) || (compareTo = Boolean.valueOf(mo26520R()).compareTo(Boolean.valueOf(mVConfiguration.mo26520R()))) != 0 || ((mo26520R() && (compareTo = C25082a.m62848l(this.IS_FREQUENCY_SUPPORTED, mVConfiguration.IS_FREQUENCY_SUPPORTED)) != 0) || (compareTo = Boolean.valueOf(mo26508N()).compareTo(Boolean.valueOf(mVConfiguration.mo26508N()))) != 0 || ((mo26508N() && (compareTo = C25082a.m62848l(this.IS_DOCKLESS_BIKES_SUPPORTED, mVConfiguration.IS_DOCKLESS_BIKES_SUPPORTED)) != 0) || (compareTo = Boolean.valueOf(mo26517Q()).compareTo(Boolean.valueOf(mVConfiguration.mo26517Q()))) != 0 || ((mo26517Q() && (compareTo = C25082a.m62848l(this.IS_DOCKLESS_SCOOTERS_SUPPORTED, mVConfiguration.IS_DOCKLESS_SCOOTERS_SUPPORTED)) != 0) || (compareTo = Boolean.valueOf(mo26511O()).compareTo(Boolean.valueOf(mVConfiguration.mo26511O()))) != 0 || ((mo26511O() && (compareTo = C25082a.m62848l(this.IS_DOCKLESS_KICK_SCOOTERS_SUPPORTED, mVConfiguration.IS_DOCKLESS_KICK_SCOOTERS_SUPPORTED)) != 0) || (compareTo = Boolean.valueOf(mo26514P()).compareTo(Boolean.valueOf(mVConfiguration.mo26514P()))) != 0 || ((mo26514P() && (compareTo = C25082a.m62848l(this.IS_DOCKLESS_MOPED_SUPPORTED, mVConfiguration.IS_DOCKLESS_MOPED_SUPPORTED)) != 0) || (compareTo = Boolean.valueOf(mo26474A()).compareTo(Boolean.valueOf(mVConfiguration.mo26474A()))) != 0 || ((mo26474A() && (compareTo = C25082a.m62843g(this.GTFS_CONFIG_FILES, mVConfiguration.GTFS_CONFIG_FILES)) != 0) || (compareTo = Boolean.valueOf(mo26483E()).compareTo(Boolean.valueOf(mVConfiguration.mo26483E()))) != 0 || ((mo26483E() && (compareTo = C25082a.m62839c(this.GTFS_CONFIG_GRAPH_NUM_OF_DAYS, mVConfiguration.GTFS_CONFIG_GRAPH_NUM_OF_DAYS)) != 0) || (compareTo = Boolean.valueOf(mo26480D()).compareTo(Boolean.valueOf(mVConfiguration.mo26480D()))) != 0 || ((mo26480D() && (compareTo = C25082a.m62839c(this.GTFS_CONFIG_GRAPH_HOURS, mVConfiguration.GTFS_CONFIG_GRAPH_HOURS)) != 0) || (compareTo = Boolean.valueOf(mo26496I0()).compareTo(Boolean.valueOf(mVConfiguration.mo26496I0()))) != 0 || ((mo26496I0() && (compareTo = C25082a.m62839c(this.SEARCH_LOCATIONS_DELAY, mVConfiguration.SEARCH_LOCATIONS_DELAY)) != 0) || (compareTo = Boolean.valueOf(mo26555d1()).compareTo(Boolean.valueOf(mVConfiguration.mo26555d1()))) != 0 || ((mo26555d1() && (compareTo = C25082a.m62848l(this.TRIP_PLAN_PERSONALIZATION_POPUP_ENABLED, mVConfiguration.TRIP_PLAN_PERSONALIZATION_POPUP_ENABLED)) != 0) || (compareTo = Boolean.valueOf(mo26548b1()).compareTo(Boolean.valueOf(mVConfiguration.mo26548b1()))) != 0 || ((mo26548b1() && (compareTo = C25082a.m62841e(this.suggestedRoutesCellImprovementsExperiment, mVConfiguration.suggestedRoutesCellImprovementsExperiment)) != 0) || (compareTo = Boolean.valueOf(mo26492H()).compareTo(Boolean.valueOf(mVConfiguration.mo26492H()))) != 0 || ((mo26492H() && (compareTo = C25082a.m62841e(this.homeWorkExperiment, mVConfiguration.homeWorkExperiment)) != 0) || (compareTo = Boolean.valueOf(mo26523S()).compareTo(Boolean.valueOf(mVConfiguration.mo26523S()))) != 0 || ((mo26523S() && (compareTo = C25082a.m62848l(this.IS_PRIVATE_BIKE_SUPPORTED, mVConfiguration.IS_PRIVATE_BIKE_SUPPORTED)) != 0) || (compareTo = Boolean.valueOf(mo26571h1()).compareTo(Boolean.valueOf(mVConfiguration.mo26571h1()))) != 0 || ((mo26571h1() && (compareTo = C25082a.m62848l(this.USE_GOOGLE_PLACES, mVConfiguration.USE_GOOGLE_PLACES)) != 0) || (compareTo = Boolean.valueOf(mo26604q()).compareTo(Boolean.valueOf(mVConfiguration.mo26604q()))) != 0 || ((mo26604q() && (compareTo = C25082a.m62844h(this.DASHBOARD_SECTIONS, mVConfiguration.DASHBOARD_SECTIONS)) != 0) || (compareTo = Boolean.valueOf(mo26598o1()).compareTo(Boolean.valueOf(mVConfiguration.mo26598o1()))) != 0 || ((mo26598o1() && (compareTo = C25082a.m62843g(this.wazeCarpoolInstallationLink, mVConfiguration.wazeCarpoolInstallationLink)) != 0) || (compareTo = Boolean.valueOf(mo26594n1()).compareTo(Boolean.valueOf(mVConfiguration.mo26594n1()))) != 0 || ((mo26594n1() && (compareTo = C25082a.m62843g(this.wazeCarpoolDeepLink, mVConfiguration.wazeCarpoolDeepLink)) != 0) || (compareTo = Boolean.valueOf(mo26538Y()).compareTo(Boolean.valueOf(mVConfiguration.mo26538Y()))) != 0 || ((mo26538Y() && (compareTo = C25082a.m62848l(this.IS_TICKETING_V2_SUPPORTED, mVConfiguration.IS_TICKETING_V2_SUPPORTED)) != 0) || (compareTo = Boolean.valueOf(mo26578j()).compareTo(Boolean.valueOf(mVConfiguration.mo26578j()))) != 0 || ((mo26578j() && (compareTo = C25082a.m62841e(this.arExperiment, mVConfiguration.arExperiment)) != 0) || (compareTo = Boolean.valueOf(mo26566g0()).compareTo(Boolean.valueOf(mVConfiguration.mo26566g0()))) != 0 || ((mo26566g0() && (compareTo = C25082a.m62844h(this.itineraryQuickActions, mVConfiguration.itineraryQuickActions)) != 0) || (compareTo = Boolean.valueOf(mo26583k0()).compareTo(Boolean.valueOf(mVConfiguration.mo26583k0()))) != 0 || ((mo26583k0() && (compareTo = C25082a.m62844h(this.lineViewQuickActions, mVConfiguration.lineViewQuickActions)) != 0) || (compareTo = Boolean.valueOf(mo26542Z0()).compareTo(Boolean.valueOf(mVConfiguration.mo26542Z0()))) != 0 || ((mo26542Z0() && (compareTo = C25082a.m62844h(this.stopViewQuickActions, mVConfiguration.stopViewQuickActions)) != 0) || (compareTo = Boolean.valueOf(mo26481D0()).compareTo(Boolean.valueOf(mVConfiguration.mo26481D0()))) != 0 || ((mo26481D0() && (compareTo = C25082a.m62841e(this.onboardingFavoritesTestingGroup, mVConfiguration.onboardingFavoritesTestingGroup)) != 0) || (compareTo = Boolean.valueOf(mo26515P0()).compareTo(Boolean.valueOf(mVConfiguration.mo26515P0()))) != 0 || ((mo26515P0() && (compareTo = C25082a.m62841e(this.searchExamplesAbTestingGroup, mVConfiguration.searchExamplesAbTestingGroup)) != 0) || (compareTo = Boolean.valueOf(mo26518Q0()).compareTo(Boolean.valueOf(mVConfiguration.mo26518Q0()))) != 0 || ((mo26518Q0() && (compareTo = C25082a.m62841e(this.searchLocationHintABTestingType, mVConfiguration.searchLocationHintABTestingType)) != 0) || (compareTo = Boolean.valueOf(mo26626v0()).compareTo(Boolean.valueOf(mVConfiguration.mo26626v0()))) != 0 || ((mo26626v0() && (compareTo = C25082a.m62841e(this.mainSearchButtonABTestingGroup, mVConfiguration.mainSearchButtonABTestingGroup)) != 0) || (compareTo = Boolean.valueOf(mo26630w0()).compareTo(Boolean.valueOf(mVConfiguration.mo26630w0()))) != 0 || ((mo26630w0() && (compareTo = C25082a.m62841e(this.mvUserProfileAccessibilityPref, mVConfiguration.mvUserProfileAccessibilityPref)) != 0) || (compareTo = Boolean.valueOf(mo26574i()).compareTo(Boolean.valueOf(mVConfiguration.mo26574i()))) != 0 || ((mo26574i() && (compareTo = C25082a.m62841e(this.adsConsentLayoutABTestGroup, mVConfiguration.adsConsentLayoutABTestGroup)) != 0) || (compareTo = Boolean.valueOf(mo26545a1()).compareTo(Boolean.valueOf(mVConfiguration.mo26545a1()))) != 0 || ((mo26545a1() && (compareTo = C25082a.m62841e(this.subscriptionABTestGroup, mVConfiguration.subscriptionABTestGroup)) != 0) || (compareTo = Boolean.valueOf(mo26586l()).compareTo(Boolean.valueOf(mVConfiguration.mo26586l()))) != 0 || ((mo26586l() && (compareTo = C25082a.m62841e(this.bannerDesignABTestGroup, mVConfiguration.bannerDesignABTestGroup)) != 0) || (compareTo = Boolean.valueOf(mo26582k()).compareTo(Boolean.valueOf(mVConfiguration.mo26582k()))) != 0 || ((mo26582k() && (compareTo = C25082a.m62841e(this.attPermissionsABTestingGroup, mVConfiguration.attPermissionsABTestingGroup)) != 0) || (compareTo = Boolean.valueOf(mo26621u()).compareTo(Boolean.valueOf(mVConfiguration.mo26621u()))) != 0 || ((mo26621u() && (compareTo = C25082a.m62841e(this.directToItineraryABTestGroup, mVConfiguration.directToItineraryABTestGroup)) != 0) || (compareTo = Boolean.valueOf(mo26539Y0()).compareTo(Boolean.valueOf(mVConfiguration.mo26539Y0()))) != 0 || ((mo26539Y0() && (compareTo = C25082a.m62841e(this.smartComponentRandomABTestingGroup, mVConfiguration.smartComponentRandomABTestingGroup)) != 0) || (compareTo = Boolean.valueOf(mo26587l0()).compareTo(Boolean.valueOf(mVConfiguration.mo26587l0()))) != 0))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))) {
            return compareTo;
        }
        if (!mo26587l0() || (e = C25082a.m62841e(this.lineViewWalkthroughABTestingGroup, mVConfiguration.lineViewWalkthroughABTestingGroup)) == 0) {
            return 0;
        }
        return e;
    }

    /* renamed from: d0 */
    public final boolean mo26554d0() {
        return C13637c.m34054I(12, this.__isset_bitfield);
    }

    /* renamed from: d1 */
    public final boolean mo26555d1() {
        return C13637c.m34054I(56, this.__isset_bitfield);
    }

    /* renamed from: d2 */
    public final void mo26556d2() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 38, true);
    }

    /* renamed from: e0 */
    public final boolean mo26557e0() {
        return C13637c.m34054I(13, this.__isset_bitfield);
    }

    /* renamed from: e1 */
    public final boolean mo26558e1() {
        return this.TopUpText != null;
    }

    /* renamed from: e2 */
    public final void mo26559e2() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 4, true);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVConfiguration)) {
            return false;
        }
        MVConfiguration mVConfiguration = (MVConfiguration) obj;
        if (this.latestAppVersionCode != mVConfiguration.latestAppVersionCode) {
            return false;
        }
        boolean t = mo26616t();
        boolean t2 = mVConfiguration.mo26616t();
        if ((t || t2) && (!t || !t2 || !this.defaultTripPlanOption.equals(mVConfiguration.defaultTripPlanOption))) {
            return false;
        }
        boolean g1 = mo26567g1();
        boolean g12 = mVConfiguration.mo26567g1();
        if ((g1 || g12) && (!g1 || !g12 || !this.twitterPostActivityNames.equals(mVConfiguration.twitterPostActivityNames))) {
            return false;
        }
        boolean j0 = mo26579j0();
        boolean j02 = mVConfiguration.mo26579j0();
        if ((j0 || j02) && (!j0 || !j02 || !this.latestRelease_iPhone.equals(mVConfiguration.latestRelease_iPhone))) {
            return false;
        }
        boolean i0 = mo26575i0();
        boolean i02 = mVConfiguration.mo26575i0();
        if ((i0 || i02) && (!i0 || !i02 || !this.latestRelease_android.equals(mVConfiguration.latestRelease_android))) {
            return false;
        }
        boolean q1 = mo26606q1();
        boolean q12 = mVConfiguration.mo26606q1();
        if ((q1 || q12) && (!q1 || !q12 || !this.whatsNewURL_iPhone.equals(mVConfiguration.whatsNewURL_iPhone))) {
            return false;
        }
        boolean p1 = mo26602p1();
        boolean p12 = mVConfiguration.mo26602p1();
        if ((p1 || p12) && (!p1 || !p12 || !this.whatsNewURL_android.equals(mVConfiguration.whatsNewURL_android))) {
            return false;
        }
        boolean v = mo26625v();
        boolean v2 = mVConfiguration.mo26625v();
        if (((v || v2) && (!v || !v2 || !this.feedBackEmailAddress.equals(mVConfiguration.feedBackEmailAddress))) || this.USE_MOOVIT_TILES != mVConfiguration.USE_MOOVIT_TILES) {
            return false;
        }
        boolean u0 = mo26622u0();
        boolean u02 = mVConfiguration.mo26622u0();
        if (((u0 || u02) && (!u0 || !u02 || !this.MOOVIT_TILES_URL.equals(mVConfiguration.MOOVIT_TILES_URL))) || this.near_me_default_stop_radius != mVConfiguration.near_me_default_stop_radius || this.near_me_default_stop_detail_radius != mVConfiguration.near_me_default_stop_detail_radius || this.near_me_default_stop_detail_max_lines != mVConfiguration.near_me_default_stop_detail_max_lines || this.near_me_map_sensitivity != mVConfiguration.near_me_map_sensitivity || this.walking_speed_factor != mVConfiguration.walking_speed_factor) {
            return false;
        }
        boolean r = mo26608r();
        boolean r2 = mVConfiguration.mo26608r();
        if ((r || r2) && (!r || !r2 || !this.DEFAULT_INTERMEDIATE_DURATION.equals(mVConfiguration.DEFAULT_INTERMEDIATE_DURATION))) {
            return false;
        }
        boolean c1 = mo26551c1();
        boolean c12 = mVConfiguration.mo26551c1();
        if ((c1 || c12) && (!c1 || !c12 || !this.TIME_DELTA_UPDATES.equals(mVConfiguration.TIME_DELTA_UPDATES))) {
            return false;
        }
        boolean s = mo26612s();
        boolean s2 = mVConfiguration.mo26612s();
        if (((s || s2) && (!s || !s2 || !this.DISTANCE_DELTA_UPDATES.equals(mVConfiguration.DISTANCE_DELTA_UPDATES))) || this.SCHEDULE_TIME_JOIN_RT_GTFS_SECONDS != mVConfiguration.SCHEDULE_TIME_JOIN_RT_GTFS_SECONDS || this.IS_TAXI_SUPPORT != mVConfiguration.IS_TAXI_SUPPORT || this.HAS_MAP_CAMPAIGNS != mVConfiguration.HAS_MAP_CAMPAIGNS || this.SUPPORT_SERVICE_ALERTS_TAB != mVConfiguration.SUPPORT_SERVICE_ALERTS_TAB || this.STOP_GAME_ENABLED != mVConfiguration.STOP_GAME_ENABLED || this.is_location_triggers_enable != mVConfiguration.is_location_triggers_enable || this.is_topup_tab_enable != mVConfiguration.is_topup_tab_enable || this.location_trigger_dwell_delay_sec != mVConfiguration.location_trigger_dwell_delay_sec || this.location_trigger_geofence_radius_meters != mVConfiguration.location_trigger_geofence_radius_meters || this.IS_BIKE_SHARING_SUPPORT != mVConfiguration.IS_BIKE_SHARING_SUPPORT || this.IS_CAR_SHARING_SUPPORT != mVConfiguration.IS_CAR_SHARING_SUPPORT || this.IS_CAR_POOL_SUPPORT != mVConfiguration.IS_CAR_POOL_SUPPORT || this.USE_ROLLOUT != mVConfiguration.USE_ROLLOUT || this.IS_TRIP_PLAN_RATING_SUPPORT != mVConfiguration.IS_TRIP_PLAN_RATING_SUPPORT) {
            return false;
        }
        boolean f1 = mo26563f1();
        boolean f12 = mVConfiguration.mo26563f1();
        if (((f1 || f12) && (!f1 || !f12 || !this.topup_tab_link.equals(mVConfiguration.topup_tab_link))) || this.IS_ADS_SUPPORT != mVConfiguration.IS_ADS_SUPPORT) {
            return false;
        }
        boolean M0 = mo26506M0();
        boolean M02 = mVConfiguration.mo26506M0();
        if ((M0 || M02) && (!M0 || !M02 || !this.SUBWAY_LAYER_URL.equals(mVConfiguration.SUBWAY_LAYER_URL))) {
            return false;
        }
        boolean E0 = mo26484E0();
        boolean E02 = mVConfiguration.mo26484E0();
        if (((E0 || E02) && (!E0 || !E02 || !this.PATHWAY_LAYERS_URL.equals(mVConfiguration.PATHWAY_LAYERS_URL))) || this.IS_STOP_MAP_ITEMS_PRELOAD_SUPPORTED != mVConfiguration.IS_STOP_MAP_ITEMS_PRELOAD_SUPPORTED) {
            return false;
        }
        boolean g = mo26565g();
        boolean g2 = mVConfiguration.mo26565g();
        if (((g || g2) && (!g || !g2 || !this.additionalTab.equals(mVConfiguration.additionalTab))) || this.additionalTabPosition != mVConfiguration.additionalTabPosition || this.MAX_ZOOM_FOR_SUBWAY_LAYER != mVConfiguration.MAX_ZOOM_FOR_SUBWAY_LAYER || this.MIN_ZOOM_FOR_SUBWAY_LAYER != mVConfiguration.MIN_ZOOM_FOR_SUBWAY_LAYER) {
            return false;
        }
        boolean o0 = mo26597o0();
        boolean o02 = mVConfiguration.mo26597o0();
        if (((o0 || o02) && (!o0 || !o02 || !this.MAP_IMPL_TYPE.equals(mVConfiguration.MAP_IMPL_TYPE))) || this.MIN_ARRIVALS_TO_RETRIEVE != mVConfiguration.MIN_ARRIVALS_TO_RETRIEVE || this.MINUTES_CONSIDER_ARRIVALS != mVConfiguration.MINUTES_CONSIDER_ARRIVALS || this.IS_STOP_EDITING_SUPPORTED != mVConfiguration.IS_STOP_EDITING_SUPPORTED || this.SEARCH_LAST_INTERVAL_IN_SECONDS != mVConfiguration.SEARCH_LAST_INTERVAL_IN_SECONDS || this.SHOW_NEW_ITINERARIES_HINT != mVConfiguration.SHOW_NEW_ITINERARIES_HINT) {
            return false;
        }
        boolean e1 = mo26558e1();
        boolean e12 = mVConfiguration.mo26558e1();
        if ((e1 || e12) && (!e1 || !e12 || !this.TopUpText.equals(mVConfiguration.TopUpText))) {
            return false;
        }
        boolean m = mo26590m();
        boolean m2 = mVConfiguration.mo26590m();
        if ((m || m2) && (!m || !m2 || !this.CarPoolAttributionImageUrl.equals(mVConfiguration.CarPoolAttributionImageUrl))) {
            return false;
        }
        boolean o = mo26596o();
        boolean o2 = mVConfiguration.mo26596o();
        if ((o || o2) && (!o || !o2 || !this.CarPoolAttributionText.equals(mVConfiguration.CarPoolAttributionText))) {
            return false;
        }
        boolean p0 = mo26601p0();
        boolean p02 = mVConfiguration.mo26601p0();
        if (((p0 || p02) && (!p0 || !p02 || !this.MAP_IMPL_TYPE_V5.equals(mVConfiguration.MAP_IMPL_TYPE_V5))) || this.near_me_favorite_stop_detail_max_lines != mVConfiguration.near_me_favorite_stop_detail_max_lines || this.is_trip_plan_car_pool_experiment_on != mVConfiguration.is_trip_plan_car_pool_experiment_on || this.isInterstitialAdsSupported != mVConfiguration.isInterstitialAdsSupported || this.PCT_OF_SERVER_LOG != mVConfiguration.PCT_OF_SERVER_LOG || this.USE_SERVER_FOR_FORWARD_GEOCODE != mVConfiguration.USE_SERVER_FOR_FORWARD_GEOCODE || this.ACTIVE_PROFILER_PCT != mVConfiguration.ACTIVE_PROFILER_PCT || this.carPoolReferralIndication != mVConfiguration.carPoolReferralIndication || this.NEAR_ME_RT_ENABLED != mVConfiguration.NEAR_ME_RT_ENABLED || this.IS_USER_REPORTS_ENABLED != mVConfiguration.IS_USER_REPORTS_ENABLED || this.fgWifiScanSec != mVConfiguration.fgWifiScanSec || this.fgBeaconScanSec != mVConfiguration.fgBeaconScanSec || this.isReportMetrics != mVConfiguration.isReportMetrics || this.showCommunitySection != mVConfiguration.showCommunitySection || this.showRideRequestSection != mVConfiguration.showRideRequestSection || this.searchMaxFutureDays != mVConfiguration.searchMaxFutureDays) {
            return false;
        }
        boolean G = mo26489G();
        boolean G2 = mVConfiguration.mo26489G();
        if (((G || G2) && (!G || !G2 || !this.homeTabs.equals(mVConfiguration.homeTabs))) || this.service_status_card_is_subway != mVConfiguration.service_status_card_is_subway) {
            return false;
        }
        boolean T0 = mo26525T0();
        boolean T02 = mVConfiguration.mo26525T0();
        if ((T0 || T02) && (!T0 || !T02 || !this.sectionsOrder.equals(mVConfiguration.sectionsOrder))) {
            return false;
        }
        boolean O0 = mo26512O0();
        boolean O02 = mVConfiguration.mo26512O0();
        if (((O0 || O02) && (!O0 || !O02 || !this.scheduleDisplayExperiment.equals(mVConfiguration.scheduleDisplayExperiment))) || this.IS_RIDE_SHARING_SUPPORT != mVConfiguration.IS_RIDE_SHARING_SUPPORT || this.IS_FREQUENCY_SUPPORTED != mVConfiguration.IS_FREQUENCY_SUPPORTED || this.IS_DOCKLESS_BIKES_SUPPORTED != mVConfiguration.IS_DOCKLESS_BIKES_SUPPORTED || this.IS_DOCKLESS_SCOOTERS_SUPPORTED != mVConfiguration.IS_DOCKLESS_SCOOTERS_SUPPORTED || this.IS_DOCKLESS_KICK_SCOOTERS_SUPPORTED != mVConfiguration.IS_DOCKLESS_KICK_SCOOTERS_SUPPORTED || this.IS_DOCKLESS_MOPED_SUPPORTED != mVConfiguration.IS_DOCKLESS_MOPED_SUPPORTED) {
            return false;
        }
        boolean A = mo26474A();
        boolean A2 = mVConfiguration.mo26474A();
        if (((A || A2) && (!A || !A2 || !this.GTFS_CONFIG_FILES.equals(mVConfiguration.GTFS_CONFIG_FILES))) || this.GTFS_CONFIG_GRAPH_NUM_OF_DAYS != mVConfiguration.GTFS_CONFIG_GRAPH_NUM_OF_DAYS || this.GTFS_CONFIG_GRAPH_HOURS != mVConfiguration.GTFS_CONFIG_GRAPH_HOURS || this.SEARCH_LOCATIONS_DELAY != mVConfiguration.SEARCH_LOCATIONS_DELAY || this.TRIP_PLAN_PERSONALIZATION_POPUP_ENABLED != mVConfiguration.TRIP_PLAN_PERSONALIZATION_POPUP_ENABLED) {
            return false;
        }
        boolean b1 = mo26548b1();
        boolean b12 = mVConfiguration.mo26548b1();
        if ((b1 || b12) && (!b1 || !b12 || !this.suggestedRoutesCellImprovementsExperiment.equals(mVConfiguration.suggestedRoutesCellImprovementsExperiment))) {
            return false;
        }
        boolean H = mo26492H();
        boolean H2 = mVConfiguration.mo26492H();
        if (((H || H2) && (!H || !H2 || !this.homeWorkExperiment.equals(mVConfiguration.homeWorkExperiment))) || this.IS_PRIVATE_BIKE_SUPPORTED != mVConfiguration.IS_PRIVATE_BIKE_SUPPORTED || this.USE_GOOGLE_PLACES != mVConfiguration.USE_GOOGLE_PLACES) {
            return false;
        }
        boolean q = mo26604q();
        boolean q2 = mVConfiguration.mo26604q();
        if ((q || q2) && (!q || !q2 || !this.DASHBOARD_SECTIONS.equals(mVConfiguration.DASHBOARD_SECTIONS))) {
            return false;
        }
        boolean o1 = mo26598o1();
        boolean o12 = mVConfiguration.mo26598o1();
        if ((o1 || o12) && (!o1 || !o12 || !this.wazeCarpoolInstallationLink.equals(mVConfiguration.wazeCarpoolInstallationLink))) {
            return false;
        }
        boolean n1 = mo26594n1();
        boolean n12 = mVConfiguration.mo26594n1();
        if (((n1 || n12) && (!n1 || !n12 || !this.wazeCarpoolDeepLink.equals(mVConfiguration.wazeCarpoolDeepLink))) || this.IS_TICKETING_V2_SUPPORTED != mVConfiguration.IS_TICKETING_V2_SUPPORTED) {
            return false;
        }
        boolean j = mo26578j();
        boolean j2 = mVConfiguration.mo26578j();
        if ((j || j2) && (!j || !j2 || !this.arExperiment.equals(mVConfiguration.arExperiment))) {
            return false;
        }
        boolean g0 = mo26566g0();
        boolean g02 = mVConfiguration.mo26566g0();
        if ((g0 || g02) && (!g0 || !g02 || !this.itineraryQuickActions.equals(mVConfiguration.itineraryQuickActions))) {
            return false;
        }
        boolean k0 = mo26583k0();
        boolean k02 = mVConfiguration.mo26583k0();
        if ((k0 || k02) && (!k0 || !k02 || !this.lineViewQuickActions.equals(mVConfiguration.lineViewQuickActions))) {
            return false;
        }
        boolean Z0 = mo26542Z0();
        boolean Z02 = mVConfiguration.mo26542Z0();
        if ((Z0 || Z02) && (!Z0 || !Z02 || !this.stopViewQuickActions.equals(mVConfiguration.stopViewQuickActions))) {
            return false;
        }
        boolean D0 = mo26481D0();
        boolean D02 = mVConfiguration.mo26481D0();
        if ((D0 || D02) && (!D0 || !D02 || !this.onboardingFavoritesTestingGroup.equals(mVConfiguration.onboardingFavoritesTestingGroup))) {
            return false;
        }
        boolean P0 = mo26515P0();
        boolean P02 = mVConfiguration.mo26515P0();
        if ((P0 || P02) && (!P0 || !P02 || !this.searchExamplesAbTestingGroup.equals(mVConfiguration.searchExamplesAbTestingGroup))) {
            return false;
        }
        boolean Q0 = mo26518Q0();
        boolean Q02 = mVConfiguration.mo26518Q0();
        if ((Q0 || Q02) && (!Q0 || !Q02 || !this.searchLocationHintABTestingType.equals(mVConfiguration.searchLocationHintABTestingType))) {
            return false;
        }
        boolean v0 = mo26626v0();
        boolean v02 = mVConfiguration.mo26626v0();
        if ((v0 || v02) && (!v0 || !v02 || !this.mainSearchButtonABTestingGroup.equals(mVConfiguration.mainSearchButtonABTestingGroup))) {
            return false;
        }
        boolean w0 = mo26630w0();
        boolean w02 = mVConfiguration.mo26630w0();
        if ((w0 || w02) && (!w0 || !w02 || !this.mvUserProfileAccessibilityPref.equals(mVConfiguration.mvUserProfileAccessibilityPref))) {
            return false;
        }
        boolean i = mo26574i();
        boolean i2 = mVConfiguration.mo26574i();
        if ((i || i2) && (!i || !i2 || !this.adsConsentLayoutABTestGroup.equals(mVConfiguration.adsConsentLayoutABTestGroup))) {
            return false;
        }
        boolean a1 = mo26545a1();
        boolean a12 = mVConfiguration.mo26545a1();
        if ((a1 || a12) && (!a1 || !a12 || !this.subscriptionABTestGroup.equals(mVConfiguration.subscriptionABTestGroup))) {
            return false;
        }
        boolean l = mo26586l();
        boolean l2 = mVConfiguration.mo26586l();
        if ((l || l2) && (!l || !l2 || !this.bannerDesignABTestGroup.equals(mVConfiguration.bannerDesignABTestGroup))) {
            return false;
        }
        boolean k = mo26582k();
        boolean k2 = mVConfiguration.mo26582k();
        if ((k || k2) && (!k || !k2 || !this.attPermissionsABTestingGroup.equals(mVConfiguration.attPermissionsABTestingGroup))) {
            return false;
        }
        boolean u = mo26621u();
        boolean u2 = mVConfiguration.mo26621u();
        if ((u || u2) && (!u || !u2 || !this.directToItineraryABTestGroup.equals(mVConfiguration.directToItineraryABTestGroup))) {
            return false;
        }
        boolean Y0 = mo26539Y0();
        boolean Y02 = mVConfiguration.mo26539Y0();
        if ((Y0 || Y02) && (!Y0 || !Y02 || !this.smartComponentRandomABTestingGroup.equals(mVConfiguration.smartComponentRandomABTestingGroup))) {
            return false;
        }
        boolean l0 = mo26587l0();
        boolean l02 = mVConfiguration.mo26587l0();
        if ((l0 || l02) && (!l0 || !l02 || !this.lineViewWalkthroughABTestingGroup.equals(mVConfiguration.lineViewWalkthroughABTestingGroup))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26561f() {
        return C13637c.m34054I(36, this.__isset_bitfield);
    }

    /* renamed from: f0 */
    public final boolean mo26562f0() {
        return C13637c.m34054I(32, this.__isset_bitfield);
    }

    /* renamed from: f1 */
    public final boolean mo26563f1() {
        return this.topup_tab_link != null;
    }

    /* renamed from: f2 */
    public final void mo26564f2() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 3, true);
    }

    /* renamed from: g */
    public final boolean mo26565g() {
        return this.additionalTab != null;
    }

    /* renamed from: g0 */
    public final boolean mo26566g0() {
        return this.itineraryQuickActions != null;
    }

    /* renamed from: g1 */
    public final boolean mo26567g1() {
        return this.twitterPostActivityNames != null;
    }

    /* renamed from: g2 */
    public final void mo26568g2() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 2, true);
    }

    /* renamed from: h */
    public final boolean mo26569h() {
        return C13637c.m34054I(23, this.__isset_bitfield);
    }

    /* renamed from: h0 */
    public final boolean mo26570h0() {
        return C13637c.m34054I(0, this.__isset_bitfield);
    }

    /* renamed from: h1 */
    public final boolean mo26571h1() {
        return C13637c.m34054I(58, this.__isset_bitfield);
    }

    /* renamed from: h2 */
    public final void mo26572h2() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 31, true);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo26574i() {
        return this.adsConsentLayoutABTestGroup != null;
    }

    /* renamed from: i0 */
    public final boolean mo26575i0() {
        return this.latestRelease_android != null;
    }

    /* renamed from: i1 */
    public final boolean mo26576i1() {
        return C13637c.m34054I(1, this.__isset_bitfield);
    }

    /* renamed from: i2 */
    public final void mo26577i2() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 5, true);
    }

    /* renamed from: j */
    public final boolean mo26578j() {
        return this.arExperiment != null;
    }

    /* renamed from: j0 */
    public final boolean mo26579j0() {
        return this.latestRelease_iPhone != null;
    }

    /* renamed from: j1 */
    public final boolean mo26580j1() {
        return C13637c.m34054I(19, this.__isset_bitfield);
    }

    /* renamed from: j2 */
    public final void mo26581j2() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 34, true);
    }

    /* renamed from: k */
    public final boolean mo26582k() {
        return this.attPermissionsABTestingGroup != null;
    }

    /* renamed from: k0 */
    public final boolean mo26583k0() {
        return this.lineViewQuickActions != null;
    }

    /* renamed from: k1 */
    public final boolean mo26584k1() {
        return C13637c.m34054I(35, this.__isset_bitfield);
    }

    /* renamed from: k2 */
    public final void mo26585k2() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 7, true);
    }

    /* renamed from: l */
    public final boolean mo26586l() {
        return this.bannerDesignABTestGroup != null;
    }

    /* renamed from: l0 */
    public final boolean mo26587l0() {
        return this.lineViewWalkthroughABTestingGroup != null;
    }

    /* renamed from: l1 */
    public final boolean mo26588l1() {
        return C13637c.m34054I(6, this.__isset_bitfield);
    }

    /* renamed from: l2 */
    public final void mo26589l2() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 29, true);
    }

    /* renamed from: m */
    public final boolean mo26590m() {
        return this.CarPoolAttributionImageUrl != null;
    }

    /* renamed from: m0 */
    public final boolean mo26591m0() {
        return C13637c.m34054I(14, this.__isset_bitfield);
    }

    /* renamed from: m2 */
    public final void mo26592m2() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 55, true);
    }

    /* renamed from: n0 */
    public final boolean mo26593n0() {
        return C13637c.m34054I(15, this.__isset_bitfield);
    }

    /* renamed from: n1 */
    public final boolean mo26594n1() {
        return this.wazeCarpoolDeepLink != null;
    }

    /* renamed from: n2 */
    public final void mo26595n2() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 30, true);
    }

    /* renamed from: o */
    public final boolean mo26596o() {
        return this.CarPoolAttributionText != null;
    }

    /* renamed from: o0 */
    public final boolean mo26597o0() {
        return this.MAP_IMPL_TYPE != null;
    }

    /* renamed from: o1 */
    public final boolean mo26598o1() {
        return this.wazeCarpoolInstallationLink != null;
    }

    /* renamed from: o2 */
    public final void mo26599o2() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 11, true);
    }

    /* renamed from: p */
    public final boolean mo26600p() {
        return C13637c.m34054I(37, this.__isset_bitfield);
    }

    /* renamed from: p0 */
    public final boolean mo26601p0() {
        return this.MAP_IMPL_TYPE_V5 != null;
    }

    /* renamed from: p1 */
    public final boolean mo26602p1() {
        return this.whatsNewURL_android != null;
    }

    /* renamed from: p2 */
    public final void mo26603p2() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 10, true);
    }

    /* renamed from: q */
    public final boolean mo26604q() {
        return this.DASHBOARD_SECTIONS != null;
    }

    /* renamed from: q0 */
    public final boolean mo26605q0() {
        return C13637c.m34054I(24, this.__isset_bitfield);
    }

    /* renamed from: q1 */
    public final boolean mo26606q1() {
        return this.whatsNewURL_iPhone != null;
    }

    /* renamed from: q2 */
    public final void mo26607q2() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 45, true);
    }

    /* renamed from: r */
    public final boolean mo26608r() {
        return this.DEFAULT_INTERMEDIATE_DURATION != null;
    }

    /* renamed from: r0 */
    public final boolean mo26609r0() {
        return C13637c.m34054I(27, this.__isset_bitfield);
    }

    /* renamed from: r1 */
    public final void mo26610r1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 36, true);
    }

    /* renamed from: r2 */
    public final void mo26611r2() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 46, true);
    }

    /* renamed from: s */
    public final boolean mo26612s() {
        return this.DISTANCE_DELTA_UPDATES != null;
    }

    /* renamed from: s0 */
    public final boolean mo26613s0() {
        return C13637c.m34054I(26, this.__isset_bitfield);
    }

    /* renamed from: s1 */
    public final void mo26614s1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 23, true);
    }

    /* renamed from: s2 */
    public final void mo26615s2() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 43, true);
    }

    /* renamed from: t */
    public final boolean mo26616t() {
        return this.defaultTripPlanOption != null;
    }

    /* renamed from: t0 */
    public final boolean mo26617t0() {
        return C13637c.m34054I(25, this.__isset_bitfield);
    }

    /* renamed from: t1 */
    public final void mo26618t1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 37, true);
    }

    /* renamed from: t2 */
    public final void mo26619t2() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 44, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVConfiguration(", "latestAppVersionCode:");
        C0016g.m42z(n, this.latestAppVersionCode, ", ", "defaultTripPlanOption:");
        MVTripPlanOption mVTripPlanOption = this.defaultTripPlanOption;
        if (mVTripPlanOption == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTripPlanOption);
        }
        n.append(", ");
        n.append("twitterPostActivityNames:");
        List<String> list = this.twitterPostActivityNames;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("latestRelease_iPhone:");
        String str = this.latestRelease_iPhone;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("latestRelease_android:");
        String str2 = this.latestRelease_android;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("whatsNewURL_iPhone:");
        String str3 = this.whatsNewURL_iPhone;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("whatsNewURL_android:");
        String str4 = this.whatsNewURL_android;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        n.append(", ");
        n.append("feedBackEmailAddress:");
        String str5 = this.feedBackEmailAddress;
        if (str5 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str5);
        }
        n.append(", ");
        n.append("USE_MOOVIT_TILES:");
        C13555b.m33977q(n, this.USE_MOOVIT_TILES, ", ", "MOOVIT_TILES_URL:");
        String str6 = this.MOOVIT_TILES_URL;
        if (str6 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str6);
        }
        n.append(", ");
        n.append("near_me_default_stop_radius:");
        C0016g.m42z(n, this.near_me_default_stop_radius, ", ", "near_me_default_stop_detail_radius:");
        C0016g.m42z(n, this.near_me_default_stop_detail_radius, ", ", "near_me_default_stop_detail_max_lines:");
        C0016g.m42z(n, this.near_me_default_stop_detail_max_lines, ", ", "near_me_map_sensitivity:");
        C0016g.m42z(n, this.near_me_map_sensitivity, ", ", "walking_speed_factor:");
        C16759e.m42355k(n, this.walking_speed_factor, ", ", "DEFAULT_INTERMEDIATE_DURATION:");
        String str7 = this.DEFAULT_INTERMEDIATE_DURATION;
        if (str7 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str7);
        }
        n.append(", ");
        n.append("TIME_DELTA_UPDATES:");
        String str8 = this.TIME_DELTA_UPDATES;
        if (str8 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str8);
        }
        n.append(", ");
        n.append("DISTANCE_DELTA_UPDATES:");
        String str9 = this.DISTANCE_DELTA_UPDATES;
        if (str9 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str9);
        }
        n.append(", ");
        n.append("SCHEDULE_TIME_JOIN_RT_GTFS_SECONDS:");
        C0016g.m42z(n, this.SCHEDULE_TIME_JOIN_RT_GTFS_SECONDS, ", ", "IS_TAXI_SUPPORT:");
        C13555b.m33977q(n, this.IS_TAXI_SUPPORT, ", ", "HAS_MAP_CAMPAIGNS:");
        C13555b.m33977q(n, this.HAS_MAP_CAMPAIGNS, ", ", "SUPPORT_SERVICE_ALERTS_TAB:");
        C13555b.m33977q(n, this.SUPPORT_SERVICE_ALERTS_TAB, ", ", "STOP_GAME_ENABLED:");
        C13555b.m33977q(n, this.STOP_GAME_ENABLED, ", ", "is_location_triggers_enable:");
        C13555b.m33977q(n, this.is_location_triggers_enable, ", ", "is_topup_tab_enable:");
        C13555b.m33977q(n, this.is_topup_tab_enable, ", ", "location_trigger_dwell_delay_sec:");
        C0016g.m42z(n, this.location_trigger_dwell_delay_sec, ", ", "location_trigger_geofence_radius_meters:");
        C0016g.m42z(n, this.location_trigger_geofence_radius_meters, ", ", "IS_BIKE_SHARING_SUPPORT:");
        C13555b.m33977q(n, this.IS_BIKE_SHARING_SUPPORT, ", ", "IS_CAR_SHARING_SUPPORT:");
        C13555b.m33977q(n, this.IS_CAR_SHARING_SUPPORT, ", ", "IS_CAR_POOL_SUPPORT:");
        C13555b.m33977q(n, this.IS_CAR_POOL_SUPPORT, ", ", "USE_ROLLOUT:");
        C13555b.m33977q(n, this.USE_ROLLOUT, ", ", "IS_TRIP_PLAN_RATING_SUPPORT:");
        C13555b.m33977q(n, this.IS_TRIP_PLAN_RATING_SUPPORT, ", ", "topup_tab_link:");
        String str10 = this.topup_tab_link;
        if (str10 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str10);
        }
        n.append(", ");
        n.append("IS_ADS_SUPPORT:");
        C13555b.m33977q(n, this.IS_ADS_SUPPORT, ", ", "SUBWAY_LAYER_URL:");
        String str11 = this.SUBWAY_LAYER_URL;
        if (str11 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str11);
        }
        n.append(", ");
        n.append("PATHWAY_LAYERS_URL:");
        String str12 = this.PATHWAY_LAYERS_URL;
        if (str12 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str12);
        }
        n.append(", ");
        n.append("IS_STOP_MAP_ITEMS_PRELOAD_SUPPORTED:");
        C13555b.m33977q(n, this.IS_STOP_MAP_ITEMS_PRELOAD_SUPPORTED, ", ", "additionalTab:");
        MVAdditionalTab mVAdditionalTab = this.additionalTab;
        if (mVAdditionalTab == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVAdditionalTab);
        }
        n.append(", ");
        n.append("additionalTabPosition:");
        C0016g.m42z(n, this.additionalTabPosition, ", ", "MAX_ZOOM_FOR_SUBWAY_LAYER:");
        C0016g.m42z(n, this.MAX_ZOOM_FOR_SUBWAY_LAYER, ", ", "MIN_ZOOM_FOR_SUBWAY_LAYER:");
        C0016g.m42z(n, this.MIN_ZOOM_FOR_SUBWAY_LAYER, ", ", "MAP_IMPL_TYPE:");
        MVMapImplType mVMapImplType = this.MAP_IMPL_TYPE;
        if (mVMapImplType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVMapImplType);
        }
        n.append(", ");
        n.append("MIN_ARRIVALS_TO_RETRIEVE:");
        C0016g.m42z(n, this.MIN_ARRIVALS_TO_RETRIEVE, ", ", "MINUTES_CONSIDER_ARRIVALS:");
        C0016g.m42z(n, this.MINUTES_CONSIDER_ARRIVALS, ", ", "IS_STOP_EDITING_SUPPORTED:");
        C13555b.m33977q(n, this.IS_STOP_EDITING_SUPPORTED, ", ", "SEARCH_LAST_INTERVAL_IN_SECONDS:");
        C0016g.m42z(n, this.SEARCH_LAST_INTERVAL_IN_SECONDS, ", ", "SHOW_NEW_ITINERARIES_HINT:");
        C13555b.m33977q(n, this.SHOW_NEW_ITINERARIES_HINT, ", ", "TopUpText:");
        String str13 = this.TopUpText;
        if (str13 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str13);
        }
        n.append(", ");
        n.append("CarPoolAttributionImageUrl:");
        String str14 = this.CarPoolAttributionImageUrl;
        if (str14 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str14);
        }
        n.append(", ");
        n.append("CarPoolAttributionText:");
        String str15 = this.CarPoolAttributionText;
        if (str15 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str15);
        }
        n.append(", ");
        n.append("MAP_IMPL_TYPE_V5:");
        MVMapImplType mVMapImplType2 = this.MAP_IMPL_TYPE_V5;
        if (mVMapImplType2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVMapImplType2);
        }
        n.append(", ");
        n.append("near_me_favorite_stop_detail_max_lines:");
        C0016g.m42z(n, this.near_me_favorite_stop_detail_max_lines, ", ", "is_trip_plan_car_pool_experiment_on:");
        C13555b.m33977q(n, this.is_trip_plan_car_pool_experiment_on, ", ", "isInterstitialAdsSupported:");
        C13555b.m33977q(n, this.isInterstitialAdsSupported, ", ", "PCT_OF_SERVER_LOG:");
        C0016g.m42z(n, this.PCT_OF_SERVER_LOG, ", ", "USE_SERVER_FOR_FORWARD_GEOCODE:");
        C13555b.m33977q(n, this.USE_SERVER_FOR_FORWARD_GEOCODE, ", ", "ACTIVE_PROFILER_PCT:");
        C0016g.m42z(n, this.ACTIVE_PROFILER_PCT, ", ", "carPoolReferralIndication:");
        C13555b.m33977q(n, this.carPoolReferralIndication, ", ", "NEAR_ME_RT_ENABLED:");
        C13555b.m33977q(n, this.NEAR_ME_RT_ENABLED, ", ", "IS_USER_REPORTS_ENABLED:");
        C13555b.m33977q(n, this.IS_USER_REPORTS_ENABLED, ", ", "fgWifiScanSec:");
        C0016g.m42z(n, this.fgWifiScanSec, ", ", "fgBeaconScanSec:");
        C0016g.m42z(n, this.fgBeaconScanSec, ", ", "isReportMetrics:");
        C13555b.m33977q(n, this.isReportMetrics, ", ", "showCommunitySection:");
        C13555b.m33977q(n, this.showCommunitySection, ", ", "showRideRequestSection:");
        C13555b.m33977q(n, this.showRideRequestSection, ", ", "searchMaxFutureDays:");
        C0016g.m42z(n, this.searchMaxFutureDays, ", ", "homeTabs:");
        List<MVHomeTab> list2 = this.homeTabs;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        n.append(", ");
        n.append("service_status_card_is_subway:");
        C13555b.m33977q(n, this.service_status_card_is_subway, ", ", "sectionsOrder:");
        List<MVSingleTabSection> list3 = this.sectionsOrder;
        if (list3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list3);
        }
        if (mo26512O0()) {
            n.append(", ");
            n.append("scheduleDisplayExperiment:");
            MVScheduleDisplayExperiment mVScheduleDisplayExperiment = this.scheduleDisplayExperiment;
            if (mVScheduleDisplayExperiment == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVScheduleDisplayExperiment);
            }
        }
        n.append(", ");
        n.append("IS_RIDE_SHARING_SUPPORT:");
        C13555b.m33977q(n, this.IS_RIDE_SHARING_SUPPORT, ", ", "IS_FREQUENCY_SUPPORTED:");
        C13555b.m33977q(n, this.IS_FREQUENCY_SUPPORTED, ", ", "IS_DOCKLESS_BIKES_SUPPORTED:");
        C13555b.m33977q(n, this.IS_DOCKLESS_BIKES_SUPPORTED, ", ", "IS_DOCKLESS_SCOOTERS_SUPPORTED:");
        C13555b.m33977q(n, this.IS_DOCKLESS_SCOOTERS_SUPPORTED, ", ", "IS_DOCKLESS_KICK_SCOOTERS_SUPPORTED:");
        C13555b.m33977q(n, this.IS_DOCKLESS_KICK_SCOOTERS_SUPPORTED, ", ", "IS_DOCKLESS_MOPED_SUPPORTED:");
        C13555b.m33977q(n, this.IS_DOCKLESS_MOPED_SUPPORTED, ", ", "GTFS_CONFIG_FILES:");
        String str16 = this.GTFS_CONFIG_FILES;
        if (str16 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str16);
        }
        n.append(", ");
        n.append("GTFS_CONFIG_GRAPH_NUM_OF_DAYS:");
        C0016g.m42z(n, this.GTFS_CONFIG_GRAPH_NUM_OF_DAYS, ", ", "GTFS_CONFIG_GRAPH_HOURS:");
        C0016g.m42z(n, this.GTFS_CONFIG_GRAPH_HOURS, ", ", "SEARCH_LOCATIONS_DELAY:");
        C0016g.m42z(n, this.SEARCH_LOCATIONS_DELAY, ", ", "TRIP_PLAN_PERSONALIZATION_POPUP_ENABLED:");
        C13555b.m33977q(n, this.TRIP_PLAN_PERSONALIZATION_POPUP_ENABLED, ", ", "suggestedRoutesCellImprovementsExperiment:");
        MVSuggestedRoutesCellImprovementsExperiment mVSuggestedRoutesCellImprovementsExperiment = this.suggestedRoutesCellImprovementsExperiment;
        if (mVSuggestedRoutesCellImprovementsExperiment == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVSuggestedRoutesCellImprovementsExperiment);
        }
        n.append(", ");
        n.append("homeWorkExperiment:");
        MVHomeWorkExperiment mVHomeWorkExperiment = this.homeWorkExperiment;
        if (mVHomeWorkExperiment == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVHomeWorkExperiment);
        }
        n.append(", ");
        n.append("IS_PRIVATE_BIKE_SUPPORTED:");
        C13555b.m33977q(n, this.IS_PRIVATE_BIKE_SUPPORTED, ", ", "USE_GOOGLE_PLACES:");
        C13555b.m33977q(n, this.USE_GOOGLE_PLACES, ", ", "DASHBOARD_SECTIONS:");
        List<MVDashboardSection> list4 = this.DASHBOARD_SECTIONS;
        if (list4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list4);
        }
        n.append(", ");
        n.append("wazeCarpoolInstallationLink:");
        String str17 = this.wazeCarpoolInstallationLink;
        if (str17 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str17);
        }
        n.append(", ");
        n.append("wazeCarpoolDeepLink:");
        String str18 = this.wazeCarpoolDeepLink;
        if (str18 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str18);
        }
        n.append(", ");
        n.append("IS_TICKETING_V2_SUPPORTED:");
        C13555b.m33977q(n, this.IS_TICKETING_V2_SUPPORTED, ", ", "arExperiment:");
        MVARExperiment mVARExperiment = this.arExperiment;
        if (mVARExperiment == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVARExperiment);
        }
        n.append(", ");
        n.append("itineraryQuickActions:");
        List<MVItineraryQuickAction> list5 = this.itineraryQuickActions;
        if (list5 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list5);
        }
        n.append(", ");
        n.append("lineViewQuickActions:");
        List<MVLineViewQuickAction> list6 = this.lineViewQuickActions;
        if (list6 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list6);
        }
        n.append(", ");
        n.append("stopViewQuickActions:");
        List<MVStopViewQuickAction> list7 = this.stopViewQuickActions;
        if (list7 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list7);
        }
        n.append(", ");
        n.append("onboardingFavoritesTestingGroup:");
        MVOnboardingFavoritesABTestingGroup mVOnboardingFavoritesABTestingGroup = this.onboardingFavoritesTestingGroup;
        if (mVOnboardingFavoritesABTestingGroup == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVOnboardingFavoritesABTestingGroup);
        }
        n.append(", ");
        n.append("searchExamplesAbTestingGroup:");
        MVSearchExamplesABTestGroup mVSearchExamplesABTestGroup = this.searchExamplesAbTestingGroup;
        if (mVSearchExamplesABTestGroup == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVSearchExamplesABTestGroup);
        }
        n.append(", ");
        n.append("searchLocationHintABTestingType:");
        MVSearchLocationHintABTestingType mVSearchLocationHintABTestingType = this.searchLocationHintABTestingType;
        if (mVSearchLocationHintABTestingType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVSearchLocationHintABTestingType);
        }
        n.append(", ");
        n.append("mainSearchButtonABTestingGroup:");
        MVMainSearchButtonABTestingGroup mVMainSearchButtonABTestingGroup = this.mainSearchButtonABTestingGroup;
        if (mVMainSearchButtonABTestingGroup == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVMainSearchButtonABTestingGroup);
        }
        n.append(", ");
        n.append("mvUserProfileAccessibilityPref:");
        MVUserProfileAccessibilityPref mVUserProfileAccessibilityPref = this.mvUserProfileAccessibilityPref;
        if (mVUserProfileAccessibilityPref == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVUserProfileAccessibilityPref);
        }
        n.append(", ");
        n.append("adsConsentLayoutABTestGroup:");
        MVAdsConsentLayoutABTestGroup mVAdsConsentLayoutABTestGroup = this.adsConsentLayoutABTestGroup;
        if (mVAdsConsentLayoutABTestGroup == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVAdsConsentLayoutABTestGroup);
        }
        n.append(", ");
        n.append("subscriptionABTestGroup:");
        MVSubscriptionsABTestGroup mVSubscriptionsABTestGroup = this.subscriptionABTestGroup;
        if (mVSubscriptionsABTestGroup == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVSubscriptionsABTestGroup);
        }
        n.append(", ");
        n.append("bannerDesignABTestGroup:");
        MVBannerDesignABTestGroup mVBannerDesignABTestGroup = this.bannerDesignABTestGroup;
        if (mVBannerDesignABTestGroup == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVBannerDesignABTestGroup);
        }
        n.append(", ");
        n.append("attPermissionsABTestingGroup:");
        MVATTPermissionsABTestingGroup mVATTPermissionsABTestingGroup = this.attPermissionsABTestingGroup;
        if (mVATTPermissionsABTestingGroup == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVATTPermissionsABTestingGroup);
        }
        n.append(", ");
        n.append("directToItineraryABTestGroup:");
        MVDirectToItineraryABTestGroup mVDirectToItineraryABTestGroup = this.directToItineraryABTestGroup;
        if (mVDirectToItineraryABTestGroup == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVDirectToItineraryABTestGroup);
        }
        n.append(", ");
        n.append("smartComponentRandomABTestingGroup:");
        MVSmartComponentRandomABTestingGroup mVSmartComponentRandomABTestingGroup = this.smartComponentRandomABTestingGroup;
        if (mVSmartComponentRandomABTestingGroup == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVSmartComponentRandomABTestingGroup);
        }
        n.append(", ");
        n.append("lineViewWalkthroughABTestingGroup:");
        MVLineViewWalkthroughABTestingGroup mVLineViewWalkthroughABTestingGroup = this.lineViewWalkthroughABTestingGroup;
        if (mVLineViewWalkthroughABTestingGroup == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLineViewWalkthroughABTestingGroup);
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final boolean mo26621u() {
        return this.directToItineraryABTestGroup != null;
    }

    /* renamed from: u0 */
    public final boolean mo26622u0() {
        return this.MOOVIT_TILES_URL != null;
    }

    /* renamed from: u1 */
    public final void mo26623u1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 41, true);
    }

    /* renamed from: u2 */
    public final void mo26624u2() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 56, true);
    }

    /* renamed from: v */
    public final boolean mo26625v() {
        return this.feedBackEmailAddress != null;
    }

    /* renamed from: v0 */
    public final boolean mo26626v0() {
        return this.mainSearchButtonABTestingGroup != null;
    }

    /* renamed from: v1 */
    public final void mo26627v1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 40, true);
    }

    /* renamed from: v2 */
    public final void mo26628v2() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 58, true);
    }

    /* renamed from: w */
    public final boolean mo26629w() {
        return C13637c.m34054I(41, this.__isset_bitfield);
    }

    /* renamed from: w0 */
    public final boolean mo26630w0() {
        return this.mvUserProfileAccessibilityPref != null;
    }

    /* renamed from: w1 */
    public final void mo26631w1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 54, true);
    }

    /* renamed from: w2 */
    public final void mo26632w2() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 1, true);
    }

    /* renamed from: x0 */
    public final boolean mo26633x0() {
        return C13637c.m34054I(38, this.__isset_bitfield);
    }

    /* renamed from: x1 */
    public final void mo26634x1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 53, true);
    }

    /* renamed from: x2 */
    public final void mo26635x2() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 19, true);
    }

    /* renamed from: y */
    public final boolean mo26636y() {
        return C13637c.m34054I(40, this.__isset_bitfield);
    }

    /* renamed from: y0 */
    public final boolean mo26637y0() {
        return C13637c.m34054I(4, this.__isset_bitfield);
    }

    /* renamed from: y1 */
    public final void mo26638y1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 9, true);
    }

    /* renamed from: y2 */
    public final void mo26639y2() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 35, true);
    }

    /* renamed from: z0 */
    public final boolean mo26640z0() {
        return C13637c.m34054I(3, this.__isset_bitfield);
    }

    /* renamed from: z1 */
    public final void mo26641z1() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 21, true);
    }

    /* renamed from: z2 */
    public final void mo26642z2() {
        this.__isset_bitfield = C13637c.m34051F(this.__isset_bitfield, 6, true);
    }
}
