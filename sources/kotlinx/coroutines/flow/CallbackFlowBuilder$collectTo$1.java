package kotlinx.coroutines.flow;

import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yh0.C25319k;

@C23413c(mo58554c = "kotlinx.coroutines.flow.CallbackFlowBuilder", mo58555f = "Builders.kt", mo58556l = {336}, mo58557m = "collectTo")
@Metadata(mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class CallbackFlowBuilder$collectTo$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CallbackFlowBuilder<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallbackFlowBuilder$collectTo$1(CallbackFlowBuilder<T> callbackFlowBuilder, C23349c<? super CallbackFlowBuilder$collectTo$1> cVar) {
        super(cVar);
        this.this$0 = callbackFlowBuilder;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo60358b((C25319k) null, this);
    }
}
