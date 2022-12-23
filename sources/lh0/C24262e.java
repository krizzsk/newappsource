package lh0;

import ag0.C20989e;
import mf0.C24362h;

/* renamed from: lh0.e */
public final class C24262e extends C24280l {

    /* renamed from: d */
    public final C20989e f61552d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24262e(C24312z zVar, C20989e eVar) {
        super(zVar);
        C24362h.m61211f(zVar, "delegate");
        C24362h.m61211f(eVar, "annotations");
        this.f61552d = eVar;
    }

    /* renamed from: Z0 */
    public final C24277k mo60407Z0(C24312z zVar) {
        C24362h.m61211f(zVar, "delegate");
        return new C24262e(zVar, this.f61552d);
    }

    public final C20989e getAnnotations() {
        return this.f61552d;
    }
}
