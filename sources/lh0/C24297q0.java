package lh0;

import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import lf0.C24236l;
import ug0.C25066c;

/* renamed from: lh0.q0 */
public final class C24297q0 implements C24236l<C25066c, Boolean> {
    public final Object invoke(Object obj) {
        C25066c cVar = (C25066c) obj;
        if (cVar != null) {
            return Boolean.valueOf(!cVar.equals(C23872e.C23873a.f60386x));
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"}));
    }
}
