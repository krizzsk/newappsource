package p988j$.util.stream;

import p988j$.util.function.C25936K0;
import p988j$.util.function.C25942N0;
import p988j$.util.function.C25948Q0;
import p988j$.util.function.Consumer;
import p988j$.util.function.Predicate;

/* renamed from: j$.util.stream.S1 */
final class C26103S1 extends C26146c2 {

    /* renamed from: b */
    public final /* synthetic */ int f64812b;

    /* renamed from: c */
    final /* synthetic */ C26143c f64813c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26103S1(C26143c cVar, C26166g2 g2Var, int i) {
        super(g2Var);
        this.f64812b = i;
        this.f64813c = cVar;
    }

    public final void accept(Object obj) {
        switch (this.f64812b) {
            case 0:
                ((Consumer) ((C26238v) this.f64813c).f65034u).accept(obj);
                this.f64895a.accept(obj);
                return;
            case 1:
                if (((Predicate) ((C26238v) this.f64813c).f65034u).test(obj)) {
                    this.f64895a.accept(obj);
                    return;
                }
                return;
            case 2:
                this.f64895a.accept(((C26111U1) this.f64813c).f64827u.apply(obj));
                return;
            case 3:
                this.f64895a.accept(((C25942N0) ((C26243w) this.f64813c).f65048u).applyAsInt(obj));
                return;
            case 4:
                this.f64895a.accept(((C25948Q0) ((C26248x) this.f64813c).f65055u).applyAsLong(obj));
                return;
            case 5:
                this.f64895a.accept(((C25936K0) ((C26233u) this.f64813c).f65027u).applyAsDouble(obj));
                return;
            default:
                Stream stream = (Stream) ((C26111U1) this.f64813c).f64827u.apply(obj);
                if (stream != null) {
                    try {
                        ((Stream) stream.sequential()).forEach(this.f64895a);
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                        break;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
        }
        throw th;
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        switch (this.f64812b) {
            case 1:
                this.f64895a.mo84147d(-1);
                return;
            case 6:
                this.f64895a.mo84147d(-1);
                return;
            default:
                this.f64895a.mo84147d(j);
                return;
        }
    }
}
