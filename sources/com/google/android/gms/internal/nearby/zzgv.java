package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;

final class zzgv extends zzki {
    private final BaseImplementation.ResultHolder zza;

    public zzgv(BaseImplementation.ResultHolder resultHolder) {
        this.zza = (BaseImplementation.ResultHolder) Preconditions.checkNotNull(resultHolder);
    }

    public final void zzb(int i) {
        Status zzp = zzgy.zzF(i);
        if (zzp.isSuccess()) {
            this.zza.setResult(zzp);
        } else {
            this.zza.setFailedResult(zzp);
        }
    }
}
