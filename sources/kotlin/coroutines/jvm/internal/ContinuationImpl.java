package kotlin.coroutines.jvm.internal;

import ff0.C23349c;
import ff0.C23350d;
import gf0.C23411a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010B\u001b\b\u0016\u0012\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0011J\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0014R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u0014\u0010\r\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, mo59060d2 = {"Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lff0/c;", "", "intercepted", "Lbf0/d;", "releaseIntercepted", "Lkotlin/coroutines/CoroutineContext;", "_context", "Lkotlin/coroutines/CoroutineContext;", "Lff0/c;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "completion", "<init>", "(Lff0/c;Lkotlin/coroutines/CoroutineContext;)V", "(Lff0/c;)V", "kotlin-stdlib"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public abstract class ContinuationImpl extends BaseContinuationImpl {
    private final CoroutineContext _context;
    private transient C23349c<Object> intercepted;

    public ContinuationImpl(C23349c<Object> cVar, CoroutineContext coroutineContext) {
        super(cVar);
        this._context = coroutineContext;
    }

    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        C24362h.m61208c(coroutineContext);
        return coroutineContext;
    }

    public final C23349c<Object> intercepted() {
        C23349c<Object> cVar = this.intercepted;
        if (cVar == null) {
            C23350d dVar = (C23350d) getContext().mo53081c(C23350d.C23351a.f59126b);
            if (dVar == null || (cVar = dVar.mo58473o(this)) == null) {
                cVar = this;
            }
            this.intercepted = cVar;
        }
        return cVar;
    }

    public void releaseIntercepted() {
        C23349c<Object> cVar = this.intercepted;
        if (!(cVar == null || cVar == this)) {
            CoroutineContext context = getContext();
            int i = C23350d.f59125d0;
            CoroutineContext.C23827a c = context.mo53081c(C23350d.C23351a.f59126b);
            C24362h.m61208c(c);
            ((C23350d) c).mo58472R(cVar);
        }
        this.intercepted = C23411a.f59194b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ContinuationImpl(C23349c<Object> cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
