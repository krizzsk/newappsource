package kotlinx.coroutines.flow;

import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import zh0.C25522c;

@C23413c(mo58554c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", mo58555f = "Reduce.kt", mo58556l = {183}, mo58557m = "first")
@Metadata(mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class FlowKt__ReduceKt$first$1<T> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public FlowKt__ReduceKt$first$1(C23349c<? super FlowKt__ReduceKt$first$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FlowKt__ReduceKt.m60671a((C25522c) null, this);
    }
}
