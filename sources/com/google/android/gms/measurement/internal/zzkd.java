package com.google.android.gms.measurement.internal;

final class zzkd implements Runnable {
    public final long zza;
    public final long zzb;
    public final /* synthetic */ zzke zzc;

    public zzkd(zzke zzke, long j, long j2) {
        this.zzc = zzke;
        this.zza = j;
        this.zzb = j2;
    }

    public final void run() {
        this.zzc.zza.zzs.zzaz().zzp(new zzkc(this));
    }
}
