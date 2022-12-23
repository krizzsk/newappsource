package p988j$.time.temporal;

/* 'enum' modifier removed */
/* renamed from: j$.time.temporal.e */
final class C25834e extends C25837h {
    C25834e() {
        super("QUARTER_OF_YEAR", 1);
    }

    /* renamed from: a */
    public final boolean mo83770a(C25841l lVar) {
        return lVar.mo83603f(C25830a.MONTH_OF_YEAR) && C25837h.m64595f(lVar);
    }

    /* renamed from: c */
    public final C25848s mo83772c() {
        return C25848s.m64629i(1, 4);
    }

    /* renamed from: d */
    public final long mo83773d(C25841l lVar) {
        if (mo83770a(lVar)) {
            return (lVar.mo83604g(C25830a.MONTH_OF_YEAR) + 2) / 3;
        }
        throw new C25847r("Unsupported field: QuarterOfYear");
    }

    /* renamed from: e */
    public final C25840k mo83774e(C25840k kVar, long j) {
        long d = mo83773d(kVar);
        mo83772c().mo83789b(j, this);
        C25830a aVar = C25830a.MONTH_OF_YEAR;
        return kVar.mo83609a(((j - d) * 3) + kVar.mo83604g(aVar), aVar);
    }

    public final String toString() {
        return "QuarterOfYear";
    }
}
