package kotlin.sequences;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C24134xb5e458c1;
import lf0.C24225a;
import lf0.C24236l;
import mf0.C24362h;

@Metadata(mo59059d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"<anonymous>", "T", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
final class SequencesKt__SequencesKt$generateSequence$1 extends Lambda implements C24236l<Object, Object> {
    public final /* synthetic */ C24225a<Object> $nextFunction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt__SequencesKt$generateSequence$1(C24134xb5e458c1 deserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1) {
        super(1);
        this.$nextFunction = deserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1;
    }

    public final Object invoke(Object obj) {
        C24362h.m61211f(obj, "it");
        return this.$nextFunction.invoke();
    }
}
