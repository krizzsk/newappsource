package kotlin.coroutines.jvm.internal;

import ff0.C23349c;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "kotlin-stdlib"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public abstract class RestrictedContinuationImpl extends BaseContinuationImpl {
    public RestrictedContinuationImpl(C23349c<Object> cVar) {
        super(cVar);
        boolean z;
        if (cVar != null) {
            if (cVar.getContext() == EmptyCoroutineContext.f60190b) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    public final CoroutineContext getContext() {
        return EmptyCoroutineContext.f60190b;
    }
}
