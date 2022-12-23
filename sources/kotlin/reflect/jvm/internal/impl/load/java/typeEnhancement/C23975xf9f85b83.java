package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import lf0.C24236l;
import lh0.C24307v;
import mf0.C24362h;
import zf0.C25452k0;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$1 */
final class C23975xf9f85b83 extends Lambda implements C24236l<CallableMemberDescriptor, C24307v> {

    /* renamed from: $p */
    public final /* synthetic */ C25452k0 f60749$p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23975xf9f85b83(C25452k0 k0Var) {
        super(1);
        this.f60749$p = k0Var;
    }

    public final Object invoke(Object obj) {
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
        C24362h.m61211f(callableMemberDescriptor, "it");
        C24307v type = callableMemberDescriptor.mo53442h().get(this.f60749$p.getIndex()).getType();
        C24362h.m61210e(type, "it.valueParameters[p.index].type");
        return type;
    }
}
