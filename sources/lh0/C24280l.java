package lh0;

import ag0.C20989e;
import mf0.C24362h;

/* renamed from: lh0.l */
public abstract class C24280l extends C24277k {

    /* renamed from: c */
    public final C24312z f61572c;

    public C24280l(C24312z zVar) {
        C24362h.m61211f(zVar, "delegate");
        this.f61572c = zVar;
    }

    /* renamed from: U0 */
    public final C24306u0 mo59561U0(C20989e eVar) {
        if (eVar != getAnnotations()) {
            return new C24262e(this, eVar);
        }
        return this;
    }

    /* renamed from: V0 */
    public final C24312z mo60403V0(boolean z) {
        if (z == mo60412P0()) {
            return this;
        }
        return this.f61572c.mo59559S0(z).mo59561U0(getAnnotations());
    }

    /* renamed from: W0 */
    public final C24312z mo60404W0(C20989e eVar) {
        C24362h.m61211f(eVar, "newAnnotations");
        if (eVar != getAnnotations()) {
            return new C24262e(this, eVar);
        }
        return this;
    }

    /* renamed from: X0 */
    public final C24312z mo60405X0() {
        return this.f61572c;
    }
}
