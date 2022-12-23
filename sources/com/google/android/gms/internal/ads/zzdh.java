package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

public final /* synthetic */ class zzdh implements Handler.Callback {
    public final /* synthetic */ zzdm zza;

    public /* synthetic */ zzdh(zzdm zzdm) {
        this.zza = zzdm;
    }

    public final boolean handleMessage(Message message) {
        zzdm.zzg(this.zza, message);
        return true;
    }
}
