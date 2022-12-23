package p988j$.util.stream;

import p988j$.util.function.C25937L;
import p988j$.util.function.C25941N;
import p988j$.util.function.C25943O;
import p988j$.util.function.C25947Q;
import p988j$.util.function.C25951U;
import p988j$.util.function.C25952V;
import p988j$.util.function.C25954X;
import p988j$.util.function.IntConsumer;
import p988j$.util.function.IntFunction;

/* renamed from: j$.util.stream.X */
final class C26121X extends C26136a2 {

    /* renamed from: b */
    public final /* synthetic */ int f64867b;

    /* renamed from: c */
    final /* synthetic */ C26143c f64868c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26121X(C26143c cVar, C26166g2 g2Var, int i) {
        super(g2Var);
        this.f64867b = i;
        this.f64868c = cVar;
    }

    public final void accept(int i) {
        switch (this.f64867b) {
            case 0:
                this.f64879a.accept((long) i);
                return;
            case 1:
                ((IntConsumer) ((C26243w) this.f64868c).f65048u).accept(i);
                this.f64879a.accept(i);
                return;
            case 2:
                this.f64879a.accept((double) i);
                return;
            case 3:
                this.f64879a.accept(((C25952V) ((C25954X) ((C26243w) this.f64868c).f65048u)).mo84048b(i));
                return;
            case 4:
                this.f64879a.accept(((IntFunction) ((C26238v) this.f64868c).f65034u).apply(i));
                return;
            case 5:
                this.f64879a.accept(((C25951U) ((C26248x) this.f64868c).f65055u).applyAsLong(i));
                return;
            case 6:
                this.f64879a.accept(((C25943O) ((C25947Q) ((C26233u) this.f64868c).f65027u)).mo84041a(i));
                return;
            case 7:
                IntStream intStream = (IntStream) ((IntFunction) ((C26243w) this.f64868c).f65048u).apply(i);
                if (intStream != null) {
                    try {
                        intStream.sequential().mo84258W(new C26117W(1, this));
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                        break;
                    }
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                if (((C25937L) ((C25941N) ((C26243w) this.f64868c).f65048u)).mo84034e(i)) {
                    this.f64879a.accept(i);
                    return;
                }
                return;
        }
        throw th;
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        switch (this.f64867b) {
            case 7:
                this.f64879a.mo84147d(-1);
                return;
            case 8:
                this.f64879a.mo84147d(-1);
                return;
            default:
                this.f64879a.mo84147d(j);
                return;
        }
    }
}
