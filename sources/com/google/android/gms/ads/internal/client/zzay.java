package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzbhr;
import com.google.android.gms.internal.ads.zzbhs;
import com.google.android.gms.internal.ads.zzbhw;

public final class zzay {
    private static final zzay zza = new zzay();
    private final zzbhr zzb;
    private final zzbhs zzc;
    private final zzbhw zzd;

    public zzay() {
        zzbhr zzbhr = new zzbhr();
        zzbhs zzbhs = new zzbhs();
        zzbhw zzbhw = new zzbhw();
        this.zzb = zzbhr;
        this.zzc = zzbhs;
        this.zzd = zzbhw;
    }

    public static zzbhr zza() {
        return zza.zzb;
    }

    public static zzbhs zzb() {
        return zza.zzc;
    }

    public static zzbhw zzc() {
        return zza.zzd;
    }
}
