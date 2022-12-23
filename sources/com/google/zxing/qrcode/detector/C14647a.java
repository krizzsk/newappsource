package com.google.zxing.qrcode.detector;

import com.google.zxing.NotFoundException;
import p043ch.C13831b;
import p604kh.C18042a;
import p604kh.C18043b;
import p604kh.C18044c;
import p935yg.C20726h;

/* renamed from: com.google.zxing.qrcode.detector.a */
public final class C14647a {

    /* renamed from: a */
    public final C13831b f36926a;

    /* renamed from: b */
    public C20726h f36927b;

    public C14647a(C13831b bVar) {
        this.f36926a = bVar;
    }

    /* renamed from: a */
    public final float mo44175a(C18044c cVar, C18044c cVar2) {
        float e = mo44179e((int) cVar.f52326a, (int) cVar.f52327b, (int) cVar2.f52326a, (int) cVar2.f52327b);
        float e2 = mo44179e((int) cVar2.f52326a, (int) cVar2.f52327b, (int) cVar.f52326a, (int) cVar.f52327b);
        if (Float.isNaN(e)) {
            return e2 / 7.0f;
        }
        if (Float.isNaN(e2)) {
            return e / 7.0f;
        }
        return (e + e2) / 14.0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:146:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0484  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0487  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x04db  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00bf  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.play.core.assetpacks.C14343z0 mo44176b(java.util.Map<com.google.zxing.DecodeHintType, ?> r31) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            if (r1 != 0) goto L_0x0008
            r2 = 0
            goto L_0x0010
        L_0x0008:
            com.google.zxing.DecodeHintType r2 = com.google.zxing.DecodeHintType.NEED_RESULT_POINT_CALLBACK
            java.lang.Object r2 = r1.get(r2)
            yg.h r2 = (p935yg.C20726h) r2
        L_0x0010:
            r0.f36927b = r2
            com.google.zxing.qrcode.detector.FinderPatternFinder r3 = new com.google.zxing.qrcode.detector.FinderPatternFinder
            ch.b r4 = r0.f36926a
            r3.<init>(r4, r2)
            r2 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0027
            com.google.zxing.DecodeHintType r6 = com.google.zxing.DecodeHintType.TRY_HARDER
            boolean r1 = r1.containsKey(r6)
            if (r1 == 0) goto L_0x0027
            r1 = 1
            goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            int r6 = r4.f34028c
            int r4 = r4.f34027b
            int r7 = r6 * 3
            int r7 = r7 / 388
            r8 = 3
            if (r7 < r8) goto L_0x0035
            if (r1 == 0) goto L_0x0036
        L_0x0035:
            r7 = 3
        L_0x0036:
            r1 = 5
            int[] r8 = new int[r1]
            int r9 = r7 + -1
            r10 = 0
        L_0x003c:
            r11 = 4
            r12 = 2
            if (r9 >= r6) goto L_0x0124
            if (r10 != 0) goto L_0x0124
            r13 = 0
        L_0x0043:
            if (r13 >= r1) goto L_0x004a
            r8[r13] = r2
            int r13 = r13 + 1
            goto L_0x0043
        L_0x004a:
            r13 = 0
            r14 = 0
        L_0x004c:
            if (r14 >= r4) goto L_0x010b
            ch.b r15 = r3.f36921a
            boolean r15 = r15.mo40764b(r14, r9)
            if (r15 == 0) goto L_0x0063
            r11 = r13 & 1
            if (r11 != r5) goto L_0x005c
            int r13 = r13 + 1
        L_0x005c:
            r11 = r8[r13]
            int r11 = r11 + r5
            r8[r13] = r11
            goto L_0x0107
        L_0x0063:
            r15 = r13 & 1
            if (r15 != 0) goto L_0x0102
            if (r13 != r11) goto L_0x00fa
            boolean r11 = com.google.zxing.qrcode.detector.FinderPatternFinder.m36751b(r8)
            if (r11 == 0) goto L_0x00e5
            boolean r11 = r3.mo44171c(r8, r9, r14)
            if (r11 == 0) goto L_0x00d2
            boolean r7 = r3.f36923c
            if (r7 == 0) goto L_0x007e
            boolean r10 = r3.mo44172d()
            goto L_0x00c5
        L_0x007e:
            java.util.ArrayList r7 = r3.f36922b
            int r7 = r7.size()
            if (r7 > r5) goto L_0x0087
            goto L_0x00ba
        L_0x0087:
            java.util.ArrayList r7 = r3.f36922b
            java.util.Iterator r7 = r7.iterator()
            r11 = 0
        L_0x008e:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto L_0x00ba
            java.lang.Object r13 = r7.next()
            kh.c r13 = (p604kh.C18044c) r13
            int r15 = r13.f46166d
            if (r15 < r12) goto L_0x008e
            if (r11 != 0) goto L_0x00a2
            r11 = r13
            goto L_0x008e
        L_0x00a2:
            r3.f36923c = r5
            float r7 = r11.f52326a
            float r15 = r13.f52326a
            float r7 = r7 - r15
            float r7 = java.lang.Math.abs(r7)
            float r11 = r11.f52327b
            float r13 = r13.f52327b
            float r11 = r11 - r13
            float r11 = java.lang.Math.abs(r11)
            float r7 = r7 - r11
            int r7 = (int) r7
            int r7 = r7 / r12
            goto L_0x00bb
        L_0x00ba:
            r7 = 0
        L_0x00bb:
            r11 = r8[r12]
            if (r7 <= r11) goto L_0x00c5
            int r7 = r7 - r11
            int r7 = r7 - r12
            int r9 = r9 + r7
            int r7 = r4 + -1
            r14 = r7
        L_0x00c5:
            r7 = 0
        L_0x00c6:
            if (r7 >= r1) goto L_0x00cd
            r8[r7] = r2
            int r7 = r7 + 1
            goto L_0x00c6
        L_0x00cd:
            r7 = 0
            r11 = 2
            r7 = 2
            r13 = 0
            goto L_0x0107
        L_0x00d2:
            r11 = r8[r12]
            r8[r2] = r11
            r11 = 3
            r13 = r8[r11]
            r8[r5] = r13
            r13 = 4
            r15 = r8[r13]
            r8[r12] = r15
            r8[r11] = r5
            r8[r13] = r2
            goto L_0x00f7
        L_0x00e5:
            r11 = 3
            r13 = 4
            r15 = r8[r12]
            r8[r2] = r15
            r15 = r8[r11]
            r8[r5] = r15
            r15 = r8[r13]
            r8[r12] = r15
            r8[r11] = r5
            r8[r13] = r2
        L_0x00f7:
            r11 = 3
            r13 = 3
            goto L_0x0107
        L_0x00fa:
            int r13 = r13 + 1
            r11 = r8[r13]
            int r11 = r11 + r5
            r8[r13] = r11
            goto L_0x0107
        L_0x0102:
            r11 = r8[r13]
            int r11 = r11 + r5
            r8[r13] = r11
        L_0x0107:
            int r14 = r14 + r5
            r11 = 4
            goto L_0x004c
        L_0x010b:
            boolean r11 = com.google.zxing.qrcode.detector.FinderPatternFinder.m36751b(r8)
            if (r11 == 0) goto L_0x0121
            boolean r11 = r3.mo44171c(r8, r9, r4)
            if (r11 == 0) goto L_0x0121
            r7 = r8[r2]
            boolean r11 = r3.f36923c
            if (r11 == 0) goto L_0x0121
            boolean r10 = r3.mo44172d()
        L_0x0121:
            int r9 = r9 + r7
            goto L_0x003c
        L_0x0124:
            java.util.ArrayList r1 = r3.f36922b
            int r1 = r1.size()
            r4 = 3
            if (r1 < r4) goto L_0x0551
            r6 = 0
            if (r1 <= r4) goto L_0x0198
            java.util.ArrayList r4 = r3.f36922b
            java.util.Iterator r4 = r4.iterator()
            r7 = 0
            r8 = 0
        L_0x0138:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x014b
            java.lang.Object r9 = r4.next()
            kh.c r9 = (p604kh.C18044c) r9
            float r9 = r9.f46165c
            float r7 = r7 + r9
            float r9 = r9 * r9
            float r8 = r8 + r9
            goto L_0x0138
        L_0x014b:
            float r1 = (float) r1
            float r7 = r7 / r1
            float r8 = r8 / r1
            float r1 = r7 * r7
            float r8 = r8 - r1
            double r8 = (double) r8
            double r8 = java.lang.Math.sqrt(r8)
            float r1 = (float) r8
            java.util.ArrayList r4 = r3.f36922b
            com.google.zxing.qrcode.detector.FinderPatternFinder$FurthestFromAverageComparator r8 = new com.google.zxing.qrcode.detector.FinderPatternFinder$FurthestFromAverageComparator
            r8.<init>(r7)
            java.util.Collections.sort(r4, r8)
            r4 = 1045220557(0x3e4ccccd, float:0.2)
            float r4 = r4 * r7
            float r1 = java.lang.Math.max(r4, r1)
            r4 = 0
        L_0x016b:
            java.util.ArrayList r8 = r3.f36922b
            int r8 = r8.size()
            if (r4 >= r8) goto L_0x0198
            java.util.ArrayList r8 = r3.f36922b
            int r8 = r8.size()
            r9 = 3
            if (r8 <= r9) goto L_0x0198
            java.util.ArrayList r8 = r3.f36922b
            java.lang.Object r8 = r8.get(r4)
            kh.c r8 = (p604kh.C18044c) r8
            float r8 = r8.f46165c
            float r8 = r8 - r7
            float r8 = java.lang.Math.abs(r8)
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 <= 0) goto L_0x0196
            java.util.ArrayList r8 = r3.f36922b
            r8.remove(r4)
            int r4 = r4 + -1
        L_0x0196:
            int r4 = r4 + r5
            goto L_0x016b
        L_0x0198:
            java.util.ArrayList r1 = r3.f36922b
            int r1 = r1.size()
            r4 = 3
            if (r1 <= r4) goto L_0x01d9
            java.util.ArrayList r1 = r3.f36922b
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
        L_0x01a8:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x01b8
            java.lang.Object r7 = r1.next()
            kh.c r7 = (p604kh.C18044c) r7
            float r7 = r7.f46165c
            float r4 = r4 + r7
            goto L_0x01a8
        L_0x01b8:
            java.util.ArrayList r1 = r3.f36922b
            int r1 = r1.size()
            float r1 = (float) r1
            float r4 = r4 / r1
            java.util.ArrayList r1 = r3.f36922b
            com.google.zxing.qrcode.detector.FinderPatternFinder$CenterComparator r7 = new com.google.zxing.qrcode.detector.FinderPatternFinder$CenterComparator
            r7.<init>(r4)
            java.util.Collections.sort(r1, r7)
            java.util.ArrayList r1 = r3.f36922b
            int r4 = r1.size()
            r7 = 3
            java.util.List r1 = r1.subList(r7, r4)
            r1.clear()
            goto L_0x01da
        L_0x01d9:
            r7 = 3
        L_0x01da:
            kh.c[] r1 = new p604kh.C18044c[r7]
            java.util.ArrayList r4 = r3.f36922b
            java.lang.Object r4 = r4.get(r2)
            kh.c r4 = (p604kh.C18044c) r4
            r1[r2] = r4
            java.util.ArrayList r4 = r3.f36922b
            java.lang.Object r4 = r4.get(r5)
            kh.c r4 = (p604kh.C18044c) r4
            r1[r5] = r4
            java.util.ArrayList r3 = r3.f36922b
            java.lang.Object r3 = r3.get(r12)
            kh.c r3 = (p604kh.C18044c) r3
            r1[r12] = r3
            r3 = r1[r2]
            r4 = r1[r5]
            float r3 = p935yg.C20725g.m48698a(r3, r4)
            r4 = r1[r5]
            r7 = r1[r12]
            float r4 = p935yg.C20725g.m48698a(r4, r7)
            r7 = r1[r2]
            r8 = r1[r12]
            float r7 = p935yg.C20725g.m48698a(r7, r8)
            int r8 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r8 < 0) goto L_0x0221
            int r8 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r8 < 0) goto L_0x0221
            r3 = r1[r2]
            r4 = r1[r5]
            r7 = r1[r12]
            goto L_0x0236
        L_0x0221:
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x0230
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0230
            r3 = r1[r5]
            r4 = r1[r2]
            r7 = r1[r12]
            goto L_0x0236
        L_0x0230:
            r3 = r1[r12]
            r4 = r1[r2]
            r7 = r1[r5]
        L_0x0236:
            float r8 = r3.f52326a
            float r9 = r3.f52327b
            float r10 = r7.f52326a
            float r10 = r10 - r8
            float r11 = r4.f52327b
            float r11 = r11 - r9
            float r11 = r11 * r10
            float r10 = r7.f52327b
            float r10 = r10 - r9
            float r9 = r4.f52326a
            float r9 = r9 - r8
            float r9 = r9 * r10
            float r11 = r11 - r9
            int r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0254
            r29 = r7
            r7 = r4
            r4 = r29
        L_0x0254:
            r1[r2] = r4
            r1[r5] = r3
            r1[r12] = r7
            float r1 = r0.mo44175a(r3, r7)
            float r2 = r0.mo44175a(r3, r4)
            float r2 = r2 + r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r8 < 0) goto L_0x054e
            float r8 = p935yg.C20725g.m48698a(r3, r7)
            float r8 = r8 / r2
            r9 = -1090519040(0xffffffffbf000000, float:-0.5)
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 >= 0) goto L_0x027a
            r10 = -1090519040(0xffffffffbf000000, float:-0.5)
            goto L_0x027c
        L_0x027a:
            r10 = 1056964608(0x3f000000, float:0.5)
        L_0x027c:
            float r8 = r8 + r10
            int r8 = (int) r8
            float r10 = p935yg.C20725g.m48698a(r3, r4)
            float r10 = r10 / r2
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x0288
            goto L_0x028a
        L_0x0288:
            r9 = 1056964608(0x3f000000, float:0.5)
        L_0x028a:
            float r10 = r10 + r9
            int r6 = (int) r10
            int r6 = r6 + r8
            int r6 = r6 / r12
            int r6 = r6 + 7
            r8 = r6 & 3
            if (r8 == 0) goto L_0x02a0
            if (r8 == r12) goto L_0x029d
            r9 = 3
            if (r8 == r9) goto L_0x029a
            goto L_0x02a2
        L_0x029a:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f36909d
            throw r1
        L_0x029d:
            int r6 = r6 + -1
            goto L_0x02a2
        L_0x02a0:
            int r6 = r6 + 1
        L_0x02a2:
            int[] r8 = p580jh.C17851e.f45827e
            int r8 = r6 % 4
            if (r8 != r5) goto L_0x0549
            int r5 = r6 + -17
            int r5 = r5 / 4
            jh.e r5 = p580jh.C17851e.m44235c(r5)     // Catch:{ IllegalArgumentException -> 0x0544 }
            int r8 = r5.f45829a
            r9 = 4
            r10 = 17
            r11 = -7
            int r8 = p379.C16530d.m42021o(r8, r9, r10, r11)
            int[] r5 = r5.f45830b
            int r5 = r5.length
            r9 = 1077936128(0x40400000, float:3.0)
            if (r5 <= 0) goto L_0x02ed
            float r5 = r7.f52326a
            float r10 = r3.f52326a
            float r5 = r5 - r10
            float r11 = r4.f52326a
            float r5 = r5 + r11
            float r11 = r7.f52327b
            float r12 = r3.f52327b
            float r11 = r11 - r12
            float r13 = r4.f52327b
            float r11 = r11 + r13
            float r8 = (float) r8
            float r8 = r9 / r8
            float r1 = r1 - r8
            float r5 = p379.C16759e.m42347c(r5, r10, r1, r10)
            int r5 = (int) r5
            float r1 = p379.C16759e.m42347c(r11, r12, r1, r12)
            int r1 = (int) r1
            r8 = 4
        L_0x02e0:
            r10 = 16
            if (r8 > r10) goto L_0x02ed
            float r10 = (float) r8
            kh.a r1 = r0.mo44177c(r5, r2, r10, r1)     // Catch:{ NotFoundException -> 0x02ea }
            goto L_0x02ee
        L_0x02ea:
            int r8 = r8 << 1
            goto L_0x02e0
        L_0x02ed:
            r1 = 0
        L_0x02ee:
            float r2 = (float) r6
            r5 = 1080033280(0x40600000, float:3.5)
            float r17 = r2 - r5
            if (r1 == 0) goto L_0x02fd
            float r2 = r1.f52326a
            float r5 = r1.f52327b
            float r8 = r17 - r9
            r15 = r8
            goto L_0x030f
        L_0x02fd:
            float r2 = r7.f52326a
            float r5 = r3.f52326a
            float r2 = r2 - r5
            float r5 = r4.f52326a
            float r2 = r2 + r5
            float r5 = r7.f52327b
            float r8 = r3.f52327b
            float r5 = r5 - r8
            float r8 = r4.f52327b
            float r5 = r5 + r8
            r15 = r17
        L_0x030f:
            r10 = 1080033280(0x40600000, float:3.5)
            r11 = 1080033280(0x40600000, float:3.5)
            r16 = 1080033280(0x40600000, float:3.5)
            float r8 = r3.f52326a
            float r9 = r3.f52327b
            float r14 = r7.f52326a
            float r12 = r7.f52327b
            float r13 = r4.f52326a
            r18 = r13
            float r13 = r4.f52327b
            r19 = r12
            r12 = r17
            r20 = r13
            r13 = 1080033280(0x40600000, float:3.5)
            r21 = r14
            r14 = r15
            i1.a r10 = p116i1.C5237a.m13252c(r10, r11, r12, r13, r14, r15, r16, r17)
            float r11 = r10.f17343e
            float r12 = r10.f17347i
            float r13 = r11 * r12
            float r14 = r10.f17344f
            float r15 = r10.f17346h
            float r16 = r14 * r15
            float r16 = r13 - r16
            float r13 = r10.f17345g
            float r17 = r14 * r13
            r31 = r7
            float r7 = r10.f17342d
            float r22 = r7 * r12
            float r17 = r17 - r22
            float r22 = r7 * r15
            float r23 = r11 * r13
            float r22 = r22 - r23
            r23 = r3
            float r3 = r10.f17341c
            float r24 = r3 * r15
            r25 = r4
            float r4 = r10.f17340b
            float r26 = r4 * r12
            float r24 = r24 - r26
            float r10 = r10.f17339a
            float r12 = r12 * r10
            float r26 = r3 * r13
            float r26 = r12 - r26
            float r13 = r13 * r4
            float r15 = r15 * r10
            float r27 = r13 - r15
            float r12 = r4 * r14
            float r13 = r3 * r11
            float r28 = r12 - r13
            float r3 = r3 * r7
            float r14 = r14 * r10
            float r3 = r3 - r14
            float r10 = r10 * r11
            float r4 = r4 * r7
            float r4 = r10 - r4
            r10 = r21
            r11 = r19
            r12 = r2
            r13 = r5
            r14 = r18
            r15 = r20
            i1.a r2 = p116i1.C5237a.m13252c(r8, r9, r10, r11, r12, r13, r14, r15)
            float r5 = r2.f17339a
            float r7 = r5 * r16
            float r8 = r2.f17342d
            float r9 = r8 * r24
            float r9 = r9 + r7
            float r7 = r2.f17345g
            float r10 = r7 * r28
            float r10 = r10 + r9
            float r9 = r5 * r17
            float r11 = r8 * r26
            float r11 = r11 + r9
            float r9 = r7 * r3
            float r9 = r9 + r11
            float r5 = r5 * r22
            float r8 = r8 * r27
            float r8 = r8 + r5
            float r7 = r7 * r4
            float r7 = r7 + r8
            float r5 = r2.f17340b
            float r8 = r5 * r16
            float r11 = r2.f17343e
            float r12 = r11 * r24
            float r12 = r12 + r8
            float r8 = r2.f17346h
            float r13 = r8 * r28
            float r13 = r13 + r12
            float r12 = r5 * r17
            float r14 = r11 * r26
            float r14 = r14 + r12
            float r12 = r8 * r3
            float r12 = r12 + r14
            float r5 = r5 * r22
            float r11 = r11 * r27
            float r11 = r11 + r5
            float r8 = r8 * r4
            float r8 = r8 + r11
            float r5 = r2.f17341c
            float r16 = r16 * r5
            float r11 = r2.f17344f
            float r24 = r24 * r11
            float r24 = r24 + r16
            float r2 = r2.f17347i
            float r28 = r28 * r2
            float r28 = r28 + r24
            float r17 = r17 * r5
            float r26 = r26 * r11
            float r26 = r26 + r17
            float r3 = r3 * r2
            float r3 = r3 + r26
            float r5 = r5 * r22
            float r11 = r11 * r27
            float r11 = r11 + r5
            float r2 = r2 * r4
            float r2 = r2 + r11
            ch.b r4 = r0.f36926a
            if (r6 <= 0) goto L_0x0541
            if (r6 <= 0) goto L_0x0541
            ch.b r5 = new ch.b
            r5.<init>(r6, r6)
            int r11 = r6 * 2
            float[] r14 = new float[r11]
            r15 = 0
        L_0x03fb:
            if (r15 >= r6) goto L_0x051b
            float r0 = (float) r15
            r16 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r16
            r17 = 0
            r18 = r6
            r6 = 0
        L_0x0407:
            if (r6 >= r11) goto L_0x041b
            r17 = r1
            int r1 = r6 / 2
            float r1 = (float) r1
            float r1 = r1 + r16
            r14[r6] = r1
            int r1 = r6 + 1
            r14[r1] = r0
            int r6 = r6 + 2
            r1 = r17
            goto L_0x0407
        L_0x041b:
            r17 = r1
            r0 = 0
        L_0x041e:
            if (r0 >= r11) goto L_0x0449
            r1 = r14[r0]
            int r6 = r0 + 1
            r16 = r14[r6]
            float r19 = r28 * r1
            float r20 = r3 * r16
            float r20 = r20 + r19
            float r20 = r20 + r2
            float r19 = r10 * r1
            float r21 = r9 * r16
            float r21 = r21 + r19
            float r21 = r21 + r7
            float r21 = r21 / r20
            r14[r0] = r21
            float r1 = r1 * r13
            float r16 = r16 * r12
            float r16 = r16 + r1
            float r16 = r16 + r8
            float r16 = r16 / r20
            r14[r6] = r16
            int r0 = r0 + 2
            goto L_0x041e
        L_0x0449:
            int r0 = r4.f34027b
            int r1 = r4.f34028c
            r6 = 0
            r16 = 1
        L_0x0450:
            if (r6 >= r11) goto L_0x049f
            if (r16 == 0) goto L_0x049f
            r16 = r2
            r2 = r14[r6]
            int r2 = (int) r2
            int r19 = r6 + 1
            r20 = r3
            r3 = r14[r19]
            int r3 = (int) r3
            r21 = r7
            r7 = -1
            if (r2 < r7) goto L_0x049c
            if (r2 > r0) goto L_0x049c
            if (r3 < r7) goto L_0x049c
            if (r3 > r1) goto L_0x049c
            if (r2 != r7) goto L_0x0471
            r2 = 0
            r14[r6] = r2
            goto L_0x047b
        L_0x0471:
            r22 = 0
            if (r2 != r0) goto L_0x0481
            int r2 = r0 + -1
            float r2 = (float) r2
            r14[r6] = r2
            r2 = 0
        L_0x047b:
            r22 = 1
            r22 = r2
            r2 = 1
            goto L_0x0482
        L_0x0481:
            r2 = 0
        L_0x0482:
            if (r3 != r7) goto L_0x0487
            r14[r19] = r22
            goto L_0x048e
        L_0x0487:
            if (r3 != r1) goto L_0x048f
            int r2 = r1 + -1
            float r2 = (float) r2
            r14[r19] = r2
        L_0x048e:
            r2 = 1
        L_0x048f:
            int r6 = r6 + 2
            r3 = r20
            r7 = r21
            r29 = r16
            r16 = r2
            r2 = r29
            goto L_0x0450
        L_0x049c:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.f36909d
            throw r0
        L_0x049f:
            r16 = r2
            r20 = r3
            r21 = r7
            int r2 = r11 + -2
            r3 = 1
        L_0x04a8:
            if (r2 < 0) goto L_0x04eb
            if (r3 == 0) goto L_0x04eb
            r3 = r14[r2]
            int r3 = (int) r3
            int r6 = r2 + 1
            r7 = r14[r6]
            int r7 = (int) r7
            r19 = r8
            r8 = -1
            if (r3 < r8) goto L_0x04e8
            if (r3 > r0) goto L_0x04e8
            if (r7 < r8) goto L_0x04e8
            if (r7 > r1) goto L_0x04e8
            if (r3 != r8) goto L_0x04c5
            r3 = 0
            r14[r2] = r3
            goto L_0x04cf
        L_0x04c5:
            r22 = 0
            if (r3 != r0) goto L_0x04d5
            int r3 = r0 + -1
            float r3 = (float) r3
            r14[r2] = r3
            r3 = 0
        L_0x04cf:
            r22 = 1
            r22 = r3
            r3 = 1
            goto L_0x04d6
        L_0x04d5:
            r3 = 0
        L_0x04d6:
            if (r7 != r8) goto L_0x04db
            r14[r6] = r22
            goto L_0x04e2
        L_0x04db:
            if (r7 != r1) goto L_0x04e3
            int r3 = r1 + -1
            float r3 = (float) r3
            r14[r6] = r3
        L_0x04e2:
            r3 = 1
        L_0x04e3:
            int r2 = r2 + -2
            r8 = r19
            goto L_0x04a8
        L_0x04e8:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.f36909d
            throw r0
        L_0x04eb:
            r19 = r8
            r0 = 0
        L_0x04ee:
            if (r0 >= r11) goto L_0x0509
            r1 = r14[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0506 }
            int r1 = (int) r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0506 }
            int r2 = r0 + 1
            r2 = r14[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0506 }
            int r2 = (int) r2     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0506 }
            boolean r1 = r4.mo40764b(r1, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0506 }
            if (r1 == 0) goto L_0x0503
            int r1 = r0 / 2
            r5.mo40765c(r1, r15)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0506 }
        L_0x0503:
            int r0 = r0 + 2
            goto L_0x04ee
        L_0x0506:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.f36909d
            throw r0
        L_0x0509:
            int r15 = r15 + 1
            r0 = r30
            r2 = r16
            r1 = r17
            r6 = r18
            r8 = r19
            r3 = r20
            r7 = r21
            goto L_0x03fb
        L_0x051b:
            r17 = r1
            r0 = 3
            if (r17 != 0) goto L_0x052c
            yg.g[] r0 = new p935yg.C20725g[r0]
            r1 = 0
            r0[r1] = r25
            r1 = 1
            r0[r1] = r23
            r1 = 2
            r0[r1] = r31
            goto L_0x053b
        L_0x052c:
            r1 = 0
            r2 = 1
            r3 = 2
            r4 = 4
            yg.g[] r4 = new p935yg.C20725g[r4]
            r4[r1] = r25
            r4[r2] = r23
            r4[r3] = r31
            r4[r0] = r17
            r0 = r4
        L_0x053b:
            com.google.android.play.core.assetpacks.z0 r1 = new com.google.android.play.core.assetpacks.z0
            r1.<init>((java.lang.Object) r5, (java.lang.Object) r0)
            return r1
        L_0x0541:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.f36909d
            throw r0
        L_0x0544:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.m36739a()
            throw r0
        L_0x0549:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.m36739a()
            throw r0
        L_0x054e:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.f36909d
            throw r0
        L_0x0551:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.f36909d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.detector.C14647a.mo44176b(java.util.Map):com.google.android.play.core.assetpacks.z0");
    }

    /* renamed from: c */
    public final C18042a mo44177c(int i, float f, float f2, int i2) throws NotFoundException {
        int i3;
        C18042a b;
        C18042a b2;
        int i4 = (int) (f2 * f);
        int max = Math.max(0, i - i4);
        int min = Math.min(this.f36926a.f34027b - 1, i + i4) - max;
        float f3 = 3.0f * f;
        if (((float) min) >= f3) {
            int max2 = Math.max(0, i2 - i4);
            int min2 = Math.min(this.f36926a.f34028c - 1, i2 + i4) - max2;
            if (((float) min2) >= f3) {
                C18043b bVar = new C18043b(this.f36926a, max, max2, min, min2, f, this.f36927b);
                int i5 = bVar.f46158c;
                int i6 = bVar.f46161f;
                int i7 = bVar.f46160e + i5;
                int i8 = (i6 / 2) + bVar.f46159d;
                int[] iArr = new int[3];
                for (int i9 = 0; i9 < i6; i9++) {
                    if ((i9 & 1) == 0) {
                        i3 = (i9 + 1) / 2;
                    } else {
                        i3 = -((i9 + 1) / 2);
                    }
                    int i11 = i3 + i8;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    int i12 = i5;
                    while (i12 < i7 && !bVar.f46156a.mo40764b(i12, i11)) {
                        i12++;
                    }
                    int i13 = 0;
                    while (i12 < i7) {
                        if (!bVar.f46156a.mo40764b(i12, i11)) {
                            if (i13 == 1) {
                                i13++;
                            }
                            iArr[i13] = iArr[i13] + 1;
                        } else if (i13 == 1) {
                            iArr[1] = iArr[1] + 1;
                        } else if (i13 != 2) {
                            i13++;
                            iArr[i13] = iArr[i13] + 1;
                        } else if (bVar.mo50517a(iArr) && (b2 = bVar.mo50518b(iArr, i11, i12)) != null) {
                            return b2;
                        } else {
                            iArr[0] = iArr[2];
                            iArr[1] = 1;
                            iArr[2] = 0;
                            i13 = 1;
                        }
                        i12++;
                    }
                    if (bVar.mo50517a(iArr) && (b = bVar.mo50518b(iArr, i11, i7)) != null) {
                        return b;
                    }
                }
                if (!bVar.f46157b.isEmpty()) {
                    return (C18042a) bVar.f46157b.get(0);
                }
                throw NotFoundException.f36909d;
            }
            throw NotFoundException.f36909d;
        }
        throw NotFoundException.f36909d;
    }

    /* renamed from: d */
    public final float mo44178d(int i, int i2, int i3, int i4) {
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z2;
        C14647a aVar;
        int i15 = 1;
        if (Math.abs(i4 - i2) > Math.abs(i3 - i)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i7 = i;
            i8 = i2;
            i5 = i3;
            i6 = i4;
        } else {
            i8 = i;
            i7 = i2;
            i6 = i3;
            i5 = i4;
        }
        int abs = Math.abs(i6 - i8);
        int i16 = i5 - i7;
        int abs2 = Math.abs(i16);
        int i17 = (-abs) / 2;
        int i18 = -1;
        if (i8 < i6) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        if (i7 < i5) {
            i18 = 1;
        }
        int i19 = i6 + i9;
        int i21 = i8;
        int i22 = i7;
        int i23 = 0;
        while (true) {
            if (i21 == i19) {
                i11 = i19;
                i12 = i16;
                break;
            }
            if (z) {
                i13 = i22;
            } else {
                i13 = i21;
            }
            boolean z3 = z;
            if (z) {
                i14 = i21;
            } else {
                i14 = i22;
            }
            if (i23 == i15) {
                aVar = this;
                i11 = i19;
                i12 = i16;
                z2 = true;
            } else {
                aVar = this;
                i11 = i19;
                i12 = i16;
                z2 = false;
            }
            if (z2 == aVar.f36926a.mo40764b(i13, i14)) {
                if (i23 == 2) {
                    int i24 = i21 - i8;
                    int i25 = i22 - i7;
                    return (float) Math.sqrt((double) ((i25 * i25) + (i24 * i24)));
                }
                i23++;
            }
            i17 += abs2;
            if (i17 > 0) {
                if (i22 == i5) {
                    break;
                }
                i22 += i18;
                i17 -= abs;
            }
            i21 += i9;
            i16 = i12;
            i19 = i11;
            z = z3;
            i15 = 1;
        }
        if (i23 != 2) {
            return Float.NaN;
        }
        int i26 = i11 - i8;
        return (float) Math.sqrt((double) ((i12 * i12) + (i26 * i26)));
    }

    /* renamed from: e */
    public final float mo44179e(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float d = mo44178d(i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = ((float) i) / ((float) (i - i5));
            i5 = 0;
        } else {
            int i7 = this.f36926a.f34027b;
            if (i5 >= i7) {
                int i8 = i7 - 1;
                f = ((float) ((i7 - 1) - i)) / ((float) (i5 - i));
                i5 = i8;
            } else {
                f = 1.0f;
            }
        }
        float f3 = (float) i2;
        int i9 = (int) (f3 - (((float) (i4 - i2)) * f));
        if (i9 < 0) {
            f2 = f3 / ((float) (i2 - i9));
        } else {
            int i11 = this.f36926a.f34028c;
            if (i9 >= i11) {
                f2 = ((float) ((i11 - 1) - i2)) / ((float) (i9 - i2));
                i6 = i11 - 1;
            } else {
                i6 = i9;
                f2 = 1.0f;
            }
        }
        return (mo44178d(i, i2, (int) ((((float) (i5 - i)) * f2) + ((float) i)), i6) + d) - 1.0f;
    }
}
