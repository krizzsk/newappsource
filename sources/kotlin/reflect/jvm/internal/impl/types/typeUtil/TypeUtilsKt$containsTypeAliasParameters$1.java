package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import lh0.C24306u0;
import mf0.C24362h;
import zf0.C25437e;
import zf0.C25446h0;
import zf0.C25448i0;

public final class TypeUtilsKt$containsTypeAliasParameters$1 extends Lambda implements C24236l<C24306u0, Boolean> {

    /* renamed from: f */
    public static final TypeUtilsKt$containsTypeAliasParameters$1 f61367f = new TypeUtilsKt$containsTypeAliasParameters$1();

    public TypeUtilsKt$containsTypeAliasParameters$1() {
        super(1);
    }

    public final Object invoke(Object obj) {
        C24306u0 u0Var = (C24306u0) obj;
        C24362h.m61211f(u0Var, "it");
        C25437e o = u0Var.mo60411O0().mo53460o();
        boolean z = false;
        if (o != null && (o instanceof C25448i0) && (((C25448i0) o).mo53399b() instanceof C25446h0)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
