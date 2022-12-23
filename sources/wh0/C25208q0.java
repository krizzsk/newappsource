package wh0;

import bi0.C21064c;
import com.google.android.play.core.assetpacks.C14330w;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C24184b;
import kotlinx.coroutines.C24199d;
import mf0.C24361g;

/* renamed from: wh0.q0 */
public final class C25208q0 extends C24199d implements C25171e0 {

    /* renamed from: d */
    public final Executor f63481d;

    public C25208q0(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        this.f63481d = executor;
        Method method = C21064c.f52869a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null) {
                Method method2 = C21064c.f52869a;
                if (method2 != null) {
                    method2.invoke(scheduledThreadPoolExecutor, new Object[]{Boolean.TRUE});
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f63481d;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C25208q0) || ((C25208q0) obj).f63481d != this.f63481d) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void mo53203f(long j, C25192l lVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f63481d;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            C14330w wVar = new C14330w(2, this, lVar);
            CoroutineContext coroutineContext = lVar.f63467f;
            try {
                scheduledFuture = scheduledExecutorService.schedule(wVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                C24361g.m61172l(coroutineContext, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            lVar.mo61821f(new C25180h(scheduledFuture));
        } else {
            C24184b.f61423j.mo53203f(j, lVar);
        }
    }

    /* renamed from: g */
    public final C25190k0 mo53204g(long j, Runnable runnable, CoroutineContext coroutineContext) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f63481d;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                C24361g.m61172l(coroutineContext, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            return new C25187j0(scheduledFuture);
        }
        return C24184b.f61423j.mo53204g(j, runnable, coroutineContext);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f63481d);
    }

    /* renamed from: k */
    public final void mo4335k(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.f63481d.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            C24361g.m61172l(coroutineContext, cancellationException);
            C25184i0.f63460b.mo4335k(coroutineContext, runnable);
        }
    }

    public final String toString() {
        return this.f63481d.toString();
    }
}
