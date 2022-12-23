package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

final class zzehx extends zzbvl {
    public final /* synthetic */ zzehy zza;
    private final zzefb zzb;

    public /* synthetic */ zzehx(zzehy zzehy, zzefb zzefb, zzehw zzehw) {
        this.zza = zzehy;
        this.zzb = zzefb;
    }

    public final void zze(String str) throws RemoteException {
        ((zzegu) this.zzb.zzc).zzi(0, str);
    }

    public final void zzf(zze zze) throws RemoteException {
        ((zzegu) this.zzb.zzc).zzh(zze);
    }

    public final void zzg(zzbuo zzbuo) throws RemoteException {
        this.zza.zzc = zzbuo;
        ((zzegu) this.zzb.zzc).zzo();
    }
}
