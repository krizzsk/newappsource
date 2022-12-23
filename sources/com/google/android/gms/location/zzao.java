package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzao implements RemoteCall {
    public final /* synthetic */ FusedLocationProviderClient zza;
    public final /* synthetic */ LastLocationRequest zzb;

    public /* synthetic */ zzao(FusedLocationProviderClient fusedLocationProviderClient, LastLocationRequest lastLocationRequest) {
        this.zza = fusedLocationProviderClient;
        this.zzb = lastLocationRequest;
    }

    public final void accept(Object obj, Object obj2) {
        zzbe zzbe = (zzbe) obj;
        zzbe.zzu(this.zzb, new zzat(this.zza, (TaskCompletionSource) obj2));
    }
}
