package kotlinx.coroutines.flow;

import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@C23413c(mo58554c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", mo58555f = "Distinct.kt", mo58556l = {81}, mo58557m = "emit")
@Metadata(mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class DistinctFlowImpl$collect$2$emit$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DistinctFlowImpl$collect$2<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DistinctFlowImpl$collect$2$emit$1(DistinctFlowImpl$collect$2<? super T> distinctFlowImpl$collect$2, C23349c<? super DistinctFlowImpl$collect$2$emit$1> cVar) {
        super(cVar);
        this.this$0 = distinctFlowImpl$collect$2;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
