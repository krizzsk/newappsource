package p874vr;

import android.webkit.URLUtil;
import com.google.android.gms.nearby.messages.Strategy;
import com.moovit.accessibility.UserProfileAccessibilityPrefType;
import com.moovit.app.actions.QuickAction;
import com.moovit.app.home.dashboard.DashboardSection;
import com.moovit.app.home.tab.HomeTab;
import com.moovit.app.suggestedroutes.TimeQuickAction;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitType;
import com.tranzmate.moovit.protocol.common.MVRouteType;
import com.tranzmate.moovit.protocol.conf.MVDashboardSection;
import com.tranzmate.moovit.protocol.conf.MVHomeTab;
import com.tranzmate.moovit.protocol.conf.MVItineraryQuickAction;
import com.tranzmate.moovit.protocol.conf.MVLineViewQuickAction;
import com.tranzmate.moovit.protocol.conf.MVStopViewQuickAction;
import com.tranzmate.moovit.protocol.conf.MVTripPlanTimeQuickAction;
import com.tranzmate.moovit.protocol.conf.MVUserProfileAccessibilityPref;
import com.usebutton.sdk.internal.views.LoadingDots;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p716oy.C18860a;
import p760qx.C19199c;
import p977zz.C20944i0;
import p977zz.C20964s0;
import q00.C19047a;
import q00.C19053d;
import r00.C19209a;
import r00.C19210b;
import r00.C19212d;
import r00.C19213e;
import r00.C19214f;
import r00.C19215g;
import r00.C19216h;
import u20.C19874a;

/* renamed from: vr.a */
public interface C20199a extends C19053d {

    /* renamed from: A0 */
    public static final C19209a f51239A0;

    /* renamed from: B0 */
    public static final C20218s f51240B0 = new C20218s(Collections.emptyList());

    /* renamed from: C0 */
    public static final C19209a f51241C0;

    /* renamed from: D0 */
    public static final C19209a f51242D0;

    /* renamed from: E0 */
    public static final C20219t f51243E0;

    /* renamed from: F0 */
    public static final C20220u f51244F0 = new C20220u(Collections.singletonList(TransitType.VehicleType.BUS));

    /* renamed from: G0 */
    public static final C20221v f51245G0 = new C20221v(Arrays.asList(new Integer[]{50, Integer.valueOf(Strategy.TTL_SECONDS_DEFAULT)}));

    /* renamed from: H0 */
    public static final C20200a f51246H0 = new C20200a(Arrays.asList(new Integer[]{5, 15}));

    /* renamed from: I0 */
    public static final C19212d f51247I0 = new C19212d("MOT_STATION_INSPECTION_MODE_DISTANCE", Integer.valueOf(LoadingDots.PULSE_DURATION));

    /* renamed from: J0 */
    public static final C19212d f51248J0 = new C19212d("MOT_STATION_INSPECTION_MODE_TIME", 10);

    /* renamed from: K0 */
    public static final C20201b f51249K0 = new C20201b(Arrays.asList(new QuickAction[]{QuickAction.ITINERARY_NAVIGATE, QuickAction.ITINERARY_REPORT, QuickAction.ITINERARY_SHARE}));

    /* renamed from: L0 */
    public static final C20202c f51250L0 = new C20202c(Arrays.asList(new QuickAction[]{QuickAction.ITINERARY_PREVIEW_NAVIGATE, QuickAction.ITINERARY_PREVIEW_REPORT, QuickAction.ITINERARY_PREVIEW_SHARE}));

    /* renamed from: M0 */
    public static final C20203d f51251M0 = new C20203d(Arrays.asList(new QuickAction[]{QuickAction.ITINERARY_LIVE_DIRECTIONS_STOP, QuickAction.ITINERARY_LIVE_DIRECTIONS_REPORT, QuickAction.ITINERARY_LIVE_DIRECTIONS_SHARE}));

    /* renamed from: N0 */
    public static final C20204e f51252N0 = new C20204e(Arrays.asList(new QuickAction[]{QuickAction.STOP_REPORT, QuickAction.STOP_FAVORITE}));

    /* renamed from: O0 */
    public static final C20205f f51253O0 = new C20205f(Arrays.asList(new QuickAction[]{QuickAction.LINE_NAVIGATE, QuickAction.LINE_FAVORITE, QuickAction.LINE_REPORT}));

    /* renamed from: P0 */
    public static final C20206g f51254P0 = new C20206g(Arrays.asList(new QuickAction[]{QuickAction.LINE_TRIP_NAVIGATE, QuickAction.LINE_TRIP_FAVORITE, QuickAction.LINE_TRIP_REPORT}));

    /* renamed from: Q0 */
    public static final C20207h f51255Q0 = new C20207h(Arrays.asList(new QuickAction[]{QuickAction.LINE_LIVE_DIRECTIONS_STOP, QuickAction.LINE_LIVE_DIRECTIONS_REPORT}));

    /* renamed from: R0 */
    public static final C19209a f51256R0;

    /* renamed from: S0 */
    public static final C20208i f51257S0 = new C20208i(Arrays.asList(TimeQuickAction.values()));

    /* renamed from: T0 */
    public static final C20209j f51258T0;

    /* renamed from: U0 */
    public static final C19212d f51259U0 = new C19212d("tod_stops_sensitivity", 1000);

    /* renamed from: V0 */
    public static final C19214f f51260V0 = new C19214f("STOP_CROWDEDNESS_WIDGET_VISIBILITY_TIME", Long.valueOf(TimeUnit.MINUTES.toSeconds(30)));

    /* renamed from: W0 */
    public static final C19209a f51261W0;

    /* renamed from: X0 */
    public static final C19212d f51262X0 = new C19212d("MAX_TIMES_SHOW_ADS_CONSENT", 3);

    /* renamed from: Y0 */
    public static final C19212d f51263Y0 = new C19212d("ADS_CONSENT_TIME_INTERVAL", 21);

    /* renamed from: Z0 */
    public static final C19209a f51264Z0;

    /* renamed from: a1 */
    public static final C20211l f51265a1 = new C20211l(Collections.emptyList());

    /* renamed from: b0 */
    public static final C19209a f51266b0 = new C19209a("IS_MULTI_METRO_APP", Boolean.valueOf(C18860a.m45884a().f48014b));

    /* renamed from: b1 */
    public static final C19216h f51267b1 = new C19216h("CONNECT_DRIVER_PAYMENT_CONTEXT", (String) null);

    /* renamed from: c0 */
    public static final C20210k f51268c0 = new C20210k(Arrays.asList(new HomeTab[]{HomeTab.DASHBOARD, HomeTab.NEARBY, HomeTab.LINES}));

    /* renamed from: c1 */
    public static final C20212m f51269c1 = new C20212m(Collections.emptyList());

    /* renamed from: d0 */
    public static final C20214o f51270d0 = new C20214o(Arrays.asList(new DashboardSection[]{DashboardSection.LOCATION_SERVICES_ALERT, DashboardSection.NAVIGABLE, DashboardSection.FAVORITE_LOCATIONS, DashboardSection.ITINERARY_HISTORY}));

    /* renamed from: d1 */
    public static final C19209a f51271d1;

    /* renamed from: e0 */
    public static final C19212d f51272e0 = new C19212d("latestAppVersionCode", -1);

    /* renamed from: e1 */
    public static final C19212d f51273e1 = new C19212d("NOTIFY_DRIVER_MAX_MINUTES_FOR_LINE_ARRIVAL", 30);

    /* renamed from: f0 */
    public static final C19212d f51274f0 = new C19212d("near_me_default_stop_detail_max_lines", 2);

    /* renamed from: f1 */
    public static final C19209a f51275f1;

    /* renamed from: g0 */
    public static final C19212d f51276g0 = new C19212d("near_me_map_sensitivity", 50);

    /* renamed from: g1 */
    public static final C19209a f51277g1;

    /* renamed from: h0 */
    public static final C20215p f51278h0 = new C20215p();

    /* renamed from: h1 */
    public static final C19209a f51279h1;

    /* renamed from: i0 */
    public static final C19209a f51280i0;

    /* renamed from: i1 */
    public static final C19216h f51281i1 = new C19216h("TRAIN_ASSISTANCE_DEEP_LINK", (String) null);

    /* renamed from: j0 */
    public static final C19209a f51282j0;

    /* renamed from: j1 */
    public static final C19212d f51283j1 = new C19212d("SUGGESTED_ROUTES_NUMBER_OF_EARLIER_LATER_MINUTES", 0);

    /* renamed from: k0 */
    public static final C19209a f51284k0;

    /* renamed from: k1 */
    public static final C19212d f51285k1 = new C19212d("SMART_COMPONENT_DISTANCE_PROXIMITY", 2000);

    /* renamed from: l0 */
    public static final C19209a f51286l0;

    /* renamed from: l1 */
    public static final C19212d f51287l1 = new C19212d("SMART_COMPONENT_DISTANCE_PROXIMITY_THRESHOLD", 200);

    /* renamed from: m0 */
    public static final C19212d f51288m0 = new C19212d("SEARCH_LAST_INTERVAL_IN_SECONDS", Integer.valueOf(Strategy.TTL_SECONDS_MAX));

    /* renamed from: m1 */
    public static final C19214f f51289m1 = new C19214f("SMART_COMPONENT_TIME_PROXIMITY", 7200L);

    /* renamed from: n0 */
    public static final C19209a f51290n0;

    /* renamed from: n1 */
    public static final C19212d f51291n1 = new C19212d("SMART_COMPONENT_COMMUTE_START", 6);

    /* renamed from: o0 */
    public static final C20216q f51292o0 = new C20216q();

    /* renamed from: o1 */
    public static final C19212d f51293o1 = new C19212d("SMART_COMPONENT_COMMUTE_END", 11);

    /* renamed from: p0 */
    public static final C19209a f51294p0;

    /* renamed from: p1 */
    public static final C19212d f51295p1 = new C19212d("SMART_COMPONENT_HOME_START", 0);

    /* renamed from: q0 */
    public static final C19209a f51296q0;

    /* renamed from: q1 */
    public static final C19212d f51297q1 = new C19212d("SMART_COMPONENT_HOME_END", 0);

    /* renamed from: r0 */
    public static final C19212d f51298r0 = new C19212d("fgWifiScanSec", -1);

    /* renamed from: r1 */
    public static final C19209a f51299r1;

    /* renamed from: s0 */
    public static final C19209a f51300s0;

    /* renamed from: s1 */
    public static final C19216h f51301s1 = new C19216h("TOD_SUBSCRIPTION_PAYMENT_CONTEXT", (String) null);

    /* renamed from: t0 */
    public static final C19209a f51302t0;

    /* renamed from: u0 */
    public static final C19209a f51303u0;

    /* renamed from: v0 */
    public static final C20217r f51304v0 = new C20217r();

    /* renamed from: w0 */
    public static final C19209a f51305w0;

    /* renamed from: x0 */
    public static final C19209a f51306x0;

    /* renamed from: y0 */
    public static final C19209a f51307y0;

    /* renamed from: z0 */
    public static final C19209a f51308z0;

    /* renamed from: vr.a$a */
    public class C20200a extends C19213e<Integer> {
        public C20200a(List list) {
            super("MOT_SCANNING_TIME_OFFSETS", list);
        }

        /* renamed from: c */
        public final Object mo51507c(String str) throws Exception {
            return Integer.valueOf(Integer.parseInt(str));
        }
    }

    /* renamed from: vr.a$b */
    public class C20201b extends C19210b<MVItineraryQuickAction, QuickAction> {
        public C20201b(List list) {
            super("ITINERARY_QUICK_ACTIONS", MVItineraryQuickAction.class, list);
        }

        /* renamed from: d */
        public final Object mo51506d(Enum enumR) throws Exception {
            switch (C20213n.f51312d[((MVItineraryQuickAction) enumR).ordinal()]) {
                case 1:
                    return QuickAction.ITINERARY_NAVIGATE;
                case 2:
                    return QuickAction.ITINERARY_SHARE;
                case 3:
                    return QuickAction.ITINERARY_REPORT;
                case 4:
                    return QuickAction.ITINERARY_TICKETING;
                case 5:
                    return QuickAction.ITINERARY_MOT;
                case 6:
                    return QuickAction.ITINERARY_NOTIFY_DRIVER;
                case 7:
                    return QuickAction.ITINERARY_LIVE_LOCATION;
                default:
                    return null;
            }
        }
    }

    /* renamed from: vr.a$c */
    public class C20202c extends C19210b<MVItineraryQuickAction, QuickAction> {
        public C20202c(List list) {
            super("ITINERARY_PREVIEW_QUICK_ACTIONS", MVItineraryQuickAction.class, list);
        }

        /* renamed from: d */
        public final Object mo51506d(Enum enumR) throws Exception {
            int i = C20213n.f51312d[((MVItineraryQuickAction) enumR).ordinal()];
            if (i == 1) {
                return QuickAction.ITINERARY_PREVIEW_NAVIGATE;
            }
            if (i == 2) {
                return QuickAction.ITINERARY_PREVIEW_SHARE;
            }
            if (i == 3) {
                return QuickAction.ITINERARY_PREVIEW_REPORT;
            }
            if (i == 4) {
                return QuickAction.ITINERARY_PREVIEW_TICKETING;
            }
            if (i != 5) {
                return null;
            }
            return QuickAction.ITINERARY_PREVIEW_MOT;
        }
    }

    /* renamed from: vr.a$d */
    public class C20203d extends C19210b<MVItineraryQuickAction, QuickAction> {
        public C20203d(List list) {
            super("ITINERARY_LIVE_DIRECTIONS_QUICK_ACTIONS", MVItineraryQuickAction.class, list);
        }

        /* renamed from: d */
        public final Object mo51506d(Enum enumR) throws Exception {
            switch (C20213n.f51312d[((MVItineraryQuickAction) enumR).ordinal()]) {
                case 1:
                    return QuickAction.ITINERARY_LIVE_DIRECTIONS_STOP;
                case 2:
                    return QuickAction.ITINERARY_LIVE_DIRECTIONS_SHARE;
                case 3:
                    return QuickAction.ITINERARY_LIVE_DIRECTIONS_REPORT;
                case 4:
                    return QuickAction.ITINERARY_LIVE_DIRECTIONS_TICKETING;
                case 5:
                    return QuickAction.ITINERARY_LIVE_DIRECTIONS_MOT;
                case 6:
                    return QuickAction.ITINERARY_LIVE_DIRECTIONS_NOTIFY_DRIVER;
                default:
                    return null;
            }
        }
    }

    /* renamed from: vr.a$e */
    public class C20204e extends C19210b<MVStopViewQuickAction, QuickAction> {
        public C20204e(List list) {
            super("STOP_QUICK_ACTIONS", MVStopViewQuickAction.class, list);
        }

        /* renamed from: d */
        public final Object mo51506d(Enum enumR) throws Exception {
            switch (C20213n.f51313e[((MVStopViewQuickAction) enumR).ordinal()]) {
                case 1:
                    return QuickAction.STOP_FAVORITE;
                case 2:
                    return QuickAction.STOP_REPORT;
                case 3:
                    return QuickAction.STOP_TICKETING;
                case 4:
                    return QuickAction.STOP_MOT;
                case 5:
                    return QuickAction.STOP_NOTIFY_DRIVER;
                case 6:
                    return QuickAction.STOP_LIVE_LOCATION;
                default:
                    return null;
            }
        }
    }

    /* renamed from: vr.a$f */
    public class C20205f extends C19210b<MVLineViewQuickAction, QuickAction> {
        public C20205f(List list) {
            super("LINE_QUICK_ACTIONS", MVLineViewQuickAction.class, list);
        }

        /* renamed from: d */
        public final Object mo51506d(Enum enumR) throws Exception {
            switch (C20213n.f51314f[((MVLineViewQuickAction) enumR).ordinal()]) {
                case 1:
                    return QuickAction.LINE_FAVORITE;
                case 2:
                    return QuickAction.LINE_REPORT;
                case 3:
                    return QuickAction.LINE_NAVIGATE;
                case 4:
                    return QuickAction.LINE_TICKETING;
                case 5:
                    return QuickAction.LINE_MOT;
                case 6:
                    return QuickAction.LINE_NOTIFY_DRIVER;
                case 7:
                    return QuickAction.LINE_LIVE_LOCATION;
                default:
                    return null;
            }
        }
    }

    /* renamed from: vr.a$g */
    public class C20206g extends C19210b<MVLineViewQuickAction, QuickAction> {
        public C20206g(List list) {
            super("LINE_QUICK_ACTIONS", MVLineViewQuickAction.class, list);
        }

        /* renamed from: d */
        public final Object mo51506d(Enum enumR) throws Exception {
            switch (C20213n.f51314f[((MVLineViewQuickAction) enumR).ordinal()]) {
                case 1:
                    return QuickAction.LINE_TRIP_FAVORITE;
                case 2:
                    return QuickAction.LINE_TRIP_REPORT;
                case 3:
                    return QuickAction.LINE_TRIP_NAVIGATE;
                case 4:
                    return QuickAction.LINE_TRIP_TICKETING;
                case 5:
                    return QuickAction.LINE_TRIP_MOT;
                case 6:
                    return QuickAction.LINE_TRIP_NOTIFY_DRIVER;
                case 7:
                    return QuickAction.LINE_TRIP_LIVE_LOCATION;
                default:
                    return null;
            }
        }
    }

    /* renamed from: vr.a$h */
    public class C20207h extends C19210b<MVLineViewQuickAction, QuickAction> {
        public C20207h(List list) {
            super("LINE_LIVE_DIRECTIONS_QUICK_ACTIONS", MVLineViewQuickAction.class, list);
        }

        /* renamed from: d */
        public final Object mo51506d(Enum enumR) throws Exception {
            int i = C20213n.f51314f[((MVLineViewQuickAction) enumR).ordinal()];
            if (i == 2) {
                return QuickAction.LINE_LIVE_DIRECTIONS_REPORT;
            }
            if (i == 3) {
                return QuickAction.LINE_LIVE_DIRECTIONS_STOP;
            }
            if (i == 4) {
                return QuickAction.LINE_LIVE_DIRECTIONS_TICKETING;
            }
            if (i == 5) {
                return QuickAction.LINE_LIVE_DIRECTIONS_MOT;
            }
            if (i != 6) {
                return null;
            }
            return QuickAction.LINE_LIVE_DIRECTIONS_NOTIFY_DRIVER;
        }
    }

    /* renamed from: vr.a$i */
    public class C20208i extends C19210b<MVTripPlanTimeQuickAction, TimeQuickAction> {
        public C20208i(List list) {
            super("TRIP_PLAN_TIME_QUICK_ACTIONS", MVTripPlanTimeQuickAction.class, list);
        }

        /* renamed from: d */
        public final Object mo51506d(Enum enumR) throws Exception {
            int i = C20213n.f51315g[((MVTripPlanTimeQuickAction) enumR).ordinal()];
            if (i == 1) {
                return TimeQuickAction.DEPART_NOW;
            }
            if (i == 2) {
                return TimeQuickAction.DEPART_AT;
            }
            if (i == 3) {
                return TimeQuickAction.ARRIVE_BY;
            }
            if (i != 4) {
                return null;
            }
            return TimeQuickAction.TAKE_LAST_LINE;
        }
    }

    /* renamed from: vr.a$j */
    public class C20209j extends C19215g<Boolean> {
        public C20209j(Boolean bool) {
            super("DASHBOARD_SECTION_FOR_PROFILE_WARNING", bool);
        }

        /* renamed from: b */
        public final Object mo49672b(String str) throws Exception {
            return Boolean.valueOf("TOD".equals(str));
        }
    }

    /* renamed from: vr.a$k */
    public class C20210k extends C19210b<MVHomeTab, HomeTab> {
        public C20210k(List list) {
            super("homeTabs", MVHomeTab.class, list);
        }

        /* renamed from: d */
        public final Object mo51506d(Enum enumR) throws Exception {
            switch (C20213n.f51309a[((MVHomeTab) enumR).ordinal()]) {
                case 1:
                    return HomeTab.DASHBOARD;
                case 2:
                    return HomeTab.NEARBY;
                case 3:
                    return HomeTab.LINES;
                case 4:
                    return HomeTab.EXPLORE;
                case 5:
                    return HomeTab.TRIP_PLANNER;
                case 6:
                    return HomeTab.TRANSIT_TYPE_STATIONS;
                case 7:
                    return HomeTab.TRANSIT_TYPE_LINES;
                case 8:
                    return HomeTab.WONDO_NEARBY;
                case 9:
                    return HomeTab.TICKETING_WALLET;
                default:
                    return null;
            }
        }
    }

    /* renamed from: vr.a$l */
    public class C20211l extends C19210b<MVUserProfileAccessibilityPref, UserProfileAccessibilityPrefType> {
        public C20211l(List list) {
            super("USER_PROFILE_ACCESSIBILITY_PREFERENCE_TYPES", MVUserProfileAccessibilityPref.class, list);
        }

        /* renamed from: d */
        public final Object mo51506d(Enum enumR) throws Exception {
            int i = C20213n.f51316h[((MVUserProfileAccessibilityPref) enumR).ordinal()];
            if (i == 1) {
                return UserProfileAccessibilityPrefType.TRIP_PLAN_ACCESSIBILITY_ROUTES;
            }
            if (i == 2) {
                return UserProfileAccessibilityPrefType.TRIP_PLAN_HIDE_MICRO_MOBILITY;
            }
            if (i == 3) {
                return UserProfileAccessibilityPrefType.TRIP_PLAN_TRAIN_ASSISTANCE;
            }
            if (i != 4) {
                return null;
            }
            return UserProfileAccessibilityPrefType.SERVICES_NOTIFY_DRIVER;
        }
    }

    /* renamed from: vr.a$m */
    public class C20212m extends C19213e<ServerId> {
        public C20212m(List list) {
            super("NOTIFY_DRIVER_AGENCY_IDS", list);
        }

        /* renamed from: c */
        public final Object mo51507c(String str) throws Exception {
            return ServerId.m11392b(str);
        }
    }

    /* renamed from: vr.a$n */
    public static /* synthetic */ class C20213n {

        /* renamed from: a */
        public static final /* synthetic */ int[] f51309a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f51310b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f51311c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f51312d;

        /* renamed from: e */
        public static final /* synthetic */ int[] f51313e;

        /* renamed from: f */
        public static final /* synthetic */ int[] f51314f;

        /* renamed from: g */
        public static final /* synthetic */ int[] f51315g;

        /* renamed from: h */
        public static final /* synthetic */ int[] f51316h;

        /* JADX WARNING: Can't wrap try/catch for region: R(134:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|(2:23|24)|25|27|28|29|30|31|32|(2:33|34)|35|(2:37|38)|39|(2:41|42)|43|(2:45|46)|47|49|50|51|52|53|54|55|56|57|58|(2:59|60)|61|63|64|65|66|67|68|69|70|71|72|73|74|(2:75|76)|77|79|80|81|82|83|84|85|86|87|88|89|90|(2:91|92)|93|(2:95|96)|97|99|100|101|102|103|104|105|106|107|108|109|110|111|112|(2:113|114)|115|(2:117|118)|119|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|(2:143|144)|145|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|(3:165|166|168)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(135:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|(2:23|24)|25|27|28|29|30|31|32|(2:33|34)|35|(2:37|38)|39|(2:41|42)|43|(2:45|46)|47|49|50|51|52|53|54|55|56|57|58|(2:59|60)|61|63|64|65|66|67|68|69|70|71|72|73|74|(2:75|76)|77|79|80|81|82|83|84|85|86|87|88|89|90|(2:91|92)|93|(2:95|96)|97|99|100|101|102|103|104|105|106|107|108|109|110|111|112|(2:113|114)|115|117|118|119|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|(2:143|144)|145|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|(3:165|166|168)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(138:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|(2:23|24)|25|27|28|29|30|31|32|(2:33|34)|35|(2:37|38)|39|(2:41|42)|43|(2:45|46)|47|49|50|51|52|53|54|55|56|57|58|59|60|61|63|64|65|66|67|68|69|70|71|72|73|74|(2:75|76)|77|79|80|81|82|83|84|85|86|87|88|89|90|(2:91|92)|93|(2:95|96)|97|99|100|101|102|103|104|105|106|107|108|109|110|111|112|(2:113|114)|115|117|118|119|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|(2:143|144)|145|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|168) */
        /* JADX WARNING: Can't wrap try/catch for region: R(139:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|(2:23|24)|25|27|28|29|30|31|32|(2:33|34)|35|(2:37|38)|39|(2:41|42)|43|(2:45|46)|47|49|50|51|52|53|54|55|56|57|58|59|60|61|63|64|65|66|67|68|69|70|71|72|73|74|(2:75|76)|77|79|80|81|82|83|84|85|86|87|88|89|90|(2:91|92)|93|(2:95|96)|97|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|117|118|119|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|(2:143|144)|145|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|168) */
        /* JADX WARNING: Can't wrap try/catch for region: R(140:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|(2:33|34)|35|(2:37|38)|39|(2:41|42)|43|(2:45|46)|47|49|50|51|52|53|54|55|56|57|58|59|60|61|63|64|65|66|67|68|69|70|71|72|73|74|(2:75|76)|77|79|80|81|82|83|84|85|86|87|88|89|90|(2:91|92)|93|(2:95|96)|97|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|117|118|119|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|(2:143|144)|145|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|168) */
        /* JADX WARNING: Can't wrap try/catch for region: R(141:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|(2:33|34)|35|(2:37|38)|39|(2:41|42)|43|(2:45|46)|47|49|50|51|52|53|54|55|56|57|58|59|60|61|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|79|80|81|82|83|84|85|86|87|88|89|90|(2:91|92)|93|(2:95|96)|97|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|117|118|119|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|(2:143|144)|145|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|168) */
        /* JADX WARNING: Can't wrap try/catch for region: R(143:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|(2:33|34)|35|(2:37|38)|39|(2:41|42)|43|45|46|47|49|50|51|52|53|54|55|56|57|58|59|60|61|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|79|80|81|82|83|84|85|86|87|88|89|90|(2:91|92)|93|(2:95|96)|97|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|117|118|119|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|(2:143|144)|145|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|168) */
        /* JADX WARNING: Can't wrap try/catch for region: R(145:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|(2:33|34)|35|(2:37|38)|39|41|42|43|45|46|47|49|50|51|52|53|54|55|56|57|58|59|60|61|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|79|80|81|82|83|84|85|86|87|88|89|90|(2:91|92)|93|(2:95|96)|97|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|117|118|119|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|(2:143|144)|145|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|168) */
        /* JADX WARNING: Can't wrap try/catch for region: R(148:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|(2:33|34)|35|37|38|39|41|42|43|45|46|47|49|50|51|52|53|54|55|56|57|58|59|60|61|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|79|80|81|82|83|84|85|86|87|88|89|90|(2:91|92)|93|95|96|97|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|117|118|119|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|(2:143|144)|145|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|168) */
        /* JADX WARNING: Can't wrap try/catch for region: R(149:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|(2:33|34)|35|37|38|39|41|42|43|45|46|47|49|50|51|52|53|54|55|56|57|58|59|60|61|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|79|80|81|82|83|84|85|86|87|88|89|90|(2:91|92)|93|95|96|97|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|117|118|119|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|(2:143|144)|145|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|168) */
        /* JADX WARNING: Can't wrap try/catch for region: R(150:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|37|38|39|41|42|43|45|46|47|49|50|51|52|53|54|55|56|57|58|59|60|61|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|79|80|81|82|83|84|85|86|87|88|89|90|(2:91|92)|93|95|96|97|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|117|118|119|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|(2:143|144)|145|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|168) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x01ac */
        /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x01b6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x01c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x01ca */
        /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x01d4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x01de */
        /* JADX WARNING: Missing exception handler attribute for start block: B:113:0x01e8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:123:0x020a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:125:0x0216 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:127:0x0222 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:129:0x022e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:131:0x023a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:133:0x0246 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:135:0x0252 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:137:0x025e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:139:0x026a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:141:0x0276 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:143:0x0282 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:149:0x029f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:151:0x02a9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:153:0x02b3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:155:0x02bd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:157:0x02c7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:159:0x02d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:161:0x02db */
        /* JADX WARNING: Missing exception handler attribute for start block: B:163:0x02e5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:165:0x02ef */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0087 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00c3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00cd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00d7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00eb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0106 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0110 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x011a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0124 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x012e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0138 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x0153 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x015d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0167 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x0171 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x017b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x0185 */
        static {
            /*
                com.tranzmate.moovit.protocol.conf.MVUserProfileAccessibilityPref[] r0 = com.tranzmate.moovit.protocol.conf.MVUserProfileAccessibilityPref.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f51316h = r0
                r1 = 1
                com.tranzmate.moovit.protocol.conf.MVUserProfileAccessibilityPref r2 = com.tranzmate.moovit.protocol.conf.MVUserProfileAccessibilityPref.TRIP_PLAN_ACCESSIBLE_ROUTES     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f51316h     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.conf.MVUserProfileAccessibilityPref r3 = com.tranzmate.moovit.protocol.conf.MVUserProfileAccessibilityPref.TRIP_PLAN_HIDE_MICRO_MOBILITY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f51316h     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.conf.MVUserProfileAccessibilityPref r4 = com.tranzmate.moovit.protocol.conf.MVUserProfileAccessibilityPref.TRIP_PLAN_TRAIN_ASSISTANCE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f51316h     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.conf.MVUserProfileAccessibilityPref r5 = com.tranzmate.moovit.protocol.conf.MVUserProfileAccessibilityPref.SERVICES_NOTIFY_DRIVER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.tranzmate.moovit.protocol.conf.MVTripPlanTimeQuickAction[] r4 = com.tranzmate.moovit.protocol.conf.MVTripPlanTimeQuickAction.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f51315g = r4
                com.tranzmate.moovit.protocol.conf.MVTripPlanTimeQuickAction r5 = com.tranzmate.moovit.protocol.conf.MVTripPlanTimeQuickAction.DEPART_NOW     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r4 = f51315g     // Catch:{ NoSuchFieldError -> 0x004e }
                com.tranzmate.moovit.protocol.conf.MVTripPlanTimeQuickAction r5 = com.tranzmate.moovit.protocol.conf.MVTripPlanTimeQuickAction.DEPART_AT     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r4 = f51315g     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.tranzmate.moovit.protocol.conf.MVTripPlanTimeQuickAction r5 = com.tranzmate.moovit.protocol.conf.MVTripPlanTimeQuickAction.ARRIVE_BY     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r4 = f51315g     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.tranzmate.moovit.protocol.conf.MVTripPlanTimeQuickAction r5 = com.tranzmate.moovit.protocol.conf.MVTripPlanTimeQuickAction.TAKE_LAST_LINE     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                com.tranzmate.moovit.protocol.conf.MVLineViewQuickAction[] r4 = com.tranzmate.moovit.protocol.conf.MVLineViewQuickAction.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f51314f = r4
                com.tranzmate.moovit.protocol.conf.MVLineViewQuickAction r5 = com.tranzmate.moovit.protocol.conf.MVLineViewQuickAction.FAVORITE     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r4 = f51314f     // Catch:{ NoSuchFieldError -> 0x007d }
                com.tranzmate.moovit.protocol.conf.MVLineViewQuickAction r5 = com.tranzmate.moovit.protocol.conf.MVLineViewQuickAction.REPORT     // Catch:{ NoSuchFieldError -> 0x007d }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                int[] r4 = f51314f     // Catch:{ NoSuchFieldError -> 0x0087 }
                com.tranzmate.moovit.protocol.conf.MVLineViewQuickAction r5 = com.tranzmate.moovit.protocol.conf.MVLineViewQuickAction.GET_OFF_ALERTS     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                int[] r4 = f51314f     // Catch:{ NoSuchFieldError -> 0x0091 }
                com.tranzmate.moovit.protocol.conf.MVLineViewQuickAction r5 = com.tranzmate.moovit.protocol.conf.MVLineViewQuickAction.PURCHASE     // Catch:{ NoSuchFieldError -> 0x0091 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0091 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0091 }
            L_0x0091:
                r4 = 5
                int[] r5 = f51314f     // Catch:{ NoSuchFieldError -> 0x009c }
                com.tranzmate.moovit.protocol.conf.MVLineViewQuickAction r6 = com.tranzmate.moovit.protocol.conf.MVLineViewQuickAction.VALIDATE     // Catch:{ NoSuchFieldError -> 0x009c }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                r5 = 6
                int[] r6 = f51314f     // Catch:{ NoSuchFieldError -> 0x00a7 }
                com.tranzmate.moovit.protocol.conf.MVLineViewQuickAction r7 = com.tranzmate.moovit.protocol.conf.MVLineViewQuickAction.NOTIFY_DRIVER     // Catch:{ NoSuchFieldError -> 0x00a7 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a7 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x00a7 }
            L_0x00a7:
                r6 = 7
                int[] r7 = f51314f     // Catch:{ NoSuchFieldError -> 0x00b2 }
                com.tranzmate.moovit.protocol.conf.MVLineViewQuickAction r8 = com.tranzmate.moovit.protocol.conf.MVLineViewQuickAction.LIVE_LOCATION     // Catch:{ NoSuchFieldError -> 0x00b2 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b2 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x00b2 }
            L_0x00b2:
                com.tranzmate.moovit.protocol.conf.MVStopViewQuickAction[] r7 = com.tranzmate.moovit.protocol.conf.MVStopViewQuickAction.values()
                int r7 = r7.length
                int[] r7 = new int[r7]
                f51313e = r7
                com.tranzmate.moovit.protocol.conf.MVStopViewQuickAction r8 = com.tranzmate.moovit.protocol.conf.MVStopViewQuickAction.FAVORITE     // Catch:{ NoSuchFieldError -> 0x00c3 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c3 }
                r7[r8] = r1     // Catch:{ NoSuchFieldError -> 0x00c3 }
            L_0x00c3:
                int[] r7 = f51313e     // Catch:{ NoSuchFieldError -> 0x00cd }
                com.tranzmate.moovit.protocol.conf.MVStopViewQuickAction r8 = com.tranzmate.moovit.protocol.conf.MVStopViewQuickAction.REPORT     // Catch:{ NoSuchFieldError -> 0x00cd }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cd }
                r7[r8] = r0     // Catch:{ NoSuchFieldError -> 0x00cd }
            L_0x00cd:
                int[] r7 = f51313e     // Catch:{ NoSuchFieldError -> 0x00d7 }
                com.tranzmate.moovit.protocol.conf.MVStopViewQuickAction r8 = com.tranzmate.moovit.protocol.conf.MVStopViewQuickAction.PURCHASE     // Catch:{ NoSuchFieldError -> 0x00d7 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d7 }
                r7[r8] = r2     // Catch:{ NoSuchFieldError -> 0x00d7 }
            L_0x00d7:
                int[] r7 = f51313e     // Catch:{ NoSuchFieldError -> 0x00e1 }
                com.tranzmate.moovit.protocol.conf.MVStopViewQuickAction r8 = com.tranzmate.moovit.protocol.conf.MVStopViewQuickAction.VALIDATE     // Catch:{ NoSuchFieldError -> 0x00e1 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e1 }
                r7[r8] = r3     // Catch:{ NoSuchFieldError -> 0x00e1 }
            L_0x00e1:
                int[] r7 = f51313e     // Catch:{ NoSuchFieldError -> 0x00eb }
                com.tranzmate.moovit.protocol.conf.MVStopViewQuickAction r8 = com.tranzmate.moovit.protocol.conf.MVStopViewQuickAction.NOTIFY_DRIVER     // Catch:{ NoSuchFieldError -> 0x00eb }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00eb }
                r7[r8] = r4     // Catch:{ NoSuchFieldError -> 0x00eb }
            L_0x00eb:
                int[] r7 = f51313e     // Catch:{ NoSuchFieldError -> 0x00f5 }
                com.tranzmate.moovit.protocol.conf.MVStopViewQuickAction r8 = com.tranzmate.moovit.protocol.conf.MVStopViewQuickAction.LIVE_LOCATION     // Catch:{ NoSuchFieldError -> 0x00f5 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f5 }
                r7[r8] = r5     // Catch:{ NoSuchFieldError -> 0x00f5 }
            L_0x00f5:
                com.tranzmate.moovit.protocol.conf.MVItineraryQuickAction[] r7 = com.tranzmate.moovit.protocol.conf.MVItineraryQuickAction.values()
                int r7 = r7.length
                int[] r7 = new int[r7]
                f51312d = r7
                com.tranzmate.moovit.protocol.conf.MVItineraryQuickAction r8 = com.tranzmate.moovit.protocol.conf.MVItineraryQuickAction.NAVIGATE     // Catch:{ NoSuchFieldError -> 0x0106 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0106 }
                r7[r8] = r1     // Catch:{ NoSuchFieldError -> 0x0106 }
            L_0x0106:
                int[] r7 = f51312d     // Catch:{ NoSuchFieldError -> 0x0110 }
                com.tranzmate.moovit.protocol.conf.MVItineraryQuickAction r8 = com.tranzmate.moovit.protocol.conf.MVItineraryQuickAction.SHARE     // Catch:{ NoSuchFieldError -> 0x0110 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0110 }
                r7[r8] = r0     // Catch:{ NoSuchFieldError -> 0x0110 }
            L_0x0110:
                int[] r7 = f51312d     // Catch:{ NoSuchFieldError -> 0x011a }
                com.tranzmate.moovit.protocol.conf.MVItineraryQuickAction r8 = com.tranzmate.moovit.protocol.conf.MVItineraryQuickAction.REPORT     // Catch:{ NoSuchFieldError -> 0x011a }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x011a }
                r7[r8] = r2     // Catch:{ NoSuchFieldError -> 0x011a }
            L_0x011a:
                int[] r7 = f51312d     // Catch:{ NoSuchFieldError -> 0x0124 }
                com.tranzmate.moovit.protocol.conf.MVItineraryQuickAction r8 = com.tranzmate.moovit.protocol.conf.MVItineraryQuickAction.PURCHASE_TICKET     // Catch:{ NoSuchFieldError -> 0x0124 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0124 }
                r7[r8] = r3     // Catch:{ NoSuchFieldError -> 0x0124 }
            L_0x0124:
                int[] r7 = f51312d     // Catch:{ NoSuchFieldError -> 0x012e }
                com.tranzmate.moovit.protocol.conf.MVItineraryQuickAction r8 = com.tranzmate.moovit.protocol.conf.MVItineraryQuickAction.VALIDATE     // Catch:{ NoSuchFieldError -> 0x012e }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x012e }
                r7[r8] = r4     // Catch:{ NoSuchFieldError -> 0x012e }
            L_0x012e:
                int[] r7 = f51312d     // Catch:{ NoSuchFieldError -> 0x0138 }
                com.tranzmate.moovit.protocol.conf.MVItineraryQuickAction r8 = com.tranzmate.moovit.protocol.conf.MVItineraryQuickAction.NOTIFY_DRIVER     // Catch:{ NoSuchFieldError -> 0x0138 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0138 }
                r7[r8] = r5     // Catch:{ NoSuchFieldError -> 0x0138 }
            L_0x0138:
                int[] r7 = f51312d     // Catch:{ NoSuchFieldError -> 0x0142 }
                com.tranzmate.moovit.protocol.conf.MVItineraryQuickAction r8 = com.tranzmate.moovit.protocol.conf.MVItineraryQuickAction.LIVE_LOCATION     // Catch:{ NoSuchFieldError -> 0x0142 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0142 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0142 }
            L_0x0142:
                com.tranzmate.moovit.protocol.common.MVRouteType[] r7 = com.tranzmate.moovit.protocol.common.MVRouteType.values()
                int r7 = r7.length
                int[] r7 = new int[r7]
                f51311c = r7
                com.tranzmate.moovit.protocol.common.MVRouteType r8 = com.tranzmate.moovit.protocol.common.MVRouteType.Tram     // Catch:{ NoSuchFieldError -> 0x0153 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0153 }
                r7[r8] = r1     // Catch:{ NoSuchFieldError -> 0x0153 }
            L_0x0153:
                int[] r7 = f51311c     // Catch:{ NoSuchFieldError -> 0x015d }
                com.tranzmate.moovit.protocol.common.MVRouteType r8 = com.tranzmate.moovit.protocol.common.MVRouteType.Subway     // Catch:{ NoSuchFieldError -> 0x015d }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x015d }
                r7[r8] = r0     // Catch:{ NoSuchFieldError -> 0x015d }
            L_0x015d:
                int[] r7 = f51311c     // Catch:{ NoSuchFieldError -> 0x0167 }
                com.tranzmate.moovit.protocol.common.MVRouteType r8 = com.tranzmate.moovit.protocol.common.MVRouteType.Rail     // Catch:{ NoSuchFieldError -> 0x0167 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0167 }
                r7[r8] = r2     // Catch:{ NoSuchFieldError -> 0x0167 }
            L_0x0167:
                int[] r7 = f51311c     // Catch:{ NoSuchFieldError -> 0x0171 }
                com.tranzmate.moovit.protocol.common.MVRouteType r8 = com.tranzmate.moovit.protocol.common.MVRouteType.Bus     // Catch:{ NoSuchFieldError -> 0x0171 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0171 }
                r7[r8] = r3     // Catch:{ NoSuchFieldError -> 0x0171 }
            L_0x0171:
                int[] r7 = f51311c     // Catch:{ NoSuchFieldError -> 0x017b }
                com.tranzmate.moovit.protocol.common.MVRouteType r8 = com.tranzmate.moovit.protocol.common.MVRouteType.Ferry     // Catch:{ NoSuchFieldError -> 0x017b }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x017b }
                r7[r8] = r4     // Catch:{ NoSuchFieldError -> 0x017b }
            L_0x017b:
                int[] r7 = f51311c     // Catch:{ NoSuchFieldError -> 0x0185 }
                com.tranzmate.moovit.protocol.common.MVRouteType r8 = com.tranzmate.moovit.protocol.common.MVRouteType.Cable     // Catch:{ NoSuchFieldError -> 0x0185 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0185 }
                r7[r8] = r5     // Catch:{ NoSuchFieldError -> 0x0185 }
            L_0x0185:
                int[] r7 = f51311c     // Catch:{ NoSuchFieldError -> 0x018f }
                com.tranzmate.moovit.protocol.common.MVRouteType r8 = com.tranzmate.moovit.protocol.common.MVRouteType.Gondola     // Catch:{ NoSuchFieldError -> 0x018f }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x018f }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x018f }
            L_0x018f:
                r7 = 8
                int[] r8 = f51311c     // Catch:{ NoSuchFieldError -> 0x019b }
                com.tranzmate.moovit.protocol.common.MVRouteType r9 = com.tranzmate.moovit.protocol.common.MVRouteType.Funicular     // Catch:{ NoSuchFieldError -> 0x019b }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x019b }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x019b }
            L_0x019b:
                com.tranzmate.moovit.protocol.conf.MVDashboardSection[] r8 = com.tranzmate.moovit.protocol.conf.MVDashboardSection.values()
                int r8 = r8.length
                int[] r8 = new int[r8]
                f51310b = r8
                com.tranzmate.moovit.protocol.conf.MVDashboardSection r9 = com.tranzmate.moovit.protocol.conf.MVDashboardSection.NO_GPS     // Catch:{ NoSuchFieldError -> 0x01ac }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ac }
                r8[r9] = r1     // Catch:{ NoSuchFieldError -> 0x01ac }
            L_0x01ac:
                int[] r8 = f51310b     // Catch:{ NoSuchFieldError -> 0x01b6 }
                com.tranzmate.moovit.protocol.conf.MVDashboardSection r9 = com.tranzmate.moovit.protocol.conf.MVDashboardSection.ACTIVE_NAVIGATION     // Catch:{ NoSuchFieldError -> 0x01b6 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b6 }
                r8[r9] = r0     // Catch:{ NoSuchFieldError -> 0x01b6 }
            L_0x01b6:
                int[] r8 = f51310b     // Catch:{ NoSuchFieldError -> 0x01c0 }
                com.tranzmate.moovit.protocol.conf.MVDashboardSection r9 = com.tranzmate.moovit.protocol.conf.MVDashboardSection.TOD     // Catch:{ NoSuchFieldError -> 0x01c0 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c0 }
                r8[r9] = r2     // Catch:{ NoSuchFieldError -> 0x01c0 }
            L_0x01c0:
                int[] r8 = f51310b     // Catch:{ NoSuchFieldError -> 0x01ca }
                com.tranzmate.moovit.protocol.conf.MVDashboardSection r9 = com.tranzmate.moovit.protocol.conf.MVDashboardSection.RIDE_SHARING     // Catch:{ NoSuchFieldError -> 0x01ca }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ca }
                r8[r9] = r3     // Catch:{ NoSuchFieldError -> 0x01ca }
            L_0x01ca:
                int[] r8 = f51310b     // Catch:{ NoSuchFieldError -> 0x01d4 }
                com.tranzmate.moovit.protocol.conf.MVDashboardSection r9 = com.tranzmate.moovit.protocol.conf.MVDashboardSection.CARPOOL     // Catch:{ NoSuchFieldError -> 0x01d4 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d4 }
                r8[r9] = r4     // Catch:{ NoSuchFieldError -> 0x01d4 }
            L_0x01d4:
                int[] r8 = f51310b     // Catch:{ NoSuchFieldError -> 0x01de }
                com.tranzmate.moovit.protocol.conf.MVDashboardSection r9 = com.tranzmate.moovit.protocol.conf.MVDashboardSection.TAXI     // Catch:{ NoSuchFieldError -> 0x01de }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x01de }
                r8[r9] = r5     // Catch:{ NoSuchFieldError -> 0x01de }
            L_0x01de:
                int[] r8 = f51310b     // Catch:{ NoSuchFieldError -> 0x01e8 }
                com.tranzmate.moovit.protocol.conf.MVDashboardSection r9 = com.tranzmate.moovit.protocol.conf.MVDashboardSection.TOPUP     // Catch:{ NoSuchFieldError -> 0x01e8 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x01e8 }
                r8[r9] = r6     // Catch:{ NoSuchFieldError -> 0x01e8 }
            L_0x01e8:
                int[] r8 = f51310b     // Catch:{ NoSuchFieldError -> 0x01f2 }
                com.tranzmate.moovit.protocol.conf.MVDashboardSection r9 = com.tranzmate.moovit.protocol.conf.MVDashboardSection.COMMUNITY     // Catch:{ NoSuchFieldError -> 0x01f2 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x01f2 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x01f2 }
            L_0x01f2:
                r8 = 9
                int[] r9 = f51310b     // Catch:{ NoSuchFieldError -> 0x01fe }
                com.tranzmate.moovit.protocol.conf.MVDashboardSection r10 = com.tranzmate.moovit.protocol.conf.MVDashboardSection.FAVORITE_LOCATIONS     // Catch:{ NoSuchFieldError -> 0x01fe }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x01fe }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x01fe }
            L_0x01fe:
                r9 = 10
                int[] r10 = f51310b     // Catch:{ NoSuchFieldError -> 0x020a }
                com.tranzmate.moovit.protocol.conf.MVDashboardSection r11 = com.tranzmate.moovit.protocol.conf.MVDashboardSection.FAVORITE_STATIONS     // Catch:{ NoSuchFieldError -> 0x020a }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x020a }
                r10[r11] = r9     // Catch:{ NoSuchFieldError -> 0x020a }
            L_0x020a:
                int[] r10 = f51310b     // Catch:{ NoSuchFieldError -> 0x0216 }
                com.tranzmate.moovit.protocol.conf.MVDashboardSection r11 = com.tranzmate.moovit.protocol.conf.MVDashboardSection.RECENT_ITINERARIES     // Catch:{ NoSuchFieldError -> 0x0216 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0216 }
                r12 = 11
                r10[r11] = r12     // Catch:{ NoSuchFieldError -> 0x0216 }
            L_0x0216:
                int[] r10 = f51310b     // Catch:{ NoSuchFieldError -> 0x0222 }
                com.tranzmate.moovit.protocol.conf.MVDashboardSection r11 = com.tranzmate.moovit.protocol.conf.MVDashboardSection.PROMOTION     // Catch:{ NoSuchFieldError -> 0x0222 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0222 }
                r12 = 12
                r10[r11] = r12     // Catch:{ NoSuchFieldError -> 0x0222 }
            L_0x0222:
                int[] r10 = f51310b     // Catch:{ NoSuchFieldError -> 0x022e }
                com.tranzmate.moovit.protocol.conf.MVDashboardSection r11 = com.tranzmate.moovit.protocol.conf.MVDashboardSection.TICKETS     // Catch:{ NoSuchFieldError -> 0x022e }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x022e }
                r12 = 13
                r10[r11] = r12     // Catch:{ NoSuchFieldError -> 0x022e }
            L_0x022e:
                int[] r10 = f51310b     // Catch:{ NoSuchFieldError -> 0x023a }
                com.tranzmate.moovit.protocol.conf.MVDashboardSection r11 = com.tranzmate.moovit.protocol.conf.MVDashboardSection.WEB_PAGES     // Catch:{ NoSuchFieldError -> 0x023a }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x023a }
                r12 = 14
                r10[r11] = r12     // Catch:{ NoSuchFieldError -> 0x023a }
            L_0x023a:
                int[] r10 = f51310b     // Catch:{ NoSuchFieldError -> 0x0246 }
                com.tranzmate.moovit.protocol.conf.MVDashboardSection r11 = com.tranzmate.moovit.protocol.conf.MVDashboardSection.MOT     // Catch:{ NoSuchFieldError -> 0x0246 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0246 }
                r12 = 15
                r10[r11] = r12     // Catch:{ NoSuchFieldError -> 0x0246 }
            L_0x0246:
                int[] r10 = f51310b     // Catch:{ NoSuchFieldError -> 0x0252 }
                com.tranzmate.moovit.protocol.conf.MVDashboardSection r11 = com.tranzmate.moovit.protocol.conf.MVDashboardSection.WALLET     // Catch:{ NoSuchFieldError -> 0x0252 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0252 }
                r12 = 16
                r10[r11] = r12     // Catch:{ NoSuchFieldError -> 0x0252 }
            L_0x0252:
                int[] r10 = f51310b     // Catch:{ NoSuchFieldError -> 0x025e }
                com.tranzmate.moovit.protocol.conf.MVDashboardSection r11 = com.tranzmate.moovit.protocol.conf.MVDashboardSection.ADS     // Catch:{ NoSuchFieldError -> 0x025e }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x025e }
                r12 = 17
                r10[r11] = r12     // Catch:{ NoSuchFieldError -> 0x025e }
            L_0x025e:
                int[] r10 = f51310b     // Catch:{ NoSuchFieldError -> 0x026a }
                com.tranzmate.moovit.protocol.conf.MVDashboardSection r11 = com.tranzmate.moovit.protocol.conf.MVDashboardSection.SUGGESTIONS     // Catch:{ NoSuchFieldError -> 0x026a }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x026a }
                r12 = 18
                r10[r11] = r12     // Catch:{ NoSuchFieldError -> 0x026a }
            L_0x026a:
                int[] r10 = f51310b     // Catch:{ NoSuchFieldError -> 0x0276 }
                com.tranzmate.moovit.protocol.conf.MVDashboardSection r11 = com.tranzmate.moovit.protocol.conf.MVDashboardSection.ATAF_TICKETS     // Catch:{ NoSuchFieldError -> 0x0276 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0276 }
                r12 = 19
                r10[r11] = r12     // Catch:{ NoSuchFieldError -> 0x0276 }
            L_0x0276:
                int[] r10 = f51310b     // Catch:{ NoSuchFieldError -> 0x0282 }
                com.tranzmate.moovit.protocol.conf.MVDashboardSection r11 = com.tranzmate.moovit.protocol.conf.MVDashboardSection.BUSITALIA_TOD     // Catch:{ NoSuchFieldError -> 0x0282 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0282 }
                r12 = 20
                r10[r11] = r12     // Catch:{ NoSuchFieldError -> 0x0282 }
            L_0x0282:
                int[] r10 = f51310b     // Catch:{ NoSuchFieldError -> 0x028e }
                com.tranzmate.moovit.protocol.conf.MVDashboardSection r11 = com.tranzmate.moovit.protocol.conf.MVDashboardSection.GTT_TOD     // Catch:{ NoSuchFieldError -> 0x028e }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x028e }
                r12 = 21
                r10[r11] = r12     // Catch:{ NoSuchFieldError -> 0x028e }
            L_0x028e:
                com.tranzmate.moovit.protocol.conf.MVHomeTab[] r10 = com.tranzmate.moovit.protocol.conf.MVHomeTab.values()
                int r10 = r10.length
                int[] r10 = new int[r10]
                f51309a = r10
                com.tranzmate.moovit.protocol.conf.MVHomeTab r11 = com.tranzmate.moovit.protocol.conf.MVHomeTab.DASHBOARD     // Catch:{ NoSuchFieldError -> 0x029f }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x029f }
                r10[r11] = r1     // Catch:{ NoSuchFieldError -> 0x029f }
            L_0x029f:
                int[] r1 = f51309a     // Catch:{ NoSuchFieldError -> 0x02a9 }
                com.tranzmate.moovit.protocol.conf.MVHomeTab r10 = com.tranzmate.moovit.protocol.conf.MVHomeTab.NEARBY     // Catch:{ NoSuchFieldError -> 0x02a9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x02a9 }
                r1[r10] = r0     // Catch:{ NoSuchFieldError -> 0x02a9 }
            L_0x02a9:
                int[] r0 = f51309a     // Catch:{ NoSuchFieldError -> 0x02b3 }
                com.tranzmate.moovit.protocol.conf.MVHomeTab r1 = com.tranzmate.moovit.protocol.conf.MVHomeTab.LINES     // Catch:{ NoSuchFieldError -> 0x02b3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02b3 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02b3 }
            L_0x02b3:
                int[] r0 = f51309a     // Catch:{ NoSuchFieldError -> 0x02bd }
                com.tranzmate.moovit.protocol.conf.MVHomeTab r1 = com.tranzmate.moovit.protocol.conf.MVHomeTab.EXPLORE     // Catch:{ NoSuchFieldError -> 0x02bd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02bd }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x02bd }
            L_0x02bd:
                int[] r0 = f51309a     // Catch:{ NoSuchFieldError -> 0x02c7 }
                com.tranzmate.moovit.protocol.conf.MVHomeTab r1 = com.tranzmate.moovit.protocol.conf.MVHomeTab.TRIP_PLANNER     // Catch:{ NoSuchFieldError -> 0x02c7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02c7 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x02c7 }
            L_0x02c7:
                int[] r0 = f51309a     // Catch:{ NoSuchFieldError -> 0x02d1 }
                com.tranzmate.moovit.protocol.conf.MVHomeTab r1 = com.tranzmate.moovit.protocol.conf.MVHomeTab.TRANSIT_TYPE_STATIONS     // Catch:{ NoSuchFieldError -> 0x02d1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02d1 }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x02d1 }
            L_0x02d1:
                int[] r0 = f51309a     // Catch:{ NoSuchFieldError -> 0x02db }
                com.tranzmate.moovit.protocol.conf.MVHomeTab r1 = com.tranzmate.moovit.protocol.conf.MVHomeTab.TRANSIT_TYPE_LINES     // Catch:{ NoSuchFieldError -> 0x02db }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02db }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x02db }
            L_0x02db:
                int[] r0 = f51309a     // Catch:{ NoSuchFieldError -> 0x02e5 }
                com.tranzmate.moovit.protocol.conf.MVHomeTab r1 = com.tranzmate.moovit.protocol.conf.MVHomeTab.WONDO_NEARBY     // Catch:{ NoSuchFieldError -> 0x02e5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02e5 }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x02e5 }
            L_0x02e5:
                int[] r0 = f51309a     // Catch:{ NoSuchFieldError -> 0x02ef }
                com.tranzmate.moovit.protocol.conf.MVHomeTab r1 = com.tranzmate.moovit.protocol.conf.MVHomeTab.TICKETING_WALLET     // Catch:{ NoSuchFieldError -> 0x02ef }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02ef }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x02ef }
            L_0x02ef:
                int[] r0 = f51309a     // Catch:{ NoSuchFieldError -> 0x02f9 }
                com.tranzmate.moovit.protocol.conf.MVHomeTab r1 = com.tranzmate.moovit.protocol.conf.MVHomeTab.ALL_IN_ONE     // Catch:{ NoSuchFieldError -> 0x02f9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02f9 }
                r0[r1] = r9     // Catch:{ NoSuchFieldError -> 0x02f9 }
            L_0x02f9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p874vr.C20199a.C20213n.<clinit>():void");
        }
    }

    /* renamed from: vr.a$o */
    public class C20214o extends C19210b<MVDashboardSection, DashboardSection> {
        public C20214o(List list) {
            super("DASHBOARD_SECTIONS", MVDashboardSection.class, list);
        }

        /* renamed from: d */
        public final Object mo51506d(Enum enumR) throws Exception {
            switch (C20213n.f51310b[((MVDashboardSection) enumR).ordinal()]) {
                case 1:
                    return DashboardSection.LOCATION_SERVICES_ALERT;
                case 2:
                    return DashboardSection.NAVIGABLE;
                case 3:
                    return DashboardSection.TOD;
                case 4:
                    return DashboardSection.EVENTS;
                case 5:
                    return DashboardSection.CARPOOL;
                case 6:
                    return DashboardSection.TAXI;
                case 7:
                    return DashboardSection.TOPUP;
                case 8:
                    return DashboardSection.COMMUNITY;
                case 9:
                    return DashboardSection.FAVORITE_LOCATIONS;
                case 10:
                    return DashboardSection.FAVORITE_STATIONS;
                case 11:
                    return DashboardSection.ITINERARY_HISTORY;
                case 12:
                    return DashboardSection.PROMOTION;
                case 13:
                    return DashboardSection.TICKETS;
                case 14:
                    return DashboardSection.WEB_PAGES;
                case 15:
                    return DashboardSection.MOT;
                case 16:
                    return DashboardSection.WALLET;
                case 17:
                    return DashboardSection.ADS;
                case 18:
                    return DashboardSection.SUGGESTIONS;
                case 19:
                    return DashboardSection.ATAF_TICKETS;
                case 20:
                    return DashboardSection.BUS_ITALIA_TOD;
                case 21:
                    return DashboardSection.GTT_TOD;
                default:
                    return null;
            }
        }
    }

    /* renamed from: vr.a$p */
    public class C20215p extends C19047a.C19049b<C19199c> {
        public C20215p() {
            super(null);
        }

        /* renamed from: a */
        public final Object mo39882a(Map map) throws Exception {
            if (C19209a.m46358d((String) map.get("is_topup_tab_enable"))) {
                String str = (String) map.get("TopUpText");
                String str2 = (String) map.get("topup_tab_link");
                if (!(str == null || str2 == null || !URLUtil.isValidUrl(str2))) {
                    return new C19199c(str);
                }
            }
            return null;
        }
    }

    /* renamed from: vr.a$q */
    public class C20216q extends C19047a.C19049b<C20944i0<String, String>> {
        public C20216q() {
            super(null);
        }

        /* renamed from: a */
        public final Object mo39882a(Map map) throws Exception {
            String str = (String) map.get("CarPoolAttributionText");
            if (C20964s0.m49090h(str)) {
                return null;
            }
            String str2 = (String) map.get("CarPoolAttributionImageUrl");
            if (!URLUtil.isValidUrl(str2)) {
                return null;
            }
            return new C20944i0(str, str2);
        }
    }

    /* renamed from: vr.a$r */
    public class C20217r extends C19874a {
        public C20217r() {
            super(0);
        }

        /* renamed from: b */
        public final Integer mo39882a(Map<String, String> map) throws Exception {
            return Integer.valueOf(super.mo39882a(map).intValue() & -5);
        }
    }

    /* renamed from: vr.a$s */
    public class C20218s extends C19213e<Long> {
        public C20218s(List list) {
            super("HELP_CENTER_CATEGORY_IDS", list);
        }

        /* renamed from: c */
        public final Object mo51507c(String str) throws Exception {
            return Long.valueOf(Long.parseLong(str));
        }
    }

    /* renamed from: vr.a$t */
    public class C20219t extends C19215g<Boolean> {
        public C20219t(Boolean bool) {
            super("DASHBOARD_SECTION_FOR_PROFILE_WARNING", bool);
        }

        /* renamed from: b */
        public final Object mo49672b(String str) throws Exception {
            return Boolean.valueOf("MOT".equals(str));
        }
    }

    /* renamed from: vr.a$u */
    public class C20220u extends C19210b<MVRouteType, TransitType.VehicleType> {
        public C20220u(List list) {
            super("MOT_SUPPORTED_VEHICLE_TYPES", MVRouteType.class, list);
        }

        /* renamed from: d */
        public final Object mo51506d(Enum enumR) throws Exception {
            switch (C20213n.f51311c[((MVRouteType) enumR).ordinal()]) {
                case 1:
                    return TransitType.VehicleType.TRAM;
                case 2:
                    return TransitType.VehicleType.SUBWAY;
                case 3:
                    return TransitType.VehicleType.TRAIN;
                case 4:
                    return TransitType.VehicleType.BUS;
                case 5:
                    return TransitType.VehicleType.FERRY;
                case 6:
                    return TransitType.VehicleType.CABLE;
                case 7:
                    return TransitType.VehicleType.GONDOLA;
                case 8:
                    return TransitType.VehicleType.FUNICULAR;
                default:
                    return null;
            }
        }
    }

    /* renamed from: vr.a$v */
    public class C20221v extends C19213e<Integer> {
        public C20221v(List list) {
            super("MOT_SCANNING_RADIUS", list);
        }

        /* renamed from: c */
        public final Object mo51507c(String str) throws Exception {
            return Integer.valueOf(Integer.parseInt(str));
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f51280i0 = new C19209a("IS_STOP_MAP_ITEMS_PRELOAD_SUPPORTED", bool);
        f51282j0 = new C19209a("IS_STOP_EDITING_SUPPORTED", bool);
        f51284k0 = new C19209a("IS_USER_REPORTS_ENABLED", bool);
        f51286l0 = new C19209a("SHOW_NEW_ITINERARIES_HINT", bool);
        f51290n0 = new C19209a("showRideRequestSection", bool);
        f51294p0 = new C19209a("carPoolReferralIndication", bool);
        f51296q0 = new C19209a("showCommunitySection", bool);
        f51300s0 = new C19209a("IS_RIDE_SHARING_SUPPORT", bool);
        f51302t0 = new C19209a("IS_RIDE_SHARING_EVENTS_SUPPORT", bool);
        f51303u0 = new C19209a("IS_USER_CAMPAIGNS_SUPPORTED", bool);
        f51305w0 = new C19209a("TRIP_PLAN_PERSONALIZATION_POPUP_ENABLED", bool);
        f51306x0 = new C19209a("IS_WONDO_CO_BRAND", bool);
        f51307y0 = new C19209a("IS_WONDO_CODES_SUPPORTED", bool);
        f51308z0 = new C19209a("ALLOW_SELL_DATA_PRIVACY_SETTING", bool);
        f51239A0 = new C19209a("PERSONALIZED_ADS_PRIVACY_SETTING", bool);
        f51241C0 = new C19209a("IS_ONBOARDING_CAMPAIGN_ENABLED", bool);
        f51242D0 = new C19209a("IS_MOT_SUPPORTED", bool);
        Boolean bool2 = Boolean.TRUE;
        f51243E0 = new C20219t(bool2);
        f51256R0 = new C19209a("IS_FEEDBACK_SHOWN", bool2);
        f51258T0 = new C20209j(bool);
        f51261W0 = new C19209a("IS_GDPR_SUPPORTED", bool);
        f51264Z0 = new C19209a("IS_ADD_STATION_IMAGE_SUPPORTED", bool2);
        f51271d1 = new C19209a("SHOULD_ALWAYS_DISPLAY_DRIVER_CONNECTION", bool);
        f51275f1 = new C19209a("IS_RETURN_TRIP_REMINDER_ENABLED", bool);
        f51277g1 = new C19209a("IS_SUBSCRIPTION_OFFERING_SUPPORTED", bool);
        f51279h1 = new C19209a("IS_SUBSCRIPTION_PROMO_SUPPORTED", bool);
        f51299r1 = new C19209a("IS_TOD_SUBSCRIPTION_SUPPORTED", bool);
    }
}
