package p988j$.time.temporal;

import p988j$.time.C25819g;

/* 'enum' modifier removed */
/* renamed from: j$.time.temporal.f */
final class C25835f extends C25837h {
    C25835f() {
        super("WEEK_OF_WEEK_BASED_YEAR", 2);
    }

    /* renamed from: a */
    public final boolean mo83770a(C25841l lVar) {
        return lVar.mo83603f(C25830a.EPOCH_DAY) && C25837h.m64595f(lVar);
    }

    /* renamed from: b */
    public final C25848s mo83771b(C25841l lVar) {
        if (mo83770a(lVar)) {
            return C25837h.m64597h(C25819g.m64488l(lVar));
        }
        throw new C25847r("Unsupported field: WeekOfWeekBasedYear");
    }

    /* renamed from: c */
    public final C25848s mo83772c() {
        return C25848s.m64631k(52, 53);
    }

    /* renamed from: d */
    public final long mo83773d(C25841l lVar) {
        if (mo83770a(lVar)) {
            return (long) C25837h.m64598i(C25819g.m64488l(lVar));
        }
        throw new C25847r("Unsupported field: WeekOfWeekBasedYear");
    }

    /* renamed from: e */
    public final C25840k mo83774e(C25840k kVar, long j) {
        mo83772c().mo83789b(j, this);
        long d = mo83773d(kVar);
        long j2 = j - d;
        boolean z = true;
        boolean z2 = (d ^ j) >= 0;
        if ((j ^ j2) < 0) {
            z = false;
        }
        if (z2 || z) {
            return kVar.mo83613e(j2, C25831b.WEEKS);
        }
        throw new ArithmeticException();
    }

    public final String toString() {
        return "WeekOfWeekBasedYear";
    }
}
