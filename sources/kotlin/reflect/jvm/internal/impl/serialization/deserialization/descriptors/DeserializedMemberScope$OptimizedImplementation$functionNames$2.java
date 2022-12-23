package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import cf0.C21151y;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import lf0.C24225a;
import ug0.C25069e;

public final class DeserializedMemberScope$OptimizedImplementation$functionNames$2 extends Lambda implements C24225a<Set<? extends C25069e>> {
    public final /* synthetic */ DeserializedMemberScope.OptimizedImplementation this$0;
    public final /* synthetic */ DeserializedMemberScope this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$OptimizedImplementation$functionNames$2(DeserializedMemberScope.OptimizedImplementation optimizedImplementation, DeserializedMemberScope deserializedMemberScope) {
        super(0);
        this.this$0 = optimizedImplementation;
        this.this$1 = deserializedMemberScope;
    }

    public final Object invoke() {
        return C21151y.m49445h0(this.this$0.f61296a.keySet(), this.this$1.mo58966o());
    }
}
