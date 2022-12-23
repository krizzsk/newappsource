package com.google.android.gms.internal.ads;

public final /* synthetic */ class zzbsi implements Runnable {
    public final /* synthetic */ zzbsj zza;
    public final /* synthetic */ zzbrg zzb;

    public /* synthetic */ zzbsi(zzbsj zzbsj, zzbrg zzbrg) {
        this.zza = zzbsj;
        this.zzb = zzbrg;
    }

    public final void run() {
        zzbrg zzbrg = this.zzb;
        zzbrg.zzr("/result", zzbok.zzo);
        zzbrg.zzc();
    }
}
