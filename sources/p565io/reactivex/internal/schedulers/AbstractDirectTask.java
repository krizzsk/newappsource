package p565io.reactivex.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import le0.C24224b;
import oe0.C24577a;

/* renamed from: io.reactivex.internal.schedulers.AbstractDirectTask */
abstract class AbstractDirectTask extends AtomicReference<Future<?>> implements C24224b {

    /* renamed from: b */
    public static final FutureTask<Void> f59891b;

    /* renamed from: c */
    public static final FutureTask<Void> f59892c;
    private static final long serialVersionUID = 1811839108042568751L;
    public final Runnable runnable;
    public Thread runner;

    static {
        C24577a.C24582e eVar = C24577a.f62308a;
        f59891b = new FutureTask<>(eVar, (Object) null);
        f59892c = new FutureTask<>(eVar, (Object) null);
    }

    public AbstractDirectTask(Runnable runnable2) {
        this.runnable = runnable2;
    }

    /* renamed from: a */
    public final void mo58921a(Future<?> future) {
        Future future2;
        boolean z;
        do {
            future2 = (Future) get();
            if (future2 != f59891b) {
                if (future2 == f59892c) {
                    if (this.runner != Thread.currentThread()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    future.cancel(z);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    public final void dispose() {
        FutureTask<Void> futureTask;
        boolean z;
        Future future = (Future) get();
        if (future != f59891b && future != (futureTask = f59892c) && compareAndSet(future, futureTask) && future != null) {
            if (this.runner != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            future.cancel(z);
        }
    }
}
