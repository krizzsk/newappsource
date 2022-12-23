package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzab implements RemoteCall {
    public final /* synthetic */ FusedLocationProviderClient zza;
    public final /* synthetic */ boolean zzb;

    public /* synthetic */ zzab(FusedLocationProviderClient fusedLocationProviderClient, boolean z) {
        this.zza = fusedLocationProviderClient;
        this.zzb = z;
    }

    public final void accept(Object obj, Object obj2) {
        zzbe zzbe = (zzbe) obj;
        zzbe.zzF(this.zzb, new zzas(this.zza, (TaskCompletionSource) obj2));
    }
}
