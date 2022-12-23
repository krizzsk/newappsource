package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$createMockJavaIoSerializableType$superTypes$1 */
final class C23880xd3162e24 extends Lambda implements C24225a<C24307v> {
    public final /* synthetic */ JvmBuiltInsCustomizer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23880xd3162e24(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        super(0);
        this.this$0 = jvmBuiltInsCustomizer;
    }

    public final Object invoke() {
        C24312z f = this.this$0.f60399a.mo59460m().mo59383f();
        C24362h.m61210e(f, "moduleDescriptor.builtIns.anyType");
        return f;
    }
}
