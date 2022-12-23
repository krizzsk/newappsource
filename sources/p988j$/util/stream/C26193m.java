package p988j$.util.stream;

import java.util.Set;
import p988j$.util.function.BiConsumer;
import p988j$.util.function.C25967f;
import p988j$.util.function.Function;
import p988j$.util.function.Supplier;

/* renamed from: j$.util.stream.m */
final class C26193m implements Collector {

    /* renamed from: a */
    private final Supplier f64955a;

    /* renamed from: b */
    private final BiConsumer f64956b;

    /* renamed from: c */
    private final C25967f f64957c;

    /* renamed from: d */
    private final Function f64958d;

    /* renamed from: e */
    private final Set f64959e;

    C26193m(C26067J0 j0, C26067J0 j02, C26138b bVar, Set set) {
        Set set2 = Collectors.f64712a;
        C26138b bVar2 = new C26138b(1);
        this.f64955a = j0;
        this.f64956b = j02;
        this.f64957c = bVar;
        this.f64958d = bVar2;
        this.f64959e = set;
    }

    public final BiConsumer accumulator() {
        return this.f64956b;
    }

    public final Set characteristics() {
        return this.f64959e;
    }

    public final C25967f combiner() {
        return this.f64957c;
    }

    public final Function finisher() {
        return this.f64958d;
    }

    public final Supplier supplier() {
        return this.f64955a;
    }
}
