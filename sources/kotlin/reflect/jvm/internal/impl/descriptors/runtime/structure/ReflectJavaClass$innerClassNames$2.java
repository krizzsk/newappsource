package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import ug0.C25069e;

final class ReflectJavaClass$innerClassNames$2 extends Lambda implements C24236l<Class<?>, C25069e> {

    /* renamed from: f */
    public static final ReflectJavaClass$innerClassNames$2 f60541f = new ReflectJavaClass$innerClassNames$2();

    public ReflectJavaClass$innerClassNames$2() {
        super(1);
    }

    public final Object invoke(Object obj) {
        String simpleName = ((Class) obj).getSimpleName();
        if (!C25069e.m62821j(simpleName)) {
            simpleName = null;
        }
        if (simpleName == null) {
            return null;
        }
        return C25069e.m62820i(simpleName);
    }
}
