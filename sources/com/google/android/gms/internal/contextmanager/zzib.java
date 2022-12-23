package com.google.android.gms.internal.contextmanager;

public final class zzib extends zzlz<zzif, zzib> implements zzno {
    private zzib() {
        super(zzif.zza);
    }

    public final zzib zza(zzjs zzjs) {
        if (this.zzb) {
            zzv();
            this.zzb = false;
        }
        zzif.zzd((zzif) this.zza, zzjs);
        return this;
    }

    public final zzib zzb(zzie zzie) {
        if (this.zzb) {
            zzv();
            this.zzb = false;
        }
        zzif.zzc((zzif) this.zza, zzie);
        return this;
    }

    public /* synthetic */ zzib(zzia zzia) {
        super(zzif.zza);
    }
}
