package ph0;

import kotlin.reflect.jvm.internal.impl.types.Variance;
import lh0.C24274i0;
import lh0.C24278k0;
import lh0.C24281l0;
import lh0.C24285n0;
import mf0.C24362h;
import yg0.C25302b;

/* renamed from: ph0.b */
public final class C24710b extends C24278k0 {
    /* renamed from: g */
    public final C24281l0 mo60418g(C24274i0 i0Var) {
        C25302b bVar;
        C24362h.m61211f(i0Var, LinksConfiguration.KEY_KEY);
        if (i0Var instanceof C25302b) {
            bVar = (C25302b) i0Var;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return null;
        }
        if (!bVar.getProjection().mo60240a()) {
            return bVar.getProjection();
        }
        return new C24285n0(bVar.getProjection().getType(), Variance.OUT_VARIANCE);
    }
}
