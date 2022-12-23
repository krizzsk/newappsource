package p009a8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import androidx.recyclerview.widget.RecyclerView;
import bf0.C21050d;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.internal.C2393d0;
import com.facebook.internal.C2397f0;
import com.facebook.internal.C2400g0;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import mf0.C24362h;
import p583jk.C17884p;
import uh0.C25081h;

/* renamed from: a8.o */
public final class C0115o {

    /* renamed from: a */
    public static final C0115o f331a = new C0115o();

    /* renamed from: b */
    public static final HashSet<LoggingBehavior> f332b = C17884p.m44336G(LoggingBehavior.DEVELOPER_ERRORS);

    /* renamed from: c */
    public static Executor f333c;

    /* renamed from: d */
    public static volatile String f334d;

    /* renamed from: e */
    public static volatile String f335e;

    /* renamed from: f */
    public static volatile String f336f;

    /* renamed from: g */
    public static volatile Boolean f337g;

    /* renamed from: h */
    public static AtomicLong f338h = new AtomicLong(65536);

    /* renamed from: i */
    public static Context f339i;

    /* renamed from: j */
    public static int f340j = 64206;

    /* renamed from: k */
    public static final ReentrantLock f341k = new ReentrantLock();

    /* renamed from: l */
    public static String f342l = "v15.0";

    /* renamed from: m */
    public static boolean f343m;

    /* renamed from: n */
    public static boolean f344n;

    /* renamed from: o */
    public static boolean f345o;

    /* renamed from: p */
    public static final AtomicBoolean f346p = new AtomicBoolean(false);

    /* renamed from: q */
    public static volatile String f347q = "instagram.com";

    /* renamed from: r */
    public static volatile String f348r = "facebook.com";

    /* renamed from: s */
    public static C0114n f349s = new C0114n(0);

    /* renamed from: t */
    public static boolean f350t;

    /* renamed from: a8.o$a */
    public interface C0116a {
        /* renamed from: a */
        void mo260a();
    }

    static {
        int i = C2393d0.f8626a;
    }

    /* renamed from: a */
    public static final Context m210a() {
        C2400g0.m6342g();
        Context context = f339i;
        if (context != null) {
            return context;
        }
        C24362h.m61217l("applicationContext");
        throw null;
    }

    /* renamed from: b */
    public static final String m211b() {
        C2400g0.m6342g();
        String str = f334d;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public static final Executor m212c() {
        ReentrantLock reentrantLock = f341k;
        reentrantLock.lock();
        try {
            if (f333c == null) {
                f333c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            C21050d dVar = C21050d.f52856a;
            reentrantLock.unlock();
            Executor executor = f333c;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: d */
    public static final String m213d() {
        C2397f0 f0Var = C2397f0.f8630a;
        C24362h.m61210e(String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{f342l}, 1)), "java.lang.String.format(format, *args)");
        return f342l;
    }

    /* renamed from: e */
    public static final String m214e() {
        String str;
        Date date = AccessToken.f8348m;
        AccessToken b = AccessToken.C2266c.m6110b();
        if (b != null) {
            str = b.f8361l;
        } else {
            str = null;
        }
        C2397f0 f0Var = C2397f0.f8630a;
        String str2 = f348r;
        if (str == null) {
            return str2;
        }
        if (C24362h.m61206a(str, "gaming")) {
            return C25081h.m62833D(str2, "facebook.com", "fb.gg", false);
        }
        if (C24362h.m61206a(str, "instagram")) {
            return C25081h.m62833D(str2, "facebook.com", "instagram.com", false);
        }
        return str2;
    }

    /* renamed from: f */
    public static final boolean m215f(Context context) {
        C2400g0.m6342g();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    /* renamed from: g */
    public static final synchronized boolean m216g() {
        boolean z;
        synchronized (C0115o.class) {
            z = f350t;
        }
        return z;
    }

    /* renamed from: h */
    public static final boolean m217h() {
        return f346p.get();
    }

    /* renamed from: i */
    public static final void m218i(LoggingBehavior loggingBehavior) {
        C24362h.m61211f(loggingBehavior, "behavior");
        synchronized (f332b) {
        }
    }

    /* renamed from: j */
    public static final void m219j(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), RecyclerView.C1119a0.FLAG_IGNORE);
            C24362h.m61210e(applicationInfo, "try {\n          context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)\n        } catch (e: PackageManager.NameNotFoundException) {\n          return\n        }");
            if (applicationInfo.metaData != null) {
                if (f334d == null) {
                    Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                    if (obj instanceof String) {
                        String str = (String) obj;
                        Locale locale = Locale.ROOT;
                        C24362h.m61210e(locale, "ROOT");
                        String lowerCase = str.toLowerCase(locale);
                        C24362h.m61210e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                        if (C25081h.m62835F(lowerCase, "fb")) {
                            String substring = str.substring(2);
                            C24362h.m61210e(substring, "(this as java.lang.String).substring(startIndex)");
                            f334d = substring;
                        } else {
                            f334d = str;
                        }
                    } else if (obj instanceof Number) {
                        throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                    }
                }
                if (f335e == null) {
                    f335e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
                }
                if (f336f == null) {
                    f336f = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
                }
                if (f340j == 64206) {
                    f340j = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
                }
                if (f337g == null) {
                    f337g = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: k */
    public static final synchronized void m220k(Context context) {
        synchronized (C0115o.class) {
            m221l(context);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b A[Catch:{ all -> 0x0065 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004b A[Catch:{ all -> 0x0065 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c A[Catch:{ all -> 0x0065 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0072 A[Catch:{ all -> 0x0065 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f6 A[Catch:{ all -> 0x0065 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fc A[Catch:{ all -> 0x0065 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0104 A[Catch:{ all -> 0x0065 }] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void m221l(android.content.Context r5) {
        /*
            java.lang.Class<a8.o> r0 = p009a8.C0115o.class
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = f346p     // Catch:{ all -> 0x0112 }
            boolean r2 = r1.get()     // Catch:{ all -> 0x0112 }
            if (r2 == 0) goto L_0x000d
            monitor-exit(r0)
            return
        L_0x000d:
            r2 = 0
            com.facebook.internal.C2400g0.m6337b(r5, r2)     // Catch:{ all -> 0x0112 }
            com.facebook.internal.C2400g0.m6338c(r5, r2)     // Catch:{ all -> 0x0112 }
            android.content.Context r3 = r5.getApplicationContext()     // Catch:{ all -> 0x0112 }
            java.lang.String r4 = "applicationContext.applicationContext"
            mf0.C24362h.m61210e(r3, r4)     // Catch:{ all -> 0x0112 }
            f339i = r3     // Catch:{ all -> 0x0112 }
            com.facebook.appevents.AppEventsLogger.C2315a.m6184a(r5)     // Catch:{ all -> 0x0112 }
            android.content.Context r5 = f339i     // Catch:{ all -> 0x0112 }
            r3 = 0
            if (r5 == 0) goto L_0x010c
            m219j(r5)     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = f334d     // Catch:{ all -> 0x0112 }
            r4 = 1
            if (r5 == 0) goto L_0x0038
            int r5 = r5.length()     // Catch:{ all -> 0x0112 }
            if (r5 != 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r5 = 0
            goto L_0x0039
        L_0x0038:
            r5 = 1
        L_0x0039:
            if (r5 != 0) goto L_0x0104
            java.lang.String r5 = f336f     // Catch:{ all -> 0x0112 }
            if (r5 == 0) goto L_0x0048
            int r5 = r5.length()     // Catch:{ all -> 0x0112 }
            if (r5 != 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r5 = 0
            goto L_0x0049
        L_0x0048:
            r5 = 1
        L_0x0049:
            if (r5 != 0) goto L_0x00fc
            r1.set(r4)     // Catch:{ all -> 0x0112 }
            a8.d0 r5 = p009a8.C0098d0.f291a     // Catch:{ all -> 0x0112 }
            java.lang.Class<a8.d0> r5 = p009a8.C0098d0.class
            boolean r1 = p262t8.C6606a.m15601b(r5)     // Catch:{ all -> 0x0112 }
            if (r1 == 0) goto L_0x0059
            goto L_0x0069
        L_0x0059:
            a8.d0 r1 = p009a8.C0098d0.f291a     // Catch:{ all -> 0x0065 }
            r1.mo205d()     // Catch:{ all -> 0x0065 }
            a8.d0$a r1 = p009a8.C0098d0.f294d     // Catch:{ all -> 0x0065 }
            boolean r5 = r1.mo212a()     // Catch:{ all -> 0x0065 }
            goto L_0x006a
        L_0x0065:
            r1 = move-exception
            p262t8.C6606a.m15600a(r5, r1)     // Catch:{ all -> 0x0112 }
        L_0x0069:
            r5 = 0
        L_0x006a:
            if (r5 == 0) goto L_0x006e
            f350t = r4     // Catch:{ all -> 0x0112 }
        L_0x006e:
            android.content.Context r5 = f339i     // Catch:{ all -> 0x0112 }
            if (r5 == 0) goto L_0x00f6
            boolean r5 = r5 instanceof android.app.Application     // Catch:{ all -> 0x0112 }
            if (r5 == 0) goto L_0x0090
            boolean r5 = p009a8.C0098d0.m169b()     // Catch:{ all -> 0x0112 }
            if (r5 == 0) goto L_0x0090
            j8.c r5 = p135j8.C5396c.f17719a     // Catch:{ all -> 0x0112 }
            android.content.Context r5 = f339i     // Catch:{ all -> 0x0112 }
            if (r5 == 0) goto L_0x008a
            android.app.Application r5 = (android.app.Application) r5     // Catch:{ all -> 0x0112 }
            java.lang.String r1 = f334d     // Catch:{ all -> 0x0112 }
            p135j8.C5396c.m13499b(r5, r1)     // Catch:{ all -> 0x0112 }
            goto L_0x0090
        L_0x008a:
            java.lang.String r5 = "applicationContext"
            mf0.C24362h.m61217l(r5)     // Catch:{ all -> 0x0112 }
            throw r3     // Catch:{ all -> 0x0112 }
        L_0x0090:
            com.facebook.internal.FetchedAppSettingsManager.m6262c()     // Catch:{ all -> 0x0112 }
            com.facebook.internal.C2440z.m6411r()     // Catch:{ all -> 0x0112 }
            com.facebook.internal.BoltsMeasurementEventListener r5 = com.facebook.internal.BoltsMeasurementEventListener.f8583b     // Catch:{ all -> 0x0112 }
            android.content.Context r5 = f339i     // Catch:{ all -> 0x0112 }
            if (r5 == 0) goto L_0x00f0
            com.facebook.internal.BoltsMeasurementEventListener.C2364a.m6252a(r5)     // Catch:{ all -> 0x0112 }
            cy.b r5 = new cy.b     // Catch:{ all -> 0x0112 }
            a8.j r1 = new a8.j     // Catch:{ all -> 0x0112 }
            r1.<init>()     // Catch:{ all -> 0x0112 }
            r5.<init>((p009a8.C0110j) r1)     // Catch:{ all -> 0x0112 }
            com.facebook.internal.FeatureManager r5 = com.facebook.internal.FeatureManager.f8588a     // Catch:{ all -> 0x0112 }
            com.facebook.internal.FeatureManager$Feature r5 = com.facebook.internal.FeatureManager.Feature.Instrument     // Catch:{ all -> 0x0112 }
            a8.k r1 = new a8.k     // Catch:{ all -> 0x0112 }
            r1.<init>(r2)     // Catch:{ all -> 0x0112 }
            com.facebook.internal.FeatureManager.m6255a(r1, r5)     // Catch:{ all -> 0x0112 }
            com.facebook.internal.FeatureManager$Feature r5 = com.facebook.internal.FeatureManager.Feature.AppEvents     // Catch:{ all -> 0x0112 }
            e0.q0 r1 = new e0.q0     // Catch:{ all -> 0x0112 }
            r1.<init>(r4)     // Catch:{ all -> 0x0112 }
            com.facebook.internal.FeatureManager.m6255a(r1, r5)     // Catch:{ all -> 0x0112 }
            com.facebook.internal.FeatureManager$Feature r5 = com.facebook.internal.FeatureManager.Feature.ChromeCustomTabsPrefetching     // Catch:{ all -> 0x0112 }
            e0.r0 r1 = new e0.r0     // Catch:{ all -> 0x0112 }
            r1.<init>(r4)     // Catch:{ all -> 0x0112 }
            com.facebook.internal.FeatureManager.m6255a(r1, r5)     // Catch:{ all -> 0x0112 }
            com.facebook.internal.FeatureManager$Feature r5 = com.facebook.internal.FeatureManager.Feature.IgnoreAppSwitchToLoggedOut     // Catch:{ all -> 0x0112 }
            i0.c r1 = new i0.c     // Catch:{ all -> 0x0112 }
            r1.<init>(r4)     // Catch:{ all -> 0x0112 }
            com.facebook.internal.FeatureManager.m6255a(r1, r5)     // Catch:{ all -> 0x0112 }
            com.facebook.internal.FeatureManager$Feature r5 = com.facebook.internal.FeatureManager.Feature.BypassAppSwitch     // Catch:{ all -> 0x0112 }
            a8.l r1 = new a8.l     // Catch:{ all -> 0x0112 }
            r1.<init>(r2)     // Catch:{ all -> 0x0112 }
            com.facebook.internal.FeatureManager.m6255a(r1, r5)     // Catch:{ all -> 0x0112 }
            java.util.concurrent.FutureTask r5 = new java.util.concurrent.FutureTask     // Catch:{ all -> 0x0112 }
            a8.m r1 = new a8.m     // Catch:{ all -> 0x0112 }
            r1.<init>(r3, r2)     // Catch:{ all -> 0x0112 }
            r5.<init>(r1)     // Catch:{ all -> 0x0112 }
            java.util.concurrent.Executor r1 = m212c()     // Catch:{ all -> 0x0112 }
            r1.execute(r5)     // Catch:{ all -> 0x0112 }
            monitor-exit(r0)
            return
        L_0x00f0:
            java.lang.String r5 = "applicationContext"
            mf0.C24362h.m61217l(r5)     // Catch:{ all -> 0x0112 }
            throw r3     // Catch:{ all -> 0x0112 }
        L_0x00f6:
            java.lang.String r5 = "applicationContext"
            mf0.C24362h.m61217l(r5)     // Catch:{ all -> 0x0112 }
            throw r3     // Catch:{ all -> 0x0112 }
        L_0x00fc:
            com.facebook.FacebookException r5 = new com.facebook.FacebookException     // Catch:{ all -> 0x0112 }
            java.lang.String r1 = "A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk."
            r5.<init>((java.lang.String) r1)     // Catch:{ all -> 0x0112 }
            throw r5     // Catch:{ all -> 0x0112 }
        L_0x0104:
            com.facebook.FacebookException r5 = new com.facebook.FacebookException     // Catch:{ all -> 0x0112 }
            java.lang.String r1 = "A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk."
            r5.<init>((java.lang.String) r1)     // Catch:{ all -> 0x0112 }
            throw r5     // Catch:{ all -> 0x0112 }
        L_0x010c:
            java.lang.String r5 = "applicationContext"
            mf0.C24362h.m61217l(r5)     // Catch:{ all -> 0x0112 }
            throw r3     // Catch:{ all -> 0x0112 }
        L_0x0112:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p009a8.C0115o.m221l(android.content.Context):void");
    }
}
