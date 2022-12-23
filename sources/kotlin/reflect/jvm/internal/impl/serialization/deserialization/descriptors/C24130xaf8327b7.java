package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import cg0.C21188q;
import jh0.C23727a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import lf0.C24236l;
import mf0.C24362h;
import ug0.C25069e;
import zf0.C25432c;
import zf0.C25435d0;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1 */
public final class C24130xaf8327b7 extends Lambda implements C24236l<C25069e, C25432c> {
    public final /* synthetic */ DeserializedClassDescriptor.EnumEntryClassDescriptors this$0;
    public final /* synthetic */ DeserializedClassDescriptor this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24130xaf8327b7(DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors, DeserializedClassDescriptor deserializedClassDescriptor) {
        super(1);
        this.this$0 = enumEntryClassDescriptors;
        this.this$1 = deserializedClassDescriptor;
    }

    public final Object invoke(Object obj) {
        C25069e eVar = (C25069e) obj;
        C24362h.m61211f(eVar, "name");
        ProtoBuf$EnumEntry protoBuf$EnumEntry = (ProtoBuf$EnumEntry) this.this$0.f61286a.get(eVar);
        if (protoBuf$EnumEntry == null) {
            return null;
        }
        DeserializedClassDescriptor deserializedClassDescriptor = this.this$1;
        DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors = this.this$0;
        return C21188q.m49704N0(deserializedClassDescriptor.f61267m.f59331a.f59311a, deserializedClassDescriptor, eVar, enumEntryClassDescriptors.f61288c, new C23727a(deserializedClassDescriptor.f61267m.f59331a.f59311a, new C24131x65bb8e11(deserializedClassDescriptor, protoBuf$EnumEntry)), C25435d0.f63736a);
    }
}
