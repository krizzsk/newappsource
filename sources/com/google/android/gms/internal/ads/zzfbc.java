package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbw;

final class zzfbc extends zzfkm {
    public final /* synthetic */ zzbw zza;
    public final /* synthetic */ zzfbd zzb;

    public zzfbc(zzfbd zzfbd, zzbw zzbw) {
        this.zzb = zzfbd;
        this.zza = zzbw;
    }

    public final void zzv() {
        if (this.zzb.zzd != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e) {
                zzcfi.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
