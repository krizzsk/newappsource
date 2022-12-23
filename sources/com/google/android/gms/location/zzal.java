package com.google.android.gms.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzal implements RemoteCall {
    public final /* synthetic */ FusedLocationProviderClient zza;
    public final /* synthetic */ Location zzb;

    public /* synthetic */ zzal(FusedLocationProviderClient fusedLocationProviderClient, Location location) {
        this.zza = fusedLocationProviderClient;
        this.zzb = location;
    }

    public final void accept(Object obj, Object obj2) {
        zzbe zzbe = (zzbe) obj;
        zzbe.zzE(this.zzb, new zzas(this.zza, (TaskCompletionSource) obj2));
    }
}
