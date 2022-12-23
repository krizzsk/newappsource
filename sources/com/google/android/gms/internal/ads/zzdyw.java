package com.google.android.gms.internal.ads;

public enum zzdyw {
    NONE,
    SHAKE,
    FLICK;

    public static zzdyw zza(String str) {
        return (zzdyw) Enum.valueOf(zzdyw.class, str);
    }
}
