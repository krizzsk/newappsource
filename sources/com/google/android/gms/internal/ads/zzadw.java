package com.google.android.gms.internal.ads;

import com.appboy.support.ValidationUtils;

class zzadw {
    public final int zzd;

    public zzadw(int i) {
        this.zzd = i;
    }

    public static int zze(int i) {
        return (i >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
    }

    public static String zzf(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH));
        sb.append((char) ((i >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH));
        sb.append((char) ((i >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH));
        sb.append((char) (i & ValidationUtils.APPBOY_STRING_MAX_LENGTH));
        return sb.toString();
    }

    public String toString() {
        return zzf(this.zzd);
    }
}
