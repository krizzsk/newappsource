package zg0;

import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import lh0.C24289p;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import zf0.C25432c;
import zf0.C25485t;

/* renamed from: zg0.u */
public final class C25516u extends C25519x<Integer> {
    public C25516u(int i) {
        super(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final C24307v mo62745a(C25485t tVar) {
        C24362h.m61211f(tVar, "module");
        C25432c a = FindClassInModuleKt.m58735a(tVar, C23872e.C23873a.f60353S);
        if (a == null) {
            return C24289p.m60914d("Unsigned type UInt not found");
        }
        C24312z q = a.mo53412q();
        C24362h.m61210e(q, "module.findClassAcrossMo…ned type UInt not found\")");
        return q;
    }

    public final String toString() {
        return ((Number) this.f63774a).intValue() + ".toUInt()";
    }
}
