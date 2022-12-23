package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import lf0.C24236l;
import lh0.C24281l0;
import lh0.C24307v;
import mf0.C24362h;

final class DescriptorRendererImpl$appendTypeProjections$1 extends Lambda implements C24236l<C24281l0, CharSequence> {
    public final /* synthetic */ DescriptorRendererImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DescriptorRendererImpl$appendTypeProjections$1(DescriptorRendererImpl descriptorRendererImpl) {
        super(1);
        this.this$0 = descriptorRendererImpl;
    }

    public final Object invoke(Object obj) {
        C24281l0 l0Var = (C24281l0) obj;
        C24362h.m61211f(l0Var, "it");
        if (l0Var.mo60240a()) {
            return "*";
        }
        DescriptorRendererImpl descriptorRendererImpl = this.this$0;
        C24307v type = l0Var.getType();
        C24362h.m61210e(type, "it.type");
        String s = descriptorRendererImpl.mo60091s(type);
        if (l0Var.mo60241b() == Variance.INVARIANT) {
            return s;
        }
        return l0Var.mo60241b() + ' ' + s;
    }
}
