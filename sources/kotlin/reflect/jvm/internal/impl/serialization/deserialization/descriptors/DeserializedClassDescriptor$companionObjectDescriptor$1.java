package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import lf0.C24225a;
import p584jl.C17885a;
import zf0.C25432c;
import zf0.C25437e;

public final class DeserializedClassDescriptor$companionObjectDescriptor$1 extends Lambda implements C24225a<C25432c> {
    public final /* synthetic */ DeserializedClassDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$companionObjectDescriptor$1(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(0);
        this.this$0 = deserializedClassDescriptor;
    }

    public final Object invoke() {
        DeserializedClassDescriptor deserializedClassDescriptor = this.this$0;
        if (deserializedClassDescriptor.f61260f.mo59678n0()) {
            C25437e g = deserializedClassDescriptor.mo60203N0().mo58433g(C17885a.m44427X(deserializedClassDescriptor.f61267m.f59332b, deserializedClassDescriptor.f61260f.mo59659V()), NoLookupLocation.FROM_DESERIALIZATION);
            if (g instanceof C25432c) {
                return (C25432c) g;
            }
        }
        return null;
    }
}
