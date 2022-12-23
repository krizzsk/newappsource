package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import com.google.android.gms.nearby.connection.zzg;

final class zzfr extends zzgp {
    public final /* synthetic */ zzks zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfr(zzfx zzfx, zzks zzks) {
        super((zzgo) null);
        this.zza = zzks;
    }

    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        String zzb = this.zza.zzb();
        zzg zzg = new zzg();
        zzg.zzc(this.zza.zzc());
        zzg.zza(this.zza.zza());
        zzg.zzf(this.zza.zzf());
        zzg.zze(this.zza.zze());
        zzg.zzb(this.zza.zzg());
        zzg.zzd(this.zza.zzd());
        ((ConnectionLifecycleCallback) obj).onConnectionInitiated(zzb, zzg.zzg());
    }
}
