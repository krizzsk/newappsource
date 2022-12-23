package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class zzin implements Runnable {
    public final /* synthetic */ zzik zza;
    public final /* synthetic */ zzik zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ zzis zze;

    public zzin(zzis zzis, zzik zzik, zzik zzik2, long j, boolean z) {
        this.zze = zzis;
        this.zza = zzik;
        this.zzb = zzik2;
        this.zzc = j;
        this.zzd = z;
    }

    public final void run() {
        this.zze.zzA(this.zza, this.zzb, this.zzc, this.zzd, (Bundle) null);
    }
}
