package p988j$.util.stream;

/* renamed from: j$.util.stream.l2 */
final class C26191l2 extends C26141b2 {

    /* renamed from: b */
    long f64952b;

    /* renamed from: c */
    long f64953c;

    /* renamed from: d */
    final /* synthetic */ C26196m2 f64954d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26191l2(C26196m2 m2Var, C26166g2 g2Var) {
        super(g2Var);
        this.f64954d = m2Var;
        this.f64952b = m2Var.f64962t;
        long j = m2Var.f64963u;
        this.f64953c = j < 0 ? Long.MAX_VALUE : j;
    }

    public final void accept(long j) {
        long j2 = this.f64952b;
        if (j2 == 0) {
            long j3 = this.f64953c;
            if (j3 > 0) {
                this.f64953c = j3 - 1;
                this.f64882a.accept(j);
                return;
            }
            return;
        }
        this.f64952b = j2 - 1;
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        this.f64882a.mo84147d(C26221r2.m65608c(j, this.f64954d.f64962t, this.f64953c));
    }

    /* renamed from: f */
    public final boolean mo84149f() {
        return this.f64953c == 0 || this.f64882a.mo84149f();
    }
}
