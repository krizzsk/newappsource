package p988j$.util.function;

/* renamed from: j$.util.function.j */
public final /* synthetic */ class C25975j implements C25981m {

    /* renamed from: a */
    public final /* synthetic */ C25981m f64658a;

    /* renamed from: b */
    public final /* synthetic */ C25981m f64659b;

    public /* synthetic */ C25975j(C25981m mVar, C25981m mVar2) {
        this.f64658a = mVar;
        this.f64659b = mVar2;
    }

    public final void accept(double d) {
        C25981m mVar = this.f64658a;
        C25981m mVar2 = this.f64659b;
        mVar.accept(d);
        mVar2.accept(d);
    }

    /* renamed from: l */
    public final C25981m mo83888l(C25981m mVar) {
        mVar.getClass();
        return new C25975j(this, mVar);
    }
}
