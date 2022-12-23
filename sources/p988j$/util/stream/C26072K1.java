package p988j$.util.stream;

import p988j$.util.C26013k;
import p988j$.util.function.C25927G;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.K1 */
final class C26072K1 implements C26092P1, C26156e2 {

    /* renamed from: a */
    private boolean f64772a;

    /* renamed from: b */
    private int f64773b;

    /* renamed from: c */
    final /* synthetic */ C25927G f64774c;

    C26072K1(C25927G g) {
        this.f64774c = g;
    }

    public final /* synthetic */ void accept(double d) {
        C26239v0.m65666l0();
        throw null;
    }

    public final void accept(int i) {
        if (this.f64772a) {
            this.f64772a = false;
        } else {
            i = this.f64774c.applyAsInt(this.f64773b, i);
        }
        this.f64773b = i;
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
        this.f64772a = true;
        this.f64773b = 0;
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
        return this.f64772a ? C26013k.m64880a() : C26013k.m64881d(this.f64773b);
    }

    /* renamed from: i */
    public final void mo84150i(C26092P1 p1) {
        C26072K1 k1 = (C26072K1) p1;
        if (!k1.f64772a) {
            accept(k1.f64773b);
        }
    }
}
