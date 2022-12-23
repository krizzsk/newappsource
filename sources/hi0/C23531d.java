package hi0;

import java.util.concurrent.TimeUnit;

/* renamed from: hi0.d */
public final class C23531d {

    /* renamed from: a */
    public final boolean f59437a;

    /* renamed from: b */
    public final boolean f59438b;

    /* renamed from: c */
    public final int f59439c;

    /* renamed from: d */
    public final int f59440d;

    /* renamed from: e */
    public final boolean f59441e;

    /* renamed from: f */
    public final boolean f59442f;

    /* renamed from: g */
    public final boolean f59443g;

    /* renamed from: h */
    public final int f59444h;

    /* renamed from: i */
    public final int f59445i;

    /* renamed from: j */
    public final boolean f59446j;

    /* renamed from: k */
    public final boolean f59447k;

    /* renamed from: l */
    public final boolean f59448l;

    /* renamed from: m */
    public String f59449m;

    /* renamed from: hi0.d$a */
    public static final class C23532a {

        /* renamed from: a */
        public boolean f59450a;

        /* renamed from: b */
        public int f59451b = -1;

        /* renamed from: c */
        public boolean f59452c;
    }

    static {
        C23532a aVar = new C23532a();
        aVar.f59450a = true;
        new C23531d(aVar);
        C23532a aVar2 = new C23532a();
        aVar2.f59452c = true;
        int i = Integer.MAX_VALUE;
        long seconds = TimeUnit.SECONDS.toSeconds((long) Integer.MAX_VALUE);
        if (seconds <= 2147483647L) {
            i = (int) seconds;
        }
        aVar2.f59451b = i;
        new C23531d(aVar2);
    }

    public C23531d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f59437a = z;
        this.f59438b = z2;
        this.f59439c = i;
        this.f59440d = i2;
        this.f59441e = z3;
        this.f59442f = z4;
        this.f59443g = z5;
        this.f59444h = i3;
        this.f59445i = i4;
        this.f59446j = z6;
        this.f59447k = z7;
        this.f59448l = z8;
        this.f59449m = str;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 191 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static hi0.C23531d m57670a(hi0.C23556q r22) {
        /*
            r0 = r22
            java.lang.String[] r1 = r0.f59531a
            int r1 = r1.length
            int r1 = r1 / 2
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
        L_0x001b:
            if (r6 >= r1) goto L_0x0151
            java.lang.String r2 = r0.mo58683d(r6)
            java.lang.String r4 = r0.mo58686g(r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0032
            if (r8 == 0) goto L_0x0030
            goto L_0x003a
        L_0x0030:
            r8 = r4
            goto L_0x003b
        L_0x0032:
            java.lang.String r3 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x014a
        L_0x003a:
            r7 = 0
        L_0x003b:
            r2 = 0
        L_0x003c:
            int r3 = r4.length()
            if (r2 >= r3) goto L_0x014a
            java.lang.String r3 = "=,;"
            int r3 = li0.C24318e.m61060e(r2, r4, r3)
            java.lang.String r2 = r4.substring(r2, r3)
            java.lang.String r2 = r2.trim()
            int r5 = r4.length()
            if (r3 == r5) goto L_0x00aa
            char r5 = r4.charAt(r3)
            r0 = 44
            if (r5 == r0) goto L_0x00aa
            char r0 = r4.charAt(r3)
            r5 = 59
            if (r0 != r5) goto L_0x007a
            goto L_0x00aa
        L_0x0067:
            int r0 = r4.length()
            if (r3 >= r0) goto L_0x007d
            char r0 = r4.charAt(r3)
            r5 = 32
            if (r0 == r5) goto L_0x007a
            r5 = 9
            if (r0 == r5) goto L_0x007a
            goto L_0x007d
        L_0x007a:
            int r3 = r3 + 1
            goto L_0x0067
        L_0x007d:
            int r0 = r4.length()
            if (r3 >= r0) goto L_0x009a
            char r0 = r4.charAt(r3)
            r5 = 34
            if (r0 != r5) goto L_0x009a
            int r3 = r3 + 1
            java.lang.String r0 = "\""
            int r0 = li0.C24318e.m61060e(r3, r4, r0)
            java.lang.String r3 = r4.substring(r3, r0)
            r5 = 1
            int r0 = r0 + r5
            goto L_0x00af
        L_0x009a:
            r5 = 1
            java.lang.String r0 = ",;"
            int r0 = li0.C24318e.m61060e(r3, r4, r0)
            java.lang.String r3 = r4.substring(r3, r0)
            java.lang.String r3 = r3.trim()
            goto L_0x00af
        L_0x00aa:
            r5 = 1
            int r3 = r3 + 1
            r0 = r3
            r3 = 0
        L_0x00af:
            java.lang.String r5 = "no-cache"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00bb
            r5 = -1
            r9 = 1
            goto L_0x0145
        L_0x00bb:
            java.lang.String r5 = "no-store"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00c7
            r5 = -1
            r10 = 1
            goto L_0x0145
        L_0x00c7:
            java.lang.String r5 = "max-age"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00d6
            r5 = -1
            int r11 = li0.C24318e.m61058c(r5, r3)
            goto L_0x0145
        L_0x00d6:
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00e4
            r5 = -1
            int r12 = li0.C24318e.m61058c(r5, r3)
            goto L_0x0145
        L_0x00e4:
            java.lang.String r5 = "private"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00ef
            r5 = -1
            r13 = 1
            goto L_0x0145
        L_0x00ef:
            java.lang.String r5 = "public"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00fa
            r5 = -1
            r14 = 1
            goto L_0x0145
        L_0x00fa:
            java.lang.String r5 = "must-revalidate"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0105
            r5 = -1
            r15 = 1
            goto L_0x0145
        L_0x0105:
            java.lang.String r5 = "max-stale"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0116
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r16 = li0.C24318e.m61058c(r2, r3)
            r5 = -1
            goto L_0x0145
        L_0x0116:
            java.lang.String r5 = "min-fresh"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0124
            r5 = -1
            int r17 = li0.C24318e.m61058c(r5, r3)
            goto L_0x0145
        L_0x0124:
            r5 = -1
            java.lang.String r3 = "only-if-cached"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L_0x0130
            r18 = 1
            goto L_0x0145
        L_0x0130:
            java.lang.String r3 = "no-transform"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L_0x013b
            r19 = 1
            goto L_0x0145
        L_0x013b:
            java.lang.String r3 = "immutable"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0145
            r20 = 1
        L_0x0145:
            r2 = r0
            r0 = r22
            goto L_0x003c
        L_0x014a:
            r5 = -1
            int r6 = r6 + 1
            r0 = r22
            goto L_0x001b
        L_0x0151:
            if (r7 != 0) goto L_0x0156
            r21 = 0
            goto L_0x0158
        L_0x0156:
            r21 = r8
        L_0x0158:
            hi0.d r0 = new hi0.d
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hi0.C23531d.m57670a(hi0.q):hi0.d");
    }

    public final String toString() {
        String str = this.f59449m;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f59437a) {
                sb.append("no-cache, ");
            }
            if (this.f59438b) {
                sb.append("no-store, ");
            }
            if (this.f59439c != -1) {
                sb.append("max-age=");
                sb.append(this.f59439c);
                sb.append(", ");
            }
            if (this.f59440d != -1) {
                sb.append("s-maxage=");
                sb.append(this.f59440d);
                sb.append(", ");
            }
            if (this.f59441e) {
                sb.append("private, ");
            }
            if (this.f59442f) {
                sb.append("public, ");
            }
            if (this.f59443g) {
                sb.append("must-revalidate, ");
            }
            if (this.f59444h != -1) {
                sb.append("max-stale=");
                sb.append(this.f59444h);
                sb.append(", ");
            }
            if (this.f59445i != -1) {
                sb.append("min-fresh=");
                sb.append(this.f59445i);
                sb.append(", ");
            }
            if (this.f59446j) {
                sb.append("only-if-cached, ");
            }
            if (this.f59447k) {
                sb.append("no-transform, ");
            }
            if (this.f59448l) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                str = "";
            } else {
                sb.delete(sb.length() - 2, sb.length());
                str = sb.toString();
            }
            this.f59449m = str;
        }
        return str;
    }

    public C23531d(C23532a aVar) {
        this.f59437a = aVar.f59450a;
        this.f59438b = false;
        this.f59439c = -1;
        this.f59440d = -1;
        this.f59441e = false;
        this.f59442f = false;
        this.f59443g = false;
        this.f59444h = aVar.f59451b;
        this.f59445i = -1;
        this.f59446j = aVar.f59452c;
        this.f59447k = false;
        this.f59448l = false;
    }
}
