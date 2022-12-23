package p988j$.time.temporal;

import p988j$.time.chrono.C25792h;

/* 'enum' modifier removed */
/* renamed from: j$.time.temporal.d */
final class C25833d extends C25837h {
    C25833d() {
        super("DAY_OF_QUARTER", 0);
    }

    /* renamed from: a */
    public final boolean mo83770a(C25841l lVar) {
        return lVar.mo83603f(C25830a.DAY_OF_YEAR) && lVar.mo83603f(C25830a.MONTH_OF_YEAR) && lVar.mo83603f(C25830a.YEAR) && C25837h.m64595f(lVar);
    }

    /* renamed from: b */
    public final C25848s mo83771b(C25841l lVar) {
        if (mo83770a(lVar)) {
            long g = lVar.mo83604g(C25837h.QUARTER_OF_YEAR);
            if (g != 1) {
                return g == 2 ? C25848s.m64629i(1, 91) : (g == 3 || g == 4) ? C25848s.m64629i(1, 92) : mo83772c();
            }
            long g2 = lVar.mo83604g(C25830a.YEAR);
            C25792h.f64330a.getClass();
            return C25792h.m64418a(g2) ? C25848s.m64629i(1, 91) : C25848s.m64629i(1, 90);
        }
        throw new C25847r("Unsupported field: DayOfQuarter");
    }

    /* renamed from: c */
    public final C25848s mo83772c() {
        return C25848s.m64631k(90, 92);
    }

    /* renamed from: d */
    public final long mo83773d(C25841l lVar) {
        if (mo83770a(lVar)) {
            int b = lVar.mo83601b(C25830a.DAY_OF_YEAR);
            int b2 = lVar.mo83601b(C25830a.MONTH_OF_YEAR);
            long g = lVar.mo83604g(C25830a.YEAR);
            int[] g2 = C25837h.f64426a;
            int i = (b2 - 1) / 3;
            C25792h.f64330a.getClass();
            return (long) (b - g2[i + (C25792h.m64418a(g) ? 4 : 0)]);
        }
        throw new C25847r("Unsupported field: DayOfQuarter");
    }

    /* renamed from: e */
    public final C25840k mo83774e(C25840k kVar, long j) {
        long d = mo83773d(kVar);
        mo83772c().mo83789b(j, this);
        C25830a aVar = C25830a.DAY_OF_YEAR;
        return kVar.mo83609a((j - d) + kVar.mo83604g(aVar), aVar);
    }

    public final String toString() {
        return "DayOfQuarter";
    }
}
