package com.google.android.gms.internal.mlkit_vision_barcode;

public enum zzki implements zzdh {
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    TYPE_GMV(3);
    
    private final int zzf;

    private zzki(int i) {
        this.zzf = i;
    }

    public final int zza() {
        return this.zzf;
    }
}
