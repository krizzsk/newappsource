package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"Lkotlin/coroutines/CoroutineContext$a;", "it", "Lkotlinx/coroutines/d;", "invoke", "(Lkotlin/coroutines/CoroutineContext$a;)Lkotlinx/coroutines/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
final class ExecutorCoroutineDispatcher$Key$1 extends Lambda implements C24236l<CoroutineContext.C23827a, C24199d> {

    /* renamed from: f */
    public static final ExecutorCoroutineDispatcher$Key$1 f61415f = new ExecutorCoroutineDispatcher$Key$1();

    public ExecutorCoroutineDispatcher$Key$1() {
        super(1);
    }

    public final Object invoke(Object obj) {
        CoroutineContext.C23827a aVar = (CoroutineContext.C23827a) obj;
        if (aVar instanceof C24199d) {
            return (C24199d) aVar;
        }
        return null;
    }
}
