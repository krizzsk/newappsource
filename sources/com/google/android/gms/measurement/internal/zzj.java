package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcf;

final class zzj implements Runnable {
    public final /* synthetic */ zzcf zza;
    public final /* synthetic */ zzaw zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ AppMeasurementDynamiteService zzd;

    public zzj(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcf, zzaw zzaw, String str) {
        this.zzd = appMeasurementDynamiteService;
        this.zza = zzcf;
        this.zzb = zzaw;
        this.zzc = str;
    }

    public final void run() {
        this.zzd.zza.zzt().zzB(this.zza, this.zzb, this.zzc);
    }
}
