package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import ag0.C20986c;
import hh0.C23497i;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import lf0.C24225a;

public final class TypeDeserializer$simpleType$annotations$1 extends Lambda implements C24225a<List<? extends C20986c>> {
    public final /* synthetic */ ProtoBuf$Type $proto;
    public final /* synthetic */ TypeDeserializer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypeDeserializer$simpleType$annotations$1(ProtoBuf$Type protoBuf$Type, TypeDeserializer typeDeserializer) {
        super(0);
        this.this$0 = typeDeserializer;
        this.$proto = protoBuf$Type;
    }

    public final Object invoke() {
        C23497i iVar = this.this$0.f61244a;
        return iVar.f59331a.f59315e.mo58590b(this.$proto, iVar.f59332b);
    }
}
