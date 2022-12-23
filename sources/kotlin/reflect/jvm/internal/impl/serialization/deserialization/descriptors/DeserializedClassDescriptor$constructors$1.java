package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import cf0.C21136j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import lf0.C24225a;
import mf0.C24362h;
import p583jk.C17875h;
import sg0.C24872b;
import zf0.C25430b;

public final class DeserializedClassDescriptor$constructors$1 extends Lambda implements C24225a<Collection<? extends C25430b>> {
    public final /* synthetic */ DeserializedClassDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$constructors$1(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(0);
        this.this$0 = deserializedClassDescriptor;
    }

    public final Object invoke() {
        DeserializedClassDescriptor deserializedClassDescriptor = this.this$0;
        List<ProtoBuf$Constructor> W = deserializedClassDescriptor.f61260f.mo59660W();
        C24362h.m61210e(W, "classProto.constructorList");
        ArrayList arrayList = new ArrayList();
        for (T next : W) {
            Boolean c = C24872b.f62894m.mo61346c(((ProtoBuf$Constructor) next).mo59690w());
            C24362h.m61210e(c, "IS_SECONDARY.get(it.flags)");
            if (c.booleanValue()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C21136j.m49436X(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ProtoBuf$Constructor protoBuf$Constructor = (ProtoBuf$Constructor) it.next();
            MemberDeserializer memberDeserializer = deserializedClassDescriptor.f61267m.f59339i;
            C24362h.m61210e(protoBuf$Constructor, "it");
            arrayList2.add(memberDeserializer.mo60193d(protoBuf$Constructor, false));
        }
        return C23825c.m58527x0(deserializedClassDescriptor.f61267m.f59331a.f59324n.mo53178d(deserializedClassDescriptor), C23825c.m58527x0(C17875h.m44282F(deserializedClassDescriptor.mo53507H()), arrayList2));
    }
}
