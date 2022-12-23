package com.google.android.gms.internal.ads;

import android.content.Context;

final class zzcpb implements zzewf {
    private final zzcrb zza;
    private final zzcpb zzb = this;
    private final zzgqh zzc;
    private final zzgqh zzd;
    private final zzgqh zze;
    private final zzgqh zzf;
    private final zzgqh zzg;
    private final zzgqh zzh;
    private final zzgqh zzi;
    private final zzgqh zzj;
    private final zzgqh zzk;

    public /* synthetic */ zzcpb(zzcrb zzcrb, Context context, String str, zzcpa zzcpa) {
        this.zza = zzcrb;
        zzgpu zza2 = zzgpv.zza(context);
        this.zzc = zza2;
        zzgpu zza3 = zzgpv.zza(str);
        this.zzd = zza3;
        zzeyz zzeyz = new zzeyz(zza2, zzcrb.zzaw, zzcrb.zzax);
        this.zze = zzeyz;
        zzgqh zzc2 = zzgpt.zzc(new zzexd(zzcrb.zzaw));
        this.zzf = zzc2;
        zzgqh zzgqh = zzc2;
        zzgqh zzc3 = zzgpt.zzc(new zzevx(zza2, zzcrb.zzp, zzcrb.zzQ, zzeyz, zzgqh, zzfca.zza(), zzcrb.zzi));
        this.zzg = zzc3;
        this.zzh = zzgpt.zzc(new zzewd(zzcrb.zzQ, zza2, zza3, zzc3, zzgqh, zzcrb.zzi));
        zzeyy zzeyy = new zzeyy(zza2, zzcrb.zzaw, zzcrb.zzax);
        this.zzi = zzeyy;
        zzgqh zzc4 = zzgpt.zzc(new zzexf(zza2, zzcrb.zzp, zzcrb.zzQ, zzeyy, zzgqh, zzfca.zza(), zzcrb.zzi));
        this.zzj = zzc4;
        this.zzk = zzgpt.zzc(new zzexl(zzcrb.zzQ, zza2, zza3, zzc4, zzgqh, zzcrb.zzi));
    }

    public final zzewc zza() {
        return (zzewc) this.zzh.zzb();
    }

    public final zzexk zzb() {
        return (zzexk) this.zzk.zzb();
    }
}
