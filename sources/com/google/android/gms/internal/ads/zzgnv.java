package com.google.android.gms.internal.ads;

final class zzgnv extends zzgnu {
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        if (r13[r14] <= -65) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0083, code lost:
        if (r13[r14] <= -65) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r13[r14] <= -65) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(int r12, byte[] r13, int r14, int r15) {
        /*
            r11 = this;
            r0 = -19
            r1 = -62
            r2 = -16
            r3 = 0
            r4 = -96
            r5 = -32
            r6 = -65
            r7 = -1
            if (r12 == 0) goto L_0x0087
            if (r14 < r15) goto L_0x0013
            return r12
        L_0x0013:
            byte r8 = (byte) r12
            if (r8 >= r5) goto L_0x0022
            if (r8 < r1) goto L_0x0021
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r14 > r6) goto L_0x0021
        L_0x001e:
            r14 = r12
            goto L_0x0087
        L_0x0021:
            return r7
        L_0x0022:
            if (r8 >= r2) goto L_0x004b
            int r12 = r12 >> 8
            int r12 = ~r12
            byte r12 = (byte) r12
            if (r12 != 0) goto L_0x0039
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r12 >= r15) goto L_0x0034
            r10 = r14
            r14 = r12
            r12 = r10
            goto L_0x0039
        L_0x0034:
            int r12 = com.google.android.gms.internal.ads.zzgnx.zzk(r8, r14)
            return r12
        L_0x0039:
            if (r12 > r6) goto L_0x004a
            if (r8 != r5) goto L_0x003f
            if (r12 < r4) goto L_0x004a
        L_0x003f:
            if (r8 != r0) goto L_0x0043
            if (r12 >= r4) goto L_0x004a
        L_0x0043:
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r14 > r6) goto L_0x004a
            goto L_0x001e
        L_0x004a:
            return r7
        L_0x004b:
            int r9 = r12 >> 8
            int r9 = ~r9
            byte r9 = (byte) r9
            if (r9 != 0) goto L_0x005f
            int r12 = r14 + 1
            byte r9 = r13[r14]
            if (r12 >= r15) goto L_0x005a
            r14 = r12
            r12 = 0
            goto L_0x0061
        L_0x005a:
            int r12 = com.google.android.gms.internal.ads.zzgnx.zzk(r8, r9)
            return r12
        L_0x005f:
            int r12 = r12 >> 16
        L_0x0061:
            if (r12 != 0) goto L_0x0072
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r12 >= r15) goto L_0x006d
            r10 = r14
            r14 = r12
            r12 = r10
            goto L_0x0072
        L_0x006d:
            int r12 = com.google.android.gms.internal.ads.zzgnx.zzl(r8, r9, r14)
            return r12
        L_0x0072:
            if (r9 > r6) goto L_0x0086
            int r8 = r8 << 28
            int r9 = r9 + 112
            int r9 = r9 + r8
            int r8 = r9 >> 30
            if (r8 != 0) goto L_0x0086
            if (r12 > r6) goto L_0x0086
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r14 > r6) goto L_0x0086
            goto L_0x001e
        L_0x0086:
            return r7
        L_0x0087:
            if (r14 >= r15) goto L_0x0090
            byte r12 = r13[r14]
            if (r12 < 0) goto L_0x0090
            int r14 = r14 + 1
            goto L_0x0087
        L_0x0090:
            if (r14 < r15) goto L_0x0094
            goto L_0x00f2
        L_0x0094:
            if (r14 < r15) goto L_0x0097
            goto L_0x00f2
        L_0x0097:
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r14 >= 0) goto L_0x00f3
            if (r14 >= r5) goto L_0x00ad
            if (r12 >= r15) goto L_0x00ab
            if (r14 < r1) goto L_0x00a9
            int r14 = r12 + 1
            byte r12 = r13[r12]
            if (r12 <= r6) goto L_0x0094
        L_0x00a9:
            r3 = -1
            goto L_0x00f2
        L_0x00ab:
            r3 = r14
            goto L_0x00f2
        L_0x00ad:
            if (r14 >= r2) goto L_0x00cd
            int r8 = r15 + -1
            if (r12 < r8) goto L_0x00b8
            int r3 = com.google.android.gms.internal.ads.zzgnx.zzc(r13, r12, r15)
            goto L_0x00f2
        L_0x00b8:
            int r8 = r12 + 1
            byte r12 = r13[r12]
            if (r12 > r6) goto L_0x00a9
            if (r14 != r5) goto L_0x00c2
            if (r12 < r4) goto L_0x00a9
        L_0x00c2:
            if (r14 != r0) goto L_0x00c6
            if (r12 >= r4) goto L_0x00a9
        L_0x00c6:
            int r14 = r8 + 1
            byte r12 = r13[r8]
            if (r12 <= r6) goto L_0x0094
            goto L_0x00a9
        L_0x00cd:
            int r8 = r15 + -2
            if (r12 < r8) goto L_0x00d6
            int r3 = com.google.android.gms.internal.ads.zzgnx.zzc(r13, r12, r15)
            goto L_0x00f2
        L_0x00d6:
            int r8 = r12 + 1
            byte r12 = r13[r12]
            if (r12 > r6) goto L_0x00a9
            int r14 = r14 << 28
            int r12 = r12 + 112
            int r12 = r12 + r14
            int r12 = r12 >> 30
            if (r12 != 0) goto L_0x00a9
            int r12 = r8 + 1
            byte r14 = r13[r8]
            if (r14 > r6) goto L_0x00a9
            int r14 = r12 + 1
            byte r12 = r13[r12]
            if (r12 <= r6) goto L_0x0094
            goto L_0x00a9
        L_0x00f2:
            return r3
        L_0x00f3:
            r14 = r12
            goto L_0x0094
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgnv.zza(int, byte[], int, int):int");
    }

    public final String zzb(byte[] bArr, int i, int i2) throws zzgla {
        int i3;
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) >= 0) {
            int i4 = i + i2;
            char[] cArr = new char[i2];
            int i5 = 0;
            while (r12 < i4) {
                byte b = bArr[r12];
                if (!zzgnt.zzd(b)) {
                    break;
                }
                i = r12 + 1;
                cArr[i3] = (char) b;
                i5 = i3 + 1;
            }
            while (r12 < i4) {
                int i6 = r12 + 1;
                byte b2 = bArr[r12];
                if (zzgnt.zzd(b2)) {
                    int i7 = i3 + 1;
                    cArr[i3] = (char) b2;
                    r12 = i6;
                    while (true) {
                        i3 = i7;
                        if (r12 >= i4) {
                            break;
                        }
                        byte b3 = bArr[r12];
                        if (!zzgnt.zzd(b3)) {
                            break;
                        }
                        r12++;
                        i7 = i3 + 1;
                        cArr[i3] = (char) b3;
                    }
                } else if (zzgnt.zzf(b2)) {
                    if (i6 < i4) {
                        zzgnt.zzc(b2, bArr[i6], cArr, i3);
                        r12 = i6 + 1;
                        i3++;
                    } else {
                        throw zzgla.zzd();
                    }
                } else if (zzgnt.zze(b2)) {
                    if (i6 < i4 - 1) {
                        int i8 = i6 + 1;
                        zzgnt.zzb(b2, bArr[i6], bArr[i8], cArr, i3);
                        r12 = i8 + 1;
                        i3++;
                    } else {
                        throw zzgla.zzd();
                    }
                } else if (i6 < i4 - 2) {
                    int i9 = i6 + 1;
                    int i11 = i9 + 1;
                    zzgnt.zza(b2, bArr[i6], bArr[i9], bArr[i11], cArr, i3);
                    i3 += 2;
                    r12 = i11 + 1;
                } else {
                    throw zzgla.zzd();
                }
            }
            return new String(cArr, 0, i3);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)}));
    }
}
