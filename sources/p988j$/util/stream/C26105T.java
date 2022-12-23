package p988j$.util.stream;

import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.T */
abstract class C26105T implements C26046E3, C26051F3 {

    /* renamed from: a */
    private final boolean f64816a;

    protected C26105T(boolean z) {
        this.f64816a = z;
    }

    /* renamed from: L */
    public final int mo84247L() {
        if (this.f64816a) {
            return 0;
        }
        return C26116V2.f64846r;
    }

    public /* synthetic */ void accept(double d) {
        C26239v0.m65666l0();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        C26239v0.m65673s0();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        C26239v0.m65674t0();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo84147d(long j) {
    }

    public final /* synthetic */ void end() {
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo84149f() {
        return false;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    /* renamed from: j0 */
    public final Object mo84248j0(C26239v0 v0Var, Spliterator spliterator) {
        v0Var.mo84464g1(spliterator, this);
        return null;
    }

    /* renamed from: w */
    public final Object mo84249w(C26239v0 v0Var, Spliterator spliterator) {
        (this.f64816a ? new C26109U(v0Var, spliterator, (C26166g2) this) : new C26113V(v0Var, spliterator, v0Var.mo84465h1(this))).invoke();
        return null;
    }
}
