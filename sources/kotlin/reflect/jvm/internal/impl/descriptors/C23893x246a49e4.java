package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import th0.C25003h;
import zf0.C25442g;
import zf0.C25448i0;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3 */
public final class C23893x246a49e4 extends Lambda implements C24236l<C25442g, C25003h<? extends C25448i0>> {

    /* renamed from: f */
    public static final C23893x246a49e4 f60438f = new C23893x246a49e4();

    public C23893x246a49e4() {
        super(1);
    }

    public final Object invoke(Object obj) {
        C25442g gVar = (C25442g) obj;
        C24362h.m61211f(gVar, "it");
        List<C25448i0> typeParameters = ((C23894a) gVar).getTypeParameters();
        C24362h.m61210e(typeParameters, "it as CallableDescriptor).typeParameters");
        return C23825c.m58506c0(typeParameters);
    }
}
