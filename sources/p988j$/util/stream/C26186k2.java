package p988j$.util.stream;

import p988j$.util.Spliterator;
import p988j$.util.function.IntFunction;

/* renamed from: j$.util.stream.k2 */
final class C26186k2 extends C26139b0 {

    /* renamed from: v */
    public static final /* synthetic */ int f64946v = 0;

    /* renamed from: t */
    final /* synthetic */ long f64947t;

    /* renamed from: u */
    final /* synthetic */ long f64948u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26186k2(C26143c cVar, int i, long j, long j2) {
        super(cVar, i);
        this.f64947t = j;
        this.f64948u = j2;
    }

    /* renamed from: B1 */
    static Spliterator.OfInt m65508B1(Spliterator.OfInt ofInt, long j, long j2, long j3) {
        long j4;
        long j5;
        if (j <= j3) {
            long j6 = j3 - j;
            j4 = j2 >= 0 ? Math.min(j2, j6) : j6;
            j5 = 0;
        } else {
            j5 = j;
            j4 = j2;
        }
        return new C26237u3(ofInt, j5, j4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r1 */
    public final C26043E0 mo84141r1(Spliterator spliterator, IntFunction intFunction, C26143c cVar) {
        Spliterator spliterator2 = spliterator;
        C26143c cVar2 = cVar;
        long S0 = cVar2.mo84462S0(spliterator);
        if (S0 > 0 && spliterator.hasCharacteristics(Spliterator.SUBSIZED)) {
            return C26239v0.m65651L0(cVar2, C26221r2.m65607b(cVar.mo84469o1(), spliterator, this.f64947t, this.f64948u), true);
        } else if (!C26116V2.ORDERED.mo84449d(cVar.mo84463X0())) {
            return C26239v0.m65651L0(this, m65508B1((Spliterator.OfInt) cVar2.mo84474y1(spliterator), this.f64947t, this.f64948u, S0), true);
        } else {
            return (C26043E0) new C26216q2(this, cVar, spliterator, intFunction, this.f64947t, this.f64948u).invoke();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s1 */
    public final Spliterator mo84472s1(C26143c cVar, Spliterator spliterator) {
        long S0 = cVar.mo84462S0(spliterator);
        if (S0 > 0 && spliterator.hasCharacteristics(Spliterator.SUBSIZED)) {
            long j = this.f64947t;
            return new C26202n3((Spliterator.OfInt) cVar.mo84474y1(spliterator), j, C26221r2.m65606a(j, this.f64948u));
        } else if (!C26116V2.ORDERED.mo84449d(cVar.mo84463X0())) {
            return m65508B1((Spliterator.OfInt) cVar.mo84474y1(spliterator), this.f64947t, this.f64948u, S0);
        } else {
            return ((C26043E0) new C26216q2(this, cVar, spliterator, new C26067J0(9), this.f64947t, this.f64948u).invoke()).spliterator();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u1 */
    public final C26166g2 mo84142u1(int i, C26166g2 g2Var) {
        return new C26181j2(this, g2Var);
    }
}
