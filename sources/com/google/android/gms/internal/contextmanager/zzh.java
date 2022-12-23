package com.google.android.gms.internal.contextmanager;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;

final class zzh implements ResultCallback {
    public final /* synthetic */ ResultCallback zza;
    public final /* synthetic */ zzi zzb;

    public zzh(zzi zzi, ResultCallback resultCallback) {
        this.zzb = zzi;
        this.zza = resultCallback;
    }

    public final void onResult(Result result) {
        this.zza.onResult(this.zzb.zza(result));
    }
}
