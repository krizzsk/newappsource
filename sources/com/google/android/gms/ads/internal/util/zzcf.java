package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class zzcf extends BroadcastReceiver {
    public final /* synthetic */ zzcg zza;

    public zzcf(zzcg zzcg) {
        this.zza = zzcg;
    }

    public final void onReceive(Context context, Intent intent) {
        this.zza.zze(context, intent);
    }
}
