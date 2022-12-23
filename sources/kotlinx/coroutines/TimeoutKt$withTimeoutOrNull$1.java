package kotlinx.coroutines;

import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import lf0.C24240p;

@C23413c(mo58554c = "kotlinx.coroutines.TimeoutKt", mo58555f = "Timeout.kt", mo58556l = {100}, mo58557m = "withTimeoutOrNull")
@Metadata(mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class TimeoutKt$withTimeoutOrNull$1<T> extends ContinuationImpl {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public TimeoutKt$withTimeoutOrNull$1(C23349c<? super TimeoutKt$withTimeoutOrNull$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TimeoutKt.m60598b(0, (C24240p) null, this);
    }
}
