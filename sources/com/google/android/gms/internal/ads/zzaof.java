package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

final class zzaof extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ zzaog zza;

    public zzaof(zzaog zzaog) {
        this.zza = zzaog;
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (zzaog.class) {
            this.zza.zza = networkCapabilities;
        }
    }

    public final void onLost(Network network) {
        synchronized (zzaog.class) {
            this.zza.zza = null;
        }
    }
}
