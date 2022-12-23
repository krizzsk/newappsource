package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import com.google.android.gms.ads.internal.overlay.zzl;
import java.util.Timer;
import java.util.TimerTask;

final class zzeeu extends TimerTask {
    public final /* synthetic */ AlertDialog zza;
    public final /* synthetic */ Timer zzb;
    public final /* synthetic */ zzl zzc;

    public zzeeu(AlertDialog alertDialog, Timer timer, zzl zzl) {
        this.zza = alertDialog;
        this.zzb = timer;
        this.zzc = zzl;
    }

    public final void run() {
        this.zza.dismiss();
        this.zzb.cancel();
        zzl zzl = this.zzc;
        if (zzl != null) {
            zzl.zzb();
        }
    }
}
