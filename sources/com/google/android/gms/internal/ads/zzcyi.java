package com.google.android.gms.internal.ads;

final class zzcyi implements zzfuw {
    public final /* synthetic */ zzfuw zza;
    public final /* synthetic */ zzcyk zzb;

    public zzcyi(zzcyk zzcyk, zzfuw zzfuw) {
        this.zzb = zzcyk;
        this.zza = zzfuw;
    }

    public final void zza(Throwable th) {
        this.zza.zza(th);
        zzcfv.zze.execute(new zzcyh(this.zzb));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcyk.zzb(this.zzb, ((zzcyd) obj).zza, this.zza);
    }
}
