package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzoz;

final class zzhx implements Runnable {
    public final /* synthetic */ zzai zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ boolean zze;
    public final /* synthetic */ zzai zzf;
    public final /* synthetic */ zzid zzg;

    public zzhx(zzid zzid, zzai zzai, long j, int i, long j2, boolean z, zzai zzai2) {
        this.zzg = zzid;
        this.zza = zzai;
        this.zzb = j;
        this.zzc = i;
        this.zzd = j2;
        this.zze = z;
        this.zzf = zzai2;
    }

    public final void run() {
        this.zzg.zzV(this.zza);
        this.zzg.zzL(this.zzb, false);
        zzid.zzw(this.zzg, this.zza, this.zzc, this.zzd, true, this.zze);
        zzoz.zzc();
        if (this.zzg.zzs.zzf().zzs((String) null, zzeb.zzas)) {
            zzid.zzv(this.zzg, this.zza, this.zzf);
        }
    }
}
