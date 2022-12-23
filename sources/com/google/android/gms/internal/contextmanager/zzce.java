package com.google.android.gms.internal.contextmanager;

import com.google.android.gms.awareness.fence.FenceQueryResult;
import com.google.android.gms.awareness.fence.FenceStateMap;
import com.google.android.gms.common.api.Status;

final class zzce implements FenceQueryResult {
    public final /* synthetic */ Status zza;

    public zzce(zzcf zzcf, Status status) {
        this.zza = status;
    }

    public final FenceStateMap getFenceStateMap() {
        return null;
    }

    public final Status getStatus() {
        return this.zza;
    }
}
