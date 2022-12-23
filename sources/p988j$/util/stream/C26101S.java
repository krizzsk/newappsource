package p988j$.util.stream;

import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.S */
final class C26101S extends C26105T {

    /* renamed from: b */
    final Consumer f64811b;

    C26101S(Consumer consumer, boolean z) {
        super(z);
        this.f64811b = consumer;
    }

    public final void accept(Object obj) {
        this.f64811b.accept(obj);
    }
}
