package com.facebook.appevents;

import android.content.Intent;
import androidx.appcompat.widget.C0416i1;
import androidx.lifecycle.C1042u;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.LoggingBehavior;
import com.facebook.internal.C2436x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import mf0.C24362h;
import p009a8.C0115o;
import p009a8.C0124u;
import p130j2.C5367a;
import p262t8.C6606a;
import p304x.C7103t;

/* renamed from: com.facebook.appevents.g */
public final class C2335g {

    /* renamed from: a */
    public static final String f8528a = C2335g.class.getName();

    /* renamed from: b */
    public static final int f8529b = 100;

    /* renamed from: c */
    public static volatile C1042u f8530c = new C1042u(3);

    /* renamed from: d */
    public static final ScheduledExecutorService f8531d = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: e */
    public static ScheduledFuture<?> f8532e;

    /* renamed from: f */
    public static final C2332d f8533f = new C2332d(0);

    static {
        new C2335g();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007c, code lost:
        p262t8.C6606a.m15600a(r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007f, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebook.GraphRequest m6196a(com.facebook.appevents.AccessTokenAppIdPair r8, com.facebook.appevents.C2353q r9, boolean r10, com.facebook.appevents.C2349o r11) {
        /*
            java.lang.Class<com.facebook.appevents.g> r0 = com.facebook.appevents.C2335g.class
            boolean r1 = p262t8.C6606a.m15601b(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r1 = r8.mo12449b()     // Catch:{ all -> 0x007b }
            r3 = 0
            com.facebook.internal.s r4 = com.facebook.internal.FetchedAppSettingsManager.m6264f(r1, r3)     // Catch:{ all -> 0x007b }
            java.lang.String r5 = com.facebook.GraphRequest.f8425j     // Catch:{ all -> 0x007b }
            java.lang.String r5 = "%s/activities"
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x007b }
            r7[r3] = r1     // Catch:{ all -> 0x007b }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r7, r6)     // Catch:{ all -> 0x007b }
            java.lang.String r1 = java.lang.String.format(r5, r1)     // Catch:{ all -> 0x007b }
            java.lang.String r5 = "java.lang.String.format(format, *args)"
            mf0.C24362h.m61210e(r1, r5)     // Catch:{ all -> 0x007b }
            com.facebook.GraphRequest r1 = com.facebook.GraphRequest.C2281c.m6138h(r2, r1, r2, r2)     // Catch:{ all -> 0x007b }
            r1.f8436i = r6     // Catch:{ all -> 0x007b }
            android.os.Bundle r5 = r1.f8431d     // Catch:{ all -> 0x007b }
            if (r5 != 0) goto L_0x0038
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x007b }
            r5.<init>()     // Catch:{ all -> 0x007b }
        L_0x0038:
            java.lang.String r6 = "access_token"
            java.lang.String r7 = r8.mo12448a()     // Catch:{ all -> 0x007b }
            r5.putString(r6, r7)     // Catch:{ all -> 0x007b }
            java.lang.Object r6 = com.facebook.appevents.C2338j.m6207c()     // Catch:{ all -> 0x007b }
            monitor-enter(r6)     // Catch:{ all -> 0x007b }
            java.lang.Class<com.facebook.appevents.j> r7 = com.facebook.appevents.C2338j.class
            p262t8.C6606a.m15601b(r7)     // Catch:{ all -> 0x0078 }
            monitor-exit(r6)     // Catch:{ all -> 0x007b }
            java.util.concurrent.ScheduledThreadPoolExecutor r6 = com.facebook.appevents.C2338j.f8537c     // Catch:{ all -> 0x007b }
            java.lang.String r6 = com.facebook.appevents.C2338j.C2339a.m6214c()     // Catch:{ all -> 0x007b }
            if (r6 == 0) goto L_0x0059
            java.lang.String r7 = "install_referrer"
            r5.putString(r7, r6)     // Catch:{ all -> 0x007b }
        L_0x0059:
            r1.f8431d = r5     // Catch:{ all -> 0x007b }
            if (r4 == 0) goto L_0x005f
            boolean r3 = r4.f8708a     // Catch:{ all -> 0x007b }
        L_0x005f:
            android.content.Context r4 = p009a8.C0115o.m210a()     // Catch:{ all -> 0x007b }
            int r10 = r9.mo12513d(r1, r4, r3, r10)     // Catch:{ all -> 0x007b }
            if (r10 != 0) goto L_0x006a
            return r2
        L_0x006a:
            int r3 = r11.f8561a     // Catch:{ all -> 0x007b }
            int r3 = r3 + r10
            r11.f8561a = r3     // Catch:{ all -> 0x007b }
            com.facebook.appevents.e r10 = new com.facebook.appevents.e     // Catch:{ all -> 0x007b }
            r10.<init>(r8, r1, r9, r11)     // Catch:{ all -> 0x007b }
            r1.mo11909j(r10)     // Catch:{ all -> 0x007b }
            return r1
        L_0x0078:
            r8 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x007b }
            throw r8     // Catch:{ all -> 0x007b }
        L_0x007b:
            r8 = move-exception
            p262t8.C6606a.m15600a(r0, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.C2335g.m6196a(com.facebook.appevents.AccessTokenAppIdPair, com.facebook.appevents.q, boolean, com.facebook.appevents.o):com.facebook.GraphRequest");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0077, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0078, code lost:
        p262t8.C6606a.m15600a(r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList m6197b(androidx.lifecycle.C1042u r8, com.facebook.appevents.C2349o r9) {
        /*
            java.lang.Class<com.facebook.appevents.g> r0 = com.facebook.appevents.C2335g.class
            boolean r1 = p262t8.C6606a.m15601b(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r1 = "appEventCollection"
            mf0.C24362h.m61211f(r8, r1)     // Catch:{ all -> 0x0077 }
            android.content.Context r1 = p009a8.C0115o.m210a()     // Catch:{ all -> 0x0077 }
            boolean r1 = p009a8.C0115o.m215f(r1)     // Catch:{ all -> 0x0077 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0077 }
            r3.<init>()     // Catch:{ all -> 0x0077 }
            java.util.Set r4 = r8.mo4333h()     // Catch:{ all -> 0x0077 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0077 }
        L_0x0024:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0077 }
            if (r5 == 0) goto L_0x0076
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0077 }
            com.facebook.appevents.AccessTokenAppIdPair r5 = (com.facebook.appevents.AccessTokenAppIdPair) r5     // Catch:{ all -> 0x0077 }
            monitor-enter(r8)     // Catch:{ all -> 0x0077 }
            java.lang.String r6 = "accessTokenAppIdPair"
            mf0.C24362h.m61211f(r5, r6)     // Catch:{ all -> 0x0073 }
            java.lang.Object r6 = r8.f3985a     // Catch:{ all -> 0x0073 }
            java.util.HashMap r6 = (java.util.HashMap) r6     // Catch:{ all -> 0x0073 }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ all -> 0x0073 }
            com.facebook.appevents.q r6 = (com.facebook.appevents.C2353q) r6     // Catch:{ all -> 0x0073 }
            monitor-exit(r8)     // Catch:{ all -> 0x0077 }
            if (r6 == 0) goto L_0x0067
            com.facebook.GraphRequest r5 = m6196a(r5, r6, r1, r9)     // Catch:{ all -> 0x0077 }
            if (r5 == 0) goto L_0x0024
            r3.add(r5)     // Catch:{ all -> 0x0077 }
            d8.b r6 = p062d8.C4405b.f15466a     // Catch:{ all -> 0x0077 }
            r6.getClass()     // Catch:{ all -> 0x0077 }
            boolean r6 = p062d8.C4405b.f15468c     // Catch:{ all -> 0x0077 }
            if (r6 == 0) goto L_0x0024
            java.util.HashSet<java.lang.Integer> r6 = com.facebook.appevents.cloudbridge.C2329a.f8501a     // Catch:{ all -> 0x0077 }
            d0.a1 r6 = new d0.a1     // Catch:{ all -> 0x0077 }
            r7 = 5
            r6.<init>(r5, r7)     // Catch:{ all -> 0x0077 }
            com.facebook.internal.f0 r5 = com.facebook.internal.C2397f0.f8630a     // Catch:{ all -> 0x0077 }
            java.util.concurrent.Executor r5 = p009a8.C0115o.m212c()     // Catch:{ Exception -> 0x0024 }
            r5.execute(r6)     // Catch:{ Exception -> 0x0024 }
            goto L_0x0024
        L_0x0067:
            java.lang.String r8 = "Required value was null."
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0077 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0077 }
            r9.<init>(r8)     // Catch:{ all -> 0x0077 }
            throw r9     // Catch:{ all -> 0x0077 }
        L_0x0073:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0077 }
            throw r9     // Catch:{ all -> 0x0077 }
        L_0x0076:
            return r3
        L_0x0077:
            r8 = move-exception
            p262t8.C6606a.m15600a(r0, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.C2335g.m6197b(androidx.lifecycle.u, com.facebook.appevents.o):java.util.ArrayList");
    }

    /* renamed from: c */
    public static final void m6198c(FlushReason flushReason) {
        Class<C2335g> cls = C2335g.class;
        if (!C6606a.m15601b(cls)) {
            try {
                C24362h.m61211f(flushReason, "reason");
                f8531d.execute(new C0416i1(flushReason, 6));
            } catch (Throwable th) {
                C6606a.m15600a(cls, th);
            }
        }
    }

    /* renamed from: d */
    public static final void m6199d(FlushReason flushReason) {
        Class<C2335g> cls = C2335g.class;
        if (!C6606a.m15601b(cls)) {
            try {
                C24362h.m61211f(flushReason, "reason");
                f8530c.mo4328c(C2318c.m6188a());
                try {
                    C2349o f = m6201f(flushReason, f8530c);
                    if (f != null) {
                        Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                        intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", f.f8561a);
                        intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", (FlushResult) f.f8562b);
                        C5367a.m13473a(C0115o.m210a()).mo21147c(intent);
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                C6606a.m15600a(cls, th);
            }
        }
    }

    /* renamed from: e */
    public static final void m6200e(GraphRequest graphRequest, C0124u uVar, AccessTokenAppIdPair accessTokenAppIdPair, C2349o oVar, C2353q qVar) {
        FlushResult flushResult;
        Class<C2335g> cls = C2335g.class;
        if (!C6606a.m15601b(cls)) {
            try {
                FacebookRequestError facebookRequestError = uVar.f366c;
                FlushResult flushResult2 = FlushResult.SUCCESS;
                boolean z = true;
                if (facebookRequestError == null) {
                    flushResult = flushResult2;
                } else if (facebookRequestError.f8417c == -1) {
                    flushResult = FlushResult.NO_CONNECTIVITY;
                } else {
                    C24362h.m61210e(String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{uVar.toString(), facebookRequestError.toString()}, 2)), "java.lang.String.format(format, *args)");
                    flushResult = FlushResult.SERVER_ERROR;
                }
                C0115o oVar2 = C0115o.f331a;
                C0115o.m218i(LoggingBehavior.APP_EVENTS);
                if (facebookRequestError == null) {
                    z = false;
                }
                qVar.mo12511b(z);
                FlushResult flushResult3 = FlushResult.NO_CONNECTIVITY;
                if (flushResult == flushResult3) {
                    C0115o.m212c().execute(new C7103t(4, accessTokenAppIdPair, qVar));
                }
                if (flushResult != flushResult2 && ((FlushResult) oVar.f8562b) != flushResult3) {
                    C24362h.m61211f(flushResult, "<set-?>");
                    oVar.f8562b = flushResult;
                }
            } catch (Throwable th) {
                C6606a.m15600a(cls, th);
            }
        }
    }

    /* renamed from: f */
    public static final C2349o m6201f(FlushReason flushReason, C1042u uVar) {
        Class<C2335g> cls = C2335g.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            C24362h.m61211f(flushReason, "reason");
            C24362h.m61211f(uVar, "appEventCollection");
            C2349o oVar = new C2349o(0);
            ArrayList b = m6197b(uVar, oVar);
            if (!(!b.isEmpty())) {
                return null;
            }
            C2436x.C2437a aVar = C2436x.f8729d;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String str = f8528a;
            C24362h.m61210e(str, "TAG");
            C2436x.C2437a.m6390b(loggingBehavior, str, "Flushing %d events due to %s.", Integer.valueOf(oVar.f8561a), flushReason.toString());
            Iterator it = b.iterator();
            while (it.hasNext()) {
                ((GraphRequest) it.next()).mo11903c();
            }
            return oVar;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }
}
