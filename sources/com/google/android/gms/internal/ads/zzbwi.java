package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzt;

final class zzbwi implements Runnable {
    public final /* synthetic */ AdOverlayInfoParcel zza;
    public final /* synthetic */ zzbwj zzb;

    public zzbwi(zzbwj zzbwj, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzb = zzbwj;
        this.zza = adOverlayInfoParcel;
    }

    public final void run() {
        zzt.zzj();
        zzm.zza(this.zzb.zza, this.zza, true);
    }
}
