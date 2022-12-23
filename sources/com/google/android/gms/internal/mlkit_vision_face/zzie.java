package com.google.android.gms.internal.mlkit_vision_face;

public enum zzie implements zzcu {
    UNKNOWN_FORMAT(0),
    NV16(1),
    NV21(2),
    YV12(3),
    YUV_420_888(7),
    JPEG(8),
    BITMAP(4),
    CM_SAMPLE_BUFFER_REF(5),
    UI_IMAGE(6);
    
    private final int zzj;

    private zzie(int i) {
        this.zzj = i;
    }

    public final int zza() {
        return this.zzj;
    }
}
