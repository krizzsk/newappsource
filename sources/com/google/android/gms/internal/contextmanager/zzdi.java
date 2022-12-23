package com.google.android.gms.internal.contextmanager;

public final class zzdi extends zzlz<zzdj, zzdi> implements zzno {
    private zzdi() {
        super(zzdj.zza);
    }

    public final zzdi zza(zzld zzld) {
        if (this.zzb) {
            zzv();
            this.zzb = false;
        }
        zzdj.zzj((zzdj) this.zza, zzld);
        return this;
    }

    public final zzdi zzb(String str) {
        if (this.zzb) {
            zzv();
            this.zzb = false;
        }
        zzdj.zzh((zzdj) this.zza, str);
        return this;
    }

    public final zzdi zzc(String str) {
        if (this.zzb) {
            zzv();
            this.zzb = false;
        }
        zzdj.zzi((zzdj) this.zza, str);
        return this;
    }

    public /* synthetic */ zzdi(zzdh zzdh) {
        super(zzdj.zza);
    }
}
