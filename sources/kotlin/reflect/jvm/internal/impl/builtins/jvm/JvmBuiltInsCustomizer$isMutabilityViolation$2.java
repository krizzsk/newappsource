package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import lf0.C24236l;
import p583jk.C17875h;
import zf0.C25432c;

final class JvmBuiltInsCustomizer$isMutabilityViolation$2 extends Lambda implements C24236l<CallableMemberDescriptor, Boolean> {
    public final /* synthetic */ JvmBuiltInsCustomizer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$isMutabilityViolation$2(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        super(1);
        this.this$0 = jvmBuiltInsCustomizer;
    }

    public final Object invoke(Object obj) {
        boolean z;
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
        if (callableMemberDescriptor.mo53433p() == CallableMemberDescriptor.Kind.DECLARATION) {
            this.this$0.f60400b.getClass();
            if (C17875h.m44277A((C25432c) callableMemberDescriptor.mo53399b())) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
