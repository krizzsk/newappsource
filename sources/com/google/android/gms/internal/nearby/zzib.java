package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;

final class zzib implements OnFailureListener {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzih zzb;

    public zzib(zzih zzih, String str) {
        this.zzb = zzih;
        this.zza = str;
    }

    public final void onFailure(Exception exc) {
        if (!(exc instanceof ApiException) || ((ApiException) exc).getStatusCode() != 8003) {
            this.zzb.zzi(this.zza);
        }
    }
}
