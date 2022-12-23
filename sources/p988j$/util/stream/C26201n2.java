package p988j$.util.stream;

/* renamed from: j$.util.stream.n2 */
final class C26201n2 extends C26131Z1 {

    /* renamed from: b */
    long f64971b;

    /* renamed from: c */
    long f64972c;

    /* renamed from: d */
    final /* synthetic */ C26206o2 f64973d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26201n2(C26206o2 o2Var, C26166g2 g2Var) {
        super(g2Var);
        this.f64973d = o2Var;
        this.f64971b = o2Var.f64980t;
        long j = o2Var.f64981u;
        this.f64972c = j < 0 ? Long.MAX_VALUE : j;
    }

    public final void accept(double d) {
        long j = this.f64971b;
        if (j == 0) {
            long j2 = this.f64972c;
            if (j2 > 0) {
                this.f64972c = j2 - 1;
                this.f64873a.accept(d);
                return;
            }
            return;
        }
        this.f64971b = j - 1;
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        this.f64873a.mo84147d(C26221r2.m65608c(j, this.f64973d.f64980t, this.f64972c));
    }

    /* renamed from: f */
    public final boolean mo84149f() {
        return this.f64972c == 0 || this.f64873a.mo84149f();
    }
}
