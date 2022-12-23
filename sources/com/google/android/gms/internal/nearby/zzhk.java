package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.tasks.OnSuccessListener;

public final /* synthetic */ class zzhk implements OnSuccessListener {
    public final /* synthetic */ zzih zza;
    public final /* synthetic */ DiscoveryOptions zzb;

    public /* synthetic */ zzhk(zzih zzih, DiscoveryOptions discoveryOptions) {
        this.zza = zzih;
        this.zzb = discoveryOptions;
    }

    public final void onSuccess(Object obj) {
        this.zza.zzc(this.zzb, (Void) obj);
    }
}
