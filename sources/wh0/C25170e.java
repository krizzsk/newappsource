package wh0;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import mf0.C24362h;

/* renamed from: wh0.e */
public final class C25170e<T> extends C25153a<T> {

    /* renamed from: d */
    public final Thread f63451d;

    /* renamed from: e */
    public final C25202o0 f63452e;

    public C25170e(CoroutineContext coroutineContext, Thread thread, C25202o0 o0Var) {
        super(coroutineContext, true);
        this.f63451d = thread;
        this.f63452e = o0Var;
    }

    /* renamed from: G */
    public final void mo53227G(Object obj) {
        if (!C24362h.m61206a(Thread.currentThread(), this.f63451d)) {
            LockSupport.unpark(this.f63451d);
        }
    }
}
