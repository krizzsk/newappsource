package p988j$.time;

import java.util.Locale;
import p988j$.time.format.C25811p;
import p988j$.time.format.TextStyle;
import p988j$.time.temporal.C25830a;
import p988j$.time.temporal.C25831b;
import p988j$.time.temporal.C25841l;
import p988j$.time.temporal.C25842m;
import p988j$.time.temporal.C25844o;
import p988j$.time.temporal.C25845p;
import p988j$.time.temporal.C25847r;
import p988j$.time.temporal.C25848s;

/* renamed from: j$.time.DayOfWeek */
public enum DayOfWeek implements C25841l {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    

    /* renamed from: a */
    private static final DayOfWeek[] f64307a = null;

    static {
        f64307a = values();
    }

    /* renamed from: j */
    public static DayOfWeek m64335j(int i) {
        if (i >= 1 && i <= 7) {
            return f64307a[i - 1];
        }
        throw new C25784c("Invalid value for DayOfWeek: " + i);
    }

    /* renamed from: b */
    public final int mo83601b(C25842m mVar) {
        return mVar == C25830a.DAY_OF_WEEK ? mo83607i() : C25782a.m64407b(this, mVar);
    }

    /* renamed from: d */
    public final C25848s mo83602d(C25842m mVar) {
        return mVar == C25830a.DAY_OF_WEEK ? mVar.mo83772c() : C25782a.m64409d(this, mVar);
    }

    /* renamed from: f */
    public final boolean mo83603f(C25842m mVar) {
        return mVar instanceof C25830a ? mVar == C25830a.DAY_OF_WEEK : mVar != null && mVar.mo83770a(this);
    }

    /* renamed from: g */
    public final long mo83604g(C25842m mVar) {
        if (mVar == C25830a.DAY_OF_WEEK) {
            return (long) mo83607i();
        }
        if (!(mVar instanceof C25830a)) {
            return mVar.mo83773d(this);
        }
        throw new C25847r("Unsupported field: " + mVar);
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        C25811p pVar = new C25811p();
        pVar.mo83696i(C25830a.DAY_OF_WEEK, textStyle);
        return pVar.mo83706t(locale).mo83665a(this);
    }

    /* renamed from: h */
    public final Object mo83606h(C25845p pVar) {
        return pVar == C25844o.m64623e() ? C25831b.DAYS : C25782a.m64408c(this, pVar);
    }

    /* renamed from: i */
    public final int mo83607i() {
        return ordinal() + 1;
    }

    /* renamed from: k */
    public final DayOfWeek mo83608k(long j) {
        return f64307a[((((int) (j % 7)) + 7) + ordinal()) % 7];
    }
}
