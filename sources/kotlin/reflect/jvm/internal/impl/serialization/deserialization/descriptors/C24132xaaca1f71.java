package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import cf0.C21151y;
import eh0.C23306d;
import eh0.C23312h;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C23903e;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import lf0.C24225a;
import lh0.C24307v;
import mf0.C24362h;
import p584jl.C17885a;
import ug0.C25069e;
import zf0.C25442g;
import zf0.C25491z;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumMemberNames$1 */
public final class C24132xaaca1f71 extends Lambda implements C24225a<Set<? extends C25069e>> {
    public final /* synthetic */ DeserializedClassDescriptor.EnumEntryClassDescriptors this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24132xaaca1f71(DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors) {
        super(0);
        this.this$0 = enumEntryClassDescriptors;
    }

    public final Object invoke() {
        DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors = this.this$0;
        enumEntryClassDescriptors.getClass();
        HashSet hashSet = new HashSet();
        for (C24307v o : enumEntryClassDescriptors.f61289d.f61269o.mo53459n()) {
            for (C25442g gVar : C23312h.C23313a.m57410a(o.mo59564o(), (C23306d) null, 3)) {
                if ((gVar instanceof C23903e) || (gVar instanceof C25491z)) {
                    hashSet.add(gVar.getName());
                }
            }
        }
        List<ProtoBuf$Function> a0 = enumEntryClassDescriptors.f61289d.f61260f.mo59664a0();
        C24362h.m61210e(a0, "classProto.functionList");
        DeserializedClassDescriptor deserializedClassDescriptor = enumEntryClassDescriptors.f61289d;
        for (ProtoBuf$Function I : a0) {
            hashSet.add(C17885a.m44427X(deserializedClassDescriptor.f61267m.f59332b, I.mo59727I()));
        }
        List<ProtoBuf$Property> f0 = enumEntryClassDescriptors.f61289d.f61260f.mo59669f0();
        C24362h.m61210e(f0, "classProto.propertyList");
        DeserializedClassDescriptor deserializedClassDescriptor2 = enumEntryClassDescriptors.f61289d;
        for (ProtoBuf$Property H : f0) {
            hashSet.add(C17885a.m44427X(deserializedClassDescriptor2.f61267m.f59332b, H.mo59771H()));
        }
        return C21151y.m49445h0(hashSet, hashSet);
    }
}
