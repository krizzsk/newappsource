package p988j$.util.stream;

import p988j$.util.function.Predicate;

/* renamed from: j$.util.stream.n0 */
final class C26199n0 extends C26219r0 {

    /* renamed from: c */
    final /* synthetic */ C26224s0 f64968c;

    /* renamed from: d */
    final /* synthetic */ Predicate f64969d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26199n0(Predicate predicate, C26224s0 s0Var) {
        super(s0Var);
        this.f64968c = s0Var;
        this.f64969d = predicate;
    }

    public final void accept(Object obj) {
        if (!this.f65007a && this.f64969d.test(obj) == this.f64968c.f65012a) {
            this.f65007a = true;
            this.f65008b = this.f64968c.f65013b;
        }
    }
}
