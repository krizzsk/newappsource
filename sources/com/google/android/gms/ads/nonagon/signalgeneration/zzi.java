package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdwb;

public final /* synthetic */ class zzi implements Runnable {
    public final /* synthetic */ zzz zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ zzdwb zzd;

    public /* synthetic */ zzi(zzz zzz, String str, String str2, zzdwb zzdwb) {
        this.zza = zzz;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzdwb;
    }

    public final void run() {
        this.zza.zzH(this.zzb, this.zzc, this.zzd);
    }
}
