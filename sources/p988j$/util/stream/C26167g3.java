package p988j$.util.stream;

import p988j$.util.function.Consumer;
import p988j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.g3 */
public final /* synthetic */ class C26167g3 implements C26156e2 {

    /* renamed from: a */
    public final /* synthetic */ int f64922a;

    /* renamed from: b */
    public final /* synthetic */ IntConsumer f64923b;

    public /* synthetic */ C26167g3(IntConsumer intConsumer, int i) {
        this.f64922a = i;
        this.f64923b = intConsumer;
    }

    public final /* synthetic */ void accept(double d) {
        switch (this.f64922a) {
            case 0:
                C26239v0.m65666l0();
                throw null;
            default:
                C26239v0.m65666l0();
                throw null;
        }
    }

    public final void accept(int i) {
        switch (this.f64922a) {
            case 0:
                ((C26081M2) this.f64923b).accept(i);
                return;
            default:
                this.f64923b.accept(i);
                return;
        }
    }

    public final /* synthetic */ void accept(long j) {
        switch (this.f64922a) {
            case 0:
                C26239v0.m65674t0();
                throw null;
            default:
                C26239v0.m65674t0();
                throw null;
        }
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f64922a) {
            case 0:
                mo84323e((Integer) obj);
                return;
            default:
                mo84323e((Integer) obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f64922a) {
            case 0:
                return Consumer.CC.$default$andThen(this, consumer);
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f64922a) {
            case 0:
                return IntConsumer.CC.$default$andThen(this, intConsumer);
            default:
                return IntConsumer.CC.$default$andThen(this, intConsumer);
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void mo84147d(long j) {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo84323e(Integer num) {
        switch (this.f64922a) {
            case 0:
                C26239v0.m65669o0(this, num);
                return;
            default:
                C26239v0.m65669o0(this, num);
                return;
        }
    }

    public final /* synthetic */ void end() {
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo84149f() {
        return false;
    }
}
