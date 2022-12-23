package p988j$.util.stream;

import p988j$.util.function.C25966e0;
import p988j$.util.function.C25972h0;
import p988j$.util.function.C25974i0;
import p988j$.util.function.C25978k0;
import p988j$.util.function.C25980l0;
import p988j$.util.function.C25984n0;
import p988j$.util.function.C25986o0;
import p988j$.util.function.C25990q0;
import p988j$.util.function.C25998u0;

/* renamed from: j$.util.stream.f0 */
final class C26159f0 extends C26141b2 {

    /* renamed from: b */
    public final /* synthetic */ int f64919b;

    /* renamed from: c */
    final /* synthetic */ C26143c f64920c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26159f0(C26143c cVar, C26166g2 g2Var, int i) {
        super(g2Var);
        this.f64919b = i;
        this.f64920c = cVar;
    }

    public final void accept(long j) {
        switch (this.f64919b) {
            case 0:
                this.f64882a.accept((double) j);
                return;
            case 1:
                this.f64882a.accept(((C25998u0) ((C26248x) this.f64920c).f65055u).applyAsLong(j));
                return;
            case 2:
                this.f64882a.accept(((C25972h0) ((C26238v) this.f64920c).f65034u).apply(j));
                return;
            case 3:
                this.f64882a.accept(((C25986o0) ((C25990q0) ((C26243w) this.f64920c).f65048u)).mo84081a(j));
                return;
            case 4:
                this.f64882a.accept(((C25980l0) ((C25984n0) ((C26233u) this.f64920c).f65027u)).mo84077a(j));
                return;
            case 5:
                C26194m0 m0Var = (C26194m0) ((C25972h0) ((C26248x) this.f64920c).f65055u).apply(j);
                if (m0Var != null) {
                    try {
                        m0Var.sequential().mo84486E(new C26154e0(1, this));
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                        break;
                    }
                }
                if (m0Var != null) {
                    m0Var.close();
                    return;
                }
                return;
            case 6:
                if (((C25974i0) ((C25978k0) ((C26248x) this.f64920c).f65055u)).mo84070e(j)) {
                    this.f64882a.accept(j);
                    return;
                }
                return;
            default:
                ((C25966e0) ((C26248x) this.f64920c).f65055u).accept(j);
                this.f64882a.accept(j);
                return;
        }
        throw th;
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        switch (this.f64919b) {
            case 5:
                this.f64882a.mo84147d(-1);
                return;
            case 6:
                this.f64882a.mo84147d(-1);
                return;
            default:
                this.f64882a.mo84147d(j);
                return;
        }
    }
}
