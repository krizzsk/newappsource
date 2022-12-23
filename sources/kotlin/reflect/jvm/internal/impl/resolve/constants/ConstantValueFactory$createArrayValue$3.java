package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import lf0.C24236l;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import zf0.C25485t;

public final class ConstantValueFactory$createArrayValue$3 extends Lambda implements C24236l<C25485t, C24307v> {
    public final /* synthetic */ PrimitiveType $componentType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstantValueFactory$createArrayValue$3(PrimitiveType primitiveType) {
        super(1);
        this.$componentType = primitiveType;
    }

    public final Object invoke(Object obj) {
        C25485t tVar = (C25485t) obj;
        C24362h.m61211f(tVar, "module");
        C24312z r = tVar.mo59460m().mo59395r(this.$componentType);
        C24362h.m61210e(r, "module.builtIns.getPrimi…KotlinType(componentType)");
        return r;
    }
}
