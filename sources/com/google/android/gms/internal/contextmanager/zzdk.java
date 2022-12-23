package com.google.android.gms.internal.contextmanager;

public final class zzdk extends zzlz<zzdo, zzdk> implements zzno {
    private zzdk() {
        super(zzdo.zza);
    }

    public final zzdk zza(zzdj zzdj) {
        if (this.zzb) {
            zzv();
            this.zzb = false;
        }
        zzdo.zze((zzdo) this.zza, zzdj);
        return this;
    }

    public final zzdk zzb(long j) {
        if (this.zzb) {
            zzv();
            this.zzb = false;
        }
        zzdo.zzd((zzdo) this.zza, 3000);
        return this;
    }

    public final zzdk zzc(zzdn zzdn) {
        if (this.zzb) {
            zzv();
            this.zzb = false;
        }
        zzdo.zzc((zzdo) this.zza, zzdn);
        return this;
    }

    public /* synthetic */ zzdk(zzdh zzdh) {
        super(zzdo.zza);
    }
}
