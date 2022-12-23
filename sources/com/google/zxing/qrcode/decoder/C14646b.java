package com.google.zxing.qrcode.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import java.util.Map;
import p043ch.C13831b;
import p043ch.C13833d;
import p438dh.C16666a;
import p438dh.C16668c;
import p580jh.C17850d;

/* renamed from: com.google.zxing.qrcode.decoder.b */
public final class C14646b {

    /* renamed from: a */
    public final C16668c f36920a = new C16668c(C16666a.f43367l);

    /* renamed from: a */
    public final C13833d mo44169a(C13831b bVar, Map<DecodeHintType, ?> map) throws FormatException, ChecksumException {
        ChecksumException checksumException;
        C14645a aVar = new C14645a(bVar);
        try {
            return mo44170b(aVar, map);
        } catch (FormatException e) {
            e = e;
            checksumException = null;
            try {
                aVar.mo44168e();
                aVar.f36917b = null;
                aVar.f36918c = null;
                aVar.f36919d = true;
                aVar.mo44167d();
                aVar.mo44166c();
                aVar.mo44165b();
                C13833d b = mo44170b(aVar, map);
                b.f34038d = new C17850d();
                return b;
            } catch (ChecksumException | FormatException unused) {
                if (e != null) {
                    throw e;
                }
                throw checksumException;
            }
        } catch (ChecksumException e2) {
            checksumException = e2;
            e = null;
            aVar.mo44168e();
            aVar.f36917b = null;
            aVar.f36918c = null;
            aVar.f36919d = true;
            aVar.mo44167d();
            aVar.mo44166c();
            aVar.mo44165b();
            C13833d b2 = mo44170b(aVar, map);
            b2.f34038d = new C17850d();
            return b2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02db, code lost:
        if (r11 != com.google.zxing.qrcode.decoder.Mode.TERMINATOR) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02dd, code lost:
        r11 = r3.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02e7, code lost:
        if (r4.isEmpty() == false) goto L_0x02eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02e9, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02eb, code lost:
        r12 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02f6, code lost:
        return new p043ch.C13833d(r10, r11, r12, r2.toString(), r6, r7);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p043ch.C13833d mo44170b(com.google.zxing.qrcode.decoder.C14645a r28, java.util.Map<com.google.zxing.DecodeHintType, ?> r29) throws com.google.zxing.FormatException, com.google.zxing.ChecksumException {
        /*
            r27 = this;
            r0 = r28
            jh.e r1 = r28.mo44167d()
            jh.c r2 = r28.mo44166c()
            com.google.zxing.qrcode.decoder.ErrorCorrectionLevel r2 = r2.f45824a
            jh.c r3 = r28.mo44166c()
            jh.e r4 = r28.mo44167d()
            com.google.zxing.qrcode.decoder.DataMask[] r5 = com.google.zxing.qrcode.decoder.DataMask.values()
            byte r3 = r3.f45825b
            r3 = r5[r3]
            ch.b r5 = r0.f36916a
            int r6 = r5.f34028c
            r3.unmaskBitMatrix(r5, r6)
            int r3 = r4.f45829a
            r5 = 4
            int r3 = r3 * 4
            int r3 = r3 + 17
            ch.b r7 = new ch.b
            r7.<init>(r3, r3)
            r8 = 9
            r9 = 0
            r7.mo40767d(r9, r9, r8, r8)
            int r10 = r3 + -8
            r11 = 8
            r7.mo40767d(r10, r9, r11, r8)
            r7.mo40767d(r9, r10, r8, r11)
            int[] r10 = r4.f45830b
            int r10 = r10.length
            r12 = 0
        L_0x0043:
            if (r12 >= r10) goto L_0x006e
            int[] r13 = r4.f45830b
            r13 = r13[r12]
            int r13 = r13 + -2
            r14 = 0
        L_0x004c:
            if (r14 >= r10) goto L_0x006a
            if (r12 != 0) goto L_0x0056
            if (r14 == 0) goto L_0x0066
            int r15 = r10 + -1
            if (r14 == r15) goto L_0x0066
        L_0x0056:
            int r15 = r10 + -1
            if (r12 != r15) goto L_0x005c
            if (r14 == 0) goto L_0x0066
        L_0x005c:
            int[] r15 = r4.f45830b
            r15 = r15[r14]
            int r15 = r15 + -2
            r5 = 5
            r7.mo40767d(r15, r13, r5, r5)
        L_0x0066:
            int r14 = r14 + 1
            r5 = 4
            goto L_0x004c
        L_0x006a:
            int r12 = r12 + 1
            r5 = 4
            goto L_0x0043
        L_0x006e:
            int r5 = r3 + -17
            r10 = 6
            r12 = 1
            r7.mo40767d(r10, r8, r12, r5)
            r7.mo40767d(r8, r10, r5, r12)
            int r5 = r4.f45829a
            r8 = 3
            if (r5 <= r10) goto L_0x0085
            int r3 = r3 + -11
            r7.mo40767d(r3, r9, r8, r10)
            r7.mo40767d(r9, r3, r10, r8)
        L_0x0085:
            int r3 = r4.f45832d
            byte[] r5 = new byte[r3]
            int r13 = r6 + -1
            r14 = r13
            r15 = 0
            r16 = 1
            r17 = 0
            r18 = 0
        L_0x0093:
            r8 = 2
            if (r14 <= 0) goto L_0x00f6
            if (r14 != r10) goto L_0x009a
            int r14 = r14 + -1
        L_0x009a:
            r10 = 0
        L_0x009b:
            if (r10 >= r6) goto L_0x00ea
            if (r16 == 0) goto L_0x00a4
            int r19 = r13 - r10
            r12 = r19
            goto L_0x00a5
        L_0x00a4:
            r12 = r10
        L_0x00a5:
            if (r9 >= r8) goto L_0x00e0
            int r8 = r14 - r9
            boolean r20 = r7.mo40764b(r8, r12)
            if (r20 != 0) goto L_0x00d6
            int r11 = r17 + 1
            int r17 = r18 << 1
            r21 = r6
            ch.b r6 = r0.f36916a
            boolean r6 = r6.mo40764b(r8, r12)
            if (r6 == 0) goto L_0x00c0
            r6 = r17 | 1
            goto L_0x00c2
        L_0x00c0:
            r6 = r17
        L_0x00c2:
            r8 = 8
            if (r11 != r8) goto L_0x00d1
            int r8 = r15 + 1
            byte r6 = (byte) r6
            r5[r15] = r6
            r15 = r8
            r17 = 0
            r18 = 0
            goto L_0x00d8
        L_0x00d1:
            r18 = r6
            r17 = r11
            goto L_0x00d8
        L_0x00d6:
            r21 = r6
        L_0x00d8:
            int r9 = r9 + 1
            r6 = r21
            r8 = 2
            r11 = 8
            goto L_0x00a5
        L_0x00e0:
            r21 = r6
            int r10 = r10 + 1
            r8 = 2
            r9 = 0
            r11 = 8
            r12 = 1
            goto L_0x009b
        L_0x00ea:
            r21 = r6
            r16 = r16 ^ 1
            int r14 = r14 + -2
            r9 = 0
            r10 = 6
            r11 = 8
            r12 = 1
            goto L_0x0093
        L_0x00f6:
            int r0 = r4.f45832d
            if (r15 != r0) goto L_0x0306
            int r0 = r1.f45832d
            if (r3 != r0) goto L_0x0300
            jh.e$b[] r0 = r1.f45831c
            int r3 = r2.ordinal()
            r0 = r0[r3]
            jh.e$a[] r3 = r0.f45836b
            int r4 = r3.length
            r6 = 0
            r7 = 0
        L_0x010b:
            if (r6 >= r4) goto L_0x0115
            r8 = r3[r6]
            int r8 = r8.f45833a
            int r7 = r7 + r8
            int r6 = r6 + 1
            goto L_0x010b
        L_0x0115:
            jh.a[] r4 = new p580jh.C17846a[r7]
            int r6 = r3.length
            r8 = 0
            r9 = 0
        L_0x011a:
            if (r8 >= r6) goto L_0x013a
            r10 = r3[r8]
            r11 = 0
        L_0x011f:
            int r12 = r10.f45833a
            if (r11 >= r12) goto L_0x0137
            int r12 = r10.f45834b
            int r13 = r0.f45835a
            int r13 = r13 + r12
            int r14 = r9 + 1
            jh.a r15 = new jh.a
            byte[] r13 = new byte[r13]
            r15.<init>(r12, r13)
            r4[r9] = r15
            int r11 = r11 + 1
            r9 = r14
            goto L_0x011f
        L_0x0137:
            int r8 = r8 + 1
            goto L_0x011a
        L_0x013a:
            r8 = 0
            r3 = r4[r8]
            byte[] r3 = r3.f45820b
            int r3 = r3.length
            int r6 = r7 + -1
        L_0x0142:
            if (r6 < 0) goto L_0x014e
            r8 = r4[r6]
            byte[] r8 = r8.f45820b
            int r8 = r8.length
            if (r8 == r3) goto L_0x014e
            int r6 = r6 + -1
            goto L_0x0142
        L_0x014e:
            r8 = 1
            int r6 = r6 + r8
            int r0 = r0.f45835a
            int r3 = r3 - r0
            r0 = 0
            r8 = 0
        L_0x0155:
            if (r8 >= r3) goto L_0x016b
            r10 = 0
        L_0x0158:
            if (r10 >= r9) goto L_0x0168
            r11 = r4[r10]
            byte[] r11 = r11.f45820b
            int r12 = r0 + 1
            byte r0 = r5[r0]
            r11[r8] = r0
            int r10 = r10 + 1
            r0 = r12
            goto L_0x0158
        L_0x0168:
            int r8 = r8 + 1
            goto L_0x0155
        L_0x016b:
            r8 = r6
        L_0x016c:
            if (r8 >= r9) goto L_0x017c
            r10 = r4[r8]
            byte[] r10 = r10.f45820b
            int r11 = r0 + 1
            byte r0 = r5[r0]
            r10[r3] = r0
            int r8 = r8 + 1
            r0 = r11
            goto L_0x016c
        L_0x017c:
            r8 = 0
            r10 = r4[r8]
            byte[] r10 = r10.f45820b
            int r10 = r10.length
        L_0x0182:
            if (r3 >= r10) goto L_0x019e
            r11 = 0
        L_0x0185:
            if (r11 >= r9) goto L_0x019b
            if (r11 >= r6) goto L_0x018b
            r12 = r3
            goto L_0x018d
        L_0x018b:
            int r12 = r3 + 1
        L_0x018d:
            r13 = r4[r11]
            byte[] r13 = r13.f45820b
            int r14 = r0 + 1
            byte r0 = r5[r0]
            r13[r12] = r0
            int r11 = r11 + 1
            r0 = r14
            goto L_0x0185
        L_0x019b:
            int r3 = r3 + 1
            goto L_0x0182
        L_0x019e:
            r0 = 0
            r3 = 0
        L_0x01a0:
            if (r0 >= r7) goto L_0x01aa
            r5 = r4[r0]
            int r5 = r5.f45819a
            int r3 = r3 + r5
            int r0 = r0 + 1
            goto L_0x01a0
        L_0x01aa:
            byte[] r10 = new byte[r3]
            r0 = 0
            r3 = 0
        L_0x01ae:
            if (r0 >= r7) goto L_0x01ee
            r5 = r4[r0]
            byte[] r6 = r5.f45820b
            int r5 = r5.f45819a
            int r9 = r6.length
            int[] r11 = new int[r9]
            r12 = 0
        L_0x01ba:
            if (r12 >= r9) goto L_0x01c5
            byte r13 = r6[r12]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11[r12] = r13
            int r12 = r12 + 1
            goto L_0x01ba
        L_0x01c5:
            r15 = r27
            dh.c r9 = r15.f36920a     // Catch:{ ReedSolomonException -> 0x01e9 }
            int r12 = r6.length     // Catch:{ ReedSolomonException -> 0x01e9 }
            int r12 = r12 - r5
            r9.mo49398a(r12, r11)     // Catch:{ ReedSolomonException -> 0x01e9 }
            r9 = 0
        L_0x01cf:
            if (r9 >= r5) goto L_0x01d9
            r12 = r11[r9]
            byte r12 = (byte) r12
            r6[r9] = r12
            int r9 = r9 + 1
            goto L_0x01cf
        L_0x01d9:
            r9 = 0
        L_0x01da:
            if (r9 >= r5) goto L_0x01e6
            int r11 = r3 + 1
            byte r12 = r6[r9]
            r10[r3] = r12
            int r9 = r9 + 1
            r3 = r11
            goto L_0x01da
        L_0x01e6:
            int r0 = r0 + 1
            goto L_0x01ae
        L_0x01e9:
            com.google.zxing.ChecksumException r0 = com.google.zxing.ChecksumException.m36738a()
            throw r0
        L_0x01ee:
            r15 = r27
            char[] r0 = p580jh.C17847b.f45821a
            ch.c r0 = new ch.c
            r0.<init>(r10)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 50
            r3.<init>(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 1
            r4.<init>(r5)
            r6 = -1
            r7 = -1
            r8 = 0
            r9 = 0
        L_0x0208:
            int r11 = r0.mo40771a()     // Catch:{ IllegalArgumentException -> 0x02fb }
            r12 = 4
            if (r11 >= r12) goto L_0x0212
            com.google.zxing.qrcode.decoder.Mode r11 = com.google.zxing.qrcode.decoder.Mode.TERMINATOR     // Catch:{ IllegalArgumentException -> 0x02fb }
            goto L_0x021a
        L_0x0212:
            int r11 = r0.mo40773c(r12)     // Catch:{ IllegalArgumentException -> 0x02fb }
            com.google.zxing.qrcode.decoder.Mode r11 = com.google.zxing.qrcode.decoder.Mode.forBits(r11)     // Catch:{ IllegalArgumentException -> 0x02fb }
        L_0x021a:
            int[] r12 = p580jh.C17847b.C17848a.f45822a     // Catch:{ IllegalArgumentException -> 0x02fb }
            int r13 = r11.ordinal()     // Catch:{ IllegalArgumentException -> 0x02fb }
            r13 = r12[r13]     // Catch:{ IllegalArgumentException -> 0x02fb }
            r14 = 16
            switch(r13) {
                case 5: goto L_0x0276;
                case 6: goto L_0x0299;
                case 7: goto L_0x0299;
                case 8: goto L_0x0283;
                case 9: goto L_0x0243;
                case 10: goto L_0x022f;
                default: goto L_0x0227;
            }     // Catch:{ IllegalArgumentException -> 0x02fb }
        L_0x0227:
            r13 = 8
            int r14 = r11.getCharacterCountBits(r1)     // Catch:{ IllegalArgumentException -> 0x02fb }
            goto L_0x02a0
        L_0x022f:
            r13 = 4
            int r12 = r0.mo40773c(r13)     // Catch:{ IllegalArgumentException -> 0x02fb }
            int r13 = r11.getCharacterCountBits(r1)     // Catch:{ IllegalArgumentException -> 0x02fb }
            int r13 = r0.mo40773c(r13)     // Catch:{ IllegalArgumentException -> 0x02fb }
            r14 = 1
            if (r12 != r14) goto L_0x0276
            p580jh.C17847b.m44228c(r0, r3, r13)     // Catch:{ IllegalArgumentException -> 0x02fb }
            goto L_0x0276
        L_0x0243:
            r8 = 8
            int r12 = r0.mo40773c(r8)     // Catch:{ IllegalArgumentException -> 0x02fb }
            r8 = r12 & 128(0x80, float:1.794E-43)
            if (r8 != 0) goto L_0x0250
            r8 = r12 & 127(0x7f, float:1.78E-43)
            goto L_0x0270
        L_0x0250:
            r8 = r12 & 192(0xc0, float:2.69E-43)
            r13 = 128(0x80, float:1.794E-43)
            if (r8 != r13) goto L_0x0260
            r8 = 8
            int r13 = r0.mo40773c(r8)     // Catch:{ IllegalArgumentException -> 0x02fb }
            r12 = r12 & 63
            int r12 = r12 << r8
            goto L_0x026e
        L_0x0260:
            r8 = r12 & 224(0xe0, float:3.14E-43)
            r13 = 192(0xc0, float:2.69E-43)
            if (r8 != r13) goto L_0x027e
            int r13 = r0.mo40773c(r14)     // Catch:{ IllegalArgumentException -> 0x02fb }
            r8 = r12 & 31
            int r12 = r8 << 16
        L_0x026e:
            r8 = r13 | r12
        L_0x0270:
            com.google.zxing.common.CharacterSetECI r8 = com.google.zxing.common.CharacterSetECI.getCharacterSetECIByValue(r8)     // Catch:{ IllegalArgumentException -> 0x02fb }
            if (r8 == 0) goto L_0x0279
        L_0x0276:
            r13 = 8
            goto L_0x029e
        L_0x0279:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.m36739a()     // Catch:{ IllegalArgumentException -> 0x02fb }
            throw r0     // Catch:{ IllegalArgumentException -> 0x02fb }
        L_0x027e:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.m36739a()     // Catch:{ IllegalArgumentException -> 0x02fb }
            throw r0     // Catch:{ IllegalArgumentException -> 0x02fb }
        L_0x0283:
            int r6 = r0.mo40771a()     // Catch:{ IllegalArgumentException -> 0x02fb }
            if (r6 < r14) goto L_0x0294
            r13 = 8
            int r6 = r0.mo40773c(r13)     // Catch:{ IllegalArgumentException -> 0x02fb }
            int r7 = r0.mo40773c(r13)     // Catch:{ IllegalArgumentException -> 0x02fb }
            goto L_0x029e
        L_0x0294:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.m36739a()     // Catch:{ IllegalArgumentException -> 0x02fb }
            throw r0     // Catch:{ IllegalArgumentException -> 0x02fb }
        L_0x0299:
            r13 = 8
            r5 = 4
            r9 = 1
            goto L_0x02d9
        L_0x029e:
            r5 = 4
            goto L_0x02d9
        L_0x02a0:
            int r14 = r0.mo40773c(r14)     // Catch:{ IllegalArgumentException -> 0x02fb }
            int r16 = r11.ordinal()     // Catch:{ IllegalArgumentException -> 0x02fb }
            r12 = r12[r16]     // Catch:{ IllegalArgumentException -> 0x02fb }
            r5 = 1
            if (r12 == r5) goto L_0x02d5
            r5 = 2
            if (r12 == r5) goto L_0x02d0
            r5 = 3
            if (r12 == r5) goto L_0x02bf
            r5 = 4
            if (r12 != r5) goto L_0x02ba
            p580jh.C17847b.m44229d(r0, r3, r14)     // Catch:{ IllegalArgumentException -> 0x02fb }
            goto L_0x02d9
        L_0x02ba:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.m36739a()     // Catch:{ IllegalArgumentException -> 0x02fb }
            throw r0     // Catch:{ IllegalArgumentException -> 0x02fb }
        L_0x02bf:
            r5 = 4
            r21 = r0
            r22 = r3
            r23 = r14
            r24 = r8
            r25 = r4
            r26 = r29
            p580jh.C17847b.m44227b(r21, r22, r23, r24, r25, r26)     // Catch:{ IllegalArgumentException -> 0x02fb }
            goto L_0x02d9
        L_0x02d0:
            r5 = 4
            p580jh.C17847b.m44226a(r0, r3, r14, r9)     // Catch:{ IllegalArgumentException -> 0x02fb }
            goto L_0x02d9
        L_0x02d5:
            r5 = 4
            p580jh.C17847b.m44230e(r0, r3, r14)     // Catch:{ IllegalArgumentException -> 0x02fb }
        L_0x02d9:
            com.google.zxing.qrcode.decoder.Mode r12 = com.google.zxing.qrcode.decoder.Mode.TERMINATOR     // Catch:{ IllegalArgumentException -> 0x02fb }
            if (r11 != r12) goto L_0x02f7
            ch.d r0 = new ch.d
            java.lang.String r11 = r3.toString()
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x02eb
            r12 = 0
            goto L_0x02ec
        L_0x02eb:
            r12 = r4
        L_0x02ec:
            java.lang.String r13 = r2.toString()
            r9 = r0
            r14 = r6
            r15 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15)
            return r0
        L_0x02f7:
            r15 = r27
            goto L_0x0208
        L_0x02fb:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.m36739a()
            throw r0
        L_0x0300:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0306:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.m36739a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.decoder.C14646b.mo44170b(com.google.zxing.qrcode.decoder.a, java.util.Map):ch.d");
    }
}
