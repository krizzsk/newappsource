package p988j$.util.stream;

import p988j$.util.Spliterator;
import p988j$.util.function.C25975j;
import p988j$.util.function.C25981m;

/* renamed from: j$.util.stream.m1 */
final class C26195m1 extends C26215q1 implements C26151d2 {

    /* renamed from: h */
    private final double[] f64960h;

    C26195m1(Spliterator spliterator, C26239v0 v0Var, double[] dArr) {
        super(dArr.length, spliterator, v0Var);
        this.f64960h = dArr;
    }

    C26195m1(C26195m1 m1Var, Spliterator spliterator, long j, long j2) {
        super(m1Var, spliterator, j, j2, m1Var.f64960h.length);
        this.f64960h = m1Var.f64960h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C26215q1 mo84580a(Spliterator spliterator, long j, long j2) {
        return new C26195m1(this, spliterator, j, j2);
    }

    public final void accept(double d) {
        int i = this.f64997f;
        if (i < this.f64998g) {
            double[] dArr = this.f64960h;
            this.f64997f = i + 1;
            dArr[i] = d;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f64997f));
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo84151m((Double) obj);
    }

    /* renamed from: l */
    public final C25981m mo83888l(C25981m mVar) {
        mVar.getClass();
        return new C25975j(this, mVar);
    }

    /* renamed from: m */
    public final /* synthetic */ void mo84151m(Double d) {
        C26239v0.m65667m0(this, d);
    }
}
