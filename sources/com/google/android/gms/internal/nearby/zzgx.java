package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;

final class zzgx extends zzkl {
    private final BaseImplementation.ResultHolder zza;

    public zzgx(BaseImplementation.ResultHolder resultHolder) {
        this.zza = (BaseImplementation.ResultHolder) Preconditions.checkNotNull(resultHolder);
    }

    public final void zzb(zzlm zzlm) {
        Status zzp = zzgy.zzF(zzlm.zza());
        if (zzp.isSuccess()) {
            this.zza.setResult(new zzgw(zzp, zzlm.zzb()));
        } else {
            this.zza.setFailedResult(zzp);
        }
    }
}
