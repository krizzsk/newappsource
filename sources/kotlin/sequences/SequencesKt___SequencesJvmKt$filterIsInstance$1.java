package kotlin.sequences;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;

@Metadata(mo59059d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo59060d2 = {"<anonymous>", "", "R", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
final class SequencesKt___SequencesJvmKt$filterIsInstance$1 extends Lambda implements C24236l<Object, Boolean> {
    public final /* synthetic */ Class<Object> $klass;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesJvmKt$filterIsInstance$1(Class<Object> cls) {
        super(1);
        this.$klass = cls;
    }

    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.$klass.isInstance(obj));
    }
}
