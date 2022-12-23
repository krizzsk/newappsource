package kotlinx.coroutines.flow;

import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import zh0.C25523d;

@C23413c(mo58554c = "kotlinx.coroutines.flow.FlowKt__LimitKt", mo58555f = "Limit.kt", mo58556l = {73}, mo58557m = "emitAbort$FlowKt__LimitKt")
@Metadata(mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
final class FlowKt__LimitKt$emitAbort$1<T> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public FlowKt__LimitKt$emitAbort$1(C23349c<? super FlowKt__LimitKt$emitAbort$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C24207c.m60674a((C25523d) null, (Object) null, this);
    }
}
