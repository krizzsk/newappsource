package com.veriff.sdk.camera.core.impl.utils.futures;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.veriff.sdk.camera.core.impl.utils.executor.CameraXExecutors;
import com.veriff.sdk.camera.core.impl.utils.futures.ImmediateFuture;
import h60.C17327j1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import mf0.C24361g;
import p227r.C6227a;
import p695od.C18728c;

public final class Futures {
    private static final C6227a<?, ?> IDENTITY_FUNCTION = new C6227a<Object, Object>() {
        public Object apply(Object obj) {
            return obj;
        }
    };

    public static final class CallbackListener<V> implements Runnable {
        public final FutureCallback<? super V> mCallback;
        public final Future<V> mFuture;

        public CallbackListener(Future<V> future, FutureCallback<? super V> futureCallback) {
            this.mFuture = future;
            this.mCallback = futureCallback;
        }

        public void run() {
            try {
                this.mCallback.onSuccess(Futures.getDone(this.mFuture));
            } catch (ExecutionException e) {
                this.mCallback.onFailure(e.getCause());
            } catch (Error | RuntimeException e2) {
                this.mCallback.onFailure(e2);
            }
        }

        public String toString() {
            return CallbackListener.class.getSimpleName() + AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR + this.mCallback;
        }
    }

    public static <V> void addCallback(C18728c<V> cVar, FutureCallback<? super V> futureCallback, Executor executor) {
        futureCallback.getClass();
        cVar.addListener(new CallbackListener(cVar, futureCallback), executor);
    }

    public static <V> C18728c<List<V>> allAsList(Collection<? extends C18728c<? extends V>> collection) {
        return new ListFuture(new ArrayList(collection), true, CameraXExecutors.directExecutor());
    }

    public static <V> V getDone(Future<V> future) throws ExecutionException {
        boolean isDone = future.isDone();
        C24361g.m61193w("Future was expected to be done, " + future, isDone);
        return getUninterruptibly(future);
    }

    public static <V> V getUninterruptibly(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    public static <V> C18728c<V> immediateFailedFuture(Throwable th) {
        return new ImmediateFuture.ImmediateFailedFuture(th);
    }

    public static <V> ScheduledFuture<V> immediateFailedScheduledFuture(Throwable th) {
        return new ImmediateFuture.ImmediateFailedScheduledFuture(th);
    }

    public static <V> C18728c<V> immediateFuture(V v) {
        if (v == null) {
            return ImmediateFuture.nullFuture();
        }
        return new ImmediateFuture.ImmediateSuccessfulFuture(v);
    }

    public static <V> C18728c<V> nonCancellationPropagating(C18728c<V> cVar) {
        cVar.getClass();
        if (cVar.isDone()) {
            return cVar;
        }
        return CallbackToFutureAdapter.m1884a(new C17327j1(cVar, 27));
    }

    public static <V> void propagate(C18728c<V> cVar, CallbackToFutureAdapter.C0673a<V> aVar) {
        propagateTransform(cVar, IDENTITY_FUNCTION, aVar, CameraXExecutors.directExecutor());
    }

    /* access modifiers changed from: private */
    public static <I, O> void propagateTransform(boolean z, final C18728c<I> cVar, final C6227a<? super I, ? extends O> aVar, final CallbackToFutureAdapter.C0673a<O> aVar2, Executor executor) {
        cVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        executor.getClass();
        addCallback(cVar, new FutureCallback<I>() {
            public void onFailure(Throwable th) {
                CallbackToFutureAdapter.C0673a.this.mo2698c(th);
            }

            public void onSuccess(I i) {
                try {
                    CallbackToFutureAdapter.C0673a.this.mo2697b(aVar.apply(i));
                } catch (Throwable th) {
                    CallbackToFutureAdapter.C0673a.this.mo2698c(th);
                }
            }
        }, executor);
        if (z) {
            aVar2.mo2696a(new Runnable() {
                public void run() {
                    C18728c.this.cancel(true);
                }
            }, CameraXExecutors.directExecutor());
        }
    }

    public static <V> C18728c<List<V>> successfulAsList(Collection<? extends C18728c<? extends V>> collection) {
        return new ListFuture(new ArrayList(collection), false, CameraXExecutors.directExecutor());
    }

    public static <I, O> C18728c<O> transform(C18728c<I> cVar, final C6227a<? super I, ? extends O> aVar, Executor executor) {
        aVar.getClass();
        return transformAsync(cVar, new AsyncFunction<I, O>() {
            public C18728c<O> apply(I i) {
                return Futures.immediateFuture(C6227a.this.apply(i));
            }
        }, executor);
    }

    public static <I, O> C18728c<O> transformAsync(C18728c<I> cVar, AsyncFunction<? super I, ? extends O> asyncFunction, Executor executor) {
        ChainingListenableFuture chainingListenableFuture = new ChainingListenableFuture(asyncFunction, cVar);
        cVar.addListener(chainingListenableFuture, executor);
        return chainingListenableFuture;
    }

    public static <I, O> void propagateTransform(C18728c<I> cVar, C6227a<? super I, ? extends O> aVar, CallbackToFutureAdapter.C0673a<O> aVar2, Executor executor) {
        propagateTransform(true, cVar, aVar, aVar2, executor);
    }
}
