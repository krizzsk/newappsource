package p627lg;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.play.core.assetpacks.C14273h2;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

@KeepForSdk
/* renamed from: lg.l */
public final class C18213l {

    /* renamed from: a */
    public final Object f46474a = new Object();

    /* renamed from: b */
    public boolean f46475b;

    /* renamed from: c */
    public final ArrayDeque f46476c = new ArrayDeque();

    /* renamed from: d */
    public final AtomicReference f46477d = new AtomicReference();

    @KeepForSdk
    /* renamed from: a */
    public final void mo50632a(Runnable runnable, Executor executor) {
        synchronized (this.f46474a) {
            if (this.f46475b) {
                this.f46476c.add(new C18223v(executor, runnable));
                return;
            }
            this.f46475b = true;
            mo50634c(runnable, executor);
        }
    }

    /* renamed from: b */
    public final void mo50633b() {
        synchronized (this.f46474a) {
            if (this.f46476c.isEmpty()) {
                this.f46475b = false;
                return;
            }
            C18223v vVar = (C18223v) this.f46476c.remove();
            mo50634c(vVar.f46498b, vVar.f46497a);
        }
    }

    /* renamed from: c */
    public final void mo50634c(Runnable runnable, Executor executor) {
        try {
            executor.execute(new C14273h2(1, this, runnable));
        } catch (RejectedExecutionException unused) {
            mo50633b();
        }
    }
}
