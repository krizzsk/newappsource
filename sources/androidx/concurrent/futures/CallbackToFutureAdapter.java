package androidx.concurrent.futures;

import androidx.concurrent.futures.AbstractResolvableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p254t0.C6524a;
import p695od.C18728c;

public final class CallbackToFutureAdapter {

    public static final class FutureGarbageCollectedException extends Throwable {
        public FutureGarbageCollectedException(String str) {
            super(str);
        }

        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: androidx.concurrent.futures.CallbackToFutureAdapter$a */
    public static final class C0673a<T> {

        /* renamed from: a */
        public Object f2317a;

        /* renamed from: b */
        public C0675c<T> f2318b;

        /* renamed from: c */
        public C6524a<Void> f2319c = new C6524a<>();

        /* renamed from: d */
        public boolean f2320d;

        /* renamed from: a */
        public final void mo2696a(Runnable runnable, Executor executor) {
            C6524a<Void> aVar = this.f2319c;
            if (aVar != null) {
                aVar.addListener(runnable, executor);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
            if (r6 != false) goto L_0x0024;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo2697b(T r6) {
            /*
                r5 = this;
                r0 = 1
                r5.f2320d = r0
                androidx.concurrent.futures.CallbackToFutureAdapter$c<T> r1 = r5.f2318b
                r2 = 0
                r3 = 0
                if (r1 == 0) goto L_0x0023
                androidx.concurrent.futures.CallbackToFutureAdapter$c$a r1 = r1.f2322c
                r1.getClass()
                if (r6 != 0) goto L_0x0012
                java.lang.Object r6 = androidx.concurrent.futures.AbstractResolvableFuture.f2297h
            L_0x0012:
                androidx.concurrent.futures.AbstractResolvableFuture$a r4 = androidx.concurrent.futures.AbstractResolvableFuture.f2296g
                boolean r6 = r4.mo2690b(r1, r2, r6)
                if (r6 == 0) goto L_0x001f
                androidx.concurrent.futures.AbstractResolvableFuture.m1863b(r1)
                r6 = 1
                goto L_0x0020
            L_0x001f:
                r6 = 0
            L_0x0020:
                if (r6 == 0) goto L_0x0023
                goto L_0x0024
            L_0x0023:
                r0 = 0
            L_0x0024:
                if (r0 == 0) goto L_0x002c
                r5.f2317a = r2
                r5.f2318b = r2
                r5.f2319c = r2
            L_0x002c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.CallbackToFutureAdapter.C0673a.mo2697b(java.lang.Object):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
            if (r6 != false) goto L_0x0028;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo2698c(java.lang.Throwable r6) {
            /*
                r5 = this;
                r0 = 1
                r5.f2320d = r0
                androidx.concurrent.futures.CallbackToFutureAdapter$c<T> r1 = r5.f2318b
                r2 = 0
                r3 = 0
                if (r1 == 0) goto L_0x0027
                androidx.concurrent.futures.CallbackToFutureAdapter$c$a r1 = r1.f2322c
                r1.getClass()
                androidx.concurrent.futures.AbstractResolvableFuture$Failure r4 = new androidx.concurrent.futures.AbstractResolvableFuture$Failure
                r6.getClass()
                r4.<init>(r6)
                androidx.concurrent.futures.AbstractResolvableFuture$a r6 = androidx.concurrent.futures.AbstractResolvableFuture.f2296g
                boolean r6 = r6.mo2690b(r1, r2, r4)
                if (r6 == 0) goto L_0x0023
                androidx.concurrent.futures.AbstractResolvableFuture.m1863b(r1)
                r6 = 1
                goto L_0x0024
            L_0x0023:
                r6 = 0
            L_0x0024:
                if (r6 == 0) goto L_0x0027
                goto L_0x0028
            L_0x0027:
                r0 = 0
            L_0x0028:
                if (r0 == 0) goto L_0x0030
                r5.f2317a = r2
                r5.f2318b = r2
                r5.f2319c = r2
            L_0x0030:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.CallbackToFutureAdapter.C0673a.mo2698c(java.lang.Throwable):boolean");
        }

        public final void finalize() {
            C6524a<Void> aVar;
            C0675c<T> cVar = this.f2318b;
            if (cVar != null && !cVar.isDone()) {
                StringBuilder k = C13555b.m33972k("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
                k.append(this.f2317a);
                FutureGarbageCollectedException futureGarbageCollectedException = new FutureGarbageCollectedException(k.toString());
                C0675c.C0676a aVar2 = cVar.f2322c;
                aVar2.getClass();
                if (AbstractResolvableFuture.f2296g.mo2690b(aVar2, (Object) null, new AbstractResolvableFuture.Failure(futureGarbageCollectedException))) {
                    AbstractResolvableFuture.m1863b(aVar2);
                }
            }
            if (!this.f2320d && (aVar = this.f2319c) != null) {
                aVar.mo22629g(null);
            }
        }
    }

    /* renamed from: androidx.concurrent.futures.CallbackToFutureAdapter$b */
    public interface C0674b<T> {
        Object attachCompleter(C0673a<T> aVar) throws Exception;
    }

    /* renamed from: androidx.concurrent.futures.CallbackToFutureAdapter$c */
    public static final class C0675c<T> implements C18728c<T> {

        /* renamed from: b */
        public final WeakReference<C0673a<T>> f2321b;

        /* renamed from: c */
        public final C0676a f2322c = new C0676a();

        /* renamed from: androidx.concurrent.futures.CallbackToFutureAdapter$c$a */
        public class C0676a extends AbstractResolvableFuture<T> {
            public C0676a() {
            }

            /* renamed from: e */
            public final String mo2681e() {
                C0673a aVar = C0675c.this.f2321b.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return C16530d.m42015h(C13555b.m33972k("tag=["), aVar.f2317a, "]");
            }
        }

        public C0675c(C0673a<T> aVar) {
            this.f2321b = new WeakReference<>(aVar);
        }

        public final void addListener(Runnable runnable, Executor executor) {
            this.f2322c.addListener(runnable, executor);
        }

        public final boolean cancel(boolean z) {
            C0673a aVar = this.f2321b.get();
            boolean cancel = this.f2322c.cancel(z);
            if (cancel && aVar != null) {
                aVar.f2317a = null;
                aVar.f2318b = null;
                aVar.f2319c.mo22629g(null);
            }
            return cancel;
        }

        public final T get() throws InterruptedException, ExecutionException {
            return this.f2322c.get();
        }

        public final boolean isCancelled() {
            return this.f2322c.f2298b instanceof AbstractResolvableFuture.C0667b;
        }

        public final boolean isDone() {
            return this.f2322c.isDone();
        }

        public final String toString() {
            return this.f2322c.toString();
        }

        public final T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return this.f2322c.get(j, timeUnit);
        }
    }

    /* renamed from: a */
    public static C0675c m1884a(C0674b bVar) {
        C0673a aVar = new C0673a();
        C0675c<T> cVar = new C0675c<>(aVar);
        aVar.f2318b = cVar;
        aVar.f2317a = bVar.getClass();
        try {
            Object attachCompleter = bVar.attachCompleter(aVar);
            if (attachCompleter != null) {
                aVar.f2317a = attachCompleter;
            }
        } catch (Exception e) {
            C0675c.C0676a aVar2 = cVar.f2322c;
            aVar2.getClass();
            if (AbstractResolvableFuture.f2296g.mo2690b(aVar2, (Object) null, new AbstractResolvableFuture.Failure(e))) {
                AbstractResolvableFuture.m1863b(aVar2);
            }
        }
        return cVar;
    }
}
