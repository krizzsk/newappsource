package com.google.android.gms.wallet.callback;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.internal.wallet.zzh;

final class zza extends zzh {
    public final /* synthetic */ zzd zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zza(zzd zzd, Looper looper) {
        super(looper);
        this.zza = zzd;
    }

    public final void handleMessage(Message message) {
        if (message.replyTo != null) {
            byte[] byteArray = message.getData().getByteArray("extra_callback_input");
            Preconditions.checkNotNull(byteArray);
            String string = message.getData().getString("message_task_tag");
            Preconditions.checkNotNull(string);
            this.zza.zza.execute(new zzc(this.zza, (CallbackInput) SafeParcelableSerializer.deserializeFromBytes(byteArray, CallbackInput.CREATOR), message.replyTo, string, message.arg1));
        }
    }
}
