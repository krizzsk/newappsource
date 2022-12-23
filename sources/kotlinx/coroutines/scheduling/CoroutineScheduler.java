package kotlinx.coroutines.scheduling;

import bf0.C21050d;
import bi0.C21076n;
import bi0.C21079q;
import ci0.C21208c;
import ci0.C21212g;
import ci0.C21213h;
import ci0.C21215j;
import ci0.C21216k;
import ci0.C21218m;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.random.Random;
import mf0.C24362h;
import p001a0.C0016g;
import wh0.C25154a0;

public final class CoroutineScheduler implements Executor, Closeable {

    /* renamed from: i */
    public static final /* synthetic */ AtomicLongFieldUpdater f61499i = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");

    /* renamed from: j */
    public static final /* synthetic */ AtomicLongFieldUpdater f61500j = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");

    /* renamed from: k */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f61501k = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");

    /* renamed from: l */
    public static final C21079q f61502l = new C21079q("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated;

    /* renamed from: b */
    public final int f61503b;

    /* renamed from: c */
    public final int f61504c;
    public volatile /* synthetic */ long controlState;

    /* renamed from: d */
    public final long f61505d;

    /* renamed from: e */
    public final String f61506e;

    /* renamed from: f */
    public final C21208c f61507f;

    /* renamed from: g */
    public final C21208c f61508g;

    /* renamed from: h */
    public final C21076n<C24216b> f61509h;
    private volatile /* synthetic */ long parkedWorkersStack;

    @Metadata(mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, mo59060d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    /* renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$a */
    public /* synthetic */ class C24215a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f61510a;

        static {
            int[] iArr = new int[WorkerState.values().length];
            iArr[WorkerState.PARKING.ordinal()] = 1;
            iArr[WorkerState.BLOCKING.ordinal()] = 2;
            iArr[WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            iArr[WorkerState.DORMANT.ordinal()] = 4;
            iArr[WorkerState.TERMINATED.ordinal()] = 5;
            f61510a = iArr;
        }
    }

    /* renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$b */
    public final class C24216b extends Thread {

        /* renamed from: i */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f61511i = AtomicIntegerFieldUpdater.newUpdater(C24216b.class, "workerCtl");

        /* renamed from: b */
        public final C21218m f61512b;

        /* renamed from: c */
        public WorkerState f61513c;

        /* renamed from: d */
        public long f61514d;

        /* renamed from: e */
        public long f61515e;

        /* renamed from: f */
        public int f61516f;

        /* renamed from: g */
        public boolean f61517g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        public volatile /* synthetic */ int workerCtl;

        public C24216b() {
            throw null;
        }

        public C24216b(int i) {
            setDaemon(true);
            this.f61512b = new C21218m();
            this.f61513c = WorkerState.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = CoroutineScheduler.f61502l;
            this.f61516f = Random.f60192b.mo59289b();
            mo60390f(i);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: ci0.g} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: ci0.g} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007e  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final ci0.C21212g mo60385a(boolean r11) {
            /*
                r10 = this;
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r10.f61513c
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                r2 = 1
                r3 = 0
                if (r0 != r1) goto L_0x0009
                goto L_0x0032
            L_0x0009:
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
            L_0x000b:
                long r6 = r0.controlState
                r4 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r4 = r4 & r6
                r1 = 42
                long r4 = r4 >> r1
                int r1 = (int) r4
                if (r1 != 0) goto L_0x001b
                r0 = 0
                goto L_0x002c
            L_0x001b:
                r4 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r8 = r6 - r4
                java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = kotlinx.coroutines.scheduling.CoroutineScheduler.f61500j
                r5 = r0
                boolean r1 = r4.compareAndSet(r5, r6, r8)
                if (r1 == 0) goto L_0x000b
                r0 = 1
            L_0x002c:
                if (r0 == 0) goto L_0x0034
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                r10.f61513c = r0
            L_0x0032:
                r0 = 1
                goto L_0x0035
            L_0x0034:
                r0 = 0
            L_0x0035:
                r1 = 0
                if (r0 == 0) goto L_0x007e
                if (r11 == 0) goto L_0x0072
                kotlinx.coroutines.scheduling.CoroutineScheduler r11 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
                int r11 = r11.f61503b
                int r11 = r11 * 2
                int r11 = r10.mo60388d(r11)
                if (r11 != 0) goto L_0x0047
                goto L_0x0048
            L_0x0047:
                r2 = 0
            L_0x0048:
                if (r2 == 0) goto L_0x0051
                ci0.g r11 = r10.mo60389e()
                if (r11 == 0) goto L_0x0051
                goto L_0x007d
            L_0x0051:
                ci0.m r11 = r10.f61512b
                r11.getClass()
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = ci0.C21218m.f53157b
                java.lang.Object r0 = r0.getAndSet(r11, r1)
                ci0.g r0 = (ci0.C21212g) r0
                if (r0 != 0) goto L_0x0065
                ci0.g r11 = r11.mo53564d()
                goto L_0x0066
            L_0x0065:
                r11 = r0
            L_0x0066:
                if (r11 == 0) goto L_0x0069
                goto L_0x007d
            L_0x0069:
                if (r2 != 0) goto L_0x0079
                ci0.g r11 = r10.mo60389e()
                if (r11 == 0) goto L_0x0079
                goto L_0x007d
            L_0x0072:
                ci0.g r11 = r10.mo60389e()
                if (r11 == 0) goto L_0x0079
                goto L_0x007d
            L_0x0079:
                ci0.g r11 = r10.mo60393i(r3)
            L_0x007d:
                return r11
            L_0x007e:
                if (r11 == 0) goto L_0x00a1
                ci0.m r11 = r10.f61512b
                r11.getClass()
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = ci0.C21218m.f53157b
                java.lang.Object r0 = r0.getAndSet(r11, r1)
                ci0.g r0 = (ci0.C21212g) r0
                if (r0 != 0) goto L_0x0093
                ci0.g r0 = r11.mo53564d()
            L_0x0093:
                if (r0 != 0) goto L_0x00ac
                kotlinx.coroutines.scheduling.CoroutineScheduler r11 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
                ci0.c r11 = r11.f61508g
                java.lang.Object r11 = r11.mo53212d()
                r0 = r11
                ci0.g r0 = (ci0.C21212g) r0
                goto L_0x00ac
            L_0x00a1:
                kotlinx.coroutines.scheduling.CoroutineScheduler r11 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
                ci0.c r11 = r11.f61508g
                java.lang.Object r11 = r11.mo53212d()
                r0 = r11
                ci0.g r0 = (ci0.C21212g) r0
            L_0x00ac:
                if (r0 != 0) goto L_0x00b2
                ci0.g r0 = r10.mo60393i(r2)
            L_0x00b2:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.C24216b.mo60385a(boolean):ci0.g");
        }

        /* renamed from: b */
        public final int mo60386b() {
            return this.indexInArray;
        }

        /* renamed from: c */
        public final Object mo60387c() {
            return this.nextParkedWorker;
        }

        /* renamed from: d */
        public final int mo60388d(int i) {
            int i2 = this.f61516f;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f61516f = i5;
            int i6 = i - 1;
            if ((i6 & i) == 0) {
                return i5 & i6;
            }
            return (i5 & Integer.MAX_VALUE) % i;
        }

        /* renamed from: e */
        public final C21212g mo60389e() {
            if (mo60388d(2) == 0) {
                C21212g gVar = (C21212g) CoroutineScheduler.this.f61507f.mo53212d();
                if (gVar != null) {
                    return gVar;
                }
                return (C21212g) CoroutineScheduler.this.f61508g.mo53212d();
            }
            C21212g gVar2 = (C21212g) CoroutineScheduler.this.f61508g.mo53212d();
            if (gVar2 != null) {
                return gVar2;
            }
            return (C21212g) CoroutineScheduler.this.f61507f.mo53212d();
        }

        /* renamed from: f */
        public final void mo60390f(int i) {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.f61506e);
            sb.append("-worker-");
            if (i == 0) {
                str = "TERMINATED";
            } else {
                str = String.valueOf(i);
            }
            sb.append(str);
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* renamed from: g */
        public final void mo60391g(Object obj) {
            this.nextParkedWorker = obj;
        }

        /* renamed from: h */
        public final boolean mo60392h(WorkerState workerState) {
            boolean z;
            WorkerState workerState2 = this.f61513c;
            if (workerState2 == WorkerState.CPU_ACQUIRED) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                CoroutineScheduler.f61500j.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.f61513c = workerState;
            }
            return z;
        }

        /* renamed from: i */
        public final C21212g mo60393i(boolean z) {
            long j;
            int i = (int) (CoroutineScheduler.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int d = mo60388d(i);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long j2 = Long.MAX_VALUE;
            for (int i2 = 0; i2 < i; i2++) {
                d++;
                if (d > i) {
                    d = 1;
                }
                C24216b b = coroutineScheduler.f61509h.mo53225b(d);
                if (!(b == null || b == this)) {
                    if (z) {
                        j = this.f61512b.mo53565e(b.f61512b);
                    } else {
                        C21218m mVar = this.f61512b;
                        C21218m mVar2 = b.f61512b;
                        mVar.getClass();
                        C21212g d2 = mVar2.mo53564d();
                        if (d2 != null) {
                            mVar.mo53561a(d2, false);
                            j = -1;
                        } else {
                            j = mVar.mo53566f(mVar2, false);
                        }
                    }
                    if (j == -1) {
                        C21218m mVar3 = this.f61512b;
                        mVar3.getClass();
                        C21212g gVar = (C21212g) C21218m.f53157b.getAndSet(mVar3, (Object) null);
                        if (gVar == null) {
                            return mVar3.mo53564d();
                        }
                        return gVar;
                    } else if (j > 0) {
                        j2 = Math.min(j2, j);
                    }
                }
            }
            if (j2 == Long.MAX_VALUE) {
                j2 = 0;
            }
            this.f61515e = j2;
            return null;
        }

        public final void run() {
            WorkerState workerState;
            boolean z;
            boolean z2;
            WorkerState workerState2;
            loop0:
            while (true) {
                boolean z3 = false;
                while (!CoroutineScheduler.this.isTerminated() && this.f61513c != (workerState = WorkerState.TERMINATED)) {
                    C21212g a = mo60385a(this.f61517g);
                    if (a == null) {
                        this.f61517g = false;
                        if (this.f61515e == 0) {
                            if (this.nextParkedWorker != CoroutineScheduler.f61502l) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                this.workerCtl = -1;
                                while (true) {
                                    if (this.nextParkedWorker != CoroutineScheduler.f61502l) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (!z2 || this.workerCtl != -1 || CoroutineScheduler.this.isTerminated() || this.f61513c == (workerState2 = WorkerState.TERMINATED)) {
                                        break;
                                    }
                                    mo60392h(WorkerState.PARKING);
                                    Thread.interrupted();
                                    if (this.f61514d == 0) {
                                        this.f61514d = System.nanoTime() + CoroutineScheduler.this.f61505d;
                                    }
                                    LockSupport.parkNanos(CoroutineScheduler.this.f61505d);
                                    if (System.nanoTime() - this.f61514d >= 0) {
                                        this.f61514d = 0;
                                        CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
                                        synchronized (coroutineScheduler.f61509h) {
                                            if (!coroutineScheduler.isTerminated()) {
                                                if (((int) (coroutineScheduler.controlState & 2097151)) > coroutineScheduler.f61503b) {
                                                    if (f61511i.compareAndSet(this, -1, 1)) {
                                                        int i = this.indexInArray;
                                                        mo60390f(0);
                                                        coroutineScheduler.mo60380h(this, i, 0);
                                                        int andDecrement = (int) (CoroutineScheduler.f61500j.getAndDecrement(coroutineScheduler) & 2097151);
                                                        if (andDecrement != i) {
                                                            C24216b b = coroutineScheduler.f61509h.mo53225b(andDecrement);
                                                            C24362h.m61208c(b);
                                                            C24216b bVar = b;
                                                            coroutineScheduler.f61509h.mo53226c(i, bVar);
                                                            bVar.mo60390f(i);
                                                            coroutineScheduler.mo60380h(bVar, andDecrement, i);
                                                        }
                                                        coroutineScheduler.f61509h.mo53226c(andDecrement, (C24216b) null);
                                                        C21050d dVar = C21050d.f52856a;
                                                        this.f61513c = workerState2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                CoroutineScheduler.this.mo60379g(this);
                            }
                        } else if (!z3) {
                            z3 = true;
                        } else {
                            mo60392h(WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f61515e);
                            this.f61515e = 0;
                        }
                    } else {
                        this.f61515e = 0;
                        int b2 = a.f53146c.mo53558b();
                        this.f61514d = 0;
                        if (this.f61513c == WorkerState.PARKING) {
                            this.f61513c = WorkerState.BLOCKING;
                        }
                        if (b2 != 0 && mo60392h(WorkerState.BLOCKING)) {
                            CoroutineScheduler coroutineScheduler2 = CoroutineScheduler.this;
                            if (!coroutineScheduler2.mo60383q() && !coroutineScheduler2.mo60382j(coroutineScheduler2.controlState)) {
                                coroutineScheduler2.mo60383q();
                            }
                        }
                        CoroutineScheduler.this.getClass();
                        try {
                            a.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        if (b2 != 0) {
                            CoroutineScheduler.f61500j.addAndGet(CoroutineScheduler.this, -2097152);
                            if (this.f61513c != workerState) {
                                this.f61513c = WorkerState.DORMANT;
                            }
                        }
                    }
                }
            }
            mo60392h(WorkerState.TERMINATED);
            return;
        }
    }

    public CoroutineScheduler(int i, int i2, String str, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f61503b = i;
        this.f61504c = i2;
        this.f61505d = j;
        this.f61506e = str;
        boolean z4 = true;
        if (i >= 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 <= 2097150) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (j <= 0 ? false : z4) {
                        this.f61507f = new C21208c();
                        this.f61508g = new C21208c();
                        this.parkedWorkersStack = 0;
                        this.f61509h = new C21076n<>(i + 1);
                        this.controlState = ((long) i) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(C16530d.m42012e("Idle worker keep alive time ", j, " must be positive").toString());
                }
                throw new IllegalArgumentException(C25541a.m63878h("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(C13715c.m34244j("Max pool size ", i2, " should be greater than or equals to core pool size ", i).toString());
        }
        throw new IllegalArgumentException(C25541a.m63878h("Core pool size ", i, " should be at least 1").toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (r1 == null) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f61501k
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r9, r1, r2)
            if (r0 != 0) goto L_0x000c
            goto L_0x00a9
        L_0x000c:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r3 = r0 instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.C24216b
            r4 = 0
            if (r3 == 0) goto L_0x0018
            kotlinx.coroutines.scheduling.CoroutineScheduler$b r0 = (kotlinx.coroutines.scheduling.CoroutineScheduler.C24216b) r0
            goto L_0x0019
        L_0x0018:
            r0 = r4
        L_0x0019:
            if (r0 == 0) goto L_0x0024
            kotlinx.coroutines.scheduling.CoroutineScheduler r3 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
            boolean r3 = mf0.C24362h.m61206a(r3, r9)
            if (r3 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r0 = r4
        L_0x0025:
            bi0.n<kotlinx.coroutines.scheduling.CoroutineScheduler$b> r3 = r9.f61509h
            monitor-enter(r3)
            long r5 = r9.controlState     // Catch:{ all -> 0x00bd }
            r7 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r5 & r7
            int r6 = (int) r5
            monitor-exit(r3)
            if (r2 > r6) goto L_0x0076
            r3 = 1
        L_0x0033:
            bi0.n<kotlinx.coroutines.scheduling.CoroutineScheduler$b> r5 = r9.f61509h
            java.lang.Object r5 = r5.mo53225b(r3)
            mf0.C24362h.m61208c(r5)
            kotlinx.coroutines.scheduling.CoroutineScheduler$b r5 = (kotlinx.coroutines.scheduling.CoroutineScheduler.C24216b) r5
            if (r5 == r0) goto L_0x0071
        L_0x0040:
            boolean r7 = r5.isAlive()
            if (r7 == 0) goto L_0x004f
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r7 = 10000(0x2710, double:4.9407E-320)
            r5.join(r7)
            goto L_0x0040
        L_0x004f:
            ci0.m r5 = r5.f61512b
            ci0.c r7 = r9.f61508g
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = ci0.C21218m.f53157b
            java.lang.Object r8 = r8.getAndSet(r5, r4)
            ci0.g r8 = (ci0.C21212g) r8
            if (r8 == 0) goto L_0x0063
            r7.mo53209a(r8)
        L_0x0063:
            ci0.g r8 = r5.mo53564d()
            if (r8 != 0) goto L_0x006b
            r8 = 0
            goto L_0x006f
        L_0x006b:
            r7.mo53209a(r8)
            r8 = 1
        L_0x006f:
            if (r8 != 0) goto L_0x0063
        L_0x0071:
            if (r3 == r6) goto L_0x0076
            int r3 = r3 + 1
            goto L_0x0033
        L_0x0076:
            ci0.c r1 = r9.f61508g
            r1.mo53210b()
            ci0.c r1 = r9.f61507f
            r1.mo53210b()
        L_0x0080:
            if (r0 == 0) goto L_0x0088
            ci0.g r1 = r0.mo60385a(r2)
            if (r1 != 0) goto L_0x00aa
        L_0x0088:
            ci0.c r1 = r9.f61507f
            java.lang.Object r1 = r1.mo53212d()
            ci0.g r1 = (ci0.C21212g) r1
            if (r1 != 0) goto L_0x00aa
            ci0.c r1 = r9.f61508g
            java.lang.Object r1 = r1.mo53212d()
            ci0.g r1 = (ci0.C21212g) r1
            if (r1 != 0) goto L_0x00aa
            if (r0 == 0) goto L_0x00a3
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
            r0.mo60392h(r1)
        L_0x00a3:
            r0 = 0
            r9.parkedWorkersStack = r0
            r9.controlState = r0
        L_0x00a9:
            return
        L_0x00aa:
            r1.run()     // Catch:{ all -> 0x00ae }
            goto L_0x0080
        L_0x00ae:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00bb }
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()     // Catch:{ all -> 0x00bb }
            r4.uncaughtException(r3, r1)     // Catch:{ all -> 0x00bb }
            goto L_0x0080
        L_0x00bb:
            r0 = move-exception
            throw r0
        L_0x00bd:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.close():void");
    }

    /* renamed from: e */
    public final int mo60376e() {
        boolean z;
        synchronized (this.f61509h) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            boolean z2 = false;
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.f61503b) {
                return 0;
            }
            if (i >= this.f61504c) {
                return 0;
            }
            int i3 = ((int) (this.controlState & 2097151)) + 1;
            if (i3 <= 0 || this.f61509h.mo53225b(i3) != null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C24216b bVar = new C24216b(i3);
                this.f61509h.mo53226c(i3, bVar);
                if (i3 == ((int) (2097151 & f61500j.incrementAndGet(this)))) {
                    z2 = true;
                }
                if (z2) {
                    bVar.start();
                    int i4 = i2 + 1;
                    return i4;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final void execute(Runnable runnable) {
        mo60378f(runnable, C21216k.f53154f, false);
    }

    /* renamed from: f */
    public final void mo60378f(Runnable runnable, C21213h hVar, boolean z) {
        C21212g gVar;
        C24216b bVar;
        C21212g gVar2;
        boolean z2;
        boolean z3;
        C21216k.f53153e.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof C21212g) {
            gVar = (C21212g) runnable;
            gVar.f53145b = nanoTime;
            gVar.f53146c = hVar;
        } else {
            gVar = new C21215j(runnable, nanoTime, hVar);
        }
        Thread currentThread = Thread.currentThread();
        C24216b bVar2 = null;
        if (currentThread instanceof C24216b) {
            bVar = (C24216b) currentThread;
        } else {
            bVar = null;
        }
        if (bVar != null && C24362h.m61206a(CoroutineScheduler.this, this)) {
            bVar2 = bVar;
        }
        boolean z4 = true;
        if (bVar2 == null || bVar2.f61513c == WorkerState.TERMINATED || (gVar.f53146c.mo53558b() == 0 && bVar2.f61513c == WorkerState.BLOCKING)) {
            gVar2 = gVar;
        } else {
            bVar2.f61517g = true;
            gVar2 = bVar2.f61512b.mo53561a(gVar, z);
        }
        if (gVar2 != null) {
            if (gVar2.f53146c.mo53558b() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                z3 = this.f61508g.mo53209a(gVar2);
            } else {
                z3 = this.f61507f.mo53209a(gVar2);
            }
            if (!z3) {
                throw new RejectedExecutionException(C0016g.m31o(new StringBuilder(), this.f61506e, " was terminated"));
            }
        }
        if (!z || bVar2 == null) {
            z4 = false;
        }
        if (gVar.f53146c.mo53558b() != 0) {
            long addAndGet = f61500j.addAndGet(this, 2097152);
            if (!z4 && !mo60383q() && !mo60382j(addAndGet)) {
                mo60383q();
            }
        } else if (!z4 && !mo60383q() && !mo60382j(this.controlState)) {
            mo60383q();
        }
    }

    /* renamed from: g */
    public final void mo60379g(C24216b bVar) {
        long j;
        int b;
        if (bVar.mo60387c() == f61502l) {
            do {
                j = this.parkedWorkersStack;
                b = bVar.mo60386b();
                bVar.mo60391g(this.f61509h.mo53225b((int) (2097151 & j)));
            } while (!f61499i.compareAndSet(this, j, ((long) b) | ((2097152 + j) & -2097152)));
        }
    }

    /* renamed from: h */
    public final void mo60380h(C24216b bVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            if (i3 == i) {
                if (i2 == 0) {
                    Object c = bVar.mo60387c();
                    while (true) {
                        if (c == f61502l) {
                            i3 = -1;
                            break;
                        } else if (c == null) {
                            i3 = 0;
                            break;
                        } else {
                            C24216b bVar2 = (C24216b) c;
                            i3 = bVar2.mo60386b();
                            if (i3 != 0) {
                                break;
                            }
                            c = bVar2.mo60387c();
                        }
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (f61499i.compareAndSet(this, j, j2 | ((long) i3))) {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    /* renamed from: j */
    public final boolean mo60382j(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        if (i < this.f61503b) {
            int e = mo60376e();
            if (e == 1 && this.f61503b > 1) {
                mo60376e();
            }
            if (e > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    public final boolean mo60383q() {
        C21079q qVar;
        int i;
        while (true) {
            long j = this.parkedWorkersStack;
            C24216b b = this.f61509h.mo53225b((int) (2097151 & j));
            if (b == null) {
                b = null;
            } else {
                long j2 = (2097152 + j) & -2097152;
                Object c = b.mo60387c();
                while (true) {
                    qVar = f61502l;
                    if (c == qVar) {
                        i = -1;
                        break;
                    } else if (c == null) {
                        i = 0;
                        break;
                    } else {
                        C24216b bVar = (C24216b) c;
                        i = bVar.mo60386b();
                        if (i != 0) {
                            break;
                        }
                        c = bVar.mo60387c();
                    }
                }
                if (i >= 0) {
                    if (f61499i.compareAndSet(this, j, ((long) i) | j2)) {
                        b.mo60391g(qVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (b == null) {
                return false;
            }
            if (C24216b.f61511i.compareAndSet(b, -1, 0)) {
                LockSupport.unpark(b);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int a = this.f61509h.mo53224a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a; i6++) {
            C24216b b = this.f61509h.mo53225b(i6);
            if (b != null) {
                int c = b.f61512b.mo53563c();
                int i7 = C24215a.f61510a[b.f61513c.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(c);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(c);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (c > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(c);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i7 == 5) {
                    i5++;
                }
            }
        }
        long j = this.controlState;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f61506e);
        sb4.append('@');
        sb4.append(C25154a0.m63137b(this));
        sb4.append("[Pool Size {core = ");
        sb4.append(this.f61503b);
        sb4.append(", max = ");
        C0016g.m41y(sb4, this.f61504c, "}, Worker States {CPU = ", i, ", blocking = ");
        C0016g.m41y(sb4, i2, ", parked = ", i3, ", dormant = ");
        C0016g.m41y(sb4, i4, ", terminated = ", i5, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f61507f.mo53211c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f61508g.mo53211c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(this.f61503b - ((int) ((9223367638808264704L & j) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
