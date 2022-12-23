package wh0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import mf0.C24362h;
import mf0.C24368m;

/* renamed from: wh0.b1 */
public abstract class C25158b1 extends C25226w implements C25190k0, C25217t0 {

    /* renamed from: e */
    public C25163c1 f63435e;

    /* renamed from: d */
    public final C25182h1 mo61756d() {
        return null;
    }

    public final void dispose() {
        boolean z;
        C25163c1 r = mo61758r();
        do {
            Object d0 = r.mo61779d0();
            if (d0 instanceof C25158b1) {
                if (d0 == this) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C25163c1.f63442b;
                    C25199n0 n0Var = C24368m.f61702n;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(r, d0, n0Var)) {
                            if (atomicReferenceFieldUpdater.get(r) != d0) {
                                z = false;
                                continue;
                                break;
                            }
                        } else {
                            z = true;
                            continue;
                            break;
                        }
                    }
                } else {
                    return;
                }
            } else if ((d0 instanceof C25217t0) && ((C25217t0) d0).mo61756d() != null) {
                mo53208n();
                return;
            } else {
                return;
            }
        } while (!z);
    }

    public final boolean isActive() {
        return true;
    }

    /* renamed from: r */
    public final C25163c1 mo61758r() {
        C25163c1 c1Var = this.f63435e;
        if (c1Var != null) {
            return c1Var;
        }
        C24362h.m61217l("job");
        throw null;
    }

    public final String toString() {
        return getClass().getSimpleName() + '@' + C25154a0.m63137b(this) + "[job@" + C25154a0.m63137b(mo61758r()) + ']';
    }
}
