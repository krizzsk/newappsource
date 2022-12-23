package com.google.android.gms.measurement.internal;

final class zziq implements Runnable {
    public final /* synthetic */ zzik zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ zzis zzc;

    public zziq(zzis zzis, zzik zzik, long j) {
        this.zzc = zzis;
        this.zza = zzik;
        this.zzb = j;
    }

    public final void run() {
        this.zzc.zzB(this.zza, false, this.zzb);
        zzis zzis = this.zzc;
        zzis.zza = null;
        zzis.zzs.zzt().zzG((zzik) null);
    }
}
