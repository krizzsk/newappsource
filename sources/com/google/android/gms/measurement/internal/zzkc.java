package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.appboy.Constants;

public final /* synthetic */ class zzkc implements Runnable {
    public final /* synthetic */ zzkd zza;

    public /* synthetic */ zzkc(zzkd zzkd) {
        this.zza = zzkd;
    }

    public final void run() {
        zzkd zzkd = this.zza;
        zzke zzke = zzkd.zzc;
        long j = zzkd.zza;
        long j2 = zzkd.zzb;
        zzke.zza.zzg();
        zzke.zza.zzs.zzay().zzc().zza("Application going to the background");
        zzke.zza.zzs.zzm().zzl.zza(true);
        Bundle bundle = new Bundle();
        if (!zzke.zza.zzs.zzf().zzu()) {
            zzke.zza.zzb.zzb(j2);
            zzke.zza.zzb.zzd(false, false, j2);
        }
        zzke.zza.zzs.zzq().zzH("auto", Constants.APPBOY_PUSH_APPBOY_KEY, j, bundle);
    }
}
