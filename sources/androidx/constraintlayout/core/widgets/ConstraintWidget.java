package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0680c;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.analyzer.C0691c;
import androidx.constraintlayout.core.widgets.analyzer.C0693d;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p001a0.C0016g;
import p267u0.C6674a;
import p305x0.C7132c;
import p358af.C13437d;

public class ConstraintWidget {

    /* renamed from: A */
    public float f2384A;

    /* renamed from: B */
    public int f2385B;

    /* renamed from: C */
    public float f2386C;

    /* renamed from: D */
    public int[] f2387D;

    /* renamed from: E */
    public float f2388E;

    /* renamed from: F */
    public boolean f2389F;

    /* renamed from: G */
    public boolean f2390G;

    /* renamed from: H */
    public boolean f2391H;

    /* renamed from: I */
    public int f2392I;

    /* renamed from: J */
    public int f2393J;

    /* renamed from: K */
    public ConstraintAnchor f2394K;

    /* renamed from: L */
    public ConstraintAnchor f2395L;

    /* renamed from: M */
    public ConstraintAnchor f2396M;

    /* renamed from: N */
    public ConstraintAnchor f2397N;

    /* renamed from: O */
    public ConstraintAnchor f2398O;

    /* renamed from: P */
    public ConstraintAnchor f2399P;

    /* renamed from: Q */
    public ConstraintAnchor f2400Q;

    /* renamed from: R */
    public ConstraintAnchor f2401R;

    /* renamed from: S */
    public ConstraintAnchor[] f2402S;

    /* renamed from: T */
    public ArrayList<ConstraintAnchor> f2403T;

    /* renamed from: U */
    public boolean[] f2404U;

    /* renamed from: V */
    public DimensionBehaviour[] f2405V;

    /* renamed from: W */
    public ConstraintWidget f2406W;

    /* renamed from: X */
    public int f2407X;

    /* renamed from: Y */
    public int f2408Y;

    /* renamed from: Z */
    public float f2409Z;

    /* renamed from: a */
    public boolean f2410a = false;

    /* renamed from: a0 */
    public int f2411a0;

    /* renamed from: b */
    public C7132c f2412b;

    /* renamed from: b0 */
    public int f2413b0;

    /* renamed from: c */
    public C7132c f2414c;

    /* renamed from: c0 */
    public int f2415c0;

    /* renamed from: d */
    public C0691c f2416d = null;

    /* renamed from: d0 */
    public int f2417d0;

    /* renamed from: e */
    public C0693d f2418e = null;

    /* renamed from: e0 */
    public int f2419e0;

    /* renamed from: f */
    public boolean[] f2420f = {true, true};

    /* renamed from: f0 */
    public int f2421f0;

    /* renamed from: g */
    public boolean f2422g = true;

    /* renamed from: g0 */
    public float f2423g0;

    /* renamed from: h */
    public boolean f2424h = true;

    /* renamed from: h0 */
    public float f2425h0;

    /* renamed from: i */
    public int f2426i = -1;

    /* renamed from: i0 */
    public Object f2427i0;

    /* renamed from: j */
    public int f2428j = -1;

    /* renamed from: j0 */
    public int f2429j0;

    /* renamed from: k */
    public String f2430k;

    /* renamed from: k0 */
    public boolean f2431k0;

    /* renamed from: l */
    public boolean f2432l;

    /* renamed from: l0 */
    public String f2433l0;

    /* renamed from: m */
    public boolean f2434m;

    /* renamed from: m0 */
    public String f2435m0;

    /* renamed from: n */
    public boolean f2436n;

    /* renamed from: n0 */
    public int f2437n0;

    /* renamed from: o */
    public boolean f2438o;

    /* renamed from: o0 */
    public int f2439o0;

    /* renamed from: p */
    public int f2440p;

    /* renamed from: p0 */
    public float[] f2441p0;

    /* renamed from: q */
    public int f2442q;

    /* renamed from: q0 */
    public ConstraintWidget[] f2443q0;

    /* renamed from: r */
    public int f2444r;

    /* renamed from: r0 */
    public ConstraintWidget[] f2445r0;

    /* renamed from: s */
    public int f2446s;

    /* renamed from: s0 */
    public ConstraintWidget f2447s0;

    /* renamed from: t */
    public int f2448t;

    /* renamed from: t0 */
    public ConstraintWidget f2449t0;

    /* renamed from: u */
    public int[] f2450u;

    /* renamed from: u0 */
    public int f2451u0;

    /* renamed from: v */
    public int f2452v;

    /* renamed from: v0 */
    public int f2453v0;

    /* renamed from: w */
    public int f2454w;

    /* renamed from: x */
    public float f2455x;

    /* renamed from: y */
    public int f2456y;

    /* renamed from: z */
    public int f2457z;

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    /* renamed from: androidx.constraintlayout.core.widgets.ConstraintWidget$a */
    public static /* synthetic */ class C0686a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2458a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f2459b;

        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008f */
        static {
            /*
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2459b = r0
                r1 = 1
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f2459b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f2459b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f2459b     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f2458a = r4
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f2458a     // Catch:{ NoSuchFieldError -> 0x004e }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f2458a     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f2458a     // Catch:{ NoSuchFieldError -> 0x0062 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f2458a     // Catch:{ NoSuchFieldError -> 0x006d }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f2458a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f2458a     // Catch:{ NoSuchFieldError -> 0x0083 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f2458a     // Catch:{ NoSuchFieldError -> 0x008f }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = f2458a     // Catch:{ NoSuchFieldError -> 0x009b }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.NONE     // Catch:{ NoSuchFieldError -> 0x009b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009b }
            L_0x009b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.C0686a.<clinit>():void");
        }
    }

    public ConstraintWidget() {
        new HashMap();
        this.f2432l = false;
        this.f2434m = false;
        this.f2436n = false;
        this.f2438o = false;
        this.f2440p = -1;
        this.f2442q = -1;
        this.f2444r = 0;
        this.f2446s = 0;
        this.f2448t = 0;
        this.f2450u = new int[2];
        this.f2452v = 0;
        this.f2454w = 0;
        this.f2455x = 1.0f;
        this.f2456y = 0;
        this.f2457z = 0;
        this.f2384A = 1.0f;
        this.f2385B = -1;
        this.f2386C = 1.0f;
        this.f2387D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f2388E = BitmapDescriptorFactory.HUE_RED;
        this.f2389F = false;
        this.f2391H = false;
        this.f2392I = 0;
        this.f2393J = 0;
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.f2394K = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.f2395L = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.f2396M = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.f2397N = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.f2398O = constraintAnchor5;
        this.f2399P = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.f2400Q = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.f2401R = constraintAnchor6;
        this.f2402S = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor6};
        ArrayList<ConstraintAnchor> arrayList = new ArrayList<>();
        this.f2403T = arrayList;
        this.f2404U = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.f2405V = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f2406W = null;
        this.f2407X = 0;
        this.f2408Y = 0;
        this.f2409Z = BitmapDescriptorFactory.HUE_RED;
        this.f2411a0 = -1;
        this.f2413b0 = 0;
        this.f2415c0 = 0;
        this.f2417d0 = 0;
        this.f2423g0 = 0.5f;
        this.f2425h0 = 0.5f;
        this.f2429j0 = 0;
        this.f2431k0 = false;
        this.f2433l0 = null;
        this.f2435m0 = null;
        this.f2437n0 = 0;
        this.f2439o0 = 0;
        this.f2441p0 = new float[]{-1.0f, -1.0f};
        this.f2443q0 = new ConstraintWidget[]{null, null};
        this.f2445r0 = new ConstraintWidget[]{null, null};
        this.f2447s0 = null;
        this.f2449t0 = null;
        this.f2451u0 = -1;
        this.f2453v0 = -1;
        arrayList.add(this.f2394K);
        this.f2403T.add(this.f2395L);
        this.f2403T.add(this.f2396M);
        this.f2403T.add(this.f2397N);
        this.f2403T.add(this.f2399P);
        this.f2403T.add(this.f2400Q);
        this.f2403T.add(this.f2401R);
        this.f2403T.add(this.f2398O);
    }

    /* renamed from: K */
    public static void m1963K(int i, int i2, String str, StringBuilder sb) {
        if (i != i2) {
            sb.append(str);
            sb.append(" :   ");
            sb.append(i);
            sb.append(",\n");
        }
    }

    /* renamed from: L */
    public static void m1964L(StringBuilder sb, String str, float f, float f2) {
        if (f != f2) {
            sb.append(str);
            sb.append(" :   ");
            sb.append(f);
            sb.append(",\n");
        }
    }

    /* renamed from: s */
    public static void m1965s(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f) {
        sb.append(str);
        sb.append(" :  {\n");
        m1963K(i, 0, "      size", sb);
        m1963K(i2, 0, "      min", sb);
        m1963K(i3, Integer.MAX_VALUE, "      max", sb);
        m1963K(i4, 0, "      matchMin", sb);
        m1963K(i5, 0, "      matchDef", sb);
        m1964L(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    /* renamed from: t */
    public static void m1966t(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.f2379f != null) {
            C16530d.m42019l(sb, "    ", str, " : [ '");
            sb.append(constraintAnchor.f2379f);
            sb.append("'");
            if (!(constraintAnchor.f2381h == Integer.MIN_VALUE && constraintAnchor.f2380g == 0)) {
                sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                sb.append(constraintAnchor.f2380g);
                if (constraintAnchor.f2381h != Integer.MIN_VALUE) {
                    sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                    sb.append(constraintAnchor.f2381h);
                    sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                }
            }
            sb.append(" ] ,\n");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r5 = r0[r5 + 1];
        r0 = r5.f2379f;
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2773A(int r5) {
        /*
            r4 = this;
            int r5 = r5 * 2
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r4.f2402S
            r1 = r0[r5]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.f2379f
            r3 = 1
            if (r2 == 0) goto L_0x001b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f2379f
            if (r2 == r1) goto L_0x001b
            int r5 = r5 + r3
            r5 = r0[r5]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r5.f2379f
            if (r0 == 0) goto L_0x001b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2379f
            if (r0 != r5) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.mo2773A(int):boolean");
    }

    /* renamed from: B */
    public final boolean mo2774B() {
        ConstraintAnchor constraintAnchor = this.f2394K;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f2379f;
        if (constraintAnchor2 != null && constraintAnchor2.f2379f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f2396M;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f2379f;
        return constraintAnchor4 != null && constraintAnchor4.f2379f == constraintAnchor3;
    }

    /* renamed from: C */
    public final boolean mo2775C() {
        ConstraintAnchor constraintAnchor = this.f2395L;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f2379f;
        if (constraintAnchor2 != null && constraintAnchor2.f2379f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f2397N;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f2379f;
        return constraintAnchor4 != null && constraintAnchor4.f2379f == constraintAnchor3;
    }

    /* renamed from: D */
    public final boolean mo2776D() {
        return this.f2422g && this.f2429j0 != 8;
    }

    /* renamed from: E */
    public boolean mo2777E() {
        if (this.f2432l || (this.f2394K.f2376c && this.f2396M.f2376c)) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public boolean mo2778F() {
        if (this.f2434m || (this.f2395L.f2376c && this.f2397N.f2376c)) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public void mo2779G() {
        this.f2394K.mo2769j();
        this.f2395L.mo2769j();
        this.f2396M.mo2769j();
        this.f2397N.mo2769j();
        this.f2398O.mo2769j();
        this.f2399P.mo2769j();
        this.f2400Q.mo2769j();
        this.f2401R.mo2769j();
        this.f2406W = null;
        this.f2388E = BitmapDescriptorFactory.HUE_RED;
        this.f2407X = 0;
        this.f2408Y = 0;
        this.f2409Z = BitmapDescriptorFactory.HUE_RED;
        this.f2411a0 = -1;
        this.f2413b0 = 0;
        this.f2415c0 = 0;
        this.f2417d0 = 0;
        this.f2419e0 = 0;
        this.f2421f0 = 0;
        this.f2423g0 = 0.5f;
        this.f2425h0 = 0.5f;
        DimensionBehaviour[] dimensionBehaviourArr = this.f2405V;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.f2427i0 = null;
        this.f2429j0 = 0;
        this.f2435m0 = null;
        this.f2437n0 = 0;
        this.f2439o0 = 0;
        float[] fArr = this.f2441p0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f2440p = -1;
        this.f2442q = -1;
        int[] iArr = this.f2387D;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f2446s = 0;
        this.f2448t = 0;
        this.f2455x = 1.0f;
        this.f2384A = 1.0f;
        this.f2454w = Integer.MAX_VALUE;
        this.f2457z = Integer.MAX_VALUE;
        this.f2452v = 0;
        this.f2456y = 0;
        this.f2385B = -1;
        this.f2386C = 1.0f;
        boolean[] zArr = this.f2420f;
        zArr[0] = true;
        zArr[1] = true;
        this.f2391H = false;
        boolean[] zArr2 = this.f2404U;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f2422g = true;
        int[] iArr2 = this.f2450u;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f2426i = -1;
        this.f2428j = -1;
    }

    /* renamed from: H */
    public final void mo2780H() {
        ConstraintWidget constraintWidget = this.f2406W;
        if (constraintWidget != null && (constraintWidget instanceof C0697d)) {
            ((C0697d) constraintWidget).getClass();
        }
        int size = this.f2403T.size();
        for (int i = 0; i < size; i++) {
            this.f2403T.get(i).mo2769j();
        }
    }

    /* renamed from: I */
    public final void mo2781I() {
        this.f2432l = false;
        this.f2434m = false;
        this.f2436n = false;
        this.f2438o = false;
        int size = this.f2403T.size();
        for (int i = 0; i < size; i++) {
            ConstraintAnchor constraintAnchor = this.f2403T.get(i);
            constraintAnchor.f2376c = false;
            constraintAnchor.f2375b = 0;
        }
    }

    /* renamed from: J */
    public void mo2782J(C6674a aVar) {
        this.f2394K.mo2770k();
        this.f2395L.mo2770k();
        this.f2396M.mo2770k();
        this.f2397N.mo2770k();
        this.f2398O.mo2770k();
        this.f2401R.mo2770k();
        this.f2399P.mo2770k();
        this.f2400Q.mo2770k();
    }

    /* renamed from: M */
    public final void mo2783M(int i, int i2) {
        if (!this.f2432l) {
            this.f2394K.mo2771l(i);
            this.f2396M.mo2771l(i2);
            this.f2413b0 = i;
            this.f2407X = i2 - i;
            this.f2432l = true;
        }
    }

    /* renamed from: N */
    public final void mo2784N(int i, int i2) {
        if (!this.f2434m) {
            this.f2395L.mo2771l(i);
            this.f2397N.mo2771l(i2);
            this.f2415c0 = i;
            this.f2408Y = i2 - i;
            if (this.f2389F) {
                this.f2398O.mo2771l(i + this.f2417d0);
            }
            this.f2434m = true;
        }
    }

    /* renamed from: O */
    public final void mo2785O(int i) {
        this.f2408Y = i;
        int i2 = this.f2421f0;
        if (i < i2) {
            this.f2408Y = i2;
        }
    }

    /* renamed from: P */
    public final void mo2786P(DimensionBehaviour dimensionBehaviour) {
        this.f2405V[0] = dimensionBehaviour;
    }

    /* renamed from: Q */
    public final void mo2787Q(DimensionBehaviour dimensionBehaviour) {
        this.f2405V[1] = dimensionBehaviour;
    }

    /* renamed from: R */
    public final void mo2788R(int i) {
        this.f2407X = i;
        int i2 = this.f2419e0;
        if (i < i2) {
            this.f2407X = i2;
        }
    }

    /* renamed from: S */
    public void mo2789S(boolean z, boolean z2) {
        int i;
        int i2;
        C0691c cVar = this.f2416d;
        boolean z3 = z & cVar.f2482g;
        C0693d dVar = this.f2418e;
        boolean z4 = z2 & dVar.f2482g;
        int i3 = cVar.f2483h.f2470g;
        int i4 = dVar.f2483h.f2470g;
        int i5 = cVar.f2484i.f2470g;
        int i6 = dVar.f2484i.f2470g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.f2413b0 = i3;
        }
        if (z4) {
            this.f2415c0 = i4;
        }
        if (this.f2429j0 == 8) {
            this.f2407X = 0;
            this.f2408Y = 0;
            return;
        }
        if (z3) {
            if (this.f2405V[0] == DimensionBehaviour.FIXED && i8 < (i2 = this.f2407X)) {
                i8 = i2;
            }
            this.f2407X = i8;
            int i11 = this.f2419e0;
            if (i8 < i11) {
                this.f2407X = i11;
            }
        }
        if (z4) {
            if (this.f2405V[1] == DimensionBehaviour.FIXED && i9 < (i = this.f2408Y)) {
                i9 = i;
            }
            this.f2408Y = i9;
            int i12 = this.f2421f0;
            if (i9 < i12) {
                this.f2408Y = i12;
            }
        }
    }

    /* renamed from: T */
    public void mo2790T(C0680c cVar, boolean z) {
        int i;
        int i2;
        C0693d dVar;
        C0691c cVar2;
        ConstraintAnchor constraintAnchor = this.f2394K;
        cVar.getClass();
        int n = C0680c.m1925n(constraintAnchor);
        int n2 = C0680c.m1925n(this.f2395L);
        int n3 = C0680c.m1925n(this.f2396M);
        int n4 = C0680c.m1925n(this.f2397N);
        if (z && (cVar2 = this.f2416d) != null) {
            DependencyNode dependencyNode = cVar2.f2483h;
            if (dependencyNode.f2473j) {
                DependencyNode dependencyNode2 = cVar2.f2484i;
                if (dependencyNode2.f2473j) {
                    n = dependencyNode.f2470g;
                    n3 = dependencyNode2.f2470g;
                }
            }
        }
        if (z && (dVar = this.f2418e) != null) {
            DependencyNode dependencyNode3 = dVar.f2483h;
            if (dependencyNode3.f2473j) {
                DependencyNode dependencyNode4 = dVar.f2484i;
                if (dependencyNode4.f2473j) {
                    n2 = dependencyNode3.f2470g;
                    n4 = dependencyNode4.f2470g;
                }
            }
        }
        int i3 = n4 - n2;
        if (n3 - n < 0 || i3 < 0 || n == Integer.MIN_VALUE || n == Integer.MAX_VALUE || n2 == Integer.MIN_VALUE || n2 == Integer.MAX_VALUE || n3 == Integer.MIN_VALUE || n3 == Integer.MAX_VALUE || n4 == Integer.MIN_VALUE || n4 == Integer.MAX_VALUE) {
            n = 0;
            n2 = 0;
            n3 = 0;
            n4 = 0;
        }
        int i4 = n3 - n;
        int i5 = n4 - n2;
        this.f2413b0 = n;
        this.f2415c0 = n2;
        if (this.f2429j0 == 8) {
            this.f2407X = 0;
            this.f2408Y = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.f2405V;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i4 < (i2 = this.f2407X)) {
            i4 = i2;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i5 < (i = this.f2408Y)) {
            i5 = i;
        }
        this.f2407X = i4;
        this.f2408Y = i5;
        int i6 = this.f2421f0;
        if (i5 < i6) {
            this.f2408Y = i6;
        }
        int i7 = this.f2419e0;
        if (i4 < i7) {
            this.f2407X = i7;
        }
        int i8 = this.f2454w;
        if (i8 > 0 && dimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f2407X = Math.min(this.f2407X, i8);
        }
        int i9 = this.f2457z;
        if (i9 > 0 && this.f2405V[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f2408Y = Math.min(this.f2408Y, i9);
        }
        int i11 = this.f2407X;
        if (i4 != i11) {
            this.f2426i = i11;
        }
        int i12 = this.f2408Y;
        if (i5 != i12) {
            this.f2428j = i12;
        }
    }

    /* renamed from: d */
    public final void mo2791d(C0697d dVar, C0680c cVar, HashSet<ConstraintWidget> hashSet, int i, boolean z) {
        if (z) {
            if (hashSet.contains(this)) {
                C0702g.m2079a(dVar, cVar, this);
                hashSet.remove(this);
                mo2792e(cVar, dVar.mo2837Z(64));
            } else {
                return;
            }
        }
        if (i == 0) {
            HashSet<ConstraintAnchor> hashSet2 = this.f2394K.f2374a;
            if (hashSet2 != null) {
                Iterator<ConstraintAnchor> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f2377d.mo2791d(dVar, cVar, hashSet, i, true);
                }
            }
            HashSet<ConstraintAnchor> hashSet3 = this.f2396M.f2374a;
            if (hashSet3 != null) {
                Iterator<ConstraintAnchor> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().f2377d.mo2791d(dVar, cVar, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> hashSet4 = this.f2395L.f2374a;
        if (hashSet4 != null) {
            Iterator<ConstraintAnchor> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().f2377d.mo2791d(dVar, cVar, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet5 = this.f2397N.f2374a;
        if (hashSet5 != null) {
            Iterator<ConstraintAnchor> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().f2377d.mo2791d(dVar, cVar, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet6 = this.f2398O.f2374a;
        if (hashSet6 != null) {
            Iterator<ConstraintAnchor> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().f2377d.mo2791d(dVar, cVar, hashSet, i, true);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0420  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x042a  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x044b  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0452  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0484  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0555  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x05b9  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x05cd  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x05cf  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x05d6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0665  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x0668  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x06a9  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x06af  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x070e  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x071a  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x0083 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010d  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2792e(androidx.constraintlayout.core.C0680c r57, boolean r58) {
        /*
            r56 = this;
            r15 = r56
            r14 = r57
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2394K
            androidx.constraintlayout.core.SolverVariable r13 = r14.mo2747k(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2396M
            androidx.constraintlayout.core.SolverVariable r12 = r14.mo2747k(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2395L
            androidx.constraintlayout.core.SolverVariable r11 = r14.mo2747k(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2397N
            androidx.constraintlayout.core.SolverVariable r10 = r14.mo2747k(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2398O
            androidx.constraintlayout.core.SolverVariable r9 = r14.mo2747k(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2406W
            r8 = 2
            r1 = 3
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L_0x004e
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r0.f2405V
            r2 = r0[r6]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r3) goto L_0x0034
            r2 = 1
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            r0 = r0[r7]
            if (r0 != r3) goto L_0x003b
            r0 = 1
            goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            int r3 = r15.f2444r
            if (r3 == r7) goto L_0x0049
            if (r3 == r8) goto L_0x004f
            if (r3 == r1) goto L_0x004e
            r28 = r0
            r29 = r2
            goto L_0x0053
        L_0x0049:
            r29 = r2
            r28 = 0
            goto L_0x0053
        L_0x004e:
            r0 = 0
        L_0x004f:
            r28 = r0
            r29 = 0
        L_0x0053:
            int r0 = r15.f2429j0
            r5 = 8
            if (r0 != r5) goto L_0x0091
            boolean r0 = r15.f2431k0
            if (r0 != 0) goto L_0x0091
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r15.f2403T
            int r0 = r0.size()
            r2 = 0
        L_0x0064:
            if (r2 >= r0) goto L_0x0083
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r3 = r15.f2403T
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r3
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r3 = r3.f2374a
            if (r3 != 0) goto L_0x0073
            goto L_0x007b
        L_0x0073:
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x007b
            r3 = 1
            goto L_0x007c
        L_0x007b:
            r3 = 0
        L_0x007c:
            if (r3 == 0) goto L_0x0080
            r0 = 1
            goto L_0x0084
        L_0x0080:
            int r2 = r2 + 1
            goto L_0x0064
        L_0x0083:
            r0 = 0
        L_0x0084:
            if (r0 != 0) goto L_0x0091
            boolean[] r0 = r15.f2404U
            boolean r2 = r0[r6]
            if (r2 != 0) goto L_0x0091
            boolean r0 = r0[r7]
            if (r0 != 0) goto L_0x0091
            return
        L_0x0091:
            boolean r0 = r15.f2432l
            r4 = 5
            if (r0 != 0) goto L_0x009a
            boolean r2 = r15.f2434m
            if (r2 == 0) goto L_0x01a1
        L_0x009a:
            if (r0 == 0) goto L_0x0109
            int r0 = r15.f2413b0
            r14.mo2740d(r13, r0)
            int r0 = r15.f2413b0
            int r2 = r15.f2407X
            int r0 = r0 + r2
            r14.mo2740d(r12, r0)
            if (r29 == 0) goto L_0x0109
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2406W
            if (r0 == 0) goto L_0x0109
            boolean r2 = r15.f2424h
            if (r2 == 0) goto L_0x0100
            androidx.constraintlayout.core.widgets.d r0 = (androidx.constraintlayout.core.widgets.C0697d) r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.f2394K
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r3 = r0.f2523N0
            if (r3 == 0) goto L_0x00d3
            java.lang.Object r3 = r3.get()
            if (r3 == 0) goto L_0x00d3
            int r3 = r2.mo2763d()
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r8 = r0.f2523N0
            java.lang.Object r8 = r8.get()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r8
            int r8 = r8.mo2763d()
            if (r3 <= r8) goto L_0x00da
        L_0x00d3:
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r2)
            r0.f2523N0 = r3
        L_0x00da:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.f2396M
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r3 = r0.f2525P0
            if (r3 == 0) goto L_0x00f8
            java.lang.Object r3 = r3.get()
            if (r3 == 0) goto L_0x00f8
            int r3 = r2.mo2763d()
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r8 = r0.f2525P0
            java.lang.Object r8 = r8.get()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r8
            int r8 = r8.mo2763d()
            if (r3 <= r8) goto L_0x0109
        L_0x00f8:
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r2)
            r0.f2525P0 = r3
            goto L_0x0109
        L_0x0100:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2396M
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo2747k(r0)
            r14.mo2742f(r0, r12, r6, r4)
        L_0x0109:
            boolean r0 = r15.f2434m
            if (r0 == 0) goto L_0x0194
            int r0 = r15.f2415c0
            r14.mo2740d(r11, r0)
            int r0 = r15.f2415c0
            int r2 = r15.f2408Y
            int r0 = r0 + r2
            r14.mo2740d(r10, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2398O
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r0.f2374a
            if (r0 != 0) goto L_0x0121
            goto L_0x0129
        L_0x0121:
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0129
            r0 = 1
            goto L_0x012a
        L_0x0129:
            r0 = 0
        L_0x012a:
            if (r0 == 0) goto L_0x0134
            int r0 = r15.f2415c0
            int r2 = r15.f2417d0
            int r0 = r0 + r2
            r14.mo2740d(r9, r0)
        L_0x0134:
            if (r28 == 0) goto L_0x0194
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2406W
            if (r0 == 0) goto L_0x0194
            boolean r2 = r15.f2424h
            if (r2 == 0) goto L_0x018b
            androidx.constraintlayout.core.widgets.d r0 = (androidx.constraintlayout.core.widgets.C0697d) r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.f2395L
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r3 = r0.f2522M0
            if (r3 == 0) goto L_0x015e
            java.lang.Object r3 = r3.get()
            if (r3 == 0) goto L_0x015e
            int r3 = r2.mo2763d()
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r8 = r0.f2522M0
            java.lang.Object r8 = r8.get()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r8
            int r8 = r8.mo2763d()
            if (r3 <= r8) goto L_0x0165
        L_0x015e:
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r2)
            r0.f2522M0 = r3
        L_0x0165:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.f2397N
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r3 = r0.f2524O0
            if (r3 == 0) goto L_0x0183
            java.lang.Object r3 = r3.get()
            if (r3 == 0) goto L_0x0183
            int r3 = r2.mo2763d()
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r8 = r0.f2524O0
            java.lang.Object r8 = r8.get()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r8
            int r8 = r8.mo2763d()
            if (r3 <= r8) goto L_0x0194
        L_0x0183:
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r2)
            r0.f2524O0 = r3
            goto L_0x0194
        L_0x018b:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2397N
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo2747k(r0)
            r14.mo2742f(r0, r10, r6, r4)
        L_0x0194:
            boolean r0 = r15.f2432l
            if (r0 == 0) goto L_0x01a1
            boolean r0 = r15.f2434m
            if (r0 == 0) goto L_0x01a1
            r15.f2432l = r6
            r15.f2434m = r6
            return
        L_0x01a1:
            if (r58 == 0) goto L_0x0227
            androidx.constraintlayout.core.widgets.analyzer.c r0 = r15.f2416d
            if (r0 == 0) goto L_0x0227
            androidx.constraintlayout.core.widgets.analyzer.d r2 = r15.f2418e
            if (r2 == 0) goto L_0x0227
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r0.f2483h
            boolean r8 = r3.f2473j
            if (r8 == 0) goto L_0x0227
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f2484i
            boolean r0 = r0.f2473j
            if (r0 == 0) goto L_0x0227
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r2.f2483h
            boolean r0 = r0.f2473j
            if (r0 == 0) goto L_0x0227
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r2.f2484i
            boolean r0 = r0.f2473j
            if (r0 == 0) goto L_0x0227
            int r0 = r3.f2470g
            r14.mo2740d(r13, r0)
            androidx.constraintlayout.core.widgets.analyzer.c r0 = r15.f2416d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f2484i
            int r0 = r0.f2470g
            r14.mo2740d(r12, r0)
            androidx.constraintlayout.core.widgets.analyzer.d r0 = r15.f2418e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f2483h
            int r0 = r0.f2470g
            r14.mo2740d(r11, r0)
            androidx.constraintlayout.core.widgets.analyzer.d r0 = r15.f2418e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f2484i
            int r0 = r0.f2470g
            r14.mo2740d(r10, r0)
            androidx.constraintlayout.core.widgets.analyzer.d r0 = r15.f2418e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f2490k
            int r0 = r0.f2470g
            r14.mo2740d(r9, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2406W
            if (r0 == 0) goto L_0x0222
            if (r29 == 0) goto L_0x0209
            boolean[] r0 = r15.f2420f
            boolean r0 = r0[r6]
            if (r0 == 0) goto L_0x0209
            boolean r0 = r56.mo2774B()
            if (r0 != 0) goto L_0x0209
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2406W
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2396M
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo2747k(r0)
            r14.mo2742f(r0, r12, r6, r5)
        L_0x0209:
            if (r28 == 0) goto L_0x0222
            boolean[] r0 = r15.f2420f
            boolean r0 = r0[r7]
            if (r0 == 0) goto L_0x0222
            boolean r0 = r56.mo2775C()
            if (r0 != 0) goto L_0x0222
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2406W
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2397N
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo2747k(r0)
            r14.mo2742f(r0, r10, r6, r5)
        L_0x0222:
            r15.f2432l = r6
            r15.f2434m = r6
            return
        L_0x0227:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2406W
            if (r0 == 0) goto L_0x0298
            boolean r0 = r15.mo2773A(r6)
            if (r0 == 0) goto L_0x023a
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2406W
            androidx.constraintlayout.core.widgets.d r0 = (androidx.constraintlayout.core.widgets.C0697d) r0
            r0.mo2834V(r6, r15)
            r0 = 1
            goto L_0x023e
        L_0x023a:
            boolean r0 = r56.mo2774B()
        L_0x023e:
            boolean r2 = r15.mo2773A(r7)
            if (r2 == 0) goto L_0x024d
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r15.f2406W
            androidx.constraintlayout.core.widgets.d r2 = (androidx.constraintlayout.core.widgets.C0697d) r2
            r2.mo2834V(r7, r15)
            r2 = 1
            goto L_0x0251
        L_0x024d:
            boolean r2 = r56.mo2775C()
        L_0x0251:
            if (r0 != 0) goto L_0x0270
            if (r29 == 0) goto L_0x0270
            int r3 = r15.f2429j0
            if (r3 == r5) goto L_0x0270
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.f2394K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f2379f
            if (r3 != 0) goto L_0x0270
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.f2396M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f2379f
            if (r3 != 0) goto L_0x0270
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r15.f2406W
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f2396M
            androidx.constraintlayout.core.SolverVariable r3 = r14.mo2747k(r3)
            r14.mo2742f(r3, r12, r6, r7)
        L_0x0270:
            if (r2 != 0) goto L_0x0293
            if (r28 == 0) goto L_0x0293
            int r3 = r15.f2429j0
            if (r3 == r5) goto L_0x0293
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.f2395L
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f2379f
            if (r3 != 0) goto L_0x0293
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.f2397N
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f2379f
            if (r3 != 0) goto L_0x0293
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.f2398O
            if (r3 != 0) goto L_0x0293
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r15.f2406W
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f2397N
            androidx.constraintlayout.core.SolverVariable r3 = r14.mo2747k(r3)
            r14.mo2742f(r3, r10, r6, r7)
        L_0x0293:
            r31 = r0
            r30 = r2
            goto L_0x029c
        L_0x0298:
            r30 = 0
            r31 = 0
        L_0x029c:
            int r0 = r15.f2407X
            int r2 = r15.f2419e0
            if (r0 >= r2) goto L_0x02a3
            goto L_0x02a4
        L_0x02a3:
            r2 = r0
        L_0x02a4:
            int r3 = r15.f2408Y
            int r8 = r15.f2421f0
            if (r3 >= r8) goto L_0x02ab
            goto L_0x02ac
        L_0x02ab:
            r8 = r3
        L_0x02ac:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r15.f2405V
            r1 = r4[r6]
            r19 = r2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 == r2) goto L_0x02b9
            r20 = 1
            goto L_0x02bb
        L_0x02b9:
            r20 = 0
        L_0x02bb:
            r4 = r4[r7]
            if (r4 == r2) goto L_0x02c2
            r21 = 1
            goto L_0x02c4
        L_0x02c2:
            r21 = 0
        L_0x02c4:
            int r7 = r15.f2411a0
            r15.f2385B = r7
            float r6 = r15.f2409Z
            r15.f2386C = r6
            int r5 = r15.f2446s
            r24 = r8
            int r8 = r15.f2448t
            r25 = 0
            r26 = 4
            r32 = r11
            int r25 = (r6 > r25 ? 1 : (r6 == r25 ? 0 : -1))
            if (r25 <= 0) goto L_0x0408
            int r11 = r15.f2429j0
            r34 = r9
            r9 = 8
            if (r11 == r9) goto L_0x040a
            if (r1 != r2) goto L_0x02e9
            if (r5 != 0) goto L_0x02e9
            r5 = 3
        L_0x02e9:
            if (r4 != r2) goto L_0x02ee
            if (r8 != 0) goto L_0x02ee
            r8 = 3
        L_0x02ee:
            if (r1 != r2) goto L_0x03b8
            if (r4 != r2) goto L_0x03b8
            r9 = 3
            if (r5 != r9) goto L_0x03b8
            if (r8 != r9) goto L_0x03b8
            r9 = -1
            if (r7 != r9) goto L_0x0311
            if (r20 == 0) goto L_0x0302
            if (r21 != 0) goto L_0x0302
            r0 = 0
            r15.f2385B = r0
            goto L_0x0311
        L_0x0302:
            if (r20 != 0) goto L_0x0311
            if (r21 == 0) goto L_0x0311
            r0 = 1
            r15.f2385B = r0
            if (r7 != r9) goto L_0x0311
            r0 = 1065353216(0x3f800000, float:1.0)
            float r11 = r0 / r6
            r15.f2386C = r11
        L_0x0311:
            int r0 = r15.f2385B
            if (r0 != 0) goto L_0x0329
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2395L
            boolean r0 = r0.mo2767h()
            if (r0 == 0) goto L_0x0325
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2397N
            boolean r0 = r0.mo2767h()
            if (r0 != 0) goto L_0x0329
        L_0x0325:
            r0 = 1
            r15.f2385B = r0
            goto L_0x0341
        L_0x0329:
            r0 = 1
            int r1 = r15.f2385B
            if (r1 != r0) goto L_0x0341
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2394K
            boolean r0 = r0.mo2767h()
            if (r0 == 0) goto L_0x033e
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2396M
            boolean r0 = r0.mo2767h()
            if (r0 != 0) goto L_0x0341
        L_0x033e:
            r0 = 0
            r15.f2385B = r0
        L_0x0341:
            int r0 = r15.f2385B
            r1 = -1
            if (r0 != r1) goto L_0x0395
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2395L
            boolean r0 = r0.mo2767h()
            if (r0 == 0) goto L_0x0366
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2397N
            boolean r0 = r0.mo2767h()
            if (r0 == 0) goto L_0x0366
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2394K
            boolean r0 = r0.mo2767h()
            if (r0 == 0) goto L_0x0366
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2396M
            boolean r0 = r0.mo2767h()
            if (r0 != 0) goto L_0x0395
        L_0x0366:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2395L
            boolean r0 = r0.mo2767h()
            if (r0 == 0) goto L_0x037a
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2397N
            boolean r0 = r0.mo2767h()
            if (r0 == 0) goto L_0x037a
            r0 = 0
            r15.f2385B = r0
            goto L_0x0395
        L_0x037a:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2394K
            boolean r0 = r0.mo2767h()
            if (r0 == 0) goto L_0x0395
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2396M
            boolean r0 = r0.mo2767h()
            if (r0 == 0) goto L_0x0395
            float r0 = r15.f2386C
            r1 = 1065353216(0x3f800000, float:1.0)
            float r11 = r1 / r0
            r15.f2386C = r11
            r0 = 1
            r15.f2385B = r0
        L_0x0395:
            int r0 = r15.f2385B
            r1 = -1
            if (r0 != r1) goto L_0x03fc
            int r0 = r15.f2452v
            if (r0 <= 0) goto L_0x03a6
            int r1 = r15.f2456y
            if (r1 != 0) goto L_0x03a6
            r1 = 0
            r15.f2385B = r1
            goto L_0x03fc
        L_0x03a6:
            if (r0 != 0) goto L_0x03fc
            int r0 = r15.f2456y
            if (r0 <= 0) goto L_0x03fc
            float r0 = r15.f2386C
            r1 = 1065353216(0x3f800000, float:1.0)
            float r11 = r1 / r0
            r15.f2386C = r11
            r0 = 1
            r15.f2385B = r0
            goto L_0x03fc
        L_0x03b8:
            r9 = 3
            if (r1 != r2) goto L_0x03d4
            if (r5 != r9) goto L_0x03d4
            r11 = 0
            r15.f2385B = r11
            float r0 = (float) r3
            float r6 = r6 * r0
            int r0 = (int) r6
            if (r4 == r2) goto L_0x03d1
            r36 = r8
            r35 = r24
            r11 = 1065353216(0x3f800000, float:1.0)
            r33 = 0
            r37 = 4
            goto L_0x0416
        L_0x03d1:
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L_0x03ff
        L_0x03d4:
            if (r4 != r2) goto L_0x03fc
            if (r8 != r9) goto L_0x03fc
            r3 = 1
            r15.f2385B = r3
            r3 = -1
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r7 != r3) goto L_0x03e4
            float r3 = r11 / r6
            r15.f2386C = r3
        L_0x03e4:
            float r3 = r15.f2386C
            float r0 = (float) r0
            float r3 = r3 * r0
            int r0 = (int) r3
            if (r1 == r2) goto L_0x03f7
            r35 = r0
            r37 = r5
            r0 = r19
            r33 = 0
            r36 = 4
            goto L_0x0416
        L_0x03f7:
            r24 = r0
        L_0x03f9:
            r0 = r19
            goto L_0x03ff
        L_0x03fc:
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L_0x03f9
        L_0x03ff:
            r37 = r5
            r36 = r8
            r35 = r24
            r33 = 1
            goto L_0x0416
        L_0x0408:
            r34 = r9
        L_0x040a:
            r11 = 1065353216(0x3f800000, float:1.0)
            r37 = r5
            r36 = r8
            r0 = r19
            r35 = r24
            r33 = 0
        L_0x0416:
            int[] r1 = r15.f2450u
            r3 = 0
            r1[r3] = r37
            r3 = 1
            r1[r3] = r36
            if (r33 == 0) goto L_0x042a
            int r1 = r15.f2385B
            r3 = -1
            if (r1 == 0) goto L_0x0427
            if (r1 != r3) goto L_0x042b
        L_0x0427:
            r18 = 1
            goto L_0x042d
        L_0x042a:
            r3 = -1
        L_0x042b:
            r18 = 0
        L_0x042d:
            if (r33 == 0) goto L_0x0439
            int r1 = r15.f2385B
            r4 = 1
            if (r1 == r4) goto L_0x0436
            if (r1 != r3) goto L_0x0439
        L_0x0436:
            r38 = 1
            goto L_0x043b
        L_0x0439:
            r38 = 0
        L_0x043b:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r15.f2405V
            r3 = 0
            r1 = r1[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r9) goto L_0x044b
            boolean r1 = r15 instanceof androidx.constraintlayout.core.widgets.C0697d
            if (r1 == 0) goto L_0x044b
            r19 = 1
            goto L_0x044d
        L_0x044b:
            r19 = 0
        L_0x044d:
            if (r19 == 0) goto L_0x0452
            r20 = 0
            goto L_0x0454
        L_0x0452:
            r20 = r0
        L_0x0454:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2401R
            boolean r0 = r0.mo2767h()
            r1 = 1
            r39 = r0 ^ 1
            boolean[] r0 = r15.f2404U
            r3 = 0
            boolean r21 = r0[r3]
            boolean r40 = r0[r1]
            int r0 = r15.f2440p
            r41 = 0
            r8 = 2
            if (r0 == r8) goto L_0x0545
            boolean r0 = r15.f2432l
            if (r0 != 0) goto L_0x0545
            if (r58 == 0) goto L_0x04b4
            androidx.constraintlayout.core.widgets.analyzer.c r0 = r15.f2416d
            if (r0 == 0) goto L_0x04b4
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.f2483h
            boolean r3 = r1.f2473j
            if (r3 == 0) goto L_0x04b4
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f2484i
            boolean r0 = r0.f2473j
            if (r0 != 0) goto L_0x0482
            goto L_0x04b4
        L_0x0482:
            if (r58 == 0) goto L_0x0545
            int r0 = r1.f2470g
            r14.mo2740d(r13, r0)
            androidx.constraintlayout.core.widgets.analyzer.c r0 = r15.f2416d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f2484i
            int r0 = r0.f2470g
            r14.mo2740d(r12, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2406W
            if (r0 == 0) goto L_0x0545
            if (r29 == 0) goto L_0x0545
            boolean[] r0 = r15.f2420f
            r1 = 0
            boolean r0 = r0[r1]
            if (r0 == 0) goto L_0x0545
            boolean r0 = r56.mo2774B()
            if (r0 != 0) goto L_0x0545
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2406W
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2396M
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo2747k(r0)
            r5 = 8
            r14.mo2742f(r0, r12, r1, r5)
            goto L_0x0545
        L_0x04b4:
            r5 = 8
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2406W
            if (r0 == 0) goto L_0x04c2
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2396M
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo2747k(r0)
            r7 = r0
            goto L_0x04c4
        L_0x04c2:
            r7 = r41
        L_0x04c4:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2406W
            if (r0 == 0) goto L_0x04d0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2394K
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo2747k(r0)
            r6 = r0
            goto L_0x04d2
        L_0x04d0:
            r6 = r41
        L_0x04d2:
            boolean[] r0 = r15.f2420f
            r16 = 0
            boolean r23 = r0[r16]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.f2405V
            r27 = r0[r16]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r15.f2394K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.f2396M
            int r1 = r15.f2413b0
            int r14 = r15.f2419e0
            int[] r5 = r15.f2387D
            r43 = r5[r16]
            float r5 = r15.f2423g0
            r22 = 1
            r0 = r0[r22]
            if (r0 != r2) goto L_0x04f3
            r44 = 1
            goto L_0x04f5
        L_0x04f3:
            r44 = 0
        L_0x04f5:
            int r0 = r15.f2452v
            r24 = r0
            int r0 = r15.f2454w
            r25 = r0
            float r0 = r15.f2455x
            r26 = r0
            r0 = 1
            r45 = r2
            r2 = r0
            r0 = r56
            r46 = r1
            r1 = r57
            r47 = r3
            r3 = r29
            r17 = r4
            r4 = r28
            r42 = r5
            r5 = r23
            r8 = r27
            r49 = r9
            r48 = r34
            r9 = r19
            r50 = r10
            r10 = r17
            r51 = r32
            r11 = r47
            r52 = r12
            r12 = r46
            r53 = r13
            r13 = r20
            r15 = r43
            r16 = r42
            r17 = r18
            r18 = r44
            r19 = r31
            r20 = r30
            r22 = r37
            r23 = r36
            r27 = r39
            r0.mo2794g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0553
        L_0x0545:
            r45 = r2
            r49 = r9
            r50 = r10
            r52 = r12
            r53 = r13
            r51 = r32
            r48 = r34
        L_0x0553:
            if (r58 == 0) goto L_0x05b9
            r15 = r56
            androidx.constraintlayout.core.widgets.analyzer.d r0 = r15.f2418e
            if (r0 == 0) goto L_0x05ac
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.f2483h
            boolean r2 = r1.f2473j
            if (r2 == 0) goto L_0x05ac
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f2484i
            boolean r0 = r0.f2473j
            if (r0 == 0) goto L_0x05ac
            int r0 = r1.f2470g
            r14 = r57
            r13 = r51
            r14.mo2740d(r13, r0)
            androidx.constraintlayout.core.widgets.analyzer.d r0 = r15.f2418e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f2484i
            int r0 = r0.f2470g
            r12 = r50
            r14.mo2740d(r12, r0)
            androidx.constraintlayout.core.widgets.analyzer.d r0 = r15.f2418e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f2490k
            int r0 = r0.f2470g
            r1 = r48
            r14.mo2740d(r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2406W
            if (r0 == 0) goto L_0x05a6
            if (r30 != 0) goto L_0x05a6
            if (r28 == 0) goto L_0x05a6
            boolean[] r2 = r15.f2420f
            r11 = 1
            boolean r2 = r2[r11]
            if (r2 == 0) goto L_0x05a2
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2397N
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo2747k(r0)
            r2 = 8
            r10 = 0
            r14.mo2742f(r0, r12, r10, r2)
            goto L_0x05aa
        L_0x05a2:
            r2 = 8
            r10 = 0
            goto L_0x05aa
        L_0x05a6:
            r2 = 8
            r10 = 0
            r11 = 1
        L_0x05aa:
            r7 = 0
            goto L_0x05c8
        L_0x05ac:
            r14 = r57
            r1 = r48
            r12 = r50
            r13 = r51
            r2 = 8
            r10 = 0
            r11 = 1
            goto L_0x05c7
        L_0x05b9:
            r2 = 8
            r10 = 0
            r11 = 1
            r15 = r56
            r14 = r57
            r1 = r48
            r12 = r50
            r13 = r51
        L_0x05c7:
            r7 = 1
        L_0x05c8:
            int r0 = r15.f2442q
            r3 = 2
            if (r0 != r3) goto L_0x05cf
            r6 = 0
            goto L_0x05d0
        L_0x05cf:
            r6 = r7
        L_0x05d0:
            if (r6 == 0) goto L_0x06a9
            boolean r0 = r15.f2434m
            if (r0 != 0) goto L_0x06a9
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.f2405V
            r0 = r0[r11]
            r3 = r49
            if (r0 != r3) goto L_0x05e4
            boolean r0 = r15 instanceof androidx.constraintlayout.core.widgets.C0697d
            if (r0 == 0) goto L_0x05e4
            r9 = 1
            goto L_0x05e5
        L_0x05e4:
            r9 = 0
        L_0x05e5:
            if (r9 == 0) goto L_0x05e9
            r35 = 0
        L_0x05e9:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2406W
            if (r0 == 0) goto L_0x05f5
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2397N
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo2747k(r0)
            r7 = r0
            goto L_0x05f7
        L_0x05f5:
            r7 = r41
        L_0x05f7:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2406W
            if (r0 == 0) goto L_0x0603
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2395L
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo2747k(r0)
            r6 = r0
            goto L_0x0605
        L_0x0603:
            r6 = r41
        L_0x0605:
            int r0 = r15.f2417d0
            if (r0 > 0) goto L_0x060d
            int r3 = r15.f2429j0
            if (r3 != r2) goto L_0x0645
        L_0x060d:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.f2398O
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.f2379f
            if (r4 == 0) goto L_0x0636
            r14.mo2741e(r1, r13, r0, r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2398O
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2379f
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo2747k(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.f2398O
            int r3 = r3.mo2764e()
            r14.mo2741e(r1, r0, r3, r2)
            if (r28 == 0) goto L_0x0633
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2397N
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo2747k(r0)
            r1 = 5
            r14.mo2742f(r7, r0, r10, r1)
        L_0x0633:
            r27 = 0
            goto L_0x0647
        L_0x0636:
            int r4 = r15.f2429j0
            if (r4 != r2) goto L_0x0642
            int r0 = r3.mo2764e()
            r14.mo2741e(r1, r13, r0, r2)
            goto L_0x0645
        L_0x0642:
            r14.mo2741e(r1, r13, r0, r2)
        L_0x0645:
            r27 = r39
        L_0x0647:
            boolean[] r0 = r15.f2420f
            boolean r5 = r0[r11]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.f2405V
            r8 = r0[r11]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r15.f2395L
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.f2397N
            int r1 = r15.f2415c0
            int r2 = r15.f2421f0
            int[] r10 = r15.f2387D
            r16 = r10[r11]
            float r10 = r15.f2425h0
            r17 = 0
            r0 = r0[r17]
            r11 = r45
            if (r0 != r11) goto L_0x0668
            r18 = 1
            goto L_0x066a
        L_0x0668:
            r18 = 0
        L_0x066a:
            int r0 = r15.f2456y
            r24 = r0
            int r0 = r15.f2457z
            r25 = r0
            float r0 = r15.f2384A
            r26 = r0
            r0 = 0
            r19 = r2
            r2 = r0
            r0 = r56
            r20 = r1
            r1 = r57
            r11 = r3
            r3 = r28
            r21 = r4
            r4 = r29
            r17 = r10
            r10 = r21
            r54 = r12
            r12 = r20
            r55 = r13
            r13 = r35
            r14 = r19
            r15 = r16
            r16 = r17
            r17 = r38
            r19 = r30
            r20 = r31
            r21 = r40
            r22 = r36
            r23 = r37
            r0.mo2794g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x06ad
        L_0x06a9:
            r54 = r12
            r55 = r13
        L_0x06ad:
            if (r33 == 0) goto L_0x070e
            r0 = r56
            int r1 = r0.f2385B
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 1
            if (r1 != r3) goto L_0x06e3
            float r1 = r0.f2386C
            androidx.constraintlayout.core.b r3 = r57.mo2748l()
            androidx.constraintlayout.core.b$a r4 = r3.f2349d
            r5 = r54
            r4.mo2722h(r5, r2)
            androidx.constraintlayout.core.b$a r2 = r3.f2349d
            r4 = r55
            r6 = 1065353216(0x3f800000, float:1.0)
            r2.mo2722h(r4, r6)
            androidx.constraintlayout.core.b$a r2 = r3.f2349d
            r7 = r52
            r2.mo2722h(r7, r1)
            androidx.constraintlayout.core.b$a r2 = r3.f2349d
            float r1 = -r1
            r8 = r53
            r2.mo2722h(r8, r1)
            r1 = r57
            r1.mo2739c(r3)
            goto L_0x0712
        L_0x06e3:
            r1 = r57
            r7 = r52
            r8 = r53
            r5 = r54
            r4 = r55
            r6 = 1065353216(0x3f800000, float:1.0)
            float r3 = r0.f2386C
            androidx.constraintlayout.core.b r9 = r57.mo2748l()
            androidx.constraintlayout.core.b$a r10 = r9.f2349d
            r10.mo2722h(r7, r2)
            androidx.constraintlayout.core.b$a r2 = r9.f2349d
            r2.mo2722h(r8, r6)
            androidx.constraintlayout.core.b$a r2 = r9.f2349d
            r2.mo2722h(r5, r3)
            androidx.constraintlayout.core.b$a r2 = r9.f2349d
            float r3 = -r3
            r2.mo2722h(r4, r3)
            r1.mo2739c(r9)
            goto L_0x0712
        L_0x070e:
            r0 = r56
            r1 = r57
        L_0x0712:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.f2401R
            boolean r2 = r2.mo2767h()
            if (r2 == 0) goto L_0x07d1
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.f2401R
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f2379f
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.f2377d
            float r3 = r0.f2388E
            r4 = 1119092736(0x42b40000, float:90.0)
            float r3 = r3 + r4
            double r3 = (double) r3
            double r3 = java.lang.Math.toRadians(r3)
            float r3 = (float) r3
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.f2401R
            int r4 = r4.mo2764e()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r0.mo2800m(r5)
            androidx.constraintlayout.core.SolverVariable r6 = r1.mo2747k(r6)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r0.mo2800m(r7)
            androidx.constraintlayout.core.SolverVariable r8 = r1.mo2747k(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.mo2800m(r9)
            androidx.constraintlayout.core.SolverVariable r10 = r1.mo2747k(r10)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r11 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r0.mo2800m(r11)
            androidx.constraintlayout.core.SolverVariable r12 = r1.mo2747k(r12)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.mo2800m(r5)
            androidx.constraintlayout.core.SolverVariable r5 = r1.mo2747k(r5)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r2.mo2800m(r7)
            androidx.constraintlayout.core.SolverVariable r7 = r1.mo2747k(r7)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r2.mo2800m(r9)
            androidx.constraintlayout.core.SolverVariable r9 = r1.mo2747k(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mo2800m(r11)
            androidx.constraintlayout.core.SolverVariable r2 = r1.mo2747k(r2)
            androidx.constraintlayout.core.b r11 = r57.mo2748l()
            double r13 = (double) r3
            double r15 = java.lang.Math.sin(r13)
            double r3 = (double) r4
            r17 = r9
            r58 = r10
            double r9 = r15 * r3
            float r9 = (float) r9
            androidx.constraintlayout.core.b$a r10 = r11.f2349d
            r15 = 1056964608(0x3f000000, float:0.5)
            r10.mo2722h(r7, r15)
            androidx.constraintlayout.core.b$a r7 = r11.f2349d
            r7.mo2722h(r2, r15)
            androidx.constraintlayout.core.b$a r2 = r11.f2349d
            r7 = -1090519040(0xffffffffbf000000, float:-0.5)
            r2.mo2722h(r8, r7)
            androidx.constraintlayout.core.b$a r2 = r11.f2349d
            r2.mo2722h(r12, r7)
            float r2 = -r9
            r11.f2347b = r2
            r1.mo2739c(r11)
            androidx.constraintlayout.core.b r2 = r57.mo2748l()
            double r8 = java.lang.Math.cos(r13)
            double r8 = r8 * r3
            float r3 = (float) r8
            androidx.constraintlayout.core.b$a r4 = r2.f2349d
            r4.mo2722h(r5, r15)
            androidx.constraintlayout.core.b$a r4 = r2.f2349d
            r5 = r17
            r4.mo2722h(r5, r15)
            androidx.constraintlayout.core.b$a r4 = r2.f2349d
            r4.mo2722h(r6, r7)
            androidx.constraintlayout.core.b$a r4 = r2.f2349d
            r5 = r58
            r4.mo2722h(r5, r7)
            float r3 = -r3
            r2.f2347b = r3
            r1.mo2739c(r2)
        L_0x07d1:
            r1 = 0
            r0.f2432l = r1
            r0.f2434m = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.mo2792e(androidx.constraintlayout.core.c, boolean):void");
    }

    /* renamed from: f */
    public boolean mo2793f() {
        return this.f2429j0 != 8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x01b7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x03db  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x03fe  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x041f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x046c  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x047f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x04a1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x04c5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:355:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:359:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00db  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2794g(androidx.constraintlayout.core.C0680c r30, boolean r31, boolean r32, boolean r33, boolean r34, androidx.constraintlayout.core.SolverVariable r35, androidx.constraintlayout.core.SolverVariable r36, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r37, boolean r38, androidx.constraintlayout.core.widgets.ConstraintAnchor r39, androidx.constraintlayout.core.widgets.ConstraintAnchor r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, int r51, int r52, int r53, int r54, float r55, boolean r56) {
        /*
            r29 = this;
            r0 = r29
            r10 = r30
            r11 = r35
            r12 = r36
            r13 = r39
            r14 = r40
            r15 = r43
            r1 = r44
            r2 = r52
            r3 = r53
            r4 = r54
            r5 = r55
            androidx.constraintlayout.core.SolverVariable r9 = r10.mo2747k(r13)
            androidx.constraintlayout.core.SolverVariable r8 = r10.mo2747k(r14)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r13.f2379f
            androidx.constraintlayout.core.SolverVariable r7 = r10.mo2747k(r6)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r14.f2379f
            androidx.constraintlayout.core.SolverVariable r6 = r10.mo2747k(r6)
            boolean r16 = r39.mo2767h()
            boolean r17 = r40.mo2767h()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r0.f2401R
            boolean r12 = r12.mo2767h()
            if (r17 == 0) goto L_0x003f
            int r18 = r16 + 1
            goto L_0x0041
        L_0x003f:
            r18 = r16
        L_0x0041:
            if (r12 == 0) goto L_0x0045
            int r18 = r18 + 1
        L_0x0045:
            r2 = r18
            if (r46 == 0) goto L_0x004c
            r19 = 3
            goto L_0x004e
        L_0x004c:
            r19 = r51
        L_0x004e:
            int[] r18 = androidx.constraintlayout.core.widgets.ConstraintWidget.C0686a.f2459b
            int r20 = r37.ordinal()
            r14 = r18[r20]
            r11 = 1
            r18 = r6
            if (r14 == r11) goto L_0x006e
            r11 = 2
            if (r14 == r11) goto L_0x006e
            r11 = 3
            if (r14 == r11) goto L_0x006e
            r11 = 4
            if (r14 == r11) goto L_0x0067
            r14 = r19
            goto L_0x0071
        L_0x0067:
            r14 = r19
            if (r14 == r11) goto L_0x0071
            r19 = 1
            goto L_0x0073
        L_0x006e:
            r14 = r19
            r11 = 4
        L_0x0071:
            r19 = 0
        L_0x0073:
            int r11 = r0.f2426i
            r6 = -1
            if (r11 == r6) goto L_0x0080
            if (r31 == 0) goto L_0x0080
            r0.f2426i = r6
            r42 = r11
            r19 = 0
        L_0x0080:
            int r11 = r0.f2428j
            if (r11 == r6) goto L_0x008b
            if (r31 != 0) goto L_0x008b
            r0.f2428j = r6
            r19 = 0
            goto L_0x008d
        L_0x008b:
            r11 = r42
        L_0x008d:
            int r6 = r0.f2429j0
            r42 = r11
            r11 = 8
            if (r6 != r11) goto L_0x0099
            r6 = 0
            r19 = 0
            goto L_0x009b
        L_0x0099:
            r6 = r42
        L_0x009b:
            if (r56 == 0) goto L_0x00b9
            if (r16 != 0) goto L_0x00a9
            if (r17 != 0) goto L_0x00a9
            if (r12 != 0) goto L_0x00a9
            r11 = r41
            r10.mo2740d(r9, r11)
            goto L_0x00b9
        L_0x00a9:
            if (r16 == 0) goto L_0x00b9
            if (r17 != 0) goto L_0x00b9
            int r11 = r39.mo2764e()
            r23 = r12
            r12 = 8
            r10.mo2741e(r9, r7, r11, r12)
            goto L_0x00bd
        L_0x00b9:
            r23 = r12
            r12 = 8
        L_0x00bd:
            if (r19 != 0) goto L_0x00db
            if (r38 == 0) goto L_0x00d4
            r5 = 3
            r11 = 0
            r10.mo2741e(r8, r9, r11, r5)
            if (r15 <= 0) goto L_0x00cb
            r10.mo2742f(r8, r9, r15, r12)
        L_0x00cb:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r6) goto L_0x00d8
            r10.mo2743g(r8, r9, r1, r12)
            goto L_0x00d8
        L_0x00d4:
            r5 = 3
            r10.mo2741e(r8, r9, r6, r12)
        L_0x00d8:
            r1 = 3
            goto L_0x0145
        L_0x00db:
            r1 = 3
            r11 = 2
            if (r2 == r11) goto L_0x00f8
            if (r46 != 0) goto L_0x00f8
            r11 = 1
            if (r14 == r11) goto L_0x00e6
            if (r14 != 0) goto L_0x00f8
        L_0x00e6:
            int r5 = java.lang.Math.max(r3, r6)
            if (r4 <= 0) goto L_0x00f0
            int r5 = java.lang.Math.min(r4, r5)
        L_0x00f0:
            r6 = 8
            r10.mo2741e(r8, r9, r5, r6)
            r19 = 0
            goto L_0x0145
        L_0x00f8:
            r11 = -2
            if (r3 != r11) goto L_0x00fc
            r3 = r6
        L_0x00fc:
            if (r4 != r11) goto L_0x00ff
            r4 = r6
        L_0x00ff:
            if (r6 <= 0) goto L_0x0105
            r11 = 1
            if (r14 == r11) goto L_0x0105
            r6 = 0
        L_0x0105:
            if (r3 <= 0) goto L_0x0110
            r11 = 8
            r10.mo2742f(r8, r9, r3, r11)
            int r6 = java.lang.Math.max(r6, r3)
        L_0x0110:
            if (r4 <= 0) goto L_0x0129
            if (r32 == 0) goto L_0x0119
            r11 = 1
            if (r14 != r11) goto L_0x0119
            r11 = 0
            goto L_0x011a
        L_0x0119:
            r11 = 1
        L_0x011a:
            if (r11 == 0) goto L_0x0122
            r11 = 8
            r10.mo2743g(r8, r9, r4, r11)
            goto L_0x0124
        L_0x0122:
            r11 = 8
        L_0x0124:
            int r6 = java.lang.Math.min(r6, r4)
            goto L_0x012b
        L_0x0129:
            r11 = 8
        L_0x012b:
            r12 = 1
            if (r14 != r12) goto L_0x014b
            if (r32 == 0) goto L_0x0134
            r10.mo2741e(r8, r9, r6, r11)
            goto L_0x0145
        L_0x0134:
            if (r48 == 0) goto L_0x013e
            r5 = 5
            r10.mo2741e(r8, r9, r6, r5)
            r10.mo2743g(r8, r9, r6, r11)
            goto L_0x0145
        L_0x013e:
            r5 = 5
            r10.mo2741e(r8, r9, r6, r5)
            r10.mo2743g(r8, r9, r6, r11)
        L_0x0145:
            r11 = r34
            r24 = r2
        L_0x0149:
            r12 = r3
            goto L_0x01b5
        L_0x014b:
            r6 = 2
            if (r14 != r6) goto L_0x01b1
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r11 = r13.f2378e
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r12 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            if (r11 == r12) goto L_0x0172
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            if (r11 != r1) goto L_0x0159
            goto L_0x0172
        L_0x0159:
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.f2406W
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r11 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mo2800m(r11)
            androidx.constraintlayout.core.SolverVariable r1 = r10.mo2747k(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r0.f2406W
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r12 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r11.mo2800m(r12)
            androidx.constraintlayout.core.SolverVariable r11 = r10.mo2747k(r11)
            goto L_0x0188
        L_0x0172:
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.f2406W
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mo2800m(r12)
            androidx.constraintlayout.core.SolverVariable r1 = r10.mo2747k(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r0.f2406W
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r12 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r11.mo2800m(r12)
            androidx.constraintlayout.core.SolverVariable r11 = r10.mo2747k(r11)
        L_0x0188:
            androidx.constraintlayout.core.b r12 = r30.mo2748l()
            androidx.constraintlayout.core.b$a r6 = r12.f2349d
            r24 = r2
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6.mo2722h(r8, r2)
            androidx.constraintlayout.core.b$a r2 = r12.f2349d
            r6 = 1065353216(0x3f800000, float:1.0)
            r2.mo2722h(r9, r6)
            androidx.constraintlayout.core.b$a r2 = r12.f2349d
            r2.mo2722h(r11, r5)
            androidx.constraintlayout.core.b$a r2 = r12.f2349d
            float r5 = -r5
            r2.mo2722h(r1, r5)
            r10.mo2739c(r12)
            if (r32 == 0) goto L_0x01ae
            r19 = 0
        L_0x01ae:
            r11 = r34
            goto L_0x0149
        L_0x01b1:
            r24 = r2
            r12 = r3
            r11 = 1
        L_0x01b5:
            if (r56 == 0) goto L_0x04b7
            if (r48 == 0) goto L_0x01bb
            goto L_0x04b7
        L_0x01bb:
            if (r16 != 0) goto L_0x01c5
            if (r17 != 0) goto L_0x01c5
            if (r23 != 0) goto L_0x01c5
            r6 = r18
        L_0x01c3:
            r5 = 0
            goto L_0x01fd
        L_0x01c5:
            if (r16 == 0) goto L_0x01e4
            if (r17 != 0) goto L_0x01e4
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r13.f2379f
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.f2377d
            if (r32 == 0) goto L_0x01d6
            boolean r1 = r1 instanceof androidx.constraintlayout.core.widgets.C0687a
            if (r1 == 0) goto L_0x01d6
            r1 = 8
            goto L_0x01d7
        L_0x01d6:
            r1 = 5
        L_0x01d7:
            r22 = r32
            r15 = r40
            r3 = r8
            r34 = r11
            r4 = 0
            r11 = r1
            r1 = r18
            goto L_0x049f
        L_0x01e4:
            if (r16 != 0) goto L_0x0207
            if (r17 == 0) goto L_0x0207
            int r1 = r40.mo2764e()
            int r1 = -r1
            r6 = r18
            r2 = 8
            r10.mo2741e(r8, r6, r1, r2)
            if (r32 == 0) goto L_0x01c3
            r3 = r35
            r1 = 5
            r5 = 0
            r10.mo2742f(r9, r3, r5, r1)
        L_0x01fd:
            r15 = r40
            r1 = r6
            r3 = r8
            r34 = r11
            r2 = 5
            r4 = 0
            goto L_0x049c
        L_0x0207:
            r3 = r35
            r6 = r18
            r1 = 2
            r5 = 0
            if (r16 == 0) goto L_0x01fd
            if (r17 == 0) goto L_0x01fd
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r13.f2379f
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.f2377d
            r1 = r40
            r13 = 3
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r1.f2379f
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f2377d
            androidx.constraintlayout.core.widgets.ConstraintWidget r13 = r0.f2406W
            r16 = 6
            if (r19 == 0) goto L_0x0304
            if (r14 != 0) goto L_0x0275
            if (r4 != 0) goto L_0x024d
            if (r12 != 0) goto L_0x024d
            boolean r4 = r7.f2329g
            if (r4 == 0) goto L_0x0242
            boolean r4 = r6.f2329g
            if (r4 == 0) goto L_0x0242
            int r2 = r39.mo2764e()
            r3 = 8
            r10.mo2741e(r9, r7, r2, r3)
            int r1 = r40.mo2764e()
            int r1 = -r1
            r10.mo2741e(r8, r6, r1, r3)
            return
        L_0x0242:
            r31 = 8
            r17 = 8
            r18 = 0
            r22 = 1
            r23 = 0
            goto L_0x0257
        L_0x024d:
            r31 = 5
            r17 = 5
            r18 = 1
            r22 = 0
            r23 = 1
        L_0x0257:
            boolean r4 = r2 instanceof androidx.constraintlayout.core.widgets.C0687a
            if (r4 != 0) goto L_0x0263
            boolean r4 = r5 instanceof androidx.constraintlayout.core.widgets.C0687a
            if (r4 == 0) goto L_0x0260
            goto L_0x0263
        L_0x0260:
            r4 = r31
            goto L_0x0264
        L_0x0263:
            r4 = 4
        L_0x0264:
            r15 = r4
            r4 = r17
            r24 = 6
            r17 = r14
            r14 = r36
            r28 = r22
            r22 = r18
            r18 = r28
            goto L_0x0355
        L_0x0275:
            r15 = 2
            if (r14 != r15) goto L_0x028c
            boolean r4 = r2 instanceof androidx.constraintlayout.core.widgets.C0687a
            if (r4 != 0) goto L_0x0288
            boolean r4 = r5 instanceof androidx.constraintlayout.core.widgets.C0687a
            if (r4 == 0) goto L_0x0281
            goto L_0x0288
        L_0x0281:
            r17 = r14
            r4 = 5
            r14 = r36
            goto L_0x0349
        L_0x0288:
            r17 = r14
            goto L_0x0346
        L_0x028c:
            r15 = 1
            if (r14 != r15) goto L_0x0298
            r17 = r14
            r4 = 8
            r15 = 4
            r14 = r36
            goto L_0x034b
        L_0x0298:
            r15 = 3
            if (r14 != r15) goto L_0x02f9
            int r15 = r0.f2385B
            r17 = r14
            r14 = -1
            if (r15 != r14) goto L_0x02b1
            if (r49 == 0) goto L_0x02aa
            if (r32 == 0) goto L_0x02a8
            r4 = 5
            goto L_0x02ac
        L_0x02a8:
            r4 = 4
            goto L_0x02ac
        L_0x02aa:
            r4 = 8
        L_0x02ac:
            r15 = r4
            r4 = 5
            r14 = 8
            goto L_0x02ec
        L_0x02b1:
            if (r46 == 0) goto L_0x02d2
            r14 = r52
            r15 = 2
            if (r14 == r15) goto L_0x02be
            r4 = 1
            if (r14 != r4) goto L_0x02bc
            goto L_0x02be
        L_0x02bc:
            r4 = 0
            goto L_0x02bf
        L_0x02be:
            r4 = 1
        L_0x02bf:
            if (r4 != 0) goto L_0x02c5
            r4 = 5
            r14 = 8
            goto L_0x02c7
        L_0x02c5:
            r4 = 4
            r14 = 5
        L_0x02c7:
            r15 = r4
            r4 = r14
            r18 = 1
            r22 = 1
            r23 = 1
            r24 = 6
            goto L_0x02f6
        L_0x02d2:
            if (r4 <= 0) goto L_0x02d6
            r4 = 5
            goto L_0x02ea
        L_0x02d6:
            if (r4 != 0) goto L_0x02e9
            if (r12 != 0) goto L_0x02e9
            if (r49 != 0) goto L_0x02df
            r4 = 8
            goto L_0x02ea
        L_0x02df:
            if (r2 == r13) goto L_0x02e5
            if (r5 == r13) goto L_0x02e5
            r4 = 4
            goto L_0x02e6
        L_0x02e5:
            r4 = 5
        L_0x02e6:
            r14 = r4
            r4 = 4
            goto L_0x02eb
        L_0x02e9:
            r4 = 4
        L_0x02ea:
            r14 = 5
        L_0x02eb:
            r15 = 6
        L_0x02ec:
            r24 = r15
            r18 = 1
            r22 = 1
            r23 = 1
            r15 = r4
            r4 = r14
        L_0x02f6:
            r14 = r36
            goto L_0x0355
        L_0x02f9:
            r17 = r14
            r14 = r36
            r4 = 5
            r15 = 4
            r18 = 0
            r22 = 0
            goto L_0x034f
        L_0x0304:
            r17 = r14
            boolean r4 = r7.f2329g
            if (r4 == 0) goto L_0x0346
            boolean r4 = r6.f2329g
            if (r4 == 0) goto L_0x0346
            int r2 = r39.mo2764e()
            int r3 = r40.mo2764e()
            r4 = 8
            r46 = r30
            r47 = r9
            r48 = r7
            r49 = r2
            r50 = r45
            r51 = r6
            r52 = r8
            r53 = r3
            r54 = r4
            r46.mo2738b(r47, r48, r49, r50, r51, r52, r53, r54)
            if (r32 == 0) goto L_0x0345
            if (r11 == 0) goto L_0x0345
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.f2379f
            if (r2 == 0) goto L_0x033c
            int r1 = r40.mo2764e()
            r14 = r36
            goto L_0x033f
        L_0x033c:
            r14 = r36
            r1 = 0
        L_0x033f:
            if (r6 == r14) goto L_0x0345
            r2 = 5
            r10.mo2742f(r14, r8, r1, r2)
        L_0x0345:
            return
        L_0x0346:
            r14 = r36
            r4 = 4
        L_0x0349:
            r15 = r4
            r4 = 5
        L_0x034b:
            r18 = 1
            r22 = 1
        L_0x034f:
            r23 = r18
            r18 = 0
            r24 = 6
        L_0x0355:
            if (r23 == 0) goto L_0x0360
            if (r7 != r6) goto L_0x0360
            if (r2 == r13) goto L_0x0360
            r23 = 0
            r25 = 0
            goto L_0x0364
        L_0x0360:
            r25 = r23
            r23 = 1
        L_0x0364:
            if (r22 == 0) goto L_0x03af
            if (r19 != 0) goto L_0x0379
            if (r47 != 0) goto L_0x0379
            if (r49 != 0) goto L_0x0379
            if (r7 != r3) goto L_0x0379
            if (r6 != r14) goto L_0x0379
            r22 = 0
            r23 = 8
            r24 = 8
            r26 = 0
            goto L_0x037f
        L_0x0379:
            r22 = r32
            r26 = r23
            r23 = r4
        L_0x037f:
            int r4 = r39.mo2764e()
            int r27 = r40.mo2764e()
            r31 = r15
            r15 = r1
            r1 = r30
            r14 = r2
            r2 = r9
            r34 = r11
            r11 = r3
            r3 = r7
            r37 = r12
            r21 = 0
            r12 = r5
            r5 = r45
            r38 = r6
            r11 = r7
            r7 = r8
            r21 = r13
            r13 = r8
            r8 = r27
            r27 = r13
            r13 = r9
            r9 = r24
            r1.mo2738b(r2, r3, r4, r5, r6, r7, r8, r9)
            r4 = r23
            r23 = r26
            goto L_0x03c2
        L_0x03af:
            r14 = r2
            r38 = r6
            r27 = r8
            r34 = r11
            r37 = r12
            r21 = r13
            r31 = r15
            r15 = r1
            r12 = r5
            r11 = r7
            r13 = r9
            r22 = r32
        L_0x03c2:
            int r1 = r0.f2429j0
            r2 = 8
            if (r1 != r2) goto L_0x03d9
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r1 = r15.f2374a
            if (r1 != 0) goto L_0x03cd
            goto L_0x03d5
        L_0x03cd:
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x03d5
            r6 = 1
            goto L_0x03d6
        L_0x03d5:
            r6 = 0
        L_0x03d6:
            if (r6 != 0) goto L_0x03d9
            return
        L_0x03d9:
            if (r25 == 0) goto L_0x03fe
            r1 = r38
            if (r22 == 0) goto L_0x03ec
            if (r11 == r1) goto L_0x03ec
            if (r19 != 0) goto L_0x03ec
            boolean r2 = r14 instanceof androidx.constraintlayout.core.widgets.C0687a
            if (r2 != 0) goto L_0x03eb
            boolean r2 = r12 instanceof androidx.constraintlayout.core.widgets.C0687a
            if (r2 == 0) goto L_0x03ec
        L_0x03eb:
            r4 = 6
        L_0x03ec:
            int r2 = r39.mo2764e()
            r10.mo2742f(r13, r11, r2, r4)
            int r2 = r40.mo2764e()
            int r2 = -r2
            r3 = r27
            r10.mo2743g(r3, r1, r2, r4)
            goto L_0x0402
        L_0x03fe:
            r1 = r38
            r3 = r27
        L_0x0402:
            if (r22 == 0) goto L_0x0417
            if (r50 == 0) goto L_0x0417
            boolean r2 = r14 instanceof androidx.constraintlayout.core.widgets.C0687a
            if (r2 != 0) goto L_0x0417
            boolean r2 = r12 instanceof androidx.constraintlayout.core.widgets.C0687a
            if (r2 != 0) goto L_0x0417
            r2 = r21
            if (r12 == r2) goto L_0x0419
            r4 = 6
            r5 = 6
            r20 = 1
            goto L_0x041d
        L_0x0417:
            r2 = r21
        L_0x0419:
            r5 = r31
            r20 = r23
        L_0x041d:
            if (r20 == 0) goto L_0x046a
            if (r18 == 0) goto L_0x044a
            if (r49 == 0) goto L_0x0425
            if (r33 == 0) goto L_0x044a
        L_0x0425:
            if (r14 == r2) goto L_0x042c
            if (r12 != r2) goto L_0x042a
            goto L_0x042c
        L_0x042a:
            r16 = r5
        L_0x042c:
            boolean r6 = r14 instanceof androidx.constraintlayout.core.widgets.C0700f
            if (r6 != 0) goto L_0x0434
            boolean r6 = r12 instanceof androidx.constraintlayout.core.widgets.C0700f
            if (r6 == 0) goto L_0x0436
        L_0x0434:
            r16 = 5
        L_0x0436:
            boolean r6 = r14 instanceof androidx.constraintlayout.core.widgets.C0687a
            if (r6 != 0) goto L_0x043e
            boolean r6 = r12 instanceof androidx.constraintlayout.core.widgets.C0687a
            if (r6 == 0) goto L_0x0440
        L_0x043e:
            r16 = 5
        L_0x0440:
            if (r49 == 0) goto L_0x0444
            r6 = 5
            goto L_0x0446
        L_0x0444:
            r6 = r16
        L_0x0446:
            int r5 = java.lang.Math.max(r6, r5)
        L_0x044a:
            if (r22 == 0) goto L_0x045a
            int r4 = java.lang.Math.min(r4, r5)
            if (r46 == 0) goto L_0x045b
            if (r49 != 0) goto L_0x045b
            if (r14 == r2) goto L_0x0458
            if (r12 != r2) goto L_0x045b
        L_0x0458:
            r4 = 4
            goto L_0x045b
        L_0x045a:
            r4 = r5
        L_0x045b:
            int r2 = r39.mo2764e()
            r10.mo2741e(r13, r11, r2, r4)
            int r2 = r40.mo2764e()
            int r2 = -r2
            r10.mo2741e(r3, r1, r2, r4)
        L_0x046a:
            if (r22 == 0) goto L_0x047d
            r2 = r35
            r4 = r11
            if (r2 != r4) goto L_0x0476
            int r6 = r39.mo2764e()
            goto L_0x0477
        L_0x0476:
            r6 = 0
        L_0x0477:
            if (r4 == r2) goto L_0x047d
            r4 = 5
            r10.mo2742f(r13, r2, r6, r4)
        L_0x047d:
            if (r22 == 0) goto L_0x0499
            if (r19 == 0) goto L_0x0499
            if (r43 != 0) goto L_0x0499
            if (r37 != 0) goto L_0x0499
            if (r19 == 0) goto L_0x0493
            r14 = r17
            r2 = 3
            if (r14 != r2) goto L_0x0493
            r2 = 8
            r4 = 0
            r10.mo2742f(r3, r13, r4, r2)
            goto L_0x049e
        L_0x0493:
            r4 = 0
            r2 = 5
            r10.mo2742f(r3, r13, r4, r2)
            goto L_0x049e
        L_0x0499:
            r2 = 5
            r4 = 0
            goto L_0x049e
        L_0x049c:
            r22 = r32
        L_0x049e:
            r11 = 5
        L_0x049f:
            if (r22 == 0) goto L_0x04b6
            if (r34 == 0) goto L_0x04b6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.f2379f
            if (r2 == 0) goto L_0x04ae
            int r6 = r40.mo2764e()
            r5 = r36
            goto L_0x04b1
        L_0x04ae:
            r5 = r36
            r6 = 0
        L_0x04b1:
            if (r1 == r5) goto L_0x04b6
            r10.mo2742f(r5, r3, r6, r11)
        L_0x04b6:
            return
        L_0x04b7:
            r2 = r35
            r5 = r36
            r3 = r8
            r13 = r9
            r34 = r11
            r1 = r24
            r4 = 0
            r6 = 2
            if (r1 >= r6) goto L_0x0504
            if (r32 == 0) goto L_0x0504
            if (r34 == 0) goto L_0x0504
            r1 = 8
            r10.mo2742f(r13, r2, r4, r1)
            if (r31 != 0) goto L_0x04d9
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f2398O
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f2379f
            if (r1 != 0) goto L_0x04d7
            goto L_0x04d9
        L_0x04d7:
            r6 = 0
            goto L_0x04da
        L_0x04d9:
            r6 = 1
        L_0x04da:
            if (r31 != 0) goto L_0x04fc
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f2398O
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f2379f
            if (r1 == 0) goto L_0x04fc
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.f2377d
            float r2 = r1.f2409Z
            r6 = 0
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x04fa
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r1.f2405V
            r2 = r1[r4]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r6) goto L_0x04fa
            r2 = 1
            r1 = r1[r2]
            if (r1 != r6) goto L_0x04fa
            r11 = 1
            goto L_0x04fd
        L_0x04fa:
            r11 = 0
            goto L_0x04fd
        L_0x04fc:
            r11 = r6
        L_0x04fd:
            if (r11 == 0) goto L_0x0504
            r1 = 8
            r10.mo2742f(r5, r3, r4, r1)
        L_0x0504:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.mo2794g(androidx.constraintlayout.core.c, boolean, boolean, boolean, boolean, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.core.widgets.ConstraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* renamed from: h */
    public final void mo2795h(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i) {
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        boolean z;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.CENTER;
        if (type != type5) {
            ConstraintAnchor.Type type6 = ConstraintAnchor.Type.CENTER_X;
            if (type == type6 && (type2 == (type4 = ConstraintAnchor.Type.LEFT) || type2 == ConstraintAnchor.Type.RIGHT)) {
                ConstraintAnchor m = mo2800m(type4);
                ConstraintAnchor m2 = constraintWidget.mo2800m(type2);
                ConstraintAnchor m3 = mo2800m(ConstraintAnchor.Type.RIGHT);
                m.mo2760a(m2, 0);
                m3.mo2760a(m2, 0);
                mo2800m(type6).mo2760a(m2, 0);
                return;
            }
            ConstraintAnchor.Type type7 = ConstraintAnchor.Type.CENTER_Y;
            if (type == type7 && (type2 == (type3 = ConstraintAnchor.Type.TOP) || type2 == ConstraintAnchor.Type.BOTTOM)) {
                ConstraintAnchor m4 = constraintWidget.mo2800m(type2);
                mo2800m(type3).mo2760a(m4, 0);
                mo2800m(ConstraintAnchor.Type.BOTTOM).mo2760a(m4, 0);
                mo2800m(type7).mo2760a(m4, 0);
            } else if (type == type6 && type2 == type6) {
                ConstraintAnchor.Type type8 = ConstraintAnchor.Type.LEFT;
                mo2800m(type8).mo2760a(constraintWidget.mo2800m(type8), 0);
                ConstraintAnchor.Type type9 = ConstraintAnchor.Type.RIGHT;
                mo2800m(type9).mo2760a(constraintWidget.mo2800m(type9), 0);
                mo2800m(type6).mo2760a(constraintWidget.mo2800m(type2), 0);
            } else if (type == type7 && type2 == type7) {
                ConstraintAnchor.Type type10 = ConstraintAnchor.Type.TOP;
                mo2800m(type10).mo2760a(constraintWidget.mo2800m(type10), 0);
                ConstraintAnchor.Type type11 = ConstraintAnchor.Type.BOTTOM;
                mo2800m(type11).mo2760a(constraintWidget.mo2800m(type11), 0);
                mo2800m(type7).mo2760a(constraintWidget.mo2800m(type2), 0);
            } else {
                ConstraintAnchor m5 = mo2800m(type);
                ConstraintAnchor m6 = constraintWidget.mo2800m(type2);
                if (m5.mo2768i(m6)) {
                    ConstraintAnchor.Type type12 = ConstraintAnchor.Type.BASELINE;
                    if (type == type12) {
                        ConstraintAnchor m7 = mo2800m(ConstraintAnchor.Type.TOP);
                        ConstraintAnchor m8 = mo2800m(ConstraintAnchor.Type.BOTTOM);
                        if (m7 != null) {
                            m7.mo2769j();
                        }
                        if (m8 != null) {
                            m8.mo2769j();
                        }
                    } else if (type == ConstraintAnchor.Type.TOP || type == ConstraintAnchor.Type.BOTTOM) {
                        ConstraintAnchor m9 = mo2800m(type12);
                        if (m9 != null) {
                            m9.mo2769j();
                        }
                        ConstraintAnchor m11 = mo2800m(type5);
                        if (m11.f2379f != m6) {
                            m11.mo2769j();
                        }
                        ConstraintAnchor f = mo2800m(type).mo2765f();
                        ConstraintAnchor m12 = mo2800m(type7);
                        if (m12.mo2767h()) {
                            f.mo2769j();
                            m12.mo2769j();
                        }
                    } else if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                        ConstraintAnchor m13 = mo2800m(type5);
                        if (m13.f2379f != m6) {
                            m13.mo2769j();
                        }
                        ConstraintAnchor f2 = mo2800m(type).mo2765f();
                        ConstraintAnchor m14 = mo2800m(type6);
                        if (m14.mo2767h()) {
                            f2.mo2769j();
                            m14.mo2769j();
                        }
                    }
                    m5.mo2760a(m6, i);
                }
            }
        } else if (type2 == type5) {
            ConstraintAnchor.Type type13 = ConstraintAnchor.Type.LEFT;
            ConstraintAnchor m15 = mo2800m(type13);
            ConstraintAnchor.Type type14 = ConstraintAnchor.Type.RIGHT;
            ConstraintAnchor m16 = mo2800m(type14);
            ConstraintAnchor.Type type15 = ConstraintAnchor.Type.TOP;
            ConstraintAnchor m17 = mo2800m(type15);
            ConstraintAnchor.Type type16 = ConstraintAnchor.Type.BOTTOM;
            ConstraintAnchor m18 = mo2800m(type16);
            boolean z2 = true;
            if ((m15 == null || !m15.mo2767h()) && (m16 == null || !m16.mo2767h())) {
                mo2795h(type13, constraintWidget, type13, 0);
                mo2795h(type14, constraintWidget, type14, 0);
                z = true;
            } else {
                z = false;
            }
            if ((m17 == null || !m17.mo2767h()) && (m18 == null || !m18.mo2767h())) {
                mo2795h(type15, constraintWidget, type15, 0);
                mo2795h(type16, constraintWidget, type16, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                mo2800m(type5).mo2760a(constraintWidget.mo2800m(type5), 0);
            } else if (z) {
                ConstraintAnchor.Type type17 = ConstraintAnchor.Type.CENTER_X;
                mo2800m(type17).mo2760a(constraintWidget.mo2800m(type17), 0);
            } else if (z2) {
                ConstraintAnchor.Type type18 = ConstraintAnchor.Type.CENTER_Y;
                mo2800m(type18).mo2760a(constraintWidget.mo2800m(type18), 0);
            }
        } else {
            ConstraintAnchor.Type type19 = ConstraintAnchor.Type.LEFT;
            if (type2 == type19 || type2 == ConstraintAnchor.Type.RIGHT) {
                mo2795h(type19, constraintWidget, type2, 0);
                mo2795h(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
                mo2800m(type5).mo2760a(constraintWidget.mo2800m(type2), 0);
                return;
            }
            ConstraintAnchor.Type type20 = ConstraintAnchor.Type.TOP;
            if (type2 == type20 || type2 == ConstraintAnchor.Type.BOTTOM) {
                mo2795h(type20, constraintWidget, type2, 0);
                mo2795h(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                mo2800m(type5).mo2760a(constraintWidget.mo2800m(type2), 0);
            }
        }
    }

    /* renamed from: i */
    public final void mo2796i(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        if (constraintAnchor.f2377d == this) {
            mo2795h(constraintAnchor.f2378e, constraintAnchor2.f2377d, constraintAnchor2.f2378e, i);
        }
    }

    /* renamed from: j */
    public void mo2797j(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        this.f2440p = constraintWidget.f2440p;
        this.f2442q = constraintWidget.f2442q;
        this.f2446s = constraintWidget.f2446s;
        this.f2448t = constraintWidget.f2448t;
        int[] iArr = this.f2450u;
        int[] iArr2 = constraintWidget.f2450u;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.f2452v = constraintWidget.f2452v;
        this.f2454w = constraintWidget.f2454w;
        this.f2456y = constraintWidget.f2456y;
        this.f2457z = constraintWidget.f2457z;
        this.f2384A = constraintWidget.f2384A;
        this.f2385B = constraintWidget.f2385B;
        this.f2386C = constraintWidget.f2386C;
        int[] iArr3 = constraintWidget.f2387D;
        this.f2387D = Arrays.copyOf(iArr3, iArr3.length);
        this.f2388E = constraintWidget.f2388E;
        this.f2389F = constraintWidget.f2389F;
        this.f2390G = constraintWidget.f2390G;
        this.f2394K.mo2769j();
        this.f2395L.mo2769j();
        this.f2396M.mo2769j();
        this.f2397N.mo2769j();
        this.f2398O.mo2769j();
        this.f2399P.mo2769j();
        this.f2400Q.mo2769j();
        this.f2401R.mo2769j();
        this.f2405V = (DimensionBehaviour[]) Arrays.copyOf(this.f2405V, 2);
        ConstraintWidget constraintWidget4 = null;
        if (this.f2406W == null) {
            constraintWidget2 = null;
        } else {
            constraintWidget2 = hashMap.get(constraintWidget.f2406W);
        }
        this.f2406W = constraintWidget2;
        this.f2407X = constraintWidget.f2407X;
        this.f2408Y = constraintWidget.f2408Y;
        this.f2409Z = constraintWidget.f2409Z;
        this.f2411a0 = constraintWidget.f2411a0;
        this.f2413b0 = constraintWidget.f2413b0;
        this.f2415c0 = constraintWidget.f2415c0;
        this.f2417d0 = constraintWidget.f2417d0;
        this.f2419e0 = constraintWidget.f2419e0;
        this.f2421f0 = constraintWidget.f2421f0;
        this.f2423g0 = constraintWidget.f2423g0;
        this.f2425h0 = constraintWidget.f2425h0;
        this.f2427i0 = constraintWidget.f2427i0;
        this.f2429j0 = constraintWidget.f2429j0;
        this.f2431k0 = constraintWidget.f2431k0;
        this.f2433l0 = constraintWidget.f2433l0;
        this.f2435m0 = constraintWidget.f2435m0;
        this.f2437n0 = constraintWidget.f2437n0;
        this.f2439o0 = constraintWidget.f2439o0;
        float[] fArr = this.f2441p0;
        float[] fArr2 = constraintWidget.f2441p0;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.f2443q0;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.f2443q0;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.f2445r0;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.f2445r0;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget5 = constraintWidget.f2447s0;
        if (constraintWidget5 == null) {
            constraintWidget3 = null;
        } else {
            constraintWidget3 = hashMap.get(constraintWidget5);
        }
        this.f2447s0 = constraintWidget3;
        ConstraintWidget constraintWidget6 = constraintWidget.f2449t0;
        if (constraintWidget6 != null) {
            constraintWidget4 = hashMap.get(constraintWidget6);
        }
        this.f2449t0 = constraintWidget4;
    }

    /* renamed from: k */
    public final void mo2798k(C0680c cVar) {
        cVar.mo2747k(this.f2394K);
        cVar.mo2747k(this.f2395L);
        cVar.mo2747k(this.f2396M);
        cVar.mo2747k(this.f2397N);
        if (this.f2417d0 > 0) {
            cVar.mo2747k(this.f2398O);
        }
    }

    /* renamed from: l */
    public final void mo2799l() {
        if (this.f2416d == null) {
            this.f2416d = new C0691c(this);
        }
        if (this.f2418e == null) {
            this.f2418e = new C0693d(this);
        }
    }

    /* renamed from: m */
    public ConstraintAnchor mo2800m(ConstraintAnchor.Type type) {
        switch (C0686a.f2458a[type.ordinal()]) {
            case 1:
                return this.f2394K;
            case 2:
                return this.f2395L;
            case 3:
                return this.f2396M;
            case 4:
                return this.f2397N;
            case 5:
                return this.f2398O;
            case 6:
                return this.f2401R;
            case 7:
                return this.f2399P;
            case 8:
                return this.f2400Q;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    /* renamed from: n */
    public final DimensionBehaviour mo2801n(int i) {
        if (i == 0) {
            return this.f2405V[0];
        }
        if (i == 1) {
            return this.f2405V[1];
        }
        return null;
    }

    /* renamed from: o */
    public final int mo2802o() {
        if (this.f2429j0 == 8) {
            return 0;
        }
        return this.f2408Y;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.f2397N;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.constraintlayout.core.widgets.ConstraintWidget mo2803p(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.f2396M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.f2379f
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f2379f
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f2377d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.f2397N
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.f2379f
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f2379f
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f2377d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.mo2803p(int):androidx.constraintlayout.core.widgets.ConstraintWidget");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.f2395L;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.constraintlayout.core.widgets.ConstraintWidget mo2804q(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.f2394K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.f2379f
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f2379f
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f2377d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.f2395L
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.f2379f
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f2379f
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f2377d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.mo2804q(int):androidx.constraintlayout.core.widgets.ConstraintWidget");
    }

    /* renamed from: r */
    public void mo2805r(StringBuilder sb) {
        StringBuilder k = C13555b.m33972k("  ");
        k.append(this.f2430k);
        k.append(":{\n");
        sb.append(k.toString());
        sb.append("    actualWidth:" + this.f2407X);
        sb.append("\n");
        sb.append("    actualHeight:" + this.f2408Y);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f2413b0);
        sb.append("\n");
        sb.append("    actualTop:" + this.f2415c0);
        sb.append("\n");
        m1966t(sb, "left", this.f2394K);
        m1966t(sb, "top", this.f2395L);
        m1966t(sb, "right", this.f2396M);
        m1966t(sb, "bottom", this.f2397N);
        m1966t(sb, "baseline", this.f2398O);
        m1966t(sb, "centerX", this.f2399P);
        m1966t(sb, "centerY", this.f2400Q);
        int i = this.f2407X;
        int i2 = this.f2419e0;
        int i3 = this.f2387D[0];
        int i4 = this.f2452v;
        int i5 = this.f2446s;
        float f = this.f2455x;
        float f2 = this.f2441p0[0];
        m1965s(sb, "    width", i, i2, i3, i4, i5, f);
        int i6 = this.f2408Y;
        int i7 = this.f2421f0;
        int i8 = this.f2387D[1];
        int i9 = this.f2456y;
        int i11 = this.f2448t;
        float f3 = this.f2384A;
        float f4 = this.f2441p0[1];
        m1965s(sb, "    height", i6, i7, i8, i9, i11, f3);
        float f5 = this.f2409Z;
        int i12 = this.f2411a0;
        if (f5 != BitmapDescriptorFactory.HUE_RED) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            C0016g.m42z(sb, i12, "", "],\n");
        }
        m1964L(sb, "    horizontalBias", this.f2423g0, 0.5f);
        m1964L(sb, "    verticalBias", this.f2425h0, 0.5f);
        m1963K(this.f2437n0, 0, "    horizontalChainStyle", sb);
        m1963K(this.f2439o0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f2435m0 != null) {
            str = C0016g.m31o(C13555b.m33972k("type: "), this.f2435m0, " ");
        } else {
            str = str2;
        }
        sb.append(str);
        if (this.f2433l0 != null) {
            str2 = C0016g.m31o(C13555b.m33972k("id: "), this.f2433l0, " ");
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f2413b0);
        sb.append(", ");
        sb.append(this.f2415c0);
        sb.append(") - (");
        sb.append(this.f2407X);
        sb.append(" x ");
        return C13437d.m33707l(sb, this.f2408Y, ")");
    }

    /* renamed from: u */
    public final int mo2807u() {
        if (this.f2429j0 == 8) {
            return 0;
        }
        return this.f2407X;
    }

    /* renamed from: v */
    public final int mo2808v() {
        ConstraintWidget constraintWidget = this.f2406W;
        if (constraintWidget == null || !(constraintWidget instanceof C0697d)) {
            return this.f2413b0;
        }
        return ((C0697d) constraintWidget).f2513D0 + this.f2413b0;
    }

    /* renamed from: w */
    public final int mo2809w() {
        ConstraintWidget constraintWidget = this.f2406W;
        if (constraintWidget == null || !(constraintWidget instanceof C0697d)) {
            return this.f2415c0;
        }
        return ((C0697d) constraintWidget).f2514E0 + this.f2415c0;
    }

    /* renamed from: x */
    public final boolean mo2810x(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i == 0) {
            if (this.f2394K.f2379f != null) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (this.f2396M.f2379f != null) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (i5 + i6 < 2) {
                return true;
            }
            return false;
        }
        if (this.f2395L.f2379f != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.f2397N.f2379f != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i7 = i2 + i3;
        if (this.f2398O.f2379f != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i7 + i4 < 2) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public final boolean mo2811y(int i, int i2) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i == 0) {
            ConstraintAnchor constraintAnchor3 = this.f2394K.f2379f;
            if (constraintAnchor3 != null && constraintAnchor3.f2376c && (constraintAnchor2 = this.f2396M.f2379f) != null && constraintAnchor2.f2376c) {
                if ((constraintAnchor2.mo2763d() - this.f2396M.mo2764e()) - (this.f2394K.mo2764e() + this.f2394K.f2379f.mo2763d()) >= i2) {
                    return true;
                }
                return false;
            }
        } else {
            ConstraintAnchor constraintAnchor4 = this.f2395L.f2379f;
            if (constraintAnchor4 != null && constraintAnchor4.f2376c && (constraintAnchor = this.f2397N.f2379f) != null && constraintAnchor.f2376c) {
                if ((constraintAnchor.mo2763d() - this.f2397N.mo2764e()) - (this.f2395L.mo2764e() + this.f2395L.f2379f.mo2763d()) >= i2) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: z */
    public final void mo2812z(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i, int i2) {
        mo2800m(type).mo2761b(constraintWidget.mo2800m(type2), i, i2, true);
    }
}
