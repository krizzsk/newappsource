package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import com.google.android.gms.nearby.connection.ConnectionResolution;

final class zzfv extends zzgp {
    public final /* synthetic */ String zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfv(zzfx zzfx, String str) {
        super((zzgo) null);
        this.zza = str;
    }

    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((ConnectionLifecycleCallback) obj).onConnectionResult(this.zza, new ConnectionResolution(zzgy.zzF(13)));
    }
}
