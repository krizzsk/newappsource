package ff0;

import com.usebutton.sdk.internal.api.AppActionRequest;
import kotlin.coroutines.CoroutineContext;
import lf0.C24240p;
import mf0.C24362h;

/* renamed from: ff0.a */
public abstract class C23347a implements CoroutineContext.C23827a {

    /* renamed from: b */
    public final CoroutineContext.C23829b<?> f59122b;

    public C23347a(CoroutineContext.C23829b<?> bVar) {
        this.f59122b = bVar;
    }

    /* renamed from: C */
    public CoroutineContext mo53079C(CoroutineContext.C23829b<?> bVar) {
        return CoroutineContext.C23827a.C23828a.m58551b(this, bVar);
    }

    /* renamed from: N */
    public final <R> R mo53080N(R r, C24240p<? super R, ? super CoroutineContext.C23827a, ? extends R> pVar) {
        C24362h.m61211f(pVar, "operation");
        return pVar.invoke(r, this);
    }

    /* renamed from: c */
    public <E extends CoroutineContext.C23827a> E mo53081c(CoroutineContext.C23829b<E> bVar) {
        return CoroutineContext.C23827a.C23828a.m58550a(this, bVar);
    }

    public final CoroutineContext.C23829b<?> getKey() {
        return this.f59122b;
    }

    /* renamed from: y */
    public final CoroutineContext mo53082y(CoroutineContext coroutineContext) {
        C24362h.m61211f(coroutineContext, AppActionRequest.KEY_CONTEXT);
        return CoroutineContext.DefaultImpls.m58548a(this, coroutineContext);
    }
}
