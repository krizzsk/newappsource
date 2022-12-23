package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23910d;
import lf0.C24225a;
import zf0.C25454l0;

final class ValueParameterDescriptorImpl$WithDestructuringDeclaration$copy$1 extends Lambda implements C24225a<List<? extends C25454l0>> {
    public final /* synthetic */ C23910d.C23911a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ValueParameterDescriptorImpl$WithDestructuringDeclaration$copy$1(C23910d.C23911a aVar) {
        super(0);
        this.this$0 = aVar;
    }

    public final Object invoke() {
        return (List) this.this$0.f60529m.getValue();
    }
}
