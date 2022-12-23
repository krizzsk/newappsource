package com.google.android.gms.internal.ads;

import android.content.Context;

final class zzcpx implements zzdxo {
    private final zzcrb zza;
    private Context zzb;
    private zzbpg zzc;

    public /* synthetic */ zzcpx(zzcrb zzcrb, zzcpw zzcpw) {
        this.zza = zzcrb;
    }

    public final /* synthetic */ zzdxo zza(zzbpg zzbpg) {
        zzbpg.getClass();
        this.zzc = zzbpg;
        return this;
    }

    public final /* synthetic */ zzdxo zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    public final zzdxp zzc() {
        zzgqc.zzc(this.zzb, Context.class);
        zzgqc.zzc(this.zzc, zzbpg.class);
        return new zzcpz(this.zza, this.zzb, this.zzc, (zzcpy) null);
    }
}
