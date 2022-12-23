package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.internal.location.zzbf;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzan implements RemoteCall {
    public final /* synthetic */ FusedLocationProviderClient zza;
    public final /* synthetic */ zzaw zzb;
    public final /* synthetic */ ListenerHolder zzc;
    public final /* synthetic */ zzbf zzd;

    public /* synthetic */ zzan(FusedLocationProviderClient fusedLocationProviderClient, zzaw zzaw, ListenerHolder listenerHolder, zzbf zzbf) {
        this.zza = fusedLocationProviderClient;
        this.zzb = zzaw;
        this.zzc = listenerHolder;
        this.zzd = zzbf;
    }

    public final void accept(Object obj, Object obj2) {
        FusedLocationProviderClient fusedLocationProviderClient = this.zza;
        zzaw zzaw = this.zzb;
        ListenerHolder listenerHolder = this.zzc;
        ((zzbe) obj).zzB(this.zzd, listenerHolder, new zzau((TaskCompletionSource) obj2, new zzaf(fusedLocationProviderClient, zzaw, listenerHolder), (byte[]) null));
    }
}
