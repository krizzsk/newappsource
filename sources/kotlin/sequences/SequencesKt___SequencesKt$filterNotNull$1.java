package kotlin.sequences;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;

@Metadata(mo59059d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo59060d2 = {"<anonymous>", "", "T", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
final class SequencesKt___SequencesKt$filterNotNull$1 extends Lambda implements C24236l<Object, Boolean> {

    /* renamed from: f */
    public static final SequencesKt___SequencesKt$filterNotNull$1 f61406f = new SequencesKt___SequencesKt$filterNotNull$1();

    public SequencesKt___SequencesKt$filterNotNull$1() {
        super(1);
    }

    public final Object invoke(Object obj) {
        return Boolean.valueOf(obj == null);
    }
}
