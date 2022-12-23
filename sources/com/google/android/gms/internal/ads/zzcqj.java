package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

final class zzcqj implements zzezm {
    private final zzcrb zza;
    private final zzcqj zzb = this;
    private final zzgqh zzc;
    private final zzgqh zzd;
    private final zzgqh zze;
    private final zzgqh zzf;
    private final zzgqh zzg;
    private final zzgqh zzh;
    private final zzgqh zzi;

    public /* synthetic */ zzcqj(zzcrb zzcrb, Context context, String str, zzq zzq, zzcqi zzcqi) {
        this.zza = zzcrb;
        zzgpu zza2 = zzgpv.zza(context);
        this.zzc = zza2;
        zzgpu zza3 = zzgpv.zza(zzq);
        this.zzd = zza3;
        zzgpu zza4 = zzgpv.zza(str);
        this.zze = zza4;
        zzgqh zzc2 = zzgpt.zzc(new zzemd(zzcrb.zzo));
        this.zzf = zzc2;
        zzgqh zzc3 = zzgpt.zzc(new zzfak(zzcrb.zzaw));
        this.zzg = zzc3;
        zzgpu zzgpu = zza2;
        zzgqh zzc4 = zzgpt.zzc(new zzezk(zzgpu, zzcrb.zzp, zzcrb.zzQ, zzc2, zzc3, zzfca.zza()));
        this.zzh = zzc4;
        this.zzi = zzgpt.zzc(new zzeml(zzgpu, zza3, zza4, zzc4, zzc2, zzc3, zzcrb.zzi));
    }

    public final zzemk zza() {
        return (zzemk) this.zzi.zzb();
    }
}
