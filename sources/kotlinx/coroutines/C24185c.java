package kotlinx.coroutines;

import bf0.C21050d;
import bi0.C21062a;
import bi0.C21070i;
import bi0.C21079q;
import bi0.C21081s;
import bi0.C21082t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import p389bl.C13637c;
import wh0.C25171e0;
import wh0.C25178g0;
import wh0.C25189k;
import wh0.C25190k0;
import wh0.C25192l;
import wh0.C25193l0;
import wh0.C25202o0;
import wh0.C25205p0;
import wh0.C25212r1;

/* renamed from: kotlinx.coroutines.c */
public abstract class C24185c extends C25205p0 implements C25171e0 {

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f61425h;

    /* renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f61426i;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;
    private volatile /* synthetic */ Object _queue = null;

    /* renamed from: kotlinx.coroutines.c$a */
    public final class C24186a extends C24188c {

        /* renamed from: d */
        public final C25189k<C21050d> f61427d;

        public C24186a(long j, C25192l lVar) {
            super(j);
            this.f61427d = lVar;
        }

        public final void run() {
            this.f61427d.mo61825z(C24185c.this, C21050d.f52856a);
        }

        public final String toString() {
            return super.toString() + this.f61427d;
        }
    }

    /* renamed from: kotlinx.coroutines.c$b */
    public static final class C24187b extends C24188c {

        /* renamed from: d */
        public final Runnable f61429d;

        public C24187b(long j, Runnable runnable) {
            super(j);
            this.f61429d = runnable;
        }

        public final void run() {
            this.f61429d.run();
        }

        public final String toString() {
            return super.toString() + this.f61429d;
        }
    }

    /* renamed from: kotlinx.coroutines.c$c */
    public static abstract class C24188c implements Runnable, Comparable<C24188c>, C25190k0, C21082t {
        private volatile Object _heap;

        /* renamed from: b */
        public long f61430b;

        /* renamed from: c */
        public int f61431c = -1;

        public C24188c(long j) {
            this.f61430b = j;
        }

        /* renamed from: a */
        public final void mo53237a(C24189d dVar) {
            boolean z;
            if (this._heap != C13637c.f33643j) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this._heap = dVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: b */
        public final synchronized int mo60315b(long j, C24189d dVar, C24185c cVar) {
            T t;
            if (this._heap == C13637c.f33643j) {
                return 2;
            }
            synchronized (dVar) {
                try {
                    T[] tArr = dVar.f52896a;
                    if (tArr != null) {
                        t = tArr[0];
                    } else {
                        t = null;
                    }
                    C24188c cVar2 = (C24188c) t;
                    if (C24185c.m60611Y(cVar)) {
                        return 1;
                    }
                    if (cVar2 == null) {
                        dVar.f61432b = j;
                    } else {
                        long j2 = cVar2.f61430b;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - dVar.f61432b > 0) {
                            dVar.f61432b = j;
                        }
                    }
                    long j3 = this.f61430b;
                    long j4 = dVar.f61432b;
                    if (j3 - j4 < 0) {
                        this.f61430b = j4;
                    }
                    dVar.mo53231a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final int compareTo(Object obj) {
            int i = ((this.f61430b - ((C24188c) obj).f61430b) > 0 ? 1 : ((this.f61430b - ((C24188c) obj).f61430b) == 0 ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            if (i < 0) {
                return -1;
            }
            return 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: bi0.s} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void dispose() {
            /*
                r5 = this;
                monitor-enter(r5)
                java.lang.Object r0 = r5._heap     // Catch:{ all -> 0x002f }
                bi0.q r1 = p389bl.C13637c.f33643j     // Catch:{ all -> 0x002f }
                if (r0 != r1) goto L_0x0009
                monitor-exit(r5)
                return
            L_0x0009:
                boolean r2 = r0 instanceof kotlinx.coroutines.C24185c.C24189d     // Catch:{ all -> 0x002f }
                r3 = 0
                if (r2 == 0) goto L_0x0011
                kotlinx.coroutines.c$d r0 = (kotlinx.coroutines.C24185c.C24189d) r0     // Catch:{ all -> 0x002f }
                goto L_0x0012
            L_0x0011:
                r0 = r3
            L_0x0012:
                if (r0 == 0) goto L_0x002b
                monitor-enter(r0)     // Catch:{ all -> 0x002f }
                java.lang.Object r2 = r5._heap     // Catch:{ all -> 0x0028 }
                boolean r4 = r2 instanceof bi0.C21081s     // Catch:{ all -> 0x0028 }
                if (r4 == 0) goto L_0x001e
                r3 = r2
                bi0.s r3 = (bi0.C21081s) r3     // Catch:{ all -> 0x0028 }
            L_0x001e:
                if (r3 != 0) goto L_0x0021
                goto L_0x0026
            L_0x0021:
                int r2 = r5.f61431c     // Catch:{ all -> 0x0028 }
                r0.mo53233c(r2)     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x002f }
                goto L_0x002b
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002f }
                throw r1     // Catch:{ all -> 0x002f }
            L_0x002b:
                r5._heap = r1     // Catch:{ all -> 0x002f }
                monitor-exit(r5)
                return
            L_0x002f:
                r0 = move-exception
                monitor-exit(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C24185c.C24188c.dispose():void");
        }

        public final void setIndex(int i) {
            this.f61431c = i;
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("Delayed[nanos=");
            k.append(this.f61430b);
            k.append(']');
            return k.toString();
        }
    }

    /* renamed from: kotlinx.coroutines.c$d */
    public static final class C24189d extends C21081s<C24188c> {

        /* renamed from: b */
        public long f61432b;

        public C24189d(long j) {
            this.f61432b = j;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C24185c> cls2 = C24185c.class;
        f61425h = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f61426i = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [int, boolean] */
    /* renamed from: Y */
    public static final boolean m60611Y(C24185c cVar) {
        return cVar._isCompleted;
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006d A[LOOP:2: B:42:0x006d->B:45:0x0078, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x007f A[EDGE_INSN: B:99:0x007f->B:48:0x007f ?: BREAK  , SYNTHETIC] */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo60307U() {
        /*
            r12 = this;
            boolean r0 = r12.mo61846V()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r12._delayed
            kotlinx.coroutines.c$d r0 = (kotlinx.coroutines.C24185c.C24189d) r0
            r3 = 1
            r4 = 0
            r5 = 0
            if (r0 == 0) goto L_0x0050
            boolean r6 = r0.mo53232b()
            if (r6 != 0) goto L_0x0050
            long r6 = java.lang.System.nanoTime()
        L_0x001c:
            monitor-enter(r0)
            T[] r8 = r0.f52896a     // Catch:{ all -> 0x004d }
            if (r8 == 0) goto L_0x0024
            r8 = r8[r5]     // Catch:{ all -> 0x004d }
            goto L_0x0025
        L_0x0024:
            r8 = r4
        L_0x0025:
            if (r8 != 0) goto L_0x002a
            monitor-exit(r0)
            r8 = r4
            goto L_0x0048
        L_0x002a:
            kotlinx.coroutines.c$c r8 = (kotlinx.coroutines.C24185c.C24188c) r8     // Catch:{ all -> 0x004d }
            long r9 = r8.f61430b     // Catch:{ all -> 0x004d }
            long r9 = r6 - r9
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 < 0) goto L_0x0036
            r9 = 1
            goto L_0x0037
        L_0x0036:
            r9 = 0
        L_0x0037:
            if (r9 == 0) goto L_0x003e
            boolean r8 = r12.mo60308a0(r8)     // Catch:{ all -> 0x004d }
            goto L_0x003f
        L_0x003e:
            r8 = 0
        L_0x003f:
            if (r8 == 0) goto L_0x0046
            bi0.t r8 = r0.mo53233c(r5)     // Catch:{ all -> 0x004d }
            goto L_0x0047
        L_0x0046:
            r8 = r4
        L_0x0047:
            monitor-exit(r0)
        L_0x0048:
            kotlinx.coroutines.c$c r8 = (kotlinx.coroutines.C24185c.C24188c) r8
            if (r8 != 0) goto L_0x001c
            goto L_0x0050
        L_0x004d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0050:
            java.lang.Object r0 = r12._queue
            if (r0 != 0) goto L_0x0055
            goto L_0x007f
        L_0x0055:
            boolean r6 = r0 instanceof bi0.C21070i
            if (r6 == 0) goto L_0x007b
            r6 = r0
            bi0.i r6 = (bi0.C21070i) r6
            java.lang.Object r7 = r6.mo53218f()
            bi0.q r8 = bi0.C21070i.f52884g
            if (r7 == r8) goto L_0x0067
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L_0x0097
        L_0x0067:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f61425h
            bi0.i r6 = r6.mo53217e()
        L_0x006d:
            boolean r8 = r7.compareAndSet(r12, r0, r6)
            if (r8 == 0) goto L_0x0074
            goto L_0x0050
        L_0x0074:
            java.lang.Object r8 = r7.get(r12)
            if (r8 == r0) goto L_0x006d
            goto L_0x0050
        L_0x007b:
            bi0.q r6 = p389bl.C13637c.f33644k
            if (r0 != r6) goto L_0x0081
        L_0x007f:
            r7 = r4
            goto L_0x0097
        L_0x0081:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f61425h
        L_0x0083:
            boolean r7 = r6.compareAndSet(r12, r0, r4)
            if (r7 == 0) goto L_0x008b
            r6 = 1
            goto L_0x0092
        L_0x008b:
            java.lang.Object r7 = r6.get(r12)
            if (r7 == r0) goto L_0x0083
            r6 = 0
        L_0x0092:
            if (r6 == 0) goto L_0x0050
            r7 = r0
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L_0x0097:
            if (r7 == 0) goto L_0x009d
            r7.run()
            return r1
        L_0x009d:
            bi0.a<wh0.g0<?>> r0 = r12.f63479f
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto L_0x00a7
            goto L_0x00b1
        L_0x00a7:
            int r8 = r0.f52866b
            int r0 = r0.f52867c
            if (r8 != r0) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            r3 = 0
        L_0x00af:
            if (r3 == 0) goto L_0x00b3
        L_0x00b1:
            r8 = r6
            goto L_0x00b4
        L_0x00b3:
            r8 = r1
        L_0x00b4:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00b9
            goto L_0x00f4
        L_0x00b9:
            java.lang.Object r0 = r12._queue
            if (r0 == 0) goto L_0x00cf
            boolean r3 = r0 instanceof bi0.C21070i
            if (r3 == 0) goto L_0x00ca
            bi0.i r0 = (bi0.C21070i) r0
            boolean r0 = r0.mo53216d()
            if (r0 != 0) goto L_0x00cf
            goto L_0x00f4
        L_0x00ca:
            bi0.q r3 = p389bl.C13637c.f33644k
            if (r0 != r3) goto L_0x00f4
            goto L_0x00f3
        L_0x00cf:
            java.lang.Object r0 = r12._delayed
            kotlinx.coroutines.c$d r0 = (kotlinx.coroutines.C24185c.C24189d) r0
            if (r0 == 0) goto L_0x00f3
            monitor-enter(r0)
            T[] r3 = r0.f52896a     // Catch:{ all -> 0x00f0 }
            if (r3 == 0) goto L_0x00dc
            r4 = r3[r5]     // Catch:{ all -> 0x00f0 }
        L_0x00dc:
            monitor-exit(r0)
            kotlinx.coroutines.c$c r4 = (kotlinx.coroutines.C24185c.C24188c) r4
            if (r4 != 0) goto L_0x00e2
            goto L_0x00f3
        L_0x00e2:
            long r3 = r4.f61430b
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ee
            goto L_0x00f4
        L_0x00ee:
            r1 = r3
            goto L_0x00f4
        L_0x00f0:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00f3:
            r1 = r6
        L_0x00f4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C24185c.mo60307U():long");
    }

    /* renamed from: Z */
    public void mo60303Z(Runnable runnable) {
        if (mo60308a0(runnable)) {
            Thread W = mo60301W();
            if (Thread.currentThread() != W) {
                LockSupport.unpark(W);
                return;
            }
            return;
        }
        C24184b.f61423j.mo60303Z(runnable);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0039 A[LOOP:2: B:22:0x0039->B:25:0x0044, LOOP_START] */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo60308a0(java.lang.Runnable r7) {
        /*
            r6 = this;
        L_0x0000:
            java.lang.Object r0 = r6._queue
            int r1 = r6._isCompleted
            r2 = 0
            if (r1 == 0) goto L_0x0008
            return r2
        L_0x0008:
            r1 = 1
            if (r0 != 0) goto L_0x001f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f61425h
            r4 = 0
        L_0x000e:
            boolean r0 = r3.compareAndSet(r6, r4, r7)
            if (r0 == 0) goto L_0x0016
            r2 = 1
            goto L_0x001c
        L_0x0016:
            java.lang.Object r0 = r3.get(r6)
            if (r0 == 0) goto L_0x000e
        L_0x001c:
            if (r2 == 0) goto L_0x0000
            return r1
        L_0x001f:
            boolean r3 = r0 instanceof bi0.C21070i
            if (r3 == 0) goto L_0x0048
            r3 = r0
            bi0.i r3 = (bi0.C21070i) r3
            int r4 = r3.mo53213a(r7)
            if (r4 == 0) goto L_0x0047
            if (r4 == r1) goto L_0x0033
            r0 = 2
            if (r4 == r0) goto L_0x0032
            goto L_0x0000
        L_0x0032:
            return r2
        L_0x0033:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f61425h
            bi0.i r3 = r3.mo53217e()
        L_0x0039:
            boolean r1 = r2.compareAndSet(r6, r0, r3)
            if (r1 == 0) goto L_0x0040
            goto L_0x0000
        L_0x0040:
            java.lang.Object r1 = r2.get(r6)
            if (r1 == r0) goto L_0x0039
            goto L_0x0000
        L_0x0047:
            return r1
        L_0x0048:
            bi0.q r3 = p389bl.C13637c.f33644k
            if (r0 != r3) goto L_0x004d
            return r2
        L_0x004d:
            bi0.i r3 = new bi0.i
            r4 = 8
            r3.<init>(r4, r1)
            r4 = r0
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.mo53213a(r4)
            r3.mo53213a(r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f61425h
        L_0x005f:
            boolean r5 = r4.compareAndSet(r6, r0, r3)
            if (r5 == 0) goto L_0x0067
            r2 = 1
            goto L_0x006d
        L_0x0067:
            java.lang.Object r5 = r4.get(r6)
            if (r5 == r0) goto L_0x005f
        L_0x006d:
            if (r2 == 0) goto L_0x0000
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C24185c.mo60308a0(java.lang.Runnable):boolean");
    }

    /* renamed from: b0 */
    public final boolean mo60309b0() {
        boolean z;
        C21062a<C25178g0<?>> aVar = this.f63479f;
        if (aVar == null || aVar.f52866b == aVar.f52867c) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        C24189d dVar = (C24189d) this._delayed;
        if (dVar != null && !dVar.mo53232b()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof C21070i) {
                return ((C21070i) obj).mo53216d();
            }
            if (obj == C13637c.f33644k) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: c0 */
    public final void mo60310c0() {
        this._queue = null;
        this._delayed = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015 A[LOOP:0: B:6:0x0015->B:9:0x0020, LOOP_START] */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60311d0(long r6, kotlinx.coroutines.C24185c.C24188c r8) {
        /*
            r5 = this;
            int r0 = r5._isCompleted
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0008
            r0 = 1
            goto L_0x002d
        L_0x0008:
            java.lang.Object r0 = r5._delayed
            kotlinx.coroutines.c$d r0 = (kotlinx.coroutines.C24185c.C24189d) r0
            if (r0 != 0) goto L_0x0029
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f61426i
            kotlinx.coroutines.c$d r4 = new kotlinx.coroutines.c$d
            r4.<init>(r6)
        L_0x0015:
            boolean r0 = r3.compareAndSet(r5, r2, r4)
            if (r0 == 0) goto L_0x001c
            goto L_0x0022
        L_0x001c:
            java.lang.Object r0 = r3.get(r5)
            if (r0 == 0) goto L_0x0015
        L_0x0022:
            java.lang.Object r0 = r5._delayed
            mf0.C24362h.m61208c(r0)
            kotlinx.coroutines.c$d r0 = (kotlinx.coroutines.C24185c.C24189d) r0
        L_0x0029:
            int r0 = r8.mo60315b(r6, r0, r5)
        L_0x002d:
            if (r0 == 0) goto L_0x0045
            if (r0 == r1) goto L_0x0041
            r6 = 2
            if (r0 != r6) goto L_0x0035
            goto L_0x006d
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "unexpected result"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x0041:
            r5.mo60302X(r6, r8)
            goto L_0x006d
        L_0x0045:
            java.lang.Object r6 = r5._delayed
            kotlinx.coroutines.c$d r6 = (kotlinx.coroutines.C24185c.C24189d) r6
            r7 = 0
            if (r6 == 0) goto L_0x005a
            monitor-enter(r6)
            T[] r0 = r6.f52896a     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0053
            r2 = r0[r7]     // Catch:{ all -> 0x0057 }
        L_0x0053:
            monitor-exit(r6)
            kotlinx.coroutines.c$c r2 = (kotlinx.coroutines.C24185c.C24188c) r2
            goto L_0x005a
        L_0x0057:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x005a:
            if (r2 != r8) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r1 = 0
        L_0x005e:
            if (r1 == 0) goto L_0x006d
            java.lang.Thread r6 = r5.mo60301W()
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            if (r7 == r6) goto L_0x006d
            java.util.concurrent.locks.LockSupport.unpark(r6)
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C24185c.mo60311d0(long, kotlinx.coroutines.c$c):void");
    }

    /* renamed from: f */
    public final void mo53203f(long j, C25192l lVar) {
        long j2 = 0;
        if (j > 0) {
            if (j >= 9223372036854L) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = 1000000 * j;
            }
        }
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            C24186a aVar = new C24186a(j2 + nanoTime, lVar);
            mo60311d0(nanoTime, aVar);
            lVar.mo61821f(new C25193l0(aVar));
        }
    }

    /* renamed from: g */
    public C25190k0 mo53204g(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return C25171e0.C25172a.m63210a(j, runnable, coroutineContext);
    }

    /* renamed from: k */
    public final void mo4335k(CoroutineContext coroutineContext, Runnable runnable) {
        mo60303Z(runnable);
    }

    public void shutdown() {
        C24188c cVar;
        ThreadLocal<C25202o0> threadLocal = C25212r1.f63483a;
        C25212r1.f63483a.set((Object) null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            boolean z = false;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f61425h;
                C21079q qVar = C13637c.f33644k;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, qVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    break;
                }
            } else if (obj instanceof C21070i) {
                ((C21070i) obj).mo53214b();
                break;
            } else if (obj == C13637c.f33644k) {
                break;
            } else {
                C21070i iVar = new C21070i(8, true);
                iVar.mo53213a((Runnable) obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f61425h;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, iVar)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    break;
                }
            }
        }
        do {
        } while (mo60307U() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            C24189d dVar = (C24189d) this._delayed;
            if (dVar != null && (cVar = (C24188c) dVar.mo53234d()) != null) {
                mo60302X(nanoTime, cVar);
            } else {
                return;
            }
        }
    }
}
