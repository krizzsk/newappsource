package p988j$.time;

import com.appsflyer.internal.referrer.Payload;
import java.io.Serializable;
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
import p988j$.time.zone.C25852c;

/* renamed from: j$.time.OffsetDateTime */
public final class OffsetDateTime implements C25840k, Comparable<OffsetDateTime>, Serializable {

    /* renamed from: a */
    private final LocalDateTime f64316a;

    /* renamed from: b */
    private final ZoneOffset f64317b;

    static {
        LocalDateTime localDateTime = LocalDateTime.f64312c;
        ZoneOffset zoneOffset = ZoneOffset.f64326f;
        localDateTime.getClass();
        m64386i(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.f64313d;
        ZoneOffset zoneOffset2 = ZoneOffset.f64325e;
        localDateTime2.getClass();
        m64386i(localDateTime2, zoneOffset2);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        if (localDateTime != null) {
            this.f64316a = localDateTime;
            if (zoneOffset != null) {
                this.f64317b = zoneOffset;
                return;
            }
            throw new NullPointerException("offset");
        }
        throw new NullPointerException("dateTime");
    }

    /* renamed from: i */
    public static OffsetDateTime m64386i(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    /* renamed from: j */
    public static OffsetDateTime m64387j(Instant instant, C25826n nVar) {
        if (instant == null) {
            throw new NullPointerException(Payload.INSTANT);
        } else if (nVar != null) {
            ZoneOffset b = C25852c.m64663g((ZoneOffset) nVar).mo83811b(instant);
            return new OffsetDateTime(LocalDateTime.m64362q(instant.mo83617k(), instant.mo83618l(), b), b);
        } else {
            throw new NullPointerException("zone");
        }
    }

    /* renamed from: k */
    private OffsetDateTime m64388k(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f64316a != localDateTime || !this.f64317b.equals(zoneOffset)) ? new OffsetDateTime(localDateTime, zoneOffset) : this;
    }

    /* renamed from: a */
    public final C25840k mo83609a(long j, C25842m mVar) {
        if (!(mVar instanceof C25830a)) {
            return (OffsetDateTime) mVar.mo83774e(this, j);
        }
        C25830a aVar = (C25830a) mVar;
        int i = C25825m.f64409a[aVar.ordinal()];
        return i != 1 ? i != 2 ? m64388k(this.f64316a.mo83609a(j, mVar), this.f64317b) : m64388k(this.f64316a, ZoneOffset.m64398k(aVar.mo83775f(j))) : m64387j(Instant.m64345n(j, (long) this.f64316a.mo83626k()), this.f64317b);
    }

    /* renamed from: b */
    public final int mo83601b(C25842m mVar) {
        if (!(mVar instanceof C25830a)) {
            return C25782a.m64407b(this, mVar);
        }
        int i = C25825m.f64409a[((C25830a) mVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.f64316a.mo83601b(mVar) : this.f64317b.mo83654j();
        }
        throw new C25847r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    /* renamed from: c */
    public final C25840k mo83611c(C25819g gVar) {
        return m64388k(this.f64316a.mo83611c(gVar), this.f64317b);
    }

    public final int compareTo(Object obj) {
        int i;
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        if (this.f64317b.equals(offsetDateTime.f64317b)) {
            i = toLocalDateTime().compareTo(offsetDateTime.toLocalDateTime());
        } else {
            i = Long.compare(this.f64316a.mo83634u(this.f64317b), offsetDateTime.f64316a.mo83634u(offsetDateTime.f64317b));
            if (i == 0) {
                i = this.f64316a.mo83637x().mo83743l() - offsetDateTime.f64316a.mo83637x().mo83743l();
            }
        }
        return i == 0 ? toLocalDateTime().compareTo(offsetDateTime.toLocalDateTime()) : i;
    }

    /* renamed from: d */
    public final C25848s mo83602d(C25842m mVar) {
        return mVar instanceof C25830a ? (mVar == C25830a.INSTANT_SECONDS || mVar == C25830a.OFFSET_SECONDS) ? mVar.mo83772c() : this.f64316a.mo83602d(mVar) : mVar.mo83771b(this);
    }

    /* renamed from: e */
    public final C25840k mo83613e(long j, C25846q qVar) {
        return qVar instanceof C25831b ? m64388k(this.f64316a.mo83613e(j, qVar), this.f64317b) : (OffsetDateTime) qVar.mo83780a(this, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetDateTime)) {
            return false;
        }
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        return this.f64316a.equals(offsetDateTime.f64316a) && this.f64317b.equals(offsetDateTime.f64317b);
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
        int i = C25825m.f64409a[((C25830a) mVar).ordinal()];
        return i != 1 ? i != 2 ? this.f64316a.mo83604g(mVar) : (long) this.f64317b.mo83654j() : this.f64316a.mo83634u(this.f64317b);
    }

    /* renamed from: h */
    public final Object mo83606h(C25845p pVar) {
        if (pVar == C25844o.m64622d() || pVar == C25844o.m64624f()) {
            return this.f64317b;
        }
        if (pVar == C25844o.m64625g()) {
            return null;
        }
        return pVar == C25844o.m64620b() ? this.f64316a.mo83635v() : pVar == C25844o.m64621c() ? this.f64316a.mo83637x() : pVar == C25844o.m64619a() ? C25792h.f64330a : pVar == C25844o.m64623e() ? C25831b.NANOS : pVar.mo83672a(this);
    }

    public final int hashCode() {
        return this.f64316a.hashCode() ^ this.f64317b.hashCode();
    }

    public LocalDateTime toLocalDateTime() {
        return this.f64316a;
    }

    public final String toString() {
        return this.f64316a.toString() + this.f64317b.toString();
    }
}
