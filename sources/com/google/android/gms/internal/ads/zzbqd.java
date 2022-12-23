package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

final class zzbqd implements BaseGmsClient.BaseOnConnectionFailedListener {
    public final /* synthetic */ zzcga zza;

    public zzbqd(zzbqe zzbqe, zzcga zzcga) {
        this.zza = zzcga;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zza.zze(new RuntimeException("Connection failed."));
    }
}
