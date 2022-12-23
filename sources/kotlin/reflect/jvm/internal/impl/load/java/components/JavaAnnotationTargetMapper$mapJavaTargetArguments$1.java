package kotlin.reflect.jvm.internal.impl.load.java.components;

import ig0.C23595b;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import lf0.C24236l;
import lh0.C24289p;
import lh0.C24307v;
import mf0.C24362h;
import p626lf.C18201b;
import zf0.C25452k0;
import zf0.C25485t;

final class JavaAnnotationTargetMapper$mapJavaTargetArguments$1 extends Lambda implements C24236l<C25485t, C24307v> {

    /* renamed from: f */
    public static final JavaAnnotationTargetMapper$mapJavaTargetArguments$1 f60591f = new JavaAnnotationTargetMapper$mapJavaTargetArguments$1();

    public JavaAnnotationTargetMapper$mapJavaTargetArguments$1() {
        super(1);
    }

    public final Object invoke(Object obj) {
        C25485t tVar = (C25485t) obj;
        C24362h.m61211f(tVar, "module");
        C25452k0 p = C18201b.m44919p(C23595b.f59672b, tVar.mo59460m().mo59387j(C23872e.C23873a.f60381s));
        if (p == null) {
            return C24289p.m60914d("Error: AnnotationTarget[]");
        }
        C24307v type = p.getType();
        C24362h.m61210e(type, "parameterDescriptor?.typ…ror: AnnotationTarget[]\")");
        return type;
    }
}
