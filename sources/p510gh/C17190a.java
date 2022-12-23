package p510gh;

import java.lang.reflect.Array;
import p043ch.C13831b;
import p935yg.C20727i;

/* renamed from: gh.a */
public final class C17190a implements C20727i {
    /* renamed from: a */
    public static C13831b m43180a(byte[][] bArr, int i) {
        int i2 = i * 2;
        int length = bArr.length + i2;
        C13831b bVar = new C13831b(bArr[0].length + i2, length);
        int length2 = bVar.f34030e.length;
        for (int i3 = 0; i3 < length2; i3++) {
            bVar.f34030e[i3] = 0;
        }
        int i4 = (length - i) - 1;
        int i5 = 0;
        while (i5 < bArr.length) {
            byte[] bArr2 = bArr[i5];
            for (int i6 = 0; i6 < bArr[0].length; i6++) {
                if (bArr2[i6] == 1) {
                    bVar.mo40765c(i6 + i, i4);
                }
            }
            i5++;
            i4--;
        }
        return bVar;
    }

    /* renamed from: b */
    public static byte[][] m43181b(byte[][] bArr) {
        int length = bArr[0].length;
        int[] iArr = new int[2];
        iArr[1] = bArr.length;
        iArr[0] = length;
        byte[][] bArr2 = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        for (int i = 0; i < bArr.length; i++) {
            int length2 = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length2] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0394: MOVE  (r11v1 int) = (r18v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0453 A[LOOP:13: B:219:0x0451->B:220:0x0453, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0477  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0501  */
    /* renamed from: i */
    public final p043ch.C13831b mo22696i(java.lang.String r22, com.google.zxing.BarcodeFormat r23, int r24, int r25, java.util.Map<com.google.zxing.EncodeHintType, ?> r26) throws com.google.zxing.WriterException {
        /*
            r21 = this;
            r0 = r22
            r1 = r24
            r2 = r25
            r3 = r26
            com.google.zxing.BarcodeFormat r4 = com.google.zxing.BarcodeFormat.PDF_417
            r5 = r23
            if (r5 != r4) goto L_0x0510
            com.google.zxing.pdf417.encoder.Compaction r4 = com.google.zxing.pdf417.encoder.Compaction.AUTO
            if (r3 == 0) goto L_0x00a0
            com.google.zxing.EncodeHintType r5 = com.google.zxing.EncodeHintType.PDF417_COMPACT
            boolean r6 = r3.containsKey(r5)
            if (r6 == 0) goto L_0x002b
            java.lang.Object r5 = r3.get(r5)
            java.lang.String r5 = r5.toString()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            boolean r5 = r5.booleanValue()
            goto L_0x002c
        L_0x002b:
            r5 = 0
        L_0x002c:
            com.google.zxing.EncodeHintType r6 = com.google.zxing.EncodeHintType.PDF417_COMPACTION
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L_0x0040
            java.lang.Object r4 = r3.get(r6)
            java.lang.String r4 = r4.toString()
            com.google.zxing.pdf417.encoder.Compaction r4 = com.google.zxing.pdf417.encoder.Compaction.valueOf(r4)
        L_0x0040:
            com.google.zxing.EncodeHintType r6 = com.google.zxing.EncodeHintType.PDF417_DIMENSIONS
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L_0x0056
            java.lang.Object r6 = r3.get(r6)
            hh.b r6 = (p534hh.C17434b) r6
            r6.getClass()
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            goto L_0x005c
        L_0x0056:
            r6 = 2
            r7 = 30
            r8 = 2
            r9 = 30
        L_0x005c:
            com.google.zxing.EncodeHintType r10 = com.google.zxing.EncodeHintType.MARGIN
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x0071
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = r10.toString()
            int r10 = java.lang.Integer.parseInt(r10)
            goto L_0x0073
        L_0x0071:
            r10 = 30
        L_0x0073:
            com.google.zxing.EncodeHintType r11 = com.google.zxing.EncodeHintType.ERROR_CORRECTION
            boolean r12 = r3.containsKey(r11)
            if (r12 == 0) goto L_0x0088
            java.lang.Object r11 = r3.get(r11)
            java.lang.String r11 = r11.toString()
            int r11 = java.lang.Integer.parseInt(r11)
            goto L_0x0089
        L_0x0088:
            r11 = 2
        L_0x0089:
            com.google.zxing.EncodeHintType r12 = com.google.zxing.EncodeHintType.CHARACTER_SET
            boolean r13 = r3.containsKey(r12)
            if (r13 == 0) goto L_0x009e
            java.lang.Object r3 = r3.get(r12)
            java.lang.String r3 = r3.toString()
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)
            goto L_0x00ab
        L_0x009e:
            r3 = 0
            goto L_0x00ab
        L_0x00a0:
            r3 = 0
            r5 = 0
            r6 = 2
            r7 = 30
            r8 = 2
            r9 = 30
            r10 = 30
            r11 = 2
        L_0x00ab:
            java.lang.String r12 = "Error correction level must be between 0 and 8!"
            if (r11 < 0) goto L_0x0509
            r13 = 8
            if (r11 > r13) goto L_0x0509
            int r13 = r11 + 1
            r14 = 1
            int r13 = r14 << r13
            byte[] r14 = p534hh.C17435c.f44904a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            int r15 = r22.length()
            r14.<init>(r15)
            if (r3 != 0) goto L_0x00c8
            java.nio.charset.Charset r3 = p534hh.C17435c.f44908e
            goto L_0x0130
        L_0x00c8:
            java.nio.charset.Charset r15 = p534hh.C17435c.f44908e
            boolean r15 = r15.equals(r3)
            if (r15 != 0) goto L_0x012c
            java.lang.String r15 = r3.name()
            com.google.zxing.common.CharacterSetECI r15 = com.google.zxing.common.CharacterSetECI.getCharacterSetECIByName(r15)
            if (r15 == 0) goto L_0x012c
            int r15 = r15.getValue()
            r23 = r3
            if (r15 < 0) goto L_0x00f0
            r3 = 900(0x384, float:1.261E-42)
            if (r15 >= r3) goto L_0x00f0
            r3 = 927(0x39f, float:1.299E-42)
            r14.append(r3)
            char r3 = (char) r15
            r14.append(r3)
            goto L_0x012e
        L_0x00f0:
            r3 = 810900(0xc5f94, float:1.136313E-39)
            if (r15 >= r3) goto L_0x0109
            r3 = 926(0x39e, float:1.298E-42)
            r14.append(r3)
            int r3 = r15 / 900
            int r3 = r3 + -1
            char r3 = (char) r3
            r14.append(r3)
            int r15 = r15 % 900
            char r3 = (char) r15
            r14.append(r3)
            goto L_0x012e
        L_0x0109:
            r3 = 811800(0xc6318, float:1.137574E-39)
            if (r15 >= r3) goto L_0x011c
            r3 = 925(0x39d, float:1.296E-42)
            r14.append(r3)
            r3 = 810900(0xc5f94, float:1.136313E-39)
            int r3 = r3 - r15
            char r3 = (char) r3
            r14.append(r3)
            goto L_0x012e
        L_0x011c:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.String r1 = java.lang.String.valueOf(r15)
            java.lang.String r2 = "ECI number not in valid range from 0..811799, but was "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x012c:
            r23 = r3
        L_0x012e:
            r3 = r23
        L_0x0130:
            int r15 = r22.length()
            int[] r16 = p534hh.C17435c.C17436a.f44909a
            int r4 = r4.ordinal()
            r4 = r16[r4]
            r23 = r12
            r12 = 1
            if (r4 == r12) goto L_0x02dd
            r12 = 2
            if (r4 == r12) goto L_0x02cb
            r12 = 3
            if (r4 == r12) goto L_0x02b9
            r4 = 0
            r12 = 0
        L_0x0149:
            r16 = 0
        L_0x014b:
            if (r4 >= r15) goto L_0x02b0
            r26 = r10
            int r10 = r22.length()
            r17 = 48
            if (r4 >= r10) goto L_0x0182
            char r18 = r0.charAt(r4)
            r19 = 0
            r17 = r5
            r2 = r18
            r1 = 48
            r5 = r4
        L_0x0164:
            if (r2 < r1) goto L_0x016c
            r1 = 57
            if (r2 > r1) goto L_0x016c
            r1 = 1
            goto L_0x016d
        L_0x016c:
            r1 = 0
        L_0x016d:
            if (r1 == 0) goto L_0x017f
            if (r5 >= r10) goto L_0x017f
            int r19 = r19 + 1
            int r5 = r5 + 1
            if (r5 >= r10) goto L_0x017c
            char r1 = r0.charAt(r5)
            r2 = r1
        L_0x017c:
            r1 = 48
            goto L_0x0164
        L_0x017f:
            r1 = r19
            goto L_0x0187
        L_0x0182:
            r17 = r5
            r19 = 0
            r1 = 0
        L_0x0187:
            r2 = 13
            if (r1 < r2) goto L_0x019e
            r2 = 902(0x386, float:1.264E-42)
            r14.append(r2)
            p534hh.C17435c.m43471b(r4, r1, r0, r14)
            int r4 = r4 + r1
            r12 = 2
            r1 = r24
            r2 = r25
            r10 = r26
            r5 = r17
            goto L_0x0149
        L_0x019e:
            int r5 = r22.length()
            r10 = r4
        L_0x01a3:
            if (r10 >= r5) goto L_0x0201
            char r18 = r0.charAt(r10)
            r19 = 0
            r19 = r6
            r6 = 0
            r20 = r18
            r18 = r11
            r11 = r20
        L_0x01b4:
            if (r6 >= r2) goto L_0x01d5
            r2 = 48
            if (r11 < r2) goto L_0x01c0
            r2 = 57
            if (r11 > r2) goto L_0x01c0
            r2 = 1
            goto L_0x01c1
        L_0x01c0:
            r2 = 0
        L_0x01c1:
            if (r2 == 0) goto L_0x01d3
            if (r10 >= r5) goto L_0x01d3
            int r6 = r6 + 1
            int r10 = r10 + 1
            if (r10 >= r5) goto L_0x01d0
            char r2 = r0.charAt(r10)
            r11 = r2
        L_0x01d0:
            r2 = 13
            goto L_0x01b4
        L_0x01d3:
            r2 = 13
        L_0x01d5:
            if (r6 < r2) goto L_0x01da
            int r10 = r10 - r4
            int r10 = r10 - r6
            goto L_0x0206
        L_0x01da:
            if (r6 > 0) goto L_0x01fa
            char r6 = r0.charAt(r10)
            r11 = 9
            if (r6 == r11) goto L_0x01f5
            r11 = 10
            if (r6 == r11) goto L_0x01f5
            if (r6 == r2) goto L_0x01f5
            r2 = 32
            if (r6 < r2) goto L_0x01f3
            r2 = 126(0x7e, float:1.77E-43)
            if (r6 > r2) goto L_0x01f3
            goto L_0x01f5
        L_0x01f3:
            r2 = 0
            goto L_0x01f6
        L_0x01f5:
            r2 = 1
        L_0x01f6:
            if (r2 == 0) goto L_0x0205
            int r10 = r10 + 1
        L_0x01fa:
            r2 = 13
            r11 = r18
            r6 = r19
            goto L_0x01a3
        L_0x0201:
            r19 = r6
            r18 = r11
        L_0x0205:
            int r10 = r10 - r4
        L_0x0206:
            r2 = 5
            if (r10 >= r2) goto L_0x028d
            if (r1 != r15) goto L_0x020d
            goto L_0x028d
        L_0x020d:
            java.nio.charset.CharsetEncoder r1 = r3.newEncoder()
            int r2 = r22.length()
            r5 = r4
        L_0x0216:
            if (r5 >= r2) goto L_0x026c
            char r6 = r0.charAt(r5)
            r10 = 0
        L_0x021d:
            r11 = 13
            if (r10 >= r11) goto L_0x0239
            r11 = 48
            if (r6 < r11) goto L_0x022b
            r11 = 57
            if (r6 > r11) goto L_0x022b
            r6 = 1
            goto L_0x022c
        L_0x022b:
            r6 = 0
        L_0x022c:
            if (r6 == 0) goto L_0x0239
            int r10 = r10 + 1
            int r6 = r5 + r10
            if (r6 >= r2) goto L_0x0239
            char r6 = r0.charAt(r6)
            goto L_0x021d
        L_0x0239:
            r6 = 13
            if (r10 < r6) goto L_0x023e
            goto L_0x026c
        L_0x023e:
            char r6 = r0.charAt(r5)
            boolean r10 = r1.canEncode(r6)
            if (r10 == 0) goto L_0x024b
            int r5 = r5 + 1
            goto L_0x0216
        L_0x024b:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Non-encodable character detected: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r2 = " (Unicode: "
            r1.append(r2)
            r1.append(r6)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x026c:
            int r5 = r5 - r4
            if (r5 != 0) goto L_0x0270
            r5 = 1
        L_0x0270:
            int r5 = r5 + r4
            java.lang.String r1 = r0.substring(r4, r5)
            byte[] r1 = r1.getBytes(r3)
            int r2 = r1.length
            r4 = 1
            if (r2 != r4) goto L_0x0284
            if (r12 != 0) goto L_0x0284
            r2 = 0
            p534hh.C17435c.m43470a(r1, r4, r2, r14)
            goto L_0x028b
        L_0x0284:
            int r2 = r1.length
            p534hh.C17435c.m43470a(r1, r2, r12, r14)
            r12 = 1
            r16 = 0
        L_0x028b:
            r4 = r5
            goto L_0x02a2
        L_0x028d:
            if (r12 == 0) goto L_0x0299
            r1 = 900(0x384, float:1.261E-42)
            r14.append(r1)
            r16 = 0
            r12 = 0
            r1 = 0
            goto L_0x029b
        L_0x0299:
            r1 = r16
        L_0x029b:
            int r1 = p534hh.C17435c.m43472c(r0, r4, r10, r14, r1)
            int r4 = r4 + r10
            r16 = r1
        L_0x02a2:
            r1 = r24
            r2 = r25
            r10 = r26
            r5 = r17
            r11 = r18
            r6 = r19
            goto L_0x014b
        L_0x02b0:
            r17 = r5
            r19 = r6
            r26 = r10
            r18 = r11
            goto L_0x02e9
        L_0x02b9:
            r17 = r5
            r19 = r6
            r26 = r10
            r18 = r11
            r1 = 902(0x386, float:1.264E-42)
            r14.append(r1)
            r1 = 0
            p534hh.C17435c.m43471b(r1, r15, r0, r14)
            goto L_0x02e9
        L_0x02cb:
            r17 = r5
            r19 = r6
            r26 = r10
            r18 = r11
            byte[] r1 = r0.getBytes(r3)
            int r2 = r1.length
            r3 = 1
            p534hh.C17435c.m43470a(r1, r2, r3, r14)
            goto L_0x02e9
        L_0x02dd:
            r17 = r5
            r19 = r6
            r26 = r10
            r18 = r11
            r1 = 0
            p534hh.C17435c.m43472c(r0, r1, r15, r14, r1)
        L_0x02e9:
            java.lang.String r1 = r14.toString()
            int r2 = r1.length()
            r3 = 0
            r4 = 0
            r5 = r19
        L_0x02f5:
            if (r5 > r7) goto L_0x033b
            int r6 = r2 + 1
            int r6 = r6 + r13
            int r10 = r6 / r5
            int r10 = r10 + 1
            int r11 = r5 * r10
            int r6 = r6 + r5
            if (r11 < r6) goto L_0x0305
            int r10 = r10 + -1
        L_0x0305:
            if (r10 < r8) goto L_0x033b
            if (r10 > r9) goto L_0x0338
            int r6 = r5 * 17
            int r6 = r6 + 69
            float r6 = (float) r6
            r11 = 1052166324(0x3eb6c8b4, float:0.357)
            float r6 = r6 * r11
            float r11 = (float) r10
            r12 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 * r12
            float r6 = r6 / r11
            if (r4 == 0) goto L_0x032d
            r11 = 1077936128(0x40400000, float:3.0)
            float r12 = r6 - r11
            float r12 = java.lang.Math.abs(r12)
            float r11 = r3 - r11
            float r11 = java.lang.Math.abs(r11)
            int r11 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r11 > 0) goto L_0x0338
        L_0x032d:
            r3 = 2
            int[] r3 = new int[r3]
            r4 = 0
            r3[r4] = r5
            r4 = 1
            r3[r4] = r10
            r4 = r3
            r3 = r6
        L_0x0338:
            int r5 = r5 + 1
            goto L_0x02f5
        L_0x033b:
            if (r4 != 0) goto L_0x0358
            int r3 = r2 + 1
            int r3 = r3 + r13
            int r5 = r3 / r19
            int r5 = r5 + 1
            int r6 = r19 * r5
            int r3 = r3 + r19
            if (r6 < r3) goto L_0x034c
            int r5 = r5 + -1
        L_0x034c:
            if (r5 >= r8) goto L_0x0358
            r3 = 2
            int[] r4 = new int[r3]
            r3 = 0
            r4[r3] = r19
            r5 = 1
            r4[r5] = r8
            goto L_0x035a
        L_0x0358:
            r3 = 0
            r5 = 1
        L_0x035a:
            if (r4 == 0) goto L_0x0501
            r3 = r4[r3]
            r4 = r4[r5]
            int r6 = r3 * r4
            int r6 = r6 - r13
            int r7 = r2 + 1
            if (r6 <= r7) goto L_0x036b
            int r6 = r6 - r2
            int r6 = r6 + -1
            goto L_0x036c
        L_0x036b:
            r6 = 0
        L_0x036c:
            int r7 = r13 + r2
            int r7 = r7 + r5
            r8 = 929(0x3a1, float:1.302E-42)
            if (r7 > r8) goto L_0x04e4
            int r2 = r2 + r6
            int r2 = r2 + r5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            char r2 = (char) r2
            r0.append(r2)
            r0.append(r1)
            r1 = 0
        L_0x0382:
            if (r1 >= r6) goto L_0x038c
            r2 = 900(0x384, float:1.261E-42)
            r0.append(r2)
            int r1 = r1 + 1
            goto L_0x0382
        L_0x038c:
            java.lang.String r0 = r0.toString()
            if (r18 < 0) goto L_0x04dc
            r1 = 8
            r11 = r18
            if (r11 > r1) goto L_0x04dc
            char[] r1 = new char[r13]
            int r2 = r0.length()
            r5 = 0
        L_0x039f:
            if (r5 >= r2) goto L_0x03d6
            char r6 = r0.charAt(r5)
            int r7 = r13 + -1
            char r9 = r1[r7]
            int r6 = r6 + r9
            int r6 = r6 % r8
        L_0x03ab:
            if (r7 <= 0) goto L_0x03c3
            int[][] r9 = mf0.C24361g.f61678g
            r9 = r9[r11]
            r9 = r9[r7]
            int r9 = r9 * r6
            int r9 = r9 % r8
            int r9 = 929 - r9
            int r10 = r7 + -1
            char r12 = r1[r10]
            int r12 = r12 + r9
            int r12 = r12 % r8
            char r9 = (char) r12
            r1[r7] = r9
            r7 = r10
            goto L_0x03ab
        L_0x03c3:
            int[][] r7 = mf0.C24361g.f61678g
            r7 = r7[r11]
            r9 = 0
            r7 = r7[r9]
            int r6 = r6 * r7
            int r6 = r6 % r8
            int r6 = 929 - r6
            int r6 = r6 % r8
            char r6 = (char) r6
            r1[r9] = r6
            int r5 = r5 + 1
            goto L_0x039f
        L_0x03d6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r13)
        L_0x03db:
            int r13 = r13 + -1
            if (r13 < 0) goto L_0x03ee
            char r5 = r1[r13]
            if (r5 == 0) goto L_0x03e8
            int r5 = 929 - r5
            char r5 = (char) r5
            r1[r13] = r5
        L_0x03e8:
            char r5 = r1[r13]
            r2.append(r5)
            goto L_0x03db
        L_0x03ee:
            java.lang.String r1 = r2.toString()
            ma.w r2 = new ma.w
            r2.<init>(r4, r3)
            java.lang.String r0 = p379.C25541a.m63881k(r0, r1)
            r1 = 0
            r5 = 0
        L_0x03fd:
            if (r5 >= r4) goto L_0x0491
            int r6 = r5 % 3
            int r7 = r2.f18636a
            int r7 = r7 + 1
            r2.f18636a = r7
            r7 = 130728(0x1fea8, float:1.83189E-40)
            hh.a r8 = r2.mo21610a()
            r9 = 17
            p626lf.C18201b.m44918o(r7, r9, r8)
            if (r6 != 0) goto L_0x0421
            int r7 = r5 / 3
            int r7 = r7 * 30
            int r8 = r4 + -1
            int r8 = r8 / 3
            int r8 = r8 + r7
            int r10 = r3 + -1
            goto L_0x0432
        L_0x0421:
            r7 = 1
            if (r6 != r7) goto L_0x0434
            int r7 = r5 / 3
            int r7 = r7 * 30
            int r8 = r11 * 3
            int r8 = r8 + r7
            int r10 = r4 + -1
            int r12 = r10 % 3
            int r8 = r8 + r12
            int r10 = r10 / 3
        L_0x0432:
            int r10 = r10 + r7
            goto L_0x0443
        L_0x0434:
            int r7 = r5 / 3
            int r7 = r7 * 30
            int r8 = r3 + -1
            int r8 = r8 + r7
            int r10 = r11 * 3
            int r10 = r10 + r7
            int r7 = r4 + -1
            int r7 = r7 % 3
            int r10 = r10 + r7
        L_0x0443:
            int[][] r7 = p626lf.C18201b.f46454c
            r7 = r7[r6]
            r7 = r7[r8]
            hh.a r8 = r2.mo21610a()
            p626lf.C18201b.m44918o(r7, r9, r8)
            r7 = 0
        L_0x0451:
            if (r7 >= r3) goto L_0x0469
            int[][] r8 = p626lf.C18201b.f46454c
            r8 = r8[r6]
            char r12 = r0.charAt(r1)
            r8 = r8[r12]
            hh.a r12 = r2.mo21610a()
            p626lf.C18201b.m44918o(r8, r9, r12)
            int r1 = r1 + 1
            int r7 = r7 + 1
            goto L_0x0451
        L_0x0469:
            r7 = 260649(0x3fa29, float:3.65247E-40)
            if (r17 == 0) goto L_0x0477
            hh.a r6 = r2.mo21610a()
            r8 = 1
            p626lf.C18201b.m44918o(r7, r8, r6)
            goto L_0x048d
        L_0x0477:
            int[][] r8 = p626lf.C18201b.f46454c
            r6 = r8[r6]
            r6 = r6[r10]
            hh.a r8 = r2.mo21610a()
            p626lf.C18201b.m44918o(r6, r9, r8)
            r6 = 18
            hh.a r8 = r2.mo21610a()
            p626lf.C18201b.m44918o(r7, r6, r8)
        L_0x048d:
            int r5 = r5 + 1
            goto L_0x03fd
        L_0x0491:
            r0 = 4
            r1 = 1
            byte[][] r0 = r2.mo21611b(r1, r0)
            r1 = 0
            r3 = r24
            r4 = r25
            if (r4 <= r3) goto L_0x04a0
            r5 = 1
            goto L_0x04a1
        L_0x04a0:
            r5 = 0
        L_0x04a1:
            r6 = r0[r1]
            int r6 = r6.length
            int r7 = r0.length
            if (r6 >= r7) goto L_0x04a9
            r6 = 1
            goto L_0x04aa
        L_0x04a9:
            r6 = 0
        L_0x04aa:
            if (r5 == r6) goto L_0x04b2
            byte[][] r0 = m43181b(r0)
            r5 = 1
            goto L_0x04b3
        L_0x04b2:
            r5 = 0
        L_0x04b3:
            r1 = r0[r1]
            int r1 = r1.length
            int r1 = r3 / r1
            int r3 = r0.length
            int r3 = r4 / r3
            if (r1 >= r3) goto L_0x04be
            goto L_0x04bf
        L_0x04be:
            r1 = r3
        L_0x04bf:
            r3 = 1
            if (r1 <= r3) goto L_0x04d5
            int r0 = r1 << 2
            byte[][] r0 = r2.mo21611b(r1, r0)
            if (r5 == 0) goto L_0x04ce
            byte[][] r0 = m43181b(r0)
        L_0x04ce:
            r10 = r26
            ch.b r0 = m43180a(r0, r10)
            goto L_0x04db
        L_0x04d5:
            r10 = r26
            ch.b r0 = m43180a(r0, r10)
        L_0x04db:
            return r0
        L_0x04dc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r23
            r0.<init>(r1)
            throw r0
        L_0x04e4:
            com.google.zxing.WriterException r1 = new com.google.zxing.WriterException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Encoded message contains too many code words, message too big ("
            r2.<init>(r3)
            int r0 = r22.length()
            r2.append(r0)
            java.lang.String r0 = " bytes)"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x0501:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.String r1 = "Unable to fit message in columns"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0509:
            r1 = r12
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0510:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r23)
            java.lang.String r2 = "Can only encode PDF_417, but got "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p510gh.C17190a.mo22696i(java.lang.String, com.google.zxing.BarcodeFormat, int, int, java.util.Map):ch.b");
    }
}
