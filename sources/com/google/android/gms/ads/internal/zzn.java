package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;

final class zzn implements View.OnTouchListener {
    public final /* synthetic */ zzs zza;

    public zzn(zzs zzs) {
        this.zza = zzs;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzs zzs = this.zza;
        if (zzs.zzh == null) {
            return false;
        }
        zzs.zzh.zzd(motionEvent);
        return false;
    }
}
