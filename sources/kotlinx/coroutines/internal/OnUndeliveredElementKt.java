package kotlinx.coroutines.internal;

import bf0.C21050d;
import kotlin.coroutines.CoroutineContext;
import lf0.C24236l;
import p626lf.C18201b;

public final class OnUndeliveredElementKt {
    /* renamed from: a */
    public static final <E> C24236l<Throwable, C21050d> m60693a(C24236l<? super E, C21050d> lVar, E e, CoroutineContext coroutineContext) {
        return new OnUndeliveredElementKt$bindCancellationFun$1(lVar, e, coroutineContext);
    }

    /* renamed from: b */
    public static final <E> UndeliveredElementException m60694b(C24236l<? super E, C21050d> lVar, E e, UndeliveredElementException undeliveredElementException) {
        try {
            lVar.invoke(e);
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException("Exception in undelivered element handler for " + e, th);
            }
            C18201b.m44913j(undeliveredElementException, th);
        }
        return undeliveredElementException;
    }
}
