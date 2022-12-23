package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzfyz {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        long zzb = zzb(bArr3, 0, 0);
        long zzb2 = zzb(bArr3, 3, 2) & 67108611;
        long zzb3 = zzb(bArr3, 6, 4) & 67092735;
        long zzb4 = zzb(bArr3, 9, 6) & 66076671;
        long zzb5 = zzb(bArr3, 12, 8) & 1048575;
        long j = zzb2 * 5;
        long j2 = zzb3 * 5;
        long j3 = zzb4 * 5;
        long j4 = zzb5 * 5;
        int i = 17;
        byte[] bArr5 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i2 = 0;
        while (true) {
            int length = bArr4.length;
            if (i2 < length) {
                int min = Math.min(16, length - i2);
                System.arraycopy(bArr4, i2, bArr5, 0, min);
                bArr5[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr5, min + 1, i, (byte) 0);
                }
                long zzb6 = j9 + zzb(bArr5, 0, 0);
                long zzb7 = j6 + zzb(bArr5, 3, 2);
                long zzb8 = j5 + zzb(bArr5, 6, 4);
                long zzb9 = j7 + zzb(bArr5, 9, 6);
                long zzb10 = j8 + (zzb(bArr5, 12, 8) | ((long) (bArr5[16] << 24)));
                long j10 = (zzb10 * j) + (zzb9 * j2) + (zzb8 * j3) + (zzb7 * j4) + (zzb6 * zzb);
                long j11 = (zzb10 * j2) + (zzb9 * j3) + (zzb8 * j4) + (zzb7 * zzb) + (zzb6 * zzb2) + (j10 >> 26);
                long j12 = (zzb10 * j3) + (zzb9 * j4) + (zzb8 * zzb) + (zzb7 * zzb2) + (zzb6 * zzb3) + (j11 >> 26);
                long j13 = (zzb10 * j4) + (zzb9 * zzb) + (zzb8 * zzb2) + (zzb7 * zzb3) + (zzb6 * zzb4) + (j12 >> 26);
                long j14 = zzb9 * zzb2;
                long j15 = zzb10 * zzb;
                long j16 = j15 + j14 + (zzb8 * zzb3) + (zzb7 * zzb4) + (zzb6 * zzb5) + (j13 >> 26);
                long j17 = ((j16 >> 26) * 5) + (j10 & 67108863);
                j9 = j17 & 67108863;
                j6 = (j11 & 67108863) + (j17 >> 26);
                i2 += 16;
                j8 = j16 & 67108863;
                j7 = j13 & 67108863;
                j5 = j12 & 67108863;
                i = 17;
            } else {
                long j18 = j5 + (j6 >> 26);
                long j19 = j18 & 67108863;
                long j21 = j7 + (j18 >> 26);
                long j22 = j21 & 67108863;
                long j23 = j8 + (j21 >> 26);
                long j24 = j23 & 67108863;
                long j25 = ((j23 >> 26) * 5) + j9;
                long j26 = j25 & 67108863;
                long j27 = (j6 & 67108863) + (j25 >> 26);
                long j28 = j26 + 5;
                long j29 = (j28 >> 26) + j27;
                long j31 = j19 + (j29 >> 26);
                long j32 = j22 + (j31 >> 26);
                long j33 = (j24 + (j32 >> 26)) - 67108864;
                long j34 = j33 >> 63;
                long j35 = ~j34;
                long j36 = (j29 & 67108863 & j35) | (j27 & j34);
                long j37 = (j19 & j34) | (j31 & 67108863 & j35);
                long j38 = (j22 & j34) | (j32 & 67108863 & j35);
                long zzc = (((j26 & j34) | (j28 & 67108863 & j35) | (j36 << 26)) & 4294967295L) + zzc(bArr3, 16);
                long zzc2 = (((j36 >> 6) | (j37 << 20)) & 4294967295L) + zzc(bArr3, 20) + (zzc >> 32);
                long zzc3 = (((j37 >> 12) | (j38 << 14)) & 4294967295L) + zzc(bArr3, 24) + (zzc2 >> 32);
                long zzc4 = zzc(bArr3, 28);
                byte[] bArr6 = new byte[16];
                zzd(bArr6, zzc & 4294967295L, 0);
                zzd(bArr6, zzc2 & 4294967295L, 4);
                zzd(bArr6, zzc3 & 4294967295L, 8);
                zzd(bArr6, ((((((j33 & j35) | (j24 & j34)) << 8) | (j38 >> 18)) & 4294967295L) + zzc4 + (zzc3 >> 32)) & 4294967295L, 12);
                return bArr6;
            }
        }
    }

    private static long zzb(byte[] bArr, int i, int i2) {
        return (zzc(bArr, i) >> i2) & 67108863;
    }

    private static long zzc(byte[] bArr, int i) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & 4294967295L;
    }

    private static void zzd(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) ((int) (255 & j));
            i2++;
            j >>= 8;
        }
    }
}
