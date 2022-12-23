package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.C2397f0;
import com.facebook.internal.C2400g0;
import com.facebook.internal.C2427r;
import com.facebook.internal.C2432u;
import com.facebook.internal.C2434v;
import com.facebook.internal.C2436x;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import mf0.C24362h;
import org.json.JSONException;
import p009a8.C0115o;
import p135j8.C5396c;
import p262t8.C6606a;

/* renamed from: com.facebook.appevents.j */
public final class C2338j {

    /* renamed from: c */
    public static ScheduledThreadPoolExecutor f8537c;

    /* renamed from: d */
    public static AppEventsLogger.FlushBehavior f8538d = AppEventsLogger.FlushBehavior.AUTO;

    /* renamed from: e */
    public static final Object f8539e = new Object();

    /* renamed from: f */
    public static String f8540f;

    /* renamed from: g */
    public static boolean f8541g;

    /* renamed from: a */
    public final String f8542a;

    /* renamed from: b */
    public AccessTokenAppIdPair f8543b;

    /* renamed from: com.facebook.appevents.j$a */
    public static final class C2339a {

        /* renamed from: com.facebook.appevents.j$a$a */
        public static final class C2340a implements C2432u.C2433a {
            /* renamed from: a */
            public final void mo12488a(String str) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C2338j.f8537c;
                C0115o.m210a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("install_referrer", str).apply();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x007c A[Catch:{ all -> 0x0075, all -> 0x008a }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final void m6212a(com.facebook.appevents.AppEvent r7, com.facebook.appevents.AccessTokenAppIdPair r8) {
            /*
                java.util.concurrent.ScheduledThreadPoolExecutor r0 = com.facebook.appevents.C2338j.f8537c
                java.lang.Class<com.facebook.appevents.j> r0 = com.facebook.appevents.C2338j.class
                java.lang.String r1 = com.facebook.appevents.C2335g.f8528a
                java.lang.Class<com.facebook.appevents.g> r1 = com.facebook.appevents.C2335g.class
                boolean r2 = p262t8.C6606a.m15601b(r1)
                if (r2 == 0) goto L_0x000f
                goto L_0x0025
            L_0x000f:
                java.lang.String r2 = "accessTokenAppId"
                mf0.C24362h.m61211f(r8, r2)     // Catch:{ all -> 0x0021 }
                java.util.concurrent.ScheduledExecutorService r2 = com.facebook.appevents.C2335g.f8531d     // Catch:{ all -> 0x0021 }
                x.e r3 = new x.e     // Catch:{ all -> 0x0021 }
                r4 = 9
                r3.<init>(r4, r8, r7)     // Catch:{ all -> 0x0021 }
                r2.execute(r3)     // Catch:{ all -> 0x0021 }
                goto L_0x0025
            L_0x0021:
                r2 = move-exception
                p262t8.C6606a.m15600a(r1, r2)
            L_0x0025:
                com.facebook.internal.FeatureManager r1 = com.facebook.internal.FeatureManager.f8588a
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.OnDevicePostInstallEventProcessing
                boolean r1 = com.facebook.internal.FeatureManager.m6257c(r1)
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x008e
                boolean r1 = p159l8.C5639a.m13920a()
                if (r1 == 0) goto L_0x008e
                java.lang.String r8 = r8.mo12449b()
                java.lang.Class<l8.a> r1 = p159l8.C5639a.class
                boolean r4 = p262t8.C6606a.m15601b(r1)
                if (r4 == 0) goto L_0x0044
                goto L_0x008e
            L_0x0044:
                java.lang.String r4 = "applicationId"
                mf0.C24362h.m61211f(r8, r4)     // Catch:{ all -> 0x008a }
                l8.a r4 = p159l8.C5639a.f18388a     // Catch:{ all -> 0x008a }
                r4.getClass()     // Catch:{ all -> 0x008a }
                boolean r5 = p262t8.C6606a.m15601b(r4)     // Catch:{ all -> 0x008a }
                if (r5 == 0) goto L_0x0055
                goto L_0x0079
            L_0x0055:
                boolean r5 = r7.mo12456e()     // Catch:{ all -> 0x0075 }
                if (r5 == 0) goto L_0x0069
                java.util.Set<java.lang.String> r5 = p159l8.C5639a.f18389b     // Catch:{ all -> 0x0075 }
                java.lang.String r6 = r7.mo12454c()     // Catch:{ all -> 0x0075 }
                boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x0075 }
                if (r5 == 0) goto L_0x0069
                r5 = 1
                goto L_0x006a
            L_0x0069:
                r5 = 0
            L_0x006a:
                boolean r4 = r7.mo12456e()     // Catch:{ all -> 0x0075 }
                r4 = r4 ^ r3
                if (r4 != 0) goto L_0x0073
                if (r5 == 0) goto L_0x0079
            L_0x0073:
                r4 = 1
                goto L_0x007a
            L_0x0075:
                r5 = move-exception
                p262t8.C6606a.m15600a(r4, r5)     // Catch:{ all -> 0x008a }
            L_0x0079:
                r4 = 0
            L_0x007a:
                if (r4 == 0) goto L_0x008e
                java.util.concurrent.Executor r4 = p009a8.C0115o.m212c()     // Catch:{ all -> 0x008a }
                x.n r5 = new x.n     // Catch:{ all -> 0x008a }
                r6 = 5
                r5.<init>(r6, r8, r7)     // Catch:{ all -> 0x008a }
                r4.execute(r5)     // Catch:{ all -> 0x008a }
                goto L_0x008e
            L_0x008a:
                r8 = move-exception
                p262t8.C6606a.m15600a(r1, r8)
            L_0x008e:
                boolean r8 = r7.mo12452a()
                if (r8 != 0) goto L_0x00ca
                boolean r8 = p262t8.C6606a.m15601b(r0)
                if (r8 == 0) goto L_0x009b
                goto L_0x00a2
            L_0x009b:
                boolean r2 = com.facebook.appevents.C2338j.f8541g     // Catch:{ all -> 0x009e }
                goto L_0x00a2
            L_0x009e:
                r8 = move-exception
                p262t8.C6606a.m15600a(r0, r8)
            L_0x00a2:
                if (r2 != 0) goto L_0x00ca
                java.lang.String r7 = r7.mo12454c()
                java.lang.String r8 = "fb_mobile_activate_app"
                boolean r7 = mf0.C24362h.m61206a(r7, r8)
                if (r7 == 0) goto L_0x00bf
                boolean r7 = p262t8.C6606a.m15601b(r0)
                if (r7 == 0) goto L_0x00b7
                goto L_0x00ca
            L_0x00b7:
                com.facebook.appevents.C2338j.f8541g = r3     // Catch:{ all -> 0x00ba }
                goto L_0x00ca
            L_0x00ba:
                r7 = move-exception
                p262t8.C6606a.m15600a(r0, r7)
                goto L_0x00ca
            L_0x00bf:
                com.facebook.internal.x$a r7 = com.facebook.internal.C2436x.f8729d
                com.facebook.LoggingBehavior r7 = com.facebook.LoggingBehavior.APP_EVENTS
                java.lang.String r8 = "AppEvents"
                java.lang.String r0 = "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events."
                com.facebook.internal.C2436x.C2437a.m6389a(r7, r8, r0)
            L_0x00ca:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.C2338j.C2339a.m6212a(com.facebook.appevents.AppEvent, com.facebook.appevents.AccessTokenAppIdPair):void");
        }

        /* renamed from: b */
        public static AppEventsLogger.FlushBehavior m6213b() {
            AppEventsLogger.FlushBehavior flushBehavior;
            synchronized (C2338j.m6207c()) {
                Class<C2338j> cls = C2338j.class;
                flushBehavior = null;
                if (!C6606a.m15601b(cls)) {
                    try {
                        flushBehavior = C2338j.f8538d;
                    } catch (Throwable th) {
                        C6606a.m15600a(cls, th);
                    }
                }
            }
            return flushBehavior;
        }

        /* renamed from: c */
        public static String m6214c() {
            C2340a aVar = new C2340a();
            if (!C0115o.m210a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false)) {
                InstallReferrerClient build = InstallReferrerClient.newBuilder(C0115o.m210a()).build();
                try {
                    build.startConnection(new C2434v(build, aVar));
                } catch (Exception unused) {
                }
            }
            return C0115o.m210a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", (String) null);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
            r3 = new com.facebook.appevents.C2337i(0);
            r2 = com.facebook.appevents.C2338j.m6206b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
            if (r2 == null) goto L_0x003d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
            r2.scheduleAtFixedRate(r3, 0, 86400, java.util.concurrent.TimeUnit.SECONDS);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
            throw new java.lang.IllegalStateException("Required value was null.".toString());
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m6215d() {
            /*
                java.lang.Object r0 = com.facebook.appevents.C2338j.m6207c()
                monitor-enter(r0)
                java.util.concurrent.ScheduledThreadPoolExecutor r1 = com.facebook.appevents.C2338j.m6206b()     // Catch:{ all -> 0x0049 }
                if (r1 == 0) goto L_0x000d
                monitor-exit(r0)
                return
            L_0x000d:
                java.util.concurrent.ScheduledThreadPoolExecutor r1 = new java.util.concurrent.ScheduledThreadPoolExecutor     // Catch:{ all -> 0x0049 }
                r2 = 1
                r1.<init>(r2)     // Catch:{ all -> 0x0049 }
                java.lang.Class<com.facebook.appevents.j> r2 = com.facebook.appevents.C2338j.class
                boolean r3 = p262t8.C6606a.m15601b(r2)     // Catch:{ all -> 0x0049 }
                if (r3 == 0) goto L_0x001c
                goto L_0x0023
            L_0x001c:
                com.facebook.appevents.C2338j.f8537c = r1     // Catch:{ all -> 0x001f }
                goto L_0x0023
            L_0x001f:
                r1 = move-exception
                p262t8.C6606a.m15600a(r2, r1)     // Catch:{ all -> 0x0049 }
            L_0x0023:
                bf0.d r1 = bf0.C21050d.f52856a     // Catch:{ all -> 0x0049 }
                monitor-exit(r0)
                com.facebook.appevents.i r3 = new com.facebook.appevents.i
                r0 = 0
                r3.<init>(r0)
                java.util.concurrent.ScheduledThreadPoolExecutor r2 = com.facebook.appevents.C2338j.m6206b()
                if (r2 == 0) goto L_0x003d
                r4 = 0
                r6 = 86400(0x15180, double:4.26873E-319)
                java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
                r2.scheduleAtFixedRate(r3, r4, r6, r8)
                return
            L_0x003d:
                java.lang.String r0 = "Required value was null."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L_0x0049:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.C2338j.C2339a.m6215d():void");
        }
    }

    static {
        new C2339a();
    }

    public C2338j(String str, String str2) {
        C2400g0.m6342g();
        this.f8542a = str;
        Date date = AccessToken.f8348m;
        AccessToken b = AccessToken.C2266c.m6110b();
        if (b == null || new Date().after(b.f8351b) || (str2 != null && !C24362h.m61206a(str2, b.f8358i))) {
            if (str2 == null) {
                C2397f0 f0Var = C2397f0.f8630a;
                str2 = C2397f0.m6323q(C0115o.m210a());
            }
            this.f8543b = new AccessTokenAppIdPair((String) null, str2);
        } else {
            this.f8543b = new AccessTokenAppIdPair(b.f8355f, C0115o.m211b());
        }
        C2339a.m6215d();
    }

    /* renamed from: a */
    public static final /* synthetic */ String m6205a() {
        Class<C2338j> cls = C2338j.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            return f8540f;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ ScheduledThreadPoolExecutor m6206b() {
        Class<C2338j> cls = C2338j.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            return f8537c;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ Object m6207c() {
        Class<C2338j> cls = C2338j.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            return f8539e;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: d */
    public final void mo12484d(Bundle bundle, String str) {
        if (!C6606a.m15601b(this)) {
            try {
                mo12485e(str, (Double) null, bundle, false, C5396c.m13498a());
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    /* renamed from: e */
    public final void mo12485e(String str, Double d, Bundle bundle, boolean z, UUID uuid) {
        boolean z2;
        boolean z3;
        if (!C6606a.m15601b(this) && str != null) {
            try {
                if (str.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    C2427r rVar = C2427r.f8702a;
                    if (C2427r.m6380b("app_events_killswitch", C0115o.m211b(), false)) {
                        C2436x.C2437a aVar = C2436x.f8729d;
                        C2436x.C2437a.m6390b(LoggingBehavior.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                        return;
                    }
                    String str2 = this.f8542a;
                    if (C5396c.f17729k == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    C2339a.m6212a(new AppEvent(str2, str, d, bundle, z, z3, uuid), this.f8543b);
                }
            } catch (JSONException e) {
                C2436x.C2437a aVar2 = C2436x.f8729d;
                C2436x.C2437a.m6390b(LoggingBehavior.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e.toString());
            } catch (FacebookException e2) {
                C2436x.C2437a aVar3 = C2436x.f8729d;
                C2436x.C2437a.m6390b(LoggingBehavior.APP_EVENTS, "AppEvents", "Invalid app event: %s", e2.toString());
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    /* renamed from: f */
    public final void mo12486f(String str, Bundle bundle) {
        if (!C6606a.m15601b(this)) {
            try {
                mo12485e(str, (Double) null, bundle, true, C5396c.m13498a());
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    /* renamed from: g */
    public final void mo12487g(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z) {
        if (!C6606a.m15601b(this)) {
            if (bigDecimal == null) {
                try {
                    C2436x.C2437a aVar = C2436x.f8729d;
                    C2436x.C2437a.m6389a(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", "purchaseAmount cannot be null");
                } catch (Throwable th) {
                    C6606a.m15600a(this, th);
                }
            } else if (currency == null) {
                C2436x.C2437a aVar2 = C2436x.f8729d;
                C2436x.C2437a.m6389a(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", "currency cannot be null");
            } else {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle bundle2 = bundle;
                bundle2.putString("fb_currency", currency.getCurrencyCode());
                mo12485e("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z, C5396c.m13498a());
                if (C2339a.m6213b() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                    String str = C2335g.f8528a;
                    C2335g.m6198c(FlushReason.EAGER_FLUSHING_EVENT);
                }
            }
        }
    }

    public C2338j(Context context, String str) {
        this(C2397f0.m6318l(context), str);
    }
}
