package com.google.android.gms.wallet;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.wallet.zzac;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzat implements RemoteCall {
    public final /* synthetic */ CreateWalletObjectsRequest zza;

    public /* synthetic */ zzat(CreateWalletObjectsRequest createWalletObjectsRequest) {
        this.zza = createWalletObjectsRequest;
    }

    public final void accept(Object obj, Object obj2) {
        ((zzac) obj).zzq(this.zza, (TaskCompletionSource) obj2);
    }
}
