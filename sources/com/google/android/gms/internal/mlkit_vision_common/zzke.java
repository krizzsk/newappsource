package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;

public final class zzke {
    public static void zza(zzjt zzjt, int i, int i2, long j, int i3, int i4, int i5, int i6) {
        zzjt.zzb(zzc(i, i2, j, i3, i4, i5, i6), zzgz.INPUT_IMAGE_CONSTRUCTION);
    }

    public static void zzb(zzjt zzjt, int i, int i2, long j, int i3, int i4, int i5, int i6) {
        zzjt.zzb(zzc(i, i2, j, i3, i4, i5, i6), zzgz.ODML_IMAGE);
    }

    private static zzkd zzc(int i, int i2, long j, int i3, int i4, int i5, int i6) {
        return new zzkd(i, i2, i5, i3, i4, SystemClock.elapsedRealtime() - j, i6);
    }
}
