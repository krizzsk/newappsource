package com.veriff.sdk.camera.core.impl.utils.futures;

import com.veriff.sdk.camera.core.Logger;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p695od.C18728c;

abstract class ImmediateFuture<V> implements C18728c<V> {

    public static class ImmediateFailedFuture<V> extends ImmediateFuture<V> {
        private final Throwable mCause;

        public ImmediateFailedFuture(Throwable th) {
            this.mCause = th;
        }

        public V get() throws ExecutionException {
            throw new ExecutionException(this.mCause);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.mCause + "]]";
        }
    }

    public static final class ImmediateFailedScheduledFuture<V> extends ImmediateFailedFuture<V> implements ScheduledFuture<V> {
        public ImmediateFailedScheduledFuture(Throwable th) {
            super(th);
        }

        public int compareTo(Delayed delayed) {
            return -1;
        }

        public long getDelay(TimeUnit timeUnit) {
            return 0;
        }
    }

    public static final class ImmediateSuccessfulFuture<V> extends ImmediateFuture<V> {
        public static final ImmediateFuture<Object> NULL_FUTURE = new ImmediateSuccessfulFuture((Object) null);
        private final V mValue;

        public ImmediateSuccessfulFuture(V v) {
            this.mValue = v;
        }

        public V get() {
            return this.mValue;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("[status=SUCCESS, result=[");
            return C16530d.m42015h(sb, this.mValue, "]]");
        }
    }

    public static <V> C18728c<V> nullFuture() {
        return ImmediateSuccessfulFuture.NULL_FUTURE;
    }

    public void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger.m32242e("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public abstract V get() throws ExecutionException;

    public V get(long j, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return get();
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }
}
