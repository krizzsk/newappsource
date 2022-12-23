package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import lf0.C24236l;
import mf0.C24362h;
import ug0.C25069e;
import zf0.C25446h0;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$typeAliasByName$1 */
public final class C24135x48b4056b extends Lambda implements C24236l<C25069e, C25446h0> {
    public final /* synthetic */ DeserializedMemberScope.OptimizedImplementation this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24135x48b4056b(DeserializedMemberScope.OptimizedImplementation optimizedImplementation) {
        super(1);
        this.this$0 = optimizedImplementation;
    }

    public final Object invoke(Object obj) {
        C25069e eVar = (C25069e) obj;
        C24362h.m61211f(eVar, "it");
        DeserializedMemberScope.OptimizedImplementation optimizedImplementation = this.this$0;
        byte[] bArr = optimizedImplementation.f61298c.get(eVar);
        if (bArr != null) {
            ProtoBuf$TypeAlias protoBuf$TypeAlias = (ProtoBuf$TypeAlias) ProtoBuf$TypeAlias.f60951c.mo60018c(new ByteArrayInputStream(bArr), optimizedImplementation.f61304i.f61291b.f59331a.f59326p);
            if (protoBuf$TypeAlias != null) {
                return optimizedImplementation.f61304i.f61291b.f59339i.mo60196g(protoBuf$TypeAlias);
            }
        }
        return null;
    }
}
