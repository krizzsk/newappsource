package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzoz;

final class zzhy implements Runnable {
    public final /* synthetic */ zzai zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ zzai zze;
    public final /* synthetic */ zzid zzf;

    public zzhy(zzid zzid, zzai zzai, int i, long j, boolean z, zzai zzai2) {
        this.zzf = zzid;
        this.zza = zzai;
        this.zzb = i;
        this.zzc = j;
        this.zzd = z;
        this.zze = zzai2;
    }

    public final void run() {
        this.zzf.zzV(this.zza);
        zzid.zzw(this.zzf, this.zza, this.zzb, this.zzc, false, this.zzd);
        zzoz.zzc();
        if (this.zzf.zzs.zzf().zzs((String) null, zzeb.zzas)) {
            zzid.zzv(this.zzf, this.zza, this.zze);
        }
    }
}
