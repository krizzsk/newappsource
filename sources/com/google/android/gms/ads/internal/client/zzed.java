package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbql;
import java.util.ArrayList;
import java.util.List;

final class zzed extends zzbql {
    public final /* synthetic */ zzee zza;

    public /* synthetic */ zzed(zzee zzee, zzec zzec) {
        this.zza = zzee;
    }

    public final void zzb(List list) throws RemoteException {
        this.zza.zze = false;
        this.zza.zzf = true;
        InitializationStatus zzd = zzee.zzA(list);
        ArrayList zzh = zzee.zzf().zzb;
        int size = zzh.size();
        for (int i = 0; i < size; i++) {
            ((OnInitializationCompleteListener) zzh.get(i)).onInitializationComplete(zzd);
        }
        zzee.zzf().zzb.clear();
    }
}
