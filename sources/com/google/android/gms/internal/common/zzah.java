package com.google.android.gms.internal.common;

import org.jspecify.nullness.NullMarked;

@NullMarked
public final class zzah {
    public static Object[] zza(Object[] objArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            if (objArr[i2] != null) {
                i2++;
            } else {
                throw new NullPointerException(C16759e.m42349e("at index ", i2));
            }
        }
        return objArr;
    }
}
