package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzam implements RemoteCall {
    public final /* synthetic */ FusedLocationProviderClient zza;
    public final /* synthetic */ CurrentLocationRequest zzb;
    public final /* synthetic */ CancellationToken zzc;

    public /* synthetic */ zzam(FusedLocationProviderClient fusedLocationProviderClient, CurrentLocationRequest currentLocationRequest, CancellationToken cancellationToken) {
        this.zza = fusedLocationProviderClient;
        this.zzb = currentLocationRequest;
        this.zzc = cancellationToken;
    }

    public final void accept(Object obj, Object obj2) {
        zzbe zzbe = (zzbe) obj;
        zzbe.zzt(this.zzb, this.zzc, new zzat(this.zza, (TaskCompletionSource) obj2));
    }
}
