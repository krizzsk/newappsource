package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

final class zznn extends zznp {
    public final /* synthetic */ Status zza;

    public zznn(zzno zzno, Status status) {
        this.zza = status;
    }

    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        BaseImplementation.ResultHolder resultHolder = (BaseImplementation.ResultHolder) obj;
        if (this.zza.isSuccess()) {
            resultHolder.setResult(this.zza);
        } else {
            resultHolder.setFailedResult(this.zza);
        }
    }
}
