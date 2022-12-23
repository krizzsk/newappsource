package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

public final class zzdqx {
    private final Executor zza;
    private final zzcum zzb;
    private final zzdja zzc;

    public zzdqx(Executor executor, zzcum zzcum, zzdja zzdja) {
        this.zza = executor;
        this.zzc = zzdja;
        this.zzb = zzcum;
    }

    public final void zza(zzcli zzcli) {
        if (zzcli != null) {
            this.zzc.zza(zzcli.zzH());
            this.zzc.zzj(new zzdqt(zzcli), this.zza);
            this.zzc.zzj(new zzdqu(zzcli), this.zza);
            this.zzc.zzj(this.zzb, this.zza);
            this.zzb.zzf(zzcli);
            zzcli.zzaf("/trackActiveViewUnit", new zzdqv(this));
            zzcli.zzaf("/untrackActiveViewUnit", new zzdqw(this));
        }
    }

    public final /* synthetic */ void zzb(zzcli zzcli, Map map) {
        this.zzb.zzb();
    }

    public final /* synthetic */ void zzc(zzcli zzcli, Map map) {
        this.zzb.zza();
    }
}
