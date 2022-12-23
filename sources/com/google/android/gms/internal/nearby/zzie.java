package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.BandwidthInfo;
import com.google.android.gms.nearby.connection.ConnectionInfo;
import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import com.google.android.gms.nearby.connection.ConnectionResolution;

final class zzie extends ConnectionLifecycleCallback {
    public final /* synthetic */ zzih zza;
    private final ConnectionLifecycleCallback zzb;

    public zzie(zzih zzih, ConnectionLifecycleCallback connectionLifecycleCallback) {
        this.zza = zzih;
        this.zzb = connectionLifecycleCallback;
    }

    public final void onBandwidthChanged(String str, BandwidthInfo bandwidthInfo) {
        this.zzb.onBandwidthChanged(str, bandwidthInfo);
    }

    public final void onConnectionInitiated(String str, ConnectionInfo connectionInfo) {
        if (connectionInfo.isIncomingConnection()) {
            this.zza.zzh(str);
        }
        this.zzb.onConnectionInitiated(str, connectionInfo);
    }

    public final void onConnectionResult(String str, ConnectionResolution connectionResolution) {
        if (!connectionResolution.getStatus().isSuccess()) {
            this.zza.zzi(str);
        }
        this.zzb.onConnectionResult(str, connectionResolution);
    }

    public final void onDisconnected(String str) {
        this.zza.zzi(str);
        this.zzb.onDisconnected(str);
    }
}
