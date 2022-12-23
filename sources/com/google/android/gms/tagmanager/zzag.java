package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.gtm.zzai;

final class zzag implements zzdg<zzai> {
    public final /* synthetic */ zzal zza;

    public /* synthetic */ zzag(zzal zzal, zzaf zzaf) {
        this.zza = zzal;
    }

    public final void zza(int i) {
        if (i == 4) {
            this.zza.zzi.zzc();
        }
        synchronized (this.zza) {
            if (!this.zza.isReady()) {
                if (this.zza.zzl != null) {
                    zzal zzal = this.zza;
                    zzal.setResult(zzal.zzl);
                } else {
                    zzal zzal2 = this.zza;
                    zzal2.setResult(zzal2.createFailedResult(Status.RESULT_TIMEOUT));
                }
            }
        }
        this.zza.zzr(this.zza.zzi.zzb());
    }
}
