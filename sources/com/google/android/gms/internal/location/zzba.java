package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;

final class zzba extends zzaj {
    private final BaseImplementation.ResultHolder zza;

    public zzba(BaseImplementation.ResultHolder resultHolder) {
        boolean z;
        if (resultHolder != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "listener can't be null.");
        this.zza = resultHolder;
    }

    private final void zze(int i) {
        BaseImplementation.ResultHolder resultHolder = this.zza;
        if (i != 0 && (i < 1000 || i >= 1006)) {
            i = 13;
        }
        resultHolder.setResult(new Status(i));
    }

    public final void zzb(int i, String[] strArr) {
        zze(i);
    }

    public final void zzc(int i, PendingIntent pendingIntent) {
        zze(i);
    }

    public final void zzd(int i, String[] strArr) {
        zze(i);
    }
}
