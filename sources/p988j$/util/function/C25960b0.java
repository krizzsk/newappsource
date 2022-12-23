package p988j$.util.function;

/* renamed from: j$.util.function.b0 */
public final /* synthetic */ class C25960b0 implements C25966e0 {

    /* renamed from: a */
    public final /* synthetic */ C25966e0 f64645a;

    /* renamed from: b */
    public final /* synthetic */ C25966e0 f64646b;

    public /* synthetic */ C25960b0(C25966e0 e0Var, C25966e0 e0Var2) {
        this.f64645a = e0Var;
        this.f64646b = e0Var2;
    }

    public final void accept(long j) {
        C25966e0 e0Var = this.f64645a;
        C25966e0 e0Var2 = this.f64646b;
        e0Var.accept(j);
        e0Var2.accept(j);
    }

    /* renamed from: g */
    public final C25966e0 mo83884g(C25966e0 e0Var) {
        e0Var.getClass();
        return new C25960b0(this, e0Var);
    }
}
