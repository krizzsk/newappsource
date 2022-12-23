package com.google.android.gms.internal.contextmanager;

import com.google.android.gms.awareness.fence.FenceQueryResult;
import com.google.android.gms.awareness.fence.FenceStateMap;
import com.google.android.gms.common.api.Status;

final class zzcn implements FenceQueryResult {
    public final /* synthetic */ zzbq zza;
    public final /* synthetic */ Status zzb;

    public zzcn(zzcp zzcp, zzbq zzbq, Status status) {
        this.zza = zzbq;
        this.zzb = status;
    }

    public final FenceStateMap getFenceStateMap() {
        return this.zza;
    }

    public final Status getStatus() {
        return this.zzb;
    }
}
