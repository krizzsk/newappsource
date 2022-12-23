package kotlin.sequences;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;

@Metadata(mo59059d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
public final class SequencesKt__SequencesKt$generateSequence$2 extends Lambda implements C24225a<T> {
    public final /* synthetic */ T $seed;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt__SequencesKt$generateSequence$2(T t) {
        super(0);
        this.$seed = t;
    }

    public final T invoke() {
        return this.$seed;
    }
}
