package p988j$.util.stream;

import p988j$.util.function.BiConsumer;
import p988j$.util.function.C25967f;
import p988j$.util.function.Supplier;

/* renamed from: j$.util.stream.F1 */
final class C26049F1 extends C26239v0 {

    /* renamed from: h */
    final /* synthetic */ C25967f f64728h;

    /* renamed from: i */
    final /* synthetic */ BiConsumer f64729i;

    /* renamed from: j */
    final /* synthetic */ Supplier f64730j;

    /* renamed from: k */
    final /* synthetic */ Collector f64731k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26049F1(int i, C25967f fVar, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        super(i);
        this.f64728h = fVar;
        this.f64729i = biConsumer;
        this.f64730j = supplier;
        this.f64731k = collector;
    }

    /* renamed from: L */
    public final int mo84247L() {
        if (this.f64731k.characteristics().contains(C26178j.UNORDERED)) {
            return C26116V2.f64846r;
        }
        return 0;
    }

    /* renamed from: f1 */
    public final C26092P1 mo84140f1() {
        return new C26054G1(this.f64730j, this.f64729i, this.f64728h);
    }
}
