package com.google.android.gms.internal.mlkit_common;

public enum zzhz implements zzbg {
    UNKNOWN(0),
    TRANSLATE(1);
    
    private final int zzd;

    private zzhz(int i) {
        this.zzd = i;
    }

    public static zzhz zzb(int i) {
        for (zzhz zzhz : values()) {
            if (zzhz.zzd == i) {
                return zzhz;
            }
        }
        return UNKNOWN;
    }

    public final int zza() {
        return this.zzd;
    }
}
