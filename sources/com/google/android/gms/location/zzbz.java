package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzbz implements RemoteCall {
    public final /* synthetic */ LocationSettingsRequest zza;

    public /* synthetic */ zzbz(LocationSettingsRequest locationSettingsRequest) {
        this.zza = locationSettingsRequest;
    }

    public final void accept(Object obj, Object obj2) {
        ((zzbe) obj).zzr(this.zza, new zzca((TaskCompletionSource) obj2), (String) null);
    }
}
