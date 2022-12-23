package com.google.android.gms.wallet.callback;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

final class zzb implements OnCompleteListener {
    private Messenger zza;
    private final int zzb;

    public zzb(Messenger messenger, int i) {
        this.zza = messenger;
        this.zzb = i;
    }

    /* renamed from: zza */
    public final synchronized void complete(CallbackOutput callbackOutput) {
        boolean z;
        if (this.zza != null) {
            try {
                if (callbackOutput.zzb != 0) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkArgument(z, "Callback Response Status must be set - status value must be non-zero.");
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.arg1 = this.zzb;
                Bundle bundle = new Bundle();
                bundle.putByteArray("extra_callback_output", SafeParcelableSerializer.serializeToBytes(callbackOutput));
                obtain.setData(bundle);
                Messenger messenger = this.zza;
                if (messenger != null) {
                    messenger.send(obtain);
                }
                this.zza = null;
            } catch (RemoteException unused) {
            }
        }
    }
}
