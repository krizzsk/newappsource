package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

public final /* synthetic */ class zzdth implements View.OnTouchListener {
    public final /* synthetic */ zzdtn zza;

    public /* synthetic */ zzdth(zzdtn zzdtn) {
        this.zza = zzdtn;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.zza.zzh(view, motionEvent);
        return false;
    }
}
