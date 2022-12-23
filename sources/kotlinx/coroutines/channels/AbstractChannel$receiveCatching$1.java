package kotlinx.coroutines.channels;

import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yh0.C25312f;

@C23413c(mo58554c = "kotlinx.coroutines.channels.AbstractChannel", mo58555f = "AbstractChannel.kt", mo58556l = {633}, mo58557m = "receiveCatching-JP2dKIU")
@Metadata(mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class AbstractChannel$receiveCatching$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AbstractChannel<E> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractChannel$receiveCatching$1(AbstractChannel<E> abstractChannel, C23349c<? super AbstractChannel$receiveCatching$1> cVar) {
        super(cVar);
        this.this$0 = abstractChannel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object D = this.this$0.mo60319D(this);
        if (D == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return D;
        }
        return new C25312f(D);
    }
}
