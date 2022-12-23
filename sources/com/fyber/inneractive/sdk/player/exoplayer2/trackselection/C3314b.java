package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3321e;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b */
public class C3314b extends C3318d {

    /* renamed from: e */
    public static final int[] f11887e = new int[0];

    /* renamed from: c */
    public final C3321e.C3322a f11888c = null;

    /* renamed from: d */
    public final AtomicReference<C3316b> f11889d = new AtomicReference<>(new C3316b());

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b$a */
    public static final class C3315a {

        /* renamed from: a */
        public final int f11890a;

        /* renamed from: b */
        public final int f11891b;

        /* renamed from: c */
        public final String f11892c;

        public C3315a(int i, int i2, String str) {
            this.f11890a = i;
            this.f11891b = i2;
            this.f11892c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C3315a.class != obj.getClass()) {
                return false;
            }
            C3315a aVar = (C3315a) obj;
            if (this.f11890a == aVar.f11890a && this.f11891b == aVar.f11891b && TextUtils.equals(this.f11892c, aVar.f11892c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2 = ((this.f11890a * 31) + this.f11891b) * 31;
            String str = this.f11892c;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b$b */
    public static final class C3316b {

        /* renamed from: a */
        public final String f11893a;

        /* renamed from: b */
        public final String f11894b;

        /* renamed from: c */
        public final boolean f11895c;

        /* renamed from: d */
        public final boolean f11896d;

        /* renamed from: e */
        public final int f11897e;

        /* renamed from: f */
        public final int f11898f;

        /* renamed from: g */
        public final int f11899g;

        /* renamed from: h */
        public final boolean f11900h;

        /* renamed from: i */
        public final boolean f11901i;

        /* renamed from: j */
        public final int f11902j;

        /* renamed from: k */
        public final int f11903k;

        /* renamed from: l */
        public final boolean f11904l;

        public C3316b() {
            this((String) null, (String) null, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C3316b.class != obj.getClass()) {
                return false;
            }
            C3316b bVar = (C3316b) obj;
            if (this.f11895c == bVar.f11895c && this.f11896d == bVar.f11896d && this.f11897e == bVar.f11897e && this.f11898f == bVar.f11898f && this.f11900h == bVar.f11900h && this.f11901i == bVar.f11901i && this.f11904l == bVar.f11904l && this.f11902j == bVar.f11902j && this.f11903k == bVar.f11903k && this.f11899g == bVar.f11899g && TextUtils.equals(this.f11893a, bVar.f11893a) && TextUtils.equals(this.f11894b, bVar.f11894b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((((((((((((((((((C13715c.m34238d(this.f11894b, this.f11893a.hashCode() * 31, 31) + (this.f11895c ? 1 : 0)) * 31) + (this.f11896d ? 1 : 0)) * 31) + this.f11897e) * 31) + this.f11898f) * 31) + this.f11899g) * 31) + (this.f11900h ? 1 : 0)) * 31) + (this.f11901i ? 1 : 0)) * 31) + (this.f11904l ? 1 : 0)) * 31) + this.f11902j) * 31) + this.f11903k;
        }

        public C3316b(String str, String str2, boolean z, boolean z2, int i, int i2, int i3, boolean z3, boolean z4, int i4, int i5, boolean z5) {
            this.f11893a = null;
            this.f11894b = null;
            this.f11895c = z;
            this.f11896d = z2;
            this.f11897e = i;
            this.f11898f = i2;
            this.f11899g = i3;
            this.f11900h = z3;
            this.f11901i = z4;
            this.f11902j = i4;
            this.f11903k = i5;
            this.f11904l = z5;
        }
    }

    public C3314b(C3321e.C3322a aVar) {
    }

    /* renamed from: a */
    public static int m8368a(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    /* renamed from: a */
    public static boolean m8370a(int i, boolean z) {
        int i2 = i & 3;
        return i2 == 3 || (z && i2 == 2);
    }

    /* renamed from: a */
    public static boolean m8373a(C3226i iVar, String str, int i, int i2, int i3, int i4, int i5) {
        if (!m8370a(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !C3406u.m8596a((Object) iVar.f11633f, (Object) str)) {
            return false;
        }
        int i6 = iVar.f11637j;
        if (i6 != -1 && i6 > i3) {
            return false;
        }
        int i7 = iVar.f11638k;
        if (i7 != -1 && i7 > i4) {
            return false;
        }
        int i8 = iVar.f11629b;
        if (i8 == -1 || i8 <= i5) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m8371a(C3226i iVar, int i, C3315a aVar) {
        if (!m8370a(i, false) || iVar.f11645r != aVar.f11890a || iVar.f11646s != aVar.f11891b) {
            return false;
        }
        String str = aVar.f11892c;
        if (str == null || TextUtils.equals(str, iVar.f11633f)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m8372a(C3226i iVar, String str) {
        String str2;
        if (str != null) {
            String str3 = iVar.f11652y;
            int i = C3406u.f12148a;
            if (str3 == null) {
                str2 = null;
            } else {
                str2 = new Locale(str3).getLanguage();
            }
            if (TextUtils.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.Integer> m8369a(com.fyber.inneractive.sdk.player.exoplayer2.source.C3304r r12, int r13, int r14, boolean r15) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.f11871a
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        L_0x0009:
            int r3 = r12.f11871a
            if (r2 >= r3) goto L_0x0017
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0017:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r2) goto L_0x00a6
            if (r14 != r2) goto L_0x0020
            goto L_0x00a6
        L_0x0020:
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x0024:
            int r5 = r12.f11871a
            r6 = 1
            if (r3 >= r5) goto L_0x0080
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r5 = r12.f11872b
            r5 = r5[r3]
            int r7 = r5.f11637j
            if (r7 <= 0) goto L_0x007d
            int r8 = r5.f11638k
            if (r8 <= 0) goto L_0x007d
            if (r15 == 0) goto L_0x0045
            if (r7 <= r8) goto L_0x003b
            r9 = 1
            goto L_0x003c
        L_0x003b:
            r9 = 0
        L_0x003c:
            if (r13 <= r14) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r6 = 0
        L_0x0040:
            if (r9 == r6) goto L_0x0045
            r6 = r13
            r9 = r14
            goto L_0x0047
        L_0x0045:
            r9 = r13
            r6 = r14
        L_0x0047:
            int r10 = r7 * r6
            int r11 = r8 * r9
            if (r10 < r11) goto L_0x0057
            android.graphics.Point r6 = new android.graphics.Point
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8588a((int) r11, (int) r7)
            r6.<init>(r9, r7)
            goto L_0x0061
        L_0x0057:
            android.graphics.Point r7 = new android.graphics.Point
            int r8 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8588a((int) r10, (int) r8)
            r7.<init>(r8, r6)
            r6 = r7
        L_0x0061:
            int r7 = r5.f11637j
            int r5 = r5.f11638k
            int r8 = r7 * r5
            int r9 = r6.x
            float r9 = (float) r9
            r10 = 1065017672(0x3f7ae148, float:0.98)
            float r9 = r9 * r10
            int r9 = (int) r9
            if (r7 < r9) goto L_0x007d
            int r6 = r6.y
            float r6 = (float) r6
            float r6 = r6 * r10
            int r6 = (int) r6
            if (r5 < r6) goto L_0x007d
            if (r8 >= r4) goto L_0x007d
            r4 = r8
        L_0x007d:
            int r3 = r3 + 1
            goto L_0x0024
        L_0x0080:
            if (r4 == r2) goto L_0x00a6
            int r13 = r0.size()
            int r13 = r13 - r6
        L_0x0087:
            if (r13 < 0) goto L_0x00a6
            java.lang.Object r14 = r0.get(r13)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r15 = r12.f11872b
            r14 = r15[r14]
            int r14 = r14.mo14324b()
            r15 = -1
            if (r14 == r15) goto L_0x00a0
            if (r14 <= r4) goto L_0x00a3
        L_0x00a0:
            r0.remove(r13)
        L_0x00a3:
            int r13 = r13 + -1
            goto L_0x0087
        L_0x00a6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3314b.m8369a(com.fyber.inneractive.sdk.player.exoplayer2.source.r, int, int, boolean):java.util.List");
    }
}
