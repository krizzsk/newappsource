package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

final class zzehi extends zzbvi {
    private final zzefb zza;

    public /* synthetic */ zzehi(zzehj zzehj, zzefb zzefb, zzehh zzehh) {
        this.zza = zzefb;
    }

    public final void zze(String str) throws RemoteException {
        ((zzegu) this.zza.zzc).zzi(0, str);
    }

    public final void zzf(zze zze) throws RemoteException {
        ((zzegu) this.zza.zzc).zzh(zze);
    }

    public final void zzg() throws RemoteException {
        ((zzegu) this.zza.zzc).zzo();
    }
}
