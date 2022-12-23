package com.google.android.gms.internal.icing;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class zzbp {
    public static <T> T zza(@NullableDecl T t) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("expected a non-null reference", 0, 29);
        throw new zzbq(sb.toString());
    }
}
