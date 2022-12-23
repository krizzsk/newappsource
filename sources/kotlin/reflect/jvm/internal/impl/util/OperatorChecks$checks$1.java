package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import lf0.C24236l;
import mf0.C24362h;
import zf0.C25452k0;

public final class OperatorChecks$checks$1 extends Lambda implements C24236l<C23900c, String> {

    /* renamed from: f */
    public static final OperatorChecks$checks$1 f61376f = new OperatorChecks$checks$1();

    public OperatorChecks$checks$1() {
        super(1);
    }

    public final Object invoke(Object obj) {
        boolean z;
        C23900c cVar = (C23900c) obj;
        C24362h.m61211f(cVar, "$this$$receiver");
        List<C25452k0> h = cVar.mo53442h();
        C24362h.m61210e(h, "valueParameters");
        C25452k0 k0Var = (C25452k0) C23825c.m58523t0(h);
        boolean z2 = false;
        if (k0Var != null) {
            if (DescriptorUtilsKt.m60280a(k0Var) || k0Var.mo59467z0() != null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                z2 = true;
            }
        }
        OperatorChecks operatorChecks = OperatorChecks.f61374b;
        if (!z2) {
            return "last parameter should not have a default value or be a vararg";
        }
        return null;
    }
}
