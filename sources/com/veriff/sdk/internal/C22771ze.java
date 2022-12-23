package com.veriff.sdk.internal;

import com.amazonaws.http.HttpHeader;
import com.veriff.sdk.internal.C22736yk;
import com.veriff.sdk.internal.C22757yu;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: com.veriff.sdk.internal.ze */
public final class C22771ze {

    /* renamed from: a */
    public final C22752ys f57707a;

    /* renamed from: b */
    public final C22757yu f57708b;

    public C22771ze(C22752ys ysVar, C22757yu yuVar) {
        this.f57707a = ysVar;
        this.f57708b = yuVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r3.mo57429m().mo57174d() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m55864a(com.veriff.sdk.internal.C22757yu r3, com.veriff.sdk.internal.C22752ys r4) {
        /*
            int r0 = r3.mo57418c()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L_0x005a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L_0x0031
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L_0x005a
            switch(r0) {
                case 300: goto L_0x005a;
                case 301: goto L_0x005a;
                case 302: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0059
        L_0x0031:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.mo57415a(r0)
            if (r0 != 0) goto L_0x005a
            com.veriff.sdk.internal.xv r0 = r3.mo57429m()
            int r0 = r0.mo57173c()
            r1 = -1
            if (r0 != r1) goto L_0x005a
            com.veriff.sdk.internal.xv r0 = r3.mo57429m()
            boolean r0 = r0.mo57175e()
            if (r0 != 0) goto L_0x005a
            com.veriff.sdk.internal.xv r0 = r3.mo57429m()
            boolean r0 = r0.mo57174d()
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            return r2
        L_0x005a:
            com.veriff.sdk.internal.xv r3 = r3.mo57429m()
            boolean r3 = r3.mo57172b()
            if (r3 != 0) goto L_0x006f
            com.veriff.sdk.internal.xv r3 = r4.mo57398f()
            boolean r3 = r3.mo57172b()
            if (r3 != 0) goto L_0x006f
            r2 = 1
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22771ze.m55864a(com.veriff.sdk.internal.yu, com.veriff.sdk.internal.ys):boolean");
    }

    /* renamed from: com.veriff.sdk.internal.ze$a */
    public static class C22772a {

        /* renamed from: a */
        public final long f57709a;

        /* renamed from: b */
        public final C22752ys f57710b;

        /* renamed from: c */
        public final C22757yu f57711c;

        /* renamed from: d */
        private Date f57712d;

        /* renamed from: e */
        private String f57713e;

        /* renamed from: f */
        private Date f57714f;

        /* renamed from: g */
        private String f57715g;

        /* renamed from: h */
        private Date f57716h;

        /* renamed from: i */
        private long f57717i;

        /* renamed from: j */
        private long f57718j;

        /* renamed from: k */
        private String f57719k;

        /* renamed from: l */
        private int f57720l = -1;

        public C22772a(long j, C22752ys ysVar, C22757yu yuVar) {
            this.f57709a = j;
            this.f57710b = ysVar;
            this.f57711c = yuVar;
            if (yuVar != null) {
                this.f57717i = yuVar.mo57430n();
                this.f57718j = yuVar.mo57431o();
                C22736yk g = yuVar.mo57423g();
                int a = g.mo57265a();
                for (int i = 0; i < a; i++) {
                    String a2 = g.mo57266a(i);
                    String b = g.mo57269b(i);
                    if (HttpHeader.DATE.equalsIgnoreCase(a2)) {
                        this.f57712d = C22800zv.m56020a(b);
                        this.f57713e = b;
                    } else if ("Expires".equalsIgnoreCase(a2)) {
                        this.f57716h = C22800zv.m56020a(b);
                    } else if ("Last-Modified".equalsIgnoreCase(a2)) {
                        this.f57714f = C22800zv.m56020a(b);
                        this.f57715g = b;
                    } else if ("ETag".equalsIgnoreCase(a2)) {
                        this.f57719k = b;
                    } else if ("Age".equalsIgnoreCase(a2)) {
                        this.f57720l = C22802zw.m56030b(b, -1);
                    }
                }
            }
        }

        /* renamed from: b */
        private C22771ze m55866b() {
            long j;
            if (this.f57711c == null) {
                return new C22771ze(this.f57710b, (C22757yu) null);
            }
            if (this.f57710b.mo57399g() && this.f57711c.mo57422f() == null) {
                return new C22771ze(this.f57710b, (C22757yu) null);
            }
            if (!C22771ze.m55864a(this.f57711c, this.f57710b)) {
                return new C22771ze(this.f57710b, (C22757yu) null);
            }
            C22711xv f = this.f57710b.mo57398f();
            if (f.mo57171a() || m55865a(this.f57710b)) {
                return new C22771ze(this.f57710b, (C22757yu) null);
            }
            C22711xv m = this.f57711c.mo57429m();
            long d = m55868d();
            long c = m55867c();
            if (f.mo57173c() != -1) {
                c = Math.min(c, TimeUnit.SECONDS.toMillis((long) f.mo57173c()));
            }
            long j2 = 0;
            if (f.mo57178h() != -1) {
                j = TimeUnit.SECONDS.toMillis((long) f.mo57178h());
            } else {
                j = 0;
            }
            if (!m.mo57176f() && f.mo57177g() != -1) {
                j2 = TimeUnit.SECONDS.toMillis((long) f.mo57177g());
            }
            if (!m.mo57171a()) {
                long j3 = j + d;
                if (j3 < j2 + c) {
                    C22757yu.C22758a i = this.f57711c.mo57425i();
                    if (j3 >= c) {
                        i.mo57447b("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (d > 86400000 && m55869e()) {
                        i.mo57447b("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new C22771ze((C22752ys) null, i.mo57443a());
                }
            }
            String str = this.f57719k;
            String str2 = "If-Modified-Since";
            if (str != null) {
                str2 = "If-None-Match";
            } else if (this.f57714f != null) {
                str = this.f57715g;
            } else if (this.f57712d == null) {
                return new C22771ze(this.f57710b, (C22757yu) null);
            } else {
                str = this.f57713e;
            }
            C22736yk.C22737a b = this.f57710b.mo57395c().mo57268b();
            C22763yy.f57691a.mo57372a(b, str2, str);
            return new C22771ze(this.f57710b.mo57397e().mo57402a(b.mo57277a()).mo57409a(), this.f57711c);
        }

        /* renamed from: c */
        private long m55867c() {
            long j;
            long j2;
            C22711xv m = this.f57711c.mo57429m();
            if (m.mo57173c() != -1) {
                return TimeUnit.SECONDS.toMillis((long) m.mo57173c());
            }
            if (this.f57716h != null) {
                Date date = this.f57712d;
                if (date != null) {
                    j2 = date.getTime();
                } else {
                    j2 = this.f57718j;
                }
                long time = this.f57716h.getTime() - j2;
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.f57714f == null || this.f57711c.mo57414a().mo57390a().mo57300m() != null) {
                return 0;
            } else {
                Date date2 = this.f57712d;
                if (date2 != null) {
                    j = date2.getTime();
                } else {
                    j = this.f57717i;
                }
                long time2 = j - this.f57714f.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
                return 0;
            }
        }

        /* renamed from: d */
        private long m55868d() {
            Date date = this.f57712d;
            long j = 0;
            if (date != null) {
                j = Math.max(0, this.f57718j - date.getTime());
            }
            int i = this.f57720l;
            if (i != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis((long) i));
            }
            long j2 = this.f57718j;
            return j + (j2 - this.f57717i) + (this.f57709a - j2);
        }

        /* renamed from: e */
        private boolean m55869e() {
            return this.f57711c.mo57429m().mo57173c() == -1 && this.f57716h == null;
        }

        /* renamed from: a */
        public C22771ze mo57460a() {
            C22771ze b = m55866b();
            return (b.f57707a == null || !this.f57710b.mo57398f().mo57179i()) ? b : new C22771ze((C22752ys) null, (C22757yu) null);
        }

        /* renamed from: a */
        private static boolean m55865a(C22752ys ysVar) {
            return (ysVar.mo57392a("If-Modified-Since") == null && ysVar.mo57392a("If-None-Match") == null) ? false : true;
        }
    }
}
