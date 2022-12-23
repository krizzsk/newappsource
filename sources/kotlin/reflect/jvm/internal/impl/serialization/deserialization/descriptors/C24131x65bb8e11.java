package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import ag0.C20986c;
import java.util.List;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import lf0.C24225a;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1$1$1 */
final class C24131x65bb8e11 extends Lambda implements C24225a<List<? extends C20986c>> {
    public final /* synthetic */ ProtoBuf$EnumEntry $proto;
    public final /* synthetic */ DeserializedClassDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24131x65bb8e11(DeserializedClassDescriptor deserializedClassDescriptor, ProtoBuf$EnumEntry protoBuf$EnumEntry) {
        super(0);
        this.this$0 = deserializedClassDescriptor;
        this.$proto = protoBuf$EnumEntry;
    }

    public final Object invoke() {
        DeserializedClassDescriptor deserializedClassDescriptor = this.this$0;
        return C23825c.m58499K0(deserializedClassDescriptor.f61267m.f59331a.f59315e.mo58598j(deserializedClassDescriptor.f61278x, this.$proto));
    }
}
