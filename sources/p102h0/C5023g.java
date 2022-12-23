package p102h0;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.play.core.appupdate.C14226d;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import mf0.C24361g;
import p089g0.C4720a;
import p102h0.C5028j;
import p227r.C6227a;
import p695od.C18728c;

/* renamed from: h0.g */
public final class C5023g {

    /* renamed from: a */
    public static final C5024a f16993a = new C5024a();

    /* renamed from: h0.g$a */
    public class C5024a implements C6227a<Object, Object> {
        public final Object apply(Object obj) {
            return obj;
        }
    }

    /* renamed from: h0.g$b */
    public static final class C5025b<V> implements Runnable {

        /* renamed from: b */
        public final Future<V> f16994b;

        /* renamed from: c */
        public final C5018c<? super V> f16995c;

        public C5025b(Future<V> future, C5018c<? super V> cVar) {
            this.f16994b = future;
            this.f16995c = cVar;
        }

        public final void run() {
            try {
                this.f16995c.onSuccess(C5023g.m12855c(this.f16994b));
            } catch (ExecutionException e) {
                this.f16995c.onFailure(e.getCause());
            } catch (Error | RuntimeException e2) {
                this.f16995c.onFailure(e2);
            }
        }

        public final String toString() {
            return C5025b.class.getSimpleName() + AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR + this.f16995c;
        }
    }

    /* renamed from: a */
    public static <V> void m12853a(C18728c<V> cVar, C5018c<? super V> cVar2, Executor executor) {
        cVar2.getClass();
        cVar.addListener(new C5025b(cVar, cVar2), executor);
    }

    /* renamed from: b */
    public static C5035n m12854b(ArrayList arrayList) {
        return new C5035n(new ArrayList(arrayList), true, C14226d.m35352s0());
    }

    /* renamed from: c */
    public static <V> V m12855c(Future<V> future) throws ExecutionException {
        boolean isDone = future.isDone();
        C24361g.m61193w("Future was expected to be done, " + future, isDone);
        return m12856d(future);
    }

    /* renamed from: d */
    public static <V> V m12856d(Future<V> future) throws ExecutionException {
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

    /* renamed from: e */
    public static C5028j.C5031c m12857e(Object obj) {
        if (obj == null) {
            return C5028j.C5031c.f17000c;
        }
        return new C5028j.C5031c(obj);
    }

    /* renamed from: f */
    public static <V> C18728c<V> m12858f(C18728c<V> cVar) {
        cVar.getClass();
        if (cVar.isDone()) {
            return cVar;
        }
        return CallbackToFutureAdapter.m1884a(new C5021e(cVar, 0));
    }

    /* renamed from: g */
    public static void m12859g(boolean z, C18728c cVar, CallbackToFutureAdapter.C0673a aVar, C4720a aVar2) {
        cVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        m12853a(cVar, new C5026h(aVar), aVar2);
        if (z) {
            aVar.mo2696a(new C5027i(cVar), C14226d.m35352s0());
        }
    }

    /* renamed from: h */
    public static C5016b m12860h(C18728c cVar, C6227a aVar, Executor executor) {
        C5016b bVar = new C5016b(new C5022f(aVar), cVar);
        cVar.addListener(bVar, executor);
        return bVar;
    }
}
