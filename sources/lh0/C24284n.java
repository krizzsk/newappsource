package lh0;

import ag0.C20989e;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import mf0.C24362h;
import mh0.C24378d;
import wg0.C25149b;

/* renamed from: lh0.n */
public final class C24284n extends C24298r {

    /* renamed from: e */
    public final C20989e f61576e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C24284n(kotlin.reflect.jvm.internal.impl.builtins.C23867c r3, ag0.C20989e r4) {
        /*
            r2 = this;
            java.lang.String r0 = "annotations"
            mf0.C24362h.m61211f(r4, r0)
            lh0.z r0 = r3.mo59392o()
            java.lang.String r1 = "builtIns.nothingType"
            mf0.C24362h.m61210e(r0, r1)
            lh0.z r3 = r3.mo59393p()
            r2.<init>(r0, r3)
            r2.f61576e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lh0.C24284n.<init>(kotlin.reflect.jvm.internal.impl.builtins.c, ag0.e):void");
    }

    /* renamed from: P0 */
    public final boolean mo60412P0() {
        return false;
    }

    /* renamed from: Q0 */
    public final C24307v mo59558Q0(C24378d dVar) {
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        return this;
    }

    /* renamed from: S0 */
    public final C24306u0 mo59559S0(boolean z) {
        return this;
    }

    /* renamed from: T0 */
    public final C24306u0 mo59560T0(C24378d dVar) {
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        return this;
    }

    /* renamed from: U0 */
    public final C24306u0 mo59561U0(C20989e eVar) {
        return new C24284n(TypeUtilsKt.m60522g(this.f61595d), eVar);
    }

    /* renamed from: V0 */
    public final C24312z mo59562V0() {
        return this.f61595d;
    }

    /* renamed from: W0 */
    public final String mo59563W0(DescriptorRenderer descriptorRenderer, C25149b bVar) {
        C24362h.m61211f(descriptorRenderer, "renderer");
        C24362h.m61211f(bVar, "options");
        return "dynamic";
    }

    public final C20989e getAnnotations() {
        return this.f61576e;
    }
}
