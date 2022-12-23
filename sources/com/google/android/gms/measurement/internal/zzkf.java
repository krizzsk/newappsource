package com.google.android.gms.measurement.internal;

final class zzkf extends zzap {
    public final /* synthetic */ zzkg zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzkf(zzkg zzkg, zzgt zzgt) {
        super(zzgt);
        this.zza = zzkg;
    }

    public final void zzc() {
        zzkg zzkg = this.zza;
        zzkg.zzc.zzg();
        zzkg.zzd(false, false, zzkg.zzc.zzs.zzav().elapsedRealtime());
        zzkg.zzc.zzs.zzd().zzf(zzkg.zzc.zzs.zzav().elapsedRealtime());
    }
}
