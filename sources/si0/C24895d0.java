package si0;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import mf0.C24362h;
import p001a0.C0016g;

/* renamed from: si0.d0 */
public class C24895d0 {

    /* renamed from: d */
    public static final C24896a f62942d = new C24896a();

    /* renamed from: a */
    public boolean f62943a;

    /* renamed from: b */
    public long f62944b;

    /* renamed from: c */
    public long f62945c;

    /* renamed from: si0.d0$a */
    public static final class C24896a extends C24895d0 {
        /* renamed from: d */
        public final C24895d0 mo61370d(long j) {
            return this;
        }

        /* renamed from: f */
        public final void mo61372f() {
        }

        /* renamed from: g */
        public final C24895d0 mo61373g(long j, TimeUnit timeUnit) {
            C24362h.m61211f(timeUnit, "unit");
            return this;
        }
    }

    /* renamed from: a */
    public C24895d0 mo61367a() {
        this.f62943a = false;
        return this;
    }

    /* renamed from: b */
    public C24895d0 mo61368b() {
        this.f62945c = 0;
        return this;
    }

    /* renamed from: c */
    public long mo61369c() {
        if (this.f62943a) {
            return this.f62944b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    /* renamed from: d */
    public C24895d0 mo61370d(long j) {
        this.f62943a = true;
        this.f62944b = j;
        return this;
    }

    /* renamed from: e */
    public boolean mo61371e() {
        return this.f62943a;
    }

    /* renamed from: f */
    public void mo61372f() throws IOException {
        Thread currentThread = Thread.currentThread();
        C24362h.m61210e(currentThread, "Thread.currentThread()");
        if (currentThread.isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        } else if (this.f62943a && this.f62944b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: g */
    public C24895d0 mo61373g(long j, TimeUnit timeUnit) {
        boolean z;
        C24362h.m61211f(timeUnit, "unit");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f62945c = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(C0016g.m29l("timeout < 0: ", j).toString());
    }
}
