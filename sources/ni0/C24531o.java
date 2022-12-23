package ni0;

import hi0.C23556q;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.concurrent.RejectedExecutionException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import p001a0.C0016g;
import si0.C24887a0;
import si0.C24888b;
import si0.C24893c0;
import si0.C24895d0;
import si0.C24898f;

/* renamed from: ni0.o */
public final class C24531o {

    /* renamed from: a */
    public long f62124a = 0;

    /* renamed from: b */
    public long f62125b;

    /* renamed from: c */
    public final int f62126c;

    /* renamed from: d */
    public final C24510d f62127d;

    /* renamed from: e */
    public final ArrayDeque f62128e;

    /* renamed from: f */
    public boolean f62129f;

    /* renamed from: g */
    public final C24533b f62130g;

    /* renamed from: h */
    public final C24532a f62131h;

    /* renamed from: i */
    public final C24534c f62132i;

    /* renamed from: j */
    public final C24534c f62133j;

    /* renamed from: k */
    public ErrorCode f62134k;

    /* renamed from: l */
    public IOException f62135l;

    /* renamed from: ni0.o$a */
    public final class C24532a implements C24887a0 {

        /* renamed from: b */
        public final C24898f f62136b = new C24898f();

        /* renamed from: c */
        public boolean f62137c;

        /* renamed from: d */
        public boolean f62138d;

        public C24532a() {
        }

        /* renamed from: E */
        public final C24895d0 mo60537E() {
            return C24531o.this.f62133j;
        }

        /* renamed from: P */
        public final void mo58998P(C24898f fVar, long j) throws IOException {
            this.f62136b.mo58998P(fVar, j);
            while (this.f62136b.f62947c >= 16384) {
                mo60786a(false);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r1.f62133j.mo60788l();
            r11.f62139e.mo60778b();
            r9 = java.lang.Math.min(r11.f62139e.f62125b, r11.f62136b.f62947c);
            r1 = r11.f62139e;
            r1.f62125b -= r9;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo60786a(boolean r12) throws java.io.IOException {
            /*
                r11 = this;
                ni0.o r0 = ni0.C24531o.this
                monitor-enter(r0)
                ni0.o r1 = ni0.C24531o.this     // Catch:{ all -> 0x007c }
                ni0.o$c r1 = r1.f62133j     // Catch:{ all -> 0x007c }
                r1.mo61362h()     // Catch:{ all -> 0x007c }
            L_0x000a:
                ni0.o r1 = ni0.C24531o.this     // Catch:{ all -> 0x0073 }
                long r2 = r1.f62125b     // Catch:{ all -> 0x0073 }
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 > 0) goto L_0x0024
                boolean r2 = r11.f62138d     // Catch:{ all -> 0x0073 }
                if (r2 != 0) goto L_0x0024
                boolean r2 = r11.f62137c     // Catch:{ all -> 0x0073 }
                if (r2 != 0) goto L_0x0024
                okhttp3.internal.http2.ErrorCode r2 = r1.f62134k     // Catch:{ all -> 0x0073 }
                if (r2 != 0) goto L_0x0024
                r1.mo60785i()     // Catch:{ all -> 0x0073 }
                goto L_0x000a
            L_0x0024:
                ni0.o$c r1 = r1.f62133j     // Catch:{ all -> 0x007c }
                r1.mo60788l()     // Catch:{ all -> 0x007c }
                ni0.o r1 = ni0.C24531o.this     // Catch:{ all -> 0x007c }
                r1.mo60778b()     // Catch:{ all -> 0x007c }
                ni0.o r1 = ni0.C24531o.this     // Catch:{ all -> 0x007c }
                long r1 = r1.f62125b     // Catch:{ all -> 0x007c }
                si0.f r3 = r11.f62136b     // Catch:{ all -> 0x007c }
                long r3 = r3.f62947c     // Catch:{ all -> 0x007c }
                long r9 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x007c }
                ni0.o r1 = ni0.C24531o.this     // Catch:{ all -> 0x007c }
                long r2 = r1.f62125b     // Catch:{ all -> 0x007c }
                long r2 = r2 - r9
                r1.f62125b = r2     // Catch:{ all -> 0x007c }
                monitor-exit(r0)     // Catch:{ all -> 0x007c }
                ni0.o$c r0 = r1.f62133j
                r0.mo61362h()
                if (r12 == 0) goto L_0x0056
                si0.f r12 = r11.f62136b     // Catch:{ all -> 0x0054 }
                long r0 = r12.f62947c     // Catch:{ all -> 0x0054 }
                int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r12 != 0) goto L_0x0056
                r12 = 1
                r7 = 1
                goto L_0x0058
            L_0x0054:
                r12 = move-exception
                goto L_0x006b
            L_0x0056:
                r12 = 0
                r7 = 0
            L_0x0058:
                ni0.o r12 = ni0.C24531o.this     // Catch:{ all -> 0x0054 }
                ni0.d r5 = r12.f62127d     // Catch:{ all -> 0x0054 }
                int r6 = r12.f62126c     // Catch:{ all -> 0x0054 }
                si0.f r8 = r11.f62136b     // Catch:{ all -> 0x0054 }
                r5.mo60767o(r6, r7, r8, r9)     // Catch:{ all -> 0x0054 }
                ni0.o r12 = ni0.C24531o.this
                ni0.o$c r12 = r12.f62133j
                r12.mo60788l()
                return
            L_0x006b:
                ni0.o r0 = ni0.C24531o.this
                ni0.o$c r0 = r0.f62133j
                r0.mo60788l()
                throw r12
            L_0x0073:
                r12 = move-exception
                ni0.o r1 = ni0.C24531o.this     // Catch:{ all -> 0x007c }
                ni0.o$c r1 = r1.f62133j     // Catch:{ all -> 0x007c }
                r1.mo60788l()     // Catch:{ all -> 0x007c }
                throw r12     // Catch:{ all -> 0x007c }
            L_0x007c:
                r12 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x007c }
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: ni0.C24531o.C24532a.mo60786a(boolean):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            if (r13.f62136b.f62947c <= 0) goto L_0x001f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
            r1 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
            r1 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
            if (r1 == false) goto L_0x002e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
            if (r13.f62136b.f62947c <= 0) goto L_0x0039;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
            mo60786a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
            r0.f62127d.mo60767o(r0.f62126c, true, (si0.C24898f) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
            r1 = r13.f62139e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r13.f62137c = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
            r13.f62139e.f62127d.flush();
            r13.f62139e.mo60777a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
            r0 = r13.f62139e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r0.f62131h.f62138d != false) goto L_0x0039;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void close() throws java.io.IOException {
            /*
                r13 = this;
                ni0.o r0 = ni0.C24531o.this
                monitor-enter(r0)
                boolean r1 = r13.f62137c     // Catch:{ all -> 0x004f }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x004f }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x004f }
                ni0.o r0 = ni0.C24531o.this
                ni0.o$a r1 = r0.f62131h
                boolean r1 = r1.f62138d
                r2 = 1
                if (r1 != 0) goto L_0x0039
                si0.f r1 = r13.f62136b
                long r3 = r1.f62947c
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 <= 0) goto L_0x001f
                r1 = 1
                goto L_0x0020
            L_0x001f:
                r1 = 0
            L_0x0020:
                if (r1 == 0) goto L_0x002e
            L_0x0022:
                si0.f r0 = r13.f62136b
                long r0 = r0.f62947c
                int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r3 <= 0) goto L_0x0039
                r13.mo60786a(r2)
                goto L_0x0022
            L_0x002e:
                ni0.d r7 = r0.f62127d
                int r8 = r0.f62126c
                r9 = 1
                r10 = 0
                r11 = 0
                r7.mo60767o(r8, r9, r10, r11)
            L_0x0039:
                ni0.o r1 = ni0.C24531o.this
                monitor-enter(r1)
                r13.f62137c = r2     // Catch:{ all -> 0x004c }
                monitor-exit(r1)     // Catch:{ all -> 0x004c }
                ni0.o r0 = ni0.C24531o.this
                ni0.d r0 = r0.f62127d
                r0.flush()
                ni0.o r0 = ni0.C24531o.this
                r0.mo60777a()
                return
            L_0x004c:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x004c }
                throw r0
            L_0x004f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004f }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ni0.C24531o.C24532a.close():void");
        }

        public final void flush() throws IOException {
            synchronized (C24531o.this) {
                C24531o.this.mo60778b();
            }
            while (this.f62136b.f62947c > 0) {
                mo60786a(false);
                C24531o.this.f62127d.flush();
            }
        }
    }

    /* renamed from: ni0.o$b */
    public final class C24533b implements C24893c0 {

        /* renamed from: b */
        public final C24898f f62140b = new C24898f();

        /* renamed from: c */
        public final C24898f f62141c = new C24898f();

        /* renamed from: d */
        public final long f62142d;

        /* renamed from: e */
        public boolean f62143e;

        /* renamed from: f */
        public boolean f62144f;

        public C24533b(long j) {
            this.f62142d = j;
        }

        /* renamed from: E */
        public final C24895d0 mo58974E() {
            return C24531o.this.f62132i;
        }

        public final void close() throws IOException {
            long j;
            synchronized (C24531o.this) {
                this.f62143e = true;
                C24898f fVar = this.f62141c;
                j = fVar.f62947c;
                fVar.mo61413i();
                C24531o.this.notifyAll();
            }
            if (j > 0) {
                C24531o.this.f62127d.mo60766n(j);
            }
            C24531o.this.mo60777a();
        }

        /* renamed from: m */
        public final long mo53601m(C24898f fVar, long j) throws IOException {
            Throwable th;
            long m;
            if (j >= 0) {
                while (true) {
                    th = null;
                    synchronized (C24531o.this) {
                        C24531o.this.f62132i.mo61362h();
                        try {
                            C24531o oVar = C24531o.this;
                            if (oVar.f62134k != null) {
                                th = oVar.f62135l;
                                if (th == null) {
                                    th = new StreamResetException(C24531o.this.f62134k);
                                }
                            }
                            if (!this.f62143e) {
                                C24898f fVar2 = this.f62141c;
                                long j2 = fVar2.f62947c;
                                if (j2 > 0) {
                                    m = fVar2.mo53601m(fVar, Math.min(j, j2));
                                    C24531o oVar2 = C24531o.this;
                                    long j3 = oVar2.f62124a + m;
                                    oVar2.f62124a = j3;
                                    if (th == null && j3 >= ((long) (oVar2.f62127d.f62060s.mo12501a() / 2))) {
                                        C24531o oVar3 = C24531o.this;
                                        oVar3.f62127d.mo60769q(oVar3.f62126c, oVar3.f62124a);
                                        C24531o.this.f62124a = 0;
                                    }
                                } else if (this.f62144f || th != null) {
                                    m = -1;
                                } else {
                                    C24531o.this.mo60785i();
                                }
                            } else {
                                throw new IOException("stream closed");
                            }
                        } finally {
                            C24531o.this.f62132i.mo60788l();
                        }
                    }
                }
                C24531o.this.f62132i.mo60788l();
                if (m != -1) {
                    C24531o.this.f62127d.mo60766n(m);
                    return m;
                } else if (th == null) {
                    return -1;
                } else {
                    throw th;
                }
            } else {
                throw new IllegalArgumentException(C0016g.m29l("byteCount < 0: ", j));
            }
        }
    }

    /* renamed from: ni0.o$c */
    public class C24534c extends C24888b {
        public C24534c() {
        }

        /* renamed from: j */
        public final IOException mo60787j(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* renamed from: k */
        public final void mo59055k() {
            C24531o.this.mo60781e(ErrorCode.CANCEL);
            C24510d dVar = C24531o.this.f62127d;
            synchronized (dVar) {
                long j = dVar.f62056o;
                long j2 = dVar.f62055n;
                if (j >= j2) {
                    dVar.f62055n = j2 + 1;
                    dVar.f62057p = System.nanoTime() + 1000000000;
                    try {
                        dVar.f62050i.execute(new C24519e(dVar, dVar.f62046e));
                    } catch (RejectedExecutionException unused) {
                    }
                }
            }
        }

        /* renamed from: l */
        public final void mo60788l() throws IOException {
            if (mo61363i()) {
                throw mo60787j((IOException) null);
            }
        }
    }

    public C24531o(int i, C24510d dVar, boolean z, boolean z2, C23556q qVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f62128e = arrayDeque;
        this.f62132i = new C24534c();
        this.f62133j = new C24534c();
        if (dVar != null) {
            this.f62126c = i;
            this.f62127d = dVar;
            this.f62125b = (long) dVar.f62061t.mo12501a();
            C24533b bVar = new C24533b((long) dVar.f62060s.mo12501a());
            this.f62130g = bVar;
            C24532a aVar = new C24532a();
            this.f62131h = aVar;
            bVar.f62144f = z2;
            aVar.f62138d = z;
            if (qVar != null) {
                arrayDeque.add(qVar);
            }
            if (mo60782f() && qVar != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            } else if (!mo60782f() && qVar == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            throw new NullPointerException("connection == null");
        }
    }

    /* renamed from: a */
    public final void mo60777a() throws IOException {
        boolean z;
        boolean g;
        synchronized (this) {
            C24533b bVar = this.f62130g;
            if (!bVar.f62144f && bVar.f62143e) {
                C24532a aVar = this.f62131h;
                if (aVar.f62138d || aVar.f62137c) {
                    z = true;
                    g = mo60783g();
                }
            }
            z = false;
            g = mo60783g();
        }
        if (z) {
            mo60779c(ErrorCode.CANCEL, (IOException) null);
        } else if (!g) {
            this.f62127d.mo60764j(this.f62126c);
        }
    }

    /* renamed from: b */
    public final void mo60778b() throws IOException {
        C24532a aVar = this.f62131h;
        if (aVar.f62137c) {
            throw new IOException("stream closed");
        } else if (aVar.f62138d) {
            throw new IOException("stream finished");
        } else if (this.f62134k != null) {
            Throwable th = this.f62135l;
            if (th == null) {
                th = new StreamResetException(this.f62134k);
            }
            throw th;
        }
    }

    /* renamed from: c */
    public final void mo60779c(ErrorCode errorCode, IOException iOException) throws IOException {
        if (mo60780d(errorCode, iOException)) {
            C24510d dVar = this.f62127d;
            dVar.f62063v.mo60795h(this.f62126c, errorCode);
        }
    }

    /* renamed from: d */
    public final boolean mo60780d(ErrorCode errorCode, IOException iOException) {
        synchronized (this) {
            if (this.f62134k != null) {
                return false;
            }
            if (this.f62130g.f62144f && this.f62131h.f62138d) {
                return false;
            }
            this.f62134k = errorCode;
            this.f62135l = iOException;
            notifyAll();
            this.f62127d.mo60764j(this.f62126c);
            return true;
        }
    }

    /* renamed from: e */
    public final void mo60781e(ErrorCode errorCode) {
        if (mo60780d(errorCode, (IOException) null)) {
            this.f62127d.mo60768p(this.f62126c, errorCode);
        }
    }

    /* renamed from: f */
    public final boolean mo60782f() {
        boolean z;
        if ((this.f62126c & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.f62127d.f62043b == z) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final synchronized boolean mo60783g() {
        if (this.f62134k != null) {
            return false;
        }
        C24533b bVar = this.f62130g;
        if (bVar.f62144f || bVar.f62143e) {
            C24532a aVar = this.f62131h;
            if ((aVar.f62138d || aVar.f62137c) && this.f62129f) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60784h(hi0.C23556q r3, boolean r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f62129f     // Catch:{ all -> 0x002e }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            if (r4 != 0) goto L_0x0009
            goto L_0x000f
        L_0x0009:
            ni0.o$b r3 = r2.f62130g     // Catch:{ all -> 0x002e }
            r3.getClass()     // Catch:{ all -> 0x002e }
            goto L_0x0016
        L_0x000f:
            r2.f62129f = r1     // Catch:{ all -> 0x002e }
            java.util.ArrayDeque r0 = r2.f62128e     // Catch:{ all -> 0x002e }
            r0.add(r3)     // Catch:{ all -> 0x002e }
        L_0x0016:
            if (r4 == 0) goto L_0x001c
            ni0.o$b r3 = r2.f62130g     // Catch:{ all -> 0x002e }
            r3.f62144f = r1     // Catch:{ all -> 0x002e }
        L_0x001c:
            boolean r3 = r2.mo60783g()     // Catch:{ all -> 0x002e }
            r2.notifyAll()     // Catch:{ all -> 0x002e }
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            if (r3 != 0) goto L_0x002d
            ni0.d r3 = r2.f62127d
            int r4 = r2.f62126c
            r3.mo60764j(r4)
        L_0x002d:
            return
        L_0x002e:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ni0.C24531o.mo60784h(hi0.q, boolean):void");
    }

    /* renamed from: i */
    public final void mo60785i() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
