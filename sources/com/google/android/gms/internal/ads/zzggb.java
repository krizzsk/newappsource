package com.google.android.gms.internal.ads;

public final class zzggb extends zzgkk implements zzglz {
    private zzggb() {
        super(zzggc.zzb);
    }

    public final zzggb zza(zzggf zzggf) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzggc.zzh((zzggc) this.zza, zzggf);
        return this;
    }

    public final zzggb zzb(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzggc) this.zza).zze = 0;
        return this;
    }

    public /* synthetic */ zzggb(zzgga zzgga) {
        super(zzggc.zzb);
    }
}
