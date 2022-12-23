package ci0;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C24199d;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* renamed from: ci0.e */
public class C21210e extends C24199d {

    /* renamed from: d */
    public CoroutineScheduler f53144d;

    public C21210e(int i, int i2, long j) {
        this.f53144d = new CoroutineScheduler(i, i2, "DefaultDispatcher", j);
    }

    /* renamed from: k */
    public final void mo4335k(CoroutineContext coroutineContext, Runnable runnable) {
        CoroutineScheduler coroutineScheduler = this.f53144d;
        AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.f61499i;
        coroutineScheduler.mo60378f(runnable, C21216k.f53154f, false);
    }

    /* renamed from: q */
    public final void mo53205q(CoroutineContext coroutineContext, Runnable runnable) {
        CoroutineScheduler coroutineScheduler = this.f53144d;
        AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.f61499i;
        coroutineScheduler.mo60378f(runnable, C21216k.f53154f, true);
    }
}
