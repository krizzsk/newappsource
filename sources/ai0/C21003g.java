package ai0;

import bf0.C21050d;
import ff0.C23349c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import yh0.C25325q;
import zh0.C25523d;

/* renamed from: ai0.g */
public final class C21003g<T> implements C25523d<T> {

    /* renamed from: b */
    public final C25325q<T> f52752b;

    public C21003g(C25325q<? super T> qVar) {
        this.f52752b = qVar;
    }

    public final Object emit(T t, C23349c<? super C21050d> cVar) {
        Object A = this.f52752b.mo60341A(t, cVar);
        if (A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return A;
        }
        return C21050d.f52856a;
    }
}
