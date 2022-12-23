package p030bo.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.appboy.Constants;
import com.appboy.support.AppboyLogger;
import com.appboy.support.HandlerUtils;
import com.braze.configuration.BrazeConfigurationProvider;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import p030bo.app.C1531b1;
import p030bo.app.C1671q2;

/* renamed from: bo.app.n1 */
public class C1642n1 implements C1707v1 {

    /* renamed from: q */
    public static final String f5840q = AppboyLogger.getBrazeLogTag(C1642n1.class);

    /* renamed from: r */
    public static final String[] f5841r = {"android.os.deadsystemexception"};

    /* renamed from: a */
    public final AtomicInteger f5842a = new AtomicInteger(0);

    /* renamed from: b */
    public final AtomicInteger f5843b = new AtomicInteger(0);

    /* renamed from: c */
    public final Object f5844c = new Object();

    /* renamed from: d */
    public final Object f5845d = new Object();

    /* renamed from: e */
    public final C1660p1 f5846e;

    /* renamed from: f */
    public final C1650o1 f5847f;

    /* renamed from: g */
    public final C1600i0 f5848g;

    /* renamed from: h */
    public final BrazeConfigurationProvider f5849h;

    /* renamed from: i */
    public final C1558d4 f5850i;

    /* renamed from: j */
    public final C1686s1 f5851j;

    /* renamed from: k */
    public final String f5852k;

    /* renamed from: l */
    public final C1550c4 f5853l;

    /* renamed from: m */
    public final Handler f5854m;

    /* renamed from: n */
    public final C1737y3 f5855n;

    /* renamed from: o */
    public volatile String f5856o = "";

    /* renamed from: p */
    public Class<? extends Activity> f5857p = null;

    public C1642n1(Context context, String str, String str2, C1660p1 p1Var, C1600i0 i0Var, BrazeConfigurationProvider brazeConfigurationProvider, C1558d4 d4Var, C1686s1 s1Var, String str3, boolean z, C1650o1 o1Var, C1550c4 c4Var) {
        this.f5846e = p1Var;
        this.f5848g = i0Var;
        this.f5849h = brazeConfigurationProvider;
        this.f5852k = str3;
        this.f5850i = d4Var;
        this.f5851j = s1Var;
        this.f5847f = o1Var;
        this.f5853l = c4Var;
        this.f5854m = HandlerUtils.createHandler();
        this.f5855n = new C1737y3(context, str, str2);
    }

    /* renamed from: a */
    public void mo6237a(Throwable th) {
        mo6238a(th, false);
    }

    /* renamed from: a */
    public void mo6240a(boolean z) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0159, code lost:
        if (r2 == false) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x015b, code lost:
        r7.f5854m.removeCallbacksAndMessages((java.lang.Object) null);
        r7.f5854m.postDelayed(new androidx.appcompat.widget.C0416i1(r7, 4), 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x016e, code lost:
        return true;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo6243b(p030bo.app.C1594h2 r8) {
        /*
            r7 = this;
            java.lang.Class<bo.app.b1> r0 = p030bo.app.C1531b1.class
            bo.app.c4 r1 = r7.f5853l
            boolean r1 = r1.mo5958a()
            r2 = 0
            if (r1 == 0) goto L_0x0022
            java.lang.String r0 = f5840q
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "SDK is disabled. Not logging event: "
            r1.append(r3)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            com.appboy.support.AppboyLogger.m5459w((java.lang.String) r0, (java.lang.String) r8)
            return r2
        L_0x0022:
            java.lang.Object r1 = r7.f5844c
            monitor-enter(r1)
            if (r8 == 0) goto L_0x016f
            bo.app.y3 r3 = r7.f5855n     // Catch:{ all -> 0x017c }
            boolean r3 = r3.mo6479b((p030bo.app.C1594h2) r8)     // Catch:{ all -> 0x017c }
            if (r3 != 0) goto L_0x0047
            java.lang.String r0 = f5840q     // Catch:{ all -> 0x017c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x017c }
            r3.<init>()     // Catch:{ all -> 0x017c }
            java.lang.String r4 = "Not processing event after validation failed: "
            r3.append(r4)     // Catch:{ all -> 0x017c }
            r3.append(r8)     // Catch:{ all -> 0x017c }
            java.lang.String r8 = r3.toString()     // Catch:{ all -> 0x017c }
            com.appboy.support.AppboyLogger.m5459w((java.lang.String) r0, (java.lang.String) r8)     // Catch:{ all -> 0x017c }
            monitor-exit(r1)     // Catch:{ all -> 0x017c }
            return r2
        L_0x0047:
            bo.app.p1 r3 = r7.f5846e     // Catch:{ all -> 0x017c }
            boolean r3 = r3.mo6284g()     // Catch:{ all -> 0x017c }
            r4 = 1
            if (r3 != 0) goto L_0x0062
            bo.app.p1 r3 = r7.f5846e     // Catch:{ all -> 0x017c }
            bo.app.l2 r3 = r3.mo6282e()     // Catch:{ all -> 0x017c }
            if (r3 == 0) goto L_0x0062
            bo.app.p1 r3 = r7.f5846e     // Catch:{ all -> 0x017c }
            bo.app.l2 r3 = r3.mo6282e()     // Catch:{ all -> 0x017c }
            r8.mo6139a((p030bo.app.C1627l2) r3)     // Catch:{ all -> 0x017c }
            goto L_0x0094
        L_0x0062:
            java.lang.String r2 = f5840q     // Catch:{ all -> 0x017c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x017c }
            r3.<init>()     // Catch:{ all -> 0x017c }
            java.lang.String r5 = "Not adding session id to event: "
            r3.append(r5)     // Catch:{ all -> 0x017c }
            java.lang.Object r5 = r8.forJsonPut()     // Catch:{ all -> 0x017c }
            org.json.JSONObject r5 = (org.json.JSONObject) r5     // Catch:{ all -> 0x017c }
            java.lang.String r5 = com.appboy.support.JsonUtils.getPrettyPrintedString((org.json.JSONObject) r5)     // Catch:{ all -> 0x017c }
            r3.append(r5)     // Catch:{ all -> 0x017c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x017c }
            com.appboy.support.AppboyLogger.m5448d(r2, r3)     // Catch:{ all -> 0x017c }
            bo.app.b0 r3 = r8.mo6142j()     // Catch:{ all -> 0x017c }
            bo.app.b0 r5 = p030bo.app.C1530b0.SESSION_START     // Catch:{ all -> 0x017c }
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x017c }
            if (r3 == 0) goto L_0x0093
            java.lang.String r3 = "Session start event logged without a Session ID."
            com.appboy.support.AppboyLogger.m5459w((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x017c }
        L_0x0093:
            r2 = 1
        L_0x0094:
            java.lang.String r3 = r7.mo6228a()     // Catch:{ all -> 0x017c }
            boolean r3 = com.appboy.support.StringUtils.isNullOrEmpty(r3)     // Catch:{ all -> 0x017c }
            if (r3 != 0) goto L_0x00a6
            java.lang.String r3 = r7.mo6228a()     // Catch:{ all -> 0x017c }
            r8.mo6140a((java.lang.String) r3)     // Catch:{ all -> 0x017c }
            goto L_0x00c6
        L_0x00a6:
            java.lang.String r3 = f5840q     // Catch:{ all -> 0x017c }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x017c }
            r5.<init>()     // Catch:{ all -> 0x017c }
            java.lang.String r6 = "Not adding user id to event: "
            r5.append(r6)     // Catch:{ all -> 0x017c }
            java.lang.Object r6 = r8.forJsonPut()     // Catch:{ all -> 0x017c }
            org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ all -> 0x017c }
            java.lang.String r6 = com.appboy.support.JsonUtils.getPrettyPrintedString((org.json.JSONObject) r6)     // Catch:{ all -> 0x017c }
            r5.append(r6)     // Catch:{ all -> 0x017c }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x017c }
            com.appboy.support.AppboyLogger.m5448d(r3, r5)     // Catch:{ all -> 0x017c }
        L_0x00c6:
            java.lang.String r3 = f5840q     // Catch:{ all -> 0x017c }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x017c }
            r5.<init>()     // Catch:{ all -> 0x017c }
            java.lang.String r6 = "Attempting to log event: "
            r5.append(r6)     // Catch:{ all -> 0x017c }
            java.lang.Object r6 = r8.forJsonPut()     // Catch:{ all -> 0x017c }
            org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ all -> 0x017c }
            java.lang.String r6 = com.appboy.support.JsonUtils.getPrettyPrintedString((org.json.JSONObject) r6)     // Catch:{ all -> 0x017c }
            r5.append(r6)     // Catch:{ all -> 0x017c }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x017c }
            com.appboy.support.AppboyLogger.m5457v(r3, r5)     // Catch:{ all -> 0x017c }
            boolean r5 = r8 instanceof p030bo.app.C1701u2     // Catch:{ all -> 0x017c }
            if (r5 == 0) goto L_0x00f5
            java.lang.String r5 = "Publishing an internal push body clicked event for any awaiting triggers."
            com.appboy.support.AppboyLogger.m5448d(r3, r5)     // Catch:{ all -> 0x017c }
            r5 = r8
            bo.app.u2 r5 = (p030bo.app.C1701u2) r5     // Catch:{ all -> 0x017c }
            r7.mo6234a((p030bo.app.C1701u2) r5)     // Catch:{ all -> 0x017c }
        L_0x00f5:
            boolean r5 = r8.mo6141d()     // Catch:{ all -> 0x017c }
            if (r5 != 0) goto L_0x0100
            bo.app.s1 r5 = r7.f5851j     // Catch:{ all -> 0x017c }
            r5.mo6363a((p030bo.app.C1594h2) r8)     // Catch:{ all -> 0x017c }
        L_0x0100:
            boolean r5 = m4500a((boolean) r2, (p030bo.app.C1594h2) r8)     // Catch:{ all -> 0x017c }
            if (r5 == 0) goto L_0x0120
            java.lang.String r5 = "Adding push click to dispatcher pending list"
            com.appboy.support.AppboyLogger.m5448d(r3, r5)     // Catch:{ all -> 0x017c }
            bo.app.i0 r3 = r7.f5848g     // Catch:{ all -> 0x017c }
            bo.app.b1$b r5 = new bo.app.b1$b     // Catch:{ all -> 0x017c }
            bo.app.b1$c r6 = p030bo.app.C1531b1.C1534c.ADD_PENDING_BRAZE_EVENT     // Catch:{ all -> 0x017c }
            r5.<init>(r6)     // Catch:{ all -> 0x017c }
            bo.app.b1$b r5 = r5.mo5908a((p030bo.app.C1594h2) r8)     // Catch:{ all -> 0x017c }
            bo.app.b1 r5 = r5.mo5911a()     // Catch:{ all -> 0x017c }
            r3.mo6134a(r5, r0)     // Catch:{ all -> 0x017c }
            goto L_0x0134
        L_0x0120:
            bo.app.i0 r3 = r7.f5848g     // Catch:{ all -> 0x017c }
            bo.app.b1$b r5 = new bo.app.b1$b     // Catch:{ all -> 0x017c }
            bo.app.b1$c r6 = p030bo.app.C1531b1.C1534c.ADD_BRAZE_EVENT     // Catch:{ all -> 0x017c }
            r5.<init>(r6)     // Catch:{ all -> 0x017c }
            bo.app.b1$b r5 = r5.mo5908a((p030bo.app.C1594h2) r8)     // Catch:{ all -> 0x017c }
            bo.app.b1 r5 = r5.mo5911a()     // Catch:{ all -> 0x017c }
            r3.mo6134a(r5, r0)     // Catch:{ all -> 0x017c }
        L_0x0134:
            bo.app.b0 r3 = r8.mo6142j()     // Catch:{ all -> 0x017c }
            bo.app.b0 r5 = p030bo.app.C1530b0.SESSION_START     // Catch:{ all -> 0x017c }
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x017c }
            if (r3 == 0) goto L_0x0158
            bo.app.i0 r3 = r7.f5848g     // Catch:{ all -> 0x017c }
            bo.app.b1$b r5 = new bo.app.b1$b     // Catch:{ all -> 0x017c }
            bo.app.b1$c r6 = p030bo.app.C1531b1.C1534c.FLUSH_PENDING_BRAZE_EVENTS     // Catch:{ all -> 0x017c }
            r5.<init>(r6)     // Catch:{ all -> 0x017c }
            bo.app.l2 r8 = r8.mo6144n()     // Catch:{ all -> 0x017c }
            bo.app.b1$b r8 = r5.mo5910a((p030bo.app.C1627l2) r8)     // Catch:{ all -> 0x017c }
            bo.app.b1 r8 = r8.mo5911a()     // Catch:{ all -> 0x017c }
            r3.mo6134a(r8, r0)     // Catch:{ all -> 0x017c }
        L_0x0158:
            monitor-exit(r1)     // Catch:{ all -> 0x017c }
            if (r2 == 0) goto L_0x016e
            android.os.Handler r8 = r7.f5854m
            r0 = 0
            r8.removeCallbacksAndMessages(r0)
            android.os.Handler r8 = r7.f5854m
            androidx.appcompat.widget.i1 r0 = new androidx.appcompat.widget.i1
            r1 = 4
            r0.<init>(r7, r1)
            r1 = 1000(0x3e8, double:4.94E-321)
            r8.postDelayed(r0, r1)
        L_0x016e:
            return r4
        L_0x016f:
            java.lang.String r8 = f5840q     // Catch:{ all -> 0x017c }
            java.lang.String r0 = "Appboy manager received null event."
            com.appboy.support.AppboyLogger.m5459w((java.lang.String) r8, (java.lang.String) r0)     // Catch:{ all -> 0x017c }
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch:{ all -> 0x017c }
            r8.<init>()     // Catch:{ all -> 0x017c }
            throw r8     // Catch:{ all -> 0x017c }
        L_0x017c:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x017c }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C1642n1.mo6243b(bo.app.h2):boolean");
    }

    /* renamed from: c */
    public C1619k2 mo6244c() {
        if (this.f5853l.mo5958a()) {
            AppboyLogger.m5459w(f5840q, "SDK is disabled. Returning null session.");
            return null;
        }
        C1619k2 k = this.f5846e.mo6288k();
        String str = f5840q;
        StringBuilder k2 = C13555b.m33972k("Completed the openSession call. Starting or continuing session ");
        k2.append(k.mo6187n());
        AppboyLogger.m5453i(str, k2.toString());
        return k;
    }

    public C1619k2 closeSession(Activity activity) {
        if (this.f5853l.mo5958a()) {
            AppboyLogger.m5459w(f5840q, "SDK is disabled. Returning null session.");
            return null;
        } else if (this.f5857p != null && !activity.getClass().equals(this.f5857p)) {
            return null;
        } else {
            this.f5847f.mo6263c();
            try {
                String str = f5840q;
                AppboyLogger.m5457v(str, "Closed session with activity: " + activity.getLocalClassName());
            } catch (Exception e) {
                AppboyLogger.m5452e(f5840q, "Failed to get local class name for activity when closing session", e);
            }
            return this.f5846e.mo6289l();
        }
    }

    /* renamed from: d */
    public void mo6247d() {
        if (this.f5853l.mo5958a()) {
            AppboyLogger.m5459w(f5840q, "SDK is disabled. Not force closing session.");
            return;
        }
        this.f5857p = null;
        this.f5846e.mo6286i();
    }

    /* renamed from: e */
    public C1627l2 mo6248e() {
        return this.f5846e.mo6282e();
    }

    public C1619k2 openSession(Activity activity) {
        if (this.f5853l.mo5958a()) {
            AppboyLogger.m5459w(f5840q, "SDK is disabled. Returning null session.");
            return null;
        }
        C1619k2 c = mo6244c();
        this.f5857p = activity.getClass();
        this.f5847f.mo6262b();
        try {
            String str = f5840q;
            AppboyLogger.m5457v(str, "Opened session with activity: " + activity.getLocalClassName());
        } catch (Exception e) {
            AppboyLogger.m5452e(f5840q, "Failed to get local class name for activity when opening session", e);
        }
        return c;
    }

    /* renamed from: a */
    public void mo6233a(C1671q2.C1673b bVar) {
        if (bVar == null) {
            AppboyLogger.m5448d(f5840q, "Cannot request data sync with null respond with object");
            return;
        }
        if (this.f5850i != null) {
            bVar.mo6330a(new C1663p2(this.f5850i.mo6009e(), this.f5850i.mo6005a()));
        }
        bVar.mo6331a(mo6228a());
        mo6232a((C1620k3) new C1586g3(this.f5849h.getBaseUrlForRequests(), bVar.mo6332a()));
    }

    /* renamed from: c */
    public final boolean mo6245c(Throwable th) {
        synchronized (this.f5845d) {
            this.f5842a.getAndIncrement();
            if (this.f5856o.equals(th.getMessage()) && this.f5843b.get() > 3 && this.f5842a.get() < 100) {
                return true;
            }
            if (this.f5856o.equals(th.getMessage())) {
                this.f5843b.getAndIncrement();
            } else {
                this.f5843b.set(0);
            }
            if (this.f5842a.get() >= 100) {
                this.f5842a.set(0);
            }
            this.f5856o = th.getMessage();
            return false;
        }
    }

    /* renamed from: a */
    public void mo6231a(C1602i2 i2Var) {
        AppboyLogger.m5448d(f5840q, "Posting geofence request for location.");
        mo6232a((C1620k3) new C1603i3(this.f5849h.getBaseUrlForRequests(), i2Var));
    }

    /* renamed from: a */
    public void mo6232a(C1620k3 k3Var) {
        if (this.f5853l.mo5958a()) {
            AppboyLogger.m5459w(f5840q, "SDK is disabled. Not adding request to dispatch.");
        } else {
            this.f5848g.mo6134a(new C1531b1.C1533b(C1531b1.C1534c.ADD_REQUEST).mo5909a(k3Var).mo5911a(), C1531b1.class);
        }
    }

    /* renamed from: a */
    public void mo6230a(C1594h2 h2Var) {
        AppboyLogger.m5448d(f5840q, "Posting geofence report for geofence event.");
        mo6232a((C1620k3) new C1611j3(this.f5849h.getBaseUrlForRequests(), h2Var));
    }

    /* renamed from: a */
    public void mo6236a(C1727x4 x4Var, C1721w5 w5Var) {
        mo6232a((C1620k3) new C1664p3(this.f5849h.getBaseUrlForRequests(), x4Var, w5Var, this, mo6228a()));
    }

    /* renamed from: a */
    public void mo6235a(C1721w5 w5Var) {
        this.f5848g.mo6134a(new C1734y0(w5Var), C1734y0.class);
    }

    /* renamed from: a */
    public void mo6239a(List<String> list, long j) {
        mo6232a((C1620k3) new C1674q3(this.f5849h.getBaseUrlForRequests(), list, j, this.f5852k));
    }

    /* renamed from: a */
    public void mo6229a(long j, long j2) {
        mo6232a((C1620k3) new C1577f3(this.f5849h.getBaseUrlForRequests(), j, j2, this.f5852k));
    }

    /* renamed from: a */
    public String mo6228a() {
        return this.f5852k;
    }

    /* renamed from: a */
    public void mo6238a(Throwable th, boolean z) {
        try {
            if (mo6245c(th)) {
                String str = f5840q;
                AppboyLogger.m5459w(str, "Not logging duplicate error: " + th);
                return;
            }
            String th2 = th.toString();
            String[] strArr = f5841r;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                if (!th2.toLowerCase(Locale.US).contains(strArr[i])) {
                    i++;
                } else {
                    return;
                }
            }
            mo6243b((C1594h2) C1687s2.m4699a(th, mo6248e(), z));
        } catch (Exception e) {
            AppboyLogger.m5452e(f5840q, "Failed to log error.", e);
        }
    }

    /* renamed from: a */
    public static boolean m4500a(boolean z, C1594h2 h2Var) {
        if (!z) {
            return false;
        }
        if (h2Var instanceof C1694t2) {
            return !((C1694t2) h2Var).mo6376y();
        }
        if ((h2Var instanceof C1701u2) || (h2Var instanceof C1708v2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo6234a(C1701u2 u2Var) {
        JSONObject k = u2Var.mo6143k();
        if (k != null) {
            this.f5848g.mo6134a(new C1723x0(k.optString(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY, (String) null), u2Var), C1723x0.class);
            return;
        }
        AppboyLogger.m5459w(f5840q, "Event json was null. Not publishing push clicked trigger event.");
    }

    /* renamed from: b */
    public void mo6242b(Throwable th) {
        mo6238a(th, true);
    }

    /* renamed from: b */
    public void m4501f() {
        mo6233a(new C1671q2.C1673b());
    }
}
