package com.google.android.gms.internal.mlkit_vision_barcode;

public final class zzka {
    /* access modifiers changed from: private */
    public Long zza;
    /* access modifiers changed from: private */
    public zzkj zzb;
    /* access modifiers changed from: private */
    public Boolean zzc;
    /* access modifiers changed from: private */
    public Boolean zzd;
    /* access modifiers changed from: private */
    public Boolean zze;

    public final zzka zza(Boolean bool) {
        this.zzd = bool;
        return this;
    }

    public final zzka zzb(Boolean bool) {
        this.zze = bool;
        return this;
    }

    public final zzka zzc(Long l) {
        this.zza = Long.valueOf(l.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzka zzd(zzkj zzkj) {
        this.zzb = zzkj;
        return this;
    }

    public final zzka zze(Boolean bool) {
        this.zzc = bool;
        return this;
    }

    public final zzkc zzf() {
        return new zzkc(this, (zzkb) null);
    }
}
