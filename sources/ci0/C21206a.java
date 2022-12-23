package ci0;

import bi0.C21067f;
import bi0.C21080r;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.C24199d;
import p584jl.C17886b;

/* renamed from: ci0.a */
public final class C21206a extends C24199d implements Executor {

    /* renamed from: d */
    public static final C21206a f53140d = new C21206a();

    /* renamed from: e */
    public static final C21067f f53141e;

    static {
        C21217l lVar = C21217l.f53156d;
        int i = C21080r.f52895a;
        if (64 >= i) {
            i = 64;
        }
        boolean z = false;
        int o = C17886b.m44488o("kotlinx.coroutines.io.parallelism", i, 0, 0, 12);
        lVar.getClass();
        if (o >= 1) {
            z = true;
        }
        if (z) {
            f53141e = new C21067f(lVar, o);
            return;
        }
        throw new IllegalArgumentException(C16759e.m42349e("Expected positive parallelism level, but got ", o).toString());
    }

    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    public final void execute(Runnable runnable) {
        mo4335k(EmptyCoroutineContext.f60190b, runnable);
    }

    /* renamed from: k */
    public final void mo4335k(CoroutineContext coroutineContext, Runnable runnable) {
        f53141e.mo4335k(coroutineContext, runnable);
    }

    /* renamed from: q */
    public final void mo53205q(CoroutineContext coroutineContext, Runnable runnable) {
        f53141e.mo53205q(coroutineContext, runnable);
    }

    public final String toString() {
        return "Dispatchers.IO";
    }
}
