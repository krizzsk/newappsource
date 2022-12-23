package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import zg0.C25498g;

public final class DescriptorRendererImpl$renderConstant$1 extends Lambda implements C24236l<C25498g<?>, CharSequence> {
    public final /* synthetic */ DescriptorRendererImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DescriptorRendererImpl$renderConstant$1(DescriptorRendererImpl descriptorRendererImpl) {
        super(1);
        this.this$0 = descriptorRendererImpl;
    }

    public final Object invoke(Object obj) {
        C25498g gVar = (C25498g) obj;
        C24362h.m61211f(gVar, "it");
        DescriptorRendererImpl descriptorRendererImpl = this.this$0;
        int i = DescriptorRendererImpl.f61120e;
        return descriptorRendererImpl.mo60104I(gVar);
    }
}
