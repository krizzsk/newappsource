package p988j$.time;

import p988j$.time.chrono.C25792h;
import p988j$.time.temporal.C25830a;
import p988j$.time.temporal.C25831b;
import p988j$.time.temporal.C25841l;
import p988j$.time.temporal.C25842m;
import p988j$.time.temporal.C25844o;
import p988j$.time.temporal.C25845p;
import p988j$.time.temporal.C25847r;
import p988j$.time.temporal.C25848s;

/* renamed from: j$.time.l */
public enum C25824l implements C25841l {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    

    /* renamed from: a */
    private static final C25824l[] f64407a = null;

    static {
        f64407a = values();
    }

    /* renamed from: j */
    public static C25824l m64538j(int i) {
        if (i >= 1 && i <= 12) {
            return f64407a[i - 1];
        }
        throw new C25784c("Invalid value for MonthOfYear: " + i);
    }

    /* renamed from: b */
    public final int mo83601b(C25842m mVar) {
        return mVar == C25830a.MONTH_OF_YEAR ? ordinal() + 1 : C25782a.m64407b(this, mVar);
    }

    /* renamed from: d */
    public final C25848s mo83602d(C25842m mVar) {
        return mVar == C25830a.MONTH_OF_YEAR ? mVar.mo83772c() : C25782a.m64409d(this, mVar);
    }

    /* renamed from: f */
    public final boolean mo83603f(C25842m mVar) {
        return mVar instanceof C25830a ? mVar == C25830a.MONTH_OF_YEAR : mVar != null && mVar.mo83770a(this);
    }

    /* renamed from: g */
    public final long mo83604g(C25842m mVar) {
        if (mVar == C25830a.MONTH_OF_YEAR) {
            return (long) (ordinal() + 1);
        }
        if (!(mVar instanceof C25830a)) {
            return mVar.mo83773d(this);
        }
        throw new C25847r("Unsupported field: " + mVar);
    }

    /* renamed from: h */
    public final Object mo83606h(C25845p pVar) {
        return pVar == C25844o.m64619a() ? C25792h.f64330a : pVar == C25844o.m64623e() ? C25831b.MONTHS : C25782a.m64408c(this, pVar);
    }

    /* renamed from: i */
    public final int mo83754i(boolean z) {
        switch (C25823k.f64406a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + true;
            case 3:
                return z + true;
            case 4:
                return z + true;
            case 5:
                return z + true;
            case 6:
                return 1;
            case 7:
                return z + true;
            case 8:
                return z + true;
            case 9:
                return z + true;
            case 10:
                return z + true;
            case 11:
                return z + true;
            default:
                return z + true;
        }
    }

    /* renamed from: k */
    public final C25824l mo83755k() {
        return f64407a[((((int) 1) + 12) + ordinal()) % 12];
    }
}
