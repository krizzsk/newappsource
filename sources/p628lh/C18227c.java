package p628lh;

import androidx.recyclerview.widget.RecyclerView;
import com.google.zxing.WriterException;
import p043ch.C13832c;

/* renamed from: lh.c */
public final class C18227c {

    /* renamed from: a */
    public static final int[][] f46503a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b */
    public static final int[][] f46504b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c */
    public static final int[][] f46505c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, RecyclerView.C1119a0.FLAG_IGNORE, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d */
    public static final int[][] f46506d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0230, code lost:
        r16 = r16 & 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0233, code lost:
        if (r16 != 0) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0235, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0238, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x023a, code lost:
        if (r16 == false) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x023c, code lost:
        r13 = !r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x020d, code lost:
        r15 = r15 + r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0225, code lost:
        r16 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x022e, code lost:
        r16 = r15;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m44954a(p043ch.C13830a r20, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel r21, p580jh.C17851e r22, int r23, p043ch.C13832c r24) throws com.google.zxing.WriterException {
        /*
            r0 = r20
            r1 = r22
            r2 = r23
            r3 = r24
            java.lang.Object r4 = r3.f34034d
            byte[][] r4 = (byte[][]) r4
            int r5 = r4.length
            r6 = 0
            r7 = 0
        L_0x000f:
            r8 = -1
            if (r7 >= r5) goto L_0x001a
            r9 = r4[r7]
            java.util.Arrays.fill(r9, r8)
            int r7 = r7 + 1
            goto L_0x000f
        L_0x001a:
            int[][] r4 = f46503a
            r4 = r4[r6]
            int r4 = r4.length
            m44957d(r6, r6, r3)
            int r5 = r3.f34032b
            int r5 = r5 - r4
            m44957d(r5, r6, r3)
            int r5 = r3.f34032b
            int r5 = r5 - r4
            m44957d(r6, r5, r3)
            r4 = 7
            m44956c(r6, r4, r3)
            int r5 = r3.f34032b
            int r5 = r5 + -8
            m44956c(r5, r4, r3)
            int r5 = r3.f34032b
            int r5 = r5 + -8
            m44956c(r6, r5, r3)
            m44958e(r4, r6, r3)
            int r5 = r3.f34033c
            int r5 = r5 - r4
            int r5 = r5 + r8
            m44958e(r5, r6, r3)
            int r5 = r3.f34033c
            int r5 = r5 - r4
            m44958e(r4, r5, r3)
            int r5 = r3.f34033c
            r7 = 8
            int r5 = r5 - r7
            byte r5 = r3.mo40772b(r7, r5)
            if (r5 == 0) goto L_0x02b2
            int r5 = r3.f34033c
            int r5 = r5 - r7
            r9 = 1
            r3.mo40774d(r7, r5, r9)
            int r5 = r1.f45829a
            r10 = 5
            r11 = 2
            if (r5 >= r11) goto L_0x0069
            goto L_0x00c3
        L_0x0069:
            int r5 = r5 + r8
            int[][] r12 = f46505c
            r5 = r12[r5]
            int r12 = r5.length
            r13 = 0
        L_0x0070:
            if (r13 >= r12) goto L_0x00c3
            r14 = r5[r13]
            if (r14 < 0) goto L_0x00b8
            int r15 = r5.length
            r8 = 0
        L_0x0078:
            if (r8 >= r15) goto L_0x00b8
            r11 = r5[r8]
            if (r11 < 0) goto L_0x00ae
            byte r18 = r3.mo40772b(r11, r14)
            boolean r18 = m44959f(r18)
            if (r18 == 0) goto L_0x00ae
            int r11 = r11 + -2
            int r18 = r14 + -2
            r4 = 0
        L_0x008d:
            if (r4 >= r10) goto L_0x00ae
            int[][] r19 = f46504b
            r19 = r19[r4]
            r9 = 0
        L_0x0094:
            if (r9 >= r10) goto L_0x00a6
            int r6 = r11 + r9
            int r10 = r18 + r4
            r7 = r19[r9]
            r3.mo40774d(r6, r10, r7)
            int r9 = r9 + 1
            r6 = 0
            r7 = 8
            r10 = 5
            goto L_0x0094
        L_0x00a6:
            int r4 = r4 + 1
            r6 = 0
            r7 = 8
            r9 = 1
            r10 = 5
            goto L_0x008d
        L_0x00ae:
            int r8 = r8 + 1
            r4 = 7
            r6 = 0
            r7 = 8
            r9 = 1
            r10 = 5
            r11 = 2
            goto L_0x0078
        L_0x00b8:
            int r13 = r13 + 1
            r4 = 7
            r6 = 0
            r7 = 8
            r8 = -1
            r9 = 1
            r10 = 5
            r11 = 2
            goto L_0x0070
        L_0x00c3:
            r4 = 8
        L_0x00c5:
            int r5 = r3.f34032b
            r6 = 8
            int r5 = r5 - r6
            r6 = 6
            if (r4 >= r5) goto L_0x00ed
            int r5 = r4 + 1
            int r7 = r5 % 2
            byte r8 = r3.mo40772b(r4, r6)
            boolean r8 = m44959f(r8)
            if (r8 == 0) goto L_0x00de
            r3.mo40774d(r4, r6, r7)
        L_0x00de:
            byte r8 = r3.mo40772b(r6, r4)
            boolean r8 = m44959f(r8)
            if (r8 == 0) goto L_0x00eb
            r3.mo40774d(r6, r4, r7)
        L_0x00eb:
            r4 = r5
            goto L_0x00c5
        L_0x00ed:
            ch.a r4 = new ch.a
            r4.<init>()
            if (r2 < 0) goto L_0x00fa
            r5 = 8
            if (r2 >= r5) goto L_0x00fa
            r5 = 1
            goto L_0x00fb
        L_0x00fa:
            r5 = 0
        L_0x00fb:
            if (r5 == 0) goto L_0x02aa
            int r5 = r21.getBits()
            r7 = 3
            int r5 = r5 << r7
            r5 = r5 | r2
            r8 = 5
            r4.mo40756b(r5, r8)
            r8 = 1335(0x537, float:1.871E-42)
            int r5 = m44955b(r5, r8)
            r8 = 10
            r4.mo40756b(r5, r8)
            ch.a r5 = new ch.a
            r5.<init>()
            r8 = 21522(0x5412, float:3.0159E-41)
            r9 = 15
            r5.mo40756b(r8, r9)
            int r8 = r4.f34026c
            int r10 = r5.f34026c
            if (r8 != r10) goto L_0x02a2
            r8 = 0
        L_0x0126:
            int[] r10 = r4.f34025b
            int r11 = r10.length
            if (r8 >= r11) goto L_0x0137
            r11 = r10[r8]
            int[] r12 = r5.f34025b
            r12 = r12[r8]
            r11 = r11 ^ r12
            r10[r8] = r11
            int r8 = r8 + 1
            goto L_0x0126
        L_0x0137:
            int r5 = r4.f34026c
            java.lang.String r8 = "should not happen but we got: "
            if (r5 != r9) goto L_0x028e
            r5 = 0
        L_0x013e:
            int r9 = r4.f34026c
            if (r5 >= r9) goto L_0x016f
            int r9 = r9 + -1
            int r9 = r9 - r5
            boolean r9 = r4.mo40759d(r9)
            int[][] r10 = f46506d
            r10 = r10[r5]
            r11 = 0
            r12 = r10[r11]
            r13 = 1
            r10 = r10[r13]
            r3.mo40775e(r12, r10, r9)
            r10 = 8
            if (r5 >= r10) goto L_0x0162
            int r12 = r3.f34032b
            int r12 = r12 - r5
            int r12 = r12 - r13
            r3.mo40775e(r12, r10, r9)
            goto L_0x016c
        L_0x0162:
            int r12 = r3.f34033c
            int r12 = r12 + -7
            int r13 = r5 + -8
            int r13 = r13 + r12
            r3.mo40775e(r10, r13, r9)
        L_0x016c:
            int r5 = r5 + 1
            goto L_0x013e
        L_0x016f:
            r11 = 0
            int r4 = r1.f45829a
            r5 = 7
            if (r4 >= r5) goto L_0x0176
            goto L_0x01b7
        L_0x0176:
            ch.a r4 = new ch.a
            r4.<init>()
            int r5 = r1.f45829a
            r4.mo40756b(r5, r6)
            int r1 = r1.f45829a
            r5 = 7973(0x1f25, float:1.1173E-41)
            int r1 = m44955b(r1, r5)
            r5 = 12
            r4.mo40756b(r1, r5)
            int r1 = r4.f34026c
            r5 = 18
            if (r1 != r5) goto L_0x027a
            r1 = 17
            r5 = 0
        L_0x0196:
            if (r5 >= r6) goto L_0x01b7
            r8 = 0
        L_0x0199:
            if (r8 >= r7) goto L_0x01b4
            boolean r9 = r4.mo40759d(r1)
            int r1 = r1 + -1
            int r10 = r3.f34033c
            int r10 = r10 + -11
            int r10 = r10 + r8
            r3.mo40775e(r5, r10, r9)
            int r10 = r3.f34033c
            int r10 = r10 + -11
            int r10 = r10 + r8
            r3.mo40775e(r10, r5, r9)
            int r8 = r8 + 1
            goto L_0x0199
        L_0x01b4:
            int r5 = r5 + 1
            goto L_0x0196
        L_0x01b7:
            int r1 = r3.f34032b
            r4 = 1
            int r1 = r1 - r4
            int r5 = r3.f34033c
            int r5 = r5 - r4
            r4 = 0
            r8 = -1
        L_0x01c0:
            if (r1 <= 0) goto L_0x0257
            if (r1 != r6) goto L_0x01c6
            int r1 = r1 + -1
        L_0x01c6:
            if (r5 < 0) goto L_0x024e
            int r9 = r3.f34033c
            if (r5 >= r9) goto L_0x024e
            r9 = 0
            r10 = 2
        L_0x01ce:
            if (r9 >= r10) goto L_0x0249
            int r12 = r1 - r9
            byte r13 = r3.mo40772b(r12, r5)
            boolean r13 = m44959f(r13)
            if (r13 == 0) goto L_0x0244
            int r13 = r0.f34026c
            if (r4 >= r13) goto L_0x01e7
            boolean r13 = r0.mo40759d(r4)
            int r4 = r4 + 1
            goto L_0x01e8
        L_0x01e7:
            r13 = 0
        L_0x01e8:
            r14 = -1
            if (r2 == r14) goto L_0x023f
            switch(r2) {
                case 0: goto L_0x022c;
                case 1: goto L_0x0229;
                case 2: goto L_0x0223;
                case 3: goto L_0x021f;
                case 4: goto L_0x0218;
                case 5: goto L_0x0210;
                case 6: goto L_0x0208;
                case 7: goto L_0x01fe;
                default: goto L_0x01ee;
            }
        L_0x01ee:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r23)
            java.lang.String r2 = "Invalid mask pattern: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x01fe:
            int r15 = r5 * r12
            int r15 = r15 % r7
            int r16 = r5 + r12
            r17 = 1
            r16 = r16 & 1
            goto L_0x020d
        L_0x0208:
            int r15 = r5 * r12
            r16 = r15 & 1
            int r15 = r15 % r7
        L_0x020d:
            int r15 = r15 + r16
            goto L_0x022e
        L_0x0210:
            int r15 = r5 * r12
            r16 = r15 & 1
            int r15 = r15 % r7
            int r15 = r15 + r16
            goto L_0x0225
        L_0x0218:
            int r15 = r5 / 2
            int r16 = r12 / 3
            int r15 = r16 + r15
            goto L_0x022e
        L_0x021f:
            int r15 = r5 + r12
            int r15 = r15 % r7
            goto L_0x0225
        L_0x0223:
            int r15 = r12 % 3
        L_0x0225:
            r16 = r15
            r15 = 1
            goto L_0x0233
        L_0x0229:
            r16 = r5
            goto L_0x0230
        L_0x022c:
            int r15 = r5 + r12
        L_0x022e:
            r16 = r15
        L_0x0230:
            r15 = 1
            r16 = r16 & 1
        L_0x0233:
            if (r16 != 0) goto L_0x0238
            r16 = 1
            goto L_0x023a
        L_0x0238:
            r16 = 0
        L_0x023a:
            if (r16 == 0) goto L_0x0240
            r13 = r13 ^ 1
            goto L_0x0240
        L_0x023f:
            r15 = 1
        L_0x0240:
            r3.mo40775e(r12, r5, r13)
            goto L_0x0246
        L_0x0244:
            r14 = -1
            r15 = 1
        L_0x0246:
            int r9 = r9 + 1
            goto L_0x01ce
        L_0x0249:
            r14 = -1
            r15 = 1
            int r5 = r5 + r8
            goto L_0x01c6
        L_0x024e:
            r10 = 2
            r14 = -1
            r15 = 1
            int r8 = -r8
            int r5 = r5 + r8
            int r1 = r1 + -2
            goto L_0x01c0
        L_0x0257:
            int r1 = r0.f34026c
            if (r4 != r1) goto L_0x025c
            return
        L_0x025c:
            com.google.zxing.WriterException r1 = new com.google.zxing.WriterException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Not all bits consumed: "
            r2.<init>(r3)
            r2.append(r4)
            r3 = 47
            r2.append(r3)
            int r0 = r0.f34026c
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x027a:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r8)
            int r2 = r4.f34026c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x028e:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r8)
            int r2 = r4.f34026c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x02a2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Sizes don't match"
            r0.<init>(r1)
            throw r0
        L_0x02aa:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.String r1 = "Invalid mask pattern"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x02b2:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p628lh.C18227c.m44954a(ch.a, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel, jh.e, int, ch.c):void");
    }

    /* renamed from: b */
    public static int m44955b(int i, int i2) {
        if (i2 != 0) {
            int numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(i2);
            int i3 = i << (numberOfLeadingZeros - 1);
            while (32 - Integer.numberOfLeadingZeros(i3) >= numberOfLeadingZeros) {
                i3 ^= i2 << ((32 - Integer.numberOfLeadingZeros(i3)) - numberOfLeadingZeros);
            }
            return i3;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    /* renamed from: c */
    public static void m44956c(int i, int i2, C13832c cVar) throws WriterException {
        int i3 = 0;
        while (i3 < 8) {
            int i4 = i + i3;
            if (m44959f(cVar.mo40772b(i4, i2))) {
                cVar.mo40774d(i4, i2, 0);
                i3++;
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: d */
    public static void m44957d(int i, int i2, C13832c cVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = f46503a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                cVar.mo40774d(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* renamed from: e */
    public static void m44958e(int i, int i2, C13832c cVar) throws WriterException {
        int i3 = 0;
        while (i3 < 7) {
            int i4 = i2 + i3;
            if (m44959f(cVar.mo40772b(i, i4))) {
                cVar.mo40774d(i, i4, 0);
                i3++;
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: f */
    public static boolean m44959f(int i) {
        return i == -1;
    }
}
