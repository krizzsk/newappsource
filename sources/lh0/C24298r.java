package lh0;

import ag0.C20989e;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import mf0.C24362h;
import oh0.C24615d;
import wg0.C25149b;

/* renamed from: lh0.r */
public abstract class C24298r extends C24306u0 implements C24615d {

    /* renamed from: c */
    public final C24312z f61594c;

    /* renamed from: d */
    public final C24312z f61595d;

    public C24298r(C24312z zVar, C24312z zVar2) {
        C24362h.m61211f(zVar, "lowerBound");
        C24362h.m61211f(zVar2, "upperBound");
        this.f61594c = zVar;
        this.f61595d = zVar2;
    }

    /* renamed from: N0 */
    public final List<C24281l0> mo60410N0() {
        return mo59562V0().mo60410N0();
    }

    /* renamed from: O0 */
    public final C24274i0 mo60411O0() {
        return mo59562V0().mo60411O0();
    }

    /* renamed from: P0 */
    public boolean mo60412P0() {
        return mo59562V0().mo60412P0();
    }

    /* renamed from: V0 */
    public abstract C24312z mo59562V0();

    /* renamed from: W0 */
    public abstract String mo59563W0(DescriptorRenderer descriptorRenderer, C25149b bVar);

    public C20989e getAnnotations() {
        return mo59562V0().getAnnotations();
    }

    /* renamed from: o */
    public MemberScope mo59564o() {
        return mo59562V0().mo59564o();
    }

    public String toString() {
        return DescriptorRenderer.f61107b.mo60091s(this);
    }
}
