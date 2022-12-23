package p988j$.time;

import java.io.Serializable;
import p988j$.time.chrono.C25786b;
import p988j$.time.chrono.C25792h;
import p988j$.time.temporal.C25830a;
import p988j$.time.temporal.C25831b;
import p988j$.time.temporal.C25840k;
import p988j$.time.temporal.C25841l;
import p988j$.time.temporal.C25842m;
import p988j$.time.temporal.C25844o;
import p988j$.time.temporal.C25845p;
import p988j$.time.temporal.C25846q;
import p988j$.time.temporal.C25847r;
import p988j$.time.temporal.C25848s;

/* renamed from: j$.time.g */
public final class C25819g implements C25840k, C25786b, Serializable {

    /* renamed from: d */
    public static final C25819g f64391d = m64490r(-999999999, 1, 1);

    /* renamed from: e */
    public static final C25819g f64392e = m64490r(999999999, 12, 31);

    /* renamed from: a */
    private final int f64393a;

    /* renamed from: b */
    private final short f64394b;

    /* renamed from: c */
    private final short f64395c;

    private C25819g(int i, int i2, int i3) {
        this.f64393a = i;
        this.f64394b = (short) i2;
        this.f64395c = (short) i3;
    }

    /* renamed from: l */
    public static C25819g m64488l(C25841l lVar) {
        if (lVar != null) {
            C25819g gVar = (C25819g) lVar.mo83606h(C25844o.m64620b());
            if (gVar != null) {
                return gVar;
            }
            throw new C25784c("Unable to obtain LocalDate from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName());
        }
        throw new NullPointerException("temporal");
    }

    /* renamed from: m */
    private int m64489m(C25842m mVar) {
        switch (C25795f.f64336a[((C25830a) mVar).ordinal()]) {
            case 1:
                return this.f64395c;
            case 2:
                return mo83729o();
            case 3:
                return ((this.f64395c - 1) / 7) + 1;
            case 4:
                int i = this.f64393a;
                return i >= 1 ? i : 1 - i;
            case 5:
                return mo83728n().mo83607i();
            case 6:
                return ((this.f64395c - 1) % 7) + 1;
            case 7:
                return ((mo83729o() - 1) % 7) + 1;
            case 8:
                throw new C25847r("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((mo83729o() - 1) / 7) + 1;
            case 10:
                return this.f64394b;
            case 11:
                throw new C25847r("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.f64393a;
            case 13:
                return this.f64393a >= 1 ? 1 : 0;
            default:
                throw new C25847r("Unsupported field: " + mVar);
        }
    }

    /* renamed from: r */
    public static C25819g m64490r(int i, int i2, int i3) {
        long j = (long) i;
        C25830a.YEAR.mo83776g(j);
        C25830a.MONTH_OF_YEAR.mo83776g((long) i2);
        C25830a.DAY_OF_MONTH.mo83776g((long) i3);
        int i4 = 28;
        if (i3 > 28) {
            int i5 = 31;
            if (i2 == 2) {
                C25792h.f64330a.getClass();
                if (C25792h.m64418a(j)) {
                    i4 = 29;
                }
                i5 = i4;
            } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
                i5 = 30;
            }
            if (i3 > i5) {
                if (i3 == 29) {
                    throw new C25784c("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                StringBuilder a = C25783b.m64414a("Invalid date '");
                a.append(C25824l.m64538j(i2).name());
                a.append(" ");
                a.append(i3);
                a.append("'");
                throw new C25784c(a.toString());
            }
        }
        return new C25819g(i, i2, i3);
    }

    /* renamed from: s */
    public static C25819g m64491s(long j) {
        long j2;
        long j3 = (j + 719528) - 60;
        if (j3 < 0) {
            long j4 = ((j3 + 1) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        return new C25819g(C25830a.YEAR.mo83775f(j5 + j2 + ((long) (i2 / 10))), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    /* renamed from: x */
    private static C25819g m64492x(int i, int i2, int i3) {
        int i4;
        if (i2 != 2) {
            if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
                i4 = 30;
            }
            return new C25819g(i, i2, i3);
        }
        C25792h.f64330a.getClass();
        i4 = C25792h.m64418a((long) i) ? 29 : 28;
        i3 = Math.min(i3, i4);
        return new C25819g(i, i2, i3);
    }

    /* renamed from: A */
    public final C25819g mo83720A(int i) {
        if (mo83729o() == i) {
            return this;
        }
        int i2 = this.f64393a;
        long j = (long) i2;
        C25830a.YEAR.mo83776g(j);
        C25830a.DAY_OF_YEAR.mo83776g((long) i);
        C25792h.f64330a.getClass();
        boolean a = C25792h.m64418a(j);
        if (i != 366 || a) {
            int i3 = 31;
            C25824l j2 = C25824l.m64538j(((i - 1) / 31) + 1);
            int i4 = j2.mo83754i(a);
            int i5 = C25823k.f64406a[j2.ordinal()];
            if (i5 == 1) {
                i3 = a ? 29 : 28;
            } else if (i5 == 2 || i5 == 3 || i5 == 4 || i5 == 5) {
                i3 = 30;
            }
            if (i > (i4 + i3) - 1) {
                j2 = j2.mo83755k();
            }
            return new C25819g(i2, j2.ordinal() + 1, (i - j2.mo83754i(a)) + 1);
        }
        throw new C25784c("Invalid date 'DayOfYear 366' as '" + i2 + "' is not a leap year");
    }

    /* renamed from: B */
    public final C25819g mo83721B(int i) {
        if (this.f64393a == i) {
            return this;
        }
        C25830a.YEAR.mo83776g((long) i);
        return m64492x(i, this.f64394b, this.f64395c);
    }

    /* renamed from: b */
    public final int mo83601b(C25842m mVar) {
        return mVar instanceof C25830a ? m64489m(mVar) : C25782a.m64407b(this, mVar);
    }

    /* renamed from: c */
    public final C25840k mo83611c(C25819g gVar) {
        return gVar;
    }

    /* renamed from: d */
    public final C25848s mo83602d(C25842m mVar) {
        int i;
        if (!(mVar instanceof C25830a)) {
            return mVar.mo83771b(this);
        }
        C25830a aVar = (C25830a) mVar;
        if (aVar.isDateBased()) {
            int i2 = C25795f.f64336a[aVar.ordinal()];
            if (i2 == 1) {
                short s = this.f64394b;
                i = s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : mo83731q() ? 29 : 28;
            } else if (i2 == 2) {
                i = mo83731q() ? 366 : 365;
            } else if (i2 == 3) {
                return C25848s.m64629i(1, (C25824l.m64538j(this.f64394b) != C25824l.FEBRUARY || mo83731q()) ? 5 : 4);
            } else if (i2 != 4) {
                return mVar.mo83772c();
            } else {
                return C25848s.m64629i(1, this.f64393a <= 0 ? 1000000000 : 999999999);
            }
            return C25848s.m64629i(1, (long) i);
        }
        throw new C25847r("Unsupported field: " + mVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25819g) && mo83727k((C25819g) obj) == 0;
    }

    /* renamed from: f */
    public final boolean mo83603f(C25842m mVar) {
        return mVar instanceof C25830a ? mVar.isDateBased() : mVar != null && mVar.mo83770a(this);
    }

    /* renamed from: g */
    public final long mo83604g(C25842m mVar) {
        return mVar instanceof C25830a ? mVar == C25830a.EPOCH_DAY ? mo83737y() : mVar == C25830a.PROLEPTIC_MONTH ? ((((long) this.f64393a) * 12) + ((long) this.f64394b)) - 1 : (long) m64489m(mVar) : mVar.mo83773d(this);
    }

    /* renamed from: h */
    public final Object mo83606h(C25845p pVar) {
        if (pVar == C25844o.m64620b()) {
            return this;
        }
        if (pVar == C25844o.m64625g() || pVar == C25844o.m64624f() || pVar == C25844o.m64622d() || pVar == C25844o.m64621c()) {
            return null;
        }
        return pVar == C25844o.m64619a() ? C25792h.f64330a : pVar == C25844o.m64623e() ? C25831b.DAYS : pVar.mo83672a(this);
    }

    public final int hashCode() {
        int i = this.f64393a;
        return (((i << 11) + (this.f64394b << 6)) + this.f64395c) ^ (i & -2048);
    }

    /* renamed from: i */
    public final C25840k mo83725i(C25840k kVar) {
        return kVar.mo83609a(mo83737y(), C25830a.EPOCH_DAY);
    }

    /* renamed from: j */
    public final int compareTo(C25786b bVar) {
        if (bVar instanceof C25819g) {
            return mo83727k((C25819g) bVar);
        }
        int compare = Long.compare(mo83737y(), ((C25819g) bVar).mo83737y());
        if (compare != 0) {
            return compare;
        }
        C25792h.f64330a.getClass();
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final int mo83727k(C25819g gVar) {
        int i = this.f64393a - gVar.f64393a;
        if (i != 0) {
            return i;
        }
        int i2 = this.f64394b - gVar.f64394b;
        return i2 == 0 ? this.f64395c - gVar.f64395c : i2;
    }

    /* renamed from: n */
    public final DayOfWeek mo83728n() {
        return DayOfWeek.m64335j(((int) C25782a.m64411f(mo83737y() + 3, 7)) + 1);
    }

    /* renamed from: o */
    public final int mo83729o() {
        return (C25824l.m64538j(this.f64394b).mo83754i(mo83731q()) + this.f64395c) - 1;
    }

    /* renamed from: p */
    public final int mo83730p() {
        return this.f64393a;
    }

    /* renamed from: q */
    public final boolean mo83731q() {
        C25792h.f64330a.getClass();
        return C25792h.m64418a((long) this.f64393a);
    }

    /* renamed from: t */
    public final C25819g mo83613e(long j, C25846q qVar) {
        if (!(qVar instanceof C25831b)) {
            return (C25819g) qVar.mo83780a(this, j);
        }
        switch (C25795f.f64337b[((C25831b) qVar).ordinal()]) {
            case 1:
                return mo83734u(j);
            case 2:
                return mo83734u(C25782a.m64412g(j, 7));
            case 3:
                return mo83735v(j);
            case 4:
                return mo83736w(j);
            case 5:
                return mo83736w(C25782a.m64412g(j, 10));
            case 6:
                return mo83736w(C25782a.m64412g(j, 100));
            case 7:
                return mo83736w(C25782a.m64412g(j, 1000));
            case 8:
                C25830a aVar = C25830a.ERA;
                return mo83609a(C25782a.m64410e(mo83604g(aVar), j), aVar);
            default:
                throw new C25847r("Unsupported unit: " + qVar);
        }
    }

    public final String toString() {
        int i;
        int i2 = this.f64393a;
        short s = this.f64394b;
        short s2 = this.f64395c;
        int abs = Math.abs(i2);
        StringBuilder sb = new StringBuilder(10);
        if (abs < 1000) {
            if (i2 < 0) {
                sb.append(i2 - 10000);
                i = 1;
            } else {
                sb.append(i2 + 10000);
                i = 0;
            }
            sb.deleteCharAt(i);
        } else {
            if (i2 > 9999) {
                sb.append('+');
            }
            sb.append(i2);
        }
        String str = "-0";
        sb.append(s < 10 ? str : "-");
        sb.append(s);
        if (s2 >= 10) {
            str = "-";
        }
        sb.append(str);
        sb.append(s2);
        return sb.toString();
    }

    /* renamed from: u */
    public final C25819g mo83734u(long j) {
        return j == 0 ? this : m64491s(C25782a.m64410e(mo83737y(), j));
    }

    /* renamed from: v */
    public final C25819g mo83735v(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.f64393a) * 12) + ((long) (this.f64394b - 1)) + j;
        return m64492x(C25830a.YEAR.mo83775f(C25782a.m64413h(j2, 12)), ((int) C25782a.m64411f(j2, 12)) + 1, this.f64395c);
    }

    /* renamed from: w */
    public final C25819g mo83736w(long j) {
        return j == 0 ? this : m64492x(C25830a.YEAR.mo83775f(((long) this.f64393a) + j), this.f64394b, this.f64395c);
    }

    /* renamed from: y */
    public final long mo83737y() {
        long j;
        long j2 = (long) this.f64393a;
        long j3 = (long) this.f64394b;
        long j4 = (365 * j2) + 0;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / -400) + ((j2 / -4) - (j2 / -100)));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + ((long) (this.f64395c - 1));
        if (j3 > 2) {
            j5--;
            if (!mo83731q()) {
                j5--;
            }
        }
        return j5 - 719528;
    }

    /* renamed from: z */
    public final C25819g mo83609a(long j, C25842m mVar) {
        if (!(mVar instanceof C25830a)) {
            return (C25819g) mVar.mo83774e(this, j);
        }
        C25830a aVar = (C25830a) mVar;
        aVar.mo83776g(j);
        switch (C25795f.f64336a[aVar.ordinal()]) {
            case 1:
                int i = (int) j;
                return this.f64395c == i ? this : m64490r(this.f64393a, this.f64394b, i);
            case 2:
                return mo83720A((int) j);
            case 3:
                return mo83734u(C25782a.m64412g(j - mo83604g(C25830a.ALIGNED_WEEK_OF_MONTH), 7));
            case 4:
                if (this.f64393a < 1) {
                    j = 1 - j;
                }
                return mo83721B((int) j);
            case 5:
                return mo83734u(j - ((long) mo83728n().mo83607i()));
            case 6:
                return mo83734u(j - mo83604g(C25830a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return mo83734u(j - mo83604g(C25830a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return m64491s(j);
            case 9:
                return mo83734u(C25782a.m64412g(j - mo83604g(C25830a.ALIGNED_WEEK_OF_YEAR), 7));
            case 10:
                int i2 = (int) j;
                if (this.f64394b == i2) {
                    return this;
                }
                C25830a.MONTH_OF_YEAR.mo83776g((long) i2);
                return m64492x(this.f64393a, i2, this.f64395c);
            case 11:
                return mo83735v(j - (((((long) this.f64393a) * 12) + ((long) this.f64394b)) - 1));
            case 12:
                return mo83721B((int) j);
            case 13:
                return mo83604g(C25830a.ERA) == j ? this : mo83721B(1 - this.f64393a);
            default:
                throw new C25847r("Unsupported field: " + mVar);
        }
    }
}
