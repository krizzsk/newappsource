package com.google.android.gms.wallet;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.wallet.zzac;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzah implements RemoteCall {
    public final /* synthetic */ PaymentCardRecognitionIntentRequest zza;

    public /* synthetic */ zzah(PaymentCardRecognitionIntentRequest paymentCardRecognitionIntentRequest) {
        this.zza = paymentCardRecognitionIntentRequest;
    }

    public final void accept(Object obj, Object obj2) {
        ((zzac) obj).zzr(this.zza, (TaskCompletionSource) obj2);
    }
}
