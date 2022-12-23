package com.google.android.gms.internal.mlkit_vision_face;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzbc {
    public static Object zza(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(C13715c.m34241g(52, "must be power of 2 between 2^1 and 2^30: ", i));
        } else if (i <= 256) {
            return new byte[i];
        } else {
            if (i <= 65536) {
                return new short[i];
            }
            return new int[i];
        }
    }

    public static int zzb(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i];
        }
        return ((int[]) obj)[i];
    }

    public static void zzc(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static int zzd(int i) {
        return (i + 1) * (i < 32 ? 4 : 2);
    }

    public static int zze(@NullableDecl Object obj, @NullableDecl Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, @NullableDecl Object[] objArr2) {
        int i2;
        int i3;
        int zzb = zzbd.zzb(obj);
        int i4 = zzb & i;
        int zzb2 = zzb(obj3, i4);
        if (zzb2 != 0) {
            int i5 = ~i;
            int i6 = zzb & i5;
            int i7 = -1;
            while (true) {
                i2 = zzb2 - 1;
                i3 = iArr[i2];
                if ((i3 & i5) != i6 || !zzw.zza(obj, objArr[i2]) || (objArr2 != null && !zzw.zza(obj2, objArr2[i2]))) {
                    int i8 = i3 & i;
                    if (i8 == 0) {
                        break;
                    }
                    int i9 = i8;
                    i7 = i2;
                    zzb2 = i9;
                }
            }
            int i11 = i3 & i;
            if (i7 == -1) {
                zzc(obj3, i4, i11);
            } else {
                iArr[i7] = (i11 & i) | (iArr[i7] & i5);
            }
            return i2;
        }
        return -1;
    }
}
