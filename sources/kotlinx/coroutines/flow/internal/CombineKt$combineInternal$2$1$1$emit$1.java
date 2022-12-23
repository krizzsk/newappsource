package kotlinx.coroutines.flow.internal;

import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2;

@C23413c(mo58554c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", mo58555f = "Combine.kt", mo58556l = {35, 36}, mo58557m = "emit")
@Metadata(mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class CombineKt$combineInternal$2$1$1$emit$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CombineKt$combineInternal$2.C242101.C242111<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombineKt$combineInternal$2$1$1$emit$1(CombineKt$combineInternal$2.C242101.C242111<? super T> r1, C23349c<? super CombineKt$combineInternal$2$1$1$emit$1> cVar) {
        super(cVar);
        this.this$0 = r1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
