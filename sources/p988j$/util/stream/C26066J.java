package p988j$.util.stream;

import p988j$.util.C26013k;
import p988j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.J */
final class C26066J extends C26078M implements C26156e2 {
    C26066J() {
    }

    public final void accept(int i) {
        mo84338m((Object) Integer.valueOf(i));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }

    public final Object get() {
        if (this.f64782a) {
            return C26013k.m64881d(((Integer) this.f64783b).intValue());
        }
        return null;
    }
}
