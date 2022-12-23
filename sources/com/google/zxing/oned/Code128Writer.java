package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.Map;
import p043ch.C13831b;
import p486fh.C17012l;

public final class Code128Writer extends C17012l {

    public enum CType {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    /* renamed from: d */
    public static CType m36740d(int i, CharSequence charSequence) {
        int length = charSequence.length();
        if (i >= length) {
            return CType.UNCODABLE;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 241) {
            return CType.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return CType.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return CType.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i2);
        if (charAt2 < '0' || charAt2 > '9') {
            return CType.ONE_DIGIT;
        }
        return CType.TWO_DIGITS;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0086, code lost:
        if (m36740d(r5 + 3, r0) == com.google.zxing.oned.Code128Writer.CType.TWO_DIGITS) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0098, code lost:
        if (r10 == com.google.zxing.oned.Code128Writer.CType.ONE_DIGIT) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a7, code lost:
        if (r10 == com.google.zxing.oned.Code128Writer.CType.TWO_DIGITS) goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0037 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean[] mo44158b(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r17
            int r1 = r17.length()
            if (r1 <= 0) goto L_0x014d
            r2 = 80
            if (r1 > r2) goto L_0x014d
            r3 = 0
        L_0x000d:
            if (r3 >= r1) goto L_0x002d
            char r4 = r0.charAt(r3)
            switch(r4) {
                case 241: goto L_0x001a;
                case 242: goto L_0x001a;
                case 243: goto L_0x001a;
                case 244: goto L_0x001a;
                default: goto L_0x0016;
            }
        L_0x0016:
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 > r5) goto L_0x001d
        L_0x001a:
            int r3 = r3 + 1
            goto L_0x000d
        L_0x001d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r2 = "Bad character in input: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x002d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1
        L_0x0037:
            r9 = 103(0x67, float:1.44E-43)
            if (r5 >= r1) goto L_0x0109
            com.google.zxing.oned.Code128Writer$CType r10 = m36740d(r5, r0)
            com.google.zxing.oned.Code128Writer$CType r11 = com.google.zxing.oned.Code128Writer.CType.ONE_DIGIT
            r12 = 96
            r13 = 32
            r14 = 100
            r15 = 101(0x65, float:1.42E-43)
            if (r10 != r11) goto L_0x004e
        L_0x004b:
            r12 = 100
            goto L_0x00ab
        L_0x004e:
            com.google.zxing.oned.Code128Writer$CType r2 = com.google.zxing.oned.Code128Writer.CType.UNCODABLE
            if (r10 != r2) goto L_0x0065
            int r2 = r17.length()
            if (r5 >= r2) goto L_0x004b
            char r2 = r0.charAt(r5)
            if (r2 < r13) goto L_0x0062
            if (r7 != r15) goto L_0x004b
            if (r2 >= r12) goto L_0x004b
        L_0x0062:
            r12 = 101(0x65, float:1.42E-43)
            goto L_0x00ab
        L_0x0065:
            r12 = 99
            if (r7 != r12) goto L_0x006a
            goto L_0x00ab
        L_0x006a:
            if (r7 != r14) goto L_0x009b
            com.google.zxing.oned.Code128Writer$CType r12 = com.google.zxing.oned.Code128Writer.CType.FNC_1
            if (r10 != r12) goto L_0x0071
            goto L_0x004b
        L_0x0071:
            int r10 = r5 + 2
            com.google.zxing.oned.Code128Writer$CType r10 = m36740d(r10, r0)
            if (r10 == r2) goto L_0x004b
            if (r10 != r11) goto L_0x007c
            goto L_0x004b
        L_0x007c:
            if (r10 != r12) goto L_0x0089
            int r2 = r5 + 3
            com.google.zxing.oned.Code128Writer$CType r2 = m36740d(r2, r0)
            com.google.zxing.oned.Code128Writer$CType r10 = com.google.zxing.oned.Code128Writer.CType.TWO_DIGITS
            if (r2 != r10) goto L_0x004b
            goto L_0x00a9
        L_0x0089:
            int r2 = r5 + 4
        L_0x008b:
            com.google.zxing.oned.Code128Writer$CType r10 = m36740d(r2, r0)
            com.google.zxing.oned.Code128Writer$CType r11 = com.google.zxing.oned.Code128Writer.CType.TWO_DIGITS
            if (r10 != r11) goto L_0x0096
            int r2 = r2 + 2
            goto L_0x008b
        L_0x0096:
            com.google.zxing.oned.Code128Writer$CType r2 = com.google.zxing.oned.Code128Writer.CType.ONE_DIGIT
            if (r10 != r2) goto L_0x00a9
            goto L_0x004b
        L_0x009b:
            com.google.zxing.oned.Code128Writer$CType r2 = com.google.zxing.oned.Code128Writer.CType.FNC_1
            if (r10 != r2) goto L_0x00a5
            int r2 = r5 + 1
            com.google.zxing.oned.Code128Writer$CType r10 = m36740d(r2, r0)
        L_0x00a5:
            com.google.zxing.oned.Code128Writer$CType r2 = com.google.zxing.oned.Code128Writer.CType.TWO_DIGITS
            if (r10 != r2) goto L_0x004b
        L_0x00a9:
            r12 = 99
        L_0x00ab:
            if (r12 != r7) goto L_0x00ea
            char r2 = r0.charAt(r5)
            switch(r2) {
                case 241: goto L_0x00c3;
                case 242: goto L_0x00c0;
                case 243: goto L_0x00bd;
                case 244: goto L_0x00b5;
                default: goto L_0x00b4;
            }
        L_0x00b4:
            goto L_0x00c6
        L_0x00b5:
            if (r7 != r15) goto L_0x00ba
            r12 = 101(0x65, float:1.42E-43)
            goto L_0x00e8
        L_0x00ba:
            r12 = 100
            goto L_0x00e8
        L_0x00bd:
            r12 = 96
            goto L_0x00e8
        L_0x00c0:
            r12 = 97
            goto L_0x00e8
        L_0x00c3:
            r12 = 102(0x66, float:1.43E-43)
            goto L_0x00e8
        L_0x00c6:
            if (r7 == r14) goto L_0x00e2
            if (r7 == r15) goto L_0x00d7
            int r2 = r5 + 2
            java.lang.String r2 = r0.substring(r5, r2)
            int r12 = java.lang.Integer.parseInt(r2)
            int r5 = r5 + 1
            goto L_0x00e8
        L_0x00d7:
            char r2 = r0.charAt(r5)
            int r12 = r2 + -32
            if (r12 >= 0) goto L_0x00e8
            int r12 = r12 + 96
            goto L_0x00e8
        L_0x00e2:
            char r2 = r0.charAt(r5)
            int r12 = r2 + -32
        L_0x00e8:
            int r5 = r5 + r4
            goto L_0x00f9
        L_0x00ea:
            if (r7 != 0) goto L_0x00f6
            if (r12 == r14) goto L_0x00f3
            if (r12 == r15) goto L_0x00f7
            r9 = 105(0x69, float:1.47E-43)
            goto L_0x00f7
        L_0x00f3:
            r9 = 104(0x68, float:1.46E-43)
            goto L_0x00f7
        L_0x00f6:
            r9 = r12
        L_0x00f7:
            r7 = r12
            r12 = r9
        L_0x00f9:
            int[][] r2 = p486fh.C17003c.f44125b
            r2 = r2[r12]
            r3.add(r2)
            int r12 = r12 * r8
            int r6 = r6 + r12
            if (r5 == 0) goto L_0x0037
            int r8 = r8 + 1
            goto L_0x0037
        L_0x0109:
            int r6 = r6 % r9
            int[][] r0 = p486fh.C17003c.f44125b
            r1 = r0[r6]
            r3.add(r1)
            r1 = 106(0x6a, float:1.49E-43)
            r0 = r0[r1]
            r3.add(r0)
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L_0x011d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0133
            java.lang.Object r2 = r0.next()
            int[] r2 = (int[]) r2
            int r5 = r2.length
            r6 = 0
        L_0x012b:
            if (r6 >= r5) goto L_0x011d
            r7 = r2[r6]
            int r1 = r1 + r7
            int r6 = r6 + 1
            goto L_0x012b
        L_0x0133:
            boolean[] r0 = new boolean[r1]
            java.util.Iterator r1 = r3.iterator()
            r2 = 0
        L_0x013a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x014c
            java.lang.Object r3 = r1.next()
            int[] r3 = (int[]) r3
            int r3 = p486fh.C17012l.m42863a(r0, r2, r3, r4)
            int r2 = r2 + r3
            goto L_0x013a
        L_0x014c:
            return r0
        L_0x014d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Contents length should be between 1 and 80 characters, but got "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.Code128Writer.mo44158b(java.lang.String):boolean[]");
    }

    /* renamed from: i */
    public final C13831b mo22696i(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.mo22696i(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(barcodeFormat)));
    }
}
