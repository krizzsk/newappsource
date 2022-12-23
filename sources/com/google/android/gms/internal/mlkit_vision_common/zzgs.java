package com.google.android.gms.internal.mlkit_vision_common;

public enum zzgs implements zzaf {
    SOURCE_UNKNOWN(0),
    BITMAP(1),
    BYTEARRAY(2),
    BYTEBUFFER(3),
    FILEPATH(4),
    ANDROID_MEDIA_IMAGE(5);
    
    private final int zzh;

    private zzgs(int i) {
        this.zzh = i;
    }

    public final int zza() {
        return this.zzh;
    }
}
