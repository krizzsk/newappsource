package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpv */
public final class zzpv {
    public static byte[] zza(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == 32) {
            long[] jArr = new long[11];
            byte[] copyOf = Arrays.copyOf(bArr3, 32);
            copyOf[0] = (byte) (copyOf[0] & 248);
            byte b = copyOf[31] & Byte.MAX_VALUE;
            copyOf[31] = (byte) b;
            copyOf[31] = (byte) (b | 64);
            if (bArr4.length == 32) {
                byte[] copyOf2 = Arrays.copyOf(bArr4, 32);
                copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
                int i = 0;
                while (i < 7) {
                    byte[][] bArr5 = zzot.zza;
                    if (!zzor.zzb(bArr5[i], copyOf2)) {
                        i++;
                    } else {
                        throw new InvalidKeyException("Banned public key: ".concat(zzpl.zza(bArr5[i])));
                    }
                }
                long[] zzk = zzpk.zzk(copyOf2);
                long[] jArr2 = new long[19];
                long[] jArr3 = new long[19];
                jArr3[0] = 1;
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                jArr7[0] = 1;
                long[] jArr8 = new long[19];
                long[] jArr9 = new long[19];
                jArr9[0] = 1;
                System.arraycopy(zzk, 0, jArr2, 0, 10);
                int i2 = 0;
                for (int i3 = 32; i2 < i3; i3 = 32) {
                    byte b2 = copyOf[(32 - i2) - 1] & 255;
                    int i4 = 0;
                    while (i4 < 8) {
                        int i5 = (b2 >> (7 - i4)) & 1;
                        zzot.zza(jArr4, jArr2, i5);
                        zzot.zza(jArr5, jArr3, i5);
                        byte[] bArr6 = copyOf;
                        long[] copyOf3 = Arrays.copyOf(jArr4, 10);
                        byte b3 = b2;
                        long[] jArr10 = jArr;
                        long[] jArr11 = new long[19];
                        int i6 = i2;
                        long[] jArr12 = new long[19];
                        int i7 = i4;
                        long[] jArr13 = new long[19];
                        int i8 = i5;
                        long[] jArr14 = new long[19];
                        long[] jArr15 = jArr9;
                        long[] jArr16 = new long[19];
                        long[] jArr17 = new long[19];
                        zzpk.zzi(jArr4, jArr4, jArr5);
                        zzpk.zzh(jArr5, copyOf3, jArr5);
                        long[] copyOf4 = Arrays.copyOf(jArr2, 10);
                        zzpk.zzi(jArr2, jArr2, jArr3);
                        zzpk.zzh(jArr3, copyOf4, jArr3);
                        zzpk.zzb(jArr13, jArr2, jArr5);
                        zzpk.zzb(jArr14, jArr4, jArr3);
                        zzpk.zze(jArr13);
                        zzpk.zzd(jArr13);
                        zzpk.zze(jArr14);
                        zzpk.zzd(jArr14);
                        long[] jArr18 = jArr2;
                        System.arraycopy(jArr13, 0, copyOf4, 0, 10);
                        zzpk.zzi(jArr13, jArr13, jArr14);
                        zzpk.zzh(jArr14, copyOf4, jArr14);
                        zzpk.zzg(jArr17, jArr13);
                        zzpk.zzg(jArr16, jArr14);
                        zzpk.zzb(jArr14, jArr16, zzk);
                        zzpk.zze(jArr14);
                        zzpk.zzd(jArr14);
                        System.arraycopy(jArr17, 0, jArr6, 0, 10);
                        System.arraycopy(jArr14, 0, jArr7, 0, 10);
                        zzpk.zzg(jArr11, jArr4);
                        zzpk.zzg(jArr12, jArr5);
                        zzpk.zzb(jArr8, jArr11, jArr12);
                        zzpk.zze(jArr8);
                        zzpk.zzd(jArr8);
                        zzpk.zzh(jArr12, jArr11, jArr12);
                        long[] jArr19 = new long[19];
                        Arrays.fill(jArr19, 10, 18, 0);
                        zzpk.zzf(jArr19, jArr12, 121665);
                        zzpk.zzd(jArr19);
                        zzpk.zzi(jArr19, jArr19, jArr11);
                        long[] jArr20 = jArr15;
                        zzpk.zzb(jArr20, jArr12, jArr19);
                        zzpk.zze(jArr20);
                        zzpk.zzd(jArr20);
                        int i9 = i8;
                        zzot.zza(jArr8, jArr6, i9);
                        zzot.zza(jArr20, jArr7, i9);
                        i4 = i7 + 1;
                        byte[] bArr7 = bArr2;
                        jArr9 = jArr5;
                        jArr2 = jArr6;
                        b2 = b3;
                        jArr = jArr10;
                        i2 = i6;
                        jArr6 = jArr18;
                        jArr5 = jArr20;
                        copyOf = bArr6;
                        long[] jArr21 = jArr4;
                        jArr4 = jArr8;
                        jArr8 = jArr21;
                        long[] jArr22 = jArr7;
                        jArr7 = jArr3;
                        jArr3 = jArr22;
                    }
                    byte[] bArr8 = copyOf;
                    long[] jArr23 = jArr9;
                    long[] jArr24 = jArr;
                    long[] jArr25 = jArr2;
                    i2++;
                    byte[] bArr9 = bArr2;
                    copyOf = bArr8;
                }
                long[] jArr26 = jArr;
                long[] jArr27 = new long[10];
                long[] jArr28 = new long[10];
                long[] jArr29 = new long[10];
                long[] jArr30 = new long[10];
                long[] jArr31 = new long[10];
                long[] jArr32 = new long[10];
                long[] jArr33 = new long[10];
                long[] jArr34 = new long[10];
                long[] jArr35 = new long[10];
                long[] jArr36 = new long[10];
                long[] jArr37 = jArr2;
                long[] jArr38 = new long[10];
                zzpk.zzg(jArr28, jArr5);
                zzpk.zzg(jArr38, jArr28);
                zzpk.zzg(jArr36, jArr38);
                zzpk.zza(jArr29, jArr36, jArr5);
                zzpk.zza(jArr30, jArr29, jArr28);
                zzpk.zzg(jArr36, jArr30);
                zzpk.zza(jArr31, jArr36, jArr29);
                zzpk.zzg(jArr36, jArr31);
                zzpk.zzg(jArr38, jArr36);
                zzpk.zzg(jArr36, jArr38);
                zzpk.zzg(jArr38, jArr36);
                zzpk.zzg(jArr36, jArr38);
                zzpk.zza(jArr32, jArr36, jArr31);
                zzpk.zzg(jArr36, jArr32);
                zzpk.zzg(jArr38, jArr36);
                for (int i11 = 2; i11 < 10; i11 += 2) {
                    zzpk.zzg(jArr36, jArr38);
                    zzpk.zzg(jArr38, jArr36);
                }
                zzpk.zza(jArr33, jArr38, jArr32);
                zzpk.zzg(jArr36, jArr33);
                zzpk.zzg(jArr38, jArr36);
                for (int i12 = 2; i12 < 20; i12 += 2) {
                    zzpk.zzg(jArr36, jArr38);
                    zzpk.zzg(jArr38, jArr36);
                }
                zzpk.zza(jArr36, jArr38, jArr33);
                zzpk.zzg(jArr38, jArr36);
                zzpk.zzg(jArr36, jArr38);
                for (int i13 = 2; i13 < 10; i13 += 2) {
                    zzpk.zzg(jArr38, jArr36);
                    zzpk.zzg(jArr36, jArr38);
                }
                zzpk.zza(jArr34, jArr36, jArr32);
                zzpk.zzg(jArr36, jArr34);
                zzpk.zzg(jArr38, jArr36);
                for (int i14 = 2; i14 < 50; i14 += 2) {
                    zzpk.zzg(jArr36, jArr38);
                    zzpk.zzg(jArr38, jArr36);
                }
                zzpk.zza(jArr35, jArr38, jArr34);
                zzpk.zzg(jArr38, jArr35);
                zzpk.zzg(jArr36, jArr38);
                for (int i15 = 2; i15 < 100; i15 += 2) {
                    zzpk.zzg(jArr38, jArr36);
                    zzpk.zzg(jArr36, jArr38);
                }
                zzpk.zza(jArr38, jArr36, jArr35);
                zzpk.zzg(jArr36, jArr38);
                zzpk.zzg(jArr38, jArr36);
                for (int i16 = 2; i16 < 50; i16 += 2) {
                    zzpk.zzg(jArr36, jArr38);
                    zzpk.zzg(jArr38, jArr36);
                }
                zzpk.zza(jArr36, jArr38, jArr34);
                zzpk.zzg(jArr38, jArr36);
                zzpk.zzg(jArr36, jArr38);
                zzpk.zzg(jArr38, jArr36);
                zzpk.zzg(jArr36, jArr38);
                zzpk.zzg(jArr38, jArr36);
                zzpk.zza(jArr27, jArr38, jArr30);
                long[] jArr39 = jArr26;
                zzpk.zza(jArr39, jArr4, jArr27);
                long[] jArr40 = new long[10];
                long[] jArr41 = new long[10];
                long[] jArr42 = new long[11];
                long[] jArr43 = new long[11];
                long[] jArr44 = new long[11];
                zzpk.zza(jArr40, zzk, jArr39);
                zzpk.zzi(jArr41, zzk, jArr39);
                long[] jArr45 = new long[10];
                jArr45[0] = 486662;
                zzpk.zzi(jArr43, jArr41, jArr45);
                zzpk.zza(jArr43, jArr43, jArr3);
                long[] jArr46 = jArr37;
                zzpk.zzi(jArr43, jArr43, jArr46);
                zzpk.zza(jArr43, jArr43, jArr40);
                zzpk.zza(jArr43, jArr43, jArr46);
                zzpk.zzf(jArr42, jArr43, 4);
                zzpk.zzd(jArr42);
                zzpk.zza(jArr43, jArr40, jArr3);
                zzpk.zzh(jArr43, jArr43, jArr3);
                zzpk.zza(jArr44, jArr41, jArr46);
                zzpk.zzi(jArr43, jArr43, jArr44);
                zzpk.zzg(jArr43, jArr43);
                if (zzor.zzb(zzpk.zzj(jArr42), zzpk.zzj(jArr43))) {
                    return zzpk.zzj(jArr39);
                }
                throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(zzpl.zza(bArr2)));
            }
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    public static byte[] zzb(byte[] bArr) throws InvalidKeyException {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return zza(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }
}
