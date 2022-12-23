package p988j$.util.stream;

import p988j$.util.Spliterator;
import p988j$.util.function.IntFunction;

/* renamed from: j$.util.stream.q2 */
final class C26216q2 extends C26148d {

    /* renamed from: j */
    private final C26143c f64999j;

    /* renamed from: k */
    private final IntFunction f65000k;

    /* renamed from: l */
    private final long f65001l;

    /* renamed from: m */
    private final long f65002m;

    /* renamed from: n */
    private long f65003n;

    /* renamed from: o */
    private volatile boolean f65004o;

    C26216q2(C26143c cVar, C26143c cVar2, Spliterator spliterator, IntFunction intFunction, long j, long j2) {
        super((C26239v0) cVar2, spliterator);
        this.f64999j = cVar;
        this.f65000k = intFunction;
        this.f65001l = j;
        this.f65002m = j2;
    }

    C26216q2(C26216q2 q2Var, Spliterator spliterator) {
        super((C26148d) q2Var, spliterator);
        this.f64999j = q2Var.f64999j;
        this.f65000k = q2Var.f65000k;
        this.f65001l = q2Var.f65001l;
        this.f65002m = q2Var.f65002m;
    }

    /* renamed from: j */
    private long m65586j(long j) {
        if (this.f65004o) {
            return this.f65003n;
        }
        C26216q2 q2Var = (C26216q2) this.f64916d;
        C26216q2 q2Var2 = (C26216q2) this.f64917e;
        if (q2Var == null || q2Var2 == null) {
            return this.f65003n;
        }
        long j2 = q2Var.m65586j(j);
        return j2 >= j ? j2 : j2 + q2Var2.m65586j(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo84333a() {
        long j = -1;
        if (mo84484c() == null) {
            if (C26116V2.SIZED.mo84450e(this.f64999j.f64886j)) {
                j = this.f64999j.mo84462S0(this.f64914b);
            }
            C26259z0 d1 = this.f64999j.mo84162d1(j, this.f65000k);
            C26166g2 u1 = this.f64999j.mo84142u1(this.f64913a.mo84463X0(), d1);
            C26239v0 v0Var = this.f64913a;
            v0Var.mo84461P0(this.f64914b, v0Var.mo84465h1(u1));
            return d1.build();
        }
        C26239v0 v0Var2 = this.f64913a;
        C26259z0 d12 = v0Var2.mo84162d1(-1, this.f65000k);
        v0Var2.mo84464g1(this.f64914b, d12);
        C26043E0 build = d12.build();
        this.f65003n = build.count();
        this.f65004o = true;
        this.f64914b = null;
        return build;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C26158f mo84334d(Spliterator spliterator) {
        return new C26216q2(this, spliterator);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo84479g() {
        this.f64898i = true;
        if (this.f65004o) {
            mo84478e(mo84342i());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final C26126Y0 mo84342i() {
        return C26239v0.m65655R0(this.f64999j.mo84176n1());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCompletion(java.util.concurrent.CountedCompleter r15) {
        /*
            r14 = this;
            j$.util.stream.f r0 = r14.f64916d
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            r4 = 0
            if (r3 != 0) goto L_0x0090
            j$.util.stream.q2 r0 = (p988j$.util.stream.C26216q2) r0
            long r6 = r0.f65003n
            j$.util.stream.f r0 = r14.f64917e
            j$.util.stream.q2 r0 = (p988j$.util.stream.C26216q2) r0
            long r8 = r0.f65003n
            long r6 = r6 + r8
            r14.f65003n = r6
            boolean r0 = r14.f64898i
            if (r0 == 0) goto L_0x0021
            r14.f65003n = r4
            goto L_0x0027
        L_0x0021:
            long r6 = r14.f65003n
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x002d
        L_0x0027:
            j$.util.stream.Y0 r0 = r14.mo84342i()
        L_0x002b:
            r6 = r0
            goto L_0x0061
        L_0x002d:
            j$.util.stream.f r0 = r14.f64916d
            j$.util.stream.q2 r0 = (p988j$.util.stream.C26216q2) r0
            long r6 = r0.f65003n
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0042
            j$.util.stream.f r0 = r14.f64917e
            j$.util.stream.q2 r0 = (p988j$.util.stream.C26216q2) r0
            java.lang.Object r0 = r0.mo84476b()
            j$.util.stream.E0 r0 = (p988j$.util.stream.C26043E0) r0
            goto L_0x002b
        L_0x0042:
            j$.util.stream.c r0 = r14.f64999j
            int r0 = r0.mo84176n1()
            j$.util.stream.f r3 = r14.f64916d
            j$.util.stream.q2 r3 = (p988j$.util.stream.C26216q2) r3
            java.lang.Object r3 = r3.mo84476b()
            j$.util.stream.E0 r3 = (p988j$.util.stream.C26043E0) r3
            j$.util.stream.f r6 = r14.f64917e
            j$.util.stream.q2 r6 = (p988j$.util.stream.C26216q2) r6
            java.lang.Object r6 = r6.mo84476b()
            j$.util.stream.E0 r6 = (p988j$.util.stream.C26043E0) r6
            j$.util.stream.G0 r0 = p988j$.util.stream.C26239v0.m65653N0(r0, r3, r6)
            goto L_0x002b
        L_0x0061:
            j$.util.stream.f r0 = r14.mo84484c()
            if (r0 != 0) goto L_0x0069
            r0 = 1
            goto L_0x006a
        L_0x0069:
            r0 = 0
        L_0x006a:
            if (r0 == 0) goto L_0x008b
            long r7 = r14.f65002m
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0080
            long r7 = r6.count()
            long r9 = r14.f65001l
            long r11 = r14.f65002m
            long r9 = r9 + r11
            long r7 = java.lang.Math.min(r7, r9)
            goto L_0x0082
        L_0x0080:
            long r7 = r14.f65003n
        L_0x0082:
            r9 = r7
            long r7 = r14.f65001l
            j$.util.function.IntFunction r11 = r14.f65000k
            j$.util.stream.E0 r6 = r6.mo84246p(r7, r9, r11)
        L_0x008b:
            r14.mo84478e(r6)
            r14.f65004o = r1
        L_0x0090:
            long r6 = r14.f65002m
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00e8
            j$.util.stream.f r0 = r14.mo84484c()
            if (r0 != 0) goto L_0x009e
            r0 = 1
            goto L_0x009f
        L_0x009e:
            r0 = 0
        L_0x009f:
            if (r0 != 0) goto L_0x00e8
            long r3 = r14.f65001l
            long r5 = r14.f65002m
            long r3 = r3 + r5
            boolean r0 = r14.f65004o
            if (r0 == 0) goto L_0x00ad
            long r5 = r14.f65003n
            goto L_0x00b1
        L_0x00ad:
            long r5 = r14.m65586j(r3)
        L_0x00b1:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x00b6
            goto L_0x00e3
        L_0x00b6:
            j$.util.stream.f r0 = r14.mo84484c()
            j$.util.stream.q2 r0 = (p988j$.util.stream.C26216q2) r0
            r7 = r14
        L_0x00bd:
            if (r0 == 0) goto L_0x00dd
            j$.util.stream.f r8 = r0.f64917e
            if (r7 != r8) goto L_0x00d3
            j$.util.stream.f r7 = r0.f64916d
            j$.util.stream.q2 r7 = (p988j$.util.stream.C26216q2) r7
            if (r7 == 0) goto L_0x00d3
            long r7 = r7.m65586j(r3)
            long r5 = r5 + r7
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 < 0) goto L_0x00d3
            goto L_0x00e3
        L_0x00d3:
            j$.util.stream.f r7 = r0.mo84484c()
            j$.util.stream.q2 r7 = (p988j$.util.stream.C26216q2) r7
            r13 = r7
            r7 = r0
            r0 = r13
            goto L_0x00bd
        L_0x00dd:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x00e2
            goto L_0x00e3
        L_0x00e2:
            r1 = 0
        L_0x00e3:
            if (r1 == 0) goto L_0x00e8
            r14.mo84481h()
        L_0x00e8:
            super.onCompletion(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.stream.C26216q2.onCompletion(java.util.concurrent.CountedCompleter):void");
    }
}
