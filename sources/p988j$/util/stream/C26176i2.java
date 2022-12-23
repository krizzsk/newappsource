package p988j$.util.stream;

import p988j$.util.Spliterator;
import p988j$.util.function.IntFunction;

/* renamed from: j$.util.stream.i2 */
final class C26176i2 extends C26119W1 {

    /* renamed from: t */
    final /* synthetic */ long f64933t;

    /* renamed from: u */
    final /* synthetic */ long f64934u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26176i2(C26143c cVar, int i, long j, long j2) {
        super(cVar, i);
        this.f64933t = j;
        this.f64934u = j2;
    }

    /* renamed from: z1 */
    static Spliterator m65441z1(Spliterator spliterator, long j, long j2, long j3) {
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
        return new C26252x3(spliterator, j5, j4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r1 */
    public final C26043E0 mo84141r1(Spliterator spliterator, IntFunction intFunction, C26143c cVar) {
        Spliterator spliterator2 = spliterator;
        IntFunction intFunction2 = intFunction;
        C26143c cVar2 = cVar;
        long S0 = cVar2.mo84462S0(spliterator2);
        if (S0 > 0 && spliterator2.hasCharacteristics(Spliterator.SUBSIZED)) {
            return C26239v0.m65649J0(cVar2, C26221r2.m65607b(cVar.mo84469o1(), spliterator, this.f64933t, this.f64934u), true, intFunction2);
        } else if (!C26116V2.ORDERED.mo84449d(cVar.mo84463X0())) {
            return C26239v0.m65649J0(this, m65441z1(cVar2.mo84474y1(spliterator2), this.f64933t, this.f64934u, S0), true, intFunction2);
        } else {
            return (C26043E0) new C26216q2(this, cVar, spliterator, intFunction, this.f64933t, this.f64934u).invoke();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s1 */
    public final Spliterator mo84472s1(C26143c cVar, Spliterator spliterator) {
        long S0 = cVar.mo84462S0(spliterator);
        if (S0 > 0 && spliterator.hasCharacteristics(Spliterator.SUBSIZED)) {
            Spliterator y1 = cVar.mo84474y1(spliterator);
            long j = this.f64933t;
            return new C26222r3(y1, j, C26221r2.m65606a(j, this.f64934u));
        } else if (!C26116V2.ORDERED.mo84449d(cVar.mo84463X0())) {
            return m65441z1(cVar.mo84474y1(spliterator), this.f64933t, this.f64934u, S0);
        } else {
            return ((C26043E0) new C26216q2(this, cVar, spliterator, new C26067J0(8), this.f64933t, this.f64934u).invoke()).spliterator();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u1 */
    public final C26166g2 mo84142u1(int i, C26166g2 g2Var) {
        return new C26171h2(this, g2Var);
    }
}
