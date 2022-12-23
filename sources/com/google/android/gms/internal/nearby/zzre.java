package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.nearby.uwb.RangingSessionCallback;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzre implements RemoteCall {
    public final /* synthetic */ zzrs zza;
    public final /* synthetic */ RangingSessionCallback zzb;

    public /* synthetic */ zzre(zzrs zzrs, RangingSessionCallback rangingSessionCallback) {
        this.zza = zzrs;
        this.zzb = rangingSessionCallback;
    }

    public final void accept(Object obj, Object obj2) {
        zzrs zzrs = this.zza;
        RangingSessionCallback rangingSessionCallback = this.zzb;
        zzqk zzqk = new zzqk();
        zzqk.zza(new zzrk(zzrs, (TaskCompletionSource) obj2));
        ((zzos) ((zzqs) obj).getService()).zzl(zzqk.zzb());
        zzrs.doUnregisterEventListener(ListenerHolders.createListenerKey(rangingSessionCallback, RangingSessionCallback.class.getName()), 1305);
    }
}
