package com.google.android.gms.measurement.internal;

final class zzhw implements Runnable {
    public final /* synthetic */ Boolean zza;
    public final /* synthetic */ zzid zzb;

    public zzhw(zzid zzid, Boolean bool) {
        this.zzb = zzid;
        this.zza = bool;
    }

    public final void run() {
        this.zzb.zzaa(this.zza, true);
    }
}
