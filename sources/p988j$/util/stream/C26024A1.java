package p988j$.util.stream;

import p988j$.util.function.C25927G;
import p988j$.util.function.C25958a0;
import p988j$.util.function.C25967f;
import p988j$.util.function.C25973i;

/* renamed from: j$.util.stream.A1 */
final class C26024A1 extends C26239v0 {

    /* renamed from: h */
    public final /* synthetic */ int f64699h;

    /* renamed from: i */
    final /* synthetic */ Object f64700i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26024A1(int i, Object obj, int i2) {
        super(i);
        this.f64699h = i2;
        this.f64700i = obj;
    }

    /* renamed from: f1 */
    public final C26092P1 mo84140f1() {
        switch (this.f64699h) {
            case 0:
                return new C26029B1((C25973i) this.f64700i);
            case 1:
                return new C26044E1((C25967f) this.f64700i);
            case 2:
                return new C26072K1((C25927G) this.f64700i);
            default:
                return new C26088O1((C25958a0) this.f64700i);
        }
    }
}
