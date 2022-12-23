package p988j$.util.stream;

import p988j$.util.function.C25917B;
import p988j$.util.function.C25981m;
import p988j$.util.function.C25987p;
import p988j$.util.function.C25989q;
import p988j$.util.function.C25993s;
import p988j$.util.function.C25995t;
import p988j$.util.function.C25999v;
import p988j$.util.function.C26005y;
import p988j$.util.function.C26007z;

/* renamed from: j$.util.stream.t */
final class C26228t extends C26131Z1 {

    /* renamed from: b */
    public final /* synthetic */ int f65020b;

    /* renamed from: c */
    final /* synthetic */ C26143c f65021c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26228t(C26143c cVar, C26166g2 g2Var, int i) {
        super(g2Var);
        this.f65020b = i;
        this.f65021c = cVar;
    }

    public final void accept(double d) {
        switch (this.f65020b) {
            case 0:
                this.f64873a.accept(((C26007z) ((C25917B) ((C26233u) this.f65021c).f65027u)).mo84104b(d));
                return;
            case 1:
                this.f64873a.accept(((C25987p) ((C26238v) this.f65021c).f65034u).apply(d));
                return;
            case 2:
                this.f64873a.accept(((C25995t) ((C25999v) ((C26243w) this.f65021c).f65048u)).mo84094a(d));
                return;
            case 3:
                this.f64873a.accept(((C26005y) ((C26248x) this.f65021c).f65055u).applyAsLong(d));
                return;
            case 4:
                C26047F f = (C26047F) ((C25987p) ((C26233u) this.f65021c).f65027u).apply(d);
                if (f != null) {
                    try {
                        f.sequential().mo84153H(new C26223s(1, this));
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                        break;
                    }
                }
                if (f != null) {
                    f.close();
                    return;
                }
                return;
            case 5:
                if (((C25989q) ((C25993s) ((C26233u) this.f65021c).f65027u)).mo84086e(d)) {
                    this.f64873a.accept(d);
                    return;
                }
                return;
            default:
                ((C25981m) ((C26233u) this.f65021c).f65027u).accept(d);
                this.f64873a.accept(d);
                return;
        }
        throw th;
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        switch (this.f65020b) {
            case 4:
                this.f64873a.mo84147d(-1);
                return;
            case 5:
                this.f64873a.mo84147d(-1);
                return;
            default:
                this.f64873a.mo84147d(j);
                return;
        }
    }
}
