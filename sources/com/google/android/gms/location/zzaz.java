package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

public final /* synthetic */ class zzaz implements RemoteCall {
    public final /* synthetic */ List zza;

    public /* synthetic */ zzaz(List list) {
        this.zza = list;
    }

    public final void accept(Object obj, Object obj2) {
        ((zzbe) obj).zzx(this.zza, new zzba((TaskCompletionSource) obj2));
    }
}
