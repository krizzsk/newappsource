package com.google.android.gms.internal.ads;

public final class zzbhf extends zzgkk implements zzglz {
    private zzbhf() {
        super(zzbhg.zzb);
    }

    public final zzbhf zza(boolean z) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzbhg.zzd((zzbhg) this.zza, z);
        return this;
    }

    public final zzbhf zzb(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzbhg.zze((zzbhg) this.zza, i);
        return this;
    }

    public final boolean zzc() {
        return ((zzbhg) this.zza).zzf();
    }

    public /* synthetic */ zzbhf(zzbds zzbds) {
        super(zzbhg.zzb);
    }
}
