package kotlin.coroutines;

import ff0.C23350d;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import lf0.C24240p;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"Lkotlin/coroutines/CoroutineContext;", "acc", "Lkotlin/coroutines/CoroutineContext$a;", "element", "invoke", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$a;)Lkotlin/coroutines/CoroutineContext;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class CoroutineContext$plus$1 extends Lambda implements C24240p<CoroutineContext, CoroutineContext.C23827a, CoroutineContext> {

    /* renamed from: f */
    public static final CoroutineContext$plus$1 f60189f = new CoroutineContext$plus$1();

    public CoroutineContext$plus$1() {
        super(2);
    }

    public final Object invoke(Object obj, Object obj2) {
        CombinedContext combinedContext;
        CoroutineContext coroutineContext = (CoroutineContext) obj;
        CoroutineContext.C23827a aVar = (CoroutineContext.C23827a) obj2;
        C24362h.m61211f(coroutineContext, "acc");
        C24362h.m61211f(aVar, "element");
        CoroutineContext C = coroutineContext.mo53079C(aVar.getKey());
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f60190b;
        if (C == emptyCoroutineContext) {
            return aVar;
        }
        int i = C23350d.f59125d0;
        C23350d.C23351a aVar2 = C23350d.C23351a.f59126b;
        C23350d dVar = (C23350d) C.mo53081c(aVar2);
        if (dVar == null) {
            combinedContext = new CombinedContext(aVar, C);
        } else {
            CoroutineContext C2 = C.mo53079C(aVar2);
            if (C2 == emptyCoroutineContext) {
                return new CombinedContext(dVar, aVar);
            }
            combinedContext = new CombinedContext(dVar, new CombinedContext(aVar, C2));
        }
        return combinedContext;
    }
}
