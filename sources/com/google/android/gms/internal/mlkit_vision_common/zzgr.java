package com.google.android.gms.internal.mlkit_vision_common;

public final class zzgr {
    /* access modifiers changed from: private */
    public Long zza;
    /* access modifiers changed from: private */
    public zzgs zzb;
    /* access modifiers changed from: private */
    public zzgn zzc;
    /* access modifiers changed from: private */
    public Integer zzd;
    /* access modifiers changed from: private */
    public Integer zze;
    /* access modifiers changed from: private */
    public Integer zzf;
    /* access modifiers changed from: private */
    public Integer zzg;

    public final zzgr zzb(Long l) {
        this.zza = Long.valueOf(l.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzgr zzc(Integer num) {
        this.zzd = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzgr zzd(zzgn zzgn) {
        this.zzc = zzgn;
        return this;
    }

    public final zzgr zze(Integer num) {
        this.zzf = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzgr zzf(zzgs zzgs) {
        this.zzb = zzgs;
        return this;
    }

    public final zzgr zzg(Integer num) {
        this.zze = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzgr zzh(Integer num) {
        this.zzg = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzgu zzj() {
        return new zzgu(this, (zzgt) null);
    }
}
