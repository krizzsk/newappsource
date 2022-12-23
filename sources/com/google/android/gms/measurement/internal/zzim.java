package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class zzim implements Runnable {
    public final /* synthetic */ Bundle zza;
    public final /* synthetic */ zzik zzb;
    public final /* synthetic */ zzik zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ zzis zze;

    public zzim(zzis zzis, Bundle bundle, zzik zzik, zzik zzik2, long j) {
        this.zze = zzis;
        this.zza = bundle;
        this.zzb = zzik;
        this.zzc = zzik2;
        this.zzd = j;
    }

    public final void run() {
        zzis.zzp(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
