package p988j$.util.stream;

import p988j$.util.function.Function;

/* renamed from: j$.util.stream.U1 */
final class C26111U1 extends C26123X1 {

    /* renamed from: t */
    public final /* synthetic */ int f64826t;

    /* renamed from: u */
    final /* synthetic */ Function f64827u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26111U1(C26143c cVar, int i, Function function, int i2) {
        super(cVar, i);
        this.f64826t = i2;
        this.f64827u = function;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u1 */
    public final C26166g2 mo84142u1(int i, C26166g2 g2Var) {
        switch (this.f64826t) {
            case 0:
                return new C26103S1(this, g2Var, 2);
            default:
                return new C26103S1(this, g2Var, 6);
        }
    }
}
