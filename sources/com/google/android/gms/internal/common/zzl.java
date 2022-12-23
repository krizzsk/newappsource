package com.google.android.gms.internal.common;

final class zzl extends zzk {
    private final char zza;

    public zzl(char c) {
        this.zza = c;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("CharMatcher.is('");
        int i = this.zza;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        k.append(String.copyValueOf(cArr));
        k.append("')");
        return k.toString();
    }

    public final boolean zza(char c) {
        return c == this.zza;
    }
}
