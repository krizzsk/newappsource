package p988j$.util.stream;

import java.util.HashSet;
import java.util.Set;
import p988j$.util.function.C25966e0;
import p988j$.util.function.C25981m;
import p988j$.util.function.Function;
import p988j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.p */
final class C26208p extends C26146c2 {

    /* renamed from: b */
    public final /* synthetic */ int f64983b = 0;

    /* renamed from: c */
    Object f64984c;

    /* renamed from: d */
    final /* synthetic */ C26143c f64985d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26208p(C26213q qVar, C26166g2 g2Var) {
        super(g2Var);
        this.f64985d = qVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26208p(C26233u uVar, C26166g2 g2Var) {
        super(g2Var);
        this.f64985d = uVar;
        this.f64984c = new C26223s(0, g2Var);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26208p(C26243w wVar, C26166g2 g2Var) {
        super(g2Var);
        this.f64985d = wVar;
        this.f64984c = new C26117W(0, g2Var);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26208p(C26248x xVar, C26166g2 g2Var) {
        super(g2Var);
        this.f64985d = xVar;
        this.f64984c = new C26154e0(0, g2Var);
    }

    public final void accept(Object obj) {
        switch (this.f64983b) {
            case 0:
                if (!((Set) this.f64984c).contains(obj)) {
                    ((Set) this.f64984c).add(obj);
                    this.f64895a.accept(obj);
                    return;
                }
                return;
            case 1:
                C26194m0 m0Var = (C26194m0) ((Function) ((C26248x) this.f64985d).f65055u).apply(obj);
                if (m0Var != null) {
                    try {
                        m0Var.sequential().mo84486E((C25966e0) this.f64984c);
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
            case 2:
                IntStream intStream = (IntStream) ((Function) ((C26243w) this.f64985d).f65048u).apply(obj);
                if (intStream != null) {
                    try {
                        intStream.sequential().mo84258W((IntConsumer) this.f64984c);
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        break;
                    }
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                C26047F f = (C26047F) ((Function) ((C26233u) this.f64985d).f65027u).apply(obj);
                if (f != null) {
                    try {
                        f.sequential().mo84153H((C25981m) this.f64984c);
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                        break;
                    }
                }
                if (f != null) {
                    f.close();
                    return;
                }
                return;
        }
        throw th;
        throw th;
        throw th;
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        switch (this.f64983b) {
            case 0:
                this.f64984c = new HashSet();
                this.f64895a.mo84147d(-1);
                return;
            case 1:
                this.f64895a.mo84147d(-1);
                return;
            case 2:
                this.f64895a.mo84147d(-1);
                return;
            default:
                this.f64895a.mo84147d(-1);
                return;
        }
    }

    public final void end() {
        switch (this.f64983b) {
            case 0:
                this.f64984c = null;
                this.f64895a.end();
                return;
            default:
                super.end();
                return;
        }
    }
}
