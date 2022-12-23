package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* renamed from: com.airbnb.lottie.t */
public final class C1906t<T> {

    /* renamed from: e */
    public static ExecutorService f6706e = Executors.newCachedThreadPool();

    /* renamed from: a */
    public final LinkedHashSet f6707a;

    /* renamed from: b */
    public final LinkedHashSet f6708b;

    /* renamed from: c */
    public final Handler f6709c;

    /* renamed from: d */
    public volatile C1904r<T> f6710d;

    /* renamed from: com.airbnb.lottie.t$a */
    public class C1907a extends FutureTask<C1904r<T>> {
        public C1907a(Callable<C1904r<T>> callable) {
            super(callable);
        }

        public final void done() {
            if (!isCancelled()) {
                try {
                    C1906t.this.mo6854a((C1904r) get());
                } catch (InterruptedException | ExecutionException e) {
                    C1906t.this.mo6854a(new C1904r(e));
                }
            }
        }
    }

    public C1906t() {
        throw null;
    }

    public C1906t(Callable<C1904r<T>> callable, boolean z) {
        this.f6707a = new LinkedHashSet(1);
        this.f6708b = new LinkedHashSet(1);
        this.f6709c = new Handler(Looper.getMainLooper());
        this.f6710d = null;
        if (z) {
            try {
                mo6854a(callable.call());
            } catch (Throwable th) {
                mo6854a(new C1904r(th));
            }
        } else {
            f6706e.execute(new C1907a(callable));
        }
    }

    /* renamed from: a */
    public final void mo6854a(C1904r<T> rVar) {
        if (this.f6710d == null) {
            this.f6710d = rVar;
            this.f6709c.post(new C1905s(this));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }
}
