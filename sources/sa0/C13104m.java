package sa0;

import com.nutiteq.components.MapPos;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import na0.C12923b;
import na0.C12930h;
import na0.C12931i;
import na0.C12936m;
import va0.C13189b;
import za0.C13361f;

/* renamed from: sa0.m */
public final class C13104m extends Thread {

    /* renamed from: v */
    public static AtomicInteger f32533v = new AtomicInteger(0);

    /* renamed from: b */
    public C13097f f32534b;

    /* renamed from: c */
    public C13189b f32535c;

    /* renamed from: d */
    public MapPos f32536d;

    /* renamed from: e */
    public MapPos f32537e;

    /* renamed from: f */
    public C12936m f32538f;

    /* renamed from: g */
    public double f32539g;

    /* renamed from: h */
    public double f32540h;

    /* renamed from: i */
    public float f32541i;

    /* renamed from: j */
    public C12923b f32542j;

    /* renamed from: k */
    public C12931i f32543k = new C12931i();

    /* renamed from: l */
    public C12931i f32544l = new C12931i();

    /* renamed from: m */
    public C12931i f32545m = new C12931i();

    /* renamed from: n */
    public C12930h f32546n;

    /* renamed from: o */
    public C12930h f32547o;

    /* renamed from: p */
    public C12931i[] f32548p;

    /* renamed from: q */
    public C12931i[] f32549q;

    /* renamed from: r */
    public C12931i[] f32550r;

    /* renamed from: s */
    public volatile boolean f32551s;

    /* renamed from: t */
    public volatile boolean f32552t;

    /* renamed from: u */
    public LinkedList f32553u;

    /* renamed from: sa0.m$a */
    public static class C13105a {

        /* renamed from: a */
        public final C13361f<?> f32554a;

        /* renamed from: b */
        public long f32555b;

        public C13105a(C13361f<?> fVar, long j) {
            this.f32554a = fVar;
            this.f32555b = j;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C13104m(sa0.C13097f r6, na0.C12925d r7) {
        /*
            r5 = this;
            java.lang.String r0 = "VectorCullThread-"
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
            java.util.concurrent.atomic.AtomicInteger r1 = f32533v
            int r1 = r1.incrementAndGet()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            na0.i r0 = new na0.i
            r0.<init>()
            r5.f32543k = r0
            na0.i r0 = new na0.i
            r0.<init>()
            r5.f32544l = r0
            na0.i r0 = new na0.i
            r0.<init>()
            r5.f32545m = r0
            na0.h r0 = new na0.h
            r0.<init>()
            na0.h r0 = new na0.h
            r0.<init>()
            na0.h r0 = new na0.h
            r0.<init>()
            r5.f32546n = r0
            na0.h r0 = new na0.h
            r0.<init>()
            r5.f32547o = r0
            r0 = 2
            na0.i[] r1 = new na0.C12931i[r0]
            na0.i r2 = new na0.i
            r2.<init>()
            r3 = 0
            r1[r3] = r2
            na0.i r2 = new na0.i
            r2.<init>()
            r4 = 1
            r1[r4] = r2
            r5.f32548p = r1
            na0.i[] r1 = new na0.C12931i[r0]
            na0.i r2 = new na0.i
            r2.<init>()
            r1[r3] = r2
            na0.i r2 = new na0.i
            r2.<init>()
            r1[r4] = r2
            r5.f32549q = r1
            na0.i[] r0 = new na0.C12931i[r0]
            na0.i r1 = new na0.i
            r1.<init>()
            r0[r3] = r1
            na0.i r1 = new na0.i
            r1.<init>()
            r0[r4] = r1
            r5.f32550r = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r5.f32553u = r0
            r5.f32534b = r6
            va0.b r6 = r7.f32008f
            r5.f32535c = r6
            r5.setPriority(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sa0.C13104m.<init>(sa0.f, na0.d):void");
    }

    /* renamed from: a */
    public final void mo40007a(C13361f<?> fVar, int i) {
        long currentTimeMillis = System.currentTimeMillis() + ((long) i);
        synchronized (this) {
            if (this.f32551s) {
                for (C13105a aVar : this.f32553u) {
                    if (aVar.f32554a == fVar) {
                        aVar.f32555b = Math.min(aVar.f32555b, currentTimeMillis);
                        notify();
                        return;
                    }
                }
                this.f32553u.add(new C13105a(fVar, currentTimeMillis));
                notify();
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0057 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r33 = this;
            r1 = r33
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0007:
            boolean r2 = r1.f32552t
            if (r2 != 0) goto L_0x0427
            long r2 = java.lang.System.currentTimeMillis()
            r0.clear()
            monitor-enter(r33)
            java.util.LinkedList r4 = r1.f32553u     // Catch:{ all -> 0x0424 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0424 }
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = r5
        L_0x001f:
            boolean r9 = r4.hasNext()     // Catch:{ all -> 0x0424 }
            if (r9 == 0) goto L_0x0043
            java.lang.Object r9 = r4.next()     // Catch:{ all -> 0x0424 }
            sa0.m$a r9 = (sa0.C13104m.C13105a) r9     // Catch:{ all -> 0x0424 }
            long r10 = r9.f32555b     // Catch:{ all -> 0x0424 }
            r12 = 1
            long r12 = r12 + r2
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 > 0) goto L_0x003d
            za0.f<?> r9 = r9.f32554a     // Catch:{ all -> 0x0424 }
            r0.add(r9)     // Catch:{ all -> 0x0424 }
            r4.remove()     // Catch:{ all -> 0x0424 }
            goto L_0x001f
        L_0x003d:
            long r10 = r10 - r2
            long r7 = java.lang.Math.min(r7, r10)     // Catch:{ all -> 0x0424 }
            goto L_0x001f
        L_0x0043:
            monitor-exit(r33)     // Catch:{ all -> 0x0424 }
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x005b
            monitor-enter(r33)
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0051
            r7 = 0
        L_0x0051:
            r1.wait(r7)     // Catch:{ InterruptedException -> 0x0057 }
            goto L_0x0057
        L_0x0055:
            r0 = move-exception
            goto L_0x0059
        L_0x0057:
            monitor-exit(r33)     // Catch:{ all -> 0x0055 }
            goto L_0x0007
        L_0x0059:
            monitor-exit(r33)     // Catch:{ all -> 0x0055 }
            throw r0
        L_0x005b:
            sa0.f r2 = r1.f32534b
            sa0.e r2 = (sa0.C13096e) r2
            r3 = 1
            r2.mo39983q(r3)
            r2 = 0
            sa0.f r3 = r1.f32534b     // Catch:{ all -> 0x041a }
            sa0.e r3 = (sa0.C13096e) r3     // Catch:{ all -> 0x041a }
            com.nutiteq.components.MapPos r3 = r3.mo39967d()     // Catch:{ all -> 0x041a }
            r1.f32536d = r3     // Catch:{ all -> 0x041a }
            sa0.f r3 = r1.f32534b     // Catch:{ all -> 0x041a }
            sa0.e r3 = (sa0.C13096e) r3     // Catch:{ all -> 0x041a }
            com.nutiteq.components.MapPos r3 = r3.mo39970g()     // Catch:{ all -> 0x041a }
            r1.f32537e = r3     // Catch:{ all -> 0x041a }
            sa0.f r3 = r1.f32534b     // Catch:{ all -> 0x041a }
            sa0.e r3 = (sa0.C13096e) r3     // Catch:{ all -> 0x041a }
            na0.m r3 = r3.mo39972i()     // Catch:{ all -> 0x041a }
            r1.f32538f = r3     // Catch:{ all -> 0x041a }
            sa0.f r3 = r1.f32534b     // Catch:{ all -> 0x041a }
            com.nutiteq.components.MapPos r4 = r1.f32536d     // Catch:{ all -> 0x041a }
            double r4 = r4.f24177d     // Catch:{ all -> 0x041a }
            sa0.e r3 = (sa0.C13096e) r3     // Catch:{ all -> 0x041a }
            float r3 = r3.mo39971h(r4)     // Catch:{ all -> 0x041a }
            double r3 = (double) r3     // Catch:{ all -> 0x041a }
            r1.f32540h = r3     // Catch:{ all -> 0x041a }
            sa0.f r3 = r1.f32534b     // Catch:{ all -> 0x041a }
            com.nutiteq.components.MapPos r4 = r1.f32536d     // Catch:{ all -> 0x041a }
            double r4 = r4.f24177d     // Catch:{ all -> 0x041a }
            sa0.e r3 = (sa0.C13096e) r3     // Catch:{ all -> 0x041a }
            float r3 = r3.mo39969f(r4)     // Catch:{ all -> 0x041a }
            double r3 = (double) r3     // Catch:{ all -> 0x041a }
            r1.f32539g = r3     // Catch:{ all -> 0x041a }
            sa0.f r3 = r1.f32534b     // Catch:{ all -> 0x041a }
            r4 = r3
            sa0.e r4 = (sa0.C13096e) r4     // Catch:{ all -> 0x041a }
            float r4 = r4.f32433U     // Catch:{ all -> 0x041a }
            r1.f32541i = r4     // Catch:{ all -> 0x041a }
            sa0.e r3 = (sa0.C13096e) r3     // Catch:{ all -> 0x041a }
            na0.b r3 = r3.mo39968e()     // Catch:{ all -> 0x041a }
            r1.f32542j = r3     // Catch:{ all -> 0x041a }
            sa0.f r3 = r1.f32534b
            sa0.e r3 = (sa0.C13096e) r3
            r3.mo39983q(r2)
            va0.b r3 = r1.f32535c
            monitor-enter(r3)
            java.util.PriorityQueue<va0.b$c> r4 = r3.f32757g     // Catch:{ all -> 0x0417 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0417 }
        L_0x00c1:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0417 }
            if (r5 == 0) goto L_0x00e8
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0417 }
            va0.b$c r5 = (va0.C13189b.C13192c) r5     // Catch:{ all -> 0x0417 }
            java.lang.Object r6 = r5.f32759b     // Catch:{ all -> 0x0417 }
            boolean r6 = r0.contains(r6)     // Catch:{ all -> 0x0417 }
            if (r6 != 0) goto L_0x00d6
            goto L_0x00c1
        L_0x00d6:
            java.lang.Runnable r5 = r5.f32758a     // Catch:{ all -> 0x0417 }
            boolean r6 = r5 instanceof va0.C13196e     // Catch:{ all -> 0x0417 }
            if (r6 == 0) goto L_0x00c1
            va0.e r5 = (va0.C13196e) r5     // Catch:{ all -> 0x0417 }
            r5.mo40071H()     // Catch:{ all -> 0x0417 }
            r5.cancel()     // Catch:{ all -> 0x0417 }
            r4.remove()     // Catch:{ all -> 0x0417 }
            goto L_0x00c1
        L_0x00e8:
            monitor-exit(r3)
            float r3 = ya0.C13275b.f32937d
            double r3 = (double) r3
            double r5 = r1.f32540h
            double r5 = r5 * r3
            float r7 = r1.f32541i
            double r7 = (double) r7
            double r9 = r7 * r5
            double r11 = r1.f32539g
            double r3 = r3 * r11
            double r7 = r7 * r3
            na0.h r11 = r1.f32546n
            r12 = 4692333547057315840(0x411e848000000000, double:500000.0)
            r11.f32028a = r12
            r11.f32029b = r12
            na0.h r11 = r1.f32547o
            r12 = -4531038489797459968(0xc11e848000000000, double:-500000.0)
            r11.f32028a = r12
            r11.f32029b = r12
            na0.i r14 = r1.f32543k
            com.nutiteq.components.MapPos r11 = r1.f32537e
            double r12 = r11.f24175b
            com.nutiteq.components.MapPos r15 = r1.f32536d
            r22 = r3
            double r2 = r15.f24175b
            double r2 = r12 - r2
            double r12 = r11.f24176c
            r24 = r5
            double r4 = r15.f24176c
            double r17 = r12 - r4
            double r4 = r11.f24177d
            double r11 = r15.f24177d
            double r19 = r4 - r11
            r15 = r2
            r14.mo39810f(r15, r17, r19)
            na0.i r2 = r1.f32543k
            r2.mo39808e()
            na0.i[] r2 = r1.f32548p
            r3 = 0
            r11 = r2[r3]
            na0.i r2 = r1.f32543k
            double r3 = r2.f32031a
            double r5 = r1.f32540h
            double r12 = r3 * r5
            double r3 = r2.f32032b
            double r14 = r3 * r5
            double r2 = r2.f32033c
            double r16 = r2 * r5
            r11.mo39810f(r12, r14, r16)
            na0.i[] r2 = r1.f32548p
            r3 = 1
            r11 = r2[r3]
            na0.i r2 = r1.f32543k
            double r3 = r2.f32031a
            double r5 = r1.f32539g
            double r12 = r3 * r5
            double r3 = r2.f32032b
            double r14 = r3 * r5
            double r2 = r2.f32033c
            double r16 = r2 * r5
            r11.mo39810f(r12, r14, r16)
            na0.i r2 = r1.f32545m
            na0.m r3 = r1.f32538f
            double r4 = r3.f32067b
            na0.i r6 = r1.f32543k
            double r11 = r6.f32033c
            double r13 = r4 * r11
            r15 = r7
            double r7 = r3.f32068c
            r17 = r9
            double r9 = r6.f32032b
            double r19 = r7 * r9
            double r27 = r13 - r19
            double r13 = r6.f32031a
            double r7 = r7 * r13
            r6 = r0
            double r0 = r3.f32066a
            double r11 = r11 * r0
            double r29 = r7 - r11
            double r0 = r0 * r9
            double r4 = r4 * r13
            double r31 = r0 - r4
            r26 = r2
            r26.mo39810f(r27, r29, r31)
            r1 = r33
            na0.i r0 = r1.f32545m
            r0.mo39808e()
            na0.i[] r0 = r1.f32550r
            r2 = 0
            r7 = r0[r2]
            na0.i r0 = r1.f32545m
            double r2 = r0.f32031a
            double r8 = r2 * r17
            double r2 = r0.f32032b
            double r10 = r2 * r17
            double r2 = r0.f32033c
            double r12 = r2 * r17
            r7.mo39810f(r8, r10, r12)
            na0.i[] r0 = r1.f32550r
            r2 = 1
            r7 = r0[r2]
            na0.i r0 = r1.f32545m
            double r2 = r0.f32031a
            double r8 = r2 * r15
            double r2 = r0.f32032b
            double r10 = r2 * r15
            double r2 = r0.f32033c
            double r12 = r2 * r15
            r7.mo39810f(r8, r10, r12)
            na0.i r14 = r1.f32544l
            na0.i r0 = r1.f32545m
            double r2 = r0.f32032b
            na0.i r4 = r1.f32543k
            double r7 = r4.f32033c
            double r9 = r2 * r7
            double r11 = r0.f32033c
            r13 = r6
            double r5 = r4.f32032b
            double r15 = r11 * r5
            double r15 = r9 - r15
            double r9 = r4.f32031a
            double r11 = r11 * r9
            double r0 = r0.f32031a
            double r7 = r7 * r0
            double r17 = r11 - r7
            double r0 = r0 * r5
            double r2 = r2 * r9
            double r19 = r0 - r2
            r14.mo39810f(r15, r17, r19)
            r1 = r33
            na0.i r0 = r1.f32544l
            r0.mo39808e()
            na0.i[] r0 = r1.f32549q
            r2 = 0
            r3 = r0[r2]
            na0.i r0 = r1.f32544l
            double r4 = r0.f32031a
            double r4 = r4 * r24
            double r6 = r0.f32032b
            double r6 = r6 * r24
            double r8 = r0.f32033c
            double r8 = r8 * r24
            r3.mo39810f(r4, r6, r8)
            na0.i[] r0 = r1.f32549q
            r2 = 1
            r3 = r0[r2]
            na0.i r0 = r1.f32544l
            double r4 = r0.f32031a
            double r4 = r4 * r22
            double r6 = r0.f32032b
            double r6 = r6 * r22
            double r8 = r0.f32033c
            double r8 = r8 * r22
            r3.mo39810f(r4, r6, r8)
            na0.h r0 = new na0.h
            r0.<init>()
            na0.h r2 = new na0.h
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 12
            r3.<init>(r4)
            r5 = 0
        L_0x0233:
            r6 = 0
            r8 = 2
            if (r5 >= r4) goto L_0x0301
            int r9 = r5 >> 2
            r9 = r9 & 3
            int r10 = 4 - r9
            int r8 = r10 >> 2
            int r10 = 5 - r9
            int r10 = r10 >> 2
            r11 = r5 & 1
            int r8 = r11 << r8
            r11 = r5 & 2
            int r10 = r11 << r10
            r8 = r8 | r10
            r10 = 1
            int r9 = r10 << r9
            r9 = r9 | r8
            int r10 = r8 >> 2
            com.nutiteq.components.MapPos r11 = r1.f32536d
            r0.mo39799c(r11)
            na0.i[] r11 = r1.f32548p
            r11 = r11[r10]
            r0.mo39797a(r11)
            r11 = r8 & 1
            if (r11 == 0) goto L_0x026b
            na0.i[] r11 = r1.f32550r
            r11 = r11[r10]
            r0.mo39800d(r11)
            goto L_0x0272
        L_0x026b:
            na0.i[] r11 = r1.f32550r
            r11 = r11[r10]
            r0.mo39797a(r11)
        L_0x0272:
            r8 = r8 & 2
            if (r8 == 0) goto L_0x027e
            na0.i[] r8 = r1.f32549q
            r8 = r8[r10]
            r0.mo39800d(r8)
            goto L_0x0285
        L_0x027e:
            na0.i[] r8 = r1.f32549q
            r8 = r8[r10]
            r0.mo39797a(r8)
        L_0x0285:
            int r8 = r9 >> 2
            com.nutiteq.components.MapPos r10 = r1.f32536d
            r2.mo39799c(r10)
            na0.i[] r10 = r1.f32548p
            r10 = r10[r8]
            r2.mo39797a(r10)
            r10 = r9 & 1
            if (r10 == 0) goto L_0x029f
            na0.i[] r10 = r1.f32550r
            r10 = r10[r8]
            r2.mo39800d(r10)
            goto L_0x02a6
        L_0x029f:
            na0.i[] r10 = r1.f32550r
            r10 = r10[r8]
            r2.mo39797a(r10)
        L_0x02a6:
            r9 = r9 & 2
            if (r9 == 0) goto L_0x02b2
            na0.i[] r9 = r1.f32549q
            r8 = r9[r8]
            r2.mo39800d(r8)
            goto L_0x02b9
        L_0x02b2:
            na0.i[] r9 = r1.f32549q
            r8 = r9[r8]
            r2.mo39797a(r8)
        L_0x02b9:
            double r8 = r2.f32030c
            double r10 = r0.f32030c
            double r8 = r8 - r10
            int r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r12 != 0) goto L_0x02c3
            goto L_0x02fa
        L_0x02c3:
            double r10 = -r10
            double r8 = r10 / r8
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 < 0) goto L_0x02fa
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 <= 0) goto L_0x02d1
            goto L_0x02fa
        L_0x02d1:
            com.nutiteq.components.MapPos r6 = new com.nutiteq.components.MapPos
            double r10 = r0.f32028a
            double r14 = r2.f32028a
            r16 = r10
            r18 = r8
            r20 = r10
            double r10 = p379.C16530d.m42010c(r14, r16, r18, r20)
            double r14 = r0.f32029b
            r12 = r5
            double r4 = r2.f32029b
            r20 = r14
            r14 = r4
            r16 = r20
            double r17 = p379.C16530d.m42010c(r14, r16, r18, r20)
            r19 = 0
            r14 = r6
            r15 = r10
            r14.<init>(r15, r17, r19)
            r3.add(r6)
            goto L_0x02fb
        L_0x02fa:
            r12 = r5
        L_0x02fb:
            int r5 = r12 + 1
            r4 = 12
            goto L_0x0233
        L_0x0301:
            int r0 = r3.size()
            com.nutiteq.components.MapPos[] r0 = new com.nutiteq.components.MapPos[r0]
            java.lang.Object[] r0 = r3.toArray(r0)
            com.nutiteq.components.MapPos[] r0 = (com.nutiteq.components.MapPos[]) r0
            int r2 = r0.length
            java.lang.Object r0 = r0.clone()
            com.nutiteq.components.MapPos[] r0 = (com.nutiteq.components.MapPos[]) r0
            int r3 = r2 * 2
            com.nutiteq.components.MapPos[] r3 = new com.nutiteq.components.MapPos[r3]
            ya0.e r4 = new ya0.e
            r4.<init>()
            java.util.Arrays.sort(r0, r4)
            r4 = 0
            r5 = 0
        L_0x0322:
            if (r4 >= r2) goto L_0x036d
        L_0x0324:
            if (r5 < r8) goto L_0x035a
            int r6 = r5 + -1
            r7 = r3[r6]
            double r8 = r7.f24175b
            int r10 = r5 + -2
            r10 = r3[r10]
            double r11 = r10.f24175b
            double r8 = r8 - r11
            double r14 = r7.f24176c
            r16 = r6
            double r6 = r10.f24176c
            double r14 = r14 - r6
            r10 = r0[r4]
            r17 = r2
            r18 = r3
            double r2 = r10.f24175b
            double r2 = r2 - r11
            double r10 = r10.f24176c
            double r10 = r10 - r6
            double r10 = r10 * r8
            double r2 = r2 * r14
            double r10 = r10 - r2
            r2 = 0
            int r6 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0352
            goto L_0x035e
        L_0x0352:
            r8 = 2
            r5 = r16
            r2 = r17
            r3 = r18
            goto L_0x0324
        L_0x035a:
            r17 = r2
            r18 = r3
        L_0x035e:
            int r2 = r5 + 1
            r3 = r0[r4]
            r18[r5] = r3
            int r4 = r4 + 1
            r8 = 2
            r5 = r2
            r2 = r17
            r3 = r18
            goto L_0x0322
        L_0x036d:
            r17 = r2
            r18 = r3
            int r2 = r17 + -2
            int r3 = r5 + 1
        L_0x0375:
            if (r2 < 0) goto L_0x03bb
        L_0x0377:
            if (r5 < r3) goto L_0x03ab
            int r4 = r5 + -1
            r6 = r18[r4]
            double r7 = r6.f24175b
            int r9 = r5 + -2
            r9 = r18[r9]
            double r10 = r9.f24175b
            double r7 = r7 - r10
            double r14 = r6.f24176c
            r6 = r3
            r12 = r4
            double r3 = r9.f24176c
            double r14 = r14 - r3
            r9 = r0[r2]
            r17 = r12
            r16 = r13
            double r12 = r9.f24175b
            double r12 = r12 - r10
            double r9 = r9.f24176c
            double r9 = r9 - r3
            double r9 = r9 * r7
            double r12 = r12 * r14
            double r9 = r9 - r12
            r3 = 0
            int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x03a5
            goto L_0x03ae
        L_0x03a5:
            r3 = r6
            r13 = r16
            r5 = r17
            goto L_0x0377
        L_0x03ab:
            r6 = r3
            r16 = r13
        L_0x03ae:
            int r3 = r5 + 1
            r4 = r0[r2]
            r18[r5] = r4
            int r2 = r2 + -1
            r5 = r3
            r3 = r6
            r13 = r16
            goto L_0x0375
        L_0x03bb:
            r16 = r13
            r0 = 0
        L_0x03be:
            if (r0 >= r5) goto L_0x03e2
            int r2 = r0 + r5
            int r2 = r2 + -1
            int r2 = r2 % r5
            r3 = r18[r0]
            r2 = r18[r2]
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x03df
            int r2 = r0 + 1
        L_0x03d1:
            if (r2 >= r5) goto L_0x03dc
            int r3 = r2 + -1
            r4 = r18[r2]
            r18[r3] = r4
            int r2 = r2 + 1
            goto L_0x03d1
        L_0x03dc:
            int r5 = r5 + -1
            goto L_0x03be
        L_0x03df:
            int r0 = r0 + 1
            goto L_0x03be
        L_0x03e2:
            com.nutiteq.components.MapPos[] r0 = new com.nutiteq.components.MapPos[r5]
            r2 = 0
            r3 = r18
            java.lang.System.arraycopy(r3, r2, r0, r2, r5)
            com.nutiteq.components.Envelope r2 = new com.nutiteq.components.Envelope
            r2.<init>((com.nutiteq.components.MapPos[]) r0)
            za0.f$a r0 = new za0.f$a
            na0.b r3 = r1.f32542j
            r0.<init>(r2, r3)
            java.util.Iterator r2 = r16.iterator()
        L_0x03fa:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0413
            java.lang.Object r3 = r2.next()
            za0.f r3 = (za0.C13361f) r3
            boolean r4 = r3.f32171b
            if (r4 != 0) goto L_0x040b
            goto L_0x03fa
        L_0x040b:
            com.nutiteq.components.Envelope r4 = r0.f33150a
            int r5 = r0.f33151b
            r3.mo40236c(r4, r5)
            goto L_0x03fa
        L_0x0413:
            r0 = r16
            goto L_0x0007
        L_0x0417:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x041a:
            r0 = move-exception
            sa0.f r2 = r1.f32534b
            sa0.e r2 = (sa0.C13096e) r2
            r3 = 0
            r2.mo39983q(r3)
            throw r0
        L_0x0424:
            r0 = move-exception
            monitor-exit(r33)     // Catch:{ all -> 0x0424 }
            throw r0
        L_0x0427:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sa0.C13104m.run():void");
    }
}
