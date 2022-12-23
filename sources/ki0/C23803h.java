package ki0;

import hi0.C23534e;
import hi0.C23550n;
import hi0.C23566v;
import hi0.C23569w;
import hi0.C23571x;
import ii0.C23607a;
import ii0.C23610d;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import p304x.C7071l0;
import p330z2.C7428f;
import si0.C24888b;

/* renamed from: ki0.h */
public final class C23803h {

    /* renamed from: a */
    public final C23566v f60148a;

    /* renamed from: b */
    public final C23800f f60149b;

    /* renamed from: c */
    public final C23534e f60150c;

    /* renamed from: d */
    public final C23550n f60151d;

    /* renamed from: e */
    public final C23804a f60152e;

    /* renamed from: f */
    public Object f60153f;

    /* renamed from: g */
    public C23571x f60154g;

    /* renamed from: h */
    public C23798d f60155h;

    /* renamed from: i */
    public C23799e f60156i;

    /* renamed from: j */
    public C23795c f60157j;

    /* renamed from: k */
    public boolean f60158k;

    /* renamed from: l */
    public boolean f60159l;

    /* renamed from: m */
    public boolean f60160m;

    /* renamed from: n */
    public boolean f60161n;

    /* renamed from: o */
    public boolean f60162o;

    /* renamed from: ki0.h$a */
    public class C23804a extends C24888b {
        public C23804a() {
        }

        /* renamed from: k */
        public final void mo59055k() {
            C23803h.this.mo59049a();
        }
    }

    /* renamed from: ki0.h$b */
    public static final class C23805b extends WeakReference<C23803h> {

        /* renamed from: a */
        public final Object f60164a;

        public C23805b(C23803h hVar, Object obj) {
            super(hVar);
            this.f60164a = obj;
        }
    }

    public C23803h(C23566v vVar, C23569w wVar) {
        C23804a aVar = new C23804a();
        this.f60152e = aVar;
        this.f60148a = vVar;
        C23566v.C23567a aVar2 = C23607a.f59680a;
        C7428f fVar = vVar.f59593t;
        aVar2.getClass();
        this.f60149b = (C23800f) fVar.f22829b;
        this.f60150c = wVar;
        this.f60151d = (C23550n) ((C7071l0) vVar.f59581h).f21986c;
        aVar.mo61373g((long) vVar.f59598y, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public final void mo59049a() {
        C23795c cVar;
        C23799e eVar;
        synchronized (this.f60149b) {
            this.f60160m = true;
            cVar = this.f60157j;
            C23798d dVar = this.f60155h;
            if (dVar == null || (eVar = dVar.f60113g) == null) {
                eVar = this.f60156i;
            }
        }
        if (cVar != null) {
            cVar.f60095d.cancel();
        } else if (eVar != null) {
            C23610d.m57797e(eVar.f60118d);
        }
    }

    /* renamed from: b */
    public final void mo59050b() {
        synchronized (this.f60149b) {
            if (!this.f60162o) {
                this.f60157j = null;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0036, code lost:
        if (r4 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return mo59052d(r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return r7;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.IOException mo59051c(ki0.C23795c r4, boolean r5, boolean r6, java.io.IOException r7) {
        /*
            r3 = this;
            ki0.f r0 = r3.f60149b
            monitor-enter(r0)
            ki0.c r1 = r3.f60157j     // Catch:{ all -> 0x003d }
            if (r4 == r1) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            return r7
        L_0x0009:
            r4 = 1
            r2 = 0
            if (r5 == 0) goto L_0x0013
            boolean r5 = r3.f60158k     // Catch:{ all -> 0x003d }
            r5 = r5 ^ r4
            r3.f60158k = r4     // Catch:{ all -> 0x003d }
            goto L_0x0014
        L_0x0013:
            r5 = 0
        L_0x0014:
            if (r6 == 0) goto L_0x001d
            boolean r6 = r3.f60159l     // Catch:{ all -> 0x003d }
            if (r6 != 0) goto L_0x001b
            r5 = 1
        L_0x001b:
            r3.f60159l = r4     // Catch:{ all -> 0x003d }
        L_0x001d:
            boolean r6 = r3.f60158k     // Catch:{ all -> 0x003d }
            if (r6 == 0) goto L_0x0034
            boolean r6 = r3.f60159l     // Catch:{ all -> 0x003d }
            if (r6 == 0) goto L_0x0034
            if (r5 == 0) goto L_0x0034
            ki0.e r5 = r1.mo59026b()     // Catch:{ all -> 0x003d }
            int r6 = r5.f60127m     // Catch:{ all -> 0x003d }
            int r6 = r6 + r4
            r5.f60127m = r6     // Catch:{ all -> 0x003d }
            r5 = 0
            r3.f60157j = r5     // Catch:{ all -> 0x003d }
            goto L_0x0035
        L_0x0034:
            r4 = 0
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            if (r4 == 0) goto L_0x003c
            java.io.IOException r7 = r3.mo59052d(r7, r2)
        L_0x003c:
            return r7
        L_0x003d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ki0.C23803h.mo59051c(ki0.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    /* renamed from: d */
    public final IOException mo59052d(IOException iOException, boolean z) {
        C23799e eVar;
        Socket socket;
        boolean z2;
        boolean z3;
        synchronized (this.f60149b) {
            if (z) {
                if (this.f60157j != null) {
                    throw new IllegalStateException("cannot release connection while it is in use");
                }
            }
            eVar = this.f60156i;
            if (eVar == null || this.f60157j != null || (!z && !this.f60162o)) {
                socket = null;
            } else {
                socket = mo59054f();
            }
            if (this.f60156i != null) {
                eVar = null;
            }
            z2 = false;
            if (!this.f60162o || this.f60157j != null) {
                z3 = false;
            } else {
                z3 = true;
            }
        }
        C23610d.m57797e(socket);
        if (eVar != null) {
            this.f60151d.getClass();
        }
        if (z3) {
            if (iOException != null) {
                z2 = true;
            }
            if (!this.f60161n && this.f60152e.mo61363i()) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
                if (iOException != null) {
                    interruptedIOException.initCause(iOException);
                }
                iOException = interruptedIOException;
            }
            if (z2) {
                this.f60151d.getClass();
            } else {
                this.f60151d.getClass();
            }
        }
        return iOException;
    }

    /* renamed from: e */
    public final IOException mo59053e(IOException iOException) {
        synchronized (this.f60149b) {
            this.f60162o = true;
        }
        return mo59052d(iOException, false);
    }

    /* renamed from: f */
    public final Socket mo59054f() {
        int size = this.f60156i.f60130p.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (((Reference) this.f60156i.f60130p.get(i)).get() == this) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            C23799e eVar = this.f60156i;
            eVar.f60130p.remove(i);
            this.f60156i = null;
            if (eVar.f60130p.isEmpty()) {
                eVar.f60131q = System.nanoTime();
                C23800f fVar = this.f60149b;
                fVar.getClass();
                if (eVar.f60125k || fVar.f60133a == 0) {
                    fVar.f60136d.remove(eVar);
                    z = true;
                } else {
                    fVar.notifyAll();
                }
                if (z) {
                    return eVar.f60119e;
                }
            }
            return null;
        }
        throw new IllegalStateException();
    }
}
