package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

final class zzjp implements Runnable {
    public final /* synthetic */ zzjr zza;

    public zzjp(zzjr zzjr) {
        this.zza = zzjr;
    }

    public final void run() {
        zzjs zzjs = this.zza.zza;
        Context zzau = zzjs.zzs.zzau();
        this.zza.zza.zzs.zzaw();
        zzjs.zzo(zzjs, new ComponentName(zzau, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
