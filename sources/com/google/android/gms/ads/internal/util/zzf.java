package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzfnu;

public final class zzf extends zzfnu {
    public zzf(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            zzt.zzo().zzt(e, "AdMobHandler.handleMessage");
        }
    }

    public final void zza(Message message) {
        try {
            super.zza(message);
        } catch (Throwable th) {
            zzt.zzp();
            zzs.zzH(zzt.zzo().zzc(), th);
            throw th;
        }
    }
}
