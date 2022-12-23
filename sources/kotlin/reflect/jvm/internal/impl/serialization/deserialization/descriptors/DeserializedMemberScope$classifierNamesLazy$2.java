package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import cf0.C21151y;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import ug0.C25069e;

public final class DeserializedMemberScope$classifierNamesLazy$2 extends Lambda implements C24225a<Set<? extends C25069e>> {
    public final /* synthetic */ DeserializedMemberScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$classifierNamesLazy$2(DeserializedMemberScope deserializedMemberScope) {
        super(0);
        this.this$0 = deserializedMemberScope;
    }

    public final Object invoke() {
        Set<C25069e> n = this.this$0.mo58965n();
        if (n == null) {
            return null;
        }
        return C21151y.m49445h0(C21151y.m49445h0(this.this$0.mo60211m(), this.this$0.f61292c.mo60218g()), n);
    }
}
