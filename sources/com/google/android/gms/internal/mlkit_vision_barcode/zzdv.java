package com.google.android.gms.internal.mlkit_vision_barcode;

public final class zzdv {
    /* access modifiers changed from: private */
    public zzdy zza;
    /* access modifiers changed from: private */
    public Integer zzb;
    /* access modifiers changed from: private */
    public zzjs zzc;

    public final zzdv zza(Integer num) {
        this.zzb = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzdv zzb(zzjs zzjs) {
        this.zzc = zzjs;
        return this;
    }

    public final zzdv zzc(zzdy zzdy) {
        this.zza = zzdy;
        return this;
    }

    public final zzea zze() {
        return new zzea(this, (zzdz) null);
    }
}
