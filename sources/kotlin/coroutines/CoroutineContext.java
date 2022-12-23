package kotlin.coroutines;

import com.usebutton.sdk.internal.api.AppActionRequest;
import lf0.C24240p;
import mf0.C24362h;

public interface CoroutineContext {

    public static final class DefaultImpls {
        /* renamed from: a */
        public static CoroutineContext m58548a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
            C24362h.m61211f(coroutineContext2, AppActionRequest.KEY_CONTEXT);
            if (coroutineContext2 == EmptyCoroutineContext.f60190b) {
                return coroutineContext;
            }
            return (CoroutineContext) coroutineContext2.mo53080N(coroutineContext, CoroutineContext$plus$1.f60189f);
        }
    }

    /* renamed from: kotlin.coroutines.CoroutineContext$a */
    public interface C23827a extends CoroutineContext {

        /* renamed from: kotlin.coroutines.CoroutineContext$a$a */
        public static final class C23828a {
            /* renamed from: a */
            public static <E extends C23827a> E m58550a(C23827a aVar, C23829b<E> bVar) {
                C24362h.m61211f(bVar, LinksConfiguration.KEY_KEY);
                if (C24362h.m61206a(aVar.getKey(), bVar)) {
                    return aVar;
                }
                return null;
            }

            /* renamed from: b */
            public static CoroutineContext m58551b(C23827a aVar, C23829b<?> bVar) {
                C24362h.m61211f(bVar, LinksConfiguration.KEY_KEY);
                return C24362h.m61206a(aVar.getKey(), bVar) ? EmptyCoroutineContext.f60190b : aVar;
            }
        }

        /* renamed from: c */
        <E extends C23827a> E mo53081c(C23829b<E> bVar);

        C23829b<?> getKey();
    }

    /* renamed from: kotlin.coroutines.CoroutineContext$b */
    public interface C23829b<E extends C23827a> {
    }

    /* renamed from: C */
    CoroutineContext mo53079C(C23829b<?> bVar);

    /* renamed from: N */
    <R> R mo53080N(R r, C24240p<? super R, ? super C23827a, ? extends R> pVar);

    /* renamed from: c */
    <E extends C23827a> E mo53081c(C23829b<E> bVar);

    /* renamed from: y */
    CoroutineContext mo53082y(CoroutineContext coroutineContext);
}
