package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Message;

final class zzfc implements Handler.Callback {
    public final /* synthetic */ zzfe zza;

    public zzfc(zzfe zzfe) {
        this.zza = zzfe;
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1 && zzff.zza.equals(message.obj)) {
            this.zza.zza.zza();
            if (!this.zza.zza.zzm()) {
                this.zza.zzc(1800000);
            }
        }
        return true;
    }
}
