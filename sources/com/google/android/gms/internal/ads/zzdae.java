package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;

public final class zzdae implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;

    public zzdae(zzgqh zzgqh, zzgqh zzgqh2, zzgqh zzgqh3) {
        this.zza = zzgqh;
        this.zzb = zzgqh2;
        this.zzc = zzgqh3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdvp zzdvp = (zzdvp) this.zza.zzb();
        zzfvk zzfvk = zzcfv.zza;
        zzgqc.zzb(zzfvk);
        zzecv zzecv = (zzecv) this.zzc.zzb();
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzhf)).booleanValue()) {
            return new zzdiy(zzecv, zzfvk);
        }
        return new zzdiy(zzdvp, zzfvk);
    }
}
