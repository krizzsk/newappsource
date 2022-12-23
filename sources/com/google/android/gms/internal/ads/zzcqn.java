package com.google.android.gms.internal.ads;

import android.content.Context;

final class zzcqn implements zzfba {
    private final zzcrb zza;
    private final zzcqn zzb = this;
    private final zzgqh zzc;
    private final zzgqh zzd;
    private final zzgqh zze;
    private final zzgqh zzf;
    private final zzgqh zzg;
    private final zzgqh zzh;
    private final zzgqh zzi;
    private final zzgqh zzj;

    public /* synthetic */ zzcqn(zzcrb zzcrb, Context context, String str, zzcqm zzcqm) {
        this.zza = zzcrb;
        zzgpu zza2 = zzgpv.zza(context);
        this.zzc = zza2;
        zzeza zzeza = new zzeza(zza2, zzcrb.zzaw, zzcrb.zzax);
        this.zzd = zzeza;
        zzgqh zzc2 = zzgpt.zzc(new zzfak(zzcrb.zzaw));
        this.zze = zzc2;
        zzgqh zzc3 = zzgpt.zzc(zzfbv.zza());
        this.zzf = zzc3;
        zzgqh zzc4 = zzgpt.zzc(new zzfau(zza2, zzcrb.zzp, zzcrb.zzQ, zzeza, zzc2, zzfca.zza(), zzc3));
        this.zzg = zzc4;
        this.zzh = zzgpt.zzc(new zzfbe(zzc4, zzc2, zzc3));
        zzgpu zzc5 = zzgpv.zzc(str);
        this.zzi = zzc5;
        this.zzj = zzgpt.zzc(new zzfay(zzc5, zzc4, zza2, zzc2, zzc3, zzcrb.zzi));
    }

    public final zzfax zza() {
        return (zzfax) this.zzj.zzb();
    }

    public final zzfbd zzb() {
        return (zzfbd) this.zzh.zzb();
    }
}
