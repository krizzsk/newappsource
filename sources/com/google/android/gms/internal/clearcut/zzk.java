package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class zzk {
    private static int zza(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static long zza(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    public static long zza(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        if (length < 0 || length > bArr2.length) {
            throw new IndexOutOfBoundsException(C13715c.m34241g(67, "Out of bound index with offput: 0 and length: ", length));
        }
        int i = 37;
        long j = -5435081209227447693L;
        if (length <= 32) {
            if (length > 16) {
                long j2 = ((long) (length << 1)) - 7286425919675154353L;
                long zzb = zzb(bArr2, 0) * -5435081209227447693L;
                long zzb2 = zzb(bArr2, 8);
                int i2 = length + 0;
                long zzb3 = zzb(bArr2, i2 - 8) * j2;
                return zza((zzb(bArr2, i2 - 16) * -7286425919675154353L) + Long.rotateRight(zzb3, 30) + Long.rotateRight(zzb + zzb2, 43), Long.rotateRight(zzb2 - 7286425919675154353L, 18) + zzb + zzb3, j2);
            } else if (length >= 8) {
                long j3 = ((long) (length << 1)) - 7286425919675154353L;
                long zzb4 = zzb(bArr2, 0) - 7286425919675154353L;
                long zzb5 = zzb(bArr2, (length + 0) - 8);
                return zza((Long.rotateRight(zzb5, 37) * j3) + zzb4, (Long.rotateRight(zzb4, 25) + zzb5) * j3, j3);
            } else if (length >= 4) {
                return zza(((long) length) + ((((long) zza(bArr2, 0)) & 4294967295L) << 3), ((long) zza(bArr2, (length + 0) - 4)) & 4294967295L, ((long) (length << 1)) - 7286425919675154353L);
            } else if (length <= 0) {
                return -7286425919675154353L;
            } else {
                long j4 = (((long) ((bArr2[0] & 255) + ((bArr2[(length >> 1) + 0] & 255) << 8))) * -7286425919675154353L) ^ (((long) (length + ((bArr2[(length - 1) + 0] & 255) << 2))) * -4348849565147123417L);
                return (j4 ^ (j4 >>> 47)) * -7286425919675154353L;
            }
        } else if (length <= 64) {
            long j5 = ((long) (length << 1)) - 7286425919675154353L;
            long zzb6 = zzb(bArr2, 0) * -7286425919675154353L;
            long zzb7 = zzb(bArr2, 8);
            int i3 = length + 0;
            long zzb8 = zzb(bArr2, i3 - 8) * j5;
            long rotateRight = Long.rotateRight(zzb8, 30) + Long.rotateRight(zzb6 + zzb7, 43) + (zzb(bArr2, i3 - 16) * -7286425919675154353L);
            long j6 = j5;
            long zza = zza(rotateRight, Long.rotateRight(zzb7 - 7286425919675154353L, 18) + zzb6 + zzb8, j6);
            long zzb9 = zzb(bArr2, 16) * j5;
            long zzb10 = zzb(bArr2, 24);
            long zzb11 = (rotateRight + zzb(bArr2, i3 - 32)) * j5;
            return zza(Long.rotateRight(zzb11, 30) + Long.rotateRight(zzb9 + zzb10, 43) + ((zza + zzb(bArr2, i3 - 24)) * j5), Long.rotateRight(zzb10 + zzb6, 18) + zzb9 + zzb11, j6);
        } else {
            long j7 = 2480279821605975764L;
            long[] jArr = new long[2];
            long[] jArr2 = new long[2];
            int i4 = length - 1;
            int i5 = ((i4 / 64) << 6) + 0;
            int i6 = i4 & 63;
            int i7 = (i5 + i6) - 63;
            long zzb12 = zzb(bArr2, 0) + 95310865018149119L;
            char c = 0;
            long j8 = 1390051526045402406L;
            int i8 = 0;
            while (true) {
                int i9 = i6;
                long rotateRight2 = (Long.rotateRight(((zzb12 + j7) + jArr[c]) + zzb(bArr2, i8 + 8), i) * j) ^ jArr2[1];
                long zzb13 = jArr[0] + zzb(bArr2, i8 + 40) + (Long.rotateRight(j7 + jArr[1] + zzb(bArr2, i8 + 48), 42) * j);
                long rotateRight3 = Long.rotateRight(j8 + jArr2[0], 33) * j;
                int i11 = i5;
                zza(bArr, i8, jArr[1] * j, rotateRight2 + jArr2[0], jArr);
                zza(bArr, i8 + 32, jArr2[1] + rotateRight3, zzb13 + zzb(bArr2, i8 + 16), jArr2);
                i8 += 64;
                if (i8 == i11) {
                    long j9 = ((rotateRight2 & 255) << 1) - 5435081209227447693L;
                    long j10 = jArr2[0] + ((long) i9);
                    jArr2[0] = j10;
                    long j11 = jArr[0] + j10;
                    jArr[0] = j11;
                    jArr2[0] = jArr2[0] + j11;
                    long rotateRight4 = (Long.rotateRight(((rotateRight3 + zzb13) + jArr[0]) + zzb(bArr2, i7 + 8), 37) * j9) ^ (jArr2[1] * 9);
                    long zzb14 = (jArr[0] * 9) + zzb(bArr2, i7 + 40) + (Long.rotateRight(zzb13 + jArr[1] + zzb(bArr2, i7 + 48), 42) * j9);
                    long rotateRight5 = Long.rotateRight(rotateRight2 + jArr2[0], 33) * j9;
                    zza(bArr, i7, jArr[1] * j9, rotateRight4 + jArr2[0], jArr);
                    zza(bArr, i7 + 32, jArr2[1] + rotateRight5, zzb(bArr2, i7 + 16) + zzb14, jArr2);
                    long j12 = j9;
                    return zza((((zzb14 >>> 47) ^ zzb14) * -4348849565147123417L) + zza(jArr[0], jArr2[0], j12) + rotateRight4, zza(jArr[1], jArr2[1], j12) + rotateRight5, j12);
                }
                i = 37;
                c = 0;
                i5 = i11;
                i6 = i9;
                j = -5435081209227447693L;
                j7 = zzb13;
                long j13 = rotateRight3;
                j8 = rotateRight2;
                zzb12 = j13;
            }
        }
    }

    private static void zza(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long zzb = zzb(bArr, i);
        long zzb2 = zzb(bArr, i + 8);
        long zzb3 = zzb(bArr, i + 16);
        long zzb4 = zzb(bArr, i + 24);
        long j3 = j + zzb;
        long rotateRight = Long.rotateRight(j2 + j3 + zzb4, 21);
        long j4 = zzb2 + j3 + zzb3;
        jArr[0] = j4 + zzb4;
        jArr[1] = Long.rotateRight(j4, 44) + rotateRight + j3;
    }

    private static long zzb(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }
}
