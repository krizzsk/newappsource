package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import ag0.C20986c;
import hh0.C23497i;
import java.util.List;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;

public final class DeserializedTypeParameterDescriptor$annotations$1 extends Lambda implements C24225a<List<? extends C20986c>> {
    public final /* synthetic */ DeserializedTypeParameterDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedTypeParameterDescriptor$annotations$1(DeserializedTypeParameterDescriptor deserializedTypeParameterDescriptor) {
        super(0);
        this.this$0 = deserializedTypeParameterDescriptor;
    }

    public final Object invoke() {
        DeserializedTypeParameterDescriptor deserializedTypeParameterDescriptor = this.this$0;
        C23497i iVar = deserializedTypeParameterDescriptor.f61305l;
        return C23825c.m58499K0(iVar.f59331a.f59315e.mo58595g(deserializedTypeParameterDescriptor.f61306m, iVar.f59332b));
    }
}
