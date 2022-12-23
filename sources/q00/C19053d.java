package q00;

import android.webkit.URLUtil;
import com.google.android.gms.nearby.messages.Strategy;
import com.moovit.MoovitApplication;
import com.moovit.commons.request.BadResponseException;
import com.moovit.map.MapImplType;
import com.moovit.tripplanner.TripPlannerRouteType;
import com.moovit.tripplanner.TripPlannerSortType;
import com.moovit.tripplanner.TripPlannerTransportType;
import com.moovit.tripplanner.TripPlannerWalkingPrefType;
import com.tranzmate.moovit.protocol.common.MVDayOfWeek;
import com.tranzmate.moovit.protocol.conf.MVMapImplType;
import com.tranzmate.moovit.protocol.conf.MVTripPlanOption;
import com.tranzmate.moovit.protocol.tripplanner.MVSectionSortType;
import com.tranzmate.moovit.protocol.tripplanner.MVTripPlanWalkingPreference;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mf0.C24361g;
import o20.C18707m;
import p583jk.C17884p;
import p977zz.C20950l0;
import p977zz.C20964s0;
import q00.C19047a;
import r00.C19209a;
import r00.C19210b;
import r00.C19211c;
import r00.C19212d;
import r00.C19213e;
import r00.C19215g;
import r00.C19216h;
import u20.C19874a;

/* renamed from: q00.d */
public interface C19053d {

    /* renamed from: A */
    public static final C19209a f48449A;

    /* renamed from: B */
    public static final C19209a f48450B;

    /* renamed from: C */
    public static final C19209a f48451C;

    /* renamed from: D */
    public static final C19212d f48452D = new C19212d("searchMaxFutureDays", 4);

    /* renamed from: E */
    public static final C19060g f48453E = new C19060g(1);

    /* renamed from: F */
    public static final C19212d f48454F = new C19212d("SEARCH_LOCATIONS_DELAY", Integer.valueOf(Strategy.TTL_SECONDS_DEFAULT));

    /* renamed from: G */
    public static final C19209a f48455G;

    /* renamed from: H */
    public static final C19061h f48456H = new C19061h();

    /* renamed from: I */
    public static final C19209a f48457I;

    /* renamed from: J */
    public static final C19062i f48458J = new C19062i(new int[]{0, -1, -1});

    /* renamed from: K */
    public static final C19209a f48459K;

    /* renamed from: L */
    public static final C19209a f48460L;

    /* renamed from: M */
    public static final C19212d f48461M = new C19212d("ITINERARY_SUPPORTED_NUMBER_OF_LINES", 2);

    /* renamed from: N */
    public static final C19209a f48462N;

    /* renamed from: O */
    public static final C19209a f48463O;

    /* renamed from: P */
    public static final C19063j f48464P = new C19063j(Arrays.asList(new Integer[]{7, 1}));

    /* renamed from: Q */
    public static final C19216h f48465Q = new C19216h("TWITTER_FEED_FORMAT", (String) null);

    /* renamed from: R */
    public static final C19216h f48466R = new C19216h("TWITTER_COMPOSE_FORMAT", (String) null);

    /* renamed from: f */
    public static final C19064k f48467f = new C19064k(MapImplType.NUTITEQ);

    /* renamed from: g */
    public static final C19066m f48468g = new C19066m();

    /* renamed from: h */
    public static final C19067n f48469h = new C19067n();

    /* renamed from: i */
    public static final C19068o f48470i = new C19068o();

    /* renamed from: j */
    public static final C19069p f48471j = new C19069p();

    /* renamed from: k */
    public static final C19874a f48472k = new C19874a(4);

    /* renamed from: l */
    public static final C19209a f48473l;

    /* renamed from: m */
    public static final C19209a f48474m;

    /* renamed from: n */
    public static final C19070q f48475n = new C19070q();

    /* renamed from: o */
    public static final C19071r f48476o = new C19071r(Collections.emptyList());

    /* renamed from: p */
    public static final C19072s f48477p = new C19072s();

    /* renamed from: q */
    public static final C19073t f48478q = new C19073t(Arrays.asList(new TripPlannerRouteType[]{TripPlannerRouteType.FASTEST, TripPlannerRouteType.LEAST_WALKING, TripPlannerRouteType.LEAST_TRANSFERS}));

    /* renamed from: r */
    public static final C19054a f48479r = new C19054a(Collections.emptySet());

    /* renamed from: s */
    public static final C19055b f48480s = new C19055b(Collections.emptyList());

    /* renamed from: t */
    public static final C19056c f48481t = new C19056c(Arrays.asList(new Short[]{(short) 2, (short) 4, (short) 6, (short) 8, (short) 10, (short) 12, (short) 14, (short) 16}));

    /* renamed from: u */
    public static final C19211c f48482u = new C19211c(Float.valueOf(0.8f));

    /* renamed from: v */
    public static final C19209a f48483v;

    /* renamed from: w */
    public static final C19057d f48484w = new C19057d(new C20950l0(-15L, 30L));

    /* renamed from: x */
    public static final C19058e f48485x = new C19058e(0);

    /* renamed from: y */
    public static final C19059f f48486y;

    /* renamed from: z */
    public static final C19209a f48487z;

    /* renamed from: q00.d$a */
    public class C19054a extends C19047a.C19049b<Set<TripPlannerTransportType>> {
        public C19054a(Set set) {
            super(set);
        }

        /* renamed from: a */
        public final Object mo39882a(Map map) throws Exception {
            LinkedHashSet linkedHashSet = new LinkedHashSet(5);
            if (C19209a.m46358d((String) map.get("IS_PRIVATE_BIKE_SUPPORTED"))) {
                linkedHashSet.add(TripPlannerTransportType.BICYCLE);
            }
            if (C19209a.m46358d((String) map.get("IS_BIKE_SHARING_SUPPORT"))) {
                linkedHashSet.add(TripPlannerTransportType.BICYCLE);
            }
            if (C19209a.m46358d((String) map.get("IS_DOCKLESS_BIKES_SUPPORTED"))) {
                linkedHashSet.add(TripPlannerTransportType.BICYCLE);
            }
            if (C19209a.m46358d((String) map.get("IS_DOCKLESS_KICK_SCOOTERS_SUPPORTED"))) {
                linkedHashSet.add(TripPlannerTransportType.SCOOTER);
            }
            if (C19209a.m46358d((String) map.get("IS_DOCKLESS_SCOOTERS_SUPPORTED"))) {
                linkedHashSet.add(TripPlannerTransportType.SCOOTER);
            }
            if (C19209a.m46358d((String) map.get("IS_DOCKLESS_MOPED_SUPPORTED"))) {
                linkedHashSet.add(TripPlannerTransportType.MOPED);
            }
            if (C19209a.m46358d((String) map.get("IS_DOCKLESS_CAR_SUPPORTED"))) {
                linkedHashSet.add(TripPlannerTransportType.CAR);
            }
            if (C19209a.m46358d((String) map.get("IS_PERSONAL_CAR_SUPPORTED"))) {
                linkedHashSet.add(TripPlannerTransportType.PERSONAL_CAR);
            }
            return linkedHashSet;
        }
    }

    /* renamed from: q00.d$b */
    public class C19055b extends C19210b<MVTripPlanWalkingPreference, TripPlannerWalkingPrefType> {
        public C19055b(List list) {
            super("TRIP_PLANNER_WALKING_PREFERENCE_TYPES", MVTripPlanWalkingPreference.class, list);
        }

        /* renamed from: d */
        public final Object mo51506d(Enum enumR) throws Exception {
            int i = C19065l.f48491d[((MVTripPlanWalkingPreference) enumR).ordinal()];
            if (i == 1) {
                return TripPlannerWalkingPrefType.SLOW_WALKING;
            }
            if (i != 2) {
                return null;
            }
            return TripPlannerWalkingPrefType.MAX_WALKING_MINUTES;
        }
    }

    /* renamed from: q00.d$c */
    public class C19056c extends C19213e<Short> {
        public C19056c(List list) {
            super("TRIP_PLANNER_MAX_WALKING_MINUTES", list);
        }

        /* renamed from: c */
        public final Object mo51507c(String str) throws Exception {
            return Short.valueOf(Short.parseShort(str));
        }
    }

    /* renamed from: q00.d$d */
    public class C19057d extends C19047a.C19049b<C20950l0<Long>> {
        public C19057d(C20950l0 l0Var) {
            super(l0Var);
        }

        /* renamed from: a */
        public final Object mo39882a(Map map) throws Exception {
            long parseLong = Long.parseLong((String) map.get("MIN_MINUTES_REAL_TIME_RANGE"));
            long parseLong2 = Long.parseLong((String) map.get("MAX_MINUTES_REAL_TIME_RANGE"));
            if (parseLong2 <= parseLong) {
                return new C20950l0(-15L, 30L);
            }
            return new C20950l0(Long.valueOf(parseLong), Long.valueOf(parseLong2));
        }
    }

    /* renamed from: q00.d$e */
    public class C19058e extends C19047a.C19049b<Integer> {
        public C19058e(Integer num) {
            super(num);
        }

        /* renamed from: a */
        public final Object mo39882a(Map map) throws Exception {
            if (!C19209a.m46358d((String) map.get("SUPPORT_SERVICE_ALERTS_TAB"))) {
                return 0;
            }
            String str = (String) map.get("homeTabs");
            if (str != null && str.contains("TRANSIT_TYPE_LINES")) {
                return 3;
            }
            if ("SERVICE_ALERTS".equals((String) map.get("additionalTab"))) {
                return 2;
            }
            return 1;
        }
    }

    /* renamed from: q00.d$f */
    public class C19059f extends C19209a {
        public C19059f(Boolean bool) {
            super("IS_TAXI_SUPPORT", bool);
        }

        /* renamed from: c */
        public final Boolean mo49672b(String str) throws Exception {
            boolean z;
            if (!Boolean.TRUE.equals(super.mo49672b(str)) || !C17884p.m44338I(MoovitApplication.f37317k)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: q00.d$g */
    public class C19060g extends C19215g<Integer> {
        public C19060g(Integer num) {
            super("LINE_SEARCH_USE_RANKED_QUERY", num);
        }

        /* renamed from: b */
        public final Object mo49672b(String str) throws Exception {
            int i;
            if (C19209a.m46358d(str)) {
                i = 2;
            } else {
                i = 1;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: q00.d$h */
    public class C19061h extends C19215g<String> {
        public C19061h() {
            super("GOOGLE_PLACES_COUNTRY_CODES", null);
        }

        /* renamed from: b */
        public final Object mo49672b(String str) throws Exception {
            if (C20964s0.m49090h(str)) {
                return "";
            }
            String[] A = C20964s0.m49080A(str, ',');
            if (!C24361g.m61154X(A)) {
                StringBuilder sb = new StringBuilder();
                for (String str2 : A) {
                    if (sb.length() > 0) {
                        sb.append('|');
                    }
                    sb.append("country:");
                    sb.append(str2);
                }
                return sb.toString();
            }
            throw new IllegalStateException(C25541a.m63881k("Wrong CSV configuration value: ", str));
        }
    }

    /* renamed from: q00.d$i */
    public class C19062i extends C19047a.C19049b<int[]> {
        public C19062i(int[] iArr) {
            super(iArr);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo39882a(java.util.Map r15) throws java.lang.Exception {
            /*
                r14 = this;
                java.lang.String r0 = "GTFS_CONFIG_FILES"
                java.lang.Object r0 = r15.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r1 = 3
                if (r0 == 0) goto L_0x010e
                int r2 = r0.length()
                if (r2 != 0) goto L_0x0013
                goto L_0x010e
            L_0x0013:
                java.lang.String r2 = "GTFS_CONFIG_GRAPH_NUM_OF_DAYS"
                java.lang.Object r2 = r15.get(r2)
                java.lang.String r2 = (java.lang.String) r2
                r3 = -1
                if (r2 == 0) goto L_0x0023
                int r2 = java.lang.Integer.parseInt(r2)
                goto L_0x0024
            L_0x0023:
                r2 = -1
            L_0x0024:
                java.lang.String r4 = "GTFS_CONFIG_GRAPH_HOURS"
                java.lang.Object r15 = r15.get(r4)
                java.lang.String r15 = (java.lang.String) r15
                if (r15 == 0) goto L_0x0033
                int r15 = java.lang.Integer.parseInt(r15)
                goto L_0x0034
            L_0x0033:
                r15 = -1
            L_0x0034:
                r4 = 44
                java.lang.String[] r0 = p977zz.C20964s0.m49080A(r0, r4)
                int r4 = r0.length
                r5 = 0
                r6 = 0
                r7 = 0
            L_0x003e:
                r8 = 2
                r9 = 1
                if (r6 >= r4) goto L_0x00ff
                r10 = r0[r6]
                java.lang.String r10 = r10.trim()
                r10.getClass()
                int r11 = r10.hashCode()
                r12 = 8
                r13 = 4
                switch(r11) {
                    case -2131921288: goto L_0x00ce;
                    case -1850238734: goto L_0x00c3;
                    case -715455782: goto L_0x00b8;
                    case 72439519: goto L_0x00ad;
                    case 73250041: goto L_0x00a2;
                    case 79233169: goto L_0x0097;
                    case 82358186: goto L_0x008c;
                    case 370864798: goto L_0x0081;
                    case 395438249: goto L_0x0073;
                    case 578334001: goto L_0x0065;
                    case 2028631779: goto L_0x0057;
                    default: goto L_0x0055;
                }
            L_0x0055:
                goto L_0x00d9
            L_0x0057:
                java.lang.String r11 = "PATTERNS"
                boolean r10 = r10.equals(r11)
                if (r10 != 0) goto L_0x0061
                goto L_0x00d9
            L_0x0061:
                r10 = 10
                goto L_0x00da
            L_0x0065:
                java.lang.String r11 = "BICYCLE_STOPS"
                boolean r10 = r10.equals(r11)
                if (r10 != 0) goto L_0x006f
                goto L_0x00d9
            L_0x006f:
                r10 = 9
                goto L_0x00da
            L_0x0073:
                java.lang.String r11 = "STOP_TIMES"
                boolean r10 = r10.equals(r11)
                if (r10 != 0) goto L_0x007d
                goto L_0x00d9
            L_0x007d:
                r10 = 8
                goto L_0x00da
            L_0x0081:
                java.lang.String r11 = "SHAPE_SEGMENTS"
                boolean r10 = r10.equals(r11)
                if (r10 != 0) goto L_0x008a
                goto L_0x00d9
            L_0x008a:
                r10 = 7
                goto L_0x00da
            L_0x008c:
                java.lang.String r11 = "WALKS"
                boolean r10 = r10.equals(r11)
                if (r10 != 0) goto L_0x0095
                goto L_0x00d9
            L_0x0095:
                r10 = 6
                goto L_0x00da
            L_0x0097:
                java.lang.String r11 = "STOPS"
                boolean r10 = r10.equals(r11)
                if (r10 != 0) goto L_0x00a0
                goto L_0x00d9
            L_0x00a0:
                r10 = 5
                goto L_0x00da
            L_0x00a2:
                java.lang.String r11 = "METRO"
                boolean r10 = r10.equals(r11)
                if (r10 != 0) goto L_0x00ab
                goto L_0x00d9
            L_0x00ab:
                r10 = 4
                goto L_0x00da
            L_0x00ad:
                java.lang.String r11 = "LINES"
                boolean r10 = r10.equals(r11)
                if (r10 != 0) goto L_0x00b6
                goto L_0x00d9
            L_0x00b6:
                r10 = 3
                goto L_0x00da
            L_0x00b8:
                java.lang.String r11 = "FREQUENCIES"
                boolean r10 = r10.equals(r11)
                if (r10 != 0) goto L_0x00c1
                goto L_0x00d9
            L_0x00c1:
                r10 = 2
                goto L_0x00da
            L_0x00c3:
                java.lang.String r11 = "SHAPES"
                boolean r10 = r10.equals(r11)
                if (r10 != 0) goto L_0x00cc
                goto L_0x00d9
            L_0x00cc:
                r10 = 1
                goto L_0x00da
            L_0x00ce:
                java.lang.String r11 = "IMAGES"
                boolean r10 = r10.equals(r11)
                if (r10 != 0) goto L_0x00d7
                goto L_0x00d9
            L_0x00d7:
                r10 = 0
                goto L_0x00da
            L_0x00d9:
                r10 = -1
            L_0x00da:
                switch(r10) {
                    case 0: goto L_0x00f8;
                    case 1: goto L_0x00f5;
                    case 2: goto L_0x00f2;
                    case 3: goto L_0x00fa;
                    case 4: goto L_0x00f0;
                    case 5: goto L_0x00ee;
                    case 6: goto L_0x00eb;
                    case 7: goto L_0x00e8;
                    case 8: goto L_0x00e5;
                    case 9: goto L_0x00e2;
                    case 10: goto L_0x00df;
                    default: goto L_0x00dd;
                }
            L_0x00dd:
                r8 = 0
                goto L_0x00fa
            L_0x00df:
                r8 = 8
                goto L_0x00fa
            L_0x00e2:
                r8 = 256(0x100, float:3.59E-43)
                goto L_0x00fa
            L_0x00e5:
                r8 = 192(0xc0, float:2.69E-43)
                goto L_0x00fa
            L_0x00e8:
                r8 = 2048(0x800, float:2.87E-42)
                goto L_0x00fa
            L_0x00eb:
                r8 = 32
                goto L_0x00fa
            L_0x00ee:
                r8 = 4
                goto L_0x00fa
            L_0x00f0:
                r8 = 1
                goto L_0x00fa
            L_0x00f2:
                r8 = 1024(0x400, float:1.435E-42)
                goto L_0x00fa
            L_0x00f5:
                r8 = 512(0x200, float:7.175E-43)
                goto L_0x00fa
            L_0x00f8:
                r8 = 16
            L_0x00fa:
                r7 = r7 | r8
                int r6 = r6 + 1
                goto L_0x003e
            L_0x00ff:
                if (r2 <= 0) goto L_0x0105
                if (r15 <= 0) goto L_0x0105
                r7 = r7 | 239(0xef, float:3.35E-43)
            L_0x0105:
                int[] r0 = new int[r1]
                r0[r5] = r7
                r0[r9] = r2
                r0[r8] = r15
                goto L_0x0113
            L_0x010e:
                int[] r0 = new int[r1]
                r0 = {0, -1, -1} // fill-array
            L_0x0113:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: q00.C19053d.C19062i.mo39882a(java.util.Map):java.lang.Object");
        }
    }

    /* renamed from: q00.d$j */
    public class C19063j extends C19210b<MVDayOfWeek, Integer> {
        public C19063j(List list) {
            super("WEEKEND_DAYS", MVDayOfWeek.class, list);
        }

        /* renamed from: d */
        public final Object mo51506d(Enum enumR) throws Exception {
            MVDayOfWeek mVDayOfWeek = (MVDayOfWeek) enumR;
            switch (C19065l.f48492e[mVDayOfWeek.ordinal()]) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                    return 6;
                case 7:
                    return 7;
                default:
                    throw new IllegalStateException("Unknown week day: " + mVDayOfWeek);
            }
        }
    }

    /* renamed from: q00.d$k */
    public class C19064k extends C19215g<MapImplType> {
        public C19064k(MapImplType mapImplType) {
            super("MAP_IMPL_TYPE_V5", mapImplType);
        }

        /* renamed from: b */
        public final Object mo49672b(String str) throws Exception {
            int i = C19065l.f48488a[MVMapImplType.valueOf(str).ordinal()];
            if (i == 1) {
                return MapImplType.BAIDU;
            }
            if (i == 2) {
                return MapImplType.NUTITEQ;
            }
            if (i == 3) {
                return MapImplType.GOOGLE;
            }
            throw new BadResponseException(C25541a.m63881k("Unknown map implementation type: ", str));
        }
    }

    /* renamed from: q00.d$l */
    public static /* synthetic */ class C19065l {

        /* renamed from: a */
        public static final /* synthetic */ int[] f48488a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f48489b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f48490c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f48491d;

        /* renamed from: e */
        public static final /* synthetic */ int[] f48492e;

        /* JADX WARNING: Can't wrap try/catch for region: R(52:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|29|30|31|32|33|35|36|37|38|(2:39|40)|41|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|61|62|63|64|65|66|68) */
        /* JADX WARNING: Can't wrap try/catch for region: R(54:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|32|33|35|36|37|38|(2:39|40)|41|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|61|62|63|64|65|66|68) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|32|33|35|36|37|38|39|40|41|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|61|62|63|64|65|66|68) */
        /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0080 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x008a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00af */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00b9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00c3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00cd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00d7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x00fe */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0108 */
        static {
            /*
                com.tranzmate.moovit.protocol.common.MVDayOfWeek[] r0 = com.tranzmate.moovit.protocol.common.MVDayOfWeek.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f48492e = r0
                r1 = 1
                com.tranzmate.moovit.protocol.common.MVDayOfWeek r2 = com.tranzmate.moovit.protocol.common.MVDayOfWeek.SUNDAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f48492e     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.common.MVDayOfWeek r3 = com.tranzmate.moovit.protocol.common.MVDayOfWeek.MONDAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f48492e     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.common.MVDayOfWeek r4 = com.tranzmate.moovit.protocol.common.MVDayOfWeek.TUESDAY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f48492e     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.common.MVDayOfWeek r5 = com.tranzmate.moovit.protocol.common.MVDayOfWeek.WEDNESDAY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f48492e     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tranzmate.moovit.protocol.common.MVDayOfWeek r6 = com.tranzmate.moovit.protocol.common.MVDayOfWeek.THURSDAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f48492e     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tranzmate.moovit.protocol.common.MVDayOfWeek r7 = com.tranzmate.moovit.protocol.common.MVDayOfWeek.FRIDAY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f48492e     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.tranzmate.moovit.protocol.common.MVDayOfWeek r8 = com.tranzmate.moovit.protocol.common.MVDayOfWeek.SATURDAY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                com.tranzmate.moovit.protocol.tripplanner.MVTripPlanWalkingPreference[] r7 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanWalkingPreference.values()
                int r7 = r7.length
                int[] r7 = new int[r7]
                f48491d = r7
                com.tranzmate.moovit.protocol.tripplanner.MVTripPlanWalkingPreference r8 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanWalkingPreference.SLOW_WALKING     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r7[r8] = r1     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                int[] r7 = f48491d     // Catch:{ NoSuchFieldError -> 0x006f }
                com.tranzmate.moovit.protocol.tripplanner.MVTripPlanWalkingPreference r8 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanWalkingPreference.MAX_WALKING_TIME     // Catch:{ NoSuchFieldError -> 0x006f }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r7[r8] = r0     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                com.tranzmate.moovit.protocol.conf.MVTripPlanOption[] r7 = com.tranzmate.moovit.protocol.conf.MVTripPlanOption.values()
                int r7 = r7.length
                int[] r7 = new int[r7]
                f48490c = r7
                com.tranzmate.moovit.protocol.conf.MVTripPlanOption r8 = com.tranzmate.moovit.protocol.conf.MVTripPlanOption.FASTEST     // Catch:{ NoSuchFieldError -> 0x0080 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0080 }
                r7[r8] = r1     // Catch:{ NoSuchFieldError -> 0x0080 }
            L_0x0080:
                int[] r7 = f48490c     // Catch:{ NoSuchFieldError -> 0x008a }
                com.tranzmate.moovit.protocol.conf.MVTripPlanOption r8 = com.tranzmate.moovit.protocol.conf.MVTripPlanOption.LEAST_TRANSFERS     // Catch:{ NoSuchFieldError -> 0x008a }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x008a }
                r7[r8] = r0     // Catch:{ NoSuchFieldError -> 0x008a }
            L_0x008a:
                int[] r7 = f48490c     // Catch:{ NoSuchFieldError -> 0x0094 }
                com.tranzmate.moovit.protocol.conf.MVTripPlanOption r8 = com.tranzmate.moovit.protocol.conf.MVTripPlanOption.LEAST_WALKING     // Catch:{ NoSuchFieldError -> 0x0094 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0094 }
                r7[r8] = r2     // Catch:{ NoSuchFieldError -> 0x0094 }
            L_0x0094:
                com.tranzmate.moovit.protocol.tripplanner.MVSectionSortType[] r7 = com.tranzmate.moovit.protocol.tripplanner.MVSectionSortType.values()
                int r7 = r7.length
                int[] r7 = new int[r7]
                f48489b = r7
                com.tranzmate.moovit.protocol.tripplanner.MVSectionSortType r8 = com.tranzmate.moovit.protocol.tripplanner.MVSectionSortType.NO_CLIENT_SORTING     // Catch:{ NoSuchFieldError -> 0x00a5 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a5 }
                r7[r8] = r1     // Catch:{ NoSuchFieldError -> 0x00a5 }
            L_0x00a5:
                int[] r7 = f48489b     // Catch:{ NoSuchFieldError -> 0x00af }
                com.tranzmate.moovit.protocol.tripplanner.MVSectionSortType r8 = com.tranzmate.moovit.protocol.tripplanner.MVSectionSortType.DURATION     // Catch:{ NoSuchFieldError -> 0x00af }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00af }
                r7[r8] = r0     // Catch:{ NoSuchFieldError -> 0x00af }
            L_0x00af:
                int[] r7 = f48489b     // Catch:{ NoSuchFieldError -> 0x00b9 }
                com.tranzmate.moovit.protocol.tripplanner.MVSectionSortType r8 = com.tranzmate.moovit.protocol.tripplanner.MVSectionSortType.PRICE     // Catch:{ NoSuchFieldError -> 0x00b9 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b9 }
                r7[r8] = r2     // Catch:{ NoSuchFieldError -> 0x00b9 }
            L_0x00b9:
                int[] r7 = f48489b     // Catch:{ NoSuchFieldError -> 0x00c3 }
                com.tranzmate.moovit.protocol.tripplanner.MVSectionSortType r8 = com.tranzmate.moovit.protocol.tripplanner.MVSectionSortType.CO2     // Catch:{ NoSuchFieldError -> 0x00c3 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c3 }
                r7[r8] = r3     // Catch:{ NoSuchFieldError -> 0x00c3 }
            L_0x00c3:
                int[] r3 = f48489b     // Catch:{ NoSuchFieldError -> 0x00cd }
                com.tranzmate.moovit.protocol.tripplanner.MVSectionSortType r7 = com.tranzmate.moovit.protocol.tripplanner.MVSectionSortType.LEAST_WALKING     // Catch:{ NoSuchFieldError -> 0x00cd }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cd }
                r3[r7] = r4     // Catch:{ NoSuchFieldError -> 0x00cd }
            L_0x00cd:
                int[] r3 = f48489b     // Catch:{ NoSuchFieldError -> 0x00d7 }
                com.tranzmate.moovit.protocol.tripplanner.MVSectionSortType r4 = com.tranzmate.moovit.protocol.tripplanner.MVSectionSortType.LEAST_TRANSFERS     // Catch:{ NoSuchFieldError -> 0x00d7 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d7 }
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00d7 }
            L_0x00d7:
                int[] r3 = f48489b     // Catch:{ NoSuchFieldError -> 0x00e1 }
                com.tranzmate.moovit.protocol.tripplanner.MVSectionSortType r4 = com.tranzmate.moovit.protocol.tripplanner.MVSectionSortType.EARLIEST_DEPARTURE     // Catch:{ NoSuchFieldError -> 0x00e1 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e1 }
                r3[r4] = r6     // Catch:{ NoSuchFieldError -> 0x00e1 }
            L_0x00e1:
                int[] r3 = f48489b     // Catch:{ NoSuchFieldError -> 0x00ed }
                com.tranzmate.moovit.protocol.tripplanner.MVSectionSortType r4 = com.tranzmate.moovit.protocol.tripplanner.MVSectionSortType.EARLIEST_ARRIVAL     // Catch:{ NoSuchFieldError -> 0x00ed }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ed }
                r5 = 8
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00ed }
            L_0x00ed:
                com.tranzmate.moovit.protocol.conf.MVMapImplType[] r3 = com.tranzmate.moovit.protocol.conf.MVMapImplType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f48488a = r3
                com.tranzmate.moovit.protocol.conf.MVMapImplType r4 = com.tranzmate.moovit.protocol.conf.MVMapImplType.BAIDU     // Catch:{ NoSuchFieldError -> 0x00fe }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fe }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x00fe }
            L_0x00fe:
                int[] r1 = f48488a     // Catch:{ NoSuchFieldError -> 0x0108 }
                com.tranzmate.moovit.protocol.conf.MVMapImplType r3 = com.tranzmate.moovit.protocol.conf.MVMapImplType.NUTITEQ     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r0 = f48488a     // Catch:{ NoSuchFieldError -> 0x0112 }
                com.tranzmate.moovit.protocol.conf.MVMapImplType r1 = com.tranzmate.moovit.protocol.conf.MVMapImplType.GOOGLE     // Catch:{ NoSuchFieldError -> 0x0112 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0112 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0112 }
            L_0x0112:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q00.C19053d.C19065l.<clinit>():void");
        }
    }

    /* renamed from: q00.d$m */
    public class C19066m extends C19047a.C19049b<C18707m> {
        public C19066m() {
            super(null);
        }

        /* renamed from: a */
        public final Object mo39882a(Map map) throws Exception {
            String str = (String) map.get("MOOVIT_TILES_URL");
            if (URLUtil.isValidUrl(str)) {
                return new C18707m(str, ".png", 0, 19);
            }
            throw new BadResponseException(C25541a.m63881k("Map tiles layer is missing: ", str));
        }
    }

    /* renamed from: q00.d$n */
    public class C19067n extends C19047a.C19049b<C18707m> {
        public C19067n() {
            super(null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo39882a(java.util.Map r5) throws java.lang.Exception {
            /*
                r4 = this;
                java.lang.String r0 = "MOOVIT_NIGHT_TILES_URL"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                boolean r1 = android.webkit.URLUtil.isValidUrl(r0)
                if (r1 != 0) goto L_0x0017
                java.lang.String r0 = "MOOVIT_TILES_URL"
                java.lang.Object r5 = r5.get(r0)
                r0 = r5
                java.lang.String r0 = (java.lang.String) r0
            L_0x0017:
                boolean r5 = android.webkit.URLUtil.isValidUrl(r0)
                if (r5 == 0) goto L_0x0028
                o20.m r5 = new o20.m
                r1 = 0
                r2 = 19
                java.lang.String r3 = ".png"
                r5.<init>(r0, r3, r1, r2)
                return r5
            L_0x0028:
                com.moovit.commons.request.BadResponseException r5 = new com.moovit.commons.request.BadResponseException
                java.lang.String r1 = "Map tiles layer is missing: "
                java.lang.String r0 = p379.C25541a.m63881k(r1, r0)
                r5.<init>((java.lang.String) r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: q00.C19053d.C19067n.mo39882a(java.util.Map):java.lang.Object");
        }
    }

    /* renamed from: q00.d$o */
    public class C19068o extends C19047a.C19049b<C18707m> {
        public C19068o() {
            super(null);
        }

        /* renamed from: a */
        public final Object mo39882a(Map map) throws Exception {
            String str = (String) map.get("SUBWAY_LAYER_URL");
            if (!URLUtil.isValidUrl(str)) {
                return null;
            }
            return new C18707m(str, ".png", Integer.parseInt((String) map.get("MIN_ZOOM_FOR_SUBWAY_LAYER")), Integer.parseInt((String) map.get("MAX_ZOOM_FOR_SUBWAY_LAYER")));
        }
    }

    /* renamed from: q00.d$p */
    public class C19069p extends C19047a.C19049b<C18707m> {
        public C19069p() {
            super(null);
        }

        /* renamed from: a */
        public final Object mo39882a(Map map) throws Exception {
            String str = (String) map.get("PATHWAY_LAYERS_URL");
            if (!URLUtil.isValidUrl(str)) {
                return null;
            }
            return new C18707m(str, ".png", 0, 19);
        }
    }

    /* renamed from: q00.d$q */
    public class C19070q extends C19215g<TripPlannerSortType> {
        public C19070q() {
            super("defaultTripPlanSortType", null);
        }

        /* renamed from: b */
        public final Object mo49672b(String str) throws Exception {
            MVSectionSortType valueOf = MVSectionSortType.valueOf(str);
            switch (C19065l.f48489b[valueOf.ordinal()]) {
                case 1:
                    return TripPlannerSortType.NO_CLIENT_SORTING;
                case 2:
                    return TripPlannerSortType.DURATION;
                case 3:
                    return TripPlannerSortType.PRICE;
                case 4:
                    return TripPlannerSortType.EMISSION;
                case 5:
                    return TripPlannerSortType.LEAST_WALKING;
                case 6:
                    return TripPlannerSortType.LEAST_TRANSFERS;
                case 7:
                    return TripPlannerSortType.EARLIEST_DEPARTURE;
                case 8:
                    return TripPlannerSortType.EARLIEST_ARRIVAL;
                default:
                    throw new BadResponseException("Unknown trip plan sort type: " + valueOf);
            }
        }
    }

    /* renamed from: q00.d$r */
    public class C19071r extends C19210b<MVSectionSortType, TripPlannerSortType> {
        public C19071r(List list) {
            super("TRIP_PLANNER_SORT_TYPES", MVSectionSortType.class, list);
        }

        /* renamed from: d */
        public final Object mo51506d(Enum enumR) throws Exception {
            switch (C19065l.f48489b[((MVSectionSortType) enumR).ordinal()]) {
                case 1:
                    return TripPlannerSortType.NO_CLIENT_SORTING;
                case 2:
                    return TripPlannerSortType.DURATION;
                case 3:
                    return TripPlannerSortType.PRICE;
                case 4:
                    return TripPlannerSortType.EMISSION;
                case 5:
                    return TripPlannerSortType.LEAST_WALKING;
                case 6:
                    return TripPlannerSortType.LEAST_TRANSFERS;
                case 7:
                    return TripPlannerSortType.EARLIEST_DEPARTURE;
                case 8:
                    return TripPlannerSortType.EARLIEST_ARRIVAL;
                default:
                    return null;
            }
        }
    }

    /* renamed from: q00.d$s */
    public class C19072s extends C19215g<TripPlannerRouteType> {
        public C19072s() {
            super("defaultTripPlanOption", null);
        }

        /* renamed from: b */
        public final Object mo49672b(String str) throws Exception {
            MVTripPlanOption valueOf = MVTripPlanOption.valueOf(str);
            int i = C19065l.f48490c[valueOf.ordinal()];
            if (i == 1) {
                return TripPlannerRouteType.FASTEST;
            }
            if (i == 2) {
                return TripPlannerRouteType.LEAST_TRANSFERS;
            }
            if (i == 3) {
                return TripPlannerRouteType.LEAST_WALKING;
            }
            throw new BadResponseException("Unknown trip plan route type: " + valueOf);
        }
    }

    /* renamed from: q00.d$t */
    public class C19073t extends C19210b<MVTripPlanOption, TripPlannerRouteType> {
        public C19073t(List list) {
            super("TRIP_PLANNER_OPTIONS", MVTripPlanOption.class, list);
        }

        /* renamed from: d */
        public final Object mo51506d(Enum enumR) throws Exception {
            int i = C19065l.f48490c[((MVTripPlanOption) enumR).ordinal()];
            if (i == 1) {
                return TripPlannerRouteType.FASTEST;
            }
            if (i == 2) {
                return TripPlannerRouteType.LEAST_TRANSFERS;
            }
            if (i != 3) {
                return null;
            }
            return TripPlannerRouteType.LEAST_WALKING;
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f48473l = new C19209a("HAS_MAP_DIRECT_ADS", bool);
        Boolean bool2 = Boolean.TRUE;
        f48474m = new C19209a("IS_TRIP_PLANNER_SUPPORTED", bool2);
        f48483v = new C19209a("NEAR_ME_RT_ENABLED", bool);
        f48486y = new C19059f(bool);
        f48487z = new C19209a("IS_CAR_POOL_SUPPORT", bool);
        f48449A = new C19209a("IS_TOD_SUPPORT", bool);
        f48450B = new C19209a("isReportMetrics", bool);
        f48451C = new C19209a("HAS_SPECIFIC_LINE_SEARCH_DATA", bool);
        f48455G = new C19209a("USE_GOOGLE_PLACES", bool);
        f48457I = new C19209a("IS_FREQUENCY_SUPPORTED", bool);
        f48459K = new C19209a("IS_METRO_REVISION_MIGRATION_SUPPORTED", bool);
        f48460L = new C19209a("IS_CUSTOM_POI_SUPPORTED", bool);
        f48462N = new C19209a("ITINERARY_IS_SHOW_MORE_OPTIONS_SUPPORTED", bool2);
        f48463O = new C19209a("ITINERARY_SHOULD_SHOW_FUTURE_DEPARTURES", bool2);
    }
}
