package com.google.android.gms.wallet.callback;

import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

final class zze implements OnCompleteListener {
    private final OnCompleteListener zza;

    public zze(OnCompleteListener onCompleteListener) {
        this.zza = onCompleteListener;
    }

    /* renamed from: zza */
    public final synchronized void complete(PaymentAuthorizationResult paymentAuthorizationResult) {
        OnCompleteListener onCompleteListener = this.zza;
        zzj zza2 = CallbackOutput.zza();
        CallbackOutput callbackOutput = zza2.zza;
        callbackOutput.zza = 1;
        callbackOutput.zzb = 1;
        byte[] serializeToBytes = SafeParcelableSerializer.serializeToBytes(paymentAuthorizationResult);
        CallbackOutput callbackOutput2 = zza2.zza;
        callbackOutput2.zzc = serializeToBytes;
        onCompleteListener.complete(callbackOutput2);
    }
}
