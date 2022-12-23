package com.google.android.gms.wallet;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.wallet.zzac;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzai implements RemoteCall {
    public final /* synthetic */ PaymentDataRequest zza;

    public /* synthetic */ zzai(PaymentDataRequest paymentDataRequest) {
        this.zza = paymentDataRequest;
    }

    public final void accept(Object obj, Object obj2) {
        ((zzac) obj).zzt(this.zza, (TaskCompletionSource) obj2);
    }
}
