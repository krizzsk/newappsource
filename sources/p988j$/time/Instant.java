package p988j$.time;

import java.io.Serializable;
import p988j$.time.format.DateTimeFormatter;
import p988j$.time.temporal.C25830a;
import p988j$.time.temporal.C25831b;
import p988j$.time.temporal.C25840k;
import p988j$.time.temporal.C25842m;
import p988j$.time.temporal.C25844o;
import p988j$.time.temporal.C25845p;
import p988j$.time.temporal.C25846q;
import p988j$.time.temporal.C25847r;
import p988j$.time.temporal.C25848s;

/* renamed from: j$.time.Instant */
public final class Instant implements C25840k, Comparable<Instant>, Serializable {

    /* renamed from: c */
    public static final Instant f64309c = new Instant(0, 0);

    /* renamed from: a */
    private final long f64310a;

    /* renamed from: b */
    private final int f64311b;

    static {
        m64345n(-31557014167219200L, 0);
        m64345n(31556889864403199L, 999999999);
    }

    private Instant(long j, int i) {
        this.f64310a = j;
        this.f64311b = i;
    }

    /* renamed from: j */
    private static Instant m64343j(long j, int i) {
        if ((((long) i) | j) == 0) {
            return f64309c;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new Instant(j, i);
        }
        throw new C25784c("Instant exceeds minimum or maximum instant");
    }

    /* renamed from: m */
    public static Instant m64344m(long j) {
        return m64343j(C25782a.m64413h(j, 1000), ((int) C25782a.m64411f(j, 1000)) * 1000000);
    }

    /* renamed from: n */
    public static Instant m64345n(long j, long j2) {
        return m64343j(C25782a.m64410e(j, C25782a.m64413h(j2, 1000000000)), (int) C25782a.m64411f(j2, 1000000000));
    }

    /* renamed from: o */
    private Instant m64346o(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return m64345n(C25782a.m64410e(C25782a.m64410e(this.f64310a, j), j2 / 1000000000), ((long) this.f64311b) + (j2 % 1000000000));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r4 != r2.f64311b) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        if (r4 != r2.f64311b) goto L_0x0054;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p988j$.time.temporal.C25840k mo83609a(long r3, p988j$.time.temporal.C25842m r5) {
        /*
            r2 = this;
            boolean r0 = r5 instanceof p988j$.time.temporal.C25830a
            if (r0 == 0) goto L_0x0068
            r0 = r5
            j$.time.temporal.a r0 = (p988j$.time.temporal.C25830a) r0
            r0.mo83776g(r3)
            int[] r1 = p988j$.time.C25794e.f64334a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L_0x0057
            r1 = 2
            if (r0 == r1) goto L_0x004d
            r1 = 3
            if (r0 == r1) goto L_0x0042
            r1 = 4
            if (r0 != r1) goto L_0x002b
            long r0 = r2.f64310a
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x0066
            int r5 = r2.f64311b
            j$.time.Instant r3 = m64343j(r3, r5)
            goto L_0x006e
        L_0x002b:
            j$.time.temporal.r r3 = new j$.time.temporal.r
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Unsupported field: "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x0042:
            int r4 = (int) r3
            r3 = 1000000(0xf4240, float:1.401298E-39)
            int r4 = r4 * r3
            int r3 = r2.f64311b
            if (r4 == r3) goto L_0x0066
            goto L_0x0054
        L_0x004d:
            int r4 = (int) r3
            int r4 = r4 * 1000
            int r3 = r2.f64311b
            if (r4 == r3) goto L_0x0066
        L_0x0054:
            long r0 = r2.f64310a
            goto L_0x0061
        L_0x0057:
            int r5 = r2.f64311b
            long r0 = (long) r5
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x0066
            long r0 = r2.f64310a
            int r4 = (int) r3
        L_0x0061:
            j$.time.Instant r3 = m64343j(r0, r4)
            goto L_0x006e
        L_0x0066:
            r3 = r2
            goto L_0x006e
        L_0x0068:
            j$.time.temporal.k r3 = r5.mo83774e(r2, r3)
            j$.time.Instant r3 = (p988j$.time.Instant) r3
        L_0x006e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.time.Instant.mo83609a(long, j$.time.temporal.m):j$.time.temporal.k");
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.m64387j(this, zoneOffset);
    }

    /* renamed from: b */
    public final int mo83601b(C25842m mVar) {
        if (!(mVar instanceof C25830a)) {
            return C25782a.m64409d(this, mVar).mo83788a(mVar.mo83773d(this), mVar);
        }
        int i = C25794e.f64334a[((C25830a) mVar).ordinal()];
        if (i == 1) {
            return this.f64311b;
        }
        if (i == 2) {
            return this.f64311b / 1000;
        }
        if (i == 3) {
            return this.f64311b / 1000000;
        }
        if (i == 4) {
            C25830a.INSTANT_SECONDS.mo83775f(this.f64310a);
        }
        throw new C25847r("Unsupported field: " + mVar);
    }

    /* renamed from: c */
    public final C25840k mo83611c(C25819g gVar) {
        return (Instant) gVar.mo83725i(this);
    }

    /* renamed from: d */
    public final C25848s mo83602d(C25842m mVar) {
        return C25782a.m64409d(this, mVar);
    }

    /* renamed from: e */
    public final C25840k mo83613e(long j, C25846q qVar) {
        long j2;
        if (!(qVar instanceof C25831b)) {
            return (Instant) qVar.mo83780a(this, j);
        }
        switch (C25794e.f64335b[((C25831b) qVar).ordinal()]) {
            case 1:
                return m64346o(0, j);
            case 2:
                return m64346o(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return m64346o(j / 1000, (j % 1000) * 1000000);
            case 4:
                return mo83619p(j);
            case 5:
                j2 = 60;
                break;
            case 6:
                j2 = 3600;
                break;
            case 7:
                j2 = 43200;
                break;
            case 8:
                j2 = 86400;
                break;
            default:
                throw new C25847r("Unsupported unit: " + qVar);
        }
        j = C25782a.m64412g(j, j2);
        return mo83619p(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.f64310a == instant.f64310a && this.f64311b == instant.f64311b;
    }

    /* renamed from: f */
    public final boolean mo83603f(C25842m mVar) {
        return mVar instanceof C25830a ? mVar == C25830a.INSTANT_SECONDS || mVar == C25830a.NANO_OF_SECOND || mVar == C25830a.MICRO_OF_SECOND || mVar == C25830a.MILLI_OF_SECOND : mVar != null && mVar.mo83770a(this);
    }

    /* renamed from: g */
    public final long mo83604g(C25842m mVar) {
        int i;
        if (!(mVar instanceof C25830a)) {
            return mVar.mo83773d(this);
        }
        int i2 = C25794e.f64334a[((C25830a) mVar).ordinal()];
        if (i2 == 1) {
            i = this.f64311b;
        } else if (i2 == 2) {
            i = this.f64311b / 1000;
        } else if (i2 == 3) {
            i = this.f64311b / 1000000;
        } else if (i2 == 4) {
            return this.f64310a;
        } else {
            throw new C25847r("Unsupported field: " + mVar);
        }
        return (long) i;
    }

    /* renamed from: h */
    public final Object mo83606h(C25845p pVar) {
        if (pVar == C25844o.m64623e()) {
            return C25831b.NANOS;
        }
        if (pVar == C25844o.m64619a() || pVar == C25844o.m64625g() || pVar == C25844o.m64624f() || pVar == C25844o.m64622d() || pVar == C25844o.m64620b() || pVar == C25844o.m64621c()) {
            return null;
        }
        return pVar.mo83672a(this);
    }

    public final int hashCode() {
        long j = this.f64310a;
        return (this.f64311b * 51) + ((int) (j ^ (j >>> 32)));
    }

    /* renamed from: i */
    public final int compareTo(Instant instant) {
        int compare = Long.compare(this.f64310a, instant.f64310a);
        return compare != 0 ? compare : this.f64311b - instant.f64311b;
    }

    /* renamed from: k */
    public final long mo83617k() {
        return this.f64310a;
    }

    /* renamed from: l */
    public final int mo83618l() {
        return this.f64311b;
    }

    /* renamed from: p */
    public final Instant mo83619p(long j) {
        return m64346o(j, 0);
    }

    public final String toString() {
        return DateTimeFormatter.f64338f.mo83665a(this);
    }
}
