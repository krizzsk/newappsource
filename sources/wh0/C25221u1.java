package wh0;

import com.usebutton.sdk.internal.api.AppActionRequest;
import kotlin.coroutines.CoroutineContext;
import lf0.C24240p;
import mf0.C24362h;

/* renamed from: wh0.u1 */
public final class C25221u1 implements CoroutineContext.C23827a, CoroutineContext.C23829b<C25221u1> {

    /* renamed from: b */
    public static final C25221u1 f63495b = new C25221u1();

    /* renamed from: C */
    public final CoroutineContext mo53079C(CoroutineContext.C23829b<?> bVar) {
        return CoroutineContext.C23827a.C23828a.m58551b(this, bVar);
    }

    /* renamed from: N */
    public final <R> R mo53080N(R r, C24240p<? super R, ? super CoroutineContext.C23827a, ? extends R> pVar) {
        C24362h.m61211f(pVar, "operation");
        return pVar.invoke(r, this);
    }

    /* renamed from: c */
    public final <E extends CoroutineContext.C23827a> E mo53081c(CoroutineContext.C23829b<E> bVar) {
        return CoroutineContext.C23827a.C23828a.m58550a(this, bVar);
    }

    public final CoroutineContext.C23829b<?> getKey() {
        return this;
    }

    /* renamed from: y */
    public final CoroutineContext mo53082y(CoroutineContext coroutineContext) {
        C24362h.m61211f(coroutineContext, AppActionRequest.KEY_CONTEXT);
        return CoroutineContext.DefaultImpls.m58548a(this, coroutineContext);
    }
}
