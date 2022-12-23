package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.internal.location.zzbf;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzac implements RemoteCall {
    public final /* synthetic */ zzbf zza;
    public final /* synthetic */ PendingIntent zzb;

    public /* synthetic */ zzac(zzbf zzbf, PendingIntent pendingIntent) {
        this.zza = zzbf;
        this.zzb = pendingIntent;
    }

    public final void accept(Object obj, Object obj2) {
        ((zzbe) obj).zzD(this.zza, this.zzb, new zzav((TaskCompletionSource) obj2));
    }
}
