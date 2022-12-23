package p102h0;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.android.play.core.appupdate.C14226d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import p089g0.C4720a;
import p695od.C18728c;

/* renamed from: h0.n */
public final class C5035n<V> implements C18728c<List<V>> {

    /* renamed from: b */
    public List<? extends C18728c<? extends V>> f17007b;

    /* renamed from: c */
    public ArrayList f17008c;

    /* renamed from: d */
    public final boolean f17009d;

    /* renamed from: e */
    public final AtomicInteger f17010e;

    /* renamed from: f */
    public final CallbackToFutureAdapter.C0675c f17011f = CallbackToFutureAdapter.m1884a(new C5032k(this));

    /* renamed from: g */
    public CallbackToFutureAdapter.C0673a<List<V>> f17012g;

    public C5035n(ArrayList arrayList, boolean z, C4720a aVar) {
        this.f17007b = arrayList;
        this.f17008c = new ArrayList(arrayList.size());
        this.f17009d = z;
        this.f17010e = new AtomicInteger(arrayList.size());
        addListener(new C5033l(this), C14226d.m35352s0());
        if (this.f17007b.isEmpty()) {
            this.f17012g.mo2697b(new ArrayList(this.f17008c));
            return;
        }
        for (int i = 0; i < this.f17007b.size(); i++) {
            this.f17008c.add((Object) null);
        }
        List<? extends C18728c<? extends V>> list = this.f17007b;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C18728c cVar = (C18728c) list.get(i2);
            cVar.addListener(new C5034m(this, i2, cVar), aVar);
        }
    }

    public final void addListener(Runnable runnable, Executor executor) {
        this.f17011f.f2322c.addListener(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        List<? extends C18728c<? extends V>> list = this.f17007b;
        if (list != null) {
            for (C18728c cancel : list) {
                cancel.cancel(z);
            }
        }
        return this.f17011f.cancel(z);
    }

    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (List) this.f17011f.f2322c.get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return this.f17011f.isCancelled();
    }

    public final boolean isDone() {
        return this.f17011f.isDone();
    }

    public final Object get() throws ExecutionException, InterruptedException {
        List<? extends C18728c<? extends V>> list = this.f17007b;
        if (list != null && !isDone()) {
            loop0:
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
                            if (this.f17009d) {
                                break loop0;
                            }
                        }
                    }
                }
            }
        }
        return (List) this.f17011f.get();
    }
}
