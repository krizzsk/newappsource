package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class zzffv {
    public final /* synthetic */ zzffw zza;
    private final Object zzb;
    private final String zzc;
    private final zzfvj zzd;
    private final List zze;
    private final zzfvj zzf;

    private zzffv(zzffw zzffw, Object obj, String str, zzfvj zzfvj, List list, zzfvj zzfvj2) {
        this.zza = zzffw;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = zzfvj;
        this.zze = list;
        this.zzf = zzfvj2;
    }

    public /* synthetic */ zzffv(zzffw zzffw, Object obj, String str, zzfvj zzfvj, List list, zzfvj zzfvj2, zzffu zzffu) {
        this(zzffw, obj, (String) null, zzfvj, list, zzfvj2);
    }

    public final zzffj zza() {
        Object obj = this.zzb;
        String str = this.zzc;
        if (str == null) {
            str = this.zza.zzf(obj);
        }
        zzffj zzffj = new zzffj(obj, str, this.zzf);
        this.zza.zzd.zza(zzffj);
        zzfvj zzfvj = this.zzd;
        zzffp zzffp = new zzffp(this, zzffj);
        zzfvk zzfvk = zzcfv.zzf;
        zzfvj.zzc(zzffp, zzfvk);
        zzfva.zzr(zzffj, new zzfft(this, zzffj), zzfvk);
        return zzffj;
    }

    public final zzffv zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzffv zzc(Class cls, zzfuh zzfuh) {
        zzffw zzffw = this.zza;
        return new zzffv(zzffw, this.zzb, this.zzc, this.zzd, this.zze, zzfva.zzg(this.zzf, cls, zzfuh, zzffw.zzb));
    }

    public final zzffv zzd(zzfvj zzfvj) {
        return zzg(new zzffq(zzfvj), zzcfv.zzf);
    }

    public final zzffv zze(zzffh zzffh) {
        return zzf(new zzffs(zzffh));
    }

    public final zzffv zzf(zzfuh zzfuh) {
        return zzg(zzfuh, this.zza.zzb);
    }

    public final zzffv zzg(zzfuh zzfuh, Executor executor) {
        return new zzffv(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzfva.zzn(this.zzf, zzfuh, executor));
    }

    public final zzffv zzh(String str) {
        return new zzffv(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzffv zzi(long j, TimeUnit timeUnit) {
        zzffw zzffw = this.zza;
        return new zzffv(zzffw, this.zzb, this.zzc, this.zzd, this.zze, zzfva.zzo(this.zzf, j, timeUnit, zzffw.zzc));
    }
}
