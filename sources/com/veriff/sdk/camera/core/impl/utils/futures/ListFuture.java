package com.veriff.sdk.camera.core.impl.utils.futures;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.core.impl.utils.executor.CameraXExecutors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import mf0.C24361g;
import p695od.C18728c;

class ListFuture<V> implements C18728c<List<V>> {
    private final boolean mAllMustSucceed;
    public List<? extends C18728c<? extends V>> mFutures;
    private final AtomicInteger mRemaining;
    private final C18728c<List<V>> mResult = CallbackToFutureAdapter.m1884a(new CallbackToFutureAdapter.C0674b<List<V>>() {
        public Object attachCompleter(CallbackToFutureAdapter.C0673a<List<V>> aVar) {
            boolean z;
            if (ListFuture.this.mResultNotifier == null) {
                z = true;
            } else {
                z = false;
            }
            C24361g.m61193w("The result can only set once!", z);
            ListFuture.this.mResultNotifier = aVar;
            return "ListFuture[" + this + "]";
        }
    });
    public CallbackToFutureAdapter.C0673a<List<V>> mResultNotifier;
    public List<V> mValues;

    public ListFuture(List<? extends C18728c<? extends V>> list, boolean z, Executor executor) {
        list.getClass();
        this.mFutures = list;
        this.mValues = new ArrayList(list.size());
        this.mAllMustSucceed = z;
        this.mRemaining = new AtomicInteger(list.size());
        init(executor);
    }

    private void callAllGets() throws InterruptedException {
        List<? extends C18728c<? extends V>> list = this.mFutures;
        if (list != null && !isDone()) {
            for (C18728c cVar : list) {
                while (true) {
                    if (!cVar.isDone()) {
                        try {
                            cVar.get();
                        } catch (Error e) {
                            throw e;
                        } catch (InterruptedException e2) {
                            throw e2;
                        } catch (Throwable unused) {
                            if (this.mAllMustSucceed) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    private void init(Executor executor) {
        addListener(new Runnable() {
            public void run() {
                ListFuture listFuture = ListFuture.this;
                listFuture.mValues = null;
                listFuture.mFutures = null;
            }
        }, CameraXExecutors.directExecutor());
        if (this.mFutures.isEmpty()) {
            this.mResultNotifier.mo2697b(new ArrayList(this.mValues));
            return;
        }
        for (int i = 0; i < this.mFutures.size(); i++) {
            this.mValues.add((Object) null);
        }
        List<? extends C18728c<? extends V>> list = this.mFutures;
        for (final int i2 = 0; i2 < list.size(); i2++) {
            final C18728c cVar = (C18728c) list.get(i2);
            cVar.addListener(new Runnable() {
                public void run() {
                    ListFuture.this.setOneValue(i2, cVar);
                }
            }, executor);
        }
    }

    public void addListener(Runnable runnable, Executor executor) {
        this.mResult.addListener(runnable, executor);
    }

    public boolean cancel(boolean z) {
        List<? extends C18728c<? extends V>> list = this.mFutures;
        if (list != null) {
            for (C18728c cancel : list) {
                cancel.cancel(z);
            }
        }
        return this.mResult.cancel(z);
    }

    public boolean isCancelled() {
        return this.mResult.isCancelled();
    }

    public boolean isDone() {
        return this.mResult.isDone();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x00bb */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setOneValue(int r8, java.util.concurrent.Future<? extends V> r9) {
        /*
            r7 = this;
            java.lang.String r0 = "Less than 0 remaining futures"
            java.util.List<V> r1 = r7.mValues
            boolean r2 = r7.isDone()
            if (r2 != 0) goto L_0x0105
            if (r1 != 0) goto L_0x000e
            goto L_0x0105
        L_0x000e:
            r2 = 0
            r3 = 1
            r4 = 0
            boolean r5 = r9.isDone()     // Catch:{ CancellationException -> 0x00bb, ExecutionException -> 0x0092, RuntimeException -> 0x006d, Error -> 0x004c }
            java.lang.String r6 = "Tried to set value from future which is not done"
            mf0.C24361g.m61193w(r6, r5)     // Catch:{ CancellationException -> 0x00bb, ExecutionException -> 0x0092, RuntimeException -> 0x006d, Error -> 0x004c }
            java.lang.Object r9 = com.veriff.sdk.camera.core.impl.utils.futures.Futures.getUninterruptibly(r9)     // Catch:{ CancellationException -> 0x00bb, ExecutionException -> 0x0092, RuntimeException -> 0x006d, Error -> 0x004c }
            r1.set(r8, r9)     // Catch:{ CancellationException -> 0x00bb, ExecutionException -> 0x0092, RuntimeException -> 0x006d, Error -> 0x004c }
            java.util.concurrent.atomic.AtomicInteger r8 = r7.mRemaining
            int r8 = r8.decrementAndGet()
            if (r8 < 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r3 = 0
        L_0x002b:
            mf0.C24361g.m61193w(r0, r3)
            if (r8 != 0) goto L_0x00de
            java.util.List<V> r8 = r7.mValues
            if (r8 == 0) goto L_0x0040
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.util.List<V>> r9 = r7.mResultNotifier
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
        L_0x003b:
            r9.mo2697b(r0)
            goto L_0x00de
        L_0x0040:
            boolean r8 = r7.isDone()
            mf0.C24361g.m61193w(r2, r8)
            goto L_0x00de
        L_0x0049:
            r8 = move-exception
            goto L_0x00df
        L_0x004c:
            r8 = move-exception
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.util.List<V>> r9 = r7.mResultNotifier     // Catch:{ all -> 0x0049 }
            r9.mo2698c(r8)     // Catch:{ all -> 0x0049 }
            java.util.concurrent.atomic.AtomicInteger r8 = r7.mRemaining
            int r8 = r8.decrementAndGet()
            if (r8 < 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r3 = 0
        L_0x005c:
            mf0.C24361g.m61193w(r0, r3)
            if (r8 != 0) goto L_0x00de
            java.util.List<V> r8 = r7.mValues
            if (r8 == 0) goto L_0x0040
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.util.List<V>> r9 = r7.mResultNotifier
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            goto L_0x003b
        L_0x006d:
            r8 = move-exception
            boolean r9 = r7.mAllMustSucceed     // Catch:{ all -> 0x0049 }
            if (r9 == 0) goto L_0x0077
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.util.List<V>> r9 = r7.mResultNotifier     // Catch:{ all -> 0x0049 }
            r9.mo2698c(r8)     // Catch:{ all -> 0x0049 }
        L_0x0077:
            java.util.concurrent.atomic.AtomicInteger r8 = r7.mRemaining
            int r8 = r8.decrementAndGet()
            if (r8 < 0) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r3 = 0
        L_0x0081:
            mf0.C24361g.m61193w(r0, r3)
            if (r8 != 0) goto L_0x00de
            java.util.List<V> r8 = r7.mValues
            if (r8 == 0) goto L_0x0040
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.util.List<V>> r9 = r7.mResultNotifier
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            goto L_0x003b
        L_0x0092:
            r8 = move-exception
            boolean r9 = r7.mAllMustSucceed     // Catch:{ all -> 0x0049 }
            if (r9 == 0) goto L_0x00a0
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.util.List<V>> r9 = r7.mResultNotifier     // Catch:{ all -> 0x0049 }
            java.lang.Throwable r8 = r8.getCause()     // Catch:{ all -> 0x0049 }
            r9.mo2698c(r8)     // Catch:{ all -> 0x0049 }
        L_0x00a0:
            java.util.concurrent.atomic.AtomicInteger r8 = r7.mRemaining
            int r8 = r8.decrementAndGet()
            if (r8 < 0) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r3 = 0
        L_0x00aa:
            mf0.C24361g.m61193w(r0, r3)
            if (r8 != 0) goto L_0x00de
            java.util.List<V> r8 = r7.mValues
            if (r8 == 0) goto L_0x0040
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.util.List<V>> r9 = r7.mResultNotifier
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            goto L_0x003b
        L_0x00bb:
            boolean r8 = r7.mAllMustSucceed     // Catch:{ all -> 0x0049 }
            if (r8 == 0) goto L_0x00c2
            r7.cancel(r4)     // Catch:{ all -> 0x0049 }
        L_0x00c2:
            java.util.concurrent.atomic.AtomicInteger r8 = r7.mRemaining
            int r8 = r8.decrementAndGet()
            if (r8 < 0) goto L_0x00cb
            goto L_0x00cc
        L_0x00cb:
            r3 = 0
        L_0x00cc:
            mf0.C24361g.m61193w(r0, r3)
            if (r8 != 0) goto L_0x00de
            java.util.List<V> r8 = r7.mValues
            if (r8 == 0) goto L_0x0040
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.util.List<V>> r9 = r7.mResultNotifier
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            goto L_0x003b
        L_0x00de:
            return
        L_0x00df:
            java.util.concurrent.atomic.AtomicInteger r9 = r7.mRemaining
            int r9 = r9.decrementAndGet()
            if (r9 < 0) goto L_0x00e8
            goto L_0x00e9
        L_0x00e8:
            r3 = 0
        L_0x00e9:
            mf0.C24361g.m61193w(r0, r3)
            if (r9 != 0) goto L_0x0104
            java.util.List<V> r9 = r7.mValues
            if (r9 == 0) goto L_0x00fd
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.util.List<V>> r0 = r7.mResultNotifier
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r9)
            r0.mo2697b(r1)
            goto L_0x0104
        L_0x00fd:
            boolean r9 = r7.isDone()
            mf0.C24361g.m61193w(r2, r9)
        L_0x0104:
            throw r8
        L_0x0105:
            boolean r8 = r7.mAllMustSucceed
            java.lang.String r9 = "Future was done before all dependencies completed"
            mf0.C24361g.m61193w(r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.core.impl.utils.futures.ListFuture.setOneValue(int, java.util.concurrent.Future):void");
    }

    public List<V> get() throws InterruptedException, ExecutionException {
        callAllGets();
        return this.mResult.get();
    }

    public List<V> get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.mResult.get(j, timeUnit);
    }
}
