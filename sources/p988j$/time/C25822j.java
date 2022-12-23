package p988j$.time;

import com.google.android.gms.nearby.messages.Strategy;
import java.io.Serializable;
import p988j$.time.temporal.C25830a;
import p988j$.time.temporal.C25831b;
import p988j$.time.temporal.C25840k;
import p988j$.time.temporal.C25841l;
import p988j$.time.temporal.C25842m;
import p988j$.time.temporal.C25844o;
import p988j$.time.temporal.C25845p;
import p988j$.time.temporal.C25847r;
import p988j$.time.temporal.C25848s;

/* renamed from: j$.time.j */
public final class C25822j implements C25840k, Comparable, Serializable {

    /* renamed from: e */
    public static final C25822j f64399e;

    /* renamed from: f */
    public static final C25822j f64400f = new C25822j(23, 59, 59, 999999999);

    /* renamed from: g */
    private static final C25822j[] f64401g = new C25822j[24];

    /* renamed from: a */
    private final byte f64402a;

    /* renamed from: b */
    private final byte f64403b;

    /* renamed from: c */
    private final byte f64404c;

    /* renamed from: d */
    private final int f64405d;

    static {
        int i = 0;
        while (true) {
            C25822j[] jVarArr = f64401g;
            if (i < jVarArr.length) {
                jVarArr[i] = new C25822j(i, 0, 0, 0);
                i++;
            } else {
                C25822j jVar = jVarArr[0];
                C25822j jVar2 = jVarArr[12];
                f64399e = jVar;
                return;
            }
        }
    }

    private C25822j(int i, int i2, int i3, int i4) {
        this.f64402a = (byte) i;
        this.f64403b = (byte) i2;
        this.f64404c = (byte) i3;
        this.f64405d = i4;
    }

    /* renamed from: j */
    private static C25822j m64516j(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? f64401g[i] : new C25822j(i, i2, i3, i4);
    }

    /* renamed from: k */
    private int m64517k(C25842m mVar) {
        switch (C25821i.f64397a[((C25830a) mVar).ordinal()]) {
            case 1:
                return this.f64405d;
            case 2:
                throw new C25847r("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.f64405d / 1000;
            case 4:
                throw new C25847r("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.f64405d / 1000000;
            case 6:
                return (int) (mo83749s() / 1000000);
            case 7:
                return this.f64404c;
            case 8:
                return mo83750t();
            case 9:
                return this.f64403b;
            case 10:
                return (this.f64402a * 60) + this.f64403b;
            case 11:
                return this.f64402a % 12;
            case 12:
                int i = this.f64402a % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 13:
                return this.f64402a;
            case 14:
                byte b = this.f64402a;
                if (b == 0) {
                    return 24;
                }
                return b;
            case 15:
                return this.f64402a / 12;
            default:
                throw new C25847r("Unsupported field: " + mVar);
        }
    }

    /* renamed from: n */
    public static C25822j m64518n(long j) {
        C25830a.NANO_OF_DAY.mo83776g(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return m64516j(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    /* renamed from: b */
    public final int mo83601b(C25842m mVar) {
        return mVar instanceof C25830a ? m64517k(mVar) : C25782a.m64407b(this, mVar);
    }

    /* renamed from: c */
    public final C25840k mo83611c(C25819g gVar) {
        boolean z = gVar instanceof C25822j;
        C25841l lVar = gVar;
        if (!z) {
            lVar = gVar.mo83725i(this);
        }
        return (C25822j) lVar;
    }

    /* renamed from: d */
    public final C25848s mo83602d(C25842m mVar) {
        return C25782a.m64409d(this, mVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004f, code lost:
        r3 = r3 * r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return mo83745o(r3);
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p988j$.time.temporal.C25840k mo83613e(long r3, p988j$.time.temporal.C25846q r5) {
        /*
            r2 = this;
            boolean r0 = r5 instanceof p988j$.time.temporal.C25831b
            if (r0 == 0) goto L_0x0056
            int[] r0 = p988j$.time.C25821i.f64398b
            r1 = r5
            j$.time.temporal.b r1 = (p988j$.time.temporal.C25831b) r1
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L_0x0051;
                case 2: goto L_0x0047;
                case 3: goto L_0x003f;
                case 4: goto L_0x003a;
                case 5: goto L_0x0035;
                case 6: goto L_0x0030;
                case 7: goto L_0x0029;
                default: goto L_0x0012;
            }
        L_0x0012:
            j$.time.temporal.r r3 = new j$.time.temporal.r
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Unsupported unit: "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x0029:
            r0 = 2
            long r3 = r3 % r0
            r0 = 12
            long r3 = r3 * r0
        L_0x0030:
            j$.time.j r3 = r2.mo83745o(r3)
            goto L_0x005c
        L_0x0035:
            j$.time.j r3 = r2.mo83746p(r3)
            goto L_0x005c
        L_0x003a:
            j$.time.j r3 = r2.mo83748r(r3)
            goto L_0x005c
        L_0x003f:
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r3 % r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            goto L_0x004f
        L_0x0047:
            r0 = 86400000000(0x141dd76000, double:4.26872718007E-313)
            long r3 = r3 % r0
            r0 = 1000(0x3e8, double:4.94E-321)
        L_0x004f:
            long r3 = r3 * r0
        L_0x0051:
            j$.time.j r3 = r2.mo83747q(r3)
            goto L_0x005c
        L_0x0056:
            j$.time.temporal.k r3 = r5.mo83780a(r2, r3)
            j$.time.j r3 = (p988j$.time.C25822j) r3
        L_0x005c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.time.C25822j.mo83613e(long, j$.time.temporal.q):j$.time.temporal.k");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25822j)) {
            return false;
        }
        C25822j jVar = (C25822j) obj;
        return this.f64402a == jVar.f64402a && this.f64403b == jVar.f64403b && this.f64404c == jVar.f64404c && this.f64405d == jVar.f64405d;
    }

    /* renamed from: f */
    public final boolean mo83603f(C25842m mVar) {
        return mVar instanceof C25830a ? mVar.isTimeBased() : mVar != null && mVar.mo83770a(this);
    }

    /* renamed from: g */
    public final long mo83604g(C25842m mVar) {
        return mVar instanceof C25830a ? mVar == C25830a.NANO_OF_DAY ? mo83749s() : mVar == C25830a.MICRO_OF_DAY ? mo83749s() / 1000 : (long) m64517k(mVar) : mVar.mo83773d(this);
    }

    /* renamed from: h */
    public final Object mo83606h(C25845p pVar) {
        if (pVar == C25844o.m64619a() || pVar == C25844o.m64625g() || pVar == C25844o.m64624f() || pVar == C25844o.m64622d()) {
            return null;
        }
        if (pVar == C25844o.m64621c()) {
            return this;
        }
        if (pVar == C25844o.m64620b()) {
            return null;
        }
        return pVar == C25844o.m64623e() ? C25831b.NANOS : pVar.mo83672a(this);
    }

    public final int hashCode() {
        long s = mo83749s();
        return (int) (s ^ (s >>> 32));
    }

    /* renamed from: i */
    public final int compareTo(C25822j jVar) {
        int compare = Integer.compare(this.f64402a, jVar.f64402a);
        if (compare != 0) {
            return compare;
        }
        int compare2 = Integer.compare(this.f64403b, jVar.f64403b);
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = Integer.compare(this.f64404c, jVar.f64404c);
        return compare3 == 0 ? Integer.compare(this.f64405d, jVar.f64405d) : compare3;
    }

    /* renamed from: l */
    public final int mo83743l() {
        return this.f64405d;
    }

    /* renamed from: m */
    public final int mo83744m() {
        return this.f64404c;
    }

    /* renamed from: o */
    public final C25822j mo83745o(long j) {
        return j == 0 ? this : m64516j(((((int) (j % 24)) + this.f64402a) + 24) % 24, this.f64403b, this.f64404c, this.f64405d);
    }

    /* renamed from: p */
    public final C25822j mo83746p(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.f64402a * 60) + this.f64403b;
        int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
        return i == i2 ? this : m64516j(i2 / 60, i2 % 60, this.f64404c, this.f64405d);
    }

    /* renamed from: q */
    public final C25822j mo83747q(long j) {
        if (j == 0) {
            return this;
        }
        long s = mo83749s();
        long j2 = (((j % 86400000000000L) + s) + 86400000000000L) % 86400000000000L;
        return s == j2 ? this : m64516j((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
    }

    /* renamed from: r */
    public final C25822j mo83748r(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.f64403b * 60) + (this.f64402a * 3600) + this.f64404c;
        int i2 = ((((int) (j % 86400)) + i) + Strategy.TTL_SECONDS_MAX) % Strategy.TTL_SECONDS_MAX;
        return i == i2 ? this : m64516j(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.f64405d);
    }

    /* renamed from: s */
    public final long mo83749s() {
        return (((long) this.f64404c) * 1000000000) + (((long) this.f64403b) * 60000000000L) + (((long) this.f64402a) * 3600000000000L) + ((long) this.f64405d);
    }

    /* renamed from: t */
    public final int mo83750t() {
        return (this.f64403b * 60) + (this.f64402a * 3600) + this.f64404c;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder(18);
        byte b = this.f64402a;
        byte b2 = this.f64403b;
        byte b3 = this.f64404c;
        int i2 = this.f64405d;
        sb.append(b < 10 ? "0" : "");
        sb.append(b);
        String str = ":0";
        sb.append(b2 < 10 ? str : ":");
        sb.append(b2);
        if (b3 > 0 || i2 > 0) {
            if (b3 >= 10) {
                str = ":";
            }
            sb.append(str);
            sb.append(b3);
            if (i2 > 0) {
                sb.append('.');
                int i3 = 1000000;
                if (i2 % 1000000 == 0) {
                    i = (i2 / 1000000) + 1000;
                } else {
                    if (i2 % 1000 == 0) {
                        i2 /= 1000;
                    } else {
                        i3 = 1000000000;
                    }
                    i = i2 + i3;
                }
                sb.append(Integer.toString(i).substring(1));
            }
        }
        return sb.toString();
    }

    /* renamed from: u */
    public final C25822j mo83609a(long j, C25842m mVar) {
        if (!(mVar instanceof C25830a)) {
            return (C25822j) mVar.mo83774e(this, j);
        }
        C25830a aVar = (C25830a) mVar;
        aVar.mo83776g(j);
        switch (C25821i.f64397a[aVar.ordinal()]) {
            case 1:
                return mo83753v((int) j);
            case 2:
                return m64518n(j);
            case 3:
                return mo83753v(((int) j) * 1000);
            case 4:
                return m64518n(j * 1000);
            case 5:
                return mo83753v(((int) j) * 1000000);
            case 6:
                return m64518n(j * 1000000);
            case 7:
                int i = (int) j;
                if (this.f64404c == i) {
                    return this;
                }
                C25830a.SECOND_OF_MINUTE.mo83776g((long) i);
                return m64516j(this.f64402a, this.f64403b, i, this.f64405d);
            case 8:
                return mo83748r(j - ((long) mo83750t()));
            case 9:
                int i2 = (int) j;
                if (this.f64403b == i2) {
                    return this;
                }
                C25830a.MINUTE_OF_HOUR.mo83776g((long) i2);
                return m64516j(this.f64402a, i2, this.f64404c, this.f64405d);
            case 10:
                return mo83746p(j - ((long) ((this.f64402a * 60) + this.f64403b)));
            case 11:
                return mo83745o(j - ((long) (this.f64402a % 12)));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return mo83745o(j - ((long) (this.f64402a % 12)));
            case 13:
                int i3 = (int) j;
                if (this.f64402a == i3) {
                    return this;
                }
                C25830a.HOUR_OF_DAY.mo83776g((long) i3);
                return m64516j(i3, this.f64403b, this.f64404c, this.f64405d);
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i4 = (int) j;
                if (this.f64402a == i4) {
                    return this;
                }
                C25830a.HOUR_OF_DAY.mo83776g((long) i4);
                return m64516j(i4, this.f64403b, this.f64404c, this.f64405d);
            case 15:
                return mo83745o((j - ((long) (this.f64402a / 12))) * 12);
            default:
                throw new C25847r("Unsupported field: " + mVar);
        }
    }

    /* renamed from: v */
    public final C25822j mo83753v(int i) {
        if (this.f64405d == i) {
            return this;
        }
        C25830a.NANO_OF_SECOND.mo83776g((long) i);
        return m64516j(this.f64402a, this.f64403b, this.f64404c, i);
    }
}
