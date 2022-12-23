package lh0;

import ag0.C20989e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import mf0.C24362h;
import mh0.C24378d;
import p584jl.C17885a;
import wg0.C25149b;
import zf0.C25448i0;

/* renamed from: lh0.s */
public final class C24301s extends C24298r implements C24269h {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24301s(C24312z zVar, C24312z zVar2) {
        super(zVar, zVar2);
        C24362h.m61211f(zVar, "lowerBound");
        C24362h.m61211f(zVar2, "upperBound");
    }

    /* renamed from: A */
    public final boolean mo60427A() {
        if (!(this.f61594c.mo60411O0().mo53460o() instanceof C25448i0) || !C24362h.m61206a(this.f61594c.mo60411O0(), this.f61595d.mo60411O0())) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public final C24306u0 mo60428C(C24307v vVar) {
        C24306u0 u0Var;
        C24362h.m61211f(vVar, "replacement");
        C24306u0 R0 = vVar.mo60450R0();
        if (R0 instanceof C24298r) {
            u0Var = R0;
        } else if (R0 instanceof C24312z) {
            C24312z zVar = (C24312z) R0;
            u0Var = KotlinTypeFactory.m60474c(zVar, zVar.mo59559S0(true));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return C17885a.m44434d0(u0Var, R0);
    }

    /* renamed from: Q0 */
    public final C24307v mo59558Q0(C24378d dVar) {
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        return new C24301s((C24312z) dVar.mo60522A(this.f61594c), (C24312z) dVar.mo60522A(this.f61595d));
    }

    /* renamed from: S0 */
    public final C24306u0 mo59559S0(boolean z) {
        return KotlinTypeFactory.m60474c(this.f61594c.mo59559S0(z), this.f61595d.mo59559S0(z));
    }

    /* renamed from: T0 */
    public final C24306u0 mo59560T0(C24378d dVar) {
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        return new C24301s((C24312z) dVar.mo60522A(this.f61594c), (C24312z) dVar.mo60522A(this.f61595d));
    }

    /* renamed from: U0 */
    public final C24306u0 mo59561U0(C20989e eVar) {
        return KotlinTypeFactory.m60474c(this.f61594c.mo59561U0(eVar), this.f61595d.mo59561U0(eVar));
    }

    /* renamed from: V0 */
    public final C24312z mo59562V0() {
        return this.f61594c;
    }

    /* renamed from: W0 */
    public final String mo59563W0(DescriptorRenderer descriptorRenderer, C25149b bVar) {
        C24362h.m61211f(descriptorRenderer, "renderer");
        C24362h.m61211f(bVar, "options");
        if (!bVar.mo60139j()) {
            return descriptorRenderer.mo60088p(descriptorRenderer.mo60091s(this.f61594c), descriptorRenderer.mo60091s(this.f61595d), TypeUtilsKt.m60522g(this));
        }
        StringBuilder q = C25541a.m63886q('(');
        q.append(descriptorRenderer.mo60091s(this.f61594c));
        q.append("..");
        q.append(descriptorRenderer.mo60091s(this.f61595d));
        q.append(')');
        return q.toString();
    }

    public final String toString() {
        StringBuilder q = C25541a.m63886q('(');
        q.append(this.f61594c);
        q.append("..");
        q.append(this.f61595d);
        q.append(')');
        return q.toString();
    }
}
