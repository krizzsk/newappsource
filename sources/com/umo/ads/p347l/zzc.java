package com.umo.ads.p347l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* renamed from: com.umo.ads.l.zzc */
public abstract class zzc extends BroadcastReceiver {

    /* renamed from: a */
    public final Context f30826a;

    public zzc(Context context, IntentFilter intentFilter) {
        this.f30826a = context;
        context.registerReceiver(this, intentFilter);
    }
}
