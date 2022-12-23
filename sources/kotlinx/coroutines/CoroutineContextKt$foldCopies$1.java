package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import lf0.C24240p;
import wh0.C25228x;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"Lkotlin/coroutines/CoroutineContext;", "result", "Lkotlin/coroutines/CoroutineContext$a;", "element", "invoke", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$a;)Lkotlin/coroutines/CoroutineContext;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
public final class CoroutineContextKt$foldCopies$1 extends Lambda implements C24240p<CoroutineContext, CoroutineContext.C23827a, CoroutineContext> {

    /* renamed from: f */
    public static final CoroutineContextKt$foldCopies$1 f61410f = new CoroutineContextKt$foldCopies$1();

    public CoroutineContextKt$foldCopies$1() {
        super(2);
    }

    public final Object invoke(Object obj, Object obj2) {
        CoroutineContext coroutineContext = (CoroutineContext) obj;
        CoroutineContext.C23827a aVar = (CoroutineContext.C23827a) obj2;
        if (aVar instanceof C25228x) {
            return coroutineContext.mo53082y(((C25228x) aVar).mo61866r());
        }
        return coroutineContext.mo53082y(aVar);
    }
}
