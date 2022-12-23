package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;

final class zzft extends zzgp {
    public final /* synthetic */ zzla zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzft(zzfx zzfx, zzla zzla) {
        super((zzgo) null);
        this.zza = zzla;
    }

    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((ConnectionLifecycleCallback) obj).onDisconnected(this.zza.zza());
    }
}
