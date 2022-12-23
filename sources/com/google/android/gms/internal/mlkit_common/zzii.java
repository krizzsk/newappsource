package com.google.android.gms.internal.mlkit_common;

public final class zzii {
    /* access modifiers changed from: private */
    public zziu zza;
    /* access modifiers changed from: private */
    public Long zzb;
    /* access modifiers changed from: private */
    public zzid zzc;
    /* access modifiers changed from: private */
    public Long zzd;
    /* access modifiers changed from: private */
    public zzij zze;
    /* access modifiers changed from: private */
    public Long zzf;

    public final zzii zzb(Long l) {
        this.zzf = l;
        return this;
    }

    public final zzii zzc(zzij zzij) {
        this.zze = zzij;
        return this;
    }

    public final zzii zzd(zzid zzid) {
        this.zzc = zzid;
        return this;
    }

    public final zzii zze(Long l) {
        this.zzd = Long.valueOf(l.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzii zzf(zziu zziu) {
        this.zza = zziu;
        return this;
    }

    public final zzii zzg(Long l) {
        this.zzb = Long.valueOf(l.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzil zzi() {
        return new zzil(this, (zzik) null);
    }
}
