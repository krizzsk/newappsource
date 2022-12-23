package kotlinx.coroutines.flow;

import ff0.C23349c;
import gf0.C23413c;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import zh0.C25522c;

@C23413c(mo58554c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", mo58555f = "Collection.kt", mo58556l = {26}, mo58557m = "toCollection")
@Metadata(mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
final class FlowKt__CollectionKt$toCollection$1<T, C extends Collection<? super T>> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public FlowKt__CollectionKt$toCollection$1(C23349c<? super FlowKt__CollectionKt$toCollection$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C24206b.m60673a((C25522c) null, (List) null, this);
    }
}
