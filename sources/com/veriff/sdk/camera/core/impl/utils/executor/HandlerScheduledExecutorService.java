package com.veriff.sdk.camera.core.impl.utils.executor;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.core.impl.utils.futures.Futures;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p695od.C18728c;

final class HandlerScheduledExecutorService extends AbstractExecutorService implements ScheduledExecutorService {
    private final Handler mHandler;

    public static class HandlerScheduledFuture<V> implements RunnableScheduledFuture<V> {
        public final AtomicReference<CallbackToFutureAdapter.C0673a<V>> mCompleter = new AtomicReference<>((Object) null);
        private final C18728c<V> mDelegate;
        private final long mRunAtMillis;
        private final Callable<V> mTask;

        public HandlerScheduledFuture(final Handler handler, long j, final Callable<V> callable) {
            this.mRunAtMillis = j;
            this.mTask = callable;
            this.mDelegate = CallbackToFutureAdapter.m1884a(new CallbackToFutureAdapter.C0674b<V>() {
                public Object attachCompleter(CallbackToFutureAdapter.C0673a<V> aVar) throws RejectedExecutionException {
                    aVar.mo2696a(new Runnable() {
                        public void run() {
                            if (HandlerScheduledFuture.this.mCompleter.getAndSet((Object) null) != null) {
                                C125431 r0 = C125431.this;
                                handler.removeCallbacks(HandlerScheduledFuture.this);
                            }
                        }
                    }, CameraXExecutors.directExecutor());
                    HandlerScheduledFuture.this.mCompleter.set(aVar);
                    return "HandlerScheduledFuture-" + callable.toString();
                }
            });
        }

        public boolean cancel(boolean z) {
            return this.mDelegate.cancel(z);
        }

        public V get() throws ExecutionException, InterruptedException {
            return this.mDelegate.get();
        }

        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.mRunAtMillis - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        public boolean isCancelled() {
            return this.mDelegate.isCancelled();
        }

        public boolean isDone() {
            return this.mDelegate.isDone();
        }

        public boolean isPeriodic() {
            return false;
        }

        public void run() {
            CallbackToFutureAdapter.C0673a andSet = this.mCompleter.getAndSet((Object) null);
            if (andSet != null) {
                try {
                    andSet.mo2697b(this.mTask.call());
                } catch (Exception e) {
                    andSet.mo2698c(e);
                }
            }
        }

        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        public V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.mDelegate.get(j, timeUnit);
        }
    }

    static {
        new ThreadLocal<ScheduledExecutorService>() {
            public ScheduledExecutorService initialValue() {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return CameraXExecutors.mainThreadExecutor();
                }
                if (Looper.myLooper() != null) {
                    return new HandlerScheduledExecutorService(new Handler(Looper.myLooper()));
                }
                return null;
            }
        };
    }

    public HandlerScheduledExecutorService(Handler handler) {
        this.mHandler = handler;
    }

    private RejectedExecutionException createPostFailedException() {
        return new RejectedExecutionException(this.mHandler + " is shutting down");
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        Class<HandlerScheduledExecutorService> cls = HandlerScheduledExecutorService.class;
        throw new UnsupportedOperationException("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    public void execute(Runnable runnable) {
        if (!this.mHandler.post(runnable)) {
            throw createPostFailedException();
        }
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public ScheduledFuture<?> schedule(final Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(new Callable<Void>(this) {
            public Void call() {
                runnable.run();
                return null;
            }
        }, j, timeUnit);
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Class<HandlerScheduledExecutorService> cls = HandlerScheduledExecutorService.class;
        throw new UnsupportedOperationException("HandlerScheduledExecutorService does not yet support fixed-rate scheduling.");
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Class<HandlerScheduledExecutorService> cls = HandlerScheduledExecutorService.class;
        throw new UnsupportedOperationException("HandlerScheduledExecutorService does not yet support fixed-delay scheduling.");
    }

    public void shutdown() {
        Class<HandlerScheduledExecutorService> cls = HandlerScheduledExecutorService.class;
        throw new UnsupportedOperationException("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    public List<Runnable> shutdownNow() {
        Class<HandlerScheduledExecutorService> cls = HandlerScheduledExecutorService.class;
        throw new UnsupportedOperationException("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        long convert = TimeUnit.MILLISECONDS.convert(j, timeUnit) + SystemClock.uptimeMillis();
        HandlerScheduledFuture handlerScheduledFuture = new HandlerScheduledFuture(this.mHandler, convert, callable);
        if (this.mHandler.postAtTime(handlerScheduledFuture, convert)) {
            return handlerScheduledFuture;
        }
        return Futures.immediateFailedScheduledFuture(createPostFailedException());
    }
}
