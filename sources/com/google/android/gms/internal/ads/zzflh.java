package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnFailureListener;

public final /* synthetic */ class zzflh implements OnFailureListener {
    public final /* synthetic */ zzfll zza;

    public /* synthetic */ zzflh(zzfll zzfll) {
        this.zza = zzfll;
    }

    public final void onFailure(Exception exc) {
        this.zza.zzf(exc);
    }
}
