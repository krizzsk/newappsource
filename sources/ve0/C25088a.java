package ve0;

import java.util.concurrent.Callable;
import je0.C23712e;
import p565io.reactivex.exceptions.CompositeException;
import p565io.reactivex.exceptions.OnErrorNotImplementedException;
import p565io.reactivex.exceptions.UndeliverableException;
import p565io.reactivex.internal.util.ExceptionHelper;

/* renamed from: ve0.a */
public final class C25088a {
    /* renamed from: a */
    public static C23712e m62856a(Callable<C23712e> callable) {
        try {
            C23712e call = callable.call();
            if (call != null) {
                return call;
            }
            throw new NullPointerException("Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw ExceptionHelper.m58212a(th);
        }
    }

    /* renamed from: b */
    public static void m62857b(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else {
            boolean z = true;
            if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
                z = false;
            }
            if (!z) {
                th = new UndeliverableException(th);
            }
        }
        th.printStackTrace();
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    /* renamed from: c */
    public static void m62858c(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("run is null");
        }
    }
}
