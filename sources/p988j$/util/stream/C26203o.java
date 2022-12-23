package p988j$.util.stream;

/* renamed from: j$.util.stream.o */
final class C26203o extends C26146c2 {

    /* renamed from: b */
    boolean f64974b;

    /* renamed from: c */
    Object f64975c;

    C26203o(C26166g2 g2Var) {
        super(g2Var);
    }

    public final void accept(Object obj) {
        if (obj != null) {
            Object obj2 = this.f64975c;
            if (obj2 == null || !obj.equals(obj2)) {
                C26166g2 g2Var = this.f64895a;
                this.f64975c = obj;
                g2Var.accept(obj);
            }
        } else if (!this.f64974b) {
            this.f64974b = true;
            C26166g2 g2Var2 = this.f64895a;
            this.f64975c = null;
            g2Var2.accept(null);
        }
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        this.f64974b = false;
        this.f64975c = null;
        this.f64895a.mo84147d(-1);
    }

    public final void end() {
        this.f64974b = false;
        this.f64975c = null;
        this.f64895a.end();
    }
}
