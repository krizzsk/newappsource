package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

final class zzdyh extends zzbqi {
    public final /* synthetic */ Object zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ zzfhg zzd;
    public final /* synthetic */ zzcga zze;
    public final /* synthetic */ zzdyi zzf;

    public zzdyh(zzdyi zzdyi, Object obj, String str, long j, zzfhg zzfhg, zzcga zzcga) {
        this.zzf = zzdyi;
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzfhg;
        this.zze = zzcga;
    }

    public final void zze(String str) {
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (zzt.zzA().elapsedRealtime() - this.zzc));
            this.zzf.zzl.zzb(this.zzb, "error");
            this.zzf.zzo.zzb(this.zzb, "error");
            zzfhs zze2 = this.zzf.zzp;
            zzfhg zzfhg = this.zzd;
            zzfhg.zze(false);
            zze2.zzb(zzfhg.zzj());
            this.zze.zzd(Boolean.FALSE);
        }
    }

    public final void zzf() {
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, "", (int) (zzt.zzA().elapsedRealtime() - this.zzc));
            this.zzf.zzl.zzd(this.zzb);
            this.zzf.zzo.zzd(this.zzb);
            zzfhs zze2 = this.zzf.zzp;
            zzfhg zzfhg = this.zzd;
            zzfhg.zze(true);
            zze2.zzb(zzfhg.zzj());
            this.zze.zzd(Boolean.TRUE);
        }
    }
}
