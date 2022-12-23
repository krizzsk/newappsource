package hi0;

import hi0.C23569w;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

/* renamed from: hi0.l */
public final class C23548l {

    /* renamed from: a */
    public int f59514a = 64;

    /* renamed from: b */
    public int f59515b = 5;

    /* renamed from: c */
    public ExecutorService f59516c;

    /* renamed from: d */
    public final ArrayDeque f59517d = new ArrayDeque();

    /* renamed from: e */
    public final ArrayDeque f59518e = new ArrayDeque();

    /* renamed from: f */
    public final ArrayDeque f59519f = new ArrayDeque();

    public C23548l(ExecutorService executorService) {
        this.f59516c = executorService;
    }

    /* renamed from: a */
    public final C23569w.C23570a mo58673a(String str) {
        Iterator it = this.f59518e.iterator();
        while (it.hasNext()) {
            C23569w.C23570a aVar = (C23569w.C23570a) it.next();
            if (aVar.f59635e.f59630d.f59636a.f59537d.equals(str)) {
                return aVar;
            }
        }
        Iterator it2 = this.f59517d.iterator();
        while (it2.hasNext()) {
            C23569w.C23570a aVar2 = (C23569w.C23570a) it2.next();
            if (aVar2.f59635e.f59630d.f59636a.f59537d.equals(str)) {
                return aVar2;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo58674b(C23569w.C23570a aVar) {
        aVar.f59634d.decrementAndGet();
        mo58675c(this.f59518e, aVar);
    }

    /* renamed from: c */
    public final void mo58675c(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        mo58676d();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public final void mo58676d() {
        /*
            r14 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r14)
            java.util.ArrayDeque r1 = r14.f59517d     // Catch:{ all -> 0x00c2 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00c2 }
        L_0x000c:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00c2 }
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00c2 }
            hi0.w$a r2 = (hi0.C23569w.C23570a) r2     // Catch:{ all -> 0x00c2 }
            java.util.ArrayDeque r3 = r14.f59518e     // Catch:{ all -> 0x00c2 }
            int r3 = r3.size()     // Catch:{ all -> 0x00c2 }
            int r4 = r14.f59514a     // Catch:{ all -> 0x00c2 }
            if (r3 < r4) goto L_0x0023
            goto L_0x003f
        L_0x0023:
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f59634d     // Catch:{ all -> 0x00c2 }
            int r3 = r3.get()     // Catch:{ all -> 0x00c2 }
            int r4 = r14.f59515b     // Catch:{ all -> 0x00c2 }
            if (r3 < r4) goto L_0x002e
            goto L_0x000c
        L_0x002e:
            r1.remove()     // Catch:{ all -> 0x00c2 }
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f59634d     // Catch:{ all -> 0x00c2 }
            r3.incrementAndGet()     // Catch:{ all -> 0x00c2 }
            r0.add(r2)     // Catch:{ all -> 0x00c2 }
            java.util.ArrayDeque r3 = r14.f59518e     // Catch:{ all -> 0x00c2 }
            r3.add(r2)     // Catch:{ all -> 0x00c2 }
            goto L_0x000c
        L_0x003f:
            monitor-enter(r14)     // Catch:{ all -> 0x00c2 }
            java.util.ArrayDeque r1 = r14.f59518e     // Catch:{ all -> 0x00bf }
            int r1 = r1.size()     // Catch:{ all -> 0x00bf }
            java.util.ArrayDeque r2 = r14.f59519f     // Catch:{ all -> 0x00bf }
            int r2 = r2.size()     // Catch:{ all -> 0x00bf }
            int r1 = r1 + r2
            monitor-exit(r14)     // Catch:{ all -> 0x00c2 }
            monitor-exit(r14)     // Catch:{ all -> 0x00c2 }
            int r1 = r0.size()
            r2 = 0
            r3 = 0
        L_0x0055:
            if (r3 >= r1) goto L_0x00be
            java.lang.Object r4 = r0.get(r3)
            hi0.w$a r4 = (hi0.C23569w.C23570a) r4
            monitor-enter(r14)
            java.util.concurrent.ExecutorService r5 = r14.f59516c     // Catch:{ all -> 0x00bb }
            if (r5 != 0) goto L_0x0080
            java.util.concurrent.ThreadPoolExecutor r5 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x00bb }
            r7 = 0
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 60
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00bb }
            java.util.concurrent.SynchronousQueue r12 = new java.util.concurrent.SynchronousQueue     // Catch:{ all -> 0x00bb }
            r12.<init>()     // Catch:{ all -> 0x00bb }
            java.lang.String r6 = "OkHttp Dispatcher"
            byte[] r13 = ii0.C23610d.f59684a     // Catch:{ all -> 0x00bb }
            ii0.c r13 = new ii0.c     // Catch:{ all -> 0x00bb }
            r13.<init>(r6, r2)     // Catch:{ all -> 0x00bb }
            r6 = r5
            r6.<init>(r7, r8, r9, r11, r12, r13)     // Catch:{ all -> 0x00bb }
            r14.f59516c = r5     // Catch:{ all -> 0x00bb }
        L_0x0080:
            java.util.concurrent.ExecutorService r5 = r14.f59516c     // Catch:{ all -> 0x00bb }
            monitor-exit(r14)
            r4.getClass()
            r5.execute(r4)     // Catch:{ RejectedExecutionException -> 0x008c }
            goto L_0x00ae
        L_0x008a:
            r0 = move-exception
            goto L_0x00b1
        L_0x008c:
            r5 = move-exception
            java.io.InterruptedIOException r6 = new java.io.InterruptedIOException     // Catch:{ all -> 0x008a }
            java.lang.String r7 = "executor rejected"
            r6.<init>(r7)     // Catch:{ all -> 0x008a }
            r6.initCause(r5)     // Catch:{ all -> 0x008a }
            hi0.w r5 = r4.f59635e     // Catch:{ all -> 0x008a }
            ki0.h r5 = r5.f59629c     // Catch:{ all -> 0x008a }
            r5.mo59053e(r6)     // Catch:{ all -> 0x008a }
            hi0.f r5 = r4.f59633c     // Catch:{ all -> 0x008a }
            hi0.w r7 = r4.f59635e     // Catch:{ all -> 0x008a }
            r5.mo5762c(r7, r6)     // Catch:{ all -> 0x008a }
            hi0.w r5 = r4.f59635e
            hi0.v r5 = r5.f59628b
            hi0.l r5 = r5.f59575b
            r5.mo58674b(r4)
        L_0x00ae:
            int r3 = r3 + 1
            goto L_0x0055
        L_0x00b1:
            hi0.w r1 = r4.f59635e
            hi0.v r1 = r1.f59628b
            hi0.l r1 = r1.f59575b
            r1.mo58674b(r4)
            throw r0
        L_0x00bb:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x00be:
            return
        L_0x00bf:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x00c2 }
            throw r0     // Catch:{ all -> 0x00c2 }
        L_0x00c2:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x00c2 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hi0.C23548l.mo58676d():void");
    }

    public C23548l() {
    }
}
