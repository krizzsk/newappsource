package p102h0;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import mf0.C24361g;
import p695od.C18728c;

/* renamed from: h0.d */
public class C5019d<V> implements C18728c<V> {

    /* renamed from: b */
    public final C18728c<V> f16987b;

    /* renamed from: c */
    public CallbackToFutureAdapter.C0673a<V> f16988c;

    /* renamed from: h0.d$a */
    public class C5020a implements CallbackToFutureAdapter.C0674b<V> {
        public C5020a() {
        }

        public final Object attachCompleter(CallbackToFutureAdapter.C0673a<V> aVar) {
            boolean z;
            if (C5019d.this.f16988c == null) {
                z = true;
            } else {
                z = false;
            }
            C24361g.m61193w("The result can only set once!", z);
            C5019d.this.f16988c = aVar;
            StringBuilder k = C13555b.m33972k("FutureChain[");
            k.append(C5019d.this);
            k.append("]");
            return k.toString();
        }
    }

    public C5019d(C18728c<V> cVar) {
        cVar.getClass();
        this.f16987b = cVar;
    }

    /* renamed from: a */
    public static <V> C5019d<V> m12842a(C18728c<V> cVar) {
        if (cVar instanceof C5019d) {
            return (C5019d) cVar;
        }
        return new C5019d<>(cVar);
    }

    public final void addListener(Runnable runnable, Executor executor) {
        this.f16987b.addListener(runnable, executor);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo20733b(Throwable th) {
        CallbackToFutureAdapter.C0673a<V> aVar = this.f16988c;
        if (aVar != null) {
            return aVar.mo2698c(th);
        }
        return false;
    }

    /* renamed from: c */
    public final <T> C5019d<T> mo20734c(C5015a<? super V, T> aVar, Executor executor) {
        C5016b bVar = new C5016b(aVar, this);
        addListener(bVar, executor);
        return bVar;
    }

    public boolean cancel(boolean z) {
        return this.f16987b.cancel(z);
    }

    public V get() throws InterruptedException, ExecutionException {
        return this.f16987b.get();
    }

    public final boolean isCancelled() {
        return this.f16987b.isCancelled();
    }

    public final boolean isDone() {
        return this.f16987b.isDone();
    }

    public V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f16987b.get(j, timeUnit);
    }

    public C5019d() {
        this.f16987b = CallbackToFutureAdapter.m1884a(new C5020a());
    }
}
