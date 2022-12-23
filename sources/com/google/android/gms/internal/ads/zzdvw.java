package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;

public final class zzdvw implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;

    public zzdvw(zzgqh zzgqh, zzgqh zzgqh2, zzgqh zzgqh3) {
        this.zza = zzgqh;
        this.zzb = zzgqh2;
        this.zzc = zzgqh3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdwj zzdwj = (zzdwj) this.zza.zzb();
        zzfvk zzfvk = zzcfv.zza;
        zzgqc.zzb(zzfvk);
        zzede zzede = (zzede) this.zzc.zzb();
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzhf)).booleanValue()) {
            return new zzdiy(zzede, zzfvk);
        }
        return new zzdiy(zzdwj, zzfvk);
    }
}
