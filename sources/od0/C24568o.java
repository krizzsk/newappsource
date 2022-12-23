package od0;

import android.text.TextUtils;
import ce0.C21100e;
import com.appboy.models.outgoing.AttributionData;
import com.usebutton.sdk.internal.events.Events;
import com.vungle.warren.AdConfig;
import com.vungle.warren.C23181n1;
import java.util.ArrayList;
import java.util.Iterator;
import p359ag.C13447d;
import p359ag.C13452i;
import p384bg.C13622c;

/* renamed from: od0.o */
public final class C24568o {

    /* renamed from: a */
    public int f62269a = 0;

    /* renamed from: b */
    public String f62270b;

    /* renamed from: c */
    public String f62271c;

    /* renamed from: d */
    public String f62272d;

    /* renamed from: e */
    public boolean f62273e;

    /* renamed from: f */
    public boolean f62274f;

    /* renamed from: g */
    public boolean f62275g;

    /* renamed from: h */
    public long f62276h;

    /* renamed from: i */
    public String f62277i;

    /* renamed from: j */
    public long f62278j;

    /* renamed from: k */
    public long f62279k;

    /* renamed from: l */
    public long f62280l;

    /* renamed from: m */
    public String f62281m;

    /* renamed from: n */
    public int f62282n;

    /* renamed from: o */
    public final ArrayList f62283o = new ArrayList();

    /* renamed from: p */
    public final ArrayList f62284p = new ArrayList();

    /* renamed from: q */
    public final ArrayList f62285q = new ArrayList();

    /* renamed from: r */
    public String f62286r;

    /* renamed from: s */
    public String f62287s;

    /* renamed from: t */
    public String f62288t;

    /* renamed from: u */
    public int f62289u;

    /* renamed from: v */
    public String f62290v;

    /* renamed from: w */
    public volatile boolean f62291w;

    /* renamed from: x */
    public long f62292x;

    /* renamed from: y */
    public long f62293y;

    /* renamed from: od0.o$a */
    public static class C24569a {
        @C13622c("action")

        /* renamed from: a */
        private String f62294a;
        @C13622c("value")

        /* renamed from: b */
        private String f62295b;
        @C13622c("timestamp")

        /* renamed from: c */
        private long f62296c;

        public C24569a(String str, String str2, long j) {
            this.f62294a = str;
            this.f62295b = str2;
            this.f62296c = j;
        }

        /* renamed from: a */
        public final C13452i mo60842a() {
            C13452i iVar = new C13452i();
            iVar.mo40349F(Events.PROPERTY_ACTION, this.f62294a);
            String str = this.f62295b;
            if (str != null && !str.isEmpty()) {
                iVar.mo40349F("value", this.f62295b);
            }
            iVar.mo40348E("timestamp_millis", Long.valueOf(this.f62296c));
            return iVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C24569a.class != obj.getClass()) {
                return false;
            }
            C24569a aVar = (C24569a) obj;
            if (aVar.f62294a.equals(this.f62294a) && aVar.f62295b.equals(this.f62295b) && aVar.f62296c == this.f62296c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int d = C13715c.m34238d(this.f62295b, this.f62294a.hashCode() * 31, 31);
            long j = this.f62296c;
            return d + ((int) (j ^ (j >>> 32)));
        }
    }

    public C24568o() {
    }

    /* renamed from: a */
    public final String mo60837a() {
        return this.f62270b + "_" + this.f62276h;
    }

    /* renamed from: b */
    public final synchronized void mo60838b(long j, String str, String str2) {
        this.f62283o.add(new C24569a(str, str2, j));
        this.f62284p.add(str);
        if (str.equals("download")) {
            this.f62291w = true;
        }
    }

    /* renamed from: c */
    public final synchronized C13452i mo60839c() {
        C13452i iVar;
        int i;
        iVar = new C13452i();
        iVar.mo40349F("placement_reference_id", this.f62270b);
        iVar.mo40349F("ad_token", this.f62271c);
        iVar.mo40349F("app_id", this.f62272d);
        if (this.f62273e) {
            i = 1;
        } else {
            i = 0;
        }
        iVar.mo40348E("incentivized", Integer.valueOf(i));
        iVar.mo40347D("header_bidding", Boolean.valueOf(this.f62274f));
        iVar.mo40347D("play_remote_assets", Boolean.valueOf(this.f62275g));
        iVar.mo40348E("adStartTime", Long.valueOf(this.f62276h));
        if (!TextUtils.isEmpty(this.f62277i)) {
            iVar.mo40349F("url", this.f62277i);
        }
        iVar.mo40348E("adDuration", Long.valueOf(this.f62279k));
        iVar.mo40348E("ttDownload", Long.valueOf(this.f62280l));
        iVar.mo40349F(AttributionData.CAMPAIGN_KEY, this.f62281m);
        iVar.mo40349F("adType", this.f62286r);
        iVar.mo40349F("templateId", this.f62287s);
        iVar.mo40348E("init_timestamp", Long.valueOf(this.f62292x));
        iVar.mo40348E("asset_download_duration", Long.valueOf(this.f62293y));
        if (!TextUtils.isEmpty(this.f62290v)) {
            iVar.mo40349F("ad_size", this.f62290v);
        }
        C13447d dVar = new C13447d();
        C13452i iVar2 = new C13452i();
        iVar2.mo40348E("startTime", Long.valueOf(this.f62276h));
        int i2 = this.f62282n;
        if (i2 > 0) {
            iVar2.mo40348E("videoViewed", Integer.valueOf(i2));
        }
        long j = this.f62278j;
        if (j > 0) {
            iVar2.mo40348E("videoLength", Long.valueOf(j));
        }
        C13447d dVar2 = new C13447d();
        Iterator it = this.f62283o.iterator();
        while (it.hasNext()) {
            dVar2.mo40327C(((C24569a) it.next()).mo60842a());
        }
        iVar2.mo40346C(dVar2, "userActions");
        dVar.mo40327C(iVar2);
        iVar.mo40346C(dVar, "plays");
        C13447d dVar3 = new C13447d();
        Iterator it2 = this.f62285q.iterator();
        while (it2.hasNext()) {
            dVar3.mo40328D((String) it2.next());
        }
        iVar.mo40346C(dVar3, "errors");
        C13447d dVar4 = new C13447d();
        Iterator it3 = this.f62284p.iterator();
        while (it3.hasNext()) {
            dVar4.mo40328D((String) it3.next());
        }
        iVar.mo40346C(dVar4, "clickedThrough");
        if (this.f62273e && !TextUtils.isEmpty(this.f62288t)) {
            iVar.mo40349F("user", this.f62288t);
        }
        int i3 = this.f62289u;
        if (i3 > 0) {
            iVar.mo40348E("ordinal_view", Integer.valueOf(i3));
        }
        return iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0165, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 1
            if (r7 != r8) goto L_0x0006
            monitor-exit(r7)
            return r0
        L_0x0006:
            r1 = 0
            if (r8 == 0) goto L_0x0164
            java.lang.Class<od0.o> r2 = od0.C24568o.class
            java.lang.Class r3 = r8.getClass()     // Catch:{ all -> 0x0161 }
            if (r2 == r3) goto L_0x0013
            goto L_0x0164
        L_0x0013:
            od0.o r8 = (od0.C24568o) r8     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = r8.f62270b     // Catch:{ all -> 0x0161 }
            java.lang.String r3 = r7.f62270b     // Catch:{ all -> 0x0161 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0161 }
            if (r2 != 0) goto L_0x0021
            monitor-exit(r7)
            return r1
        L_0x0021:
            java.lang.String r2 = r8.f62271c     // Catch:{ all -> 0x0161 }
            java.lang.String r3 = r7.f62271c     // Catch:{ all -> 0x0161 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0161 }
            if (r2 != 0) goto L_0x002d
            monitor-exit(r7)
            return r1
        L_0x002d:
            java.lang.String r2 = r8.f62272d     // Catch:{ all -> 0x0161 }
            java.lang.String r3 = r7.f62272d     // Catch:{ all -> 0x0161 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0161 }
            if (r2 != 0) goto L_0x0039
            monitor-exit(r7)
            return r1
        L_0x0039:
            boolean r2 = r8.f62273e     // Catch:{ all -> 0x0161 }
            boolean r3 = r7.f62273e     // Catch:{ all -> 0x0161 }
            if (r2 == r3) goto L_0x0041
            monitor-exit(r7)
            return r1
        L_0x0041:
            boolean r2 = r8.f62274f     // Catch:{ all -> 0x0161 }
            boolean r3 = r7.f62274f     // Catch:{ all -> 0x0161 }
            if (r2 == r3) goto L_0x0049
            monitor-exit(r7)
            return r1
        L_0x0049:
            long r2 = r8.f62276h     // Catch:{ all -> 0x0161 }
            long r4 = r7.f62276h     // Catch:{ all -> 0x0161 }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0053
            monitor-exit(r7)
            return r1
        L_0x0053:
            java.lang.String r2 = r8.f62277i     // Catch:{ all -> 0x0161 }
            java.lang.String r3 = r7.f62277i     // Catch:{ all -> 0x0161 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0161 }
            if (r2 != 0) goto L_0x005f
            monitor-exit(r7)
            return r1
        L_0x005f:
            long r2 = r8.f62278j     // Catch:{ all -> 0x0161 }
            long r4 = r7.f62278j     // Catch:{ all -> 0x0161 }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0069
            monitor-exit(r7)
            return r1
        L_0x0069:
            long r2 = r8.f62279k     // Catch:{ all -> 0x0161 }
            long r4 = r7.f62279k     // Catch:{ all -> 0x0161 }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0073
            monitor-exit(r7)
            return r1
        L_0x0073:
            long r2 = r8.f62280l     // Catch:{ all -> 0x0161 }
            long r4 = r7.f62280l     // Catch:{ all -> 0x0161 }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x007d
            monitor-exit(r7)
            return r1
        L_0x007d:
            java.lang.String r2 = r8.f62281m     // Catch:{ all -> 0x0161 }
            java.lang.String r3 = r7.f62281m     // Catch:{ all -> 0x0161 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0161 }
            if (r2 != 0) goto L_0x0089
            monitor-exit(r7)
            return r1
        L_0x0089:
            java.lang.String r2 = r8.f62286r     // Catch:{ all -> 0x0161 }
            java.lang.String r3 = r7.f62286r     // Catch:{ all -> 0x0161 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0161 }
            if (r2 != 0) goto L_0x0095
            monitor-exit(r7)
            return r1
        L_0x0095:
            java.lang.String r2 = r8.f62287s     // Catch:{ all -> 0x0161 }
            java.lang.String r3 = r7.f62287s     // Catch:{ all -> 0x0161 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0161 }
            if (r2 != 0) goto L_0x00a1
            monitor-exit(r7)
            return r1
        L_0x00a1:
            boolean r2 = r8.f62291w     // Catch:{ all -> 0x0161 }
            boolean r3 = r7.f62291w     // Catch:{ all -> 0x0161 }
            if (r2 == r3) goto L_0x00a9
            monitor-exit(r7)
            return r1
        L_0x00a9:
            java.lang.String r2 = r8.f62288t     // Catch:{ all -> 0x0161 }
            java.lang.String r3 = r7.f62288t     // Catch:{ all -> 0x0161 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0161 }
            if (r2 != 0) goto L_0x00b5
            monitor-exit(r7)
            return r1
        L_0x00b5:
            long r2 = r8.f62292x     // Catch:{ all -> 0x0161 }
            long r4 = r7.f62292x     // Catch:{ all -> 0x0161 }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x00bf
            monitor-exit(r7)
            return r1
        L_0x00bf:
            long r2 = r8.f62293y     // Catch:{ all -> 0x0161 }
            long r4 = r7.f62293y     // Catch:{ all -> 0x0161 }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x00c9
            monitor-exit(r7)
            return r1
        L_0x00c9:
            java.util.ArrayList r2 = r8.f62284p     // Catch:{ all -> 0x0161 }
            int r2 = r2.size()     // Catch:{ all -> 0x0161 }
            java.util.ArrayList r3 = r7.f62284p     // Catch:{ all -> 0x0161 }
            int r3 = r3.size()     // Catch:{ all -> 0x0161 }
            if (r2 == r3) goto L_0x00d9
            monitor-exit(r7)
            return r1
        L_0x00d9:
            r2 = 0
        L_0x00da:
            java.util.ArrayList r3 = r7.f62284p     // Catch:{ all -> 0x0161 }
            int r3 = r3.size()     // Catch:{ all -> 0x0161 }
            if (r2 >= r3) goto L_0x00fb
            java.util.ArrayList r3 = r8.f62284p     // Catch:{ all -> 0x0161 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0161 }
            java.util.ArrayList r4 = r7.f62284p     // Catch:{ all -> 0x0161 }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ all -> 0x0161 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0161 }
            if (r3 != 0) goto L_0x00f8
            monitor-exit(r7)
            return r1
        L_0x00f8:
            int r2 = r2 + 1
            goto L_0x00da
        L_0x00fb:
            java.util.ArrayList r2 = r8.f62285q     // Catch:{ all -> 0x0161 }
            int r2 = r2.size()     // Catch:{ all -> 0x0161 }
            java.util.ArrayList r3 = r7.f62285q     // Catch:{ all -> 0x0161 }
            int r3 = r3.size()     // Catch:{ all -> 0x0161 }
            if (r2 == r3) goto L_0x010b
            monitor-exit(r7)
            return r1
        L_0x010b:
            r2 = 0
        L_0x010c:
            java.util.ArrayList r3 = r7.f62285q     // Catch:{ all -> 0x0161 }
            int r3 = r3.size()     // Catch:{ all -> 0x0161 }
            if (r2 >= r3) goto L_0x012d
            java.util.ArrayList r3 = r8.f62285q     // Catch:{ all -> 0x0161 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0161 }
            java.util.ArrayList r4 = r7.f62285q     // Catch:{ all -> 0x0161 }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ all -> 0x0161 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0161 }
            if (r3 != 0) goto L_0x012a
            monitor-exit(r7)
            return r1
        L_0x012a:
            int r2 = r2 + 1
            goto L_0x010c
        L_0x012d:
            java.util.ArrayList r2 = r8.f62283o     // Catch:{ all -> 0x0161 }
            int r2 = r2.size()     // Catch:{ all -> 0x0161 }
            java.util.ArrayList r3 = r7.f62283o     // Catch:{ all -> 0x0161 }
            int r3 = r3.size()     // Catch:{ all -> 0x0161 }
            if (r2 == r3) goto L_0x013d
            monitor-exit(r7)
            return r1
        L_0x013d:
            r2 = 0
        L_0x013e:
            java.util.ArrayList r3 = r7.f62283o     // Catch:{ all -> 0x0161 }
            int r3 = r3.size()     // Catch:{ all -> 0x0161 }
            if (r2 >= r3) goto L_0x015f
            java.util.ArrayList r3 = r8.f62283o     // Catch:{ all -> 0x0161 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0161 }
            od0.o$a r3 = (od0.C24568o.C24569a) r3     // Catch:{ all -> 0x0161 }
            java.util.ArrayList r4 = r7.f62283o     // Catch:{ all -> 0x0161 }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ all -> 0x0161 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0161 }
            if (r3 != 0) goto L_0x015c
            monitor-exit(r7)
            return r1
        L_0x015c:
            int r2 = r2 + 1
            goto L_0x013e
        L_0x015f:
            monitor-exit(r7)
            return r0
        L_0x0161:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L_0x0164:
            monitor-exit(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: od0.C24568o.equals(java.lang.Object):boolean");
    }

    public final synchronized int hashCode() {
        int i;
        int i2;
        int i3;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        int d0 = ((((C21100e.m49335d0(this.f62270b) * 31) + C21100e.m49335d0(this.f62271c)) * 31) + C21100e.m49335d0(this.f62272d)) * 31;
        i = 0;
        if (this.f62273e) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        i3 = (d0 + i2) * 31;
        if (this.f62274f) {
            i = 1;
        }
        j = this.f62276h;
        j2 = this.f62278j;
        j3 = this.f62279k;
        j4 = this.f62280l;
        j5 = this.f62292x;
        j6 = this.f62293y;
        return ((((((((((((((((((((((((((((((i3 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + C21100e.m49335d0(this.f62277i)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + C21100e.m49335d0(this.f62281m)) * 31) + C21100e.m49335d0(this.f62283o)) * 31) + C21100e.m49335d0(this.f62284p)) * 31) + C21100e.m49335d0(this.f62285q)) * 31) + C21100e.m49335d0(this.f62286r)) * 31) + C21100e.m49335d0(this.f62287s)) * 31) + C21100e.m49335d0(this.f62288t)) * 31) + (this.f62291w ? 1 : 0);
    }

    public C24568o(C24545c cVar, C24566m mVar, long j, String str) {
        this.f62270b = mVar.f62257a;
        this.f62271c = cVar.f62226y;
        this.f62272d = cVar.f62206e;
        this.f62273e = mVar.f62259c;
        this.f62274f = mVar.f62263g;
        this.f62276h = j;
        this.f62277i = cVar.f62215n;
        this.f62280l = -1;
        this.f62281m = cVar.f62211j;
        C23181n1.m57208b().getClass();
        this.f62292x = C23181n1.f58841p;
        this.f62293y = cVar.f62197S;
        int i = cVar.f62204c;
        if (i == 0) {
            this.f62286r = "vungle_local";
        } else if (i == 1) {
            this.f62286r = "vungle_mraid";
        } else {
            throw new IllegalArgumentException("Unknown ad type, cannot process!");
        }
        this.f62287s = cVar.f62184F;
        if (str == null) {
            this.f62288t = "";
        } else {
            this.f62288t = str;
        }
        this.f62289u = cVar.f62224w.mo58029d();
        AdConfig.AdSize a = cVar.f62224w.mo58261a();
        if (AdConfig.AdSize.isNonMrecBannerAdSize(a)) {
            this.f62290v = a.getName();
        }
    }
}
