package p135j8;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.C2335g;
import com.facebook.appevents.C2338j;
import com.facebook.appevents.FlushReason;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import mf0.C24362h;
import p009a8.C0098d0;
import p009a8.C0115o;
import p262t8.C6606a;
import p584jl.C17886b;

/* renamed from: j8.j */
public final class C5406j {

    /* renamed from: a */
    public static final C5406j f17752a = new C5406j();

    /* renamed from: b */
    public static final String f17753b = C5406j.class.getCanonicalName();

    /* renamed from: c */
    public static final long[] f17754c = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    /* renamed from: b */
    public static final void m13510b(String str, String str2, Context context) {
        C2338j jVar;
        Class<C5406j> cls = C5406j.class;
        if (!C6606a.m15601b(cls)) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("fb_mobile_launch_source", "Unclassified");
                bundle.putString("fb_mobile_pckg_fp", f17752a.mo21172a(context));
                bundle.putString("fb_mobile_app_cert_hash", C17886b.m44485k(context));
                jVar = new C2338j(str, str2);
                C0115o oVar = C0115o.f331a;
                if (C0098d0.m169b()) {
                    jVar.mo12484d(bundle, "fb_mobile_activate_app");
                }
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C2338j.f8537c;
                if (C2338j.C2339a.m6213b() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY && !C6606a.m15601b(jVar)) {
                    String str3 = C2335g.f8528a;
                    C2335g.m6198c(FlushReason.EXPLICIT);
                }
            } catch (Throwable th) {
                C6606a.m15600a(cls, th);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d7, code lost:
        if (r0 == null) goto L_0x00d9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0069 A[Catch:{ all -> 0x004a, all -> 0x0126 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d2 A[Catch:{ all -> 0x004a, all -> 0x0126 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d3 A[Catch:{ all -> 0x004a, all -> 0x0126 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e6 A[Catch:{ all -> 0x004a, all -> 0x0126 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e9 A[Catch:{ all -> 0x004a, all -> 0x0126 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0113 A[SYNTHETIC, Splitter:B:75:0x0113] */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13511c(java.lang.String r18, p135j8.C5405i r19, java.lang.String r20) {
        /*
            r1 = r19
            java.lang.Class<j8.j> r2 = p135j8.C5406j.class
            boolean r0 = p262t8.C6606a.m15601b(r2)
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            if (r1 != 0) goto L_0x000e
            return
        L_0x000e:
            java.lang.Long r0 = r1.f17750e     // Catch:{ all -> 0x0126 }
            r3 = 0
            if (r0 != 0) goto L_0x0018
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0126 }
        L_0x0018:
            if (r0 != 0) goto L_0x0027
            java.lang.Long r0 = r1.f17747b     // Catch:{ all -> 0x0126 }
            if (r0 != 0) goto L_0x0020
            r5 = r3
            goto L_0x0024
        L_0x0020:
            long r5 = r0.longValue()     // Catch:{ all -> 0x0126 }
        L_0x0024:
            long r5 = r3 - r5
            goto L_0x002b
        L_0x0027:
            long r5 = r0.longValue()     // Catch:{ all -> 0x0126 }
        L_0x002b:
            java.lang.String r7 = "Clock skew detected"
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x004f
            j8.j r5 = f17752a     // Catch:{ all -> 0x0126 }
            r5.getClass()     // Catch:{ all -> 0x0126 }
            boolean r0 = p262t8.C6606a.m15601b(r5)     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x003d
            goto L_0x004e
        L_0x003d:
            com.facebook.internal.x$a r0 = com.facebook.internal.C2436x.f8729d     // Catch:{ all -> 0x004a }
            com.facebook.LoggingBehavior r0 = com.facebook.LoggingBehavior.APP_EVENTS     // Catch:{ all -> 0x004a }
            java.lang.String r6 = f17753b     // Catch:{ all -> 0x004a }
            mf0.C24362h.m61208c(r6)     // Catch:{ all -> 0x004a }
            com.facebook.internal.C2436x.C2437a.m6389a(r0, r6, r7)     // Catch:{ all -> 0x004a }
            goto L_0x004e
        L_0x004a:
            r0 = move-exception
            p262t8.C6606a.m15600a(r5, r0)     // Catch:{ all -> 0x0126 }
        L_0x004e:
            r5 = r3
        L_0x004f:
            java.lang.Long r0 = r1.f17746a     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x0064
            java.lang.Long r0 = r1.f17747b     // Catch:{ all -> 0x0126 }
            if (r0 != 0) goto L_0x0058
            goto L_0x0064
        L_0x0058:
            long r8 = r0.longValue()     // Catch:{ all -> 0x0126 }
            java.lang.Long r0 = r1.f17746a     // Catch:{ all -> 0x0126 }
            long r10 = r0.longValue()     // Catch:{ all -> 0x0126 }
            long r8 = r8 - r10
            goto L_0x0065
        L_0x0064:
            r8 = r3
        L_0x0065:
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0087
            j8.j r8 = f17752a     // Catch:{ all -> 0x0126 }
            r8.getClass()     // Catch:{ all -> 0x0126 }
            boolean r0 = p262t8.C6606a.m15601b(r8)     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x0075
            goto L_0x0086
        L_0x0075:
            com.facebook.internal.x$a r0 = com.facebook.internal.C2436x.f8729d     // Catch:{ all -> 0x0082 }
            com.facebook.LoggingBehavior r0 = com.facebook.LoggingBehavior.APP_EVENTS     // Catch:{ all -> 0x0082 }
            java.lang.String r9 = f17753b     // Catch:{ all -> 0x0082 }
            mf0.C24362h.m61208c(r9)     // Catch:{ all -> 0x0082 }
            com.facebook.internal.C2436x.C2437a.m6389a(r0, r9, r7)     // Catch:{ all -> 0x0082 }
            goto L_0x0086
        L_0x0082:
            r0 = move-exception
            p262t8.C6606a.m15600a(r8, r0)     // Catch:{ all -> 0x0126 }
        L_0x0086:
            r8 = r3
        L_0x0087:
            android.os.Bundle r13 = new android.os.Bundle     // Catch:{ all -> 0x0126 }
            r13.<init>()     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = "fb_mobile_app_interruptions"
            int r7 = r1.f17749d     // Catch:{ all -> 0x0126 }
            r13.putInt(r0, r7)     // Catch:{ all -> 0x0126 }
            java.lang.String r7 = "fb_mobile_time_between_sessions"
            java.util.Locale r10 = java.util.Locale.ROOT     // Catch:{ all -> 0x0126 }
            java.lang.String r11 = "session_quanta_%d"
            r12 = 1
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch:{ all -> 0x0126 }
            boolean r0 = p262t8.C6606a.m15601b(r2)     // Catch:{ all -> 0x0126 }
            r15 = 0
            if (r0 == 0) goto L_0x00a4
            goto L_0x00b7
        L_0x00a4:
            r0 = 0
        L_0x00a5:
            long[] r3 = f17754c     // Catch:{ all -> 0x00b3 }
            int r4 = r3.length     // Catch:{ all -> 0x00b3 }
            if (r0 >= r4) goto L_0x00b8
            r16 = r3[r0]     // Catch:{ all -> 0x00b3 }
            int r3 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x00b8
            int r0 = r0 + 1
            goto L_0x00a5
        L_0x00b3:
            r0 = move-exception
            p262t8.C6606a.m15600a(r2, r0)     // Catch:{ all -> 0x0126 }
        L_0x00b7:
            r0 = 0
        L_0x00b8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0126 }
            r14[r15] = r0     // Catch:{ all -> 0x0126 }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r14, r12)     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = java.lang.String.format(r10, r11, r0)     // Catch:{ all -> 0x0126 }
            java.lang.String r3 = "java.lang.String.format(locale, format, *args)"
            mf0.C24362h.m61210e(r0, r3)     // Catch:{ all -> 0x0126 }
            r13.putString(r7, r0)     // Catch:{ all -> 0x0126 }
            j8.k r0 = r1.f17751f     // Catch:{ all -> 0x0126 }
            if (r0 != 0) goto L_0x00d3
            goto L_0x00d9
        L_0x00d3:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0126 }
            if (r0 != 0) goto L_0x00db
        L_0x00d9:
            java.lang.String r0 = "Unclassified"
        L_0x00db:
            java.lang.String r3 = "fb_mobile_launch_source"
            r13.putString(r3, r0)     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = "_logTime"
            java.lang.Long r1 = r1.f17747b     // Catch:{ all -> 0x0126 }
            if (r1 != 0) goto L_0x00e9
            r3 = 0
            goto L_0x00ed
        L_0x00e9:
            long r3 = r1.longValue()     // Catch:{ all -> 0x0126 }
        L_0x00ed:
            r1 = 1000(0x3e8, float:1.401E-42)
            long r5 = (long) r1     // Catch:{ all -> 0x0126 }
            long r3 = r3 / r5
            r13.putLong(r0, r3)     // Catch:{ all -> 0x0126 }
            com.facebook.appevents.j r1 = new com.facebook.appevents.j     // Catch:{ all -> 0x0126 }
            r3 = r18
            r4 = r20
            r1.<init>((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ all -> 0x0126 }
            double r3 = (double) r8     // Catch:{ all -> 0x0126 }
            r5 = 1000(0x3e8, double:4.94E-321)
            double r5 = (double) r5     // Catch:{ all -> 0x0126 }
            double r3 = r3 / r5
            java.lang.String r11 = "fb_mobile_deactivate_app"
            a8.o r0 = p009a8.C0115o.f331a     // Catch:{ all -> 0x0126 }
            boolean r0 = p009a8.C0098d0.m169b()     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x0125
            boolean r0 = p262t8.C6606a.m15601b(r1)     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x0113
            goto L_0x0125
        L_0x0113:
            java.lang.Double r12 = java.lang.Double.valueOf(r3)     // Catch:{ all -> 0x0121 }
            r14 = 0
            java.util.UUID r15 = p135j8.C5396c.m13498a()     // Catch:{ all -> 0x0121 }
            r10 = r1
            r10.mo12485e(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0121 }
            goto L_0x0125
        L_0x0121:
            r0 = move-exception
            p262t8.C6606a.m15600a(r1, r0)     // Catch:{ all -> 0x0126 }
        L_0x0125:
            return
        L_0x0126:
            r0 = move-exception
            p262t8.C6606a.m15600a(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p135j8.C5406j.m13511c(java.lang.String, j8.i, java.lang.String):void");
    }

    /* renamed from: a */
    public final String mo21172a(Context context) {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String k = C24362h.m61216k(packageManager.getPackageInfo(context.getPackageName(), 0).versionName, "PCKGCHKSUM;");
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String string = sharedPreferences.getString(k, (String) null);
            if (string != null && string.length() == 32) {
                return string;
            }
            String b = C5404h.m13508b(context);
            if (b == null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                C24362h.m61210e(applicationInfo, "pm.getApplicationInfo(context.packageName, 0)");
                b = C5404h.m13507a(applicationInfo.sourceDir);
            }
            sharedPreferences.edit().putString(k, b).apply();
            return b;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }
}
