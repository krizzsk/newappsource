package pg0;

import ag0.C20989e;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import lh0.C24269h;
import lh0.C24277k;
import lh0.C24298r;
import lh0.C24299r0;
import lh0.C24306u0;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import p584jl.C17885a;

/* renamed from: pg0.e */
public final class C24699e extends C24277k implements C24269h {

    /* renamed from: c */
    public final C24312z f62536c;

    public C24699e(C24312z zVar) {
        C24362h.m61211f(zVar, "delegate");
        this.f62536c = zVar;
    }

    /* renamed from: a1 */
    public static C24312z m62159a1(C24312z zVar) {
        C24312z V0 = zVar.mo59559S0(false);
        if (!C24299r0.m60976h(zVar)) {
            return V0;
        }
        return new C24699e(V0);
    }

    /* renamed from: A */
    public final boolean mo60427A() {
        return true;
    }

    /* renamed from: C */
    public final C24306u0 mo60428C(C24307v vVar) {
        C24362h.m61211f(vVar, "replacement");
        C24306u0 R0 = vVar.mo60450R0();
        C24362h.m61211f(R0, "<this>");
        if (!C24299r0.m60976h(R0) && !C24299r0.m60975g(R0)) {
            return R0;
        }
        if (R0 instanceof C24312z) {
            return m62159a1((C24312z) R0);
        }
        if (R0 instanceof C24298r) {
            C24298r rVar = (C24298r) R0;
            return C17885a.m44395D0(KotlinTypeFactory.m60474c(m62159a1(rVar.f61594c), m62159a1(rVar.f61595d)), C17885a.m44422S(R0));
        }
        throw new IllegalStateException(C24362h.m61216k(R0, "Incorrect type: ").toString());
    }

    /* renamed from: P0 */
    public final boolean mo60412P0() {
        return false;
    }

    /* renamed from: U0 */
    public final C24306u0 mo59561U0(C20989e eVar) {
        return new C24699e(this.f62536c.mo59561U0(eVar));
    }

    /* renamed from: V0 */
    public final C24312z mo60403V0(boolean z) {
        if (z) {
            return this.f62536c.mo59559S0(true);
        }
        return this;
    }

    /* renamed from: W0 */
    public final C24312z mo60404W0(C20989e eVar) {
        C24362h.m61211f(eVar, "newAnnotations");
        return new C24699e(this.f62536c.mo59561U0(eVar));
    }

    /* renamed from: X0 */
    public final C24312z mo60405X0() {
        return this.f62536c;
    }

    /* renamed from: Z0 */
    public final C24277k mo60407Z0(C24312z zVar) {
        C24362h.m61211f(zVar, "delegate");
        return new C24699e(zVar);
    }
}
