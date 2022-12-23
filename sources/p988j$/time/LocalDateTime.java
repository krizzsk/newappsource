package p988j$.time;

import java.io.Serializable;
import p988j$.time.chrono.C25786b;
import p988j$.time.chrono.C25787c;
import p988j$.time.chrono.C25792h;
import p988j$.time.format.DateTimeFormatter;
import p988j$.time.temporal.C25830a;
import p988j$.time.temporal.C25831b;
import p988j$.time.temporal.C25840k;
import p988j$.time.temporal.C25842m;
import p988j$.time.temporal.C25844o;
import p988j$.time.temporal.C25845p;
import p988j$.time.temporal.C25846q;
import p988j$.time.temporal.C25848s;

/* renamed from: j$.time.LocalDateTime */
public final class LocalDateTime implements C25840k, C25787c, Serializable {

    /* renamed from: c */
    public static final LocalDateTime f64312c = m64361p(C25819g.f64391d, C25822j.f64399e);

    /* renamed from: d */
    public static final LocalDateTime f64313d = m64361p(C25819g.f64392e, C25822j.f64400f);

    /* renamed from: a */
    private final C25819g f64314a;

    /* renamed from: b */
    private final C25822j f64315b;

    private LocalDateTime(C25819g gVar, C25822j jVar) {
        this.f64314a = gVar;
        this.f64315b = jVar;
    }

    /* renamed from: A */
    private LocalDateTime m64359A(C25819g gVar, C25822j jVar) {
        return (this.f64314a == gVar && this.f64315b == jVar) ? this : new LocalDateTime(gVar, jVar);
    }

    /* renamed from: j */
    private int m64360j(LocalDateTime localDateTime) {
        int k = this.f64314a.mo83727k(localDateTime.f64314a);
        return k == 0 ? this.f64315b.compareTo(localDateTime.f64315b) : k;
    }

    /* renamed from: p */
    public static LocalDateTime m64361p(C25819g gVar, C25822j jVar) {
        if (gVar == null) {
            throw new NullPointerException("date");
        } else if (jVar != null) {
            return new LocalDateTime(gVar, jVar);
        } else {
            throw new NullPointerException("time");
        }
    }

    /* renamed from: q */
    public static LocalDateTime m64362q(long j, int i, ZoneOffset zoneOffset) {
        if (zoneOffset != null) {
            long j2 = (long) i;
            C25830a.NANO_OF_SECOND.mo83776g(j2);
            long j3 = j + ((long) zoneOffset.mo83654j());
            return new LocalDateTime(C25819g.m64491s(C25782a.m64413h(j3, 86400)), C25822j.m64518n((((long) ((int) C25782a.m64411f(j3, 86400))) * 1000000000) + j2));
        }
        throw new NullPointerException("offset");
    }

    /* renamed from: t */
    private LocalDateTime m64363t(C25819g gVar, long j, long j2, long j3, long j4) {
        C25819g gVar2;
        C25822j jVar;
        if ((j | j2 | j3 | j4) == 0) {
            jVar = this.f64315b;
            gVar2 = gVar;
        } else {
            long j5 = j / 24;
            long j6 = j5 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
            long j7 = (long) 1;
            long j8 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
            long s = this.f64315b.mo83749s();
            long j9 = (j8 * j7) + s;
            long h = C25782a.m64413h(j9, 86400000000000L) + (j6 * j7);
            long f = C25782a.m64411f(j9, 86400000000000L);
            jVar = f == s ? this.f64315b : C25822j.m64518n(f);
            gVar2 = gVar.mo83734u(h);
        }
        return m64359A(gVar2, jVar);
    }

    /* renamed from: b */
    public final int mo83601b(C25842m mVar) {
        return mVar instanceof C25830a ? ((C25830a) mVar).isTimeBased() ? this.f64315b.mo83601b(mVar) : this.f64314a.mo83601b(mVar) : C25782a.m64407b(this, mVar);
    }

    /* renamed from: d */
    public final C25848s mo83602d(C25842m mVar) {
        if (!(mVar instanceof C25830a)) {
            return mVar.mo83771b(this);
        }
        if (!((C25830a) mVar).isTimeBased()) {
            return this.f64314a.mo83602d(mVar);
        }
        C25822j jVar = this.f64315b;
        jVar.getClass();
        return C25782a.m64409d(jVar, mVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        return this.f64314a.equals(localDateTime.f64314a) && this.f64315b.equals(localDateTime.f64315b);
    }

    /* renamed from: f */
    public final boolean mo83603f(C25842m mVar) {
        if (!(mVar instanceof C25830a)) {
            return mVar != null && mVar.mo83770a(this);
        }
        C25830a aVar = (C25830a) mVar;
        return aVar.isDateBased() || aVar.isTimeBased();
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter != null) {
            return dateTimeFormatter.mo83665a(this);
        }
        throw new NullPointerException("formatter");
    }

    /* renamed from: g */
    public final long mo83604g(C25842m mVar) {
        return mVar instanceof C25830a ? ((C25830a) mVar).isTimeBased() ? this.f64315b.mo83604g(mVar) : this.f64314a.mo83604g(mVar) : mVar.mo83773d(this);
    }

    /* renamed from: h */
    public final Object mo83606h(C25845p pVar) {
        if (pVar == C25844o.m64620b()) {
            return this.f64314a;
        }
        if (pVar == C25844o.m64625g() || pVar == C25844o.m64624f() || pVar == C25844o.m64622d()) {
            return null;
        }
        if (pVar == C25844o.m64621c()) {
            return this.f64315b;
        }
        if (pVar != C25844o.m64619a()) {
            return pVar == C25844o.m64623e() ? C25831b.NANOS : pVar.mo83672a(this);
        }
        ((C25819g) mo83636w()).getClass();
        return C25792h.f64330a;
    }

    public final int hashCode() {
        return this.f64314a.hashCode() ^ this.f64315b.hashCode();
    }

    /* renamed from: i */
    public final int compareTo(C25787c cVar) {
        if (cVar instanceof LocalDateTime) {
            return m64360j((LocalDateTime) cVar);
        }
        LocalDateTime localDateTime = (LocalDateTime) cVar;
        int j = this.f64314a.compareTo(localDateTime.f64314a);
        if (j != 0) {
            return j;
        }
        int i = this.f64315b.compareTo(localDateTime.f64315b);
        if (i != 0) {
            return i;
        }
        ((C25819g) mo83636w()).getClass();
        C25792h hVar = C25792h.f64330a;
        ((C25819g) localDateTime.mo83636w()).getClass();
        hVar.getClass();
        hVar.getClass();
        return 0;
    }

    /* renamed from: k */
    public final int mo83626k() {
        return this.f64315b.mo83743l();
    }

    /* renamed from: l */
    public final int mo83627l() {
        return this.f64315b.mo83744m();
    }

    /* renamed from: m */
    public final int mo83628m() {
        return this.f64314a.mo83730p();
    }

    /* renamed from: n */
    public final boolean mo83629n(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return m64360j(localDateTime) > 0;
        }
        int i = (this.f64314a.mo83737y() > localDateTime.f64314a.mo83737y() ? 1 : (this.f64314a.mo83737y() == localDateTime.f64314a.mo83737y() ? 0 : -1));
        if (i <= 0) {
            return i == 0 && this.f64315b.mo83749s() > localDateTime.f64315b.mo83749s();
        }
        return true;
    }

    /* renamed from: o */
    public final boolean mo83630o(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return m64360j(localDateTime) < 0;
        }
        int i = (this.f64314a.mo83737y() > localDateTime.f64314a.mo83737y() ? 1 : (this.f64314a.mo83737y() == localDateTime.f64314a.mo83737y() ? 0 : -1));
        if (i >= 0) {
            return i == 0 && this.f64315b.mo83749s() < localDateTime.f64315b.mo83749s();
        }
        return true;
    }

    /* renamed from: r */
    public final LocalDateTime mo83613e(long j, C25846q qVar) {
        long j2 = j;
        C25846q qVar2 = qVar;
        if (!(qVar2 instanceof C25831b)) {
            return (LocalDateTime) qVar2.mo83780a(this, j2);
        }
        switch (C25820h.f64396a[((C25831b) qVar2).ordinal()]) {
            case 1:
                return m64363t(this.f64314a, 0, 0, 0, j);
            case 2:
                LocalDateTime A = m64359A(this.f64314a.mo83734u(j2 / 86400000000L), this.f64315b);
                return A.m64363t(A.f64314a, 0, 0, 0, (j2 % 86400000000L) * 1000);
            case 3:
                LocalDateTime A2 = m64359A(this.f64314a.mo83734u(j2 / 86400000), this.f64315b);
                return A2.m64363t(A2.f64314a, 0, 0, 0, (j2 % 86400000) * 1000000);
            case 4:
                return mo83632s(j);
            case 5:
                return m64363t(this.f64314a, 0, j, 0, 0);
            case 6:
                return m64363t(this.f64314a, j, 0, 0, 0);
            case 7:
                LocalDateTime A3 = m64359A(this.f64314a.mo83734u(j2 / 256), this.f64315b);
                return A3.m64363t(A3.f64314a, (j2 % 256) * 12, 0, 0, 0);
            default:
                return m64359A(this.f64314a.mo83613e(j2, qVar2), this.f64315b);
        }
    }

    /* renamed from: s */
    public final LocalDateTime mo83632s(long j) {
        return m64363t(this.f64314a, 0, 0, j, 0);
    }

    public final String toString() {
        return this.f64314a.toString() + 'T' + this.f64315b.toString();
    }

    /* renamed from: u */
    public final long mo83634u(ZoneOffset zoneOffset) {
        if (zoneOffset != null) {
            return ((((C25819g) mo83636w()).mo83737y() * 86400) + ((long) mo83637x().mo83750t())) - ((long) zoneOffset.mo83654j());
        }
        throw new NullPointerException("offset");
    }

    /* renamed from: v */
    public final C25819g mo83635v() {
        return this.f64314a;
    }

    /* renamed from: w */
    public final C25786b mo83636w() {
        return this.f64314a;
    }

    /* renamed from: x */
    public final C25822j mo83637x() {
        return this.f64315b;
    }

    /* renamed from: y */
    public final LocalDateTime mo83609a(long j, C25842m mVar) {
        return mVar instanceof C25830a ? ((C25830a) mVar).isTimeBased() ? m64359A(this.f64314a, this.f64315b.mo83609a(j, mVar)) : m64359A(this.f64314a.mo83609a(j, mVar), this.f64315b) : (LocalDateTime) mVar.mo83774e(this, j);
    }

    /* renamed from: z */
    public final LocalDateTime mo83611c(C25819g gVar) {
        return m64359A(gVar, this.f64315b);
    }
}
