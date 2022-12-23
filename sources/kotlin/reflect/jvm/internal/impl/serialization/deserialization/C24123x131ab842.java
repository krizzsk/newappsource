package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import ce0.C21100e;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import lf0.C24236l;
import mf0.C24362h;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$1 */
public final class C24123x131ab842 extends Lambda implements C24236l<ProtoBuf$Type, ProtoBuf$Type> {
    public final /* synthetic */ TypeDeserializer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24123x131ab842(TypeDeserializer typeDeserializer) {
        super(1);
        this.this$0 = typeDeserializer;
    }

    public final Object invoke(Object obj) {
        ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) obj;
        C24362h.m61211f(protoBuf$Type, "it");
        return C21100e.m49364s0(protoBuf$Type, this.this$0.f61244a.f59334d);
    }
}
