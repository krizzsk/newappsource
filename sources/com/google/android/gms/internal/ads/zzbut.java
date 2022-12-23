package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

final class zzbut implements InitializationCompleteCallback {
    public final /* synthetic */ zzbqj zza;

    public zzbut(zzbuy zzbuy, zzbqj zzbqj) {
        this.zza = zzbqj;
    }

    public final void onInitializationFailed(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }

    public final void onInitializationSucceeded() {
        try {
            this.zza.zzf();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }
}
