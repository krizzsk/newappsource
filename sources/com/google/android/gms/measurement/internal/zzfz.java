package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final /* synthetic */ class zzfz implements Runnable {
    public final /* synthetic */ zzgq zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Bundle zzc;

    public /* synthetic */ zzfz(zzgq zzgq, String str, Bundle bundle) {
        this.zza = zzgq;
        this.zzb = str;
        this.zzc = bundle;
    }

    public final void run() {
        this.zza.zzw(this.zzb, this.zzc);
    }
}
