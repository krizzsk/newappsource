package p988j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import p988j$.util.function.C25921D;
import p988j$.util.function.C25930H0;
import p988j$.util.function.C25957a;
import p988j$.util.function.C25965e;

/* renamed from: j$.util.stream.l */
public final /* synthetic */ class C26188l implements Collector {

    /* renamed from: a */
    final /* synthetic */ Collector f64950a;

    private /* synthetic */ C26188l(Collector collector) {
        this.f64950a = collector;
    }

    /* renamed from: a */
    public static /* synthetic */ Collector m65513a(Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof C26183k ? ((C26183k) collector).f64944a : new C26188l(collector);
    }

    public final /* synthetic */ BiConsumer accumulator() {
        return C25957a.m64803a(this.f64950a.accumulator());
    }

    public final /* synthetic */ Set characteristics() {
        return this.f64950a.characteristics();
    }

    public final /* synthetic */ BinaryOperator combiner() {
        return C25965e.m64811a(this.f64950a.combiner());
    }

    public final /* synthetic */ Function finisher() {
        return C25921D.m64765a(this.f64950a.finisher());
    }

    public final /* synthetic */ Supplier supplier() {
        return C25930H0.m64772a(this.f64950a.supplier());
    }
}
