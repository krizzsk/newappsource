package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import lh0.C24307v;
import mf0.C24362h;

final class DescriptorRendererImpl$renderSuperTypes$1 extends Lambda implements C24236l<C24307v, CharSequence> {
    public final /* synthetic */ DescriptorRendererImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DescriptorRendererImpl$renderSuperTypes$1(DescriptorRendererImpl descriptorRendererImpl) {
        super(1);
        this.this$0 = descriptorRendererImpl;
    }

    public final Object invoke(Object obj) {
        C24307v vVar = (C24307v) obj;
        DescriptorRendererImpl descriptorRendererImpl = this.this$0;
        C24362h.m61210e(vVar, "it");
        return descriptorRendererImpl.mo60091s(vVar);
    }
}
