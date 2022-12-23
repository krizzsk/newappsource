package ai0;

import kotlin.coroutines.CoroutineContext;
import lf0.C24240p;

/* renamed from: ai0.c */
public final class C20999c implements CoroutineContext {

    /* renamed from: b */
    public final Throwable f52747b;

    /* renamed from: c */
    public final /* synthetic */ CoroutineContext f52748c;

    public C20999c(CoroutineContext coroutineContext, Throwable th) {
        this.f52747b = th;
        this.f52748c = coroutineContext;
    }

    /* renamed from: C */
    public final CoroutineContext mo53079C(CoroutineContext.C23829b<?> bVar) {
        return this.f52748c.mo53079C(bVar);
    }

    /* renamed from: N */
    public final <R> R mo53080N(R r, C24240p<? super R, ? super CoroutineContext.C23827a, ? extends R> pVar) {
        return this.f52748c.mo53080N(r, pVar);
    }

    /* renamed from: c */
    public final <E extends CoroutineContext.C23827a> E mo53081c(CoroutineContext.C23829b<E> bVar) {
        return this.f52748c.mo53081c(bVar);
    }

    /* renamed from: y */
    public final CoroutineContext mo53082y(CoroutineContext coroutineContext) {
        return this.f52748c.mo53082y(coroutineContext);
    }
}
