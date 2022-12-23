package p988j$.time.temporal;

import p988j$.time.C25819g;

/* 'enum' modifier removed */
/* renamed from: j$.time.temporal.g */
final class C25836g extends C25837h {
    C25836g() {
        super("WEEK_BASED_YEAR", 3);
    }

    /* renamed from: a */
    public final boolean mo83770a(C25841l lVar) {
        return lVar.mo83603f(C25830a.EPOCH_DAY) && C25837h.m64595f(lVar);
    }

    /* renamed from: c */
    public final C25848s mo83772c() {
        return C25830a.YEAR.mo83772c();
    }

    /* renamed from: d */
    public final long mo83773d(C25841l lVar) {
        if (mo83770a(lVar)) {
            return (long) C25837h.m64601l(C25819g.m64488l(lVar));
        }
        throw new C25847r("Unsupported field: WeekBasedYear");
    }

    /* renamed from: e */
    public final C25840k mo83774e(C25840k kVar, long j) {
        if (mo83770a(kVar)) {
            int a = mo83772c().mo83788a(j, C25837h.WEEK_BASED_YEAR);
            C25819g l = C25819g.m64488l(kVar);
            C25830a aVar = C25830a.DAY_OF_WEEK;
            int b = l.mo83601b(aVar);
            int i = C25837h.m64598i(l);
            if (i == 53 && C25837h.m64602m(a) == 52) {
                i = 52;
            }
            C25819g r = C25819g.m64490r(a, 1, 4);
            return kVar.mo83611c(r.mo83734u((long) (((i - 1) * 7) + (b - r.mo83601b(aVar)))));
        }
        throw new C25847r("Unsupported field: WeekBasedYear");
    }

    public final String toString() {
        return "WeekBasedYear";
    }
}
