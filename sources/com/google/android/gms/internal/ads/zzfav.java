package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdb;

final class zzfav extends zzfkm {
    public final /* synthetic */ zzdb zza;
    public final /* synthetic */ zzfax zzb;

    public zzfav(zzfax zzfax, zzdb zzdb) {
        this.zzb = zzfax;
        this.zza = zzdb;
    }

    public final void zzv() {
        if (this.zzb.zzg != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e) {
                zzcfi.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
