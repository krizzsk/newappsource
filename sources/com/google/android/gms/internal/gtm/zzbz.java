package com.google.android.gms.internal.gtm;

final class zzbz implements Runnable {
    public final /* synthetic */ zzcb zza;
    public final /* synthetic */ zzey zzb;

    public zzbz(zzcb zzcb, zzey zzey, byte[] bArr) {
        this.zza = zzcb;
        this.zzb = zzey;
    }

    public final void run() {
        if (!this.zza.zza.zzg()) {
            this.zza.zza.zzF("Connected to service after a timeout");
            zzcc.zzi(this.zza.zza, this.zzb);
        }
    }
}
