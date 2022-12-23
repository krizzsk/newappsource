package p151kb;

import java.util.List;
import p126ib.C5334b;

/* renamed from: kb.a */
public final class C5535a extends C5334b {

    /* renamed from: m */
    public final C5536b f18129m;

    public C5535a(List<byte[]> list) {
        byte[] bArr = list.get(0);
        int length = bArr.length;
        this.f18129m = new C5536b(((bArr[0] & 255) << 8) | (bArr[1] & 255), (bArr[3] & 255) | ((bArr[2] & 255) << 8));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x024c, code lost:
        if ((r1.f18145b + 1) == r3.f18139g.getHeight()) goto L_0x0263;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p126ib.C5336d mo21119g(byte[] r29, int r30, boolean r31) {
        /*
            r28 = this;
            r0 = r28
            r1 = 0
            if (r31 == 0) goto L_0x0026
            kb.b r2 = r0.f18129m
            kb.b$h r2 = r2.f18138f
            android.util.SparseArray<kb.b$f> r3 = r2.f18173c
            r3.clear()
            android.util.SparseArray<kb.b$a> r3 = r2.f18174d
            r3.clear()
            android.util.SparseArray<kb.b$c> r3 = r2.f18175e
            r3.clear()
            android.util.SparseArray<kb.b$a> r3 = r2.f18176f
            r3.clear()
            android.util.SparseArray<kb.b$c> r3 = r2.f18177g
            r3.clear()
            r2.f18178h = r1
            r2.f18179i = r1
        L_0x0026:
            kb.c r2 = new kb.c
            kb.b r3 = r0.f18129m
            r3.getClass()
            ub.q r4 = new ub.q
            r5 = r29
            r6 = r30
            r4.<init>(r5, r6)
        L_0x0036:
            int r5 = r4.mo22969b()
            r6 = 48
            r7 = 2
            r8 = 3
            r9 = 1
            if (r5 < r6) goto L_0x0221
            r5 = 8
            int r6 = r4.mo22973f(r5)
            r11 = 15
            if (r6 != r11) goto L_0x0221
            kb.b$h r6 = r3.f18138f
            int r11 = r4.mo22973f(r5)
            r12 = 16
            int r13 = r4.mo22973f(r12)
            int r14 = r4.mo22973f(r12)
            int r15 = r4.mo22971d()
            int r15 = r15 + r14
            int r1 = r14 * 8
            int r10 = r4.mo22969b()
            if (r1 <= r10) goto L_0x0071
            int r1 = r4.mo22969b()
            r4.mo22979l(r1)
            goto L_0x021e
        L_0x0071:
            r1 = 4
            switch(r11) {
                case 16: goto L_0x01b7;
                case 17: goto L_0x00ff;
                case 18: goto L_0x00dd;
                case 19: goto L_0x00bb;
                case 20: goto L_0x0077;
                default: goto L_0x0075;
            }
        L_0x0075:
            goto L_0x0216
        L_0x0077:
            int r5 = r6.f18171a
            if (r13 != r5) goto L_0x0216
            r4.mo22979l(r1)
            boolean r1 = r4.mo22972e()
            r4.mo22979l(r8)
            int r17 = r4.mo22973f(r12)
            int r18 = r4.mo22973f(r12)
            if (r1 == 0) goto L_0x00a8
            int r10 = r4.mo22973f(r12)
            int r1 = r4.mo22973f(r12)
            int r5 = r4.mo22973f(r12)
            int r7 = r4.mo22973f(r12)
            r20 = r1
            r21 = r5
            r22 = r7
            r19 = r10
            goto L_0x00b0
        L_0x00a8:
            r20 = r17
            r22 = r18
            r19 = 0
            r21 = 0
        L_0x00b0:
            kb.b$b r1 = new kb.b$b
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r6.f18178h = r1
            goto L_0x0216
        L_0x00bb:
            int r1 = r6.f18171a
            if (r13 != r1) goto L_0x00cc
            kb.b$c r1 = p151kb.C5536b.m13755f(r4)
            android.util.SparseArray<kb.b$c> r5 = r6.f18175e
            int r6 = r1.f18150a
            r5.put(r6, r1)
            goto L_0x0216
        L_0x00cc:
            int r1 = r6.f18172b
            if (r13 != r1) goto L_0x0216
            kb.b$c r1 = p151kb.C5536b.m13755f(r4)
            android.util.SparseArray<kb.b$c> r5 = r6.f18177g
            int r6 = r1.f18150a
            r5.put(r6, r1)
            goto L_0x0216
        L_0x00dd:
            int r1 = r6.f18171a
            if (r13 != r1) goto L_0x00ee
            kb.b$a r1 = p151kb.C5536b.m13754e(r4, r14)
            android.util.SparseArray<kb.b$a> r5 = r6.f18174d
            int r6 = r1.f18140a
            r5.put(r6, r1)
            goto L_0x0216
        L_0x00ee:
            int r1 = r6.f18172b
            if (r13 != r1) goto L_0x0216
            kb.b$a r1 = p151kb.C5536b.m13754e(r4, r14)
            android.util.SparseArray<kb.b$a> r5 = r6.f18176f
            int r6 = r1.f18140a
            r5.put(r6, r1)
            goto L_0x0216
        L_0x00ff:
            kb.b$d r10 = r6.f18179i
            int r11 = r6.f18171a
            if (r13 != r11) goto L_0x0216
            if (r10 == 0) goto L_0x0216
            int r11 = r4.mo22973f(r5)
            r4.mo22979l(r1)
            boolean r18 = r4.mo22972e()
            r4.mo22979l(r8)
            int r19 = r4.mo22973f(r12)
            int r20 = r4.mo22973f(r12)
            r4.mo22973f(r8)
            int r21 = r4.mo22973f(r8)
            r4.mo22979l(r7)
            int r22 = r4.mo22973f(r5)
            int r23 = r4.mo22973f(r5)
            int r24 = r4.mo22973f(r1)
            int r25 = r4.mo22973f(r7)
            r4.mo22979l(r7)
            int r14 = r14 + -10
            android.util.SparseArray r8 = new android.util.SparseArray
            r8.<init>()
        L_0x0141:
            if (r14 <= 0) goto L_0x017b
            int r13 = r4.mo22973f(r12)
            int r12 = r4.mo22973f(r7)
            r4.mo22973f(r7)
            r5 = 12
            int r7 = r4.mo22973f(r5)
            r4.mo22979l(r1)
            int r5 = r4.mo22973f(r5)
            int r14 = r14 + -6
            if (r12 == r9) goto L_0x0162
            r9 = 2
            if (r12 != r9) goto L_0x016c
        L_0x0162:
            r9 = 8
            r4.mo22973f(r9)
            r4.mo22973f(r9)
            int r14 = r14 + -2
        L_0x016c:
            kb.b$g r9 = new kb.b$g
            r9.<init>(r7, r5)
            r8.put(r13, r9)
            r5 = 8
            r7 = 2
            r9 = 1
            r12 = 16
            goto L_0x0141
        L_0x017b:
            kb.b$f r1 = new kb.b$f
            r16 = r1
            r17 = r11
            r26 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r5 = r10.f18155b
            if (r5 != 0) goto L_0x01af
            android.util.SparseArray<kb.b$f> r5 = r6.f18173c
            java.lang.Object r5 = r5.get(r11)
            kb.b$f r5 = (p151kb.C5536b.C5542f) r5
            if (r5 == 0) goto L_0x01af
            android.util.SparseArray<kb.b$g> r5 = r5.f18168j
            r10 = 0
        L_0x0197:
            int r7 = r5.size()
            if (r10 >= r7) goto L_0x01af
            android.util.SparseArray<kb.b$g> r7 = r1.f18168j
            int r8 = r5.keyAt(r10)
            java.lang.Object r9 = r5.valueAt(r10)
            kb.b$g r9 = (p151kb.C5536b.C5543g) r9
            r7.put(r8, r9)
            int r10 = r10 + 1
            goto L_0x0197
        L_0x01af:
            android.util.SparseArray<kb.b$f> r5 = r6.f18173c
            int r6 = r1.f18159a
            r5.put(r6, r1)
            goto L_0x0216
        L_0x01b7:
            int r5 = r6.f18171a
            if (r13 != r5) goto L_0x0216
            kb.b$d r5 = r6.f18179i
            r7 = 8
            r4.mo22973f(r7)
            int r1 = r4.mo22973f(r1)
            r8 = 2
            int r9 = r4.mo22973f(r8)
            r4.mo22979l(r8)
            int r14 = r14 + -2
            android.util.SparseArray r8 = new android.util.SparseArray
            r8.<init>()
        L_0x01d5:
            if (r14 <= 0) goto L_0x01f5
            int r10 = r4.mo22973f(r7)
            r4.mo22979l(r7)
            r11 = 16
            int r12 = r4.mo22973f(r11)
            int r13 = r4.mo22973f(r11)
            int r14 = r14 + -6
            kb.b$e r7 = new kb.b$e
            r7.<init>(r12, r13)
            r8.put(r10, r7)
            r7 = 8
            goto L_0x01d5
        L_0x01f5:
            kb.b$d r7 = new kb.b$d
            r7.<init>(r1, r9, r8)
            if (r9 == 0) goto L_0x020e
            r6.f18179i = r7
            android.util.SparseArray<kb.b$f> r1 = r6.f18173c
            r1.clear()
            android.util.SparseArray<kb.b$a> r1 = r6.f18174d
            r1.clear()
            android.util.SparseArray<kb.b$c> r1 = r6.f18175e
            r1.clear()
            goto L_0x0216
        L_0x020e:
            if (r5 == 0) goto L_0x0216
            int r5 = r5.f18154a
            if (r5 == r1) goto L_0x0216
            r6.f18179i = r7
        L_0x0216:
            int r1 = r4.mo22971d()
            int r15 = r15 - r1
            r4.mo22980m(r15)
        L_0x021e:
            r1 = 0
            goto L_0x0036
        L_0x0221:
            kb.b$h r1 = r3.f18138f
            kb.b$d r4 = r1.f18179i
            if (r4 != 0) goto L_0x022e
            java.util.List r1 = java.util.Collections.emptyList()
            r0 = r2
            goto L_0x03f9
        L_0x022e:
            kb.b$b r1 = r1.f18178h
            if (r1 == 0) goto L_0x0233
            goto L_0x0235
        L_0x0233:
            kb.b$b r1 = r3.f18136d
        L_0x0235:
            android.graphics.Bitmap r5 = r3.f18139g
            if (r5 == 0) goto L_0x024f
            int r6 = r1.f18144a
            r7 = 1
            int r6 = r6 + r7
            int r5 = r5.getWidth()
            if (r6 != r5) goto L_0x0250
            int r5 = r1.f18145b
            int r5 = r5 + r7
            android.graphics.Bitmap r6 = r3.f18139g
            int r6 = r6.getHeight()
            if (r5 == r6) goto L_0x0263
            goto L_0x0250
        L_0x024f:
            r7 = 1
        L_0x0250:
            int r5 = r1.f18144a
            int r5 = r5 + r7
            int r6 = r1.f18145b
            int r6 = r6 + r7
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r6, r7)
            r3.f18139g = r5
            android.graphics.Canvas r6 = r3.f18135c
            r6.setBitmap(r5)
        L_0x0263:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            android.util.SparseArray<kb.b$e> r4 = r4.f18156c
            r6 = 0
        L_0x026b:
            int r7 = r4.size()
            if (r6 >= r7) goto L_0x03f1
            android.graphics.Canvas r7 = r3.f18135c
            r7.save()
            java.lang.Object r7 = r4.valueAt(r6)
            kb.b$e r7 = (p151kb.C5536b.C5541e) r7
            int r9 = r4.keyAt(r6)
            kb.b$h r10 = r3.f18138f
            android.util.SparseArray<kb.b$f> r10 = r10.f18173c
            java.lang.Object r9 = r10.get(r9)
            kb.b$f r9 = (p151kb.C5536b.C5542f) r9
            int r10 = r7.f18157a
            int r11 = r1.f18146c
            int r10 = r10 + r11
            int r7 = r7.f18158b
            int r11 = r1.f18148e
            int r7 = r7 + r11
            int r11 = r9.f18161c
            int r11 = r11 + r10
            int r12 = r1.f18147d
            int r11 = java.lang.Math.min(r11, r12)
            int r12 = r9.f18162d
            int r12 = r12 + r7
            int r13 = r1.f18149f
            int r12 = java.lang.Math.min(r12, r13)
            android.graphics.Canvas r13 = r3.f18135c
            r13.clipRect(r10, r7, r11, r12)
            kb.b$h r11 = r3.f18138f
            android.util.SparseArray<kb.b$a> r11 = r11.f18174d
            int r12 = r9.f18164f
            java.lang.Object r11 = r11.get(r12)
            kb.b$a r11 = (p151kb.C5536b.C5537a) r11
            if (r11 != 0) goto L_0x02c9
            kb.b$h r11 = r3.f18138f
            android.util.SparseArray<kb.b$a> r11 = r11.f18176f
            int r12 = r9.f18164f
            java.lang.Object r11 = r11.get(r12)
            kb.b$a r11 = (p151kb.C5536b.C5537a) r11
            if (r11 != 0) goto L_0x02c9
            kb.b$a r11 = r3.f18137e
        L_0x02c9:
            android.util.SparseArray<kb.b$g> r12 = r9.f18168j
            r13 = 0
        L_0x02cc:
            int r14 = r12.size()
            if (r13 >= r14) goto L_0x0353
            int r14 = r12.keyAt(r13)
            java.lang.Object r15 = r12.valueAt(r13)
            kb.b$g r15 = (p151kb.C5536b.C5543g) r15
            kb.b$h r8 = r3.f18138f
            android.util.SparseArray<kb.b$c> r8 = r8.f18175e
            java.lang.Object r8 = r8.get(r14)
            kb.b$c r8 = (p151kb.C5536b.C5539c) r8
            if (r8 != 0) goto L_0x02f2
            kb.b$h r8 = r3.f18138f
            android.util.SparseArray<kb.b$c> r8 = r8.f18177g
            java.lang.Object r8 = r8.get(r14)
            kb.b$c r8 = (p151kb.C5536b.C5539c) r8
        L_0x02f2:
            if (r8 == 0) goto L_0x033b
            boolean r14 = r8.f18151b
            if (r14 == 0) goto L_0x02fa
            r14 = 0
            goto L_0x02fc
        L_0x02fa:
            android.graphics.Paint r14 = r3.f18133a
        L_0x02fc:
            int r0 = r9.f18163e
            r25 = r4
            int r4 = r15.f18169a
            int r4 = r4 + r10
            int r15 = r15.f18170b
            int r15 = r15 + r7
            r26 = r12
            android.graphics.Canvas r12 = r3.f18135c
            r31 = r2
            r2 = 3
            if (r0 != r2) goto L_0x0314
            int[] r2 = r11.f18143d
        L_0x0311:
            r27 = r6
            goto L_0x031d
        L_0x0314:
            r2 = 2
            if (r0 != r2) goto L_0x031a
            int[] r2 = r11.f18142c
            goto L_0x0311
        L_0x031a:
            int[] r2 = r11.f18141b
            goto L_0x0311
        L_0x031d:
            byte[] r6 = r8.f18152c
            r18 = r6
            r19 = r2
            r20 = r0
            r21 = r4
            r22 = r15
            r23 = r14
            r24 = r12
            p151kb.C5536b.m13753d(r18, r19, r20, r21, r22, r23, r24)
            byte[] r6 = r8.f18153d
            r8 = 1
            int r22 = r15 + 1
            r18 = r6
            p151kb.C5536b.m13753d(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0344
        L_0x033b:
            r31 = r2
            r25 = r4
            r27 = r6
            r26 = r12
            r8 = 1
        L_0x0344:
            int r13 = r13 + 1
            r0 = r28
            r2 = r31
            r4 = r25
            r12 = r26
            r6 = r27
            r8 = 3
            goto L_0x02cc
        L_0x0353:
            r31 = r2
            r25 = r4
            r27 = r6
            r8 = 1
            boolean r0 = r9.f18160b
            if (r0 == 0) goto L_0x039e
            int r0 = r9.f18163e
            r2 = 3
            if (r0 != r2) goto L_0x036b
            int[] r0 = r11.f18143d
            int r4 = r9.f18165g
            r0 = r0[r4]
            r4 = 2
            goto L_0x037b
        L_0x036b:
            r4 = 2
            if (r0 != r4) goto L_0x0375
            int[] r0 = r11.f18142c
            int r6 = r9.f18166h
            r0 = r0[r6]
            goto L_0x037b
        L_0x0375:
            int[] r0 = r11.f18141b
            int r6 = r9.f18167i
            r0 = r0[r6]
        L_0x037b:
            android.graphics.Paint r6 = r3.f18134b
            r6.setColor(r0)
            android.graphics.Canvas r0 = r3.f18135c
            float r6 = (float) r10
            float r11 = (float) r7
            int r12 = r9.f18161c
            int r12 = r12 + r10
            float r12 = (float) r12
            int r13 = r9.f18162d
            int r13 = r13 + r7
            float r13 = (float) r13
            android.graphics.Paint r14 = r3.f18134b
            r16 = r0
            r17 = r6
            r18 = r11
            r19 = r12
            r20 = r13
            r21 = r14
            r16.drawRect(r17, r18, r19, r20, r21)
            goto L_0x03a0
        L_0x039e:
            r2 = 3
            r4 = 2
        L_0x03a0:
            ib.a$a r0 = new ib.a$a
            r0.<init>()
            android.graphics.Bitmap r6 = r3.f18139g
            int r11 = r9.f18161c
            int r12 = r9.f18162d
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r6, r10, r7, r11, r12)
            r0.f17607b = r6
            float r6 = (float) r10
            int r10 = r1.f18144a
            float r10 = (float) r10
            float r6 = r6 / r10
            r0.f17613h = r6
            r6 = 0
            r0.f17614i = r6
            float r7 = (float) r7
            int r11 = r1.f18145b
            float r11 = (float) r11
            float r7 = r7 / r11
            r0.f17610e = r7
            r0.f17611f = r6
            r0.f17612g = r6
            int r6 = r9.f18161c
            float r6 = (float) r6
            float r6 = r6 / r10
            r0.f17617l = r6
            int r6 = r9.f18162d
            float r6 = (float) r6
            float r6 = r6 / r11
            r0.f17618m = r6
            ib.a r0 = r0.mo21116a()
            r5.add(r0)
            android.graphics.Canvas r0 = r3.f18135c
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.CLEAR
            r7 = 0
            r0.drawColor(r7, r6)
            android.graphics.Canvas r0 = r3.f18135c
            r0.restore()
            int r6 = r27 + 1
            r0 = r28
            r2 = r31
            r4 = r25
            r8 = 3
            goto L_0x026b
        L_0x03f1:
            r31 = r2
            java.util.List r1 = java.util.Collections.unmodifiableList(r5)
            r0 = r31
        L_0x03f9:
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p151kb.C5535a.mo21119g(byte[], int, boolean):ib.d");
    }
}
