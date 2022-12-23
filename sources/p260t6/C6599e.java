package p260t6;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.GlideException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p001a0.C0016g;
import p273u6.C6719i;
import p273u6.C6720j;
import p285v6.C6869d;
import p311x6.C7176l;
import p358af.C13437d;

/* renamed from: t6.e */
public final class C6599e<R> implements C6597c<R>, C6601f<R> {

    /* renamed from: b */
    public final int f20442b;

    /* renamed from: c */
    public final int f20443c;

    /* renamed from: d */
    public R f20444d;

    /* renamed from: e */
    public C6598d f20445e;

    /* renamed from: f */
    public boolean f20446f;

    /* renamed from: g */
    public boolean f20447g;

    /* renamed from: h */
    public boolean f20448h;

    /* renamed from: i */
    public GlideException f20449i;

    /* renamed from: t6.e$a */
    public static class C6600a {
    }

    static {
        new C6600a();
    }

    public C6599e(int i, int i2) {
        this.f20442b = i;
        this.f20443c = i2;
    }

    /* renamed from: a */
    public final void mo22742a(C6719i iVar) {
        iVar.mo11025b(this.f20442b, this.f20443c);
    }

    /* renamed from: b */
    public final void mo22743b(Drawable drawable) {
    }

    /* renamed from: c */
    public final synchronized C6598d mo22744c() {
        return this.f20445e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        if (r1 == null) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        r1.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isDone()     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x000a
            r3 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x001f }
            return r3
        L_0x000a:
            r0 = 1
            r2.f20446f = r0     // Catch:{ all -> 0x001f }
            r2.notifyAll()     // Catch:{ all -> 0x001f }
            r1 = 0
            if (r3 == 0) goto L_0x0018
            t6.d r3 = r2.f20445e     // Catch:{ all -> 0x001f }
            r2.f20445e = r1     // Catch:{ all -> 0x001f }
            r1 = r3
        L_0x0018:
            monitor-exit(r2)     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x001e
            r1.clear()
        L_0x001e:
            return r0
        L_0x001f:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p260t6.C6599e.cancel(boolean):boolean");
    }

    /* renamed from: d */
    public final void mo22005d(Drawable drawable) {
    }

    /* renamed from: e */
    public final synchronized void mo22746e(C6598d dVar) {
        this.f20445e = dVar;
    }

    /* renamed from: f */
    public final synchronized boolean mo22747f(GlideException glideException, Object obj) {
        this.f20448h = true;
        this.f20449i = glideException;
        notifyAll();
        return false;
    }

    /* renamed from: g */
    public final synchronized void mo22748g(Object obj, Object obj2, C6720j jVar) {
        this.f20447g = true;
        this.f20444d = obj;
        notifyAll();
    }

    public final R get() throws InterruptedException, ExecutionException {
        try {
            return mo22754k((Long) null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: h */
    public final synchronized void mo10887h(R r, C6869d<? super R> dVar) {
    }

    /* renamed from: i */
    public final synchronized void mo10888i(Drawable drawable) {
    }

    public final synchronized boolean isCancelled() {
        return this.f20446f;
    }

    public final synchronized boolean isDone() {
        return this.f20446f || this.f20447g || this.f20448h;
    }

    /* renamed from: j */
    public final void mo22753j(C6719i iVar) {
    }

    /* renamed from: k */
    public final synchronized R mo22754k(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone()) {
            if (!C7176l.m16788h()) {
                throw new IllegalArgumentException("You must call this method on a background thread");
            }
        }
        if (this.f20446f) {
            throw new CancellationException();
        } else if (this.f20448h) {
            throw new ExecutionException(this.f20449i);
        } else if (this.f20447g) {
            return this.f20444d;
        } else {
            if (l == null) {
                wait(0);
            } else if (l.longValue() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = l.longValue() + currentTimeMillis;
                while (!isDone() && currentTimeMillis < longValue) {
                    wait(longValue - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            } else if (this.f20448h) {
                throw new ExecutionException(this.f20449i);
            } else if (this.f20446f) {
                throw new CancellationException();
            } else if (this.f20447g) {
                return this.f20444d;
            } else {
                throw new TimeoutException();
            }
        }
    }

    public final void onDestroy() {
    }

    public final void onStart() {
    }

    public final void onStop() {
    }

    public final String toString() {
        C6598d dVar;
        String str;
        String o = C0016g.m31o(new StringBuilder(), super.toString(), "[status=");
        synchronized (this) {
            dVar = null;
            if (this.f20446f) {
                str = "CANCELLED";
            } else if (this.f20448h) {
                str = "FAILURE";
            } else if (this.f20447g) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                dVar = this.f20445e;
            }
        }
        if (dVar == null) {
            return C13437d.m33706k(o, str, "]");
        }
        return o + str + ", request=[" + dVar + "]]";
    }

    public final R get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return mo22754k(Long.valueOf(timeUnit.toMillis(j)));
    }
}
