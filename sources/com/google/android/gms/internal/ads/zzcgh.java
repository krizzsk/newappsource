package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
public class zzcgh {
    private final zzcga zza;
    /* access modifiers changed from: private */
    public final AtomicInteger zzb = new AtomicInteger(0);

    public zzcgh() {
        zzcga zzcga = new zzcga();
        this.zza = zzcga;
        zzfva.zzr(zzcga, new zzcgf(this), zzcfv.zzf);
    }

    @Deprecated
    public final int zze() {
        return this.zzb.get();
    }

    @Deprecated
    public final void zzg() {
        this.zza.zze(new Exception());
    }

    @Deprecated
    public final void zzh(Object obj) {
        this.zza.zzd(obj);
    }

    @Deprecated
    public final void zzi(zzcge zzcge, zzcgc zzcgc) {
        zzfva.zzr(this.zza, new zzcgg(this, zzcge, zzcgc), zzcfv.zzf);
    }
}
