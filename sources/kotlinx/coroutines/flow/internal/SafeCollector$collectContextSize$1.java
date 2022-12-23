package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import lf0.C24240p;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo59060d2 = {"T", "", "count", "Lkotlin/coroutines/CoroutineContext$a;", "<anonymous parameter 1>", "invoke", "(ILkotlin/coroutines/CoroutineContext$a;)Ljava/lang/Integer;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
public final class SafeCollector$collectContextSize$1 extends Lambda implements C24240p<Integer, CoroutineContext.C23827a, Integer> {

    /* renamed from: f */
    public static final SafeCollector$collectContextSize$1 f61481f = new SafeCollector$collectContextSize$1();

    public SafeCollector$collectContextSize$1() {
        super(2);
    }

    public final Object invoke(Object obj, Object obj2) {
        CoroutineContext.C23827a aVar = (CoroutineContext.C23827a) obj2;
        return Integer.valueOf(((Number) obj).intValue() + 1);
    }
}
