package p988j$.util.function;

import java.util.function.BiConsumer;
import p988j$.util.function.BiConsumer;

/* renamed from: j$.util.function.a */
public final /* synthetic */ class C25957a implements BiConsumer {

    /* renamed from: a */
    final /* synthetic */ BiConsumer f64643a;

    private /* synthetic */ C25957a(BiConsumer biConsumer) {
        this.f64643a = biConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ BiConsumer m64803a(BiConsumer biConsumer) {
        if (biConsumer == null) {
            return null;
        }
        return biConsumer instanceof BiConsumer.VivifiedWrapper ? ((BiConsumer.VivifiedWrapper) biConsumer).f64601a : new C25957a(biConsumer);
    }

    public final /* synthetic */ void accept(Object obj, Object obj2) {
        this.f64643a.accept(obj, obj2);
    }

    public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
        return m64803a(this.f64643a.andThen(BiConsumer.VivifiedWrapper.convert(biConsumer)));
    }
}
