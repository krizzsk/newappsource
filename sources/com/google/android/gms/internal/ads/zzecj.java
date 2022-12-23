package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzaz;
import com.google.android.gms.ads.internal.util.zze;

final class zzecj implements zzfuw {
    public final /* synthetic */ zzbzq zza;

    public zzecj(zzecn zzecn, zzbzq zzbzq) {
        this.zza = zzbzq;
    }

    public final void zza(Throwable th) {
        try {
            this.zza.zze(zzaz.zza(th));
        } catch (RemoteException e) {
            zze.zzb("Service can't call client", e);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zzf((ParcelFileDescriptor) obj);
        } catch (RemoteException e) {
            zze.zzb("Service can't call client", e);
        }
    }
}
