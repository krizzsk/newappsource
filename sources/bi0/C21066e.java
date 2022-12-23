package bi0;

import bf0.C21050d;
import ff0.C23349c;
import gf0.C23412b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.ThreadContextKt;
import mf0.C24362h;
import p258t4.C6587a;
import wh0.C25154a0;
import wh0.C25178g0;
import wh0.C25189k;
import wh0.C25192l;
import wh0.C25202o0;
import wh0.C25212r1;
import wh0.C25219u;
import wh0.C25222v;

/* renamed from: bi0.e */
public final class C21066e<T> extends C25178g0<T> implements C23412b, C23349c<T> {

    /* renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f52871i = AtomicReferenceFieldUpdater.newUpdater(C21066e.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* renamed from: e */
    public final CoroutineDispatcher f52872e;

    /* renamed from: f */
    public final C23349c<T> f52873f;

    /* renamed from: g */
    public Object f52874g = C6587a.f20404b;

    /* renamed from: h */
    public final Object f52875h;

    public C21066e(CoroutineDispatcher coroutineDispatcher, C23349c<? super T> cVar) {
        super(-1);
        this.f52872e = coroutineDispatcher;
        this.f52873f = cVar;
        Object N = getContext().mo53080N(0, ThreadContextKt.f61493b);
        C24362h.m61208c(N);
        this.f52875h = N;
        this._reusableCancellableContinuation = null;
    }

    /* renamed from: a */
    public final void mo53193a(Object obj, CancellationException cancellationException) {
        if (obj instanceof C25222v) {
            ((C25222v) obj).f63497b.invoke(cancellationException);
        }
    }

    /* renamed from: c */
    public final C23349c<T> mo53194c() {
        return this;
    }

    public final C23412b getCallerFrame() {
        C23349c<T> cVar = this.f52873f;
        if (cVar instanceof C23412b) {
            return (C23412b) cVar;
        }
        return null;
    }

    public final CoroutineContext getContext() {
        return this.f52873f.getContext();
    }

    /* renamed from: j */
    public final Object mo53196j() {
        Object obj = this.f52874g;
        this.f52874g = C6587a.f20404b;
        return obj;
    }

    /* renamed from: l */
    public final C25192l<T> mo53197l() {
        boolean z;
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = C6587a.f20405c;
                return null;
            } else if (obj instanceof C25192l) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f52871i;
                C21079q qVar = C6587a.f20405c;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, qVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return (C25192l) obj;
                }
            } else if (obj != C6587a.f20405c && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    /* renamed from: n */
    public final boolean mo53198n() {
        return this._reusableCancellableContinuation != null;
    }

    /* renamed from: o */
    public final boolean mo53199o(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C21079q qVar = C6587a.f20405c;
            boolean z = false;
            boolean z2 = true;
            if (C24362h.m61206a(obj, qVar)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f52871i;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, qVar, th)) {
                        if (atomicReferenceFieldUpdater.get(this) != qVar) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f52871i;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, (Object) null)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            z2 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z2) {
                    return false;
                }
            }
        }
    }

    /* renamed from: p */
    public final void mo53200p() {
        C25192l lVar;
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof C25192l) {
            lVar = (C25192l) obj;
        } else {
            lVar = null;
        }
        if (lVar != null) {
            lVar.mo61832p();
        }
    }

    /* renamed from: q */
    public final Throwable mo53201q(C25189k<?> kVar) {
        boolean z;
        do {
            Object obj = this._reusableCancellableContinuation;
            C21079q qVar = C6587a.f20405c;
            z = false;
            if (obj == qVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f52871i;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, qVar, kVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != qVar) {
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else if (obj instanceof Throwable) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f52871i;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, (Object) null)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return (Throwable) obj;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!z);
        return null;
    }

    public final void resumeWith(Object obj) {
        Object obj2;
        CoroutineContext context;
        Object b;
        CoroutineContext context2 = this.f52873f.getContext();
        Throwable a = Result.m58423a(obj);
        if (a == null) {
            obj2 = obj;
        } else {
            obj2 = new C25219u(a, false);
        }
        if (this.f52872e.mo4336x(context2)) {
            this.f52874g = obj2;
            this.f63457d = 0;
            this.f52872e.mo4335k(context2, this);
            return;
        }
        C25202o0 a2 = C25212r1.m63301a();
        if (a2.mo61845K()) {
            this.f52874g = obj2;
            this.f63457d = 0;
            a2.mo61843A(this);
            return;
        }
        a2.mo61844B(true);
        try {
            context = getContext();
            b = ThreadContextKt.m60696b(context, this.f52875h);
            this.f52873f.resumeWith(obj);
            C21050d dVar = C21050d.f52856a;
            ThreadContextKt.m60695a(context, b);
            do {
            } while (a2.mo61846V());
        } catch (Throwable th) {
            try {
                mo61809i(th, (Throwable) null);
            } catch (Throwable th2) {
                a2.mo61847z(true);
                throw th2;
            }
        }
        a2.mo61847z(true);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("DispatchedContinuation[");
        k.append(this.f52872e);
        k.append(", ");
        k.append(C25154a0.m63138c(this.f52873f));
        k.append(']');
        return k.toString();
    }
}
