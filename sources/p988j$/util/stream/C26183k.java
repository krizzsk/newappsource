package p988j$.util.stream;

import java.util.Set;
import java.util.stream.Collector;
import p988j$.util.function.BiConsumer;
import p988j$.util.function.C25928G0;
import p988j$.util.function.C25963d;
import p988j$.util.function.C25967f;
import p988j$.util.function.Function;
import p988j$.util.function.Supplier;

/* renamed from: j$.util.stream.k */
public final /* synthetic */ class C26183k implements Collector {

    /* renamed from: a */
    final /* synthetic */ Collector f64944a;

    private /* synthetic */ C26183k(Collector collector) {
        this.f64944a = collector;
    }

    /* renamed from: a */
    public static /* synthetic */ Collector m65487a(Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof C26188l ? ((C26188l) collector).f64950a : new C26183k(collector);
    }

    public final /* synthetic */ BiConsumer accumulator() {
        return BiConsumer.VivifiedWrapper.convert(this.f64944a.accumulator());
    }

    public final /* synthetic */ Set characteristics() {
        return this.f64944a.characteristics();
    }

    public final /* synthetic */ C25967f combiner() {
        return C25963d.m64809a(this.f64944a.combiner());
    }

    public final /* synthetic */ Function finisher() {
        return Function.VivifiedWrapper.convert(this.f64944a.finisher());
    }

    public final /* synthetic */ Supplier supplier() {
        return C25928G0.m64771a(this.f64944a.supplier());
    }
}
