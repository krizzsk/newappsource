package p988j$.time.format;

import java.util.Locale;
import p988j$.time.C25783b;
import p988j$.time.C25784c;
import p988j$.time.C25819g;
import p988j$.time.C25826n;
import p988j$.time.C25829q;
import p988j$.time.Instant;
import p988j$.time.ZoneOffset;
import p988j$.time.chrono.C25791g;
import p988j$.time.chrono.C25792h;
import p988j$.time.temporal.C25830a;
import p988j$.time.temporal.C25841l;
import p988j$.time.temporal.C25842m;
import p988j$.time.temporal.C25844o;
import p988j$.time.temporal.C25845p;
import p988j$.time.zone.C25852c;
import p988j$.util.C26016n;

/* renamed from: j$.time.format.s */
final class C25814s {

    /* renamed from: a */
    private C25841l f64382a;

    /* renamed from: b */
    private DateTimeFormatter f64383b;

    /* renamed from: c */
    private int f64384c;

    C25814s(C25841l lVar, DateTimeFormatter dateTimeFormatter) {
        Instant instant;
        C25791g b = dateTimeFormatter.mo83666b();
        C25826n e = dateTimeFormatter.mo83669e();
        if (!(b == null && e == null)) {
            C25791g gVar = (C25791g) lVar.mo83606h(C25844o.m64619a());
            C25826n nVar = (C25826n) lVar.mo83606h(C25844o.m64625g());
            C25819g gVar2 = null;
            b = C26016n.m64895k(b, gVar) ? null : b;
            e = C26016n.m64895k(e, nVar) ? null : e;
            if (!(b == null && e == null)) {
                C25791g gVar3 = b != null ? b : gVar;
                if (e != null) {
                    C25830a aVar = C25830a.INSTANT_SECONDS;
                    if (lVar.mo83603f(aVar)) {
                        gVar3 = gVar3 == null ? C25792h.f64330a : gVar3;
                        Instant instant2 = Instant.f64309c;
                        if (lVar instanceof Instant) {
                            instant = (Instant) lVar;
                        } else {
                            try {
                                instant = Instant.m64345n(lVar.mo83604g(aVar), (long) lVar.mo83601b(C25830a.NANO_OF_SECOND));
                            } catch (C25784c e2) {
                                throw new C25784c("Unable to obtain Instant from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName(), e2);
                            }
                        }
                        ((C25792h) gVar3).getClass();
                        lVar = C25829q.m64548k(instant, e);
                    } else {
                        ZoneOffset zoneOffset = (ZoneOffset) e;
                        C25852c g = C25852c.m64663g(zoneOffset);
                        if ((g.mo83815f() ? g.mo83811b(Instant.f64309c) : e) instanceof ZoneOffset) {
                            C25830a aVar2 = C25830a.OFFSET_SECONDS;
                            if (lVar.mo83603f(aVar2) && lVar.mo83601b(aVar2) != C25852c.m64663g(zoneOffset).mo83811b(Instant.f64309c).mo83654j()) {
                                throw new C25784c("Unable to apply override zone '" + e + "' because the temporal object being formatted has a different offset but does not represent an instant: " + lVar);
                            }
                        }
                    }
                }
                nVar = e != null ? e : nVar;
                if (b != null) {
                    if (lVar.mo83603f(C25830a.EPOCH_DAY)) {
                        ((C25792h) gVar3).getClass();
                        gVar2 = C25819g.m64488l(lVar);
                    } else if (!(b == C25792h.f64330a && gVar == null)) {
                        C25830a[] values = C25830a.values();
                        int length = values.length;
                        int i = 0;
                        while (i < length) {
                            C25830a aVar3 = values[i];
                            if (!aVar3.isDateBased() || !lVar.mo83603f(aVar3)) {
                                i++;
                            } else {
                                throw new C25784c("Unable to apply override chronology '" + b + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + lVar);
                            }
                        }
                    }
                }
                lVar = new C25813r(gVar2, lVar, gVar3, nVar);
            }
        }
        this.f64382a = lVar;
        this.f64383b = dateTimeFormatter;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo83708a() {
        this.f64384c--;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C25817v mo83709b() {
        return this.f64383b.mo83667c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Locale mo83710c() {
        return this.f64383b.mo83668d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C25841l mo83711d() {
        return this.f64382a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Long mo83712e(C25842m mVar) {
        try {
            return Long.valueOf(this.f64382a.mo83604g(mVar));
        } catch (C25784c e) {
            if (this.f64384c > 0) {
                return null;
            }
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final Object mo83713f(C25845p pVar) {
        Object h = this.f64382a.mo83606h(pVar);
        if (h != null || this.f64384c != 0) {
            return h;
        }
        StringBuilder a = C25783b.m64414a("Unable to extract value: ");
        a.append(this.f64382a.getClass());
        throw new C25784c(a.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo83714g() {
        this.f64384c++;
    }

    public final String toString() {
        return this.f64382a.toString();
    }
}
