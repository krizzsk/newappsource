package qh0;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import mf0.C24362h;
import qh0.C24770a;
import zf0.C25452k0;

/* renamed from: qh0.f */
public final class C24782f implements C24770a {

    /* renamed from: a */
    public static final C24782f f62685a = new C24782f();

    /* renamed from: a */
    public final String mo60274a(C23900c cVar) {
        return C24770a.C24771a.m62306a(this, cVar);
    }

    /* renamed from: b */
    public final boolean mo60275b(C23900c cVar) {
        boolean z;
        C24362h.m61211f(cVar, "functionDescriptor");
        List<C25452k0> h = cVar.mo53442h();
        C24362h.m61210e(h, "functionDescriptor.valueParameters");
        if (!h.isEmpty()) {
            for (C25452k0 k0Var : h) {
                C24362h.m61210e(k0Var, "it");
                if (DescriptorUtilsKt.m60280a(k0Var) || k0Var.mo59467z0() != null) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    public final String getDescription() {
        return "should not have varargs or parameters with default values";
    }
}
