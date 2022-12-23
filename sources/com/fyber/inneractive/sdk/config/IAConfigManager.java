package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.fyber.inneractive.sdk.cache.C2598g;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.config.global.C2634a;
import com.fyber.inneractive.sdk.config.global.C2659l;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.measurement.C2816a;
import com.fyber.inneractive.sdk.network.C2889b0;
import com.fyber.inneractive.sdk.network.C2891c;
import com.fyber.inneractive.sdk.network.C2916m0;
import com.fyber.inneractive.sdk.network.C2938w;
import com.fyber.inneractive.sdk.p048dv.handler.C2722a;
import com.fyber.inneractive.sdk.p048dv.handler.C2725c;
import com.fyber.inneractive.sdk.p048dv.handler.C2727d;
import com.fyber.inneractive.sdk.util.C3704j0;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.C3730t;
import com.fyber.inneractive.sdk.util.C3732u;
import com.fyber.inneractive.sdk.util.C3733u0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class IAConfigManager {

    /* renamed from: J */
    public static final IAConfigManager f9202J = new IAConfigManager();

    /* renamed from: K */
    public static long f9203K;

    /* renamed from: A */
    public final C3704j0 f9204A;

    /* renamed from: B */
    public C2889b0<C2615a> f9205B;

    /* renamed from: C */
    public C2889b0<C2659l> f9206C;

    /* renamed from: D */
    public C2627d f9207D;

    /* renamed from: E */
    public final C2722a f9208E;

    /* renamed from: F */
    public final C2598g f9209F;

    /* renamed from: G */
    public final C2891c f9210G;

    /* renamed from: H */
    public final Map<C3732u, C3730t> f9211H;

    /* renamed from: I */
    public C2816a f9212I;

    /* renamed from: a */
    public Map<String, C2701x> f9213a = new HashMap();

    /* renamed from: b */
    public Map<String, C2702y> f9214b = new HashMap();

    /* renamed from: c */
    public String f9215c;

    /* renamed from: d */
    public String f9216d;

    /* renamed from: e */
    public String f9217e;

    /* renamed from: f */
    public Context f9218f;

    /* renamed from: g */
    public List<OnConfigurationReadyAndValidListener> f9219g;

    /* renamed from: h */
    public boolean f9220h;

    /* renamed from: i */
    public final C2683q f9221i;

    /* renamed from: j */
    public InneractiveUserConfig f9222j;

    /* renamed from: k */
    public String f9223k;

    /* renamed from: l */
    public boolean f9224l;

    /* renamed from: m */
    public String f9225m;

    /* renamed from: n */
    public InneractiveMediationName f9226n;

    /* renamed from: o */
    public String f9227o;

    /* renamed from: p */
    public String f9228p;

    /* renamed from: q */
    public List<String> f9229q;

    /* renamed from: r */
    public boolean f9230r;

    /* renamed from: s */
    public boolean f9231s;

    /* renamed from: t */
    public final C2938w f9232t;

    /* renamed from: u */
    public String f9233u;

    /* renamed from: v */
    public C2668i f9234v;

    /* renamed from: w */
    public C2671j f9235w;

    /* renamed from: x */
    public final C2628d0 f9236x;

    /* renamed from: y */
    public C3733u0 f9237y;

    /* renamed from: z */
    public C2634a f9238z;

    public interface OnConfigurationReadyAndValidListener {
        void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc);
    }

    /* renamed from: com.fyber.inneractive.sdk.config.IAConfigManager$a */
    public static class C2615a {

        /* renamed from: a */
        public String f9239a;

        /* renamed from: b */
        public String f9240b;

        /* renamed from: c */
        public String f9241c;

        /* renamed from: d */
        public String f9242d;

        /* renamed from: e */
        public Map<String, C2701x> f9243e = new HashMap();

        /* renamed from: f */
        public Map<String, C2702y> f9244f = new HashMap();

        /* renamed from: g */
        public C2617c f9245g = new C2617c();
    }

    /* renamed from: com.fyber.inneractive.sdk.config.IAConfigManager$b */
    public static class C2616b extends Exception {
    }

    /* renamed from: com.fyber.inneractive.sdk.config.IAConfigManager$c */
    public static class C2617c {

        /* renamed from: a */
        public Set<Vendor> f9246a = new HashSet();
    }

    public IAConfigManager() {
        C2722a aVar;
        new HashSet();
        this.f9220h = false;
        this.f9221i = new C2683q();
        this.f9224l = false;
        this.f9230r = false;
        this.f9231s = true;
        this.f9232t = new C2938w();
        this.f9233u = "";
        this.f9236x = new C2628d0();
        this.f9204A = new C3704j0();
        if (C3707l.m9962a("com.google.android.gms.ads.MobileAds", "com.google.android.gms.ads.query.QueryInfoGenerationCallback")) {
            aVar = new C2725c();
        } else {
            aVar = new C2727d();
        }
        this.f9208E = aVar;
        this.f9209F = new C2598g();
        this.f9210G = new C2891c();
        this.f9211H = new HashMap();
        this.f9219g = new CopyOnWriteArrayList();
    }

    public static void addListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        f9202J.f9219g.add(onConfigurationReadyAndValidListener);
    }

    /* renamed from: b */
    public static C2668i m6632b() {
        return f9202J.f9234v;
    }

    /* renamed from: c */
    public static C2628d0 m6633c() {
        return f9202J.f9236x;
    }

    /* renamed from: d */
    public static C3733u0 m6634d() {
        return f9202J.f9237y;
    }

    /* renamed from: e */
    public static String m6635e() {
        return f9202J.f9207D.f9274d;
    }

    /* renamed from: f */
    public static boolean m6636f() {
        return f9202J.f9217e != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        m6631a();
        f9202J.f9209F.mo13172a();
        r1 = com.fyber.inneractive.sdk.web.C3790r.f13063c;
        r1.getClass();
        com.fyber.inneractive.sdk.util.C3714n.m9976a(new com.fyber.inneractive.sdk.web.C3789q(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0059, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        if (r3 != false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        if (r2 != false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (r2 == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        r2 = f9202J.f9234v;
        r2.f9339d = false;
        com.fyber.inneractive.sdk.util.C3714n.m9976a(new com.fyber.inneractive.sdk.util.C3711m(r2.f9340e));
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m6637g() {
        /*
            boolean r0 = m6636f()
            int r1 = com.fyber.inneractive.sdk.config.C2630e.f9283a
            r1 = 0
            java.lang.String r2 = java.lang.Boolean.toString(r1)
            java.lang.String r3 = "ia.testEnvironmentConfiguration.forceConfigRefresh"
            java.lang.String r2 = java.lang.System.getProperty(r3, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r2.booleanValue()
            if (r0 == 0) goto L_0x002e
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = f9203K
            long r3 = r3 - r5
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x002b
            r3 = 1
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            if (r3 == 0) goto L_0x0030
        L_0x002e:
            if (r2 == 0) goto L_0x0059
        L_0x0030:
            if (r2 == 0) goto L_0x0042
            com.fyber.inneractive.sdk.config.IAConfigManager r2 = f9202J
            com.fyber.inneractive.sdk.config.i r2 = r2.f9234v
            r2.f9339d = r1
            com.fyber.inneractive.sdk.cache.b r1 = r2.f9340e
            com.fyber.inneractive.sdk.util.m r2 = new com.fyber.inneractive.sdk.util.m
            r2.<init>(r1)
            com.fyber.inneractive.sdk.util.C3714n.m9976a(r2)
        L_0x0042:
            m6631a()
            com.fyber.inneractive.sdk.config.IAConfigManager r1 = f9202J
            com.fyber.inneractive.sdk.cache.g r1 = r1.f9209F
            r1.mo13172a()
            com.fyber.inneractive.sdk.web.r r1 = com.fyber.inneractive.sdk.web.C3790r.f13063c
            r1.getClass()
            com.fyber.inneractive.sdk.web.q r2 = new com.fyber.inneractive.sdk.web.q
            r2.<init>(r1)
            com.fyber.inneractive.sdk.util.C3714n.m9976a(r2)
        L_0x0059:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.IAConfigManager.m6637g():boolean");
    }

    public static void removeListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        f9202J.f9219g.remove(onConfigurationReadyAndValidListener);
    }

    /* renamed from: a */
    public final void mo13187a(Exception exc) {
        for (OnConfigurationReadyAndValidListener next : this.f9219g) {
            if (next != null) {
                boolean f = m6636f();
                IAlog.m9905d("notifying listener configuration state has been resolved", new Object[0]);
                next.onConfigurationReadyAndValid(this, f, !f ? exc : null);
            }
        }
    }

    /* renamed from: a */
    public static void m6631a() {
        IAConfigManager iAConfigManager = f9202J;
        C2889b0<C2615a> b0Var = iAConfigManager.f9205B;
        if (b0Var != null) {
            iAConfigManager.f9232t.f10064a.offer(b0Var);
            b0Var.mo13666a(C2916m0.QUEUED);
        }
        C2668i iVar = iAConfigManager.f9234v;
        if (!iVar.f9339d) {
            iVar.mo13277b();
        }
    }
}
