package p558ih;

import p935yg.C20727i;

/* renamed from: ih.b */
public final class C17600b implements C20727i {
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0640, code lost:
        if (r0 != false) goto L_0x0642;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0176 A[LOOP:2: B:92:0x0148->B:106:0x0176, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x034e A[LOOP:11: B:188:0x034c->B:189:0x034e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0364  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d A[SYNTHETIC, Splitter:B:25:0x006d] */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x07c3  */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x00c3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x0186 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x013a  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p043ch.C13831b mo22696i(java.lang.String r25, com.google.zxing.BarcodeFormat r26, int r27, int r28, java.util.Map<com.google.zxing.EncodeHintType, ?> r29) throws com.google.zxing.WriterException {
        /*
            r24 = this;
            r0 = r25
            r1 = r27
            r2 = r28
            r3 = r29
            boolean r4 = r25.isEmpty()
            if (r4 != 0) goto L_0x084b
            com.google.zxing.BarcodeFormat r4 = com.google.zxing.BarcodeFormat.QR_CODE
            r5 = r26
            if (r5 != r4) goto L_0x083b
            if (r1 < 0) goto L_0x081d
            if (r2 < 0) goto L_0x081d
            com.google.zxing.qrcode.decoder.ErrorCorrectionLevel r4 = com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.L
            if (r3 == 0) goto L_0x0045
            com.google.zxing.EncodeHintType r6 = com.google.zxing.EncodeHintType.ERROR_CORRECTION
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L_0x0030
            java.lang.Object r4 = r3.get(r6)
            java.lang.String r4 = r4.toString()
            com.google.zxing.qrcode.decoder.ErrorCorrectionLevel r4 = com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.valueOf(r4)
        L_0x0030:
            com.google.zxing.EncodeHintType r6 = com.google.zxing.EncodeHintType.MARGIN
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L_0x0045
            java.lang.Object r6 = r3.get(r6)
            java.lang.String r6 = r6.toString()
            int r6 = java.lang.Integer.parseInt(r6)
            goto L_0x0046
        L_0x0045:
            r6 = 4
        L_0x0046:
            if (r3 == 0) goto L_0x0052
            com.google.zxing.EncodeHintType r9 = com.google.zxing.EncodeHintType.CHARACTER_SET
            boolean r9 = r3.containsKey(r9)
            if (r9 == 0) goto L_0x0052
            r9 = 1
            goto L_0x0053
        L_0x0052:
            r9 = 0
        L_0x0053:
            if (r9 == 0) goto L_0x0060
            com.google.zxing.EncodeHintType r10 = com.google.zxing.EncodeHintType.CHARACTER_SET
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = r10.toString()
            goto L_0x0062
        L_0x0060:
            java.lang.String r10 = "ISO-8859-1"
        L_0x0062:
            java.lang.String r11 = "Shift_JIS"
            boolean r12 = r11.equals(r10)
            r13 = 96
            r14 = -1
            if (r12 == 0) goto L_0x009b
            byte[] r12 = r0.getBytes(r11)     // Catch:{ UnsupportedEncodingException -> 0x0094 }
            int r15 = r12.length
            int r16 = r15 % 2
            if (r16 == 0) goto L_0x0077
            goto L_0x0095
        L_0x0077:
            r7 = 0
        L_0x0078:
            if (r7 >= r15) goto L_0x0092
            byte r8 = r12[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r5 = 129(0x81, float:1.81E-43)
            if (r8 < r5) goto L_0x0086
            r5 = 159(0x9f, float:2.23E-43)
            if (r8 <= r5) goto L_0x008f
        L_0x0086:
            r5 = 224(0xe0, float:3.14E-43)
            if (r8 < r5) goto L_0x0095
            r5 = 235(0xeb, float:3.3E-43)
            if (r8 <= r5) goto L_0x008f
            goto L_0x0095
        L_0x008f:
            int r7 = r7 + 2
            goto L_0x0078
        L_0x0092:
            r5 = 1
            goto L_0x0096
        L_0x0094:
        L_0x0095:
            r5 = 0
        L_0x0096:
            if (r5 == 0) goto L_0x009b
            com.google.zxing.qrcode.decoder.Mode r5 = com.google.zxing.qrcode.decoder.Mode.KANJI
            goto L_0x00cf
        L_0x009b:
            r5 = 0
            r7 = 0
            r8 = 0
        L_0x009e:
            int r12 = r25.length()
            if (r5 >= r12) goto L_0x00c3
            char r12 = r0.charAt(r5)
            r15 = 48
            if (r12 < r15) goto L_0x00b2
            r15 = 57
            if (r12 > r15) goto L_0x00b2
            r8 = 1
            goto L_0x00bd
        L_0x00b2:
            int[] r7 = p628lh.C18225b.f46501a
            if (r12 >= r13) goto L_0x00b9
            r7 = r7[r12]
            goto L_0x00ba
        L_0x00b9:
            r7 = -1
        L_0x00ba:
            if (r7 == r14) goto L_0x00c0
            r7 = 1
        L_0x00bd:
            int r5 = r5 + 1
            goto L_0x009e
        L_0x00c0:
            com.google.zxing.qrcode.decoder.Mode r5 = com.google.zxing.qrcode.decoder.Mode.BYTE
            goto L_0x00cf
        L_0x00c3:
            if (r7 == 0) goto L_0x00c8
            com.google.zxing.qrcode.decoder.Mode r5 = com.google.zxing.qrcode.decoder.Mode.ALPHANUMERIC
            goto L_0x00cf
        L_0x00c8:
            if (r8 == 0) goto L_0x00cd
            com.google.zxing.qrcode.decoder.Mode r5 = com.google.zxing.qrcode.decoder.Mode.NUMERIC
            goto L_0x00cf
        L_0x00cd:
            com.google.zxing.qrcode.decoder.Mode r5 = com.google.zxing.qrcode.decoder.Mode.BYTE
        L_0x00cf:
            ch.a r7 = new ch.a
            r7.<init>()
            com.google.zxing.qrcode.decoder.Mode r8 = com.google.zxing.qrcode.decoder.Mode.BYTE
            r12 = 8
            if (r5 != r8) goto L_0x00f3
            if (r9 == 0) goto L_0x00f3
            com.google.zxing.common.CharacterSetECI r8 = com.google.zxing.common.CharacterSetECI.getCharacterSetECIByName(r10)
            if (r8 == 0) goto L_0x00f3
            com.google.zxing.qrcode.decoder.Mode r9 = com.google.zxing.qrcode.decoder.Mode.ECI
            int r9 = r9.getBits()
            r15 = 4
            r7.mo40756b(r9, r15)
            int r8 = r8.getValue()
            r7.mo40756b(r8, r12)
        L_0x00f3:
            if (r3 == 0) goto L_0x00ff
            com.google.zxing.EncodeHintType r8 = com.google.zxing.EncodeHintType.GS1_FORMAT
            boolean r8 = r3.containsKey(r8)
            if (r8 == 0) goto L_0x00ff
            r8 = 1
            goto L_0x0100
        L_0x00ff:
            r8 = 0
        L_0x0100:
            if (r8 == 0) goto L_0x0121
            com.google.zxing.EncodeHintType r8 = com.google.zxing.EncodeHintType.GS1_FORMAT
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = r8.toString()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0121
            com.google.zxing.qrcode.decoder.Mode r8 = com.google.zxing.qrcode.decoder.Mode.FNC1_FIRST_POSITION
            int r8 = r8.getBits()
            r9 = 4
            r7.mo40756b(r8, r9)
            goto L_0x0122
        L_0x0121:
            r9 = 4
        L_0x0122:
            int r8 = r5.getBits()
            r7.mo40756b(r8, r9)
            ch.a r8 = new ch.a
            r8.<init>()
            int[] r9 = p628lh.C18225b.C18226a.f46502a
            int r15 = r5.ordinal()
            r9 = r9[r15]
            r15 = 2
            r13 = 1
            if (r9 == r13) goto L_0x0208
            if (r9 == r15) goto L_0x01be
            r13 = 3
            if (r9 == r13) goto L_0x01a6
            r13 = 4
            if (r9 != r13) goto L_0x0196
            byte[] r9 = r0.getBytes(r11)     // Catch:{ UnsupportedEncodingException -> 0x018e }
            int r10 = r9.length
            r11 = 0
        L_0x0148:
            if (r11 >= r10) goto L_0x024d
            byte r13 = r9[r11]
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r18 = r11 + 1
            byte r15 = r9[r18]
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r13 = r13 << r12
            r13 = r13 | r15
            r15 = 33088(0x8140, float:4.6366E-41)
            if (r13 < r15) goto L_0x0164
            r15 = 40956(0x9ffc, float:5.7392E-41)
            if (r13 > r15) goto L_0x0164
            r15 = 33088(0x8140, float:4.6366E-41)
            goto L_0x0171
        L_0x0164:
            r15 = 57408(0xe040, float:8.0446E-41)
            if (r13 < r15) goto L_0x0173
            r15 = 60351(0xebbf, float:8.457E-41)
            if (r13 > r15) goto L_0x0173
            r15 = 49472(0xc140, float:6.9325E-41)
        L_0x0171:
            int r13 = r13 - r15
            goto L_0x0174
        L_0x0173:
            r13 = -1
        L_0x0174:
            if (r13 == r14) goto L_0x0186
            int r15 = r13 >> 8
            int r15 = r15 * 192
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r15 = r15 + r13
            r13 = 13
            r8.mo40756b(r15, r13)
            int r11 = r11 + 2
            r15 = 2
            goto L_0x0148
        L_0x0186:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.String r1 = "Invalid byte sequence"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x018e:
            r0 = move-exception
            r1 = r0
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            r0.<init>((java.io.UnsupportedEncodingException) r1)
            throw r0
        L_0x0196:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "Invalid mode: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x01a6:
            byte[] r9 = r0.getBytes(r10)     // Catch:{ UnsupportedEncodingException -> 0x01b6 }
            int r10 = r9.length
            r11 = 0
        L_0x01ac:
            if (r11 >= r10) goto L_0x024d
            byte r13 = r9[r11]
            r8.mo40756b(r13, r12)
            int r11 = r11 + 1
            goto L_0x01ac
        L_0x01b6:
            r0 = move-exception
            r1 = r0
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            r0.<init>((java.io.UnsupportedEncodingException) r1)
            throw r0
        L_0x01be:
            int r9 = r25.length()
            r10 = 0
        L_0x01c3:
            if (r10 >= r9) goto L_0x024d
            char r11 = r0.charAt(r10)
            int[] r13 = p628lh.C18225b.f46501a
            r15 = 96
            if (r11 >= r15) goto L_0x01d2
            r11 = r13[r11]
            goto L_0x01d3
        L_0x01d2:
            r11 = -1
        L_0x01d3:
            if (r11 == r14) goto L_0x0202
            int r15 = r10 + 1
            if (r15 >= r9) goto L_0x01f8
            char r15 = r0.charAt(r15)
            r12 = 96
            if (r15 >= r12) goto L_0x01e4
            r13 = r13[r15]
            goto L_0x01e5
        L_0x01e4:
            r13 = -1
        L_0x01e5:
            if (r13 == r14) goto L_0x01f2
            int r11 = r11 * 45
            int r11 = r11 + r13
            r13 = 11
            r8.mo40756b(r11, r13)
            int r10 = r10 + 2
            goto L_0x01ff
        L_0x01f2:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            r0.<init>()
            throw r0
        L_0x01f8:
            r12 = 96
            r10 = 6
            r8.mo40756b(r11, r10)
            r10 = r15
        L_0x01ff:
            r12 = 8
            goto L_0x01c3
        L_0x0202:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            r0.<init>()
            throw r0
        L_0x0208:
            int r9 = r25.length()
            r10 = 0
        L_0x020d:
            if (r10 >= r9) goto L_0x024d
            char r11 = r0.charAt(r10)
            int r11 = r11 + -48
            int r12 = r10 + 2
            if (r12 >= r9) goto L_0x0235
            int r13 = r10 + 1
            char r13 = r0.charAt(r13)
            int r13 = r13 + -48
            char r12 = r0.charAt(r12)
            int r12 = r12 + -48
            int r11 = r11 * 100
            r15 = 10
            int r13 = r13 * 10
            int r13 = r13 + r11
            int r13 = r13 + r12
            r8.mo40756b(r13, r15)
            int r10 = r10 + 3
            goto L_0x020d
        L_0x0235:
            int r10 = r10 + 1
            if (r10 >= r9) goto L_0x0248
            char r10 = r0.charAt(r10)
            int r10 = r10 + -48
            int r11 = r11 * 10
            int r11 = r11 + r10
            r10 = 7
            r8.mo40756b(r11, r10)
            r10 = r12
            goto L_0x020d
        L_0x0248:
            r12 = 4
            r8.mo40756b(r11, r12)
            goto L_0x020d
        L_0x024d:
            if (r3 == 0) goto L_0x02a9
            com.google.zxing.EncodeHintType r9 = com.google.zxing.EncodeHintType.QR_VERSION
            boolean r10 = r3.containsKey(r9)
            if (r10 == 0) goto L_0x02a9
            java.lang.Object r3 = r3.get(r9)
            java.lang.String r3 = r3.toString()
            int r3 = java.lang.Integer.parseInt(r3)
            jh.e r3 = p580jh.C17851e.m44235c(r3)
            int r9 = r7.f34026c
            int r10 = r5.getCharacterCountBits(r3)
            int r10 = r10 + r9
            int r9 = r8.f34026c
            int r10 = r10 + r9
            int r9 = r3.f45832d
            jh.e$b[] r11 = r3.f45831c
            int r12 = r4.ordinal()
            r11 = r11[r12]
            int r12 = r11.f45835a
            jh.e$a[] r11 = r11.f45836b
            int r13 = r11.length
            r15 = 0
            r18 = 0
        L_0x0283:
            if (r15 >= r13) goto L_0x028f
            r14 = r11[r15]
            int r14 = r14.f45833a
            int r18 = r18 + r14
            int r15 = r15 + 1
            r14 = -1
            goto L_0x0283
        L_0x028f:
            int r18 = r18 * r12
            int r9 = r9 - r18
            r11 = 7
            int r10 = r10 + r11
            r11 = 8
            int r10 = r10 / r11
            if (r9 < r10) goto L_0x029c
            r9 = 1
            goto L_0x029d
        L_0x029c:
            r9 = 0
        L_0x029d:
            if (r9 == 0) goto L_0x02a1
            goto L_0x033e
        L_0x02a1:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.String r1 = "Data too big for requested version"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x02a9:
            r3 = 1
            jh.e r9 = p580jh.C17851e.m44235c(r3)
            int r3 = r7.f34026c
            int r9 = r5.getCharacterCountBits(r9)
            int r9 = r9 + r3
            int r3 = r8.f34026c
            int r9 = r9 + r3
            r13 = 1
        L_0x02b9:
            java.lang.String r3 = "Data too big"
            r10 = 40
            if (r13 > r10) goto L_0x0817
            jh.e r11 = p580jh.C17851e.m44235c(r13)
            int r12 = r11.f45832d
            jh.e$b[] r14 = r11.f45831c
            int r15 = r4.ordinal()
            r14 = r14[r15]
            int r15 = r14.f45835a
            jh.e$a[] r14 = r14.f45836b
            int r10 = r14.length
            r0 = 0
            r18 = 0
        L_0x02d5:
            if (r0 >= r10) goto L_0x02e4
            r19 = r10
            r10 = r14[r0]
            int r10 = r10.f45833a
            int r18 = r18 + r10
            int r0 = r0 + 1
            r10 = r19
            goto L_0x02d5
        L_0x02e4:
            int r18 = r18 * r15
            int r12 = r12 - r18
            r0 = 7
            int r10 = r9 + 7
            r0 = 8
            int r10 = r10 / r0
            if (r12 < r10) goto L_0x02f2
            r0 = 1
            goto L_0x02f3
        L_0x02f2:
            r0 = 0
        L_0x02f3:
            if (r0 == 0) goto L_0x07ff
            int r0 = r7.f34026c
            int r9 = r5.getCharacterCountBits(r11)
            int r9 = r9 + r0
            int r0 = r8.f34026c
            int r9 = r9 + r0
            r0 = 40
            r13 = 1
        L_0x0302:
            if (r13 > r0) goto L_0x07f9
            jh.e r10 = p580jh.C17851e.m44235c(r13)
            int r11 = r10.f45832d
            jh.e$b[] r12 = r10.f45831c
            int r14 = r4.ordinal()
            r12 = r12[r14]
            int r14 = r12.f45835a
            jh.e$a[] r12 = r12.f45836b
            int r15 = r12.length
            r0 = 0
            r18 = 0
        L_0x031a:
            if (r0 >= r15) goto L_0x0329
            r19 = r10
            r10 = r12[r0]
            int r10 = r10.f45833a
            int r18 = r18 + r10
            int r0 = r0 + 1
            r10 = r19
            goto L_0x031a
        L_0x0329:
            r19 = r10
            int r18 = r18 * r14
            int r11 = r11 - r18
            r0 = 7
            int r10 = r9 + 7
            r0 = 8
            int r10 = r10 / r0
            if (r11 < r10) goto L_0x0339
            r0 = 1
            goto L_0x033a
        L_0x0339:
            r0 = 0
        L_0x033a:
            if (r0 == 0) goto L_0x07e1
            r3 = r19
        L_0x033e:
            ch.a r0 = new ch.a
            r0.<init>()
            int r9 = r7.f34026c
            int r10 = r0.f34026c
            int r10 = r10 + r9
            r0.mo40757c(r10)
            r10 = 0
        L_0x034c:
            if (r10 >= r9) goto L_0x0358
            boolean r11 = r7.mo40759d(r10)
            r0.mo40755a(r11)
            int r10 = r10 + 1
            goto L_0x034c
        L_0x0358:
            com.google.zxing.qrcode.decoder.Mode r7 = com.google.zxing.qrcode.decoder.Mode.BYTE
            if (r5 != r7) goto L_0x0364
            int r7 = r8.f34026c
            r9 = 7
            int r7 = r7 + r9
            r9 = 8
            int r7 = r7 / r9
            goto L_0x0368
        L_0x0364:
            int r7 = r25.length()
        L_0x0368:
            int r5 = r5.getCharacterCountBits(r3)
            r9 = 1
            int r10 = r9 << r5
            if (r7 >= r10) goto L_0x07c3
            r0.mo40756b(r7, r5)
            int r5 = r8.f34026c
            int r7 = r0.f34026c
            int r7 = r7 + r5
            r0.mo40757c(r7)
            r7 = 0
        L_0x037d:
            if (r7 >= r5) goto L_0x0389
            boolean r9 = r8.mo40759d(r7)
            r0.mo40755a(r9)
            int r7 = r7 + 1
            goto L_0x037d
        L_0x0389:
            jh.e$b[] r5 = r3.f45831c
            int r7 = r4.ordinal()
            r5 = r5[r7]
            int r7 = r3.f45832d
            int r8 = r5.f45835a
            jh.e$a[] r9 = r5.f45836b
            int r10 = r9.length
            r11 = 0
            r12 = 0
        L_0x039a:
            if (r11 >= r10) goto L_0x03a4
            r13 = r9[r11]
            int r13 = r13.f45833a
            int r12 = r12 + r13
            int r11 = r11 + 1
            goto L_0x039a
        L_0x03a4:
            int r12 = r12 * r8
            int r7 = r7 - r12
            int r8 = r7 << 3
            int r9 = r0.f34026c
            if (r9 > r8) goto L_0x07a5
            r9 = 0
        L_0x03ae:
            r10 = 4
            if (r9 >= r10) goto L_0x03bc
            int r10 = r0.f34026c
            if (r10 >= r8) goto L_0x03bc
            r10 = 0
            r0.mo40755a(r10)
            int r9 = r9 + 1
            goto L_0x03ae
        L_0x03bc:
            r10 = 0
            int r9 = r0.f34026c
            r11 = 7
            r9 = r9 & r11
            r11 = 8
            if (r9 <= 0) goto L_0x03ce
        L_0x03c5:
            if (r9 >= r11) goto L_0x03ce
            r0.mo40755a(r10)
            int r9 = r9 + 1
            r10 = 0
            goto L_0x03c5
        L_0x03ce:
            int r9 = r0.f34026c
            r10 = 7
            int r9 = r9 + r10
            int r9 = r9 / r11
            int r9 = r7 - r9
            r10 = 0
        L_0x03d6:
            if (r10 >= r9) goto L_0x03e9
            r12 = r10 & 1
            if (r12 != 0) goto L_0x03df
            r11 = 236(0xec, float:3.31E-43)
            goto L_0x03e1
        L_0x03df:
            r11 = 17
        L_0x03e1:
            r12 = 8
            r0.mo40756b(r11, r12)
            int r10 = r10 + 1
            goto L_0x03d6
        L_0x03e9:
            int r9 = r0.f34026c
            if (r9 != r8) goto L_0x079d
            int r8 = r3.f45832d
            jh.e$a[] r5 = r5.f45836b
            int r9 = r5.length
            r10 = 0
            r12 = 0
        L_0x03f4:
            if (r10 >= r9) goto L_0x03fe
            r13 = r5[r10]
            int r13 = r13.f45833a
            int r12 = r12 + r13
            int r10 = r10 + 1
            goto L_0x03f4
        L_0x03fe:
            int r5 = r0.f34026c
            r9 = 7
            int r5 = r5 + r9
            r9 = 8
            int r5 = r5 / r9
            if (r5 != r7) goto L_0x0795
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r12)
            r9 = 0
            r10 = 0
            r13 = 0
            r14 = 0
        L_0x0410:
            if (r9 >= r12) goto L_0x04fb
            r15 = 1
            int[] r11 = new int[r15]
            int[] r2 = new int[r15]
            if (r9 >= r12) goto L_0x04f3
            int r15 = r8 % r12
            int r1 = r12 - r15
            int r18 = r8 / r12
            int r19 = r18 + 1
            int r20 = r7 / r12
            int r21 = r20 + 1
            r22 = r6
            int r6 = r18 - r20
            r18 = r4
            int r4 = r19 - r21
            if (r6 != r4) goto L_0x04eb
            r19 = r3
            int r3 = r1 + r15
            if (r12 != r3) goto L_0x04e3
            int r3 = r20 + r6
            int r3 = r3 * r1
            int r23 = r21 + r4
            int r23 = r23 * r15
            int r3 = r23 + r3
            if (r8 != r3) goto L_0x04db
            if (r9 >= r1) goto L_0x0449
            r1 = 0
            r11[r1] = r20
            r2[r1] = r6
            goto L_0x044e
        L_0x0449:
            r1 = 0
            r11[r1] = r21
            r2[r1] = r4
        L_0x044e:
            r3 = r11[r1]
            byte[] r1 = new byte[r3]
            int r4 = r10 << 3
            r6 = r4
            r4 = 0
        L_0x0456:
            if (r4 >= r3) goto L_0x0485
            r20 = r8
            r29 = r12
            r8 = 8
            r15 = 0
            r12 = r6
            r6 = 0
        L_0x0461:
            if (r6 >= r8) goto L_0x0478
            boolean r8 = r0.mo40759d(r12)
            if (r8 == 0) goto L_0x0471
            int r8 = 7 - r6
            r16 = 1
            int r8 = r16 << r8
            r8 = r8 | r15
            r15 = r8
        L_0x0471:
            int r12 = r12 + 1
            int r6 = r6 + 1
            r8 = 8
            goto L_0x0461
        L_0x0478:
            int r6 = r4 + 0
            byte r8 = (byte) r15
            r1[r6] = r8
            int r4 = r4 + 1
            r6 = r12
            r8 = r20
            r12 = r29
            goto L_0x0456
        L_0x0485:
            r20 = r8
            r29 = r12
            r4 = 0
            r2 = r2[r4]
            int r4 = r3 + r2
            int[] r4 = new int[r4]
            r6 = 0
        L_0x0491:
            if (r6 >= r3) goto L_0x049c
            byte r8 = r1[r6]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r4[r6] = r8
            int r6 = r6 + 1
            goto L_0x0491
        L_0x049c:
            w10.a r6 = new w10.a
            dh.a r8 = p438dh.C16666a.f43367l
            r6.<init>((p438dh.C16666a) r8)
            r6.mo52442b(r2, r4)
            byte[] r6 = new byte[r2]
            r8 = 0
        L_0x04a9:
            if (r8 >= r2) goto L_0x04b5
            int r12 = r3 + r8
            r12 = r4[r12]
            byte r12 = (byte) r12
            r6[r8] = r12
            int r8 = r8 + 1
            goto L_0x04a9
        L_0x04b5:
            lh.a r4 = new lh.a
            r4.<init>(r1, r6)
            r5.add(r4)
            int r13 = java.lang.Math.max(r13, r3)
            int r14 = java.lang.Math.max(r14, r2)
            r1 = 0
            r2 = r11[r1]
            int r10 = r10 + r2
            int r9 = r9 + 1
            r1 = r27
            r2 = r28
            r12 = r29
            r4 = r18
            r3 = r19
            r8 = r20
            r6 = r22
            goto L_0x0410
        L_0x04db:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.String r1 = "Total bytes mismatch"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x04e3:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.String r1 = "RS blocks mismatch"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x04eb:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.String r1 = "EC bytes mismatch"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x04f3:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.String r1 = "Block ID too large"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x04fb:
            r19 = r3
            r18 = r4
            r22 = r6
            r20 = r8
            if (r7 != r10) goto L_0x078d
            ch.a r0 = new ch.a
            r0.<init>()
            r1 = 0
        L_0x050b:
            if (r1 >= r13) goto L_0x052d
            java.util.Iterator r2 = r5.iterator()
        L_0x0511:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x052a
            java.lang.Object r3 = r2.next()
            lh.a r3 = (p628lh.C18224a) r3
            byte[] r3 = r3.f46499a
            int r4 = r3.length
            if (r1 >= r4) goto L_0x0511
            byte r3 = r3[r1]
            r4 = 8
            r0.mo40756b(r3, r4)
            goto L_0x0511
        L_0x052a:
            int r1 = r1 + 1
            goto L_0x050b
        L_0x052d:
            r1 = 0
        L_0x052e:
            if (r1 >= r14) goto L_0x0552
            java.util.Iterator r2 = r5.iterator()
        L_0x0534:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x054d
            java.lang.Object r3 = r2.next()
            lh.a r3 = (p628lh.C18224a) r3
            byte[] r3 = r3.f46500b
            int r4 = r3.length
            if (r1 >= r4) goto L_0x0534
            byte r3 = r3[r1]
            r4 = 8
            r0.mo40756b(r3, r4)
            goto L_0x0534
        L_0x054d:
            r4 = 8
            int r1 = r1 + 1
            goto L_0x052e
        L_0x0552:
            r4 = 8
            int r1 = r0.f34026c
            r2 = 7
            int r1 = r1 + r2
            int r1 = r1 / r4
            r2 = r20
            if (r2 != r1) goto L_0x0765
            r3 = r19
            int r1 = r3.f45829a
            r2 = 4
            int r1 = r1 * 4
            r2 = 17
            int r1 = r1 + r2
            ch.c r2 = new ch.c
            r2.<init>(r1, r1)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r4 = -1
            r5 = 8
            r10 = 0
        L_0x0573:
            if (r10 >= r5) goto L_0x0718
            r6 = r18
            p628lh.C18227c.m44954a(r0, r6, r3, r10, r2)
            r5 = 1
            int r7 = ce0.C21100e.m49346j(r2, r5)
            r5 = 0
            int r8 = ce0.C21100e.m49346j(r2, r5)
            int r8 = r8 + r7
            java.lang.Object r5 = r2.f34034d
            byte[][] r5 = (byte[][]) r5
            int r7 = r2.f34032b
            int r9 = r2.f34033c
            r11 = 0
            r12 = 0
        L_0x058f:
            r14 = -1
            int r13 = r9 + -1
            if (r11 >= r13) goto L_0x05be
            r13 = r5[r11]
            r17 = r9
            r15 = r12
            r12 = 0
        L_0x059a:
            int r9 = r7 + -1
            if (r12 >= r9) goto L_0x05b8
            byte r9 = r13[r12]
            int r18 = r12 + 1
            byte r14 = r13[r18]
            if (r9 != r14) goto L_0x05b4
            int r14 = r11 + 1
            r14 = r5[r14]
            byte r12 = r14[r12]
            if (r9 != r12) goto L_0x05b4
            byte r12 = r14[r18]
            if (r9 != r12) goto L_0x05b4
            int r15 = r15 + 1
        L_0x05b4:
            r12 = r18
            r14 = -1
            goto L_0x059a
        L_0x05b8:
            int r11 = r11 + 1
            r12 = r15
            r9 = r17
            goto L_0x058f
        L_0x05be:
            int r12 = r12 * 3
            int r12 = r12 + r8
            java.lang.Object r5 = r2.f34034d
            byte[][] r5 = (byte[][]) r5
            int r7 = r2.f34032b
            int r8 = r2.f34033c
            r9 = 0
            r11 = 0
        L_0x05cb:
            if (r9 >= r8) goto L_0x06d2
            r13 = r11
            r11 = 0
        L_0x05cf:
            if (r11 >= r7) goto L_0x06c9
            r14 = r5[r9]
            int r15 = r11 + 6
            if (r15 >= r7) goto L_0x0645
            r17 = r7
            byte r7 = r14[r11]
            r25 = r0
            r0 = 1
            if (r7 != r0) goto L_0x0649
            int r7 = r11 + 1
            byte r7 = r14[r7]
            if (r7 != 0) goto L_0x0649
            int r7 = r11 + 2
            byte r7 = r14[r7]
            if (r7 != r0) goto L_0x0649
            int r7 = r11 + 3
            byte r7 = r14[r7]
            if (r7 != r0) goto L_0x0649
            int r7 = r11 + 4
            byte r7 = r14[r7]
            if (r7 != r0) goto L_0x0649
            int r7 = r11 + 5
            byte r7 = r14[r7]
            if (r7 != 0) goto L_0x0649
            byte r7 = r14[r15]
            if (r7 != r0) goto L_0x0649
            int r7 = r11 + -4
            r15 = 0
            int r7 = java.lang.Math.max(r7, r15)
            int r15 = r14.length
            int r15 = java.lang.Math.min(r11, r15)
        L_0x060e:
            if (r7 >= r15) goto L_0x061e
            r29 = r15
            byte r15 = r14[r7]
            if (r15 != r0) goto L_0x0618
            r0 = 0
            goto L_0x061f
        L_0x0618:
            int r7 = r7 + 1
            r15 = r29
            r0 = 1
            goto L_0x060e
        L_0x061e:
            r0 = 1
        L_0x061f:
            if (r0 != 0) goto L_0x0642
            int r0 = r11 + 7
            int r7 = r11 + 11
            r15 = 0
            int r0 = java.lang.Math.max(r0, r15)
            int r15 = r14.length
            int r7 = java.lang.Math.min(r7, r15)
        L_0x062f:
            if (r0 >= r7) goto L_0x063f
            byte r15 = r14[r0]
            r29 = r7
            r7 = 1
            if (r15 != r7) goto L_0x063a
            r0 = 0
            goto L_0x0640
        L_0x063a:
            int r0 = r0 + 1
            r7 = r29
            goto L_0x062f
        L_0x063f:
            r0 = 1
        L_0x0640:
            if (r0 == 0) goto L_0x0649
        L_0x0642:
            int r13 = r13 + 1
            goto L_0x0649
        L_0x0645:
            r25 = r0
            r17 = r7
        L_0x0649:
            int r0 = r9 + 6
            if (r0 >= r8) goto L_0x06c1
            r7 = r5[r9]
            byte r7 = r7[r11]
            r14 = 1
            if (r7 != r14) goto L_0x06c1
            int r7 = r9 + 1
            r7 = r5[r7]
            byte r7 = r7[r11]
            if (r7 != 0) goto L_0x06c1
            int r7 = r9 + 2
            r7 = r5[r7]
            byte r7 = r7[r11]
            if (r7 != r14) goto L_0x06c1
            int r7 = r9 + 3
            r7 = r5[r7]
            byte r7 = r7[r11]
            if (r7 != r14) goto L_0x06c1
            int r7 = r9 + 4
            r7 = r5[r7]
            byte r7 = r7[r11]
            if (r7 != r14) goto L_0x06c1
            int r7 = r9 + 5
            r7 = r5[r7]
            byte r7 = r7[r11]
            if (r7 != 0) goto L_0x06c1
            r0 = r5[r0]
            byte r0 = r0[r11]
            if (r0 != r14) goto L_0x06c1
            int r0 = r9 + -4
            r7 = 0
            int r0 = java.lang.Math.max(r0, r7)
            int r7 = r5.length
            int r7 = java.lang.Math.min(r9, r7)
        L_0x068e:
            if (r0 >= r7) goto L_0x069c
            r15 = r5[r0]
            byte r15 = r15[r11]
            if (r15 != r14) goto L_0x0698
            r0 = 0
            goto L_0x069d
        L_0x0698:
            int r0 = r0 + 1
            r14 = 1
            goto L_0x068e
        L_0x069c:
            r0 = 1
        L_0x069d:
            if (r0 != 0) goto L_0x06bf
            int r0 = r9 + 7
            int r7 = r9 + 11
            r14 = 0
            int r0 = java.lang.Math.max(r0, r14)
            int r15 = r5.length
            int r7 = java.lang.Math.min(r7, r15)
        L_0x06ad:
            if (r0 >= r7) goto L_0x06bc
            r15 = r5[r0]
            byte r15 = r15[r11]
            r14 = 1
            if (r15 != r14) goto L_0x06b8
            r0 = 0
            goto L_0x06bd
        L_0x06b8:
            int r0 = r0 + 1
            r14 = 0
            goto L_0x06ad
        L_0x06bc:
            r0 = 1
        L_0x06bd:
            if (r0 == 0) goto L_0x06c1
        L_0x06bf:
            int r13 = r13 + 1
        L_0x06c1:
            int r11 = r11 + 1
            r0 = r25
            r7 = r17
            goto L_0x05cf
        L_0x06c9:
            r25 = r0
            r17 = r7
            int r9 = r9 + 1
            r11 = r13
            goto L_0x05cb
        L_0x06d2:
            r25 = r0
            int r11 = r11 * 40
            int r11 = r11 + r12
            java.lang.Object r0 = r2.f34034d
            byte[][] r0 = (byte[][]) r0
            int r5 = r2.f34032b
            int r7 = r2.f34033c
            r8 = 0
            r9 = 0
        L_0x06e1:
            if (r8 >= r7) goto L_0x06f5
            r12 = r0[r8]
            r13 = 0
        L_0x06e6:
            if (r13 >= r5) goto L_0x06f2
            byte r14 = r12[r13]
            r15 = 1
            if (r14 != r15) goto L_0x06ef
            int r9 = r9 + 1
        L_0x06ef:
            int r13 = r13 + 1
            goto L_0x06e6
        L_0x06f2:
            int r8 = r8 + 1
            goto L_0x06e1
        L_0x06f5:
            int r0 = r2.f34033c
            int r5 = r2.f34032b
            int r0 = r0 * r5
            int r5 = r9 << 1
            int r5 = r5 - r0
            int r5 = java.lang.Math.abs(r5)
            r12 = 10
            int r5 = r5 * 10
            int r5 = r5 / r0
            int r5 = r5 * 10
            int r5 = r5 + r11
            if (r5 >= r1) goto L_0x070e
            r1 = r5
            r4 = r10
        L_0x070e:
            int r10 = r10 + 1
            r0 = r25
            r18 = r6
            r5 = 8
            goto L_0x0573
        L_0x0718:
            r6 = r18
            p628lh.C18227c.m44954a(r0, r6, r3, r4, r2)
            int r0 = r2.f34032b
            int r1 = r2.f34033c
            r3 = 1
            int r4 = r22 << 1
            int r3 = r0 + r4
            int r4 = r4 + r1
            r10 = r27
            int r5 = java.lang.Math.max(r10, r3)
            r11 = r28
            int r6 = java.lang.Math.max(r11, r4)
            int r3 = r5 / r3
            int r4 = r6 / r4
            int r3 = java.lang.Math.min(r3, r4)
            int r4 = r0 * r3
            int r4 = r5 - r4
            r14 = 2
            int r4 = r4 / r14
            int r7 = r1 * r3
            int r7 = r6 - r7
            int r7 = r7 / r14
            ch.b r8 = new ch.b
            r8.<init>(r5, r6)
            r10 = 0
        L_0x074c:
            if (r10 >= r1) goto L_0x0764
            r6 = r4
            r5 = 0
        L_0x0750:
            if (r5 >= r0) goto L_0x0760
            byte r9 = r2.mo40772b(r5, r10)
            r11 = 1
            if (r9 != r11) goto L_0x075c
            r8.mo40767d(r6, r7, r3, r3)
        L_0x075c:
            int r5 = r5 + 1
            int r6 = r6 + r3
            goto L_0x0750
        L_0x0760:
            int r10 = r10 + 1
            int r7 = r7 + r3
            goto L_0x074c
        L_0x0764:
            return r8
        L_0x0765:
            com.google.zxing.WriterException r1 = new com.google.zxing.WriterException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Interleaving error: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = " and "
            r3.append(r2)
            int r0 = r0.f34026c
            r4 = 7
            int r0 = r0 + r4
            r15 = 8
            int r0 = r0 / r15
            r3.append(r0)
            java.lang.String r0 = " differ."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x078d:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.String r1 = "Data bytes does not match offset"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0795:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.String r1 = "Number of bits and data bytes does not match"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x079d:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.String r1 = "Bits size does not equal capacity"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x07a5:
            com.google.zxing.WriterException r1 = new com.google.zxing.WriterException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "data bits cannot fit in the QR Code"
            r2.<init>(r3)
            int r0 = r0.f34026c
            r2.append(r0)
            java.lang.String r0 = " > "
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = r2.toString()
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x07c3:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r2 = " is bigger than "
            r1.append(r2)
            r16 = 1
            int r10 = r10 + -1
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x07e1:
            r10 = r1
            r11 = r2
            r22 = r6
            r2 = 4
            r12 = 10
            r14 = 2
            r15 = 8
            r16 = 1
            r6 = r4
            r4 = 7
            int r13 = r13 + 1
            r4 = r6
            r2 = r11
            r6 = r22
            r0 = 40
            goto L_0x0302
        L_0x07f9:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            r0.<init>((java.lang.String) r3)
            throw r0
        L_0x07ff:
            r10 = r1
            r11 = r2
            r22 = r6
            r2 = 4
            r12 = 10
            r14 = 2
            r15 = 8
            r16 = 1
            r6 = r4
            r4 = 7
            int r13 = r13 + 1
            r0 = r25
            r4 = r6
            r2 = r11
            r6 = r22
            goto L_0x02b9
        L_0x0817:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            r0.<init>((java.lang.String) r3)
            throw r0
        L_0x081d:
            r10 = r1
            r11 = r2
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Requested dimensions are too small: "
            r1.<init>(r2)
            r1.append(r10)
            r2 = 120(0x78, float:1.68E-43)
            r1.append(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x083b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r26)
            java.lang.String r2 = "Can only encode QR_CODE, but got "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x084b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Found empty contents"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p558ih.C17600b.mo22696i(java.lang.String, com.google.zxing.BarcodeFormat, int, int, java.util.Map):ch.b");
    }
}
