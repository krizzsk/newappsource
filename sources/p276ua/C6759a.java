package p276ua;

import p173ma.C5750t;
import p173ma.C5753u;
import p277ub.C6774a0;
import p583jk.C17875h;

/* renamed from: ua.a */
public final class C6759a implements C6766f {

    /* renamed from: a */
    public final C6765e f20898a;

    /* renamed from: b */
    public final long f20899b;

    /* renamed from: c */
    public final long f20900c;

    /* renamed from: d */
    public final C6768h f20901d;

    /* renamed from: e */
    public int f20902e;

    /* renamed from: f */
    public long f20903f;

    /* renamed from: g */
    public long f20904g;

    /* renamed from: h */
    public long f20905h;

    /* renamed from: i */
    public long f20906i;

    /* renamed from: j */
    public long f20907j;

    /* renamed from: k */
    public long f20908k;

    /* renamed from: l */
    public long f20909l;

    /* renamed from: ua.a$a */
    public final class C6760a implements C5750t {
        public C6760a() {
        }

        /* renamed from: c */
        public final C5750t.C5751a mo21569c(long j) {
            C6759a aVar = C6759a.this;
            long j2 = aVar.f20899b;
            long j3 = aVar.f20900c;
            C5753u uVar = new C5753u(j, C6774a0.m15948h(((((j3 - j2) * ((((long) aVar.f20901d.f20942i) * j) / 1000000)) / aVar.f20903f) + j2) - 30000, j2, j3 - 1));
            return new C5750t.C5751a(uVar, uVar);
        }

        /* renamed from: e */
        public final boolean mo21570e() {
            return true;
        }

        /* renamed from: i */
        public final long mo21571i() {
            C6759a aVar = C6759a.this;
            return (aVar.f20903f * 1000000) / ((long) aVar.f20901d.f20942i);
        }
    }

    public C6759a(C6768h hVar, long j, long j2, long j3, long j4, boolean z) {
        boolean z2;
        if (j < 0 || j2 <= j) {
            z2 = false;
        } else {
            z2 = true;
        }
        C17875h.m44301k(z2);
        this.f20901d = hVar;
        this.f20899b = j;
        this.f20900c = j2;
        if (j3 == j2 - j || z) {
            this.f20903f = j4;
            this.f20902e = 4;
        } else {
            this.f20902e = 0;
        }
        this.f20898a = new C6765e();
    }

    /* renamed from: a */
    public final C5750t mo22931a() {
        if (this.f20903f != 0) {
            return new C6760a();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b8  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo22932b(p173ma.C5732e r22) throws java.io.IOException {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            int r2 = r0.f20902e
            r3 = 0
            r5 = 1
            r6 = 4
            r7 = -1
            r9 = 0
            if (r2 == 0) goto L_0x00f3
            if (r2 == r5) goto L_0x0104
            r5 = 2
            r10 = 3
            if (r2 == r5) goto L_0x0023
            if (r2 == r10) goto L_0x0020
            if (r2 != r6) goto L_0x001a
            return r7
        L_0x001a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0020:
            r5 = r7
            goto L_0x00bb
        L_0x0023:
            long r13 = r0.f20906i
            long r11 = r0.f20907j
            int r2 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x002c
            goto L_0x0065
        L_0x002c:
            long r13 = r1.f18591d
            ua.e r2 = r0.f20898a
            boolean r2 = r2.mo22940b(r1, r11)
            if (r2 != 0) goto L_0x0047
            long r2 = r0.f20906i
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x003f
            r5 = r7
            goto L_0x00b3
        L_0x003f:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "No ogg page can be found."
            r1.<init>(r2)
            throw r1
        L_0x0047:
            ua.e r2 = r0.f20898a
            r2.mo22939a(r1, r9)
            r1.f18593f = r9
            long r11 = r0.f20905h
            ua.e r2 = r0.f20898a
            long r9 = r2.f20926b
            long r11 = r11 - r9
            int r5 = r2.f20928d
            int r2 = r2.f20929e
            int r5 = r5 + r2
            int r2 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r2 > 0) goto L_0x0068
            r15 = 72000(0x11940, double:3.55727E-319)
            int r2 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r2 >= 0) goto L_0x0068
        L_0x0065:
            r2 = r7
            r5 = r2
            goto L_0x00b3
        L_0x0068:
            int r2 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0071
            r0.f20907j = r13
            r0.f20909l = r9
            goto L_0x0079
        L_0x0071:
            long r3 = r1.f18591d
            long r13 = (long) r5
            long r3 = r3 + r13
            r0.f20906i = r3
            r0.f20908k = r9
        L_0x0079:
            long r3 = r0.f20907j
            long r9 = r0.f20906i
            long r13 = r3 - r9
            r15 = 100000(0x186a0, double:4.94066E-319)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 >= 0) goto L_0x008b
            r0.f20907j = r9
            r5 = r7
            r2 = r9
            goto L_0x00b3
        L_0x008b:
            long r13 = (long) r5
            r15 = 1
            if (r2 > 0) goto L_0x0093
            r17 = 2
            goto L_0x0095
        L_0x0093:
            r17 = r15
        L_0x0095:
            long r13 = r13 * r17
            long r6 = r1.f18591d
            long r6 = r6 - r13
            long r13 = r3 - r9
            long r13 = r13 * r11
            long r11 = r0.f20909l
            r17 = r3
            long r2 = r0.f20908k
            long r11 = r11 - r2
            long r13 = r13 / r11
            long r2 = r13 + r6
            long r19 = r17 - r15
            r15 = r2
            r17 = r9
            long r2 = p277ub.C6774a0.m15948h(r15, r17, r19)
            r5 = -1
        L_0x00b3:
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00b8
            return r2
        L_0x00b8:
            r2 = 3
            r0.f20902e = r2
        L_0x00bb:
            ua.e r2 = r0.f20898a
            r2.mo22940b(r1, r5)
            ua.e r2 = r0.f20898a
            r3 = 0
            r2.mo22939a(r1, r3)
            ua.e r5 = r0.f20898a
            long r6 = r5.f20926b
            long r8 = r0.f20905h
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x00dc
            r1.f18593f = r3
            r1 = 4
            r0.f20902e = r1
            long r1 = r0.f20908k
            r6 = 2
            long r1 = r1 + r6
            long r1 = -r1
            return r1
        L_0x00dc:
            r6 = 2
            int r3 = r5.f20928d
            int r4 = r5.f20929e
            int r3 = r3 + r4
            r1.mo21582i(r3)
            long r3 = r1.f18591d
            r0.f20906i = r3
            ua.e r3 = r0.f20898a
            long r3 = r3.f20926b
            r0.f20908k = r3
            r5 = -1
            goto L_0x00bb
        L_0x00f3:
            long r6 = r1.f18591d
            r0.f20904g = r6
            r0.f20902e = r5
            long r8 = r0.f20900c
            r10 = 65307(0xff1b, double:3.2266E-319)
            long r8 = r8 - r10
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 <= 0) goto L_0x0104
            return r8
        L_0x0104:
            ua.e r6 = r0.f20898a
            r7 = 0
            r6.f20925a = r7
            r6.f20926b = r3
            r6.f20927c = r7
            r6.f20928d = r7
            r6.f20929e = r7
            r3 = -1
            boolean r6 = r6.mo22940b(r1, r3)
            if (r6 == 0) goto L_0x0169
            ua.e r3 = r0.f20898a
            r3.mo22939a(r1, r7)
            ua.e r3 = r0.f20898a
            int r4 = r3.f20928d
            int r3 = r3.f20929e
            int r4 = r4 + r3
            r1.mo21582i(r4)
            ua.e r3 = r0.f20898a
            long r3 = r3.f20926b
        L_0x012c:
            ua.e r6 = r0.f20898a
            int r8 = r6.f20925a
            r2 = 4
            r8 = r8 & r2
            if (r8 == r2) goto L_0x0161
            r8 = -1
            boolean r6 = r6.mo22940b(r1, r8)
            if (r6 == 0) goto L_0x0161
            long r10 = r1.f18591d
            long r12 = r0.f20900c
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 >= 0) goto L_0x0161
            ua.e r6 = r0.f20898a
            boolean r6 = r6.mo22939a(r1, r5)
            if (r6 == 0) goto L_0x0161
            ua.e r6 = r0.f20898a
            int r10 = r6.f20928d
            int r6 = r6.f20929e
            int r10 = r10 + r6
            r1.mo21582i(r10)     // Catch:{ EOFException -> 0x0158 }
            r6 = 1
            goto L_0x0159
        L_0x0158:
            r6 = 0
        L_0x0159:
            if (r6 != 0) goto L_0x015c
            goto L_0x0161
        L_0x015c:
            ua.e r3 = r0.f20898a
            long r3 = r3.f20926b
            goto L_0x012c
        L_0x0161:
            r0.f20903f = r3
            r1 = 4
            r0.f20902e = r1
            long r1 = r0.f20904g
            return r1
        L_0x0169:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p276ua.C6759a.mo22932b(ma.e):long");
    }

    /* renamed from: c */
    public final void mo22933c(long j) {
        this.f20905h = C6774a0.m15948h(j, 0, this.f20903f - 1);
        this.f20902e = 2;
        this.f20906i = this.f20899b;
        this.f20907j = this.f20900c;
        this.f20908k = 0;
        this.f20909l = this.f20903f;
    }
}
