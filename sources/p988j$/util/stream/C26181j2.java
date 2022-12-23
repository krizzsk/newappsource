package p988j$.util.stream;

/* renamed from: j$.util.stream.j2 */
final class C26181j2 extends C26136a2 {

    /* renamed from: b */
    long f64941b;

    /* renamed from: c */
    long f64942c;

    /* renamed from: d */
    final /* synthetic */ C26186k2 f64943d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26181j2(C26186k2 k2Var, C26166g2 g2Var) {
        super(g2Var);
        this.f64943d = k2Var;
        this.f64941b = k2Var.f64947t;
        long j = k2Var.f64948u;
        this.f64942c = j < 0 ? Long.MAX_VALUE : j;
    }

    public final void accept(int i) {
        long j = this.f64941b;
        if (j == 0) {
            long j2 = this.f64942c;
            if (j2 > 0) {
                this.f64942c = j2 - 1;
                this.f64879a.accept(i);
                return;
            }
            return;
        }
        this.f64941b = j - 1;
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        this.f64879a.mo84147d(C26221r2.m65608c(j, this.f64943d.f64947t, this.f64942c));
    }

    /* renamed from: f */
    public final boolean mo84149f() {
        return this.f64942c == 0 || this.f64879a.mo84149f();
    }
}
