package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23909c;
import lf0.C24225a;
import zf0.C25485t;

final class JvmBuiltIns$initialize$1 extends Lambda implements C24225a<JvmBuiltIns.C23876a> {
    public final /* synthetic */ boolean $isAdditionalBuiltInsFeatureSupported = true;
    public final /* synthetic */ C25485t $moduleDescriptor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns$initialize$1(C23909c cVar) {
        super(0);
        this.$moduleDescriptor = cVar;
    }

    public final Object invoke() {
        return new JvmBuiltIns.C23876a(this.$moduleDescriptor, this.$isAdditionalBuiltInsFeatureSupported);
    }
}
