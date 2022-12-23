package kotlinx.coroutines.channels;

import bf0.C21050d;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import lf0.C24225a;
import yh0.C25319k;

@C23413c(mo58554c = "kotlinx.coroutines.channels.ProduceKt", mo58555f = "Produce.kt", mo58556l = {153}, mo58557m = "awaitClose")
@Metadata(mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class ProduceKt$awaitClose$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public ProduceKt$awaitClose$1(C23349c<? super ProduceKt$awaitClose$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ProduceKt.m60647a((C25319k<?>) null, (C24225a<C21050d>) null, this);
    }
}
