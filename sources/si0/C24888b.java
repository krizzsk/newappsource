package si0;

import bf0.C21050d;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import mf0.C24362h;

/* renamed from: si0.b */
public class C24888b extends C24895d0 {

    /* renamed from: h */
    public static final long f62931h;

    /* renamed from: i */
    public static final long f62932i;

    /* renamed from: j */
    public static C24888b f62933j;

    /* renamed from: e */
    public boolean f62934e;

    /* renamed from: f */
    public C24888b f62935f;

    /* renamed from: g */
    public long f62936g;

    /* renamed from: si0.b$a */
    public static final class C24889a {
        /* renamed from: a */
        public static C24888b m62424a() throws InterruptedException {
            Class<C24888b> cls = C24888b.class;
            C24888b bVar = C24888b.f62933j;
            C24362h.m61208c(bVar);
            C24888b bVar2 = bVar.f62935f;
            if (bVar2 == null) {
                long nanoTime = System.nanoTime();
                cls.wait(C24888b.f62931h);
                C24888b bVar3 = C24888b.f62933j;
                C24362h.m61208c(bVar3);
                if (bVar3.f62935f != null || System.nanoTime() - nanoTime < C24888b.f62932i) {
                    return null;
                }
                return C24888b.f62933j;
            }
            long nanoTime2 = bVar2.f62936g - System.nanoTime();
            if (nanoTime2 > 0) {
                long j = nanoTime2 / 1000000;
                cls.wait(j, (int) (nanoTime2 - (1000000 * j)));
                return null;
            }
            C24888b bVar4 = C24888b.f62933j;
            C24362h.m61208c(bVar4);
            bVar4.f62935f = bVar2.f62935f;
            bVar2.f62935f = null;
            return bVar2;
        }
    }

    /* renamed from: si0.b$b */
    public static final class C24890b extends Thread {
        public C24890b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0015, code lost:
            if (r1 == null) goto L_0x0000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0017, code lost:
            r1.mo59055k();
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<si0.b> r0 = si0.C24888b.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                si0.b r1 = si0.C24888b.f62933j     // Catch:{ all -> 0x001b }
                si0.b r1 = si0.C24888b.C24889a.m62424a()     // Catch:{ all -> 0x001b }
                si0.b r2 = si0.C24888b.f62933j     // Catch:{ all -> 0x001b }
                if (r1 != r2) goto L_0x0012
                r1 = 0
                si0.C24888b.f62933j = r1     // Catch:{ all -> 0x001b }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0012:
                bf0.d r2 = bf0.C21050d.f52856a     // Catch:{ all -> 0x001b }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 == 0) goto L_0x0000
                r1.mo59055k()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x001b:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: si0.C24888b.C24890b.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f62931h = millis;
        f62932i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* renamed from: h */
    public final void mo61362h() {
        C24888b bVar;
        long j = this.f62945c;
        boolean z = this.f62943a;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i != 0 || z) {
            Class<C24888b> cls = C24888b.class;
            synchronized (cls) {
                if (!this.f62934e) {
                    this.f62934e = true;
                    if (f62933j == null) {
                        f62933j = new C24888b();
                        new C24890b().start();
                    }
                    long nanoTime = System.nanoTime();
                    if (i != 0 && z) {
                        this.f62936g = Math.min(j, mo61369c() - nanoTime) + nanoTime;
                    } else if (i != 0) {
                        this.f62936g = j + nanoTime;
                    } else if (z) {
                        this.f62936g = mo61369c();
                    } else {
                        throw new AssertionError();
                    }
                    long j2 = this.f62936g - nanoTime;
                    C24888b bVar2 = f62933j;
                    C24362h.m61208c(bVar2);
                    while (true) {
                        bVar = bVar2.f62935f;
                        if (bVar == null) {
                            break;
                        } else if (j2 < bVar.f62936g - nanoTime) {
                            break;
                        } else {
                            bVar2 = bVar;
                        }
                    }
                    this.f62935f = bVar;
                    bVar2.f62935f = this;
                    if (bVar2 == f62933j) {
                        cls.notify();
                    }
                    C21050d dVar = C21050d.f52856a;
                } else {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
            }
        }
    }

    /* renamed from: i */
    public final boolean mo61363i() {
        boolean z;
        synchronized (C24888b.class) {
            z = false;
            if (this.f62934e) {
                this.f62934e = false;
                C24888b bVar = f62933j;
                while (true) {
                    if (bVar == null) {
                        z = true;
                        break;
                    }
                    C24888b bVar2 = bVar.f62935f;
                    if (bVar2 == this) {
                        bVar.f62935f = this.f62935f;
                        this.f62935f = null;
                        break;
                    }
                    bVar = bVar2;
                }
            }
        }
        return z;
    }

    /* renamed from: j */
    public IOException mo60787j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: k */
    public void mo59055k() {
    }
}
