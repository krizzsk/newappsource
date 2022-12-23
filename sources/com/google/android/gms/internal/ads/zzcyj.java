package com.google.android.gms.internal.ads;

final class zzcyj implements zzfuw {
    public final /* synthetic */ zzfuw zza;
    public final /* synthetic */ zzcyk zzb;

    public zzcyj(zzcyk zzcyk, zzfuw zzfuw) {
        this.zzb = zzcyk;
        this.zza = zzfuw;
    }

    public final void zza(Throwable th) {
        zzcfv.zze.execute(new zzcyh(this.zzb));
        this.zza.zza(th);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcfv.zze.execute(new zzcyh(this.zzb));
        this.zza.zzb((zzcxw) obj);
    }
}
