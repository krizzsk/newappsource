package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C22740ym;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p054d0.C4291k0;

/* renamed from: com.veriff.sdk.internal.zr */
public final class C22794zr {

    /* renamed from: b */
    public static final /* synthetic */ boolean f57833b = true;

    /* renamed from: a */
    public C22788zm f57834a;

    /* renamed from: c */
    private final C22746yp f57835c;

    /* renamed from: d */
    private final C22789zn f57836d;

    /* renamed from: e */
    private final C22713xw f57837e;

    /* renamed from: f */
    private final C22730yh f57838f;

    /* renamed from: g */
    private final abg f57839g;

    /* renamed from: h */
    private Object f57840h;

    /* renamed from: i */
    private C22752ys f57841i;

    /* renamed from: j */
    private C22787zl f57842j;

    /* renamed from: k */
    private C22784zk f57843k;

    /* renamed from: l */
    private boolean f57844l;

    /* renamed from: m */
    private boolean f57845m;

    /* renamed from: n */
    private boolean f57846n;

    /* renamed from: o */
    private boolean f57847o;

    /* renamed from: p */
    private boolean f57848p;

    /* renamed from: com.veriff.sdk.internal.zr$a */
    public static final class C22796a extends WeakReference<C22794zr> {

        /* renamed from: a */
        public final Object f57850a;

        public C22796a(C22794zr zrVar, Object obj) {
            super(zrVar);
            this.f57850a = obj;
        }
    }

    public C22794zr(C22746yp ypVar, C22713xw xwVar) {
        C227951 r0 = new abg() {
            /* renamed from: a */
            public void mo53754a() {
                C22794zr.this.mo57552h();
            }
        };
        this.f57839g = r0;
        this.f57835c = ypVar;
        this.f57836d = C22763yy.f57691a.mo57369a(ypVar.mo57358r());
        this.f57837e = xwVar;
        this.f57838f = ((C4291k0) ypVar.mo57339A()).mo19810e(xwVar);
        r0.mo53957a((long) ypVar.mo57341a(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public void mo57543a() {
        this.f57839g.mo53838c();
    }

    /* renamed from: b */
    public void mo57546b() {
        if (!this.f57847o) {
            this.f57847o = true;
            this.f57839g.mo53839n_();
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: c */
    public void mo57547c() {
        this.f57840h = aay.m50281e().mo53799a("response.body().close()");
        this.f57838f.mo57233a(this.f57837e);
    }

    /* renamed from: d */
    public Socket mo57548d() {
        if (f57833b || Thread.holdsLock(this.f57836d)) {
            int i = 0;
            int size = this.f57834a.f57800e.size();
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (this.f57834a.f57800e.get(i).get() == this) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                C22788zm zmVar = this.f57834a;
                zmVar.f57800e.remove(i);
                this.f57834a = null;
                if (!zmVar.f57800e.isEmpty()) {
                    return null;
                }
                zmVar.f57801f = System.nanoTime();
                if (this.f57836d.mo57528b(zmVar)) {
                    return zmVar.mo57520d();
                }
                return null;
            }
            throw new IllegalStateException();
        }
        throw new AssertionError();
    }

    /* renamed from: e */
    public void mo57549e() {
        synchronized (this.f57836d) {
            if (!this.f57848p) {
                this.f57843k = null;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: f */
    public boolean mo57550f() {
        return this.f57842j.mo57509c() && this.f57842j.mo57510d();
    }

    /* renamed from: g */
    public boolean mo57551g() {
        boolean z;
        synchronized (this.f57836d) {
            if (this.f57843k != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: h */
    public void mo57552h() {
        C22784zk zkVar;
        C22788zm zmVar;
        synchronized (this.f57836d) {
            this.f57846n = true;
            zkVar = this.f57843k;
            C22787zl zlVar = this.f57842j;
            if (zlVar == null || zlVar.mo57506a() == null) {
                zmVar = this.f57834a;
            } else {
                zmVar = this.f57842j.mo57506a();
            }
        }
        if (zkVar != null) {
            zkVar.mo57502g();
        } else if (zmVar != null) {
            zmVar.mo57519c();
        }
    }

    /* renamed from: i */
    public boolean mo57553i() {
        boolean z;
        synchronized (this.f57836d) {
            z = this.f57846n;
        }
        return z;
    }

    /* renamed from: a */
    public void mo57544a(C22752ys ysVar) {
        C22752ys ysVar2 = this.f57841i;
        if (ysVar2 != null) {
            if (C22766za.m55838a(ysVar2.mo57390a(), ysVar.mo57390a()) && this.f57842j.mo57510d()) {
                return;
            }
            if (this.f57843k != null) {
                throw new IllegalStateException();
            } else if (this.f57842j != null) {
                m55990a((IOException) null, true);
                this.f57842j = null;
            }
        }
        this.f57841i = ysVar;
        this.f57842j = new C22787zl(this, this.f57836d, m55989a(ysVar.mo57390a()), this.f57837e, this.f57838f);
    }

    /* renamed from: b */
    private IOException m55991b(IOException iOException) {
        if (this.f57847o || !this.f57839g.mo53839n_()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: a */
    private C22702xs m55989a(C22738yl ylVar) {
        C22716xy xyVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (ylVar.mo57287c()) {
            SSLSocketFactory m = this.f57835c.mo57353m();
            hostnameVerifier = this.f57835c.mo57354n();
            sSLSocketFactory = m;
            xyVar = this.f57835c.mo57355o();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            xyVar = null;
        }
        return new C22702xs(ylVar.mo57292f(), ylVar.mo57293g(), this.f57835c.mo57351k(), this.f57835c.mo57352l(), sSLSocketFactory, hostnameVerifier, xyVar, this.f57835c.mo57357q(), this.f57835c.mo57346f(), this.f57835c.mo57363w(), this.f57835c.mo57364x(), this.f57835c.mo57347g());
    }

    /* renamed from: a */
    public C22784zk mo57540a(C22740ym.C22741a aVar, boolean z) {
        synchronized (this.f57836d) {
            if (this.f57848p) {
                throw new IllegalStateException("released");
            } else if (this.f57843k != null) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
        }
        C22784zk zkVar = new C22784zk(this, this.f57837e, this.f57838f, this.f57842j, this.f57842j.mo57507a(this.f57835c, aVar, z));
        synchronized (this.f57836d) {
            this.f57843k = zkVar;
            this.f57844l = false;
            this.f57845m = false;
        }
        return zkVar;
    }

    /* renamed from: a */
    public void mo57545a(C22788zm zmVar) {
        if (!f57833b && !Thread.holdsLock(this.f57836d)) {
            throw new AssertionError();
        } else if (this.f57834a == null) {
            this.f57834a = zmVar;
            zmVar.f57800e.add(new C22796a(this, this.f57840h));
        } else {
            throw new IllegalStateException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0036, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return m55990a(r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return r7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.IOException mo57541a(com.veriff.sdk.internal.C22784zk r4, boolean r5, boolean r6, java.io.IOException r7) {
        /*
            r3 = this;
            com.veriff.sdk.internal.zn r0 = r3.f57836d
            monitor-enter(r0)
            com.veriff.sdk.internal.zk r1 = r3.f57843k     // Catch:{ all -> 0x003d }
            if (r4 == r1) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            return r7
        L_0x0009:
            r4 = 0
            r2 = 1
            if (r5 == 0) goto L_0x0013
            boolean r5 = r3.f57844l     // Catch:{ all -> 0x003d }
            r5 = r5 ^ r2
            r3.f57844l = r2     // Catch:{ all -> 0x003d }
            goto L_0x0014
        L_0x0013:
            r5 = 0
        L_0x0014:
            if (r6 == 0) goto L_0x001d
            boolean r6 = r3.f57845m     // Catch:{ all -> 0x003d }
            if (r6 != 0) goto L_0x001b
            r5 = 1
        L_0x001b:
            r3.f57845m = r2     // Catch:{ all -> 0x003d }
        L_0x001d:
            boolean r6 = r3.f57844l     // Catch:{ all -> 0x003d }
            if (r6 == 0) goto L_0x0034
            boolean r6 = r3.f57845m     // Catch:{ all -> 0x003d }
            if (r6 == 0) goto L_0x0034
            if (r5 == 0) goto L_0x0034
            com.veriff.sdk.internal.zm r5 = r1.mo57491a()     // Catch:{ all -> 0x003d }
            int r6 = r5.f57799d     // Catch:{ all -> 0x003d }
            int r6 = r6 + r2
            r5.f57799d = r6     // Catch:{ all -> 0x003d }
            r5 = 0
            r3.f57843k = r5     // Catch:{ all -> 0x003d }
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x003c
            java.io.IOException r7 = r3.m55990a((java.io.IOException) r7, (boolean) r4)
        L_0x003c:
            return r7
        L_0x003d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22794zr.mo57541a(com.veriff.sdk.internal.zk, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    /* renamed from: a */
    public IOException mo57542a(IOException iOException) {
        synchronized (this.f57836d) {
            this.f57848p = true;
        }
        return m55990a(iOException, false);
    }

    /* renamed from: a */
    private IOException m55990a(IOException iOException, boolean z) {
        C22788zm zmVar;
        Socket d;
        boolean z2;
        boolean z3;
        synchronized (this.f57836d) {
            if (z) {
                if (this.f57843k != null) {
                    throw new IllegalStateException("cannot release connection while it is in use");
                }
            }
            zmVar = this.f57834a;
            d = (zmVar == null || this.f57843k != null || (!z && !this.f57848p)) ? null : mo57548d();
            if (this.f57834a != null) {
                zmVar = null;
            }
            z2 = true;
            z3 = this.f57848p && this.f57843k == null;
        }
        C22766za.m55836a(d);
        if (zmVar != null) {
            this.f57838f.mo57247b(this.f57837e, (C22721ya) zmVar);
        }
        if (z3) {
            if (iOException == null) {
                z2 = false;
            }
            iOException = m55991b(iOException);
            if (z2) {
                this.f57838f.mo57250c(this.f57837e, iOException);
            } else {
                this.f57838f.mo57254g(this.f57837e);
            }
        }
        return iOException;
    }
}
