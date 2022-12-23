package p988j$.util.stream;

import p988j$.util.C25861I;
import p988j$.util.C26016n;
import p988j$.util.Spliterator;
import p988j$.util.function.C25960b0;
import p988j$.util.function.C25966e0;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.v3 */
final class C26242v3 extends C26247w3 implements C25861I, C25966e0 {

    /* renamed from: e */
    long f65046e;

    C26242v3(C25861I i, long j, long j2) {
        super(i, j, j2);
    }

    C26242v3(C25861I i, C26242v3 v3Var) {
        super(i, v3Var);
    }

    public final void accept(long j) {
        this.f65046e = j;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C26016n.m64891f(this, consumer);
    }

    /* renamed from: g */
    public final C25966e0 mo83884g(C25966e0 e0Var) {
        e0Var.getClass();
        return new C25960b0(this, e0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final Spliterator mo84592n(Spliterator spliterator) {
        return new C26242v3((C25861I) spliterator, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo84593p(Object obj) {
        ((C25966e0) obj).accept(this.f65046e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final C26137a3 mo84594q() {
        return new C26132Z2();
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C26016n.m64894j(this, consumer);
    }
}
