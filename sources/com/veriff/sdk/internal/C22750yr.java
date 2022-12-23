package com.veriff.sdk.internal;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.veriff.sdk.internal.yr */
final class C22750yr implements C22713xw {

    /* renamed from: a */
    public final C22746yp f57625a;

    /* renamed from: b */
    public final C22752ys f57626b;

    /* renamed from: c */
    public final boolean f57627c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C22794zr f57628d;

    /* renamed from: e */
    private boolean f57629e;

    /* renamed from: com.veriff.sdk.internal.yr$a */
    public final class C22751a extends C22764yz {

        /* renamed from: a */
        public static final /* synthetic */ boolean f57630a = true;

        /* renamed from: d */
        private final C22715xx f57632d;

        /* renamed from: e */
        private volatile AtomicInteger f57633e = new AtomicInteger(0);

        static {
            Class<C22750yr> cls = C22750yr.class;
        }

        public C22751a(C22715xx xxVar) {
            super("OkHttp %s", C22750yr.this.mo57383g());
            this.f57632d = xxVar;
        }

        /* renamed from: a */
        public AtomicInteger mo57385a() {
            return this.f57633e;
        }

        /* renamed from: b */
        public String mo57388b() {
            return C22750yr.this.f57626b.mo57390a().mo57292f();
        }

        /* renamed from: c */
        public C22750yr mo57389c() {
            return C22750yr.this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0032 A[Catch:{ IOException -> 0x0055, all -> 0x0028, all -> 0x0053 }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x005a A[Catch:{ IOException -> 0x0055, all -> 0x0028, all -> 0x0053 }] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x007a A[Catch:{ IOException -> 0x0055, all -> 0x0028, all -> 0x0053 }] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo53714d() {
            /*
                r5 = this;
                com.veriff.sdk.internal.yr r0 = com.veriff.sdk.internal.C22750yr.this
                com.veriff.sdk.internal.zr r0 = r0.f57628d
                r0.mo57543a()
                r0 = 0
                com.veriff.sdk.internal.yr r1 = com.veriff.sdk.internal.C22750yr.this     // Catch:{ IOException -> 0x0055, all -> 0x0028 }
                com.veriff.sdk.internal.yu r0 = r1.mo57384h()     // Catch:{ IOException -> 0x0055, all -> 0x0028 }
                r1 = 1
                com.veriff.sdk.internal.xx r2 = r5.f57632d     // Catch:{ IOException -> 0x0026, all -> 0x0024 }
                com.veriff.sdk.internal.yr r3 = com.veriff.sdk.internal.C22750yr.this     // Catch:{ IOException -> 0x0026, all -> 0x0024 }
                r2.mo54029a((com.veriff.sdk.internal.C22713xw) r3, (com.veriff.sdk.internal.C22757yu) r0)     // Catch:{ IOException -> 0x0026, all -> 0x0024 }
            L_0x0018:
                com.veriff.sdk.internal.yr r0 = com.veriff.sdk.internal.C22750yr.this
                com.veriff.sdk.internal.yp r0 = r0.f57625a
                com.veriff.sdk.internal.yf r0 = r0.mo57362v()
                r0.mo57231b((com.veriff.sdk.internal.C22750yr.C22751a) r5)
                goto L_0x0082
            L_0x0024:
                r0 = move-exception
                goto L_0x002b
            L_0x0026:
                r0 = move-exception
                goto L_0x0058
            L_0x0028:
                r1 = move-exception
                r0 = r1
                r1 = 0
            L_0x002b:
                com.veriff.sdk.internal.yr r2 = com.veriff.sdk.internal.C22750yr.this     // Catch:{ all -> 0x0053 }
                r2.mo57189c()     // Catch:{ all -> 0x0053 }
                if (r1 != 0) goto L_0x0052
                java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0053 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0053 }
                r2.<init>()     // Catch:{ all -> 0x0053 }
                java.lang.String r3 = "canceled due to "
                r2.append(r3)     // Catch:{ all -> 0x0053 }
                r2.append(r0)     // Catch:{ all -> 0x0053 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0053 }
                r1.<init>(r2)     // Catch:{ all -> 0x0053 }
                r1.addSuppressed(r0)     // Catch:{ all -> 0x0053 }
                com.veriff.sdk.internal.xx r2 = r5.f57632d     // Catch:{ all -> 0x0053 }
                com.veriff.sdk.internal.yr r3 = com.veriff.sdk.internal.C22750yr.this     // Catch:{ all -> 0x0053 }
                r2.mo54030a((com.veriff.sdk.internal.C22713xw) r3, (java.io.IOException) r1)     // Catch:{ all -> 0x0053 }
            L_0x0052:
                throw r0     // Catch:{ all -> 0x0053 }
            L_0x0053:
                r0 = move-exception
                goto L_0x0083
            L_0x0055:
                r1 = move-exception
                r0 = r1
                r1 = 0
            L_0x0058:
                if (r1 == 0) goto L_0x007a
                com.veriff.sdk.internal.aay r1 = com.veriff.sdk.internal.aay.m50281e()     // Catch:{ all -> 0x0053 }
                r2 = 4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0053 }
                r3.<init>()     // Catch:{ all -> 0x0053 }
                java.lang.String r4 = "Callback failure for "
                r3.append(r4)     // Catch:{ all -> 0x0053 }
                com.veriff.sdk.internal.yr r4 = com.veriff.sdk.internal.C22750yr.this     // Catch:{ all -> 0x0053 }
                java.lang.String r4 = r4.mo57382f()     // Catch:{ all -> 0x0053 }
                r3.append(r4)     // Catch:{ all -> 0x0053 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0053 }
                r1.mo53800a((int) r2, (java.lang.String) r3, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0053 }
                goto L_0x0018
            L_0x007a:
                com.veriff.sdk.internal.xx r1 = r5.f57632d     // Catch:{ all -> 0x0053 }
                com.veriff.sdk.internal.yr r2 = com.veriff.sdk.internal.C22750yr.this     // Catch:{ all -> 0x0053 }
                r1.mo54030a((com.veriff.sdk.internal.C22713xw) r2, (java.io.IOException) r0)     // Catch:{ all -> 0x0053 }
                goto L_0x0018
            L_0x0082:
                return
            L_0x0083:
                com.veriff.sdk.internal.yr r1 = com.veriff.sdk.internal.C22750yr.this
                com.veriff.sdk.internal.yp r1 = r1.f57625a
                com.veriff.sdk.internal.yf r1 = r1.mo57362v()
                r1.mo57231b((com.veriff.sdk.internal.C22750yr.C22751a) r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22750yr.C22751a.mo53714d():void");
        }

        /* renamed from: a */
        public void mo57386a(C22751a aVar) {
            this.f57633e = aVar.f57633e;
        }

        /* renamed from: a */
        public void mo57387a(ExecutorService executorService) {
            if (f57630a || !Thread.holdsLock(C22750yr.this.f57625a.mo57362v())) {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    C22750yr.this.f57628d.mo57542a((IOException) interruptedIOException);
                    this.f57632d.mo54030a((C22713xw) C22750yr.this, (IOException) interruptedIOException);
                    C22750yr.this.f57625a.mo57362v().mo57231b(this);
                } catch (Throwable th) {
                    C22750yr.this.f57625a.mo57362v().mo57231b(this);
                    throw th;
                }
            } else {
                throw new AssertionError();
            }
        }
    }

    private C22750yr(C22746yp ypVar, C22752ys ysVar, boolean z) {
        this.f57625a = ypVar;
        this.f57626b = ysVar;
        this.f57627c = z;
    }

    /* renamed from: b */
    public C22757yu mo57188b() throws IOException {
        synchronized (this) {
            if (!this.f57629e) {
                this.f57629e = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.f57628d.mo57543a();
        this.f57628d.mo57547c();
        try {
            this.f57625a.mo57362v().mo57229a(this);
            return mo57384h();
        } finally {
            this.f57625a.mo57362v().mo57232b(this);
        }
    }

    /* renamed from: c */
    public void mo57189c() {
        this.f57628d.mo57552h();
    }

    /* renamed from: d */
    public boolean mo57190d() {
        return this.f57628d.mo57553i();
    }

    /* renamed from: e */
    public C22750yr clone() {
        return m55696a(this.f57625a, this.f57626b, this.f57627c);
    }

    /* renamed from: f */
    public String mo57382f() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (mo57190d()) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f57627c) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        sb.append(str2);
        sb.append(" to ");
        sb.append(mo57383g());
        return sb.toString();
    }

    /* renamed from: g */
    public String mo57383g() {
        return this.f57626b.mo57390a().mo57303p();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a5  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.veriff.sdk.internal.C22757yu mo57384h() throws java.io.IOException {
        /*
            r11 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.veriff.sdk.internal.yp r0 = r11.f57625a
            java.util.List r0 = r0.mo57365y()
            r1.addAll(r0)
            com.veriff.sdk.internal.aab r0 = new com.veriff.sdk.internal.aab
            com.veriff.sdk.internal.yp r2 = r11.f57625a
            r0.<init>(r2)
            r1.add(r0)
            com.veriff.sdk.internal.zs r0 = new com.veriff.sdk.internal.zs
            com.veriff.sdk.internal.yp r2 = r11.f57625a
            com.veriff.sdk.internal.ye r2 = r2.mo57348h()
            r0.<init>(r2)
            r1.add(r0)
            com.veriff.sdk.internal.zc r0 = new com.veriff.sdk.internal.zc
            com.veriff.sdk.internal.yp r2 = r11.f57625a
            com.veriff.sdk.internal.zh r2 = r2.mo57350j()
            r0.<init>(r2)
            r1.add(r0)
            com.veriff.sdk.internal.zi r0 = new com.veriff.sdk.internal.zi
            com.veriff.sdk.internal.yp r2 = r11.f57625a
            r0.<init>(r2)
            r1.add(r0)
            boolean r0 = r11.f57627c
            if (r0 != 0) goto L_0x004b
            com.veriff.sdk.internal.yp r0 = r11.f57625a
            java.util.List r0 = r0.mo57366z()
            r1.addAll(r0)
        L_0x004b:
            com.veriff.sdk.internal.zt r0 = new com.veriff.sdk.internal.zt
            boolean r2 = r11.f57627c
            r0.<init>(r2)
            r1.add(r0)
            com.veriff.sdk.internal.zy r10 = new com.veriff.sdk.internal.zy
            com.veriff.sdk.internal.zr r2 = r11.f57628d
            r3 = 0
            r4 = 0
            com.veriff.sdk.internal.ys r5 = r11.f57626b
            com.veriff.sdk.internal.yp r0 = r11.f57625a
            int r7 = r0.mo57342b()
            com.veriff.sdk.internal.yp r0 = r11.f57625a
            int r8 = r0.mo57343c()
            com.veriff.sdk.internal.yp r0 = r11.f57625a
            int r9 = r0.mo57344d()
            r0 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            r1 = 0
            com.veriff.sdk.internal.ys r2 = r11.f57626b     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            com.veriff.sdk.internal.yu r2 = r10.mo57323a(r2)     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            com.veriff.sdk.internal.zr r3 = r11.f57628d     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            boolean r3 = r3.mo57553i()     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            if (r3 != 0) goto L_0x008a
            com.veriff.sdk.internal.zr r0 = r11.f57628d
            r0.mo57542a((java.io.IOException) r1)
            return r2
        L_0x008a:
            com.veriff.sdk.internal.C22766za.m55834a((java.io.Closeable) r2)     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            throw r2     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
        L_0x0095:
            r2 = move-exception
            goto L_0x00a3
        L_0x0097:
            r0 = move-exception
            r2 = 1
            com.veriff.sdk.internal.zr r3 = r11.f57628d     // Catch:{ all -> 0x00a0 }
            java.io.IOException r0 = r3.mo57542a((java.io.IOException) r0)     // Catch:{ all -> 0x00a0 }
            throw r0     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            r2 = r0
            r0 = 1
        L_0x00a3:
            if (r0 != 0) goto L_0x00aa
            com.veriff.sdk.internal.zr r0 = r11.f57628d
            r0.mo57542a((java.io.IOException) r1)
        L_0x00aa:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22750yr.mo57384h():com.veriff.sdk.internal.yu");
    }

    /* renamed from: a */
    public static C22750yr m55696a(C22746yp ypVar, C22752ys ysVar, boolean z) {
        C22750yr yrVar = new C22750yr(ypVar, ysVar, z);
        yrVar.f57628d = new C22794zr(ypVar, yrVar);
        return yrVar;
    }

    /* renamed from: a */
    public C22752ys mo57186a() {
        return this.f57626b;
    }

    /* renamed from: a */
    public void mo57187a(C22715xx xxVar) {
        synchronized (this) {
            if (!this.f57629e) {
                this.f57629e = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.f57628d.mo57547c();
        this.f57625a.mo57362v().mo57228a(new C22751a(xxVar));
    }
}
