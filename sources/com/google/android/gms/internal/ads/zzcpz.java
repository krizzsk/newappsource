package com.google.android.gms.internal.ads;

import android.content.Context;

final class zzcpz implements zzdxp {
    /* access modifiers changed from: private */
    public final Context zza;
    private final zzbpg zzb;
    private final zzcrb zzc;
    private final zzcpz zzd = this;
    private final zzgqh zze;
    private final zzgqh zzf;
    private final zzgqh zzg;
    private final zzgqh zzh;

    public /* synthetic */ zzcpz(zzcrb zzcrb, Context context, zzbpg zzbpg, zzcpy zzcpy) {
        this.zzc = zzcrb;
        this.zza = context;
        this.zzb = zzbpg;
        zzgpu zza2 = zzgpv.zza(this);
        this.zze = zza2;
        zzgpu zza3 = zzgpv.zza(zzbpg);
        this.zzf = zza3;
        zzdxl zzdxl = new zzdxl(zza3);
        this.zzg = zzdxl;
        this.zzh = zzgpt.zzc(new zzdxn(zza2, zzdxl));
    }

    public final zzdxg zzb() {
        return new zzcpt(this.zzc, this.zzd, (zzcps) null);
    }

    public final zzdxm zzd() {
        return (zzdxm) this.zzh.zzb();
    }
}
