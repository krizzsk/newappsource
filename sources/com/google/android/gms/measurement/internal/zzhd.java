package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final /* synthetic */ class zzhd implements Runnable {
    public final /* synthetic */ zzid zza;
    public final /* synthetic */ Bundle zzb;

    public /* synthetic */ zzhd(zzid zzid, Bundle bundle) {
        this.zza = zzid;
        this.zzb = bundle;
    }

    public final void run() {
        this.zza.zzC(this.zzb);
    }
}
