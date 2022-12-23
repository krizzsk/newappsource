package lh0;

import xg0.C25260c;
import zf0.C25437e;

/* renamed from: lh0.g */
public abstract class C24266g implements C24274i0 {

    /* renamed from: a */
    public int f61560a;

    /* renamed from: a */
    public abstract boolean mo53485a(C25437e eVar);

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24274i0) || obj.hashCode() != hashCode()) {
            return false;
        }
        C24274i0 i0Var = (C24274i0) obj;
        if (i0Var.getParameters().size() != getParameters().size()) {
            return false;
        }
        C25437e o = mo53460o();
        C25437e o2 = i0Var.mo53460o();
        if (o2 == null) {
            return false;
        }
        if (C24289p.m60918h(o) || C25260c.m63398o(o)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (C24289p.m60918h(o2) || C25260c.m63398o(o2)) {
                z2 = false;
            }
            if (z2) {
                return mo53485a(o2);
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z;
        int i;
        int i2 = this.f61560a;
        if (i2 != 0) {
            return i2;
        }
        C25437e o = mo53460o();
        if (C24289p.m60918h(o) || C25260c.m63398o(o)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i = C25260c.m63390g(o).hashCode();
        } else {
            i = System.identityHashCode(this);
        }
        this.f61560a = i;
        return i;
    }

    /* renamed from: o */
    public abstract C25437e mo53460o();
}
