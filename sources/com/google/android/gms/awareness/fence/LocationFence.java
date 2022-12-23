package com.google.android.gms.awareness.fence;

import com.google.android.gms.internal.contextmanager.zzbj;
import com.google.android.gms.internal.contextmanager.zzbx;

public final class LocationFence {
    private LocationFence() {
    }

    public static AwarenessFence entering(double d, double d2, double d3) {
        return zzbj.zzd(zzbx.zza((int) (d * 1.0E7d), (int) (d2 * 1.0E7d), d3));
    }

    public static AwarenessFence exiting(double d, double d2, double d3) {
        return zzbj.zzd(zzbx.zzb((int) (d * 1.0E7d), (int) (d2 * 1.0E7d), d3));
    }

    /* renamed from: in */
    public static AwarenessFence m63927in(double d, double d2, double d3, long j) {
        return zzbj.zzd(zzbx.zzc((int) (d * 1.0E7d), (int) (d2 * 1.0E7d), d3, j));
    }
}
