package wa0;

import android.view.animation.Interpolator;
import com.google.android.gms.nearby.messages.Strategy;
import com.moovit.commons.view.GLTextureView;
import com.nutiteq.components.MapPos;
import na0.C12925d;
import na0.C12927e;
import na0.C12930h;
import na0.C12931i;
import na0.C12932j;
import na0.C12934k;
import na0.C12936m;
import sa0.C13096e;
import sa0.C13097f;
import ya0.C13288j;

/* renamed from: wa0.b */
public final class C13230b {

    /* renamed from: a */
    public int f32819a = 6;

    /* renamed from: b */
    public C13097f f32820b;

    /* renamed from: c */
    public C12927e f32821c;

    /* renamed from: d */
    public C12932j f32822d;

    /* renamed from: e */
    public C12930h f32823e = new C12930h();

    /* renamed from: f */
    public C12930h f32824f = new C12930h();

    /* renamed from: g */
    public C12930h f32825g = new C12930h();

    /* renamed from: h */
    public C12931i f32826h = new C12931i();

    /* renamed from: i */
    public C12931i f32827i = new C12931i();

    /* renamed from: j */
    public double f32828j = -1.0d;

    /* renamed from: k */
    public C12931i f32829k = new C12931i();

    /* renamed from: l */
    public C12931i f32830l = new C12931i();

    /* renamed from: m */
    public C12931i f32831m = new C12931i();

    /* renamed from: n */
    public C12931i f32832n = new C12931i();

    /* renamed from: o */
    public C12931i f32833o = new C12931i();

    /* renamed from: p */
    public boolean f32834p = false;

    /* renamed from: q */
    public boolean f32835q;

    /* renamed from: r */
    public C13229a f32836r;

    public C13230b(C13097f fVar, C12925d dVar) {
        this.f32820b = fVar;
        this.f32821c = dVar.f32010h;
        this.f32822d = dVar.f32011i;
        this.f32836r = new C13229a(this, this.f32822d);
    }

    /* renamed from: a */
    public final float mo40099a(double d, double d2, double d3, double d4) {
        if (d == 0.0d && d2 == 0.0d) {
            return 1.0f;
        }
        if (d3 == 0.0d && d4 == 0.0d) {
            return 1.0f;
        }
        double abs = Math.abs((d2 * d4) + (d * d3)) / ((d2 * d2) + (d * d));
        C12931i iVar = this.f32829k;
        iVar.f32031a = d;
        iVar.f32032b = d2;
        iVar.mo39807d();
        C12931i iVar2 = this.f32830l;
        iVar2.f32031a = d3;
        iVar2.f32032b = d4;
        iVar2.mo39807d();
        C12931i iVar3 = this.f32830l;
        double d5 = iVar3.f32031a;
        C12931i iVar4 = this.f32829k;
        return (float) (Math.abs((d5 * iVar4.f32032b) - (iVar3.f32032b * iVar4.f32031a)) / Math.max((1.0d / abs) - 1.0d, abs - 1.0d));
    }

    /* renamed from: b */
    public final synchronized void mo40100b(float f, float f2) {
        if (this.f32822d.f32049p && this.f32822d.f32040g) {
            C13096e eVar = (C13096e) this.f32820b;
            eVar.mo39986t(eVar.f32473y + 1.0f, Strategy.TTL_SECONDS_DEFAULT, (Interpolator) null);
            if (this.f32822d.f32052s) {
                MapPos n = ((C13096e) this.f32820b).mo39977n((double) f, (double) f2);
                ((C13096e) this.f32820b).mo39982p(n.f24175b, n.f24176c, Strategy.TTL_SECONDS_DEFAULT, (Interpolator) null);
            }
        }
        C13096e eVar2 = (C13096e) this.f32820b;
        eVar2.f32426N = true;
        eVar2.mo39976m();
    }

    /* renamed from: c */
    public final synchronized void mo40101c(float f, float f2, float f3, float f4) {
        synchronized (this) {
            this.f32831m.mo39810f(0.0d, 0.0d, 0.0d);
            this.f32832n.mo39810f(0.0d, 0.0d, 0.0d);
            this.f32823e.mo39798b((double) f, (double) f2, 0.0d);
            this.f32824f.mo39798b((double) f3, (double) f4, 0.0d);
            this.f32819a = 1;
            C13096e eVar = (C13096e) this.f32820b;
            eVar.f32426N = true;
            eVar.mo39976m();
        }
    }

    /* renamed from: d */
    public final void mo40102d() {
        C13229a aVar = this.f32836r;
        synchronized (aVar) {
            aVar.f32804c = null;
            aVar.notify();
        }
        C13229a aVar2 = this.f32836r;
        aVar2.getClass();
        try {
            aVar2.join();
            aVar2.f32804c = null;
            aVar2.f32805d = null;
        } catch (InterruptedException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x024d  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40103e(float r59, float r60, float r61, float r62) {
        /*
            r58 = this;
            r1 = r58
            sa0.f r0 = r1.f32820b
            sa0.e r0 = (sa0.C13096e) r0
            r2 = 1
            r0.mo39983q(r2)
            sa0.f r0 = r1.f32820b     // Catch:{ all -> 0x0295 }
            sa0.e r0 = (sa0.C13096e) r0     // Catch:{ all -> 0x0295 }
            com.nutiteq.components.MapPos r0 = r0.mo39967d()     // Catch:{ all -> 0x0295 }
            double r2 = r0.f24175b     // Catch:{ all -> 0x0295 }
            double r4 = r0.f24176c     // Catch:{ all -> 0x0295 }
            double r11 = r0.f24177d     // Catch:{ all -> 0x0295 }
            sa0.f r0 = r1.f32820b     // Catch:{ all -> 0x0295 }
            sa0.e r0 = (sa0.C13096e) r0     // Catch:{ all -> 0x0295 }
            com.nutiteq.components.MapPos r0 = r0.mo39970g()     // Catch:{ all -> 0x0295 }
            double r6 = r0.f24175b     // Catch:{ all -> 0x0295 }
            double r8 = r0.f24176c     // Catch:{ all -> 0x0295 }
            sa0.f r0 = r1.f32820b     // Catch:{ all -> 0x0295 }
            sa0.e r0 = (sa0.C13096e) r0     // Catch:{ all -> 0x0295 }
            na0.m r0 = r0.mo39972i()     // Catch:{ all -> 0x0295 }
            double r13 = r0.f32066a     // Catch:{ all -> 0x0295 }
            r15 = r11
            double r10 = r0.f32067b     // Catch:{ all -> 0x0295 }
            sa0.f r0 = r1.f32820b     // Catch:{ all -> 0x0295 }
            r12 = r0
            sa0.e r12 = (sa0.C13096e) r12     // Catch:{ all -> 0x0295 }
            float r12 = r12.f32429Q     // Catch:{ all -> 0x0295 }
            sa0.e r0 = (sa0.C13096e) r0
            r17 = r12
            r12 = 0
            r0.mo39983q(r12)
            sa0.f r0 = r1.f32820b
            r12 = r59
            r18 = r10
            double r10 = (double) r12
            r12 = r60
            r20 = r13
            double r12 = (double) r12
            sa0.e r0 = (sa0.C13096e) r0
            com.nutiteq.components.MapPos r0 = r0.mo39978o(r10, r12)
            sa0.f r14 = r1.f32820b
            r22 = r10
            r10 = r61
            double r10 = (double) r10
            r59 = r12
            r12 = r62
            double r12 = (double) r12
            sa0.e r14 = (sa0.C13096e) r14
            com.nutiteq.components.MapPos r14 = r14.mo39978o(r10, r12)
            r31 = r10
            na0.i r10 = r1.f32826h
            r61 = r12
            double r11 = r14.f24175b
            r33 = r8
            double r8 = r0.f24175b
            double r25 = r11 - r8
            double r8 = r14.f24176c
            double r11 = r0.f24176c
            double r27 = r8 - r11
            r40 = 0
            r29 = 0
            r24 = r10
            r24.mo39810f(r25, r27, r29)
            na0.i r8 = r1.f32826h
            double r13 = r8.mo39805b()
            na0.i r8 = r1.f32829k
            double r9 = r0.f24175b
            na0.h r11 = r1.f32823e
            r24 = r13
            double r12 = r11.f32028a
            double r36 = r9 - r12
            double r9 = r0.f24176c
            double r11 = r11.f32029b
            double r38 = r9 - r11
            r35 = r8
            r35.mo39810f(r36, r38, r40)
            na0.i r0 = r1.f32829k
            double r8 = r0.f32031a
            double r2 = r2 - r8
            double r10 = r0.f32032b
            double r4 = r4 - r10
            double r6 = r6 - r8
            double r8 = r33 - r10
            na0.e r0 = r1.f32821c
            boolean r0 = r0.f32019d
            r10 = 0
            if (r0 == 0) goto L_0x0164
            double r12 = r1.f32828j
            double r12 = r12 * r24
            double r26 = java.lang.Math.abs(r12)
            int r0 = (r26 > r10 ? 1 : (r26 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0164
            na0.i r0 = r1.f32826h
            double r10 = r0.f32031a
            na0.i r14 = r1.f32827i
            r26 = r8
            double r8 = r14.f32031a
            double r28 = r10 * r8
            r33 = r6
            double r6 = r0.f32032b
            r35 = r15
            double r14 = r14.f32032b
            double r37 = r6 * r14
            double r37 = r37 + r28
            double r37 = r37 / r12
            double r10 = r10 * r14
            double r6 = r6 * r8
            double r10 = r10 - r6
            double r10 = r10 / r12
            na0.i r0 = r1.f32829k
            na0.h r6 = r1.f32823e
            double r7 = r6.f32028a
            double r40 = r7 - r2
            double r2 = r6.f32029b
            double r42 = r2 - r4
            r7 = 0
            r39 = r0
            r44 = r7
            r39.mo39810f(r40, r42, r44)
            na0.i r0 = r1.f32829k
            double r2 = r0.f32031a
            double r4 = r37 * r2
            double r12 = r0.f32032b
            double r14 = r10 * r12
            double r45 = r4 - r14
            double r2 = r2 * r10
            double r12 = r12 * r37
            double r47 = r12 + r2
            r54 = 0
            r44 = r0
            r49 = r54
            r44.mo39810f(r45, r47, r49)
            na0.h r0 = r1.f32823e
            double r2 = r0.f32028a
            na0.i r4 = r1.f32829k
            double r5 = r4.f32031a
            double r12 = r2 - r5
            double r5 = r0.f32029b
            double r14 = r4.f32032b
            double r14 = r5 - r14
            double r50 = r2 - r33
            double r52 = r5 - r26
            r49 = r4
            r49.mo39810f(r50, r52, r54)
            na0.i r2 = r1.f32829k
            double r3 = r2.f32031a
            double r5 = r37 * r3
            double r7 = r2.f32032b
            double r26 = r10 * r7
            double r5 = r5 - r26
            double r3 = r3 * r10
            double r7 = r7 * r37
            double r7 = r7 + r3
            r3 = r5
            r5 = r7
            r7 = 0
            r2.mo39810f(r3, r5, r7)
            na0.h r0 = r1.f32823e
            double r2 = r0.f32028a
            na0.i r4 = r1.f32829k
            double r5 = r4.f32031a
            double r6 = r2 - r5
            double r2 = r0.f32029b
            double r4 = r4.f32032b
            double r8 = r2 - r4
            double r2 = r37 * r20
            double r4 = r10 * r18
            double r2 = r2 - r4
            double r10 = r10 * r20
            double r37 = r37 * r18
            double r10 = r37 + r10
            r48 = r2
            r33 = r6
            r26 = r8
            r50 = r10
            r2 = r12
            r4 = r14
            goto L_0x016e
        L_0x0164:
            r33 = r6
            r26 = r8
            r35 = r15
            r50 = r18
            r48 = r20
        L_0x016e:
            na0.i r6 = r1.f32829k
            double r7 = r2 - r33
            double r9 = r4 - r26
            r2 = r22
            r4 = r31
            r14 = r59
            r56 = r61
            r0 = r17
            r11 = r35
            r6.mo39810f(r7, r9, r11)
            na0.i r6 = r1.f32829k
            double r6 = r6.mo39806c()
            double r8 = java.lang.Math.abs(r6)
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x01f4
            double r8 = java.lang.Math.abs(r24)
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x01f4
            double r8 = r1.f32828j
            double r8 = r8 / r24
            na0.e r10 = r1.f32821c
            na0.k r10 = r10.f32016a
            float r11 = r10.f32057a
            double r11 = (double) r11
            r31 = r4
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r11 = java.lang.Math.pow(r4, r11)
            float r11 = (float) r11
            float r12 = r0 / r11
            double r16 = r6 * r8
            double r11 = (double) r12
            int r13 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x01bb
            double r11 = r11 / r6
            r4 = r11
            goto L_0x01cd
        L_0x01bb:
            float r10 = r10.f32058b
            double r10 = (double) r10
            double r4 = java.lang.Math.pow(r4, r10)
            float r4 = (float) r4
            float r12 = r0 / r4
            double r4 = (double) r12
            int r0 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x01cc
            double r4 = r4 / r6
            goto L_0x01cd
        L_0x01cc:
            r4 = r8
        L_0x01cd:
            na0.i r6 = r1.f32829k
            double r7 = r6.f32031a
            double r7 = r7 * r4
            double r9 = r6.f32032b
            double r9 = r9 * r4
            double r11 = r6.f32033c
            double r11 = r11 * r4
            r6.mo39810f(r7, r9, r11)
            na0.h r0 = r1.f32823e
            double r12 = r0.f32028a
            r6 = r33
            r8 = r12
            r10 = r4
            double r33 = p379.C16530d.m42010c(r6, r8, r10, r12)
            double r12 = r0.f32029b
            r6 = r26
            r8 = r12
            double r26 = p379.C16530d.m42010c(r6, r8, r10, r12)
            goto L_0x01f6
        L_0x01f4:
            r31 = r4
        L_0x01f6:
            na0.j r0 = r1.f32822d
            boolean r0 = r0.f32039f
            na0.e r4 = r1.f32821c
            r4.getClass()
            if (r0 == 0) goto L_0x0202
            goto L_0x0206
        L_0x0202:
            double r33 = ya0.C13288j.m33426a(r33)
        L_0x0206:
            double r46 = ya0.C13288j.m33426a(r26)
            r4 = -1
            if (r0 == 0) goto L_0x022b
            r5 = -4531038489797459968(0xc11e848000000000, double:-500000.0)
            r7 = 4692333547057315840(0x411e848000000000, double:500000.0)
            int r0 = (r33 > r7 ? 1 : (r33 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0221
            double r33 = r33 - r7
            double r33 = r33 + r5
            r0 = 1
            goto L_0x022c
        L_0x0221:
            int r0 = (r33 > r5 ? 1 : (r33 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x022b
            double r33 = r33 + r7
            double r33 = r33 + r7
            r0 = -1
            goto L_0x022c
        L_0x022b:
            r0 = 0
        L_0x022c:
            r44 = r33
            na0.i r5 = r1.f32829k
            double r6 = r5.f32031a
            double r38 = r44 + r6
            double r6 = r5.f32032b
            double r40 = r46 + r6
            double r5 = r5.f32033c
            r42 = r5
            sa0.f r5 = r1.f32820b
            r52 = 1
            r53 = 1
            r54 = 1
            r37 = r5
            sa0.e r37 = (sa0.C13096e) r37
            r37.mo39984r(r38, r40, r42, r44, r46, r48, r50, r52, r53, r54)
            if (r0 == 0) goto L_0x0259
            sa0.f r5 = r1.f32820b
            if (r0 != r4) goto L_0x0253
            r0 = 1
            goto L_0x0254
        L_0x0253:
            r0 = 0
        L_0x0254:
            sa0.e r5 = (sa0.C13096e) r5
            r5.mo39973j(r0)
        L_0x0259:
            na0.h r0 = r1.f32823e
            sa0.f r4 = r1.f32820b
            sa0.e r4 = (sa0.C13096e) r4
            com.nutiteq.components.MapPos r2 = r4.mo39978o(r2, r14)
            r0.mo39799c(r2)
            na0.h r0 = r1.f32824f
            sa0.f r2 = r1.f32820b
            sa0.e r2 = (sa0.C13096e) r2
            r3 = r31
            r5 = r56
            com.nutiteq.components.MapPos r2 = r2.mo39978o(r3, r5)
            r0.mo39799c(r2)
            na0.i r3 = r1.f32827i
            na0.h r0 = r1.f32824f
            double r4 = r0.f32028a
            na0.h r2 = r1.f32823e
            double r6 = r2.f32028a
            double r4 = r4 - r6
            double r6 = r0.f32029b
            double r8 = r2.f32029b
            double r6 = r6 - r8
            r8 = 0
            r3.mo39810f(r4, r6, r8)
            na0.i r0 = r1.f32827i
            double r2 = r0.mo39805b()
            r1.f32828j = r2
            return
        L_0x0295:
            r0 = move-exception
            sa0.f r2 = r1.f32820b
            sa0.e r2 = (sa0.C13096e) r2
            r3 = 0
            r2.mo39983q(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wa0.C13230b.mo40103e(float, float, float, float):void");
    }

    /* renamed from: f */
    public final void mo40104f(float f, float f2, float f3, float f4) {
        int i;
        float f5 = f;
        float f6 = f2;
        float f7 = f3;
        float f8 = f4;
        if (Math.abs(f6 - f8) > 360.0f) {
            this.f32819a = 5;
        } else {
            C12931i iVar = this.f32829k;
            C12930h hVar = this.f32823e;
            double d = ((double) f5) - hVar.f32028a;
            double d2 = ((double) f6) - hVar.f32029b;
            iVar.f32031a = d;
            iVar.f32032b = d2;
            C12931i iVar2 = this.f32831m;
            iVar2.mo39810f(iVar2.f32031a + d, iVar2.f32032b + d2, iVar.mo39805b() + iVar2.f32033c);
            C12931i iVar3 = this.f32829k;
            C12930h hVar2 = this.f32824f;
            double d3 = ((double) f7) - hVar2.f32028a;
            double d4 = ((double) f8) - hVar2.f32029b;
            iVar3.f32031a = d3;
            iVar3.f32032b = d4;
            C12931i iVar4 = this.f32832n;
            iVar4.mo39810f(iVar4.f32031a + d3, iVar4.f32032b + d4, iVar3.mo39805b() + iVar4.f32033c);
            C12931i iVar5 = this.f32831m;
            double d5 = iVar5.f32033c;
            if ((d5 > 10.0d || this.f32832n.f32033c > 10.0d) && iVar5.f32032b * this.f32832n.f32032b <= 0.0d) {
                this.f32819a = 5;
            }
            if (this.f32819a == 1 && (d5 > 30.0d || this.f32832n.f32033c > 30.0d)) {
                if (Math.abs((float) (iVar5.f32031a / iVar5.mo39805b())) > 0.707f) {
                    this.f32819a = 5;
                } else {
                    C12931i iVar6 = this.f32832n;
                    if (Math.abs((float) (iVar6.f32031a / iVar6.mo39805b())) > 0.707f) {
                        this.f32819a = 5;
                    } else {
                        this.f32819a = 2;
                    }
                }
            }
        }
        if (this.f32819a != 5 || this.f32822d.f32042i) {
            i = 3;
        } else {
            C12930h hVar3 = this.f32823e;
            double d6 = hVar3.f32028a;
            C12930h hVar4 = this.f32824f;
            i = 3;
            if (mo40099a(d6 - hVar4.f32028a, hVar3.f32029b - hVar4.f32029b, (double) (f7 - f5), (double) (f8 - f6)) > 0.75f) {
                this.f32819a = 3;
            } else {
                this.f32819a = 4;
            }
        }
        int i2 = this.f32819a;
        if (i2 == i || i2 == 4) {
            C12930h hVar5 = this.f32823e;
            hVar5.f32028a = (double) f5;
            hVar5.f32029b = (double) f6;
            C12930h hVar6 = this.f32824f;
            double d7 = (double) f7;
            double d8 = (double) f8;
            hVar6.f32028a = d7;
            hVar6.f32029b = d8;
            C12931i iVar7 = this.f32827i;
            iVar7.f32031a = d7 - hVar5.f32028a;
            iVar7.f32032b = d8 - hVar5.f32029b;
            if (this.f32822d.f32053t) {
                C13096e eVar = (C13096e) this.f32820b;
                GLTextureView gLTextureView = eVar.f32445j;
                this.f32825g.mo39799c(eVar.mo39977n((double) (((float) gLTextureView.getWidth()) / 2.0f), (double) (((float) gLTextureView.getHeight()) / 2.0f)));
                return;
            }
            this.f32825g.mo39799c(((C13096e) this.f32820b).mo39977n(((double) (f5 + f7)) * 0.5d, ((double) (f6 + f8)) * 0.5d));
        } else if (i2 != 5) {
            C12930h hVar7 = this.f32823e;
            hVar7.f32028a = (double) f5;
            hVar7.f32029b = (double) f6;
            C12930h hVar8 = this.f32824f;
            hVar8.f32028a = (double) f7;
            hVar8.f32029b = (double) f8;
        } else {
            this.f32823e.mo39799c(((C13096e) this.f32820b).mo39978o((double) f5, (double) f6));
            this.f32824f.mo39799c(((C13096e) this.f32820b).mo39978o((double) f7, (double) f8));
            C12931i iVar8 = this.f32827i;
            C12930h hVar9 = this.f32824f;
            double d9 = hVar9.f32028a;
            C12930h hVar10 = this.f32823e;
            iVar8.f32031a = d9 - hVar10.f32028a;
            iVar8.f32032b = hVar9.f32029b - hVar10.f32029b;
            this.f32828j = iVar8.mo39805b();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: g */
    public final void mo40105g(float f, float f2, float f3, float f4) {
        C12931i iVar = this.f32827i;
        double d = (double) (f3 - f);
        double d2 = (double) (f4 - f2);
        if (mo40099a(iVar.f32031a, iVar.f32032b, d, d2) < 0.25f) {
            this.f32819a = 4;
            mo40106h(f, f2, f3, f4);
            return;
        }
        C12931i iVar2 = this.f32829k;
        iVar2.f32031a = d;
        iVar2.f32032b = d2;
        iVar2.mo39807d();
        C12931i iVar3 = this.f32830l;
        C12931i iVar4 = this.f32827i;
        double d3 = iVar4.f32031a;
        double d4 = iVar4.f32032b;
        iVar3.f32031a = d3;
        iVar3.f32032b = d4;
        iVar3.mo39807d();
        C12931i iVar5 = this.f32830l;
        double d5 = iVar5.f32031a;
        C12931i iVar6 = this.f32829k;
        double d6 = (iVar5.f32032b * iVar6.f32032b) + (d5 * iVar6.f32031a);
        if (this.f32821c.f32019d && Math.abs(d6) < 1.0d) {
            C12931i iVar7 = this.f32830l;
            double d7 = iVar7.f32031a;
            C12931i iVar8 = this.f32829k;
            double d8 = (d7 * iVar8.f32032b) - (iVar7.f32032b * iVar8.f32031a);
            ((C13096e) this.f32820b).mo39983q(true);
            try {
                MapPos d9 = ((C13096e) this.f32820b).mo39967d();
                double d11 = d9.f24175b;
                double d12 = d9.f24176c;
                double d13 = d6;
                double d14 = d9.f24177d;
                MapPos g = ((C13096e) this.f32820b).mo39970g();
                double d15 = d2;
                double d16 = g.f24175b;
                double d17 = d;
                double d18 = g.f24176c;
                C12936m i = ((C13096e) this.f32820b).mo39972i();
                double d19 = d14;
                double d21 = i.f32066a;
                double d22 = i.f32067b;
                ((C13096e) this.f32820b).mo39983q(false);
                C12931i iVar9 = this.f32829k;
                C12930h hVar = this.f32825g;
                double d23 = d22;
                iVar9.mo39810f(hVar.f32028a - d11, hVar.f32029b - d12, 0.0d);
                C12931i iVar10 = this.f32829k;
                double d24 = iVar10.f32031a;
                double d25 = d13;
                double d26 = iVar10.f32032b;
                iVar10.mo39810f((d25 * d24) - (d8 * d26), (d26 * d25) + (d24 * d8), 0.0d);
                C12930h hVar2 = this.f32825g;
                double d27 = hVar2.f32028a;
                C12931i iVar11 = this.f32829k;
                double d28 = d27 - iVar11.f32031a;
                double d29 = hVar2.f32029b;
                iVar11.mo39810f(d27 - d16, d29 - d18, 0.0d);
                C12931i iVar12 = this.f32829k;
                double d31 = iVar12.f32031a;
                double d32 = iVar12.f32032b;
                C12931i iVar13 = iVar12;
                iVar13.mo39810f((d25 * d31) - (d8 * d32), (d25 * d32) + (d31 * d8), 0.0d);
                C12930h hVar3 = this.f32825g;
                double d33 = hVar3.f32028a;
                C12931i iVar14 = this.f32829k;
                C13096e eVar = (C13096e) this.f32820b;
                eVar.mo39984r(d28, d29 - iVar11.f32032b, d19, d33 - iVar14.f32031a, hVar3.f32029b - iVar14.f32032b, (d25 * d21) - (d8 * d23), (d25 * d23) + (d8 * d21), true, false, false);
                C12931i iVar15 = this.f32827i;
                iVar15.f32031a = d17;
                iVar15.f32032b = d15;
            } catch (Throwable th) {
                ((C13096e) this.f32820b).mo39983q(false);
                throw th;
            }
        }
    }

    /* renamed from: h */
    public final void mo40106h(float f, float f2, float f3, float f4) {
        double d;
        C12931i iVar = this.f32827i;
        double d2 = (double) (f3 - f);
        double d3 = (double) (f4 - f2);
        if (mo40099a(iVar.f32031a, iVar.f32032b, d2, d3) > 3.0f) {
            this.f32819a = 3;
            mo40105g(f, f2, f3, f4);
            return;
        }
        C12931i iVar2 = this.f32829k;
        iVar2.f32031a = d2;
        iVar2.f32032b = d3;
        C12931i iVar3 = this.f32827i;
        double b = (((iVar3.f32032b * d3) + (iVar3.f32031a * d2)) / iVar3.mo39805b()) / this.f32827i.mo39805b();
        if (b > 0.0d) {
            double d4 = 1.0d / b;
            ((C13096e) this.f32820b).mo39983q(true);
            try {
                MapPos d5 = ((C13096e) this.f32820b).mo39967d();
                double d6 = d5.f24175b;
                double d7 = d5.f24176c;
                double d8 = d5.f24177d;
                MapPos g = ((C13096e) this.f32820b).mo39970g();
                double d9 = d3;
                double d11 = g.f24175b;
                double d12 = d2;
                double d13 = g.f24176c;
                C12936m i = ((C13096e) this.f32820b).mo39972i();
                double d14 = d4;
                double d15 = i.f32066a;
                double d16 = i.f32067b;
                C13097f fVar = this.f32820b;
                float f5 = ((C13096e) fVar).f32429Q;
                ((C13096e) fVar).mo39983q(false);
                this.f32829k.mo39810f(d6 - d11, d7 - d13, d8);
                double c = this.f32829k.mo39806c();
                C12934k kVar = this.f32821c.f32016a;
                double d17 = c * d14;
                double pow = (double) (f5 / ((float) Math.pow(2.0d, (double) kVar.f32057a)));
                if (d17 <= pow) {
                    pow = (double) (f5 / ((float) Math.pow(2.0d, (double) kVar.f32058b)));
                    if (d17 >= pow) {
                        d = d14;
                        C12931i iVar4 = this.f32829k;
                        iVar4.mo39810f(iVar4.f32031a * d, iVar4.f32032b * d, iVar4.f32033c * d);
                        C12930h hVar = this.f32825g;
                        double d18 = hVar.f32028a;
                        double d19 = d;
                        double c2 = C16530d.m42010c(d11, d18, d19, d18);
                        double d21 = hVar.f32029b;
                        double c3 = C16530d.m42010c(d13, d21, d19, d21);
                        C12931i iVar5 = this.f32829k;
                        double d22 = c2 + iVar5.f32031a;
                        double d23 = c3 + iVar5.f32032b;
                        double d24 = iVar5.f32033c;
                        ((C13096e) this.f32820b).mo39984r(d22, d23, d24, c2, c3, d15, d16, false, false, true);
                        C12931i iVar6 = this.f32827i;
                        iVar6.f32031a = d12;
                        iVar6.f32032b = d9;
                    }
                }
                d = pow / c;
                C12931i iVar42 = this.f32829k;
                iVar42.mo39810f(iVar42.f32031a * d, iVar42.f32032b * d, iVar42.f32033c * d);
                C12930h hVar2 = this.f32825g;
                double d182 = hVar2.f32028a;
                double d192 = d;
                double c22 = C16530d.m42010c(d11, d182, d192, d182);
                double d212 = hVar2.f32029b;
                double c32 = C16530d.m42010c(d13, d212, d192, d212);
                C12931i iVar52 = this.f32829k;
                double d222 = c22 + iVar52.f32031a;
                double d232 = c32 + iVar52.f32032b;
                double d242 = iVar52.f32033c;
                ((C13096e) this.f32820b).mo39984r(d222, d232, d242, c22, c32, d15, d16, false, false, true);
                C12931i iVar62 = this.f32827i;
                iVar62.f32031a = d12;
                iVar62.f32032b = d9;
            } catch (Throwable th) {
                ((C13096e) this.f32820b).mo39983q(false);
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: i */
    public final void mo40107i(float f, float f2) {
        ((C13096e) this.f32820b).mo39983q(true);
        try {
            MapPos d = ((C13096e) this.f32820b).mo39967d();
            MapPos g = ((C13096e) this.f32820b).mo39970g();
            C12936m i = ((C13096e) this.f32820b).mo39972i();
            ((C13096e) this.f32820b).mo39983q(false);
            this.f32829k.mo39810f(d.f24175b - g.f24175b, d.f24176c - g.f24176c, d.f24177d);
            double c = this.f32829k.mo39806c();
            double d2 = (double) f2;
            double d3 = d2;
            float c2 = (float) C16530d.m42010c(d3, this.f32823e.f32029b, 0.003490658476948738d, (double) ((float) Math.asin(Math.max(-1.0d, Math.min(1.0d, this.f32829k.f32033c / c)))));
            C12934k kVar = this.f32821c.f32018c;
            double sin = Math.sin((double) C13288j.m33427b(Math.max(kVar.f32057a, Math.min(kVar.f32058b, c2)), kVar.f32057a, kVar.f32058b)) * c;
            this.f32829k.f32033c = sin;
            double sqrt = Math.sqrt(Math.max(0.0d, (c * c) - (sin * sin)));
            C13097f fVar = this.f32820b;
            double d4 = g.f24175b;
            double d5 = g.f24176c;
            ((C13096e) fVar).mo39985s(d4 - (i.f32066a * sqrt), d5 - (i.f32067b * sqrt), this.f32829k.f32033c, d4, d5, true, true);
            C12930h hVar = this.f32823e;
            hVar.f32028a = (double) f;
            hVar.f32029b = d2;
        } catch (Throwable th) {
            ((C13096e) this.f32820b).mo39983q(false);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e2  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40108j(float r28, float r29) {
        /*
            r27 = this;
            r1 = r27
            r0 = r28
            r2 = r29
            boolean r3 = r1.f32834p
            r4 = 1
            if (r3 != 0) goto L_0x003f
            double r5 = (double) r0
            na0.i r3 = r1.f32833o
            double r7 = r3.f32031a
            double r7 = r5 - r7
            double r7 = java.lang.Math.abs(r7)
            double r9 = (double) r2
            na0.i r3 = r1.f32833o
            double r11 = r3.f32032b
            double r11 = r9 - r11
            double r11 = java.lang.Math.abs(r11)
            na0.j r3 = r1.f32822d
            float r3 = r3.f32051r
            double r13 = (double) r3
            int r3 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r3 > 0) goto L_0x0030
            int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r3 <= 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            return
        L_0x0030:
            na0.h r3 = r1.f32823e
            sa0.f r7 = r1.f32820b
            sa0.e r7 = (sa0.C13096e) r7
            com.nutiteq.components.MapPos r5 = r7.mo39977n(r5, r9)
            r3.mo39799c(r5)
            r1.f32834p = r4
        L_0x003f:
            sa0.f r3 = r1.f32820b
            sa0.e r3 = (sa0.C13096e) r3
            r3.mo39983q(r4)
            r3 = 0
            sa0.f r5 = r1.f32820b     // Catch:{ all -> 0x0100 }
            sa0.e r5 = (sa0.C13096e) r5     // Catch:{ all -> 0x0100 }
            com.nutiteq.components.MapPos r5 = r5.mo39967d()     // Catch:{ all -> 0x0100 }
            double r6 = r5.f24175b     // Catch:{ all -> 0x0100 }
            double r8 = r5.f24176c     // Catch:{ all -> 0x0100 }
            double r13 = r5.f24177d     // Catch:{ all -> 0x0100 }
            sa0.f r5 = r1.f32820b     // Catch:{ all -> 0x0100 }
            sa0.e r5 = (sa0.C13096e) r5     // Catch:{ all -> 0x0100 }
            com.nutiteq.components.MapPos r5 = r5.mo39970g()     // Catch:{ all -> 0x0100 }
            double r10 = r5.f24175b     // Catch:{ all -> 0x0100 }
            double r4 = r5.f24176c     // Catch:{ all -> 0x0100 }
            sa0.f r12 = r1.f32820b
            sa0.e r12 = (sa0.C13096e) r12
            r12.mo39983q(r3)
            double r6 = r6 - r10
            double r8 = r8 - r4
            sa0.f r12 = r1.f32820b
            r15 = r4
            double r3 = (double) r0
            r17 = r13
            double r13 = (double) r2
            sa0.e r12 = (sa0.C13096e) r12
            com.nutiteq.components.MapPos r0 = r12.mo39978o(r3, r13)
            na0.i r2 = r1.f32829k
            r19 = r13
            double r12 = r0.f24175b
            na0.h r5 = r1.f32823e
            r23 = r3
            double r3 = r5.f32028a
            double r12 = r12 - r3
            double r3 = r0.f24176c
            r21 = r8
            double r8 = r5.f32029b
            double r3 = r3 - r8
            r2.f32031a = r12
            r2.f32032b = r3
            double r10 = r10 - r12
            double r4 = r15 - r3
            na0.j r0 = r1.f32822d
            boolean r0 = r0.f32039f
            na0.e r2 = r1.f32821c
            r2.getClass()
            if (r0 == 0) goto L_0x009e
            goto L_0x00a2
        L_0x009e:
            double r10 = ya0.C13288j.m33426a(r10)
        L_0x00a2:
            double r2 = ya0.C13288j.m33426a(r4)
            r4 = -1
            if (r0 == 0) goto L_0x00c5
            r8 = -4531038489797459968(0xc11e848000000000, double:-500000.0)
            r12 = 4692333547057315840(0x411e848000000000, double:500000.0)
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bc
            double r10 = r10 - r12
            double r10 = r10 + r8
            r8 = r10
            r0 = 1
            goto L_0x00c7
        L_0x00bc:
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c5
            double r10 = r10 + r12
            double r10 = r10 + r12
            r8 = r10
            r0 = -1
            goto L_0x00c7
        L_0x00c5:
            r8 = r10
            r0 = 0
        L_0x00c7:
            double r11 = r8 + r6
            double r13 = r2 + r21
            sa0.f r5 = r1.f32820b
            r21 = 0
            r22 = 0
            r10 = r5
            sa0.e r10 = (sa0.C13096e) r10
            r5 = r17
            r25 = r19
            r15 = r5
            r17 = r8
            r19 = r2
            r10.mo39985s(r11, r13, r15, r17, r19, r21, r22)
            if (r0 == 0) goto L_0x00ee
            sa0.f r2 = r1.f32820b
            if (r0 != r4) goto L_0x00e8
            r4 = 1
            goto L_0x00e9
        L_0x00e8:
            r4 = 0
        L_0x00e9:
            sa0.e r2 = (sa0.C13096e) r2
            r2.mo39973j(r4)
        L_0x00ee:
            na0.h r0 = r1.f32823e
            sa0.f r2 = r1.f32820b
            sa0.e r2 = (sa0.C13096e) r2
            r3 = r23
            r5 = r25
            com.nutiteq.components.MapPos r2 = r2.mo39978o(r3, r5)
            r0.mo39799c(r2)
            return
        L_0x0100:
            r0 = move-exception
            sa0.f r2 = r1.f32820b
            sa0.e r2 = (sa0.C13096e) r2
            r3 = 0
            r2.mo39983q(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wa0.C13230b.mo40108j(float, float):void");
    }

    /* renamed from: k */
    public final synchronized void mo40109k(float f, float f2) {
        this.f32823e.mo39799c(((C13096e) this.f32820b).mo39978o((double) f, (double) f2));
        this.f32819a = 0;
        C13096e eVar = (C13096e) this.f32820b;
        eVar.f32426N = true;
        eVar.mo39976m();
    }
}
