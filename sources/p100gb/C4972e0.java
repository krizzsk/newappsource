package p100gb;

import android.net.Uri;
import p099ga.C4879e1;
import p099ga.C4901j0;
import p113hb.C5213a;
import p583jk.C17875h;

/* renamed from: gb.e0 */
public final class C4972e0 extends C4879e1 {

    /* renamed from: l */
    public static final Object f16806l = new Object();

    /* renamed from: b */
    public final long f16807b;

    /* renamed from: c */
    public final long f16808c;

    /* renamed from: d */
    public final long f16809d;

    /* renamed from: e */
    public final long f16810e;

    /* renamed from: f */
    public final long f16811f;

    /* renamed from: g */
    public final boolean f16812g;

    /* renamed from: h */
    public final boolean f16813h;

    /* renamed from: i */
    public final Object f16814i;

    /* renamed from: j */
    public final C4901j0 f16815j;

    /* renamed from: k */
    public final C4901j0.C4906e f16816k;

    static {
        C4901j0.C4903b bVar = new C4901j0.C4903b();
        bVar.f16541a = "SinglePeriodTimeline";
        bVar.f16542b = Uri.EMPTY;
        bVar.mo20542a();
    }

    public C4972e0(long j, boolean z, boolean z2, C4901j0 j0Var) {
        C4901j0.C4906e eVar;
        if (z2) {
            eVar = j0Var.f16538c;
        } else {
            eVar = null;
        }
        this.f16807b = -9223372036854775807L;
        this.f16808c = -9223372036854775807L;
        this.f16809d = -9223372036854775807L;
        this.f16810e = j;
        this.f16811f = j;
        this.f16812g = z;
        this.f16813h = false;
        this.f16814i = null;
        j0Var.getClass();
        this.f16815j = j0Var;
        this.f16816k = eVar;
    }

    /* renamed from: b */
    public final int mo20342b(Object obj) {
        return f16806l.equals(obj) ? 0 : -1;
    }

    /* renamed from: f */
    public final C4879e1.C4881b mo20345f(int i, C4879e1.C4881b bVar, boolean z) {
        Object obj;
        C17875h.m44303n(i, 1);
        if (z) {
            obj = f16806l;
        } else {
            obj = null;
        }
        long j = this.f16810e;
        bVar.getClass();
        C5213a aVar = C5213a.f17301g;
        bVar.f16415a = null;
        bVar.f16416b = obj;
        bVar.f16417c = 0;
        bVar.f16418d = j;
        bVar.f16419e = 0;
        bVar.f16421g = aVar;
        bVar.f16420f = false;
        return bVar;
    }

    /* renamed from: h */
    public final int mo20458h() {
        return 1;
    }

    /* renamed from: l */
    public final Object mo20348l(int i) {
        C17875h.m44303n(i, 1);
        return f16806l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r1 > r5) goto L_0x0024;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p099ga.C4879e1.C4882c mo20349n(int r21, p099ga.C4879e1.C4882c r22, long r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = 1
            r2 = r21
            p583jk.C17875h.m44303n(r2, r1)
            boolean r12 = r0.f16813h
            r1 = 0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r12 == 0) goto L_0x0026
            int r5 = (r23 > r1 ? 1 : (r23 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x0026
            long r5 = r0.f16811f
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x001e
            goto L_0x0024
        L_0x001e:
            long r1 = r1 + r23
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0026
        L_0x0024:
            r14 = r3
            goto L_0x0027
        L_0x0026:
            r14 = r1
        L_0x0027:
            java.lang.Object r1 = p099ga.C4879e1.C4882c.f16422r
            ga.j0 r3 = r0.f16815j
            java.lang.Object r4 = r0.f16814i
            long r5 = r0.f16807b
            long r7 = r0.f16808c
            long r9 = r0.f16809d
            boolean r11 = r0.f16812g
            ga.j0$e r13 = r0.f16816k
            long r1 = r0.f16811f
            r16 = r1
            r18 = 0
            r2 = r22
            r2.mo20471b(r3, r4, r5, r7, r9, r11, r12, r13, r14, r16, r18)
            return r22
        */
        throw new UnsupportedOperationException("Method not decompiled: p100gb.C4972e0.mo20349n(int, ga.e1$c, long):ga.e1$c");
    }

    /* renamed from: o */
    public final int mo20463o() {
        return 1;
    }
}
