package com.google.android.gms.internal.mlkit_vision_face;

public final class zzbz {
    public static Object[] zza(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            zzb(objArr[i2], i2);
        }
        return objArr;
    }

    public static Object zzb(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(C13715c.m34241g(20, "at index ", i));
    }
}
