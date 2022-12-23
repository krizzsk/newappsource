package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kh0.C23792h;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import lf0.C24225a;
import lh0.C24312z;
import sf0.C24866j;
import zf0.C25485t;

final class JvmBuiltInsCustomizer$cloneableType$2 extends Lambda implements C24225a<C24312z> {
    public final /* synthetic */ C23792h $storageManager;
    public final /* synthetic */ JvmBuiltInsCustomizer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$cloneableType$2(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, C23792h hVar) {
        super(0);
        this.this$0 = jvmBuiltInsCustomizer;
        this.$storageManager = hVar;
    }

    public final Object invoke() {
        JvmBuiltInsCustomizer jvmBuiltInsCustomizer = this.this$0;
        C24866j<Object>[] jVarArr = JvmBuiltInsCustomizer.f60398h;
        C25485t tVar = jvmBuiltInsCustomizer.mo59409g().f60395a;
        C23882a.f60407d.getClass();
        return FindClassInModuleKt.m58737c(tVar, C23882a.f60411h, new NotFoundClasses(this.$storageManager, this.this$0.mo59409g().f60395a)).mo53412q();
    }
}
