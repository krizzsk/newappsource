package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdk;

public final /* synthetic */ class zzegg implements zzcxu {
    public final /* synthetic */ zzefb zza;

    public /* synthetic */ zzegg(zzefb zzefb) {
        this.zza = zzefb;
    }

    public final zzdk zza() {
        try {
            return ((zzbvs) this.zza.zzb).zze();
        } catch (RemoteException e) {
            throw new zzfcd(e);
        }
    }
}
