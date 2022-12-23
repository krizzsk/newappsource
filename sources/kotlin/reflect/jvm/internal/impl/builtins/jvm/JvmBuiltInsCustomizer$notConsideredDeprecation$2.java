package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import ag0.C20989e;
import ag0.C20993f;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C23898a;
import lf0.C24225a;
import p583jk.C17875h;

final class JvmBuiltInsCustomizer$notConsideredDeprecation$2 extends Lambda implements C24225a<C20989e> {
    public final /* synthetic */ JvmBuiltInsCustomizer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$notConsideredDeprecation$2(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        super(0);
        this.this$0 = jvmBuiltInsCustomizer;
    }

    public final Object invoke() {
        List D = C17875h.m44280D(C23898a.m58782a(this.this$0.f60399a.mo59460m()));
        if (D.isEmpty()) {
            return C20989e.C20990a.f52739a;
        }
        return new C20993f(D);
    }
}
