package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzeyh implements zzeyv {
    private final zzfdn zza;
    private final Executor zzb;
    private final zzfuw zzc = new zzeyf(this);

    public zzeyh(zzfdn zzfdn, Executor executor) {
        this.zza = zzfdn;
        this.zzb = executor;
    }

    public final /* synthetic */ zzfvj zza(zzdbb zzdbb, zzeyq zzeyq) throws Exception {
        zzfdw zzfdw;
        zzfdx zzfdx = zzeyq.zzb;
        zzbzu zzbzu = zzeyq.zza;
        if (zzfdx != null) {
            zzfdw = this.zza.zzb(zzfdx);
        } else {
            zzfdw = null;
        }
        if (zzfdx == null) {
            return zzfva.zzi((Object) null);
        }
        if (!(zzfdw == null || zzbzu == null)) {
            zzfva.zzr(zzdbb.zzb().zzg(zzbzu), this.zzc, this.zzb);
        }
        return zzfva.zzi(new zzeyg(zzfdx, zzbzu, zzfdw));
    }

    public final zzfvj zzb(zzeyw zzeyw, zzeyu zzeyu, zzdbb zzdbb) {
        return zzfva.zzf(zzfva.zzn(zzfur.zzv(new zzeyr(this.zza, zzdbb, this.zzb).zzc()), new zzeyd(this, zzdbb), this.zzb), Exception.class, new zzeye(this), this.zzb);
    }

    public final /* bridge */ /* synthetic */ zzfvj zzc(zzeyw zzeyw, zzeyu zzeyu, Object obj) {
        return zzb(zzeyw, zzeyu, (zzdbb) null);
    }

    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
