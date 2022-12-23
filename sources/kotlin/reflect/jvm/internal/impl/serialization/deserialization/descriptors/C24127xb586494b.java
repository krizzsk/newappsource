package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import eh0.C23306d;
import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import lf0.C24225a;
import zf0.C25442g;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$allDescriptors$1 */
public final class C24127xb586494b extends Lambda implements C24225a<Collection<? extends C25442g>> {
    public final /* synthetic */ DeserializedClassDescriptor.DeserializedClassMemberScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24127xb586494b(DeserializedClassDescriptor.DeserializedClassMemberScope deserializedClassMemberScope) {
        super(0);
        this.this$0 = deserializedClassMemberScope;
    }

    public final Object invoke() {
        DeserializedClassDescriptor.DeserializedClassMemberScope deserializedClassMemberScope = this.this$0;
        C23306d dVar = C23306d.f59098m;
        MemberScope.f61214a.getClass();
        return deserializedClassMemberScope.mo60210i(dVar, MemberScope.Companion.f61216b, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
    }
}
