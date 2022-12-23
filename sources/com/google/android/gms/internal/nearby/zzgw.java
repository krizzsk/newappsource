package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.Connections;

final class zzgw implements Connections.StartAdvertisingResult {
    private final Status zza;
    private final String zzb;

    public zzgw(Status status, String str) {
        this.zza = status;
        this.zzb = str;
    }

    public final String getLocalEndpointName() {
        return this.zzb;
    }

    public final Status getStatus() {
        return this.zza;
    }
}
