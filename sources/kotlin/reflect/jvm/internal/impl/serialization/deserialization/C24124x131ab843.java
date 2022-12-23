package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import lf0.C24236l;
import mf0.C24362h;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$2 */
public final class C24124x131ab843 extends Lambda implements C24236l<ProtoBuf$Type, Integer> {

    /* renamed from: f */
    public static final C24124x131ab843 f61252f = new C24124x131ab843();

    public C24124x131ab843() {
        super(1);
    }

    public final Object invoke(Object obj) {
        ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) obj;
        C24362h.m61211f(protoBuf$Type, "it");
        return Integer.valueOf(protoBuf$Type.mo59813I());
    }
}
