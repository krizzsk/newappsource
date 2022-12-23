package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;
import java.util.Arrays;

public final class zzgil {
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
                    byte[][] bArr5 = zzghh.zza;
                    if (!zzghf.zzb(bArr5[i], copyOf2)) {
                        i++;
                    } else {
                        throw new InvalidKeyException("Banned public key: ".concat(zzgia.zza(bArr5[i])));
                    }
                }
                long[] zzk = zzghz.zzk(copyOf2);
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
                        zzghh.zza(jArr4, jArr2, i5);
                        zzghh.zza(jArr5, jArr3, i5);
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
                        zzghz.zzi(jArr4, jArr4, jArr5);
                        zzghz.zzh(jArr5, copyOf3, jArr5);
                        long[] copyOf4 = Arrays.copyOf(jArr2, 10);
                        zzghz.zzi(jArr2, jArr2, jArr3);
                        zzghz.zzh(jArr3, copyOf4, jArr3);
                        zzghz.zzb(jArr13, jArr2, jArr5);
                        zzghz.zzb(jArr14, jArr4, jArr3);
                        zzghz.zze(jArr13);
                        zzghz.zzd(jArr13);
                        zzghz.zze(jArr14);
                        zzghz.zzd(jArr14);
                        long[] jArr18 = jArr2;
                        System.arraycopy(jArr13, 0, copyOf4, 0, 10);
                        zzghz.zzi(jArr13, jArr13, jArr14);
                        zzghz.zzh(jArr14, copyOf4, jArr14);
                        zzghz.zzg(jArr17, jArr13);
                        zzghz.zzg(jArr16, jArr14);
                        zzghz.zzb(jArr14, jArr16, zzk);
                        zzghz.zze(jArr14);
                        zzghz.zzd(jArr14);
                        System.arraycopy(jArr17, 0, jArr6, 0, 10);
                        System.arraycopy(jArr14, 0, jArr7, 0, 10);
                        zzghz.zzg(jArr11, jArr4);
                        zzghz.zzg(jArr12, jArr5);
                        zzghz.zzb(jArr8, jArr11, jArr12);
                        zzghz.zze(jArr8);
                        zzghz.zzd(jArr8);
                        zzghz.zzh(jArr12, jArr11, jArr12);
                        long[] jArr19 = new long[19];
                        Arrays.fill(jArr19, 10, 18, 0);
                        zzghz.zzf(jArr19, jArr12, 121665);
                        zzghz.zzd(jArr19);
                        zzghz.zzi(jArr19, jArr19, jArr11);
                        long[] jArr20 = jArr15;
                        zzghz.zzb(jArr20, jArr12, jArr19);
                        zzghz.zze(jArr20);
                        zzghz.zzd(jArr20);
                        int i9 = i8;
                        zzghh.zza(jArr8, jArr6, i9);
                        zzghh.zza(jArr20, jArr7, i9);
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
                zzghz.zzg(jArr28, jArr5);
                zzghz.zzg(jArr38, jArr28);
                zzghz.zzg(jArr36, jArr38);
                zzghz.zza(jArr29, jArr36, jArr5);
                zzghz.zza(jArr30, jArr29, jArr28);
                zzghz.zzg(jArr36, jArr30);
                zzghz.zza(jArr31, jArr36, jArr29);
                zzghz.zzg(jArr36, jArr31);
                zzghz.zzg(jArr38, jArr36);
                zzghz.zzg(jArr36, jArr38);
                zzghz.zzg(jArr38, jArr36);
                zzghz.zzg(jArr36, jArr38);
                zzghz.zza(jArr32, jArr36, jArr31);
                zzghz.zzg(jArr36, jArr32);
                zzghz.zzg(jArr38, jArr36);
                for (int i11 = 2; i11 < 10; i11 += 2) {
                    zzghz.zzg(jArr36, jArr38);
                    zzghz.zzg(jArr38, jArr36);
                }
                zzghz.zza(jArr33, jArr38, jArr32);
                zzghz.zzg(jArr36, jArr33);
                zzghz.zzg(jArr38, jArr36);
                for (int i12 = 2; i12 < 20; i12 += 2) {
                    zzghz.zzg(jArr36, jArr38);
                    zzghz.zzg(jArr38, jArr36);
                }
                zzghz.zza(jArr36, jArr38, jArr33);
                zzghz.zzg(jArr38, jArr36);
                zzghz.zzg(jArr36, jArr38);
                for (int i13 = 2; i13 < 10; i13 += 2) {
                    zzghz.zzg(jArr38, jArr36);
                    zzghz.zzg(jArr36, jArr38);
                }
                zzghz.zza(jArr34, jArr36, jArr32);
                zzghz.zzg(jArr36, jArr34);
                zzghz.zzg(jArr38, jArr36);
                for (int i14 = 2; i14 < 50; i14 += 2) {
                    zzghz.zzg(jArr36, jArr38);
                    zzghz.zzg(jArr38, jArr36);
                }
                zzghz.zza(jArr35, jArr38, jArr34);
                zzghz.zzg(jArr38, jArr35);
                zzghz.zzg(jArr36, jArr38);
                for (int i15 = 2; i15 < 100; i15 += 2) {
                    zzghz.zzg(jArr38, jArr36);
                    zzghz.zzg(jArr36, jArr38);
                }
                zzghz.zza(jArr38, jArr36, jArr35);
                zzghz.zzg(jArr36, jArr38);
                zzghz.zzg(jArr38, jArr36);
                for (int i16 = 2; i16 < 50; i16 += 2) {
                    zzghz.zzg(jArr36, jArr38);
                    zzghz.zzg(jArr38, jArr36);
                }
                zzghz.zza(jArr36, jArr38, jArr34);
                zzghz.zzg(jArr38, jArr36);
                zzghz.zzg(jArr36, jArr38);
                zzghz.zzg(jArr38, jArr36);
                zzghz.zzg(jArr36, jArr38);
                zzghz.zzg(jArr38, jArr36);
                zzghz.zza(jArr27, jArr38, jArr30);
                long[] jArr39 = jArr26;
                zzghz.zza(jArr39, jArr4, jArr27);
                long[] jArr40 = new long[10];
                long[] jArr41 = new long[10];
                long[] jArr42 = new long[11];
                long[] jArr43 = new long[11];
                long[] jArr44 = new long[11];
                zzghz.zza(jArr40, zzk, jArr39);
                zzghz.zzi(jArr41, zzk, jArr39);
                long[] jArr45 = new long[10];
                jArr45[0] = 486662;
                zzghz.zzi(jArr43, jArr41, jArr45);
                zzghz.zza(jArr43, jArr43, jArr3);
                long[] jArr46 = jArr37;
                zzghz.zzi(jArr43, jArr43, jArr46);
                zzghz.zza(jArr43, jArr43, jArr40);
                zzghz.zza(jArr43, jArr43, jArr46);
                zzghz.zzf(jArr42, jArr43, 4);
                zzghz.zzd(jArr42);
                zzghz.zza(jArr43, jArr40, jArr3);
                zzghz.zzh(jArr43, jArr43, jArr3);
                zzghz.zza(jArr44, jArr41, jArr46);
                zzghz.zzi(jArr43, jArr43, jArr44);
                zzghz.zzg(jArr43, jArr43);
                if (zzghf.zzb(zzghz.zzj(jArr42), zzghz.zzj(jArr43))) {
                    return zzghz.zzj(jArr39);
                }
                throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(zzgia.zza(bArr2)));
            }
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    public static byte[] zzb() {
        byte[] zza = zzgii.zza(32);
        zza[0] = (byte) (zza[0] | 7);
        byte b = zza[31] & 63;
        zza[31] = (byte) b;
        zza[31] = (byte) (b | 128);
        return zza;
    }

    public static byte[] zzc(byte[] bArr) throws InvalidKeyException {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return zza(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }
}
