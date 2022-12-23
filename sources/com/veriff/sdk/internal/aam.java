package com.veriff.sdk.internal;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import p001a0.C0016g;

public final class aam {

    /* renamed from: j */
    public static final /* synthetic */ boolean f53457j = true;

    /* renamed from: a */
    public long f53458a = 0;

    /* renamed from: b */
    public long f53459b;

    /* renamed from: c */
    public final int f53460c;

    /* renamed from: d */
    public final aaj f53461d;

    /* renamed from: e */
    public final C21306a f53462e;

    /* renamed from: f */
    public final C21308c f53463f;

    /* renamed from: g */
    public final C21308c f53464g;

    /* renamed from: h */
    public aaf f53465h;

    /* renamed from: i */
    public IOException f53466i;

    /* renamed from: k */
    private final Deque<C22736yk> f53467k;

    /* renamed from: l */
    private boolean f53468l;

    /* renamed from: m */
    private final C21307b f53469m;

    /* renamed from: com.veriff.sdk.internal.aam$b */
    public final class C21307b implements aca {

        /* renamed from: c */
        public static final /* synthetic */ boolean f53475c = true;

        /* renamed from: a */
        public boolean f53476a;

        /* renamed from: b */
        public boolean f53477b;

        /* renamed from: e */
        private final abi f53479e = new abi();

        /* renamed from: f */
        private final abi f53480f = new abi();

        /* renamed from: g */
        private final long f53481g;

        public C21307b(long j) {
            this.f53481g = j;
        }

        public void close() throws IOException {
            long b;
            synchronized (aam.this) {
                this.f53476a = true;
                b = this.f53480f.mo53864b();
                this.f53480f.mo53920v();
                aam.this.notifyAll();
            }
            if (b > 0) {
                m50177a(b);
            }
            aam.this.mo53749i();
        }

        /* renamed from: a */
        public long mo53671a(abi abi, long j) throws IOException {
            Throwable th;
            long a;
            if (j >= 0) {
                while (true) {
                    th = null;
                    synchronized (aam.this) {
                        aam.this.f53463f.mo53838c();
                        try {
                            aam aam = aam.this;
                            if (aam.f53465h != null) {
                                th = aam.f53466i;
                                if (th == null) {
                                    th = new aar(aam.this.f53465h);
                                }
                            }
                            if (this.f53476a) {
                                throw new IOException("stream closed");
                            } else if (this.f53480f.mo53864b() > 0) {
                                abi abi2 = this.f53480f;
                                a = abi2.mo53671a(abi, Math.min(j, abi2.mo53864b()));
                                aam aam2 = aam.this;
                                long j2 = aam2.f53458a + a;
                                aam2.f53458a = j2;
                                if (th == null && j2 >= ((long) (aam2.f53461d.f53380j.mo53786d() / 2))) {
                                    aam aam3 = aam.this;
                                    aam3.f53461d.mo53693a(aam3.f53460c, aam3.f53458a);
                                    aam.this.f53458a = 0;
                                }
                            } else if (this.f53477b || th != null) {
                                a = -1;
                            } else {
                                aam.this.mo53751k();
                            }
                        } finally {
                            aam.this.f53463f.mo53755b();
                        }
                    }
                }
                aam.this.f53463f.mo53755b();
                if (a != -1) {
                    m50177a(a);
                    return a;
                } else if (th == null) {
                    return -1;
                } else {
                    throw th;
                }
            } else {
                throw new IllegalArgumentException(C0016g.m29l("byteCount < 0: ", j));
            }
        }

        /* renamed from: a */
        private void m50177a(long j) {
            if (f53475c || !Thread.holdsLock(aam.this)) {
                aam.this.f53461d.mo53700a(j);
                return;
            }
            throw new AssertionError();
        }

        /* renamed from: a */
        public void mo53752a(abk abk, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            if (f53475c || !Thread.holdsLock(aam.this)) {
                while (j > 0) {
                    synchronized (aam.this) {
                        z = this.f53477b;
                        z2 = true;
                        z3 = this.f53480f.mo53864b() + j > this.f53481g;
                    }
                    if (z3) {
                        abk.mo53900i(j);
                        aam.this.mo53737a(aaf.FLOW_CONTROL_ERROR);
                        return;
                    } else if (z) {
                        abk.mo53900i(j);
                        return;
                    } else {
                        long a = abk.mo53671a(this.f53479e, j);
                        if (a != -1) {
                            j -= a;
                            synchronized (aam.this) {
                                if (this.f53476a) {
                                    j2 = this.f53479e.mo53864b();
                                    this.f53479e.mo53920v();
                                } else {
                                    if (this.f53480f.mo53864b() != 0) {
                                        z2 = false;
                                    }
                                    this.f53480f.mo53850a((aca) this.f53479e);
                                    if (z2) {
                                        aam.this.notifyAll();
                                    }
                                    j2 = 0;
                                }
                            }
                            if (j2 > 0) {
                                m50177a(j2);
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                }
                return;
            }
            throw new AssertionError();
        }

        /* renamed from: a */
        public acb mo53672a() {
            return aam.this.f53463f;
        }
    }

    public aam(int i, aaj aaj, boolean z, boolean z2, C22736yk ykVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f53467k = arrayDeque;
        this.f53463f = new C21308c();
        this.f53464g = new C21308c();
        if (aaj != null) {
            this.f53460c = i;
            this.f53461d = aaj;
            this.f53459b = (long) aaj.f53381k.mo53786d();
            C21307b bVar = new C21307b((long) aaj.f53380j.mo53786d());
            this.f53469m = bVar;
            C21306a aVar = new C21306a();
            this.f53462e = aVar;
            bVar.f53477b = z2;
            aVar.f53472b = z;
            if (ykVar != null) {
                arrayDeque.add(ykVar);
            }
            if (mo53743c() && ykVar != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            } else if (!mo53743c() && ykVar == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            throw new NullPointerException("connection == null");
        }
    }

    /* renamed from: a */
    public int mo53735a() {
        return this.f53460c;
    }

    /* renamed from: b */
    public synchronized boolean mo53742b() {
        if (this.f53465h != null) {
            return false;
        }
        C21307b bVar = this.f53469m;
        if (bVar.f53477b || bVar.f53476a) {
            C21306a aVar = this.f53462e;
            if ((aVar.f53472b || aVar.f53471a) && this.f53468l) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo53743c() {
        boolean z;
        if ((this.f53460c & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.f53461d.f53371a == z) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        r2.f53463f.mo53755b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.veriff.sdk.internal.C22736yk mo53744d() throws java.io.IOException {
        /*
            r2 = this;
            monitor-enter(r2)
            com.veriff.sdk.internal.aam$c r0 = r2.f53463f     // Catch:{ all -> 0x0041 }
            r0.mo53838c()     // Catch:{ all -> 0x0041 }
        L_0x0006:
            java.util.Deque<com.veriff.sdk.internal.yk> r0 = r2.f53467k     // Catch:{ all -> 0x003a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0016
            com.veriff.sdk.internal.aaf r0 = r2.f53465h     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0016
            r2.mo53751k()     // Catch:{ all -> 0x003a }
            goto L_0x0006
        L_0x0016:
            com.veriff.sdk.internal.aam$c r0 = r2.f53463f     // Catch:{ all -> 0x0041 }
            r0.mo53755b()     // Catch:{ all -> 0x0041 }
            java.util.Deque<com.veriff.sdk.internal.yk> r0 = r2.f53467k     // Catch:{ all -> 0x0041 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x002d
            java.util.Deque<com.veriff.sdk.internal.yk> r0 = r2.f53467k     // Catch:{ all -> 0x0041 }
            java.lang.Object r0 = r0.removeFirst()     // Catch:{ all -> 0x0041 }
            com.veriff.sdk.internal.yk r0 = (com.veriff.sdk.internal.C22736yk) r0     // Catch:{ all -> 0x0041 }
            monitor-exit(r2)
            return r0
        L_0x002d:
            java.io.IOException r0 = r2.f53466i     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0032
            goto L_0x0039
        L_0x0032:
            com.veriff.sdk.internal.aar r0 = new com.veriff.sdk.internal.aar     // Catch:{ all -> 0x0041 }
            com.veriff.sdk.internal.aaf r1 = r2.f53465h     // Catch:{ all -> 0x0041 }
            r0.<init>(r1)     // Catch:{ all -> 0x0041 }
        L_0x0039:
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x003a:
            r0 = move-exception
            com.veriff.sdk.internal.aam$c r1 = r2.f53463f     // Catch:{ all -> 0x0041 }
            r1.mo53755b()     // Catch:{ all -> 0x0041 }
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.aam.mo53744d():com.veriff.sdk.internal.yk");
    }

    /* renamed from: e */
    public acb mo53745e() {
        return this.f53463f;
    }

    /* renamed from: f */
    public acb mo53746f() {
        return this.f53464g;
    }

    /* renamed from: g */
    public aca mo53747g() {
        return this.f53469m;
    }

    /* renamed from: h */
    public abz mo53748h() {
        synchronized (this) {
            if (!this.f53468l) {
                if (!mo53743c()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f53462e;
    }

    /* renamed from: i */
    public void mo53749i() throws IOException {
        boolean z;
        boolean b;
        if (f53457j || !Thread.holdsLock(this)) {
            synchronized (this) {
                C21307b bVar = this.f53469m;
                if (!bVar.f53477b && bVar.f53476a) {
                    C21306a aVar = this.f53462e;
                    if (aVar.f53472b || aVar.f53471a) {
                        z = true;
                        b = mo53742b();
                    }
                }
                z = false;
                b = mo53742b();
            }
            if (z) {
                mo53738a(aaf.CANCEL, (IOException) null);
            } else if (!b) {
                this.f53461d.mo53705b(this.f53460c);
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: j */
    public void mo53750j() throws IOException {
        C21306a aVar = this.f53462e;
        if (aVar.f53471a) {
            throw new IOException("stream closed");
        } else if (aVar.f53472b) {
            throw new IOException("stream finished");
        } else if (this.f53465h != null) {
            Throwable th = this.f53466i;
            if (th == null) {
                th = new aar(this.f53465h);
            }
            throw th;
        }
    }

    /* renamed from: k */
    public void mo53751k() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: com.veriff.sdk.internal.aam$c */
    public class C21308c extends abg {
        public C21308c() {
        }

        /* renamed from: a */
        public void mo53754a() {
            aam.this.mo53737a(aaf.CANCEL);
            aam.this.f53461d.mo53713d();
        }

        /* renamed from: b */
        public void mo53755b() throws IOException {
            if (mo53839n_()) {
                throw mo53753a((IOException) null);
            }
        }

        /* renamed from: a */
        public IOException mo53753a(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    /* renamed from: a */
    public void mo53738a(aaf aaf, IOException iOException) throws IOException {
        if (m50155b(aaf, iOException)) {
            this.f53461d.mo53707b(this.f53460c, aaf);
        }
    }

    /* renamed from: a */
    public void mo53737a(aaf aaf) {
        if (m50155b(aaf, (IOException) null)) {
            this.f53461d.mo53694a(this.f53460c, aaf);
        }
    }

    /* renamed from: b */
    private boolean m50155b(aaf aaf, IOException iOException) {
        if (f53457j || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.f53465h != null) {
                    return false;
                }
                if (this.f53469m.f53477b && this.f53462e.f53472b) {
                    return false;
                }
                this.f53465h = aaf;
                this.f53466i = iOException;
                notifyAll();
                this.f53461d.mo53705b(this.f53460c);
                return true;
            }
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public void mo53739a(abk abk, int i) throws IOException {
        if (f53457j || !Thread.holdsLock(this)) {
            this.f53469m.mo53752a(abk, (long) i);
            return;
        }
        throw new AssertionError();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0029  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo53740a(com.veriff.sdk.internal.C22736yk r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = f53457j
            if (r0 != 0) goto L_0x0011
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L_0x000b
            goto L_0x0011
        L_0x000b:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L_0x0011:
            monitor-enter(r2)
            boolean r0 = r2.f53468l     // Catch:{ all -> 0x003f }
            r1 = 1
            if (r0 == 0) goto L_0x0020
            if (r4 != 0) goto L_0x001a
            goto L_0x0020
        L_0x001a:
            com.veriff.sdk.internal.aam$b r0 = r2.f53469m     // Catch:{ all -> 0x003f }
            com.veriff.sdk.internal.C22736yk unused = r0.getClass()     // Catch:{ all -> 0x003f }
            goto L_0x0027
        L_0x0020:
            r2.f53468l = r1     // Catch:{ all -> 0x003f }
            java.util.Deque<com.veriff.sdk.internal.yk> r0 = r2.f53467k     // Catch:{ all -> 0x003f }
            r0.add(r3)     // Catch:{ all -> 0x003f }
        L_0x0027:
            if (r4 == 0) goto L_0x002d
            com.veriff.sdk.internal.aam$b r3 = r2.f53469m     // Catch:{ all -> 0x003f }
            r3.f53477b = r1     // Catch:{ all -> 0x003f }
        L_0x002d:
            boolean r3 = r2.mo53742b()     // Catch:{ all -> 0x003f }
            r2.notifyAll()     // Catch:{ all -> 0x003f }
            monitor-exit(r2)     // Catch:{ all -> 0x003f }
            if (r3 != 0) goto L_0x003e
            com.veriff.sdk.internal.aaj r3 = r2.f53461d
            int r4 = r2.f53460c
            r3.mo53705b((int) r4)
        L_0x003e:
            return
        L_0x003f:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.aam.mo53740a(com.veriff.sdk.internal.yk, boolean):void");
    }

    /* renamed from: com.veriff.sdk.internal.aam$a */
    public final class C21306a implements abz {

        /* renamed from: c */
        public static final /* synthetic */ boolean f53470c = true;

        /* renamed from: a */
        public boolean f53471a;

        /* renamed from: b */
        public boolean f53472b;

        /* renamed from: e */
        private final abi f53474e = new abi();

        public C21306a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r1.f53464g.mo53755b();
            r11.f53473d.mo53750j();
            r9 = java.lang.Math.min(r11.f53473d.f53459b, r11.f53474e.mo53864b());
            r1 = r11.f53473d;
            r1.f53459b -= r9;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m50173a(boolean r12) throws java.io.IOException {
            /*
                r11 = this;
                com.veriff.sdk.internal.aam r0 = com.veriff.sdk.internal.aam.this
                monitor-enter(r0)
                com.veriff.sdk.internal.aam r1 = com.veriff.sdk.internal.aam.this     // Catch:{ all -> 0x0080 }
                com.veriff.sdk.internal.aam$c r1 = r1.f53464g     // Catch:{ all -> 0x0080 }
                r1.mo53838c()     // Catch:{ all -> 0x0080 }
            L_0x000a:
                com.veriff.sdk.internal.aam r1 = com.veriff.sdk.internal.aam.this     // Catch:{ all -> 0x0077 }
                long r2 = r1.f53459b     // Catch:{ all -> 0x0077 }
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 > 0) goto L_0x0024
                boolean r2 = r11.f53472b     // Catch:{ all -> 0x0077 }
                if (r2 != 0) goto L_0x0024
                boolean r2 = r11.f53471a     // Catch:{ all -> 0x0077 }
                if (r2 != 0) goto L_0x0024
                com.veriff.sdk.internal.aaf r2 = r1.f53465h     // Catch:{ all -> 0x0077 }
                if (r2 != 0) goto L_0x0024
                r1.mo53751k()     // Catch:{ all -> 0x0077 }
                goto L_0x000a
            L_0x0024:
                com.veriff.sdk.internal.aam$c r1 = r1.f53464g     // Catch:{ all -> 0x0080 }
                r1.mo53755b()     // Catch:{ all -> 0x0080 }
                com.veriff.sdk.internal.aam r1 = com.veriff.sdk.internal.aam.this     // Catch:{ all -> 0x0080 }
                r1.mo53750j()     // Catch:{ all -> 0x0080 }
                com.veriff.sdk.internal.aam r1 = com.veriff.sdk.internal.aam.this     // Catch:{ all -> 0x0080 }
                long r1 = r1.f53459b     // Catch:{ all -> 0x0080 }
                com.veriff.sdk.internal.abi r3 = r11.f53474e     // Catch:{ all -> 0x0080 }
                long r3 = r3.mo53864b()     // Catch:{ all -> 0x0080 }
                long r9 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x0080 }
                com.veriff.sdk.internal.aam r1 = com.veriff.sdk.internal.aam.this     // Catch:{ all -> 0x0080 }
                long r2 = r1.f53459b     // Catch:{ all -> 0x0080 }
                long r2 = r2 - r9
                r1.f53459b = r2     // Catch:{ all -> 0x0080 }
                monitor-exit(r0)     // Catch:{ all -> 0x0080 }
                com.veriff.sdk.internal.aam$c r0 = r1.f53464g
                r0.mo53838c()
                if (r12 == 0) goto L_0x005a
                com.veriff.sdk.internal.abi r12 = r11.f53474e     // Catch:{ all -> 0x0058 }
                long r0 = r12.mo53864b()     // Catch:{ all -> 0x0058 }
                int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r12 != 0) goto L_0x005a
                r12 = 1
                r7 = 1
                goto L_0x005c
            L_0x0058:
                r12 = move-exception
                goto L_0x006f
            L_0x005a:
                r12 = 0
                r7 = 0
            L_0x005c:
                com.veriff.sdk.internal.aam r12 = com.veriff.sdk.internal.aam.this     // Catch:{ all -> 0x0058 }
                com.veriff.sdk.internal.aaj r5 = r12.f53461d     // Catch:{ all -> 0x0058 }
                int r6 = r12.f53460c     // Catch:{ all -> 0x0058 }
                com.veriff.sdk.internal.abi r8 = r11.f53474e     // Catch:{ all -> 0x0058 }
                r5.mo53698a((int) r6, (boolean) r7, (com.veriff.sdk.internal.abi) r8, (long) r9)     // Catch:{ all -> 0x0058 }
                com.veriff.sdk.internal.aam r12 = com.veriff.sdk.internal.aam.this
                com.veriff.sdk.internal.aam$c r12 = r12.f53464g
                r12.mo53755b()
                return
            L_0x006f:
                com.veriff.sdk.internal.aam r0 = com.veriff.sdk.internal.aam.this
                com.veriff.sdk.internal.aam$c r0 = r0.f53464g
                r0.mo53755b()
                throw r12
            L_0x0077:
                r12 = move-exception
                com.veriff.sdk.internal.aam r1 = com.veriff.sdk.internal.aam.this     // Catch:{ all -> 0x0080 }
                com.veriff.sdk.internal.aam$c r1 = r1.f53464g     // Catch:{ all -> 0x0080 }
                r1.mo53755b()     // Catch:{ all -> 0x0080 }
                throw r12     // Catch:{ all -> 0x0080 }
            L_0x0080:
                r12 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0080 }
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.aam.C21306a.m50173a(boolean):void");
        }

        /* renamed from: a_ */
        public void mo53675a_(abi abi, long j) throws IOException {
            if (f53470c || !Thread.holdsLock(aam.this)) {
                this.f53474e.mo53675a_(abi, j);
                while (this.f53474e.mo53864b() >= 16384) {
                    m50173a(false);
                }
                return;
            }
            throw new AssertionError();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
            if (r8.f53473d.f53462e.f53472b != false) goto L_0x0052;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
            if (r8.f53474e.mo53864b() <= 0) goto L_0x0034;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
            if (r0 == false) goto L_0x0045;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
            if (r8.f53474e.mo53864b() <= 0) goto L_0x0052;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
            m50173a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
            r0 = r8.f53473d;
            r0.f53461d.mo53698a(r0.f53460c, true, (com.veriff.sdk.internal.abi) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
            r2 = r8.f53473d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            r8.f53471a = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0057, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0058, code lost:
            r8.f53473d.f53461d.mo53706b();
            r8.f53473d.mo53749i();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() throws java.io.IOException {
            /*
                r8 = this;
                boolean r0 = f53470c
                if (r0 != 0) goto L_0x0013
                com.veriff.sdk.internal.aam r0 = com.veriff.sdk.internal.aam.this
                boolean r0 = java.lang.Thread.holdsLock(r0)
                if (r0 != 0) goto L_0x000d
                goto L_0x0013
            L_0x000d:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
            L_0x0013:
                com.veriff.sdk.internal.aam r0 = com.veriff.sdk.internal.aam.this
                monitor-enter(r0)
                boolean r1 = r8.f53471a     // Catch:{ all -> 0x0068 }
                if (r1 == 0) goto L_0x001c
                monitor-exit(r0)     // Catch:{ all -> 0x0068 }
                return
            L_0x001c:
                monitor-exit(r0)     // Catch:{ all -> 0x0068 }
                com.veriff.sdk.internal.aam r0 = com.veriff.sdk.internal.aam.this
                com.veriff.sdk.internal.aam$a r0 = r0.f53462e
                boolean r0 = r0.f53472b
                r1 = 1
                if (r0 != 0) goto L_0x0052
                com.veriff.sdk.internal.abi r0 = r8.f53474e
                long r2 = r0.mo53864b()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x0034
                r0 = 1
                goto L_0x0035
            L_0x0034:
                r0 = 0
            L_0x0035:
                if (r0 == 0) goto L_0x0045
            L_0x0037:
                com.veriff.sdk.internal.abi r0 = r8.f53474e
                long r2 = r0.mo53864b()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x0052
                r8.m50173a(r1)
                goto L_0x0037
            L_0x0045:
                com.veriff.sdk.internal.aam r0 = com.veriff.sdk.internal.aam.this
                com.veriff.sdk.internal.aaj r2 = r0.f53461d
                int r3 = r0.f53460c
                r4 = 1
                r5 = 0
                r6 = 0
                r2.mo53698a((int) r3, (boolean) r4, (com.veriff.sdk.internal.abi) r5, (long) r6)
            L_0x0052:
                com.veriff.sdk.internal.aam r2 = com.veriff.sdk.internal.aam.this
                monitor-enter(r2)
                r8.f53471a = r1     // Catch:{ all -> 0x0065 }
                monitor-exit(r2)     // Catch:{ all -> 0x0065 }
                com.veriff.sdk.internal.aam r0 = com.veriff.sdk.internal.aam.this
                com.veriff.sdk.internal.aaj r0 = r0.f53461d
                r0.mo53706b()
                com.veriff.sdk.internal.aam r0 = com.veriff.sdk.internal.aam.this
                r0.mo53749i()
                return
            L_0x0065:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0065 }
                throw r0
            L_0x0068:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0068 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.aam.C21306a.close():void");
        }

        public void flush() throws IOException {
            if (f53470c || !Thread.holdsLock(aam.this)) {
                synchronized (aam.this) {
                    aam.this.mo53750j();
                }
                while (this.f53474e.mo53864b() > 0) {
                    m50173a(false);
                    aam.this.f53461d.mo53706b();
                }
                return;
            }
            throw new AssertionError();
        }

        /* renamed from: a */
        public acb mo53674a() {
            return aam.this.f53464g;
        }
    }

    /* renamed from: b */
    public synchronized void mo53741b(aaf aaf) {
        if (this.f53465h == null) {
            this.f53465h = aaf;
            notifyAll();
        }
    }

    /* renamed from: a */
    public void mo53736a(long j) {
        this.f53459b += j;
        if (j > 0) {
            notifyAll();
        }
    }
}
