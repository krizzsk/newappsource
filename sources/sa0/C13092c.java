package sa0;

import java.util.concurrent.atomic.AtomicInteger;
import pa0.C12999b;

/* renamed from: sa0.c */
public final class C13092c extends Thread {

    /* renamed from: g */
    public static AtomicInteger f32387g = new AtomicInteger(0);

    /* renamed from: b */
    public C12999b f32388b;

    /* renamed from: c */
    public C13097f f32389c;

    /* renamed from: d */
    public volatile boolean f32390d;

    /* renamed from: e */
    public volatile boolean f32391e;

    /* renamed from: f */
    public volatile long f32392f = Long.MAX_VALUE;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C13092c(sa0.C13097f r3, na0.C12925d r4) {
        /*
            r2 = this;
            java.lang.String r0 = "BillBoardCullThread-"
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
            java.util.concurrent.atomic.AtomicInteger r1 = f32387g
            int r1 = r1.incrementAndGet()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2.f32392f = r0
            r2.f32389c = r3
            pa0.b r3 = r4.f32009g
            r2.f32388b = r3
            r3 = 1
            r2.setPriority(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sa0.C13092c.<init>(sa0.f, na0.d):void");
    }

    /* renamed from: a */
    public final void mo39956a(int i) {
        synchronized (this) {
            if (this.f32390d) {
                this.f32392f = Math.min(this.f32392f, System.currentTimeMillis() + ((long) i));
                notify();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0098, code lost:
        r1 = true;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0032 */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x00b9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01a0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x018c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
        L_0x0000:
            boolean r0 = r14.f32391e
            if (r0 != 0) goto L_0x01cc
            long r0 = java.lang.System.currentTimeMillis()
            monitor-enter(r14)
            long r2 = r14.f32392f     // Catch:{ all -> 0x01c9 }
            r4 = 1
            long r4 = r4 + r0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8 = 0
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 > 0) goto L_0x001d
            r14.f32392f = r6     // Catch:{ all -> 0x01c9 }
            r2 = r8
            goto L_0x001f
        L_0x001d:
            long r2 = r14.f32392f     // Catch:{ all -> 0x01c9 }
        L_0x001f:
            monitor-exit(r14)     // Catch:{ all -> 0x01c9 }
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0036
            monitor-enter(r14)
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            long r8 = r2 - r0
        L_0x002c:
            r14.wait(r8)     // Catch:{ InterruptedException -> 0x0032 }
            goto L_0x0032
        L_0x0030:
            r0 = move-exception
            goto L_0x0034
        L_0x0032:
            monitor-exit(r14)     // Catch:{ all -> 0x0030 }
            goto L_0x0000
        L_0x0034:
            monitor-exit(r14)     // Catch:{ all -> 0x0030 }
            throw r0
        L_0x0036:
            pa0.b r0 = r14.f32388b
            java.util.concurrent.locks.ReentrantLock r1 = r0.f32174a
            r1.lock()
            java.util.List<za0.f<oa0.i>> r1 = r0.f32178e     // Catch:{ all -> 0x01c2 }
            if (r1 != 0) goto L_0x0044
            r0.mo39889f()     // Catch:{ all -> 0x01c2 }
        L_0x0044:
            java.util.List<za0.f<oa0.i>> r1 = r0.f32178e     // Catch:{ all -> 0x01c2 }
            java.util.concurrent.locks.ReentrantLock r0 = r0.f32174a
            r0.unlock()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0054:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x006f
            java.lang.Object r2 = r1.next()
            za0.f r2 = (za0.C13361f) r2
            boolean r3 = r2 instanceof za0.C13354a
            if (r3 == 0) goto L_0x0054
            za0.a r2 = (za0.C13354a) r2
            java.util.ArrayList r2 = r2.f33149f
            if (r2 != 0) goto L_0x006b
            goto L_0x0054
        L_0x006b:
            r0.addAll(r2)
            goto L_0x0054
        L_0x006f:
            java.util.Iterator r1 = r0.iterator()
        L_0x0073:
            boolean r2 = r1.hasNext()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x009a
            java.lang.Object r2 = r1.next()
            oa0.a r2 = (oa0.C12958a) r2
            oa0.a$a r5 = r2.mo39840c()
            boolean r5 = r5.f32100f
            if (r5 != 0) goto L_0x008a
            goto L_0x0098
        L_0x008a:
            oa0.a$a r2 = r2.mo39840c()
            ua0.g r2 = r2.f32128b
            ua0.a r2 = (ua0.C13142a) r2
            if (r2 == 0) goto L_0x0073
            boolean r2 = r2.f32644d
            if (r2 != 0) goto L_0x0073
        L_0x0098:
            r1 = 1
            goto L_0x009b
        L_0x009a:
            r1 = 0
        L_0x009b:
            if (r1 != 0) goto L_0x009e
            goto L_0x00c2
        L_0x009e:
            java.util.PriorityQueue r1 = new java.util.PriorityQueue
            sa0.b r2 = new sa0.b
            r2.<init>()
            r1.<init>(r4, r2)
            r1.addAll(r0)
            sa0.f r0 = r14.f32389c
            sa0.e r0 = (sa0.C13096e) r0
            na0.b r0 = r0.mo39968e()
            sa0.d r2 = new sa0.d
            r2.<init>(r0)
            r0 = 0
        L_0x00b9:
            java.lang.Object r5 = r1.poll()
            oa0.a r5 = (oa0.C12958a) r5
            if (r5 != 0) goto L_0x00cd
            r3 = r0
        L_0x00c2:
            if (r3 == 0) goto L_0x0000
            sa0.f r0 = r14.f32389c
            sa0.e r0 = (sa0.C13096e) r0
            r0.mo39976m()
            goto L_0x0000
        L_0x00cd:
            oa0.a$a r6 = r5.mo39840c()
            boolean r6 = r6.f32100f
            if (r6 == 0) goto L_0x013f
            sa0.d$a r7 = new sa0.d$a
            r7.<init>(r5)
            ua0.a r8 = r7.f32397b
            if (r8 != 0) goto L_0x00df
            goto L_0x0133
        L_0x00df:
            sa0.d$b r8 = new sa0.d$b
            oa0.a$a r9 = r5.mo39840c()
            com.nutiteq.components.MapPos r9 = r9.f32098d
            oa0.a$a r10 = r5.mo39840c()
            float r10 = r10.f32099e
            r8.<init>(r9, r10)
            com.nutiteq.components.MapPos[] r8 = r2.mo39958a(r8, r7)
            r7.f32398c = r8
            com.nutiteq.components.MapPos[] r9 = sa0.C13093d.f32393c
            boolean r10 = mf0.C24361g.m61178o0(r9, r8)
            if (r10 == 0) goto L_0x0106
            boolean r8 = mf0.C24361g.m61178o0(r8, r9)
            if (r8 == 0) goto L_0x0106
            r8 = 1
            goto L_0x0107
        L_0x0106:
            r8 = 0
        L_0x0107:
            if (r8 != 0) goto L_0x010a
            goto L_0x0133
        L_0x010a:
            com.nutiteq.components.Envelope r8 = new com.nutiteq.components.Envelope
            com.nutiteq.components.MapPos[] r9 = r7.f32398c
            r8.<init>((com.nutiteq.components.MapPos[]) r9)
            ya0.i<sa0.d$a> r9 = r2.f32395b
            java.util.ArrayList r9 = r9.mo40152f(r8)
            java.util.Iterator r9 = r9.iterator()
        L_0x011b:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0135
            java.lang.Object r10 = r9.next()
            sa0.d$a r10 = (sa0.C13093d.C13094a) r10
            ua0.a r11 = r7.f32397b
            boolean r11 = r11.f32644d
            if (r11 == 0) goto L_0x0133
            ua0.a r10 = r10.f32397b
            boolean r10 = r10.f32644d
            if (r10 != 0) goto L_0x011b
        L_0x0133:
            r7 = 0
            goto L_0x013b
        L_0x0135:
            ya0.i<sa0.d$a> r9 = r2.f32395b
            r9.mo40151d(r8, r7)
            r7 = 1
        L_0x013b:
            if (r7 == 0) goto L_0x013f
            goto L_0x00b9
        L_0x013f:
            sa0.d$a r7 = new sa0.d$a
            r7.<init>(r5)
            ua0.a r8 = r7.f32397b
            if (r8 != 0) goto L_0x0149
            goto L_0x01b4
        L_0x0149:
            r8 = 0
        L_0x014a:
            r9 = 16
            if (r8 >= r9) goto L_0x01b4
            oa0.a r9 = r7.f32396a
            r9.getClass()
            if (r8 <= 0) goto L_0x0157
            r9 = 0
            goto L_0x016c
        L_0x0157:
            sa0.d$b r9 = new sa0.d$b
            oa0.a r10 = r7.f32396a
            oa0.a$a r10 = r10.mo39840c()
            com.nutiteq.components.MapPos r10 = r10.f32098d
            oa0.a r11 = r7.f32396a
            oa0.a$a r11 = r11.mo39840c()
            float r11 = r11.f32099e
            r9.<init>(r10, r11)
        L_0x016c:
            if (r9 != 0) goto L_0x016f
            goto L_0x01b4
        L_0x016f:
            com.nutiteq.components.MapPos[] r10 = r2.mo39958a(r9, r7)
            r7.f32398c = r10
            com.nutiteq.components.Envelope r10 = new com.nutiteq.components.Envelope
            com.nutiteq.components.MapPos[] r11 = r7.f32398c
            r10.<init>((com.nutiteq.components.MapPos[]) r11)
            ya0.i<sa0.d$a> r11 = r2.f32395b
            java.util.ArrayList r11 = r11.mo40152f(r10)
            java.util.Iterator r11 = r11.iterator()
        L_0x0186:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x01a0
            java.lang.Object r12 = r11.next()
            sa0.d$a r12 = (sa0.C13093d.C13094a) r12
            ua0.a r13 = r7.f32397b
            boolean r13 = r13.f32644d
            if (r13 == 0) goto L_0x019e
            ua0.a r12 = r12.f32397b
            boolean r12 = r12.f32644d
            if (r12 != 0) goto L_0x0186
        L_0x019e:
            r11 = 0
            goto L_0x01a1
        L_0x01a0:
            r11 = 1
        L_0x01a1:
            if (r11 == 0) goto L_0x01b1
            com.nutiteq.components.MapPos r8 = r9.f32399a
            float r9 = r9.f32400b
            r5.mo39843i(r8, r9)
            ya0.i<sa0.d$a> r8 = r2.f32395b
            r8.mo40151d(r10, r7)
            r7 = 1
            goto L_0x01b5
        L_0x01b1:
            int r8 = r8 + 1
            goto L_0x014a
        L_0x01b4:
            r7 = 0
        L_0x01b5:
            if (r7 != 0) goto L_0x01b9
            if (r6 == 0) goto L_0x01ba
        L_0x01b9:
            r0 = 1
        L_0x01ba:
            oa0.a$a r5 = r5.mo39840c()
            r5.f32100f = r7
            goto L_0x00b9
        L_0x01c2:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = r0.f32174a
            r0.unlock()
            throw r1
        L_0x01c9:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x01c9 }
            throw r0
        L_0x01cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sa0.C13092c.run():void");
    }
}
