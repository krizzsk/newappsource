package yh0;

import bf0.C21050d;
import ff0.C23349c;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.channels.AbstractChannel;
import lf0.C24236l;
import p906wz.C20436g;
import wh0.C25153a;
import wh0.C25163c1;
import wh0.C25219u;

/* renamed from: yh0.d */
public class C25310d<E> extends C25153a<C21050d> implements C25308c<E> {

    /* renamed from: d */
    public final C25308c<E> f63621d;

    public C25310d(CoroutineContext coroutineContext, AbstractChannel abstractChannel) {
        super(coroutineContext, true);
        this.f63621d = abstractChannel;
    }

    /* renamed from: A */
    public final Object mo60341A(E e, C23349c<? super C21050d> cVar) {
        return this.f63621d.mo60341A(e, cVar);
    }

    /* renamed from: B */
    public final Object mo60318B() {
        return this.f63621d.mo60318B();
    }

    /* renamed from: D */
    public final Object mo60319D(C23349c<? super C25312f<? extends E>> cVar) {
        Object D = this.f63621d.mo60319D(cVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return D;
    }

    /* renamed from: E */
    public final boolean mo60342E(Throwable th) {
        return this.f63621d.mo60342E(th);
    }

    /* renamed from: F */
    public final boolean mo60343F() {
        return this.f63621d.mo60343F();
    }

    /* renamed from: L */
    public final void mo61767L(CancellationException cancellationException) {
        this.f63621d.mo60320a(cancellationException);
        mo61766J(cancellationException);
    }

    /* renamed from: a */
    public final void mo61776a(CancellationException cancellationException) {
        boolean z;
        Object d0 = mo61779d0();
        if ((d0 instanceof C25219u) || ((d0 instanceof C25163c1.C25166c) && ((C25163c1.C25166c) d0).mo61800c())) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (cancellationException == null) {
                cancellationException = new JobCancellationException(mo61746P(), (Throwable) null, this);
            }
            mo61767L(cancellationException);
        }
    }

    public final C25311e<E> iterator() {
        return this.f63621d.iterator();
    }

    /* renamed from: s */
    public final Object mo60351s(C20436g gVar) {
        return this.f63621d.mo60351s(gVar);
    }

    /* renamed from: u */
    public final void mo60353u(C24236l<? super Throwable, C21050d> lVar) {
        this.f63621d.mo60353u(lVar);
    }

    /* renamed from: x */
    public final Object mo60331x(ContinuationImpl continuationImpl) {
        return this.f63621d.mo60331x(continuationImpl);
    }
}
