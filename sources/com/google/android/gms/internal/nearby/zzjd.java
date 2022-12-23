package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.Connections;

final class zzjd implements Connections.StartAdvertisingResult {
    public final /* synthetic */ Status zza;

    public zzjd(zzjf zzjf, Status status) {
        this.zza = status;
    }

    public final String getLocalEndpointName() {
        return null;
    }

    public final Status getStatus() {
        return this.zza;
    }
}
