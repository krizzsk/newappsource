package ni0;

import com.facebook.appevents.C2349o;
import ii0.C23608b;
import ii0.C23609c;
import ii0.C23610d;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ni0.C24528n;
import ni0.C24538r;
import okhttp3.internal.http2.ErrorCode;
import p988j$.util.Spliterator;
import si0.C24901h;
import si0.C24902i;

/* renamed from: ni0.d */
public final class C24510d implements Closeable {

    /* renamed from: y */
    public static final ThreadPoolExecutor f62042y;

    /* renamed from: b */
    public final boolean f62043b;

    /* renamed from: c */
    public final C24515e f62044c;

    /* renamed from: d */
    public final LinkedHashMap f62045d = new LinkedHashMap();

    /* renamed from: e */
    public final String f62046e;

    /* renamed from: f */
    public int f62047f;

    /* renamed from: g */
    public int f62048g;

    /* renamed from: h */
    public boolean f62049h;

    /* renamed from: i */
    public final ScheduledThreadPoolExecutor f62050i;

    /* renamed from: j */
    public final ThreadPoolExecutor f62051j;

    /* renamed from: k */
    public final C24538r.C24539a f62052k;

    /* renamed from: l */
    public long f62053l = 0;

    /* renamed from: m */
    public long f62054m = 0;

    /* renamed from: n */
    public long f62055n = 0;

    /* renamed from: o */
    public long f62056o = 0;

    /* renamed from: p */
    public long f62057p = 0;

    /* renamed from: q */
    public long f62058q = 0;

    /* renamed from: r */
    public long f62059r;

    /* renamed from: s */
    public C2349o f62060s = new C2349o(1);

    /* renamed from: t */
    public final C2349o f62061t;

    /* renamed from: u */
    public final Socket f62062u;

    /* renamed from: v */
    public final C24535p f62063v;

    /* renamed from: w */
    public final C24518g f62064w;

    /* renamed from: x */
    public final LinkedHashSet f62065x;

    /* renamed from: ni0.d$a */
    public class C24511a extends C23608b {

        /* renamed from: c */
        public final /* synthetic */ int f62066c;

        /* renamed from: d */
        public final /* synthetic */ ErrorCode f62067d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24511a(Object[] objArr, int i, ErrorCode errorCode) {
            super("OkHttp %s stream %d", objArr);
            this.f62066c = i;
            this.f62067d = errorCode;
        }

        /* renamed from: a */
        public final void mo58724a() {
            try {
                C24510d dVar = C24510d.this;
                dVar.f62063v.mo60795h(this.f62066c, this.f62067d);
            } catch (IOException e) {
                C24510d.this.mo60759c(e);
            }
        }
    }

    /* renamed from: ni0.d$b */
    public class C24512b extends C23608b {

        /* renamed from: c */
        public final /* synthetic */ int f62069c;

        /* renamed from: d */
        public final /* synthetic */ long f62070d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24512b(Object[] objArr, int i, long j) {
            super("OkHttp Window Update %s stream %d", objArr);
            this.f62069c = i;
            this.f62070d = j;
        }

        /* renamed from: a */
        public final void mo58724a() {
            try {
                C24510d.this.f62063v.mo60796i(this.f62069c, this.f62070d);
            } catch (IOException e) {
                C24510d.this.mo60759c(e);
            }
        }
    }

    /* renamed from: ni0.d$c */
    public static class C24513c {

        /* renamed from: a */
        public Socket f62072a;

        /* renamed from: b */
        public String f62073b;

        /* renamed from: c */
        public C24902i f62074c;

        /* renamed from: d */
        public C24901h f62075d;

        /* renamed from: e */
        public C24515e f62076e = C24515e.f62079a;

        /* renamed from: f */
        public int f62077f;
    }

    /* renamed from: ni0.d$d */
    public final class C24514d extends C23608b {
        public C24514d() {
            super("OkHttp %s ping", C24510d.this.f62046e);
        }

        /* renamed from: a */
        public final void mo58724a() {
            C24510d dVar;
            boolean z;
            synchronized (C24510d.this) {
                dVar = C24510d.this;
                long j = dVar.f62054m;
                long j2 = dVar.f62053l;
                if (j < j2) {
                    z = true;
                } else {
                    dVar.f62053l = j2 + 1;
                    z = false;
                }
            }
            if (z) {
                dVar.mo60759c((IOException) null);
                return;
            }
            try {
                dVar.f62063v.mo60794g(1, 0, false);
            } catch (IOException e) {
                dVar.mo60759c(e);
            }
        }
    }

    /* renamed from: ni0.d$e */
    public static abstract class C24515e {

        /* renamed from: a */
        public static final C24516a f62079a = new C24516a();

        /* renamed from: ni0.d$e$a */
        public class C24516a extends C24515e {
            /* renamed from: b */
            public final void mo59036b(C24531o oVar) throws IOException {
                oVar.mo60779c(ErrorCode.REFUSED_STREAM, (IOException) null);
            }
        }

        /* renamed from: a */
        public void mo59035a(C24510d dVar) {
        }

        /* renamed from: b */
        public abstract void mo59036b(C24531o oVar) throws IOException;
    }

    /* renamed from: ni0.d$f */
    public final class C24517f extends C23608b {

        /* renamed from: c */
        public final boolean f62080c = true;

        /* renamed from: d */
        public final int f62081d;

        /* renamed from: e */
        public final int f62082e;

        public C24517f(int i, int i2) {
            super("OkHttp %s ping %08x%08x", C24510d.this.f62046e, Integer.valueOf(i), Integer.valueOf(i2));
            this.f62081d = i;
            this.f62082e = i2;
        }

        /* renamed from: a */
        public final void mo58724a() {
            C24510d dVar = C24510d.this;
            boolean z = this.f62080c;
            int i = this.f62081d;
            int i2 = this.f62082e;
            dVar.getClass();
            try {
                dVar.f62063v.mo60794g(i, i2, z);
            } catch (IOException e) {
                dVar.mo60759c(e);
            }
        }
    }

    /* renamed from: ni0.d$g */
    public class C24518g extends C23608b implements C24528n.C24530b {

        /* renamed from: c */
        public final C24528n f62084c;

        public C24518g(C24528n nVar) {
            super("OkHttp %s", C24510d.this.f62046e);
            this.f62084c = nVar;
        }

        /* renamed from: a */
        public final void mo58724a() {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            e = null;
            try {
                this.f62084c.mo60772e(this);
                while (this.f62084c.mo60770c(false, this)) {
                }
                errorCode = ErrorCode.NO_ERROR;
                try {
                    C24510d.this.mo60758a(errorCode, ErrorCode.CANCEL, (IOException) null);
                } catch (IOException e) {
                    e = e;
                    try {
                        ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                        C24510d.this.mo60758a(errorCode3, errorCode3, e);
                        C23610d.m57796d(this.f62084c);
                    } catch (Throwable th) {
                        th = th;
                        C24510d.this.mo60758a(errorCode, errorCode2, e);
                        C23610d.m57796d(this.f62084c);
                        throw th;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                errorCode = errorCode2;
                ErrorCode errorCode32 = ErrorCode.PROTOCOL_ERROR;
                C24510d.this.mo60758a(errorCode32, errorCode32, e);
                C23610d.m57796d(this.f62084c);
            } catch (Throwable th2) {
                th = th2;
                errorCode = errorCode2;
                C24510d.this.mo60758a(errorCode, errorCode2, e);
                C23610d.m57796d(this.f62084c);
                throw th;
            }
            C23610d.m57796d(this.f62084c);
        }
    }

    static {
        Class<C24510d> cls = C24510d.class;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = C23610d.f59684a;
        f62042y = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, timeUnit, synchronousQueue, new C23609c("OkHttp Http2Connection", true));
    }

    public C24510d(C24513c cVar) {
        C24513c cVar2 = cVar;
        C2349o oVar = new C2349o(1);
        this.f62061t = oVar;
        this.f62065x = new LinkedHashSet();
        this.f62052k = C24538r.f62161a;
        this.f62043b = true;
        this.f62044c = cVar2.f62076e;
        this.f62048g = 3;
        this.f62060s.mo12502b(7, 16777216);
        String str = cVar2.f62073b;
        this.f62046e = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new C23609c(C23610d.m57802j("OkHttp %s Writer", str), false));
        this.f62050i = scheduledThreadPoolExecutor;
        if (cVar2.f62077f != 0) {
            C24514d dVar = new C24514d();
            long j = (long) cVar2.f62077f;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(dVar, j, j, TimeUnit.MILLISECONDS);
        }
        this.f62051j = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C23609c(C23610d.m57802j("OkHttp %s Push Observer", str), true));
        oVar.mo12502b(7, 65535);
        oVar.mo12502b(5, Spliterator.SUBSIZED);
        this.f62059r = (long) oVar.mo12501a();
        this.f62062u = cVar2.f62072a;
        this.f62063v = new C24535p(cVar2.f62075d, true);
        this.f62064w = new C24518g(new C24528n(cVar2.f62074c, true));
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60758a(okhttp3.internal.http2.ErrorCode r4, okhttp3.internal.http2.ErrorCode r5, java.io.IOException r6) {
        /*
            r3 = this;
            r3.mo60765k(r4)     // Catch:{ IOException -> 0x0003 }
        L_0x0003:
            r4 = 0
            monitor-enter(r3)
            java.util.LinkedHashMap r0 = r3.f62045d     // Catch:{ all -> 0x004a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0026
            java.util.LinkedHashMap r4 = r3.f62045d     // Catch:{ all -> 0x004a }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x004a }
            java.util.LinkedHashMap r0 = r3.f62045d     // Catch:{ all -> 0x004a }
            int r0 = r0.size()     // Catch:{ all -> 0x004a }
            ni0.o[] r0 = new ni0.C24531o[r0]     // Catch:{ all -> 0x004a }
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch:{ all -> 0x004a }
            ni0.o[] r4 = (ni0.C24531o[]) r4     // Catch:{ all -> 0x004a }
            java.util.LinkedHashMap r0 = r3.f62045d     // Catch:{ all -> 0x004a }
            r0.clear()     // Catch:{ all -> 0x004a }
        L_0x0026:
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0035
            int r0 = r4.length
            r1 = 0
        L_0x002b:
            if (r1 >= r0) goto L_0x0035
            r2 = r4[r1]
            r2.mo60779c(r5, r6)     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            int r1 = r1 + 1
            goto L_0x002b
        L_0x0035:
            ni0.p r4 = r3.f62063v     // Catch:{ IOException -> 0x003a }
            r4.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            java.net.Socket r4 = r3.f62062u     // Catch:{ IOException -> 0x003f }
            r4.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            java.util.concurrent.ScheduledThreadPoolExecutor r4 = r3.f62050i
            r4.shutdown()
            java.util.concurrent.ThreadPoolExecutor r4 = r3.f62051j
            r4.shutdown()
            return
        L_0x004a:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ni0.C24510d.mo60758a(okhttp3.internal.http2.ErrorCode, okhttp3.internal.http2.ErrorCode, java.io.IOException):void");
    }

    /* renamed from: c */
    public final void mo60759c(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        mo60758a(errorCode, errorCode, iOException);
    }

    public final void close() {
        mo60758a(ErrorCode.NO_ERROR, ErrorCode.CANCEL, (IOException) null);
    }

    /* renamed from: e */
    public final synchronized C24531o mo60761e(int i) {
        return (C24531o) this.f62045d.get(Integer.valueOf(i));
    }

    /* renamed from: f */
    public final synchronized void mo60762f(C23608b bVar) {
        if (!this.f62049h) {
            this.f62051j.execute(bVar);
        }
    }

    public final void flush() throws IOException {
        C24535p pVar = this.f62063v;
        synchronized (pVar) {
            if (!pVar.f62152f) {
                pVar.f62148b.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    /* renamed from: j */
    public final synchronized C24531o mo60764j(int i) {
        C24531o oVar;
        oVar = (C24531o) this.f62045d.remove(Integer.valueOf(i));
        notifyAll();
        return oVar;
    }

    /* renamed from: k */
    public final void mo60765k(ErrorCode errorCode) throws IOException {
        synchronized (this.f62063v) {
            synchronized (this) {
                if (!this.f62049h) {
                    this.f62049h = true;
                    int i = this.f62047f;
                    this.f62063v.mo60793f(i, errorCode, C23610d.f59684a);
                }
            }
        }
    }

    /* renamed from: n */
    public final synchronized void mo60766n(long j) {
        long j2 = this.f62058q + j;
        this.f62058q = j2;
        if (j2 >= ((long) (this.f62060s.mo12501a() / 2))) {
            mo60769q(0, this.f62058q);
            this.f62058q = 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.f62063v.f62151e);
        r6 = (long) r3;
        r8.f62059r -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0062, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0056 */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60767o(int r9, boolean r10, si0.C24898f r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            ni0.p r12 = r8.f62063v
            r12.mo60790c(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0065
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.f62059r     // Catch:{ InterruptedException -> 0x0056 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0030
            java.util.LinkedHashMap r3 = r8.f62045d     // Catch:{ InterruptedException -> 0x0056 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0056 }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x0056 }
            if (r3 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x0056 }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0056 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0056 }
            throw r9     // Catch:{ InterruptedException -> 0x0056 }
        L_0x0030:
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0054 }
            int r4 = (int) r3     // Catch:{ all -> 0x0054 }
            ni0.p r3 = r8.f62063v     // Catch:{ all -> 0x0054 }
            int r3 = r3.f62151e     // Catch:{ all -> 0x0054 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0054 }
            long r4 = r8.f62059r     // Catch:{ all -> 0x0054 }
            long r6 = (long) r3     // Catch:{ all -> 0x0054 }
            long r4 = r4 - r6
            r8.f62059r = r4     // Catch:{ all -> 0x0054 }
            monitor-exit(r8)     // Catch:{ all -> 0x0054 }
            long r12 = r12 - r6
            ni0.p r4 = r8.f62063v
            if (r10 == 0) goto L_0x004f
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x004f
            r5 = 1
            goto L_0x0050
        L_0x004f:
            r5 = 0
        L_0x0050:
            r4.mo60790c(r5, r9, r11, r3)
            goto L_0x000d
        L_0x0054:
            r9 = move-exception
            goto L_0x0063
        L_0x0056:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0054 }
            r9.interrupt()     // Catch:{ all -> 0x0054 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0054 }
            r9.<init>()     // Catch:{ all -> 0x0054 }
            throw r9     // Catch:{ all -> 0x0054 }
        L_0x0063:
            monitor-exit(r8)     // Catch:{ all -> 0x0054 }
            throw r9
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni0.C24510d.mo60767o(int, boolean, si0.f, long):void");
    }

    /* renamed from: p */
    public final void mo60768p(int i, ErrorCode errorCode) {
        try {
            this.f62050i.execute(new C24511a(new Object[]{this.f62046e, Integer.valueOf(i)}, i, errorCode));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* renamed from: q */
    public final void mo60769q(int i, long j) {
        try {
            this.f62050i.execute(new C24512b(new Object[]{this.f62046e, Integer.valueOf(i)}, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }
}
