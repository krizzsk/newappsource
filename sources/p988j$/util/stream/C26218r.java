package p988j$.util.stream;

import p988j$.util.concurrent.C25906u;
import p988j$.util.function.BiConsumer;
import p988j$.util.function.BiFunction;
import p988j$.util.function.C25967f;
import p988j$.util.function.Function;

/* renamed from: j$.util.stream.r */
public final /* synthetic */ class C26218r implements C25967f {

    /* renamed from: a */
    public final /* synthetic */ int f65005a;

    /* renamed from: b */
    public final /* synthetic */ BiConsumer f65006b;

    public /* synthetic */ C26218r(BiConsumer biConsumer, int i) {
        this.f65005a = i;
        this.f65006b = biConsumer;
    }

    public final BiFunction andThen(Function function) {
        switch (this.f65005a) {
            case 0:
                function.getClass();
                return new C25906u(this, function);
            case 1:
                function.getClass();
                return new C25906u(this, function);
            default:
                function.getClass();
                return new C25906u(this, function);
        }
    }

    public final Object apply(Object obj, Object obj2) {
        switch (this.f65005a) {
            case 0:
                this.f65006b.accept(obj, obj2);
                return obj;
            case 1:
                BiConsumer biConsumer = this.f65006b;
                int i = C26149d0.f64899s;
                biConsumer.accept(obj, obj2);
                return obj;
            default:
                BiConsumer biConsumer2 = this.f65006b;
                int i2 = C26179j0.f64938s;
                biConsumer2.accept(obj, obj2);
                return obj;
        }
    }
}
