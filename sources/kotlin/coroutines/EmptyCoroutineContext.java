package kotlin.coroutines;

import com.usebutton.sdk.internal.api.AppActionRequest;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import lf0.C24240p;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo59060d2 = {"Lkotlin/coroutines/EmptyCoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "", "serialVersionUID", "J", "<init>", "()V", "kotlin-stdlib"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class EmptyCoroutineContext implements CoroutineContext, Serializable {

    /* renamed from: b */
    public static final EmptyCoroutineContext f60190b = new EmptyCoroutineContext();
    private static final long serialVersionUID = 0;

    private EmptyCoroutineContext() {
    }

    private final Object readResolve() {
        return f60190b;
    }

    /* renamed from: C */
    public final CoroutineContext mo53079C(CoroutineContext.C23829b<?> bVar) {
        C24362h.m61211f(bVar, LinksConfiguration.KEY_KEY);
        return this;
    }

    /* renamed from: N */
    public final <R> R mo53080N(R r, C24240p<? super R, ? super CoroutineContext.C23827a, ? extends R> pVar) {
        C24362h.m61211f(pVar, "operation");
        return r;
    }

    /* renamed from: c */
    public final <E extends CoroutineContext.C23827a> E mo53081c(CoroutineContext.C23829b<E> bVar) {
        C24362h.m61211f(bVar, LinksConfiguration.KEY_KEY);
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    /* renamed from: y */
    public final CoroutineContext mo53082y(CoroutineContext coroutineContext) {
        C24362h.m61211f(coroutineContext, AppActionRequest.KEY_CONTEXT);
        return coroutineContext;
    }
}
