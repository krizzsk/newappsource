package com.veriff.sdk.camera.core.impl.utils.futures;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import mf0.C24361g;
import p227r.C6227a;
import p695od.C18728c;

public class FutureChain<V> implements C18728c<V> {
    public CallbackToFutureAdapter.C0673a<V> mCompleter;
    private final C18728c<V> mDelegate;

    public FutureChain(C18728c<V> cVar) {
        cVar.getClass();
        this.mDelegate = cVar;
    }

    public static <V> FutureChain<V> from(C18728c<V> cVar) {
        if (cVar instanceof FutureChain) {
            return (FutureChain) cVar;
        }
        return new FutureChain<>(cVar);
    }

    public void addListener(Runnable runnable, Executor executor) {
        this.mDelegate.addListener(runnable, executor);
    }

    public boolean cancel(boolean z) {
        return this.mDelegate.cancel(z);
    }

    public V get() throws InterruptedException, ExecutionException {
        return this.mDelegate.get();
    }

    public boolean isCancelled() {
        return this.mDelegate.isCancelled();
    }

    public boolean isDone() {
        return this.mDelegate.isDone();
    }

    /* access modifiers changed from: package-private */
    public boolean set(V v) {
        CallbackToFutureAdapter.C0673a<V> aVar = this.mCompleter;
        if (aVar != null) {
            return aVar.mo2697b(v);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean setException(Throwable th) {
        CallbackToFutureAdapter.C0673a<V> aVar = this.mCompleter;
        if (aVar != null) {
            return aVar.mo2698c(th);
        }
        return false;
    }

    public final <T> FutureChain<T> transform(C6227a<? super V, T> aVar, Executor executor) {
        return (FutureChain) Futures.transform(this, aVar, executor);
    }

    public final <T> FutureChain<T> transformAsync(AsyncFunction<? super V, T> asyncFunction, Executor executor) {
        return (FutureChain) Futures.transformAsync(this, asyncFunction, executor);
    }

    public V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.mDelegate.get(j, timeUnit);
    }

    public FutureChain() {
        this.mDelegate = CallbackToFutureAdapter.m1884a(new CallbackToFutureAdapter.C0674b<V>() {
            public Object attachCompleter(CallbackToFutureAdapter.C0673a<V> aVar) {
                boolean z;
                if (FutureChain.this.mCompleter == null) {
                    z = true;
                } else {
                    z = false;
                }
                C24361g.m61193w("The result can only set once!", z);
                FutureChain.this.mCompleter = aVar;
                StringBuilder k = C13555b.m33972k("FutureChain[");
                k.append(FutureChain.this);
                k.append("]");
                return k.toString();
            }
        });
    }
}
