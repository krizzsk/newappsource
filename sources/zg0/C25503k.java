package zg0;

import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import zf0.C25485t;

/* renamed from: zg0.k */
public final class C25503k extends C25498g<Float> {
    public C25503k(float f) {
        super(Float.valueOf(f));
    }

    /* renamed from: a */
    public final C24307v mo62745a(C25485t tVar) {
        C24362h.m61211f(tVar, "module");
        C23867c m = tVar.mo59460m();
        m.getClass();
        C24312z t = m.mo59396t(PrimitiveType.FLOAT);
        if (t != null) {
            return t;
        }
        C23867c.m58681a(60);
        throw null;
    }

    public final String toString() {
        return ((Number) this.f63774a).floatValue() + ".toFloat()";
    }
}
