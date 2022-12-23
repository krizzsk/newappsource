package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import lf0.C24236l;
import mf0.C24362h;
import mf0.C24365j;
import mh0.C24378d;
import sf0.C24857d;

public /* synthetic */ class DeserializedClassDescriptor$memberScopeHolder$1 extends FunctionReference implements C24236l<C24378d, DeserializedClassDescriptor.DeserializedClassMemberScope> {
    public DeserializedClassDescriptor$memberScopeHolder$1(Object obj) {
        super(1, obj);
    }

    public final String getName() {
        return "<init>";
    }

    public final C24857d getOwner() {
        return C24365j.m61219a(DeserializedClassDescriptor.DeserializedClassMemberScope.class);
    }

    public final String getSignature() {
        return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
    }

    public final Object invoke(Object obj) {
        C24378d dVar = (C24378d) obj;
        C24362h.m61211f(dVar, "p0");
        return new DeserializedClassDescriptor.DeserializedClassMemberScope((DeserializedClassDescriptor) this.receiver, dVar);
    }
}
