package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class zzke extends BroadcastReceiver {
    public final /* synthetic */ zzkf zza;

    public /* synthetic */ zzke(zzkf zzkf, zzkd zzkd) {
        this.zza = zzkf;
    }

    public final void onReceive(Context context, Intent intent) {
        zzkf zzkf = this.zza;
        zzkf.zzb.post(new zzkc(zzkf));
    }
}
