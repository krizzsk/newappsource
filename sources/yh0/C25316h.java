package yh0;

import bf0.C21050d;
import bi0.C21079q;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import lf0.C24236l;
import p583jk.C17875h;

/* renamed from: yh0.h */
public final class C25316h<E> extends AbstractChannel<E> {

    /* renamed from: e */
    public final ReentrantLock f63626e = new ReentrantLock();

    /* renamed from: f */
    public Object f63627f = C17875h.f45863g;

    public C25316h(C24236l<? super E, C21050d> lVar) {
        super(lVar);
    }

    /* renamed from: d */
    public final String mo60345d() {
        ReentrantLock reentrantLock = this.f63626e;
        reentrantLock.lock();
        try {
            return "(value=" + this.f63627f + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: g */
    public final boolean mo60347g() {
        return false;
    }

    /* renamed from: h */
    public final boolean mo60348h() {
        return false;
    }

    /* renamed from: i */
    public final Object mo60349i(E e) {
        C25322n j;
        ReentrantLock reentrantLock = this.f63626e;
        reentrantLock.lock();
        try {
            C25315g<?> e2 = mo60346e();
            if (e2 != null) {
                return e2;
            }
            if (this.f63627f == C17875h.f45863g) {
                do {
                    j = mo60322j();
                    if (j != null) {
                        if (j instanceof C25315g) {
                            reentrantLock.unlock();
                            return j;
                        }
                    }
                } while (j.mo60334a(e) == null);
                C21050d dVar = C21050d.f52856a;
                reentrantLock.unlock();
                j.mo60335e(e);
                return j.mo61907b();
            }
            Object obj = this.f63627f;
            UndeliveredElementException undeliveredElementException = null;
            if (obj != C17875h.f45863g) {
                C24236l<E, C21050d> lVar = this.f61444b;
                if (lVar != null) {
                    undeliveredElementException = OnUndeliveredElementKt.m60694b(lVar, obj, (UndeliveredElementException) null);
                }
            }
            this.f63627f = e;
            if (undeliveredElementException == null) {
                C21079q qVar = C17875h.f45864h;
                reentrantLock.unlock();
                return qVar;
            }
            throw undeliveredElementException;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: l */
    public final boolean mo60323l(C25320l<? super E> lVar) {
        ReentrantLock reentrantLock = this.f63626e;
        reentrantLock.lock();
        try {
            return super.mo60323l(lVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: m */
    public final boolean mo60324m() {
        return false;
    }

    /* renamed from: n */
    public final boolean mo60325n() {
        boolean z;
        ReentrantLock reentrantLock = this.f63626e;
        reentrantLock.lock();
        try {
            if (this.f63627f == C17875h.f45863g) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: p */
    public final void mo60327p(boolean z) {
        ReentrantLock reentrantLock = this.f63626e;
        reentrantLock.lock();
        try {
            C21079q qVar = C17875h.f45863g;
            Object obj = this.f63627f;
            UndeliveredElementException undeliveredElementException = null;
            if (obj != qVar) {
                C24236l<E, C21050d> lVar = this.f61444b;
                if (lVar != null) {
                    undeliveredElementException = OnUndeliveredElementKt.m60694b(lVar, obj, (UndeliveredElementException) null);
                }
            }
            this.f63627f = qVar;
            C21050d dVar = C21050d.f52856a;
            reentrantLock.unlock();
            super.mo60327p(z);
            if (undeliveredElementException != null) {
                throw undeliveredElementException;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: t */
    public final Object mo60329t() {
        ReentrantLock reentrantLock = this.f63626e;
        reentrantLock.lock();
        try {
            Object obj = this.f63627f;
            C21079q qVar = C17875h.f45863g;
            if (obj == qVar) {
                Object e = mo60346e();
                if (e == null) {
                    e = C17875h.f45866j;
                }
                return e;
            }
            this.f63627f = qVar;
            C21050d dVar = C21050d.f52856a;
            reentrantLock.unlock();
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
