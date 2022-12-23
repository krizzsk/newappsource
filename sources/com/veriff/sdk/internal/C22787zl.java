package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C22740ym;
import com.veriff.sdk.internal.C22792zq;
import java.io.IOException;
import java.net.Socket;
import java.util.List;

/* renamed from: com.veriff.sdk.internal.zl */
final class C22787zl {

    /* renamed from: a */
    public static final /* synthetic */ boolean f57784a = true;

    /* renamed from: b */
    private final C22794zr f57785b;

    /* renamed from: c */
    private final C22702xs f57786c;

    /* renamed from: d */
    private final C22789zn f57787d;

    /* renamed from: e */
    private final C22713xw f57788e;

    /* renamed from: f */
    private final C22730yh f57789f;

    /* renamed from: g */
    private C22792zq.C22793a f57790g;

    /* renamed from: h */
    private final C22792zq f57791h;

    /* renamed from: i */
    private C22788zm f57792i;

    /* renamed from: j */
    private boolean f57793j;

    /* renamed from: k */
    private C22761yw f57794k;

    public C22787zl(C22794zr zrVar, C22789zn znVar, C22702xs xsVar, C22713xw xwVar, C22730yh yhVar) {
        this.f57785b = zrVar;
        this.f57787d = znVar;
        this.f57786c = xsVar;
        this.f57788e = xwVar;
        this.f57789f = yhVar;
        this.f57791h = new C22792zq(xsVar, znVar.f57814a, xwVar, yhVar);
    }

    /* renamed from: e */
    private boolean m55937e() {
        C22788zm zmVar = this.f57785b.f57834a;
        if (zmVar == null || zmVar.f57798c != 0 || !C22766za.m55838a(zmVar.mo57518b().mo57449a().mo57137a(), this.f57786c.mo57137a())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public C22799zu mo57507a(C22746yp ypVar, C22740ym.C22741a aVar, boolean z) {
        try {
            return m55936a(aVar.mo57324b(), aVar.mo57326c(), aVar.mo57328d(), ypVar.mo57345e(), ypVar.mo57361u(), z).mo57511a(ypVar, aVar);
        } catch (C22791zp e) {
            mo57508b();
            throw e;
        } catch (IOException e2) {
            mo57508b();
            throw new C22791zp(e2);
        }
    }

    /* renamed from: b */
    public void mo57508b() {
        if (f57784a || !Thread.holdsLock(this.f57787d)) {
            synchronized (this.f57787d) {
                this.f57793j = true;
            }
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: c */
    public boolean mo57509c() {
        boolean z;
        synchronized (this.f57787d) {
            z = this.f57793j;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        return r2;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo57510d() {
        /*
            r3 = this;
            com.veriff.sdk.internal.zn r0 = r3.f57787d
            monitor-enter(r0)
            com.veriff.sdk.internal.yw r1 = r3.f57794k     // Catch:{ all -> 0x0032 }
            r2 = 1
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return r2
        L_0x000a:
            boolean r1 = r3.m55937e()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x001c
            com.veriff.sdk.internal.zr r1 = r3.f57785b     // Catch:{ all -> 0x0032 }
            com.veriff.sdk.internal.zm r1 = r1.f57834a     // Catch:{ all -> 0x0032 }
            com.veriff.sdk.internal.yw r1 = r1.mo57518b()     // Catch:{ all -> 0x0032 }
            r3.f57794k = r1     // Catch:{ all -> 0x0032 }
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return r2
        L_0x001c:
            com.veriff.sdk.internal.zq$a r1 = r3.f57790g     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0026
            boolean r1 = r1.mo57537a()     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0030
        L_0x0026:
            com.veriff.sdk.internal.zq r1 = r3.f57791h     // Catch:{ all -> 0x0032 }
            boolean r1 = r1.mo57535a()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r2 = 0
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return r2
        L_0x0032:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22787zl.mo57510d():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r0.mo57517a(r9) != false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.veriff.sdk.internal.C22788zm m55936a(int r4, int r5, int r6, int r7, boolean r8, boolean r9) throws java.io.IOException {
        /*
            r3 = this;
        L_0x0000:
            com.veriff.sdk.internal.zm r0 = r3.m55935a(r4, r5, r6, r7, r8)
            com.veriff.sdk.internal.zn r1 = r3.f57787d
            monitor-enter(r1)
            int r2 = r0.f57799d     // Catch:{ all -> 0x001f }
            if (r2 != 0) goto L_0x0013
            boolean r2 = r0.mo57522f()     // Catch:{ all -> 0x001f }
            if (r2 != 0) goto L_0x0013
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            return r0
        L_0x0013:
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            boolean r1 = r0.mo57517a((boolean) r9)
            if (r1 != 0) goto L_0x001e
            r0.mo57512a()
            goto L_0x0000
        L_0x001e:
            return r0
        L_0x001f:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22787zl.m55936a(int, int, int, int, boolean, boolean):com.veriff.sdk.internal.zm");
    }

    /* renamed from: a */
    private C22788zm m55935a(int i, int i2, int i3, int i4, boolean z) throws IOException {
        C22788zm zmVar;
        Socket socket;
        Socket d;
        C22788zm zmVar2;
        boolean z2;
        C22761yw ywVar;
        boolean z3;
        List<C22761yw> list;
        C22792zq.C22793a aVar;
        synchronized (this.f57787d) {
            if (!this.f57785b.mo57553i()) {
                this.f57793j = false;
                C22794zr zrVar = this.f57785b;
                zmVar = zrVar.f57834a;
                socket = null;
                d = (zmVar == null || !zmVar.f57797b) ? null : zrVar.mo57548d();
                C22794zr zrVar2 = this.f57785b;
                zmVar2 = zrVar2.f57834a;
                if (zmVar2 != null) {
                    zmVar = null;
                } else {
                    zmVar2 = null;
                }
                if (zmVar2 == null) {
                    if (this.f57787d.mo57527a(this.f57786c, zrVar2, (List<C22761yw>) null, false)) {
                        zmVar2 = this.f57785b.f57834a;
                        ywVar = null;
                        z2 = true;
                    } else {
                        ywVar = this.f57794k;
                        if (ywVar != null) {
                            this.f57794k = null;
                        } else if (m55937e()) {
                            ywVar = this.f57785b.f57834a.mo57518b();
                        }
                        z2 = false;
                    }
                }
                ywVar = null;
                z2 = false;
            } else {
                throw new IOException("Canceled");
            }
        }
        C22766za.m55836a(d);
        if (zmVar != null) {
            this.f57789f.mo57247b(this.f57788e, (C22721ya) zmVar);
        }
        if (z2) {
            this.f57789f.mo57235a(this.f57788e, (C22721ya) zmVar2);
        }
        if (zmVar2 != null) {
            return zmVar2;
        }
        if (ywVar != null || ((aVar = this.f57790g) != null && aVar.mo57537a())) {
            z3 = false;
        } else {
            this.f57790g = this.f57791h.mo57536b();
            z3 = true;
        }
        synchronized (this.f57787d) {
            if (!this.f57785b.mo57553i()) {
                if (z3) {
                    list = this.f57790g.mo57539c();
                    if (this.f57787d.mo57527a(this.f57786c, this.f57785b, list, false)) {
                        zmVar2 = this.f57785b.f57834a;
                        z2 = true;
                    }
                } else {
                    list = null;
                }
                if (!z2) {
                    if (ywVar == null) {
                        ywVar = this.f57790g.mo57538b();
                    }
                    zmVar2 = new C22788zm(this.f57787d, ywVar);
                    this.f57792i = zmVar2;
                }
            } else {
                throw new IOException("Canceled");
            }
        }
        if (z2) {
            this.f57789f.mo57235a(this.f57788e, (C22721ya) zmVar2);
            return zmVar2;
        }
        zmVar2.mo57513a(i, i2, i3, i4, z, this.f57788e, this.f57789f);
        this.f57787d.f57814a.mo57530b(zmVar2.mo57518b());
        synchronized (this.f57787d) {
            this.f57792i = null;
            if (this.f57787d.mo57527a(this.f57786c, this.f57785b, list, true)) {
                zmVar2.f57797b = true;
                socket = zmVar2.mo57520d();
                zmVar2 = this.f57785b.f57834a;
                this.f57794k = ywVar;
            } else {
                this.f57787d.mo57526a(zmVar2);
                this.f57785b.mo57545a(zmVar2);
            }
        }
        C22766za.m55836a(socket);
        this.f57789f.mo57235a(this.f57788e, (C22721ya) zmVar2);
        return zmVar2;
    }

    /* renamed from: a */
    public C22788zm mo57506a() {
        if (f57784a || Thread.holdsLock(this.f57787d)) {
            return this.f57792i;
        }
        throw new AssertionError();
    }
}
