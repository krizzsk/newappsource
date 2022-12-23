package com.google.android.gms.measurement.internal;

final class zzfx implements Runnable {
    public final /* synthetic */ zzhb zza;
    public final /* synthetic */ zzfy zzb;

    public zzfx(zzfy zzfy, zzhb zzhb) {
        this.zzb = zzfy;
        this.zza = zzhb;
    }

    public final void run() {
        zzfy.zzA(this.zzb, this.zza);
        this.zzb.zzH(this.zza.zzg);
    }
}
