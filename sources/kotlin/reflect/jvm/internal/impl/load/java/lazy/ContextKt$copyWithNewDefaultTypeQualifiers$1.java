package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import ag0.C20989e;
import hg0.C23478n;
import kg0.C23780d;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;

public final class ContextKt$copyWithNewDefaultTypeQualifiers$1 extends Lambda implements C24225a<C23478n> {
    public final /* synthetic */ C20989e $additionalAnnotations;
    public final /* synthetic */ C23780d $this_copyWithNewDefaultTypeQualifiers;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContextKt$copyWithNewDefaultTypeQualifiers$1(C23780d dVar, C20989e eVar) {
        super(0);
        this.$this_copyWithNewDefaultTypeQualifiers = dVar;
        this.$additionalAnnotations = eVar;
    }

    public final Object invoke() {
        return ContextKt.m59009b(this.$this_copyWithNewDefaultTypeQualifiers, this.$additionalAnnotations);
    }
}
