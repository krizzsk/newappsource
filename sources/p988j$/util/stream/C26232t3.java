package p988j$.util.stream;

import p988j$.util.C25856D;
import p988j$.util.C26016n;
import p988j$.util.Spliterator;
import p988j$.util.function.C25975j;
import p988j$.util.function.C25981m;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.t3 */
final class C26232t3 extends C26247w3 implements C25856D, C25981m {

    /* renamed from: e */
    double f65025e;

    C26232t3(C25856D d, long j, long j2) {
        super(d, j, j2);
    }

    C26232t3(C25856D d, C26232t3 t3Var) {
        super(d, t3Var);
    }

    public final void accept(double d) {
        this.f65025e = d;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C26016n.m64889d(this, consumer);
    }

    /* renamed from: l */
    public final C25981m mo83888l(C25981m mVar) {
        mVar.getClass();
        return new C25975j(this, mVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final Spliterator mo84592n(Spliterator spliterator) {
        return new C26232t3((C25856D) spliterator, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo84593p(Object obj) {
        ((C25981m) obj).accept(this.f65025e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final C26137a3 mo84594q() {
        return new C26124X2();
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C26016n.m64892g(this, consumer);
    }
}
