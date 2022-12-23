package p988j$.time.temporal;

import p988j$.time.C25783b;
import p988j$.time.C25819g;
import p988j$.time.chrono.C25788d;
import p988j$.time.chrono.C25792h;

/* renamed from: j$.time.temporal.t */
final class C25849t implements C25842m {

    /* renamed from: f */
    private static final C25848s f64446f = C25848s.m64629i(1, 7);

    /* renamed from: g */
    private static final C25848s f64447g = C25848s.m64630j(0, 52, 54);

    /* renamed from: h */
    private static final C25848s f64448h = C25848s.m64631k(52, 53);

    /* renamed from: a */
    private final String f64449a;

    /* renamed from: b */
    private final WeekFields f64450b;

    /* renamed from: c */
    private final C25846q f64451c;

    /* renamed from: d */
    private final C25846q f64452d;

    /* renamed from: e */
    private final C25848s f64453e;

    static {
        C25848s.m64630j(0, 4, 6);
    }

    private C25849t(String str, WeekFields weekFields, C25846q qVar, C25846q qVar2, C25848s sVar) {
        this.f64449a = str;
        this.f64450b = weekFields;
        this.f64451c = qVar;
        this.f64452d = qVar2;
        this.f64453e = sVar;
    }

    /* renamed from: f */
    private static int m64639f(int i, int i2) {
        return ((i2 - 1) + (i + 7)) / 7;
    }

    /* renamed from: g */
    private int m64640g(C25841l lVar) {
        int i;
        int b = lVar.mo83601b(C25830a.DAY_OF_WEEK) - this.f64450b.getFirstDayOfWeek().mo83607i();
        int i2 = b % 7;
        if (i2 == 0) {
            i = 0;
        } else {
            if ((((b ^ 7) >> 31) | 1) <= 0) {
                i2 += 7;
            }
            i = i2;
        }
        return i + 1;
    }

    /* renamed from: h */
    private int m64641h(C25841l lVar) {
        long j;
        int g = m64640g(lVar);
        C25830a aVar = C25830a.DAY_OF_YEAR;
        int b = lVar.mo83601b(aVar);
        int n = m64647n(b, g);
        int f = m64639f(n, b);
        if (f == 0) {
            ((C25792h) C25788d.m64417b(lVar)).getClass();
            C25819g l = C25819g.m64488l(lVar);
            long j2 = (long) b;
            C25831b bVar = C25831b.DAYS;
            if (j2 == Long.MIN_VALUE) {
                l = l.mo83613e(Long.MAX_VALUE, bVar);
                j = 1;
            } else {
                j = -j2;
            }
            return m64641h(l.mo83613e(j, bVar));
        } else if (f <= 50) {
            return f;
        } else {
            int f2 = m64639f(n, this.f64450b.mo83765c() + ((int) lVar.mo83602d(aVar).mo83790d()));
            return f >= f2 ? (f - f2) + 1 : f;
        }
    }

    /* renamed from: i */
    static C25849t m64642i(WeekFields weekFields) {
        return new C25849t("DayOfWeek", weekFields, C25831b.DAYS, C25831b.WEEKS, f64446f);
    }

    /* renamed from: j */
    static void m64643j(WeekFields weekFields) {
        C25842m mVar = C25839j.f64430a;
        C25831b bVar = C25831b.NANOS;
        C25830a.YEAR.mo83772c();
    }

    /* renamed from: k */
    static C25849t m64644k(WeekFields weekFields) {
        return new C25849t("WeekOfWeekBasedYear", weekFields, C25831b.WEEKS, C25839j.f64433d, f64448h);
    }

    /* renamed from: l */
    private C25848s m64645l(C25841l lVar, C25830a aVar) {
        int n = m64647n(lVar.mo83601b(aVar), m64640g(lVar));
        C25848s d = lVar.mo83602d(aVar);
        return C25848s.m64629i((long) m64639f(n, (int) d.mo83791e()), (long) m64639f(n, (int) d.mo83790d()));
    }

    /* renamed from: m */
    private C25848s m64646m(C25841l lVar) {
        C25830a aVar = C25830a.DAY_OF_YEAR;
        if (!lVar.mo83603f(aVar)) {
            return f64447g;
        }
        int g = m64640g(lVar);
        int b = lVar.mo83601b(aVar);
        int n = m64647n(b, g);
        int f = m64639f(n, b);
        if (f == 0) {
            ((C25792h) C25788d.m64417b(lVar)).getClass();
            C25819g l = C25819g.m64488l(lVar);
            long j = (long) (b + 7);
            C25831b bVar = C25831b.DAYS;
            return m64646m(j == Long.MIN_VALUE ? l.mo83613e(Long.MAX_VALUE, bVar).mo83613e(1, bVar) : l.mo83613e(-j, bVar));
        }
        int d = (int) lVar.mo83602d(aVar).mo83790d();
        int f2 = m64639f(n, this.f64450b.mo83765c() + d);
        if (f < f2) {
            return C25848s.m64629i(1, (long) (f2 - 1));
        }
        ((C25792h) C25788d.m64417b(lVar)).getClass();
        return m64646m(C25819g.m64488l(lVar).mo83613e((long) ((d - b) + 1 + 7), C25831b.DAYS));
    }

    /* renamed from: n */
    private int m64647n(int i, int i2) {
        int i3;
        int i4 = i - i2;
        int i5 = i4 % 7;
        if (i5 == 0) {
            i3 = 0;
        } else {
            if ((((i4 ^ 7) >> 31) | 1) <= 0) {
                i5 += 7;
            }
            i3 = i5;
        }
        return i3 + 1 > this.f64450b.mo83765c() ? 7 - i3 : -i3;
    }

    /* renamed from: a */
    public final boolean mo83770a(C25841l lVar) {
        C25830a aVar;
        if (!lVar.mo83603f(C25830a.DAY_OF_WEEK)) {
            return false;
        }
        C25846q qVar = this.f64452d;
        if (qVar == C25831b.WEEKS) {
            return true;
        }
        if (qVar == C25831b.MONTHS) {
            aVar = C25830a.DAY_OF_MONTH;
        } else if (qVar == C25831b.YEARS || qVar == WeekFields.f64415f) {
            aVar = C25830a.DAY_OF_YEAR;
        } else if (qVar != C25831b.FOREVER) {
            return false;
        } else {
            aVar = C25830a.YEAR;
        }
        return lVar.mo83603f(aVar);
    }

    /* renamed from: b */
    public final C25848s mo83771b(C25841l lVar) {
        C25846q qVar = this.f64452d;
        if (qVar == C25831b.WEEKS) {
            return this.f64453e;
        }
        if (qVar == C25831b.MONTHS) {
            return m64645l(lVar, C25830a.DAY_OF_MONTH);
        }
        if (qVar == C25831b.YEARS) {
            return m64645l(lVar, C25830a.DAY_OF_YEAR);
        }
        if (qVar == WeekFields.f64415f) {
            return m64646m(lVar);
        }
        if (qVar == C25831b.FOREVER) {
            return C25830a.YEAR.mo83772c();
        }
        StringBuilder a = C25783b.m64414a("unreachable, rangeUnit: ");
        a.append(this.f64452d);
        a.append(", this: ");
        a.append(this);
        throw new IllegalStateException(a.toString());
    }

    /* renamed from: c */
    public final C25848s mo83772c() {
        return this.f64453e;
    }

    /* renamed from: d */
    public final long mo83773d(C25841l lVar) {
        int i;
        int i2;
        C25846q qVar = this.f64452d;
        if (qVar == C25831b.WEEKS) {
            i = m64640g(lVar);
        } else {
            if (qVar == C25831b.MONTHS) {
                int g = m64640g(lVar);
                int b = lVar.mo83601b(C25830a.DAY_OF_MONTH);
                i2 = m64639f(m64647n(b, g), b);
            } else if (qVar == C25831b.YEARS) {
                int g2 = m64640g(lVar);
                int b2 = lVar.mo83601b(C25830a.DAY_OF_YEAR);
                i2 = m64639f(m64647n(b2, g2), b2);
            } else if (qVar == WeekFields.f64415f) {
                i = m64641h(lVar);
            } else if (qVar == C25831b.FOREVER) {
                int g3 = m64640g(lVar);
                int b3 = lVar.mo83601b(C25830a.YEAR);
                C25830a aVar = C25830a.DAY_OF_YEAR;
                int b4 = lVar.mo83601b(aVar);
                int n = m64647n(b4, g3);
                int f = m64639f(n, b4);
                if (f == 0) {
                    b3--;
                } else {
                    if (f >= m64639f(n, this.f64450b.mo83765c() + ((int) lVar.mo83602d(aVar).mo83790d()))) {
                        b3++;
                    }
                }
                return (long) b3;
            } else {
                StringBuilder a = C25783b.m64414a("unreachable, rangeUnit: ");
                a.append(this.f64452d);
                a.append(", this: ");
                a.append(this);
                throw new IllegalStateException(a.toString());
            }
            return (long) i2;
        }
        return (long) i;
    }

    /* renamed from: e */
    public final C25840k mo83774e(C25840k kVar, long j) {
        int a = this.f64453e.mo83788a(j, this);
        int b = kVar.mo83601b(this);
        if (a == b) {
            return kVar;
        }
        if (this.f64452d != C25831b.FOREVER) {
            return kVar.mo83613e((long) (a - b), this.f64451c);
        }
        int b2 = kVar.mo83601b(this.f64450b.f64418c);
        int b3 = kVar.mo83601b(this.f64450b.f64419d);
        ((C25792h) C25788d.m64417b(kVar)).getClass();
        C25819g r = C25819g.m64490r((int) j, 1, 1);
        int n = m64647n(1, m64640g(r));
        return r.mo83613e((long) (((Math.min(b3, m64639f(n, this.f64450b.mo83765c() + (r.mo83731q() ? 366 : 365)) - 1) - 1) * 7) + (b2 - 1) + (-n)), C25831b.DAYS);
    }

    public final boolean isDateBased() {
        return true;
    }

    public final boolean isTimeBased() {
        return false;
    }

    public final String toString() {
        return this.f64449a + "[" + this.f64450b.toString() + "]";
    }
}
