package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class zzfjb extends BroadcastReceiver {
    public final /* synthetic */ zzfjc zza;

    public zzfjb(zzfjc zzfjc) {
        this.zza = zzfjc;
    }

    public final void onReceive(Context context, Intent intent) {
        KeyguardManager keyguardManager;
        if (intent != null) {
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                zzfjc.zzb(this.zza, true);
            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                zzfjc.zzb(this.zza, false);
            } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction()) && (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) != null && !keyguardManager.inKeyguardRestrictedInputMode()) {
                zzfjc.zzb(this.zza, false);
            }
        }
    }
}
