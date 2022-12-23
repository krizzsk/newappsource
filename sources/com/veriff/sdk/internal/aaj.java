package com.veriff.sdk.internal;

import com.veriff.sdk.internal.aal;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p988j$.util.Spliterator;

public final class aaj implements Closeable {

    /* renamed from: p */
    public static final /* synthetic */ boolean f53368p = true;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final ExecutorService f53369q = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C22766za.m55831a("OkHttp Http2Connection", true));

    /* renamed from: A */
    private long f53370A = 0;

    /* renamed from: a */
    public final boolean f53371a;

    /* renamed from: b */
    public final C21297c f53372b;

    /* renamed from: c */
    public final Map<Integer, aam> f53373c = new LinkedHashMap();

    /* renamed from: d */
    public final String f53374d;

    /* renamed from: e */
    public int f53375e;

    /* renamed from: f */
    public int f53376f;

    /* renamed from: g */
    public final aap f53377g;

    /* renamed from: h */
    public long f53378h = 0;

    /* renamed from: i */
    public long f53379i;

    /* renamed from: j */
    public aaq f53380j = new aaq();

    /* renamed from: k */
    public final aaq f53381k;

    /* renamed from: l */
    public final Socket f53382l;

    /* renamed from: m */
    public final aan f53383m;

    /* renamed from: n */
    public final C21300e f53384n;

    /* renamed from: o */
    public final Set<Integer> f53385o;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f53386r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final ScheduledExecutorService f53387s;

    /* renamed from: t */
    private final ExecutorService f53388t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public long f53389u = 0;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public long f53390v = 0;

    /* renamed from: w */
    private long f53391w = 0;

    /* renamed from: x */
    private long f53392x = 0;

    /* renamed from: z */
    private long f53393z = 0;

    /* renamed from: com.veriff.sdk.internal.aaj$b */
    public final class C21296b extends C22764yz {
        public C21296b() {
            super("OkHttp %s ping", aaj.this.f53374d);
        }

        /* renamed from: d */
        public void mo53714d() {
            boolean z;
            synchronized (aaj.this) {
                if (aaj.this.f53390v < aaj.this.f53389u) {
                    z = true;
                } else {
                    aaj.m50055c(aaj.this);
                    z = false;
                }
            }
            if (z) {
                aaj.this.m50051a((IOException) null);
            } else {
                aaj.this.mo53704a(false, 1, 0);
            }
        }
    }

    /* renamed from: com.veriff.sdk.internal.aaj$c */
    public static abstract class C21297c {

        /* renamed from: h */
        public static final C21297c f53425h = new C21297c() {
            /* renamed from: a */
            public void mo53720a(aam aam) throws IOException {
                aam.mo53738a(aaf.REFUSED_STREAM, (IOException) null);
            }
        };

        /* renamed from: a */
        public void mo53719a(aaj aaj) {
        }

        /* renamed from: a */
        public abstract void mo53720a(aam aam) throws IOException;
    }

    /* renamed from: com.veriff.sdk.internal.aaj$d */
    public final class C21299d extends C22764yz {

        /* renamed from: a */
        public final boolean f53426a;

        /* renamed from: b */
        public final int f53427b;

        /* renamed from: d */
        public final int f53428d;

        public C21299d(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", aaj.this.f53374d, Integer.valueOf(i), Integer.valueOf(i2));
            this.f53426a = z;
            this.f53427b = i;
            this.f53428d = i2;
        }

        /* renamed from: d */
        public void mo53714d() {
            aaj.this.mo53704a(this.f53426a, this.f53427b, this.f53428d);
        }
    }

    static {
        Class<aaj> cls = aaj.class;
    }

    public aaj(C21295a aVar) {
        int i;
        C21295a aVar2 = aVar;
        aaq aaq = new aaq();
        this.f53381k = aaq;
        this.f53385o = new LinkedHashSet();
        this.f53377g = aVar2.f53421f;
        boolean z = aVar2.f53422g;
        this.f53371a = z;
        this.f53372b = aVar2.f53420e;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        this.f53376f = i;
        if (z) {
            this.f53376f = i + 2;
        }
        if (z) {
            this.f53380j.mo53778a(7, 16777216);
        }
        String str = aVar2.f53417b;
        this.f53374d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, C22766za.m55831a(C22766za.m55824a("OkHttp %s Writer", str), false));
        this.f53387s = scheduledThreadPoolExecutor;
        if (aVar2.f53423h != 0) {
            C21296b bVar = new C21296b();
            int i2 = aVar2.f53423h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(bVar, (long) i2, (long) i2, TimeUnit.MILLISECONDS);
        }
        this.f53388t = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C22766za.m55831a(C22766za.m55824a("OkHttp %s Push Observer", str), true));
        aaq.mo53778a(7, 65535);
        aaq.mo53778a(5, Spliterator.SUBSIZED);
        this.f53379i = (long) aaq.mo53786d();
        this.f53382l = aVar2.f53416a;
        this.f53383m = new aan(aVar2.f53419d, z);
        this.f53384n = new C21300e(new aal(aVar2.f53418c, z));
    }

    /* renamed from: c */
    public static /* synthetic */ long m50055c(aaj aaj) {
        long j = aaj.f53389u;
        aaj.f53389u = 1 + j;
        return j;
    }

    /* renamed from: f */
    public static /* synthetic */ long m50059f(aaj aaj) {
        long j = aaj.f53390v;
        aaj.f53390v = 1 + j;
        return j;
    }

    /* renamed from: g */
    public static /* synthetic */ long m50060g(aaj aaj) {
        long j = aaj.f53392x;
        aaj.f53392x = 1 + j;
        return j;
    }

    /* renamed from: h */
    public static /* synthetic */ long m50061h(aaj aaj) {
        long j = aaj.f53393z;
        aaj.f53393z = 1 + j;
        return j;
    }

    /* renamed from: c */
    public boolean mo53711c(int i) {
        return i != 0 && (i & 1) == 0;
    }

    public void close() {
        mo53702a(aaf.NO_ERROR, aaf.CANCEL, (IOException) null);
    }

    /* renamed from: b */
    public synchronized aam mo53705b(int i) {
        aam remove;
        remove = this.f53373c.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    /* renamed from: c */
    public void mo53709c() throws IOException {
        mo53703a(true);
    }

    /* renamed from: d */
    public void mo53713d() {
        synchronized (this) {
            long j = this.f53392x;
            long j2 = this.f53391w;
            if (j >= j2) {
                this.f53391w = j2 + 1;
                this.f53370A = System.nanoTime() + 1000000000;
                try {
                    this.f53387s.execute(new C22764yz("OkHttp %s ping", this.f53374d) {
                        /* renamed from: d */
                        public void mo53714d() {
                            aaj.this.mo53704a(false, 2, 0);
                        }
                    });
                } catch (RejectedExecutionException unused) {
                }
            }
        }
    }

    /* renamed from: c */
    public void mo53710c(int i, aaf aaf) {
        final int i2 = i;
        final aaf aaf2 = aaf;
        m50050a((C22764yz) new C22764yz("OkHttp %s Push Reset[%s]", new Object[]{this.f53374d, Integer.valueOf(i)}) {
            /* renamed from: d */
            public void mo53714d() {
                aaj.this.f53377g.mo53774a(i2, aaf2);
                synchronized (aaj.this) {
                    aaj.this.f53385o.remove(Integer.valueOf(i2));
                }
            }
        });
    }

    /* renamed from: com.veriff.sdk.internal.aaj$a */
    public static class C21295a {

        /* renamed from: a */
        public Socket f53416a;

        /* renamed from: b */
        public String f53417b;

        /* renamed from: c */
        public abk f53418c;

        /* renamed from: d */
        public abj f53419d;

        /* renamed from: e */
        public C21297c f53420e = C21297c.f53425h;

        /* renamed from: f */
        public aap f53421f = aap.f53497a;

        /* renamed from: g */
        public boolean f53422g;

        /* renamed from: h */
        public int f53423h;

        public C21295a(boolean z) {
            this.f53422g = z;
        }

        /* renamed from: a */
        public C21295a mo53717a(Socket socket, String str, abk abk, abj abj) {
            this.f53416a = socket;
            this.f53417b = str;
            this.f53418c = abk;
            this.f53419d = abj;
            return this;
        }

        /* renamed from: a */
        public C21295a mo53716a(C21297c cVar) {
            this.f53420e = cVar;
            return this;
        }

        /* renamed from: a */
        public C21295a mo53715a(int i) {
            this.f53423h = i;
            return this;
        }

        /* renamed from: a */
        public aaj mo53718a() {
            return new aaj(this);
        }
    }

    /* renamed from: a */
    public synchronized aam mo53691a(int i) {
        return this.f53373c.get(Integer.valueOf(i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.veriff.sdk.internal.aam m50054b(int r11, java.util.List<com.veriff.sdk.internal.aag> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            com.veriff.sdk.internal.aan r7 = r10.f53383m
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0076 }
            int r0 = r10.f53376f     // Catch:{ all -> 0x0073 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0013
            com.veriff.sdk.internal.aaf r0 = com.veriff.sdk.internal.aaf.REFUSED_STREAM     // Catch:{ all -> 0x0073 }
            r10.mo53701a((com.veriff.sdk.internal.aaf) r0)     // Catch:{ all -> 0x0073 }
        L_0x0013:
            boolean r0 = r10.f53386r     // Catch:{ all -> 0x0073 }
            if (r0 != 0) goto L_0x006d
            int r8 = r10.f53376f     // Catch:{ all -> 0x0073 }
            int r0 = r8 + 2
            r10.f53376f = r0     // Catch:{ all -> 0x0073 }
            com.veriff.sdk.internal.aam r9 = new com.veriff.sdk.internal.aam     // Catch:{ all -> 0x0073 }
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0073 }
            if (r13 == 0) goto L_0x003a
            long r0 = r10.f53379i     // Catch:{ all -> 0x0073 }
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x003a
            long r0 = r9.f53459b     // Catch:{ all -> 0x0073 }
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r13 = 0
            goto L_0x003b
        L_0x003a:
            r13 = 1
        L_0x003b:
            boolean r0 = r9.mo53742b()     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x004a
            java.util.Map<java.lang.Integer, com.veriff.sdk.internal.aam> r0 = r10.f53373c     // Catch:{ all -> 0x0073 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0073 }
            r0.put(r1, r9)     // Catch:{ all -> 0x0073 }
        L_0x004a:
            monitor-exit(r10)     // Catch:{ all -> 0x0073 }
            if (r11 != 0) goto L_0x0053
            com.veriff.sdk.internal.aan r11 = r10.f53383m     // Catch:{ all -> 0x0076 }
            r11.mo53766a((boolean) r6, (int) r8, (java.util.List<com.veriff.sdk.internal.aag>) r12)     // Catch:{ all -> 0x0076 }
            goto L_0x005c
        L_0x0053:
            boolean r0 = r10.f53371a     // Catch:{ all -> 0x0076 }
            if (r0 != 0) goto L_0x0065
            com.veriff.sdk.internal.aan r0 = r10.f53383m     // Catch:{ all -> 0x0076 }
            r0.mo53759a((int) r11, (int) r8, (java.util.List<com.veriff.sdk.internal.aag>) r12)     // Catch:{ all -> 0x0076 }
        L_0x005c:
            monitor-exit(r7)     // Catch:{ all -> 0x0076 }
            if (r13 == 0) goto L_0x0064
            com.veriff.sdk.internal.aan r11 = r10.f53383m
            r11.mo53767b()
        L_0x0064:
            return r9
        L_0x0065:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0076 }
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch:{ all -> 0x0076 }
            throw r11     // Catch:{ all -> 0x0076 }
        L_0x006d:
            com.veriff.sdk.internal.aae r11 = new com.veriff.sdk.internal.aae     // Catch:{ all -> 0x0073 }
            r11.<init>()     // Catch:{ all -> 0x0073 }
            throw r11     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0073 }
            throw r11     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r11 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0076 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.aaj.m50054b(int, java.util.List, boolean):com.veriff.sdk.internal.aam");
    }

    /* renamed from: a */
    public synchronized int mo53690a() {
        return this.f53381k.mo53785c(Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public synchronized void mo53700a(long j) {
        long j2 = this.f53378h + j;
        this.f53378h = j2;
        if (j2 >= ((long) (this.f53380j.mo53786d() / 2))) {
            mo53693a(0, this.f53378h);
            this.f53378h = 0;
        }
    }

    /* renamed from: com.veriff.sdk.internal.aaj$e */
    public class C21300e extends C22764yz implements aal.C21305b {

        /* renamed from: a */
        public final aal f53430a;

        public C21300e(aal aal) {
            super("OkHttp %s", aaj.this.f53374d);
            this.f53430a = aal;
        }

        /* renamed from: a */
        public void mo53721a() {
        }

        /* renamed from: a */
        public void mo53722a(int i, int i2, int i3, boolean z) {
        }

        /* renamed from: a */
        public void mo53729a(boolean z, int i, abk abk, int i2) throws IOException {
            if (aaj.this.mo53711c(i)) {
                aaj.this.mo53695a(i, abk, i2, z);
                return;
            }
            aam a = aaj.this.mo53691a(i);
            if (a == null) {
                aaj.this.mo53694a(i, aaf.PROTOCOL_ERROR);
                long j = (long) i2;
                aaj.this.mo53700a(j);
                abk.mo53900i(j);
                return;
            }
            a.mo53739a(abk, i2);
            if (z) {
                a.mo53740a(C22766za.f57696c, true);
            }
        }

        /* renamed from: b */
        public void mo53731b(boolean z, aaq aaq) {
            aam[] aamArr;
            long j;
            synchronized (aaj.this.f53383m) {
                synchronized (aaj.this) {
                    int d = aaj.this.f53381k.mo53786d();
                    if (z) {
                        aaj.this.f53381k.mo53779a();
                    }
                    aaj.this.f53381k.mo53780a(aaq);
                    int d2 = aaj.this.f53381k.mo53786d();
                    aamArr = null;
                    if (d2 == -1 || d2 == d) {
                        j = 0;
                    } else {
                        j = (long) (d2 - d);
                        if (!aaj.this.f53373c.isEmpty()) {
                            aamArr = (aam[]) aaj.this.f53373c.values().toArray(new aam[aaj.this.f53373c.size()]);
                        }
                    }
                }
                try {
                    aaj aaj = aaj.this;
                    aaj.f53383m.mo53763a(aaj.f53381k);
                } catch (IOException e) {
                    aaj.this.m50051a(e);
                }
            }
            if (aamArr != null) {
                for (aam aam : aamArr) {
                    synchronized (aam) {
                        aam.mo53736a(j);
                    }
                }
            }
            aaj.f53369q.execute(new C22764yz("OkHttp %s settings", aaj.this.f53374d) {
                /* renamed from: d */
                public void mo53714d() {
                    aaj aaj = aaj.this;
                    aaj.f53372b.mo53719a(aaj);
                }
            });
        }

        /* renamed from: d */
        public void mo53714d() {
            aaf aaf;
            aaf aaf2 = aaf.INTERNAL_ERROR;
            e = null;
            try {
                this.f53430a.mo53732a((aal.C21305b) this);
                while (this.f53430a.mo53733a(false, (aal.C21305b) this)) {
                }
                aaf = aaf.NO_ERROR;
                try {
                    aaj.this.mo53702a(aaf, aaf.CANCEL, (IOException) null);
                } catch (IOException e) {
                    e = e;
                    try {
                        aaf aaf3 = aaf.PROTOCOL_ERROR;
                        aaj.this.mo53702a(aaf3, aaf3, e);
                        C22766za.m55834a((Closeable) this.f53430a);
                    } catch (Throwable th) {
                        th = th;
                        aaj.this.mo53702a(aaf, aaf2, e);
                        C22766za.m55834a((Closeable) this.f53430a);
                        throw th;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                aaf = aaf2;
                aaf aaf32 = aaf.PROTOCOL_ERROR;
                aaj.this.mo53702a(aaf32, aaf32, e);
                C22766za.m55834a((Closeable) this.f53430a);
            } catch (Throwable th2) {
                th = th2;
                aaf = aaf2;
                aaj.this.mo53702a(aaf, aaf2, e);
                C22766za.m55834a((Closeable) this.f53430a);
                throw th;
            }
            C22766za.m55834a((Closeable) this.f53430a);
        }

        /* renamed from: a */
        public void mo53728a(boolean z, int i, int i2, List<aag> list) {
            if (aaj.this.mo53711c(i)) {
                aaj.this.mo53697a(i, list, z);
                return;
            }
            synchronized (aaj.this) {
                aam a = aaj.this.mo53691a(i);
                if (a != null) {
                    a.mo53740a(C22766za.m55845b(list), z);
                } else if (!aaj.this.f53386r) {
                    aaj aaj = aaj.this;
                    if (i > aaj.f53375e) {
                        if (i % 2 != aaj.f53376f % 2) {
                            int i3 = i;
                            final aam aam = new aam(i3, aaj.this, false, z, C22766za.m55845b(list));
                            aaj aaj2 = aaj.this;
                            aaj2.f53375e = i;
                            aaj2.f53373c.put(Integer.valueOf(i), aam);
                            aaj.f53369q.execute(new C22764yz("OkHttp %s stream %d", new Object[]{aaj.this.f53374d, Integer.valueOf(i)}) {
                                /* renamed from: d */
                                public void mo53714d() {
                                    try {
                                        aaj.this.f53372b.mo53720a(aam);
                                    } catch (IOException e) {
                                        aay e2 = aay.m50281e();
                                        StringBuilder k = C13555b.m33972k("Http2Connection.Listener failure for ");
                                        k.append(aaj.this.f53374d);
                                        e2.mo53800a(4, k.toString(), (Throwable) e);
                                        try {
                                            aam.mo53738a(aaf.PROTOCOL_ERROR, e);
                                        } catch (IOException unused) {
                                        }
                                    }
                                }
                            });
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo53725a(int i, aaf aaf) {
            if (aaj.this.mo53711c(i)) {
                aaj.this.mo53710c(i, aaf);
                return;
            }
            aam b = aaj.this.mo53705b(i);
            if (b != null) {
                b.mo53741b(aaf);
            }
        }

        /* renamed from: a */
        public void mo53730a(boolean z, aaq aaq) {
            try {
                final boolean z2 = z;
                final aaq aaq2 = aaq;
                aaj.this.f53387s.execute(new C22764yz("OkHttp %s ACK Settings", new Object[]{aaj.this.f53374d}) {
                    /* renamed from: d */
                    public void mo53714d() {
                        C21300e.this.mo53731b(z2, aaq2);
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
        }

        /* renamed from: a */
        public void mo53727a(boolean z, int i, int i2) {
            if (z) {
                synchronized (aaj.this) {
                    if (i == 1) {
                        try {
                            aaj.m50059f(aaj.this);
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else if (i == 2) {
                        aaj.m50060g(aaj.this);
                    } else if (i == 3) {
                        aaj.m50061h(aaj.this);
                        aaj.this.notifyAll();
                    }
                }
                return;
            }
            try {
                aaj.this.f53387s.execute(new C21299d(true, i, i2));
            } catch (RejectedExecutionException unused) {
            }
        }

        /* renamed from: a */
        public void mo53726a(int i, aaf aaf, abl abl) {
            aam[] aamArr;
            abl.mo53946h();
            synchronized (aaj.this) {
                aamArr = (aam[]) aaj.this.f53373c.values().toArray(new aam[aaj.this.f53373c.size()]);
                boolean unused = aaj.this.f53386r = true;
            }
            for (aam aam : aamArr) {
                if (aam.mo53735a() > i && aam.mo53743c()) {
                    aam.mo53741b(aaf.REFUSED_STREAM);
                    aaj.this.mo53705b(aam.mo53735a());
                }
            }
        }

        /* renamed from: a */
        public void mo53724a(int i, long j) {
            if (i == 0) {
                synchronized (aaj.this) {
                    aaj aaj = aaj.this;
                    aaj.f53379i += j;
                    aaj.notifyAll();
                }
                return;
            }
            aam a = aaj.this.mo53691a(i);
            if (a != null) {
                synchronized (a) {
                    a.mo53736a(j);
                }
            }
        }

        /* renamed from: a */
        public void mo53723a(int i, int i2, List<aag> list) {
            aaj.this.mo53696a(i2, list);
        }
    }

    /* renamed from: a */
    public aam mo53692a(List<aag> list, boolean z) throws IOException {
        return m50054b(0, list, z);
    }

    /* renamed from: a */
    public void mo53699a(int i, boolean z, List<aag> list) throws IOException {
        this.f53383m.mo53766a(z, i, list);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.f53383m.mo53769c());
        r6 = (long) r3;
        r8.f53379i -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0058 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo53698a(int r9, boolean r10, com.veriff.sdk.internal.abi r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            com.veriff.sdk.internal.aan r12 = r8.f53383m
            r12.mo53765a((boolean) r10, (int) r9, (com.veriff.sdk.internal.abi) r11, (int) r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0067
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.f53379i     // Catch:{ InterruptedException -> 0x0058 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, com.veriff.sdk.internal.aam> r3 = r8.f53373c     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0058 }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x0058 }
            if (r3 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x0058 }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0058 }
            throw r9     // Catch:{ InterruptedException -> 0x0058 }
        L_0x0030:
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0056 }
            int r4 = (int) r3     // Catch:{ all -> 0x0056 }
            com.veriff.sdk.internal.aan r3 = r8.f53383m     // Catch:{ all -> 0x0056 }
            int r3 = r3.mo53769c()     // Catch:{ all -> 0x0056 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0056 }
            long r4 = r8.f53379i     // Catch:{ all -> 0x0056 }
            long r6 = (long) r3     // Catch:{ all -> 0x0056 }
            long r4 = r4 - r6
            r8.f53379i = r4     // Catch:{ all -> 0x0056 }
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            long r12 = r12 - r6
            com.veriff.sdk.internal.aan r4 = r8.f53383m
            if (r10 == 0) goto L_0x0051
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0051
            r5 = 1
            goto L_0x0052
        L_0x0051:
            r5 = 0
        L_0x0052:
            r4.mo53765a((boolean) r5, (int) r9, (com.veriff.sdk.internal.abi) r11, (int) r3)
            goto L_0x000d
        L_0x0056:
            r9 = move-exception
            goto L_0x0065
        L_0x0058:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0056 }
            r9.interrupt()     // Catch:{ all -> 0x0056 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0056 }
            r9.<init>()     // Catch:{ all -> 0x0056 }
            throw r9     // Catch:{ all -> 0x0056 }
        L_0x0065:
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            throw r9
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.aaj.mo53698a(int, boolean, com.veriff.sdk.internal.abi, long):void");
    }

    /* renamed from: b */
    public void mo53707b(int i, aaf aaf) throws IOException {
        this.f53383m.mo53761a(i, aaf);
    }

    /* renamed from: a */
    public void mo53694a(int i, aaf aaf) {
        try {
            final int i2 = i;
            final aaf aaf2 = aaf;
            this.f53387s.execute(new C22764yz("OkHttp %s stream %d", new Object[]{this.f53374d, Integer.valueOf(i)}) {
                /* renamed from: d */
                public void mo53714d() {
                    try {
                        aaj.this.mo53707b(i2, aaf2);
                    } catch (IOException e) {
                        aaj.this.m50051a(e);
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    /* renamed from: b */
    public void mo53706b() throws IOException {
        this.f53383m.mo53767b();
    }

    /* renamed from: a */
    public void mo53693a(int i, long j) {
        try {
            final int i2 = i;
            final long j2 = j;
            this.f53387s.execute(new C22764yz("OkHttp Window Update %s stream %d", new Object[]{this.f53374d, Integer.valueOf(i)}) {
                /* renamed from: d */
                public void mo53714d() {
                    try {
                        aaj.this.f53383m.mo53760a(i2, j2);
                    } catch (IOException e) {
                        aaj.this.m50051a(e);
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    /* renamed from: b */
    public synchronized boolean mo53708b(long j) {
        if (this.f53386r) {
            return false;
        }
        if (this.f53392x >= this.f53391w || j < this.f53370A) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo53704a(boolean z, int i, int i2) {
        try {
            this.f53383m.mo53764a(z, i, i2);
        } catch (IOException e) {
            m50051a(e);
        }
    }

    /* renamed from: a */
    public void mo53701a(aaf aaf) throws IOException {
        synchronized (this.f53383m) {
            synchronized (this) {
                if (!this.f53386r) {
                    this.f53386r = true;
                    int i = this.f53375e;
                    this.f53383m.mo53762a(i, aaf, C22766za.f57694a);
                }
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x004b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo53702a(com.veriff.sdk.internal.aaf r4, com.veriff.sdk.internal.aaf r5, java.io.IOException r6) {
        /*
            r3 = this;
            boolean r0 = f53368p
            if (r0 != 0) goto L_0x0011
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto L_0x000b
            goto L_0x0011
        L_0x000b:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L_0x0011:
            r3.mo53701a((com.veriff.sdk.internal.aaf) r4)     // Catch:{ IOException -> 0x0014 }
        L_0x0014:
            r4 = 0
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, com.veriff.sdk.internal.aam> r0 = r3.f53373c     // Catch:{ all -> 0x005b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x005b }
            if (r0 != 0) goto L_0x0037
            java.util.Map<java.lang.Integer, com.veriff.sdk.internal.aam> r4 = r3.f53373c     // Catch:{ all -> 0x005b }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x005b }
            java.util.Map<java.lang.Integer, com.veriff.sdk.internal.aam> r0 = r3.f53373c     // Catch:{ all -> 0x005b }
            int r0 = r0.size()     // Catch:{ all -> 0x005b }
            com.veriff.sdk.internal.aam[] r0 = new com.veriff.sdk.internal.aam[r0]     // Catch:{ all -> 0x005b }
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch:{ all -> 0x005b }
            com.veriff.sdk.internal.aam[] r4 = (com.veriff.sdk.internal.aam[]) r4     // Catch:{ all -> 0x005b }
            java.util.Map<java.lang.Integer, com.veriff.sdk.internal.aam> r0 = r3.f53373c     // Catch:{ all -> 0x005b }
            r0.clear()     // Catch:{ all -> 0x005b }
        L_0x0037:
            monitor-exit(r3)     // Catch:{ all -> 0x005b }
            if (r4 == 0) goto L_0x0046
            int r0 = r4.length
            r1 = 0
        L_0x003c:
            if (r1 >= r0) goto L_0x0046
            r2 = r4[r1]
            r2.mo53738a((com.veriff.sdk.internal.aaf) r5, (java.io.IOException) r6)     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            int r1 = r1 + 1
            goto L_0x003c
        L_0x0046:
            com.veriff.sdk.internal.aan r4 = r3.f53383m     // Catch:{ IOException -> 0x004b }
            r4.close()     // Catch:{ IOException -> 0x004b }
        L_0x004b:
            java.net.Socket r4 = r3.f53382l     // Catch:{ IOException -> 0x0050 }
            r4.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            java.util.concurrent.ScheduledExecutorService r4 = r3.f53387s
            r4.shutdown()
            java.util.concurrent.ExecutorService r4 = r3.f53388t
            r4.shutdown()
            return
        L_0x005b:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x005b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.aaj.mo53702a(com.veriff.sdk.internal.aaf, com.veriff.sdk.internal.aaf, java.io.IOException):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m50051a(IOException iOException) {
        aaf aaf = aaf.PROTOCOL_ERROR;
        mo53702a(aaf, aaf, iOException);
    }

    /* renamed from: a */
    public void mo53703a(boolean z) throws IOException {
        if (z) {
            this.f53383m.mo53756a();
            this.f53383m.mo53768b(this.f53380j);
            int d = this.f53380j.mo53786d();
            if (d != 65535) {
                this.f53383m.mo53760a(0, (long) (d - 65535));
            }
        }
        new Thread(this.f53384n).start();
    }

    /* renamed from: a */
    public void mo53696a(int i, List<aag> list) {
        synchronized (this) {
            if (this.f53385o.contains(Integer.valueOf(i))) {
                mo53694a(i, aaf.PROTOCOL_ERROR);
                return;
            }
            this.f53385o.add(Integer.valueOf(i));
            try {
                final int i2 = i;
                final List<aag> list2 = list;
                m50050a((C22764yz) new C22764yz("OkHttp %s Push Request[%s]", new Object[]{this.f53374d, Integer.valueOf(i)}) {
                    /* renamed from: d */
                    public void mo53714d() {
                        if (aaj.this.f53377g.mo53776a(i2, (List<aag>) list2)) {
                            try {
                                aaj.this.f53383m.mo53761a(i2, aaf.CANCEL);
                                synchronized (aaj.this) {
                                    aaj.this.f53385o.remove(Integer.valueOf(i2));
                                }
                            } catch (IOException unused) {
                            }
                        }
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo53697a(int i, List<aag> list, boolean z) {
        try {
            final int i2 = i;
            final List<aag> list2 = list;
            final boolean z2 = z;
            m50050a((C22764yz) new C22764yz("OkHttp %s Push Headers[%s]", new Object[]{this.f53374d, Integer.valueOf(i)}) {
                /* renamed from: d */
                public void mo53714d() {
                    boolean a = aaj.this.f53377g.mo53777a(i2, list2, z2);
                    if (a) {
                        try {
                            aaj.this.f53383m.mo53761a(i2, aaf.CANCEL);
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    if (a || z2) {
                        synchronized (aaj.this) {
                            aaj.this.f53385o.remove(Integer.valueOf(i2));
                        }
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    /* renamed from: a */
    public void mo53695a(int i, abk abk, int i2, boolean z) throws IOException {
        final abi abi = new abi();
        long j = (long) i2;
        abk.mo53860a(j);
        abk.mo53671a(abi, j);
        if (abi.mo53864b() == j) {
            final int i3 = i;
            final int i4 = i2;
            final boolean z2 = z;
            m50050a((C22764yz) new C22764yz("OkHttp %s Push Data[%s]", new Object[]{this.f53374d, Integer.valueOf(i)}) {
                /* renamed from: d */
                public void mo53714d() {
                    try {
                        boolean a = aaj.this.f53377g.mo53775a(i3, abi, i4, z2);
                        if (a) {
                            aaj.this.f53383m.mo53761a(i3, aaf.CANCEL);
                        }
                        if (a || z2) {
                            synchronized (aaj.this) {
                                aaj.this.f53385o.remove(Integer.valueOf(i3));
                            }
                        }
                    } catch (IOException unused) {
                    }
                }
            });
            return;
        }
        throw new IOException(abi.mo53864b() + " != " + i2);
    }

    /* renamed from: a */
    private synchronized void m50050a(C22764yz yzVar) {
        if (!this.f53386r) {
            this.f53388t.execute(yzVar);
        }
    }
}
