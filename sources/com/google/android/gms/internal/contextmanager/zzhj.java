package com.google.android.gms.internal.contextmanager;

public final class zzhj extends zzlz<zzhn, zzhj> implements zzno {
    private zzhj() {
        super(zzhn.zza);
    }

    public final zzhj zza(long j) {
        if (this.zzb) {
            zzv();
            this.zzb = false;
        }
        zzhn.zzd((zzhn) this.zza, j);
        return this;
    }

    public final zzhj zzb(long j) {
        if (this.zzb) {
            zzv();
            this.zzb = false;
        }
        zzhn.zze((zzhn) this.zza, j);
        return this;
    }

    public final zzhj zzc(zzhm zzhm) {
        if (this.zzb) {
            zzv();
            this.zzb = false;
        }
        zzhn.zzc((zzhn) this.zza, zzhm);
        return this;
    }

    public /* synthetic */ zzhj(zzhi zzhi) {
        super(zzhn.zza);
    }
}
