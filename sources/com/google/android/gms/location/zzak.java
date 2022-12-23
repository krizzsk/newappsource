package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzak implements RemoteCall {
    public final /* synthetic */ FusedLocationProviderClient zza;

    public /* synthetic */ zzak(FusedLocationProviderClient fusedLocationProviderClient) {
        this.zza = fusedLocationProviderClient;
    }

    public final void accept(Object obj, Object obj2) {
        ((zzbe) obj).zzu(new LastLocationRequest.Builder().build(), new zzat(this.zza, (TaskCompletionSource) obj2));
    }
}
