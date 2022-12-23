package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import com.google.android.gms.nearby.connection.ConnectionResolution;

final class zzfs extends zzgp {
    public final /* synthetic */ zzky zza;
    public final /* synthetic */ Status zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfs(zzfx zzfx, zzky zzky, Status status) {
        super((zzgo) null);
        this.zza = zzky;
        this.zzb = status;
    }

    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((ConnectionLifecycleCallback) obj).onConnectionResult(this.zza.zzb(), new ConnectionResolution(this.zzb));
    }
}
