package p988j$.time.temporal;

import p988j$.time.C25819g;
import p988j$.time.DayOfWeek;
import p988j$.time.chrono.C25785a;
import p988j$.time.chrono.C25788d;
import p988j$.time.chrono.C25792h;

/* renamed from: j$.time.temporal.h */
enum C25837h implements C25842m {
    ;
    
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final int[] f64426a = null;

    static {
        f64426a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    /* renamed from: f */
    static boolean m64595f(C25841l lVar) {
        return ((C25785a) C25788d.m64417b(lVar)).equals(C25792h.f64330a);
    }

    /* renamed from: h */
    static C25848s m64597h(C25819g gVar) {
        return C25848s.m64629i(1, (long) m64602m(m64601l(gVar)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        if ((r0 == -3 || (r0 == -2 && r5.mo83731q())) == false) goto L_0x005a;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m64598i(p988j$.time.C25819g r5) {
        /*
            j$.time.DayOfWeek r0 = r5.mo83728n()
            int r0 = r0.ordinal()
            int r1 = r5.mo83729o()
            r2 = 1
            int r1 = r1 - r2
            int r0 = 3 - r0
            int r0 = r0 + r1
            int r3 = r0 / 7
            int r3 = r3 * 7
            int r0 = r0 - r3
            r3 = -3
            int r0 = r0 + r3
            if (r0 >= r3) goto L_0x001c
            int r0 = r0 + 7
        L_0x001c:
            if (r1 >= r0) goto L_0x003f
            r0 = 180(0xb4, float:2.52E-43)
            j$.time.g r5 = r5.mo83720A(r0)
            r0 = -1
            j$.time.g r5 = r5.mo83736w(r0)
            int r5 = m64601l(r5)
            int r5 = m64602m(r5)
            long r0 = (long) r5
            r2 = 1
            j$.time.temporal.s r5 = p988j$.time.temporal.C25848s.m64629i(r2, r0)
            long r0 = r5.mo83790d()
            int r5 = (int) r0
            goto L_0x005b
        L_0x003f:
            int r1 = r1 - r0
            int r1 = r1 / 7
            int r1 = r1 + r2
            r4 = 53
            if (r1 != r4) goto L_0x0059
            if (r0 == r3) goto L_0x0055
            r3 = -2
            if (r0 != r3) goto L_0x0053
            boolean r5 = r5.mo83731q()
            if (r5 == 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r5 = 0
            goto L_0x0056
        L_0x0055:
            r5 = 1
        L_0x0056:
            if (r5 != 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r2 = r1
        L_0x005a:
            r5 = r2
        L_0x005b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.time.temporal.C25837h.m64598i(j$.time.g):int");
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static int m64601l(C25819g gVar) {
        int p = gVar.mo83730p();
        int o = gVar.mo83729o();
        if (o <= 3) {
            return o - gVar.mo83728n().ordinal() < -2 ? p - 1 : p;
        }
        if (o < 363) {
            return p;
        }
        return ((o - 363) - (gVar.mo83731q() ? 1 : 0)) - gVar.mo83728n().ordinal() >= 0 ? p + 1 : p;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static int m64602m(int i) {
        C25819g r = C25819g.m64490r(i, 1, 1);
        if (r.mo83728n() != DayOfWeek.THURSDAY) {
            return (r.mo83728n() != DayOfWeek.WEDNESDAY || !r.mo83731q()) ? 52 : 53;
        }
        return 53;
    }

    /* renamed from: b */
    public C25848s mo83771b(C25841l lVar) {
        return mo83772c();
    }

    public final boolean isDateBased() {
        return true;
    }

    public final boolean isTimeBased() {
        return false;
    }
}
