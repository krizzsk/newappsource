package com.google.android.gms.internal.mlkit_vision_face;

public final class zzla {
    public static zzif zza(int i, int i2) {
        zzie zzie;
        zzid zzid = new zzid();
        if (i == -1) {
            zzie = zzie.BITMAP;
        } else if (i == 35) {
            zzie = zzie.YUV_420_888;
        } else if (i == 842094169) {
            zzie = zzie.YV12;
        } else if (i == 16) {
            zzie = zzie.NV16;
        } else if (i != 17) {
            zzie = zzie.UNKNOWN_FORMAT;
        } else {
            zzie = zzie.NV21;
        }
        zzid.zza(zzie);
        zzid.zzb(Integer.valueOf(i2));
        return zzid.zzc();
    }
}
