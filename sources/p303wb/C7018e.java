package p303wb;

/* renamed from: wb.e */
public final class C7018e {
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01c4 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<p303wb.C7015d.C7016a> m16511a(p277ub.C6803r r27) {
        /*
            r0 = r27
            int r1 = r27.mo22997p()
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            r1 = 7
            r0.mo22981A(r1)
            int r3 = r27.mo22984c()
            r4 = 1684433976(0x64666c38, float:1.7002196E22)
            r5 = 1
            if (r3 != r4) goto L_0x0037
            ub.r r3 = new ub.r
            r3.<init>()
            java.util.zip.Inflater r4 = new java.util.zip.Inflater
            r4.<init>(r5)
            boolean r0 = p277ub.C6774a0.m15962v(r0, r3, r4)     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x002c
            r4.end()
            return r2
        L_0x002c:
            r4.end()
            r0 = r3
            goto L_0x003d
        L_0x0031:
            r0 = move-exception
            r1 = r0
            r4.end()
            throw r1
        L_0x0037:
            r4 = 1918990112(0x72617720, float:4.465801E30)
            if (r3 == r4) goto L_0x003d
            return r2
        L_0x003d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r0.f21039b
            int r6 = r0.f21040c
        L_0x0046:
            if (r4 >= r6) goto L_0x01c6
            int r7 = r0.mo22984c()
            int r7 = r7 + r4
            if (r7 <= r4) goto L_0x01c4
            if (r7 <= r6) goto L_0x0053
            goto L_0x01c4
        L_0x0053:
            int r4 = r0.mo22984c()
            r8 = 1835365224(0x6d657368, float:4.438224E27)
            if (r4 != r8) goto L_0x01b3
            int r4 = r0.mo22984c()
            r8 = 10000(0x2710, float:1.4013E-41)
            if (r4 <= r8) goto L_0x0065
            goto L_0x007f
        L_0x0065:
            float[] r8 = new float[r4]
            r10 = 0
        L_0x0068:
            if (r10 >= r4) goto L_0x0077
            int r11 = r0.mo22984c()
            float r11 = java.lang.Float.intBitsToFloat(r11)
            r8[r10] = r11
            int r10 = r10 + 1
            goto L_0x0068
        L_0x0077:
            int r10 = r0.mo22984c()
            r11 = 32000(0x7d00, float:4.4842E-41)
            if (r10 <= r11) goto L_0x0087
        L_0x007f:
            r27 = r3
        L_0x0081:
            r19 = r6
        L_0x0083:
            r20 = 1
            goto L_0x0184
        L_0x0087:
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r13 = java.lang.Math.log(r11)
            r27 = r3
            double r2 = (double) r4
            double r2 = r2 * r11
            double r2 = java.lang.Math.log(r2)
            double r2 = r2 / r13
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            ub.q r3 = new ub.q
            byte[] r9 = r0.f21038a
            int r15 = r9.length
            r3.<init>(r9, r15)
            int r9 = r0.f21039b
            r15 = 8
            int r9 = r9 * 8
            r3.mo22977j(r9)
            int r9 = r10 * 5
            float[] r9 = new float[r9]
            r11 = 5
            int[] r12 = new int[r11]
            r1 = 0
            r18 = 0
        L_0x00b7:
            if (r1 >= r10) goto L_0x00e4
            r15 = 0
        L_0x00ba:
            if (r15 >= r11) goto L_0x00de
            r19 = r12[r15]
            int r20 = r3.mo22973f(r2)
            int r21 = r20 >> 1
            r11 = r20 & 1
            int r11 = -r11
            r11 = r11 ^ r21
            int r11 = r11 + r19
            if (r11 >= r4) goto L_0x0081
            if (r11 >= 0) goto L_0x00d0
            goto L_0x0112
        L_0x00d0:
            int r19 = r18 + 1
            r20 = r8[r11]
            r9[r18] = r20
            r12[r15] = r11
            int r15 = r15 + 1
            r18 = r19
            r11 = 5
            goto L_0x00ba
        L_0x00de:
            int r1 = r1 + 1
            r11 = 5
            r15 = 8
            goto L_0x00b7
        L_0x00e4:
            int r1 = r3.f21035b
            r2 = 8
            int r1 = r1 * 8
            int r2 = r3.f21036c
            int r1 = r1 + r2
            r2 = 7
            int r1 = r1 + r2
            r1 = r1 & -8
            r3.mo22977j(r1)
            r1 = 32
            int r4 = r3.mo22973f(r1)
            wb.d$b[] r8 = new p303wb.C7015d.C7017b[r4]
            r11 = 0
        L_0x00fd:
            if (r11 >= r4) goto L_0x01a1
            r12 = 8
            int r15 = r3.mo22973f(r12)
            int r2 = r3.mo22973f(r12)
            int r12 = r3.mo22973f(r1)
            r1 = 128000(0x1f400, float:1.79366E-40)
            if (r12 <= r1) goto L_0x0114
        L_0x0112:
            goto L_0x0081
        L_0x0114:
            r19 = r6
            double r5 = (double) r10
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r5 = r5 * r16
            double r5 = java.lang.Math.log(r5)
            double r5 = r5 / r13
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            int r6 = r12 * 3
            float[] r6 = new float[r6]
            int r1 = r12 * 2
            float[] r1 = new float[r1]
            r21 = r1
            r1 = 0
            r22 = 0
        L_0x0132:
            if (r1 >= r12) goto L_0x0186
            int r23 = r3.mo22973f(r5)
            int r24 = r23 >> 1
            r25 = r3
            r20 = 1
            r3 = r23 & 1
            r23 = r4
            r4 = r21
            int r3 = -r3
            r3 = r3 ^ r24
            int r3 = r3 + r22
            if (r3 < 0) goto L_0x0083
            if (r3 < r10) goto L_0x014f
            goto L_0x0083
        L_0x014f:
            int r21 = r1 * 3
            int r22 = r3 * 5
            r24 = r9[r22]
            r6[r21] = r24
            int r24 = r21 + 1
            int r26 = r22 + 1
            r26 = r9[r26]
            r6[r24] = r26
            int r21 = r21 + 2
            int r24 = r22 + 2
            r24 = r9[r24]
            r6[r21] = r24
            int r21 = r1 * 2
            int r24 = r22 + 3
            r24 = r9[r24]
            r4[r21] = r24
            r20 = 1
            int r21 = r21 + 1
            int r22 = r22 + 4
            r22 = r9[r22]
            r4[r21] = r22
            int r1 = r1 + 1
            r22 = r3
            r21 = r4
            r4 = r23
            r3 = r25
            goto L_0x0132
        L_0x0184:
            r1 = 0
            goto L_0x01aa
        L_0x0186:
            r25 = r3
            r23 = r4
            r4 = r21
            r20 = 1
            wb.d$b r1 = new wb.d$b
            r1.<init>(r15, r6, r4, r2)
            r8[r11] = r1
            int r11 = r11 + 1
            r6 = r19
            r4 = r23
            r1 = 32
            r2 = 7
            r5 = 1
            goto L_0x00fd
        L_0x01a1:
            r19 = r6
            r20 = 1
            wb.d$a r1 = new wb.d$a
            r1.<init>(r8)
        L_0x01aa:
            if (r1 != 0) goto L_0x01ad
            goto L_0x01c4
        L_0x01ad:
            r2 = r27
            r2.add(r1)
            goto L_0x01b8
        L_0x01b3:
            r2 = r3
            r19 = r6
            r20 = 1
        L_0x01b8:
            r0.mo23007z(r7)
            r3 = r2
            r4 = r7
            r6 = r19
            r1 = 7
            r2 = 0
            r5 = 1
            goto L_0x0046
        L_0x01c4:
            r2 = 0
            goto L_0x01c7
        L_0x01c6:
            r2 = r3
        L_0x01c7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p303wb.C7018e.m16511a(ub.r):java.util.ArrayList");
    }
}
