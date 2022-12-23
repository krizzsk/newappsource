package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzay implements RemoteCall {
    public final /* synthetic */ GeofencingRequest zza;
    public final /* synthetic */ PendingIntent zzb;

    public /* synthetic */ zzay(GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        this.zza = geofencingRequest;
        this.zzb = pendingIntent;
    }

    public final void accept(Object obj, Object obj2) {
        ((zzbe) obj).zzq(this.zza, this.zzb, new zzba((TaskCompletionSource) obj2));
    }
}
