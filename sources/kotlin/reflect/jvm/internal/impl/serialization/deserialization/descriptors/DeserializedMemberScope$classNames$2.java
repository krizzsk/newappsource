package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import java.util.Set;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import ug0.C25069e;

public final class DeserializedMemberScope$classNames$2 extends Lambda implements C24225a<Set<? extends C25069e>> {
    public final /* synthetic */ C24225a<Collection<C25069e>> $classNames;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$classNames$2(C24225a<? extends Collection<C25069e>> aVar) {
        super(0);
        this.$classNames = aVar;
    }

    public final Object invoke() {
        return C23825c.m58503O0(this.$classNames.invoke());
    }
}
