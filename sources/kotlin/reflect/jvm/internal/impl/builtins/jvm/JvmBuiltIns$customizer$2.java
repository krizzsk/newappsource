package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kh0.C23792h;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23909c;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import lf0.C24225a;
import mf0.C24362h;

final class JvmBuiltIns$customizer$2 extends Lambda implements C24225a<JvmBuiltInsCustomizer> {
    public final /* synthetic */ C23792h $storageManager;
    public final /* synthetic */ JvmBuiltIns this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns$customizer$2(JvmBuiltIns jvmBuiltIns, LockBasedStorageManager lockBasedStorageManager) {
        super(0);
        this.this$0 = jvmBuiltIns;
        this.$storageManager = lockBasedStorageManager;
    }

    public final Object invoke() {
        C23909c l = this.this$0.mo59389l();
        C24362h.m61210e(l, "builtInsModule");
        C23792h hVar = this.$storageManager;
        final JvmBuiltIns jvmBuiltIns = this.this$0;
        return new JvmBuiltInsCustomizer(l, hVar, new C24225a<JvmBuiltIns.C23876a>() {
            public final Object invoke() {
                C24225a<JvmBuiltIns.C23876a> aVar = JvmBuiltIns.this.f60393f;
                if (aVar != null) {
                    JvmBuiltIns.C23876a invoke = aVar.invoke();
                    JvmBuiltIns.this.f60393f = null;
                    return invoke;
                }
                throw new AssertionError("JvmBuiltins instance has not been initialized properly");
            }
        });
    }
}
