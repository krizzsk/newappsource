package p988j$.util.stream;

import p988j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.m3 */
public final /* synthetic */ class C26197m3 implements IntConsumer {

    /* renamed from: a */
    public final /* synthetic */ int f64964a;

    public /* synthetic */ C26197m3(int i) {
        this.f64964a = i;
    }

    public final void accept(int i) {
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f64964a) {
            case 0:
                return IntConsumer.CC.$default$andThen(this, intConsumer);
            default:
                return IntConsumer.CC.$default$andThen(this, intConsumer);
        }
    }
}
