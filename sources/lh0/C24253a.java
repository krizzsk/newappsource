package lh0;

import ag0.C20989e;
import mf0.C24362h;
import mh0.C24378d;

/* renamed from: lh0.a */
public final class C24253a extends C24277k {

    /* renamed from: c */
    public final C24312z f61536c;

    /* renamed from: d */
    public final C24312z f61537d;

    public C24253a(C24312z zVar, C24312z zVar2) {
        C24362h.m61211f(zVar, "delegate");
        C24362h.m61211f(zVar2, "abbreviation");
        this.f61536c = zVar;
        this.f61537d = zVar2;
    }

    /* renamed from: U0 */
    public final C24306u0 mo59561U0(C20989e eVar) {
        return new C24253a(this.f61536c.mo59561U0(eVar), this.f61537d);
    }

    /* renamed from: W0 */
    public final C24312z mo60404W0(C20989e eVar) {
        C24362h.m61211f(eVar, "newAnnotations");
        return new C24253a(this.f61536c.mo59561U0(eVar), this.f61537d);
    }

    /* renamed from: X0 */
    public final C24312z mo60405X0() {
        return this.f61536c;
    }

    /* renamed from: Z0 */
    public final C24277k mo60407Z0(C24312z zVar) {
        C24362h.m61211f(zVar, "delegate");
        return new C24253a(zVar, this.f61537d);
    }

    /* renamed from: a1 */
    public final C24253a mo60403V0(boolean z) {
        return new C24253a(this.f61536c.mo59559S0(z), this.f61537d.mo59559S0(z));
    }

    /* renamed from: b1 */
    public final C24253a mo60406Y0(C24378d dVar) {
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        return new C24253a((C24312z) dVar.mo60522A(this.f61536c), (C24312z) dVar.mo60522A(this.f61537d));
    }
}
