package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import lf0.C24236l;
import p584jl.C17885a;
import ug0.C25065b;
import zf0.C25437e;

public final class TypeDeserializer$classifierDescriptors$1 extends Lambda implements C24236l<Integer, C25437e> {
    public final /* synthetic */ TypeDeserializer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypeDeserializer$classifierDescriptors$1(TypeDeserializer typeDeserializer) {
        super(1);
        this.this$0 = typeDeserializer;
    }

    public final Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        TypeDeserializer typeDeserializer = this.this$0;
        C25065b R = C17885a.m44421R(typeDeserializer.f61244a.f59332b, intValue);
        if (R.f63252c) {
            return typeDeserializer.f61244a.f59331a.mo58608b(R);
        }
        return FindClassInModuleKt.m58736b(typeDeserializer.f61244a.f59331a.f59312b, R);
    }
}
