package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzl;

public final /* synthetic */ class zzeeq implements DialogInterface.OnCancelListener {
    public final /* synthetic */ zzl zza;

    public /* synthetic */ zzeeq(zzl zzl) {
        this.zza = zzl;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        zzl zzl = this.zza;
        if (zzl != null) {
            zzl.zzb();
        }
    }
}
