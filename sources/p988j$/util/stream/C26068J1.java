package p988j$.util.stream;

import p988j$.util.function.C25927G;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.J1 */
final class C26068J1 implements C26092P1, C26156e2 {

    /* renamed from: a */
    private int f64767a;

    /* renamed from: b */
    final /* synthetic */ int f64768b;

    /* renamed from: c */
    final /* synthetic */ C25927G f64769c;

    C26068J1(int i, C25927G g) {
        this.f64768b = i;
        this.f64769c = g;
    }

    public final /* synthetic */ void accept(double d) {
        C26239v0.m65666l0();
        throw null;
    }

    public final void accept(int i) {
        this.f64767a = this.f64769c.applyAsInt(this.f64767a, i);
    }

    public final /* synthetic */ void accept(long j) {
        C26239v0.m65674t0();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo84323e((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        this.f64767a = this.f64768b;
    }

    /* renamed from: e */
    public final /* synthetic */ void mo84323e(Integer num) {
        C26239v0.m65669o0(this, num);
    }

    public final /* synthetic */ void end() {
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo84149f() {
        return false;
    }

    public final Object get() {
        return Integer.valueOf(this.f64767a);
    }

    /* renamed from: i */
    public final void mo84150i(C26092P1 p1) {
        accept(((C26068J1) p1).f64767a);
    }
}
