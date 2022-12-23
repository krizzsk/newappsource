package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import com.google.android.gms.nearby.connection.zze;

final class zzfu extends zzgp {
    public final /* synthetic */ zzkq zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfu(zzfx zzfx, zzkq zzkq) {
        super((zzgo) null);
        this.zza = zzkq;
    }

    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        String zzc = this.zza.zzc();
        zze zze = new zze();
        zze.zzb(this.zza.zzb());
        zze.zza(this.zza.zza());
        ((ConnectionLifecycleCallback) obj).onBandwidthChanged(zzc, zze.zzc());
    }
}
