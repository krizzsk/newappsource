package p988j$.time;

import com.appsflyer.internal.referrer.Payload;
import java.io.Serializable;
import java.util.List;
import p988j$.time.chrono.C25788d;
import p988j$.time.chrono.C25790f;
import p988j$.time.chrono.C25792h;
import p988j$.time.temporal.C25830a;
import p988j$.time.temporal.C25831b;
import p988j$.time.temporal.C25840k;
import p988j$.time.temporal.C25842m;
import p988j$.time.temporal.C25844o;
import p988j$.time.temporal.C25845p;
import p988j$.time.temporal.C25846q;
import p988j$.time.temporal.C25847r;
import p988j$.time.temporal.C25848s;
import p988j$.time.zone.C25850a;
import p988j$.time.zone.C25852c;

/* renamed from: j$.time.q */
public final class C25829q implements C25840k, C25790f, Serializable {

    /* renamed from: a */
    private final LocalDateTime f64411a;

    /* renamed from: b */
    private final ZoneOffset f64412b;

    /* renamed from: c */
    private final C25826n f64413c;

    private C25829q(LocalDateTime localDateTime, C25826n nVar, ZoneOffset zoneOffset) {
        this.f64411a = localDateTime;
        this.f64412b = zoneOffset;
        this.f64413c = nVar;
    }

    /* renamed from: i */
    private static C25829q m64547i(long j, int i, C25826n nVar) {
        ZoneOffset zoneOffset = (ZoneOffset) nVar;
        zoneOffset.getClass();
        ZoneOffset b = C25852c.m64663g(zoneOffset).mo83811b(Instant.m64345n(j, (long) i));
        return new C25829q(LocalDateTime.m64362q(j, i, b), nVar, b);
    }

    /* renamed from: k */
    public static C25829q m64548k(Instant instant, C25826n nVar) {
        if (instant != null) {
            return m64547i(instant.mo83617k(), instant.mo83618l(), nVar);
        }
        throw new NullPointerException(Payload.INSTANT);
    }

    /* renamed from: l */
    public static C25829q m64549l(LocalDateTime localDateTime, C25826n nVar, ZoneOffset zoneOffset) {
        if (localDateTime == null) {
            throw new NullPointerException("localDateTime");
        } else if (nVar == null) {
            throw new NullPointerException("zone");
        } else if (nVar instanceof ZoneOffset) {
            return new C25829q(localDateTime, nVar, (ZoneOffset) nVar);
        } else {
            C25852c g = C25852c.m64663g((ZoneOffset) nVar);
            List e = g.mo83813e(localDateTime);
            if (e.size() == 1) {
                zoneOffset = (ZoneOffset) e.get(0);
            } else if (e.size() == 0) {
                C25850a d = g.mo83812d(localDateTime);
                localDateTime = localDateTime.mo83632s(d.mo83801c().mo83660b());
                zoneOffset = d.mo83803d();
            } else if ((zoneOffset == null || !e.contains(zoneOffset)) && (zoneOffset = (ZoneOffset) e.get(0)) == null) {
                throw new NullPointerException("offset");
            }
            return new C25829q(localDateTime, nVar, zoneOffset);
        }
    }

    /* renamed from: m */
    private C25829q m64550m(ZoneOffset zoneOffset) {
        if (!zoneOffset.equals(this.f64412b)) {
            ZoneOffset zoneOffset2 = (ZoneOffset) this.f64413c;
            zoneOffset2.getClass();
            if (C25852c.m64663g(zoneOffset2).mo83813e(this.f64411a).contains(zoneOffset)) {
                return new C25829q(this.f64411a, this.f64413c, zoneOffset);
            }
        }
        return this;
    }

    /* renamed from: a */
    public final C25840k mo83609a(long j, C25842m mVar) {
        if (!(mVar instanceof C25830a)) {
            return (C25829q) mVar.mo83774e(this, j);
        }
        C25830a aVar = (C25830a) mVar;
        int i = C25828p.f64410a[aVar.ordinal()];
        return i != 1 ? i != 2 ? m64549l(this.f64411a.mo83609a(j, mVar), this.f64413c, this.f64412b) : m64550m(ZoneOffset.m64398k(aVar.mo83775f(j))) : m64547i(j, this.f64411a.mo83626k(), this.f64413c);
    }

    /* renamed from: b */
    public final int mo83601b(C25842m mVar) {
        if (!(mVar instanceof C25830a)) {
            return C25788d.m64416a(this, mVar);
        }
        int i = C25828p.f64410a[((C25830a) mVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.f64411a.mo83601b(mVar) : this.f64412b.mo83654j();
        }
        throw new C25847r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    /* renamed from: c */
    public final C25840k mo83611c(C25819g gVar) {
        return m64549l(LocalDateTime.m64361p(gVar, this.f64411a.mo83637x()), this.f64413c, this.f64412b);
    }

    public final int compareTo(Object obj) {
        C25829q qVar = (C25829q) ((C25790f) obj);
        int compare = Long.compare(mo83760n(), qVar.mo83760n());
        if (compare != 0) {
            return compare;
        }
        int l = mo83763q().mo83743l() - qVar.mo83763q().mo83743l();
        if (l != 0) {
            return l;
        }
        int i = this.f64411a.compareTo(qVar.f64411a);
        if (i != 0) {
            return i;
        }
        int compareTo = this.f64413c.mo83653i().compareTo(qVar.f64413c.mo83653i());
        if (compareTo != 0) {
            return compareTo;
        }
        mo83761o().getClass();
        C25792h hVar = C25792h.f64330a;
        qVar.mo83761o().getClass();
        hVar.getClass();
        hVar.getClass();
        return 0;
    }

    /* renamed from: d */
    public final C25848s mo83602d(C25842m mVar) {
        return mVar instanceof C25830a ? (mVar == C25830a.INSTANT_SECONDS || mVar == C25830a.OFFSET_SECONDS) ? mVar.mo83772c() : this.f64411a.mo83602d(mVar) : mVar.mo83771b(this);
    }

    /* renamed from: e */
    public final C25840k mo83613e(long j, C25846q qVar) {
        if (!(qVar instanceof C25831b)) {
            return (C25829q) qVar.mo83780a(this, j);
        }
        if (qVar.isDateBased()) {
            return m64549l(this.f64411a.mo83613e(j, qVar), this.f64413c, this.f64412b);
        }
        LocalDateTime r = this.f64411a.mo83613e(j, qVar);
        ZoneOffset zoneOffset = this.f64412b;
        C25826n nVar = this.f64413c;
        if (r == null) {
            throw new NullPointerException("localDateTime");
        } else if (zoneOffset == null) {
            throw new NullPointerException("offset");
        } else if (nVar != null) {
            return C25852c.m64663g((ZoneOffset) nVar).mo83813e(r).contains(zoneOffset) ? new C25829q(r, nVar, zoneOffset) : m64547i(r.mo83634u(zoneOffset), r.mo83626k(), nVar);
        } else {
            throw new NullPointerException("zone");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25829q)) {
            return false;
        }
        C25829q qVar = (C25829q) obj;
        return this.f64411a.equals(qVar.f64411a) && this.f64412b.equals(qVar.f64412b) && this.f64413c.equals(qVar.f64413c);
    }

    /* renamed from: f */
    public final boolean mo83603f(C25842m mVar) {
        return (mVar instanceof C25830a) || (mVar != null && mVar.mo83770a(this));
    }

    /* renamed from: g */
    public final long mo83604g(C25842m mVar) {
        if (!(mVar instanceof C25830a)) {
            return mVar.mo83773d(this);
        }
        int i = C25828p.f64410a[((C25830a) mVar).ordinal()];
        return i != 1 ? i != 2 ? this.f64411a.mo83604g(mVar) : (long) this.f64412b.mo83654j() : mo83760n();
    }

    /* renamed from: h */
    public final Object mo83606h(C25845p pVar) {
        if (pVar == C25844o.m64620b()) {
            return mo83761o();
        }
        if (pVar == C25844o.m64624f() || pVar == C25844o.m64625g()) {
            return this.f64413c;
        }
        if (pVar == C25844o.m64622d()) {
            return this.f64412b;
        }
        if (pVar == C25844o.m64621c()) {
            return mo83763q();
        }
        if (pVar != C25844o.m64619a()) {
            return pVar == C25844o.m64623e() ? C25831b.NANOS : pVar.mo83672a(this);
        }
        mo83761o().getClass();
        return C25792h.f64330a;
    }

    public final int hashCode() {
        return (this.f64411a.hashCode() ^ this.f64412b.hashCode()) ^ Integer.rotateLeft(this.f64413c.hashCode(), 3);
    }

    /* renamed from: j */
    public final ZoneOffset mo83759j() {
        return this.f64412b;
    }

    /* renamed from: n */
    public final long mo83760n() {
        return ((mo83761o().mo83737y() * 86400) + ((long) mo83763q().mo83750t())) - ((long) mo83759j().mo83654j());
    }

    /* renamed from: o */
    public final C25819g mo83761o() {
        return this.f64411a.mo83635v();
    }

    /* renamed from: p */
    public final LocalDateTime mo83762p() {
        return this.f64411a;
    }

    /* renamed from: q */
    public final C25822j mo83763q() {
        return this.f64411a.mo83637x();
    }

    public final String toString() {
        String str = this.f64411a.toString() + this.f64412b.toString();
        if (this.f64412b == this.f64413c) {
            return str;
        }
        return str + '[' + this.f64413c.toString() + ']';
    }
}
