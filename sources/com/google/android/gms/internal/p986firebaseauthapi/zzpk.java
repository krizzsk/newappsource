package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.Arrays;
import p001a0.C0017h;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpk */
final class zzpk {
    private static final int[] zza = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] zzb = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] zzc = {67108863, 33554431};
    private static final int[] zzd = {26, 25};

    public static void zza(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        zzb(jArr4, jArr2, jArr3);
        zzc(jArr4, jArr);
    }

    /* JADX WARNING: type inference failed for: r46v0, types: [long[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void zzb(long[] r46, long[] r47, long[] r48) {
        /*
            r0 = 0
            r1 = r47[r0]
            r3 = r48[r0]
            long r1 = r1 * r3
            r46[r0] = r1
            r1 = r47[r0]
            r3 = 1
            r4 = r48[r3]
            long r4 = r4 * r1
            r6 = r47[r3]
            r8 = r48[r0]
            long r6 = r6 * r8
            long r6 = r6 + r4
            r46[r3] = r6
            r4 = r47[r3]
            long r6 = r4 + r4
            r16 = r48[r3]
            long r6 = r6 * r16
            r0 = 2
            r10 = r48[r0]
            long r10 = r10 * r1
            long r10 = r10 + r6
            r6 = r47[r0]
            long r6 = r6 * r8
            long r6 = r6 + r10
            r46[r0] = r6
            r6 = r48[r0]
            long r10 = r4 * r6
            r18 = r47[r0]
            long r12 = r18 * r16
            long r12 = r12 + r10
            r0 = 3
            r10 = r48[r0]
            long r10 = r10 * r1
            long r10 = r10 + r12
            r12 = r47[r0]
            long r12 = r12 * r8
            long r12 = r12 + r10
            r46[r0] = r12
            r20 = r48[r0]
            long r10 = r4 * r20
            r22 = r47[r0]
            long r12 = r22 * r16
            long r12 = r12 + r10
            long r10 = r18 * r6
            long r12 = r12 + r12
            long r12 = r12 + r10
            r0 = 4
            r10 = r48[r0]
            long r10 = r10 * r1
            long r10 = r10 + r12
            r12 = r47[r0]
            long r12 = r12 * r8
            long r12 = r12 + r10
            r46[r0] = r12
            long r10 = r18 * r20
            long r12 = r22 * r6
            long r12 = r12 + r10
            r24 = r48[r0]
            long r10 = r4 * r24
            long r10 = r10 + r12
            r26 = r47[r0]
            long r12 = r26 * r16
            long r12 = r12 + r10
            r0 = 5
            r10 = r48[r0]
            long r10 = r10 * r1
            long r10 = r10 + r12
            r12 = r47[r0]
            long r12 = r12 * r8
            long r12 = r12 + r10
            r46[r0] = r12
            long r10 = r22 * r20
            r28 = r48[r0]
            long r12 = r4 * r28
            long r14 = r12 + r10
            r30 = r47[r0]
            r10 = r30
            r12 = r16
            long r10 = p001a0.C0017h.m53J(r10, r12, r14)
            long r12 = r18 * r24
            long r12 = r12 + r10
            long r10 = r26 * r6
            long r10 = r10 + r12
            r0 = 6
            r12 = r48[r0]
            long r12 = r12 * r1
            long r12 = r12 + r10
            r10 = r47[r0]
            long r10 = r10 * r8
            long r10 = r10 + r12
            r46[r0] = r10
            long r10 = r22 * r24
            long r12 = r26 * r20
            long r12 = r12 + r10
            long r10 = r18 * r28
            long r10 = r10 + r12
            long r12 = r30 * r6
            long r12 = r12 + r10
            r34 = r48[r0]
            long r10 = r4 * r34
            long r10 = r10 + r12
            r36 = r47[r0]
            long r12 = r36 * r16
            long r12 = r12 + r10
            r0 = 7
            r10 = r48[r0]
            long r10 = r10 * r1
            long r10 = r10 + r12
            r12 = r47[r0]
            long r12 = r12 * r8
            long r12 = r12 + r10
            r46[r0] = r12
            long r10 = r22 * r28
            long r12 = r30 * r20
            long r12 = r12 + r10
            r38 = r48[r0]
            long r10 = r4 * r38
            long r10 = r10 + r12
            r40 = r47[r0]
            long r12 = r40 * r16
            long r12 = r12 + r10
            long r10 = r26 * r24
            long r12 = r12 + r12
            long r12 = r12 + r10
            long r10 = r18 * r34
            long r10 = r10 + r12
            long r12 = r36 * r6
            long r12 = r12 + r10
            r0 = 8
            r10 = r48[r0]
            long r10 = r10 * r1
            long r10 = r10 + r12
            r12 = r47[r0]
            long r12 = r12 * r8
            long r12 = r12 + r10
            r46[r0] = r12
            long r10 = r26 * r28
            long r12 = r30 * r24
            long r12 = r12 + r10
            long r10 = r22 * r34
            long r10 = r10 + r12
            long r12 = r36 * r20
            long r12 = r12 + r10
            long r10 = r18 * r38
            long r10 = r10 + r12
            long r12 = r40 * r6
            long r12 = r12 + r10
            r42 = r48[r0]
            long r10 = r4 * r42
            long r10 = r10 + r12
            r44 = r47[r0]
            long r12 = r44 * r16
            long r12 = r12 + r10
            r0 = 9
            r10 = r48[r0]
            long r1 = r1 * r10
            long r1 = r1 + r12
            r10 = r47[r0]
            long r10 = r10 * r8
            long r10 = r10 + r1
            r46[r0] = r10
            long r1 = r30 * r28
            long r8 = r22 * r38
            long r8 = r8 + r1
            long r1 = r40 * r20
            long r1 = r1 + r8
            r8 = r48[r0]
            long r4 = r4 * r8
            long r14 = r4 + r1
            r0 = r47[r0]
            r10 = r16
            r12 = r0
            long r2 = p001a0.C0017h.m53J(r10, r12, r14)
            long r4 = r26 * r34
            long r4 = r4 + r2
            long r2 = r36 * r24
            long r2 = r2 + r4
            long r4 = r18 * r42
            long r4 = r4 + r2
            long r2 = r44 * r6
            long r2 = r2 + r4
            r4 = 10
            r46[r4] = r2
            long r2 = r30 * r34
            long r4 = r36 * r28
            long r4 = r4 + r2
            long r2 = r26 * r38
            long r2 = r2 + r4
            long r4 = r40 * r24
            long r4 = r4 + r2
            long r2 = r22 * r42
            long r2 = r2 + r4
            long r4 = r44 * r20
            long r4 = r4 + r2
            long r18 = r18 * r8
            long r18 = r18 + r4
            long r6 = r6 * r0
            long r6 = r6 + r18
            r2 = 11
            r46[r2] = r6
            long r2 = r30 * r38
            long r4 = r40 * r28
            long r4 = r4 + r2
            long r22 = r22 * r8
            long r22 = r22 + r4
            long r20 = r20 * r0
            long r20 = r20 + r22
            long r2 = r36 * r34
            long r20 = r20 + r20
            long r20 = r20 + r2
            long r2 = r26 * r42
            long r2 = r2 + r20
            long r4 = r44 * r24
            long r4 = r4 + r2
            r2 = 12
            r46[r2] = r4
            long r2 = r36 * r38
            long r4 = r40 * r34
            long r4 = r4 + r2
            long r2 = r30 * r42
            long r2 = r2 + r4
            long r4 = r44 * r28
            long r4 = r4 + r2
            long r26 = r26 * r8
            long r26 = r26 + r4
            long r24 = r24 * r0
            long r24 = r24 + r26
            r2 = 13
            r46[r2] = r24
            long r2 = r40 * r38
            long r30 = r30 * r8
            long r32 = r30 + r2
            r30 = r0
            long r2 = p001a0.C0017h.m53J(r28, r30, r32)
            long r4 = r36 * r42
            long r4 = r4 + r2
            long r2 = r44 * r34
            long r2 = r2 + r4
            r4 = 14
            r46[r4] = r2
            long r2 = r40 * r42
            long r4 = r44 * r38
            long r4 = r4 + r2
            long r36 = r36 * r8
            long r36 = r36 + r4
            long r34 = r34 * r0
            long r34 = r34 + r36
            r2 = 15
            r46[r2] = r34
            long r2 = r44 * r42
            long r40 = r40 * r8
            long r38 = r38 * r0
            long r38 = r38 + r40
            long r38 = r38 + r38
            long r38 = r38 + r2
            r2 = 16
            r46[r2] = r38
            long r44 = r44 * r8
            long r42 = r42 * r0
            long r42 = r42 + r44
            r2 = 17
            r46[r2] = r42
            long r0 = r0 + r0
            long r0 = r0 * r8
            r2 = 18
            r46[r2] = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p986firebaseauthapi.zzpk.zzb(long[], long[], long[]):void");
    }

    public static void zzc(long[] jArr, long[] jArr2) {
        zze(jArr);
        zzd(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void zzd(long[] jArr) {
        jArr[10] = 0;
        int i = 0;
        while (i < 10) {
            long j = jArr[i];
            long j2 = j / 67108864;
            jArr[i] = j - (j2 << 26);
            int i2 = i + 1;
            long j3 = jArr[i2] + j2;
            jArr[i2] = j3;
            long j4 = j3 / 33554432;
            jArr[i2] = j3 - (j4 << 25);
            i += 2;
            jArr[i] = jArr[i] + j4;
        }
        long j5 = jArr[0];
        long j6 = jArr[10];
        long j7 = j5 + (j6 << 4);
        jArr[0] = j7;
        long j8 = j6 + j6 + j7;
        jArr[0] = j8;
        long j9 = j8 + j6;
        jArr[0] = j9;
        jArr[10] = 0;
        long j10 = j9 / 67108864;
        jArr[0] = j9 - (j10 << 26);
        jArr[1] = jArr[1] + j10;
    }

    public static void zze(long[] jArr) {
        long j = jArr[8];
        long j2 = jArr[18];
        long j3 = j + (j2 << 4);
        jArr[8] = j3;
        long j4 = j2 + j2 + j3;
        jArr[8] = j4;
        jArr[8] = j4 + j2;
        long j5 = jArr[7];
        long j6 = jArr[17];
        long j7 = j5 + (j6 << 4);
        jArr[7] = j7;
        long j8 = j6 + j6 + j7;
        jArr[7] = j8;
        jArr[7] = j8 + j6;
        long j9 = jArr[6];
        long j10 = jArr[16];
        long j11 = j9 + (j10 << 4);
        jArr[6] = j11;
        long j12 = j10 + j10 + j11;
        jArr[6] = j12;
        jArr[6] = j12 + j10;
        long j13 = jArr[5];
        long j14 = jArr[15];
        long j15 = j13 + (j14 << 4);
        jArr[5] = j15;
        long j16 = j14 + j14 + j15;
        jArr[5] = j16;
        jArr[5] = j16 + j14;
        long j17 = jArr[4];
        long j18 = jArr[14];
        long j19 = j17 + (j18 << 4);
        jArr[4] = j19;
        long j21 = j18 + j18 + j19;
        jArr[4] = j21;
        jArr[4] = j21 + j18;
        long j22 = jArr[3];
        long j23 = jArr[13];
        long j24 = j22 + (j23 << 4);
        jArr[3] = j24;
        long j25 = j23 + j23 + j24;
        jArr[3] = j25;
        jArr[3] = j25 + j23;
        long j26 = jArr[2];
        long j27 = jArr[12];
        long j28 = j26 + (j27 << 4);
        jArr[2] = j28;
        long j29 = j27 + j27 + j28;
        jArr[2] = j29;
        jArr[2] = j29 + j27;
        long j31 = jArr[1];
        long j32 = jArr[11];
        long j33 = j31 + (j32 << 4);
        jArr[1] = j33;
        long j34 = j32 + j32 + j33;
        jArr[1] = j34;
        jArr[1] = j34 + j32;
        long j35 = jArr[0];
        long j36 = jArr[10];
        long j37 = j35 + (j36 << 4);
        jArr[0] = j37;
        long j38 = j36 + j36 + j37;
        jArr[0] = j38;
        jArr[0] = j38 + j36;
    }

    public static void zzf(long[] jArr, long[] jArr2, long j) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] * j;
        }
    }

    public static void zzg(long[] jArr, long[] jArr2) {
        long j = jArr2[0];
        long j2 = jArr2[0];
        long j3 = jArr2[1];
        long j4 = jArr2[2];
        long j5 = j2;
        long j6 = jArr2[2];
        long j7 = jArr2[3];
        long j8 = jArr2[3];
        long j9 = jArr2[4];
        long j10 = jArr2[5];
        long j11 = j2;
        long j12 = jArr2[6] * j2;
        long j13 = j3 + j3;
        long j14 = jArr2[5];
        long j15 = j14;
        long j16 = jArr2[6];
        long j17 = j3 * j16;
        long j18 = jArr2[7];
        long j19 = j2;
        long j21 = jArr2[8];
        long j22 = jArr2[7];
        long j23 = (j8 * j14) + (j3 * j22);
        long j24 = j23 + j23;
        long j25 = j24 + (j21 * j2) + (j6 * j16);
        long j26 = jArr2[8];
        long j27 = j3 * j26;
        long j28 = jArr2[9];
        long j29 = j2;
        long j31 = jArr2[9];
        long j32 = (j3 * j31) + (j8 * j22);
        long j33 = j32 + j32;
        long j34 = j33 + (j6 * j26) + (j9 * j16) + (j14 * j14);
        long j35 = j31;
        long j36 = (j8 * j31) + (j14 * j22);
        long j37 = j36 + j36 + (j9 * j26);
        long j38 = j14 * j26;
        long j39 = (j14 + j14) * j31;
        long j41 = j39 + (j16 * j26) + (j22 * j22);
        zzc(new long[]{j * j, (j2 + j2) * jArr2[1], C0017h.m53J(j4, j5, j3 * j3), C0017h.m53J(j7, j5, j3 * j6), ((j2 + j2) * jArr2[4]) + (j3 * 4 * j8) + (j6 * j6), C0017h.m53J(j10, j11, (j3 * j9) + (j6 * j8)), C0017h.m53J(j13, j15, j12 + (j6 * j9) + (j8 * j8)), C0017h.m53J(j18, j19, j17 + (j6 * j14) + (j8 * j9)), j25 + j25 + (j9 * j9), C0017h.m53J(j29, j28, j27 + (j6 * j22) + (j8 * j16) + (j9 * j14)), j34 + j34, C0017h.m53J(j6, j35, (j8 * j26) + (j9 * j22) + (j14 * j16)), j37 + j37 + (j16 * j16), C0017h.m53J(j9, j31, j38 + (j16 * j22)), j41 + j41, C0017h.m53J(j16, j31, j22 * j26), (j22 * 4 * j31) + (j26 * j26), (j26 + j26) * j31, (j31 + j31) * j31}, jArr);
    }

    public static void zzh(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] - jArr3[i];
        }
    }

    public static void zzi(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] + jArr3[i];
        }
    }

    public static byte[] zzj(long[] jArr) {
        int i;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                break;
            }
            int i3 = 0;
            while (i3 < 9) {
                long j = copyOf[i3];
                int i4 = zzd[i3 & 1];
                int i5 = -((int) (((j >> 31) & j) >> i4));
                copyOf[i3] = j + ((long) (i5 << i4));
                i3++;
                copyOf[i3] = copyOf[i3] - ((long) i5);
            }
            long j2 = copyOf[9];
            int i6 = -((int) (((j2 >> 31) & j2) >> 25));
            copyOf[9] = j2 + ((long) (i6 << 25));
            copyOf[0] = copyOf[0] - ((long) (i6 * 19));
            i2++;
        }
        long j3 = copyOf[0];
        int i7 = -((int) (((j3 >> 31) & j3) >> 26));
        copyOf[0] = j3 + ((long) (i7 << 26));
        copyOf[1] = copyOf[1] - ((long) i7);
        for (int i8 = 0; i8 < 2; i8++) {
            int i9 = 0;
            while (i9 < 9) {
                long j4 = copyOf[i9];
                int i11 = i9 & 1;
                int i12 = zzd[i11];
                copyOf[i9] = ((long) zzc[i11]) & j4;
                i9++;
                copyOf[i9] = copyOf[i9] + ((long) ((int) (j4 >> i12)));
            }
        }
        long j5 = copyOf[9];
        copyOf[9] = 33554431 & j5;
        long j6 = copyOf[0] + ((long) (((int) (j5 >> 25)) * 19));
        copyOf[0] = j6;
        int i13 = ~((((int) j6) - 67108845) >> 31);
        for (int i14 = 1; i14 < 10; i14++) {
            int i15 = ~(((int) copyOf[i14]) ^ zzc[i14 & 1]);
            int i16 = i15 & (i15 << 16);
            int i17 = i16 & (i16 << 8);
            int i18 = i17 & (i17 << 4);
            int i19 = i18 & (i18 << 2);
            i13 &= (i19 & (i19 + i19)) >> 31;
        }
        copyOf[0] = copyOf[0] - ((long) (67108845 & i13));
        long j7 = (long) (33554431 & i13);
        copyOf[1] = copyOf[1] - j7;
        for (i = 2; i < 10; i += 2) {
            copyOf[i] = copyOf[i] - ((long) (67108863 & i13));
            int i21 = i + 1;
            copyOf[i21] = copyOf[i21] - j7;
        }
        for (int i22 = 0; i22 < 10; i22++) {
            copyOf[i22] = copyOf[i22] << zzb[i22];
        }
        byte[] bArr = new byte[32];
        for (int i23 = 0; i23 < 10; i23++) {
            int i24 = zza[i23];
            byte b = bArr[i24];
            long j8 = copyOf[i23];
            bArr[i24] = (byte) ((int) (((long) b) | (j8 & 255)));
            int i25 = i24 + 1;
            bArr[i25] = (byte) ((int) (((long) bArr[i25]) | ((j8 >> 8) & 255)));
            int i26 = i24 + 2;
            bArr[i26] = (byte) ((int) (((long) bArr[i26]) | ((j8 >> 16) & 255)));
            int i27 = i24 + 3;
            bArr[i27] = (byte) ((int) (((j8 >> 24) & 255) | ((long) bArr[i27])));
        }
        return bArr;
    }

    public static long[] zzk(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i = 0; i < 10; i++) {
            int i2 = zza[i];
            jArr[i] = ((((((long) (bArr[i2] & 255)) | (((long) (bArr[i2 + 1] & 255)) << 8)) | (((long) (bArr[i2 + 2] & 255)) << 16)) | (((long) (bArr[i2 + 3] & 255)) << 24)) >> zzb[i]) & ((long) zzc[i & 1]);
        }
        return jArr;
    }
}
