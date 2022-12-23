package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

final class zzcpl implements zzext {
    private final Context zza;
    private final zzq zzb;
    private final String zzc;
    private final zzcrb zzd;
    private final zzcpl zze = this;
    private final zzgqh zzf;
    private final zzgqh zzg;
    private final zzgqh zzh;
    private final zzgqh zzi;
    private final zzgqh zzj;
    private final zzgqh zzk;

    public /* synthetic */ zzcpl(zzcrb zzcrb, Context context, String str, zzq zzq, zzcpk zzcpk) {
        this.zzd = zzcrb;
        this.zza = context;
        this.zzb = zzq;
        this.zzc = str;
        zzgpu zza2 = zzgpv.zza(context);
        this.zzf = zza2;
        zzgpu zza3 = zzgpv.zza(zzq);
        this.zzg = zza3;
        zzgqh zzc2 = zzgpt.zzc(new zzemd(zzcrb.zzo));
        this.zzh = zzc2;
        zzgqh zzc3 = zzgpt.zzc(zzemi.zza());
        this.zzi = zzc3;
        zzgqh zzc4 = zzgpt.zzc(zzdgp.zza());
        this.zzj = zzc4;
        this.zzk = zzgpt.zzc(new zzexr(zza2, zzcrb.zzp, zza3, zzcrb.zzQ, zzc2, zzc3, zzfca.zza(), zzc4));
    }

    public final zzelj zza() {
        zzcfo zzd2 = this.zzd.zza.zzd();
        zzgqc.zzb(zzd2);
        return new zzelj(this.zza, this.zzb, this.zzc, (zzexq) this.zzk.zzb(), (zzemc) this.zzh.zzb(), zzd2);
    }
}
