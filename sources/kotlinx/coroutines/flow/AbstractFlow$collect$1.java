package kotlinx.coroutines.flow;

import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import zh0.C25523d;

@C23413c(mo58554c = "kotlinx.coroutines.flow.AbstractFlow", mo58555f = "Flow.kt", mo58556l = {230}, mo58557m = "collect")
@Metadata(mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class AbstractFlow$collect$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AbstractFlow<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractFlow$collect$1(AbstractFlow<T> abstractFlow, C23349c<? super AbstractFlow$collect$1> cVar) {
        super(cVar);
        this.this$0 = abstractFlow;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect((C25523d) null, this);
    }
}
