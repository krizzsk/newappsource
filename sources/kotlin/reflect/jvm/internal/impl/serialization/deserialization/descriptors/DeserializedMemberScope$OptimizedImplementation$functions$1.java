package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import jh0.C23734h;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C23903e;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.sequences.C24177b;
import kotlin.sequences.SequencesKt__SequencesKt;
import lf0.C24236l;
import mf0.C24361g;
import mf0.C24362h;
import p583jk.C17875h;
import ug0.C25069e;

public final class DeserializedMemberScope$OptimizedImplementation$functions$1 extends Lambda implements C24236l<C25069e, Collection<? extends C23903e>> {
    public final /* synthetic */ DeserializedMemberScope.OptimizedImplementation this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$OptimizedImplementation$functions$1(DeserializedMemberScope.OptimizedImplementation optimizedImplementation) {
        super(1);
        this.this$0 = optimizedImplementation;
    }

    public final Object invoke(Object obj) {
        Collection<ProtoBuf$Function> collection;
        C25069e eVar = (C25069e) obj;
        C24362h.m61211f(eVar, "it");
        DeserializedMemberScope.OptimizedImplementation optimizedImplementation = this.this$0;
        LinkedHashMap linkedHashMap = optimizedImplementation.f61296a;
        ProtoBuf$Function.C24013a aVar = ProtoBuf$Function.f60868c;
        C24362h.m61210e(aVar, "PARSER");
        DeserializedMemberScope deserializedMemberScope = optimizedImplementation.f61304i;
        byte[] bArr = (byte[]) linkedHashMap.get(eVar);
        if (bArr == null) {
            collection = EmptyList.f60173b;
        } else {
            collection = C17875h.m44285I(C24177b.m60553n0(SequencesKt__SequencesKt.m60540a0(new C24134xb5e458c1(aVar, new ByteArrayInputStream(bArr), optimizedImplementation.f61304i))));
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (ProtoBuf$Function protoBuf$Function : collection) {
            MemberDeserializer memberDeserializer = deserializedMemberScope.f61291b.f59339i;
            C24362h.m61210e(protoBuf$Function, "it");
            C23734h e = memberDeserializer.mo60194e(protoBuf$Function);
            if (!deserializedMemberScope.mo60207r(e)) {
                e = null;
            }
            if (e != null) {
                arrayList.add(e);
            }
        }
        deserializedMemberScope.mo60205j(eVar, arrayList);
        return C24361g.m61195x(arrayList);
    }
}
