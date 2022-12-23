package com.google.android.gms.internal.ads;

import android.view.View;

final class zzclm implements View.OnAttachStateChangeListener {
    public final /* synthetic */ zzccj zza;
    public final /* synthetic */ zzclp zzb;

    public zzclm(zzclp zzclp, zzccj zzccj) {
        this.zzb = zzclp;
        this.zza = zzccj;
    }

    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzQ(view, this.zza, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
