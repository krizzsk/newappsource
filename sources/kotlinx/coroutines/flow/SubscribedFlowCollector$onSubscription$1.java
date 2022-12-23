package kotlinx.coroutines.flow;

import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@C23413c(mo58554c = "kotlinx.coroutines.flow.SubscribedFlowCollector", mo58555f = "Share.kt", mo58556l = {419, 423}, mo58557m = "onSubscription")
@Metadata(mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
final class SubscribedFlowCollector$onSubscription$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C24209e<Object> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubscribedFlowCollector$onSubscription$1(C24209e<Object> eVar, C23349c<? super SubscribedFlowCollector$onSubscription$1> cVar) {
        super(cVar);
        this.this$0 = eVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo60360a(this);
    }
}
