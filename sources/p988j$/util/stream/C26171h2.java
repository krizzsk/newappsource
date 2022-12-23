package p988j$.util.stream;

/* renamed from: j$.util.stream.h2 */
final class C26171h2 extends C26146c2 {

    /* renamed from: b */
    long f64925b;

    /* renamed from: c */
    long f64926c;

    /* renamed from: d */
    final /* synthetic */ C26176i2 f64927d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26171h2(C26176i2 i2Var, C26166g2 g2Var) {
        super(g2Var);
        this.f64927d = i2Var;
        this.f64925b = i2Var.f64933t;
        long j = i2Var.f64934u;
        this.f64926c = j < 0 ? Long.MAX_VALUE : j;
    }

    public final void accept(Object obj) {
        long j = this.f64925b;
        if (j == 0) {
            long j2 = this.f64926c;
            if (j2 > 0) {
                this.f64926c = j2 - 1;
                this.f64895a.accept(obj);
                return;
            }
            return;
        }
        this.f64925b = j - 1;
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        this.f64895a.mo84147d(C26221r2.m65608c(j, this.f64927d.f64933t, this.f64926c));
    }

    /* renamed from: f */
    public final boolean mo84149f() {
        return this.f64926c == 0 || this.f64895a.mo84149f();
    }
}
