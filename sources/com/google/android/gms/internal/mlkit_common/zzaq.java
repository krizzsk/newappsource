package com.google.android.gms.internal.mlkit_common;

public final class zzaq {
    public static Object[] zza(Object[] objArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            if (objArr[i2] != null) {
                i2++;
            } else {
                throw new NullPointerException(C13715c.m34241g(20, "at index ", i2));
            }
        }
        return objArr;
    }
}
