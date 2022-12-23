package p988j$.util.stream;

import p988j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.W */
public final /* synthetic */ class C26117W implements IntConsumer {

    /* renamed from: a */
    public final /* synthetic */ int f64856a;

    /* renamed from: b */
    public final /* synthetic */ C26166g2 f64857b;

    public /* synthetic */ C26117W(int i, C26166g2 g2Var) {
        this.f64856a = i;
        this.f64857b = g2Var;
    }

    public final void accept(int i) {
        switch (this.f64856a) {
            case 0:
                this.f64857b.accept(i);
                return;
            default:
                ((C26121X) this.f64857b).f64879a.accept(i);
                return;
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f64856a) {
            case 0:
                return IntConsumer.CC.$default$andThen(this, intConsumer);
            default:
                return IntConsumer.CC.$default$andThen(this, intConsumer);
        }
    }
}
