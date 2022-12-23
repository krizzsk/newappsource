package com.veriff.sdk.internal;

import java.util.concurrent.TimeUnit;

/* renamed from: com.veriff.sdk.internal.xv */
public final class C22711xv {

    /* renamed from: b */
    public static final C22711xv f57430b = new C22712a().mo57184c().mo57182a(Integer.MAX_VALUE, TimeUnit.SECONDS).mo57185d();

    /* renamed from: c */
    public String f57431c;

    /* renamed from: d */
    private final boolean f57432d;

    /* renamed from: e */
    private final boolean f57433e;

    /* renamed from: f */
    private final int f57434f;

    /* renamed from: g */
    private final int f57435g;

    /* renamed from: h */
    private final boolean f57436h;

    /* renamed from: i */
    private final boolean f57437i;

    /* renamed from: j */
    private final boolean f57438j;

    /* renamed from: k */
    private final int f57439k;

    /* renamed from: l */
    private final int f57440l;

    /* renamed from: m */
    private final boolean f57441m;

    /* renamed from: n */
    private final boolean f57442n;

    /* renamed from: o */
    private final boolean f57443o;

    /* renamed from: com.veriff.sdk.internal.xv$a */
    public static final class C22712a {

        /* renamed from: a */
        public boolean f57444a;

        /* renamed from: b */
        public boolean f57445b;

        /* renamed from: c */
        public int f57446c = -1;

        /* renamed from: d */
        public int f57447d = -1;

        /* renamed from: e */
        public int f57448e = -1;

        /* renamed from: f */
        public boolean f57449f;

        /* renamed from: a */
        public C22712a mo57181a() {
            this.f57444a = true;
            return this;
        }

        /* renamed from: b */
        public C22712a mo57183b() {
            this.f57445b = true;
            return this;
        }

        /* renamed from: c */
        public C22712a mo57184c() {
            this.f57449f = true;
            return this;
        }

        /* renamed from: d */
        public C22711xv mo57185d() {
            return new C22711xv(this);
        }

        /* renamed from: a */
        public C22712a mo57182a(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds((long) i);
                this.f57447d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException(C16759e.m42349e("maxStale < 0: ", i));
        }
    }

    static {
        new C22712a().mo57181a().mo57185d();
    }

    private C22711xv(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f57432d = z;
        this.f57433e = z2;
        this.f57434f = i;
        this.f57435g = i2;
        this.f57436h = z3;
        this.f57437i = z4;
        this.f57438j = z5;
        this.f57439k = i3;
        this.f57440l = i4;
        this.f57441m = z6;
        this.f57442n = z7;
        this.f57443o = z8;
        this.f57431c = str;
    }

    /* renamed from: j */
    private String m55436j() {
        StringBuilder sb = new StringBuilder();
        if (this.f57432d) {
            sb.append("no-cache, ");
        }
        if (this.f57433e) {
            sb.append("no-store, ");
        }
        if (this.f57434f != -1) {
            sb.append("max-age=");
            sb.append(this.f57434f);
            sb.append(", ");
        }
        if (this.f57435g != -1) {
            sb.append("s-maxage=");
            sb.append(this.f57435g);
            sb.append(", ");
        }
        if (this.f57436h) {
            sb.append("private, ");
        }
        if (this.f57437i) {
            sb.append("public, ");
        }
        if (this.f57438j) {
            sb.append("must-revalidate, ");
        }
        if (this.f57439k != -1) {
            sb.append("max-stale=");
            sb.append(this.f57439k);
            sb.append(", ");
        }
        if (this.f57440l != -1) {
            sb.append("min-fresh=");
            sb.append(this.f57440l);
            sb.append(", ");
        }
        if (this.f57441m) {
            sb.append("only-if-cached, ");
        }
        if (this.f57442n) {
            sb.append("no-transform, ");
        }
        if (this.f57443o) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* renamed from: a */
    public boolean mo57171a() {
        return this.f57432d;
    }

    /* renamed from: b */
    public boolean mo57172b() {
        return this.f57433e;
    }

    /* renamed from: c */
    public int mo57173c() {
        return this.f57434f;
    }

    /* renamed from: d */
    public boolean mo57174d() {
        return this.f57436h;
    }

    /* renamed from: e */
    public boolean mo57175e() {
        return this.f57437i;
    }

    /* renamed from: f */
    public boolean mo57176f() {
        return this.f57438j;
    }

    /* renamed from: g */
    public int mo57177g() {
        return this.f57439k;
    }

    /* renamed from: h */
    public int mo57178h() {
        return this.f57440l;
    }

    /* renamed from: i */
    public boolean mo57179i() {
        return this.f57441m;
    }

    public String toString() {
        String str = this.f57431c;
        if (str != null) {
            return str;
        }
        String j = m55436j();
        this.f57431c = j;
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.veriff.sdk.internal.C22711xv m55435a(com.veriff.sdk.internal.C22736yk r22) {
        /*
            r0 = r22
            int r1 = r22.mo57265a()
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x001a:
            if (r6 >= r1) goto L_0x013f
            java.lang.String r2 = r0.mo57266a((int) r6)
            java.lang.String r4 = r0.mo57269b((int) r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0031
            if (r8 == 0) goto L_0x002f
            goto L_0x0039
        L_0x002f:
            r8 = r4
            goto L_0x003a
        L_0x0031:
            java.lang.String r3 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x0138
        L_0x0039:
            r7 = 0
        L_0x003a:
            r2 = 0
        L_0x003b:
            int r3 = r4.length()
            if (r2 >= r3) goto L_0x0138
            java.lang.String r3 = "=,;"
            int r3 = com.veriff.sdk.internal.C22802zw.m56023a((java.lang.String) r4, (int) r2, (java.lang.String) r3)
            java.lang.String r2 = r4.substring(r2, r3)
            java.lang.String r2 = r2.trim()
            int r5 = r4.length()
            if (r3 == r5) goto L_0x0099
            char r5 = r4.charAt(r3)
            r0 = 44
            if (r5 == r0) goto L_0x0099
            char r0 = r4.charAt(r3)
            r5 = 59
            if (r0 != r5) goto L_0x0066
            goto L_0x0099
        L_0x0066:
            int r3 = r3 + 1
            int r0 = com.veriff.sdk.internal.C22802zw.m56022a((java.lang.String) r4, (int) r3)
            int r3 = r4.length()
            if (r0 >= r3) goto L_0x0089
            char r3 = r4.charAt(r0)
            r5 = 34
            if (r3 != r5) goto L_0x0089
            int r0 = r0 + 1
            java.lang.String r3 = "\""
            int r3 = com.veriff.sdk.internal.C22802zw.m56023a((java.lang.String) r4, (int) r0, (java.lang.String) r3)
            java.lang.String r0 = r4.substring(r0, r3)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x009d
        L_0x0089:
            r5 = 1
            java.lang.String r3 = ",;"
            int r3 = com.veriff.sdk.internal.C22802zw.m56023a((java.lang.String) r4, (int) r0, (java.lang.String) r3)
            java.lang.String r0 = r4.substring(r0, r3)
            java.lang.String r0 = r0.trim()
            goto L_0x009d
        L_0x0099:
            r5 = 1
            int r3 = r3 + 1
            r0 = 0
        L_0x009d:
            java.lang.String r5 = "no-cache"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00a9
            r5 = -1
            r9 = 1
            goto L_0x0133
        L_0x00a9:
            java.lang.String r5 = "no-store"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00b5
            r5 = -1
            r10 = 1
            goto L_0x0133
        L_0x00b5:
            java.lang.String r5 = "max-age"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00c4
            r5 = -1
            int r11 = com.veriff.sdk.internal.C22802zw.m56030b(r0, r5)
            goto L_0x0133
        L_0x00c4:
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00d2
            r5 = -1
            int r12 = com.veriff.sdk.internal.C22802zw.m56030b(r0, r5)
            goto L_0x0133
        L_0x00d2:
            java.lang.String r5 = "private"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00dd
            r5 = -1
            r13 = 1
            goto L_0x0133
        L_0x00dd:
            java.lang.String r5 = "public"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00e8
            r5 = -1
            r14 = 1
            goto L_0x0133
        L_0x00e8:
            java.lang.String r5 = "must-revalidate"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00f3
            r5 = -1
            r15 = 1
            goto L_0x0133
        L_0x00f3:
            java.lang.String r5 = "max-stale"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0104
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r16 = com.veriff.sdk.internal.C22802zw.m56030b(r0, r2)
            r5 = -1
            goto L_0x0133
        L_0x0104:
            java.lang.String r5 = "min-fresh"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0112
            r5 = -1
            int r17 = com.veriff.sdk.internal.C22802zw.m56030b(r0, r5)
            goto L_0x0133
        L_0x0112:
            r5 = -1
            java.lang.String r0 = "only-if-cached"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x011e
            r18 = 1
            goto L_0x0133
        L_0x011e:
            java.lang.String r0 = "no-transform"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0129
            r19 = 1
            goto L_0x0133
        L_0x0129:
            java.lang.String r0 = "immutable"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0133
            r20 = 1
        L_0x0133:
            r0 = r22
            r2 = r3
            goto L_0x003b
        L_0x0138:
            r5 = -1
            int r6 = r6 + 1
            r0 = r22
            goto L_0x001a
        L_0x013f:
            if (r7 != 0) goto L_0x0144
            r21 = 0
            goto L_0x0146
        L_0x0144:
            r21 = r8
        L_0x0146:
            com.veriff.sdk.internal.xv r0 = new com.veriff.sdk.internal.xv
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22711xv.m55435a(com.veriff.sdk.internal.yk):com.veriff.sdk.internal.xv");
    }

    public C22711xv(C22712a aVar) {
        this.f57432d = aVar.f57444a;
        this.f57433e = aVar.f57445b;
        this.f57434f = aVar.f57446c;
        this.f57435g = -1;
        this.f57436h = false;
        this.f57437i = false;
        this.f57438j = false;
        this.f57439k = aVar.f57447d;
        this.f57440l = aVar.f57448e;
        this.f57441m = aVar.f57449f;
        aVar.getClass();
        this.f57442n = false;
        aVar.getClass();
        this.f57443o = false;
    }
}
