package kotlinx.coroutines.internal;

import bi0.C21079q;
import bi0.C21083u;
import kotlin.coroutines.CoroutineContext;
import lf0.C24240p;
import mf0.C24362h;
import wh0.C25209q1;

public final class ThreadContextKt {

    /* renamed from: a */
    public static final C21079q f61492a = new C21079q("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    public static final C24240p<Object, CoroutineContext.C23827a, Object> f61493b = ThreadContextKt$countAll$1.f61496f;

    /* renamed from: c */
    public static final C24240p<C25209q1<?>, CoroutineContext.C23827a, C25209q1<?>> f61494c = ThreadContextKt$findOne$1.f61497f;

    /* renamed from: d */
    public static final C24240p<C21083u, CoroutineContext.C23827a, C21083u> f61495d = ThreadContextKt$updateState$1.f61498f;

    /* renamed from: a */
    public static final void m60695a(CoroutineContext coroutineContext, Object obj) {
        if (obj != f61492a) {
            if (obj instanceof C21083u) {
                C21083u uVar = (C21083u) obj;
                int length = uVar.f52899c.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i = length - 1;
                        C25209q1<Object> q1Var = uVar.f52899c[length];
                        C24362h.m61208c(q1Var);
                        q1Var.mo61852n(uVar.f52898b[length]);
                        if (i >= 0) {
                            length = i;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                Object N = coroutineContext.mo53080N(null, f61494c);
                if (N != null) {
                    ((C25209q1) N).mo61852n(obj);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            }
        }
    }

    /* renamed from: b */
    public static final Object m60696b(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = coroutineContext.mo53080N(0, f61493b);
            C24362h.m61208c(obj);
        }
        if (obj == 0) {
            return f61492a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.mo53080N(new C21083u(coroutineContext, ((Number) obj).intValue()), f61495d);
        }
        return ((C25209q1) obj).mo61851S(coroutineContext);
    }
}
