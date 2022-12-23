package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import hg0.C23478n;
import kg0.C23780d;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import zf0.C25434d;

final class ContextKt$childForClassOrPackage$1 extends Lambda implements C24225a<C23478n> {
    public final /* synthetic */ C25434d $containingDeclaration;
    public final /* synthetic */ C23780d $this_childForClassOrPackage;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContextKt$childForClassOrPackage$1(C23780d dVar, C25434d dVar2) {
        super(0);
        this.$this_childForClassOrPackage = dVar;
        this.$containingDeclaration = dVar2;
    }

    public final Object invoke() {
        return ContextKt.m59009b(this.$this_childForClassOrPackage, this.$containingDeclaration.getAnnotations());
    }
}
