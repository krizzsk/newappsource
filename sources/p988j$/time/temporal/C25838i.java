package p988j$.time.temporal;

import p988j$.time.C25782a;

/* renamed from: j$.time.temporal.i */
enum C25838i implements C25846q {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");
    

    /* renamed from: a */
    private final String f64429a;

    private C25838i(String str) {
        this.f64429a = str;
    }

    /* renamed from: a */
    public final C25840k mo83780a(C25840k kVar, long j) {
        int i = C25832c.f64425a[ordinal()];
        if (i == 1) {
            C25842m mVar = C25839j.f64432c;
            return kVar.mo83609a(C25782a.m64410e((long) kVar.mo83601b(mVar), j), mVar);
        } else if (i == 2) {
            return kVar.mo83613e(j / 256, C25831b.YEARS).mo83613e((j % 256) * 3, C25831b.MONTHS);
        } else {
            throw new IllegalStateException("Unreachable");
        }
    }

    public final boolean isDateBased() {
        return true;
    }

    public final String toString() {
        return this.f64429a;
    }
}
