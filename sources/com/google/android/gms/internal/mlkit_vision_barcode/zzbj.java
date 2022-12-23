package com.google.android.gms.internal.mlkit_vision_barcode;

final class zzbj {
    public static int zza(int i, String str) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void zzb(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        } else if (obj2 == null) {
            String obj3 = obj.toString();
            throw new NullPointerException(C13715c.m34245k(new StringBuilder(obj3.length() + 26), "null value in entry: ", obj3, "=null"));
        }
    }
}
