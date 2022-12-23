package com.google.android.gms.awareness.fence;

import com.google.android.gms.internal.contextmanager.zzba;
import com.google.android.gms.internal.contextmanager.zzbj;

public final class HeadphoneFence {
    private HeadphoneFence() {
    }

    public static AwarenessFence during(int i) {
        return zzbj.zzb(zzba.zza(i));
    }

    public static AwarenessFence pluggingIn() {
        return zzbj.zzb(zzba.zzb());
    }

    public static AwarenessFence unplugging() {
        return zzbj.zzb(zzba.zzc());
    }
}
