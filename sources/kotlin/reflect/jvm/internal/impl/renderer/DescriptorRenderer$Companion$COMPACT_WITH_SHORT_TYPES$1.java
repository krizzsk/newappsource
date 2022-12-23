package kotlin.reflect.jvm.internal.impl.renderer;

import bf0.C21050d;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import wg0.C25145a;
import wg0.C25149b;

public final class DescriptorRenderer$Companion$COMPACT_WITH_SHORT_TYPES$1 extends Lambda implements C24236l<C25149b, C21050d> {

    /* renamed from: f */
    public static final DescriptorRenderer$Companion$COMPACT_WITH_SHORT_TYPES$1 f61113f = new DescriptorRenderer$Companion$COMPACT_WITH_SHORT_TYPES$1();

    public DescriptorRenderer$Companion$COMPACT_WITH_SHORT_TYPES$1() {
        super(1);
    }

    public final Object invoke(Object obj) {
        C25149b bVar = (C25149b) obj;
        C24362h.m61211f(bVar, "$this$withOptions");
        bVar.mo60143m(EmptySet.f60175b);
        bVar.mo60131f(C25145a.C25147b.f63424a);
        bVar.mo60125c(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
        return C21050d.f52856a;
    }
}
