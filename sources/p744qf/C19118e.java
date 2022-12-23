package p744qf;

import com.google.firebase.perf.p414v1.C14507b;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p316y.C7219n;
import p626lf.C18200a;
import p790sf.C19458e;

/* renamed from: qf.e */
public final class C19118e {

    /* renamed from: f */
    public static final C18200a f48601f = C18200a.m44901d();

    /* renamed from: a */
    public final ScheduledExecutorService f48602a;

    /* renamed from: b */
    public final ConcurrentLinkedQueue<C14507b> f48603b;

    /* renamed from: c */
    public final Runtime f48604c;

    /* renamed from: d */
    public ScheduledFuture f48605d = null;

    /* renamed from: e */
    public long f48606e = -1;

    public C19118e() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runtime runtime = Runtime.getRuntime();
        this.f48602a = newSingleThreadScheduledExecutor;
        this.f48603b = new ConcurrentLinkedQueue<>();
        this.f48604c = runtime;
    }

    /* renamed from: a */
    public final synchronized void mo51551a(long j, Timer timer) {
        this.f48606e = j;
        try {
            this.f48605d = this.f48602a.scheduleAtFixedRate(new C7219n(10, this, timer), 0, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C18200a aVar = f48601f;
            e.getMessage();
            aVar.mo50614f();
        }
        return;
    }

    /* renamed from: b */
    public final C14507b mo51552b(Timer timer) {
        if (timer == null) {
            return null;
        }
        long b = timer.mo43519b() + timer.f36654b;
        C14507b.C14509b v = C14507b.m36142v();
        v.mo43956p();
        C14507b.m36140t((C14507b) v.f36809c, b);
        int b2 = C19458e.m46856b(StorageUnit.BYTES.toKilobytes(this.f48604c.totalMemory() - this.f48604c.freeMemory()));
        v.mo43956p();
        C14507b.m36141u((C14507b) v.f36809c, b2);
        return (C14507b) v.mo43954m();
    }
}
