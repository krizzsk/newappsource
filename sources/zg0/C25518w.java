package zg0;

import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import lh0.C24289p;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import zf0.C25432c;
import zf0.C25485t;

/* renamed from: zg0.w */
public final class C25518w extends C25519x<Short> {
    public C25518w(short s) {
        super(Short.valueOf(s));
    }

    /* renamed from: a */
    public final C24307v mo62745a(C25485t tVar) {
        C24362h.m61211f(tVar, "module");
        C25432c a = FindClassInModuleKt.m58735a(tVar, C23872e.C23873a.f60352R);
        if (a == null) {
            return C24289p.m60914d("Unsigned type UShort not found");
        }
        C24312z q = a.mo53412q();
        C24362h.m61210e(q, "module.findClassAcrossMo…d type UShort not found\")");
        return q;
    }

    public final String toString() {
        return ((Number) this.f63774a).intValue() + ".toUShort()";
    }
}
