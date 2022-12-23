package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;

final class zzceo extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ zzcer zza;

    public zzceo(zzcer zzcer) {
        this.zza = zzcer;
    }

    public final void onAvailable(Network network) {
        this.zza.zzm.set(true);
    }

    public final void onLost(Network network) {
        this.zza.zzm.set(false);
    }
}
