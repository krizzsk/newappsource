package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

public final class zzfjc {
    @SuppressLint({"StaticFieldLeak"})
    private static final zzfjc zza = new zzfjc();
    private Context zzb;
    private BroadcastReceiver zzc;
    private boolean zzd;
    private boolean zze;
    private zzfjh zzf;

    private zzfjc() {
    }

    public static zzfjc zza() {
        return zza;
    }

    public static /* bridge */ /* synthetic */ void zzb(zzfjc zzfjc, boolean z) {
        if (zzfjc.zze != z) {
            zzfjc.zze = z;
            if (zzfjc.zzd) {
                zzfjc.zzh();
                if (zzfjc.zzf == null) {
                    return;
                }
                if (zzfjc.zzf()) {
                    zzfkd.zzd().zzi();
                } else {
                    zzfkd.zzd().zzh();
                }
            }
        }
    }

    private final void zzh() {
        String str;
        boolean z = this.zze;
        for (zzfip zzg : zzfja.zza().zzc()) {
            zzfjn zzg2 = zzg.zzg();
            if (zzg2.zzk()) {
                if (true != z) {
                    str = "foregrounded";
                } else {
                    str = "backgrounded";
                }
                zzfjg.zza().zzb(zzg2.zza(), "setState", str);
            }
        }
    }

    public final void zzc(Context context) {
        this.zzb = context.getApplicationContext();
    }

    public final void zzd() {
        this.zzc = new zzfjb(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.zzb.registerReceiver(this.zzc, intentFilter);
        this.zzd = true;
        zzh();
    }

    public final void zze() {
        BroadcastReceiver broadcastReceiver;
        Context context = this.zzb;
        if (!(context == null || (broadcastReceiver = this.zzc) == null)) {
            context.unregisterReceiver(broadcastReceiver);
            this.zzc = null;
        }
        this.zzd = false;
        this.zze = false;
        this.zzf = null;
    }

    public final boolean zzf() {
        return !this.zze;
    }

    public final void zzg(zzfjh zzfjh) {
        this.zzf = zzfjh;
    }
}
