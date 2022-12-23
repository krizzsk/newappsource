package com.google.android.gms.internal.ads;

public final class zzgce extends zzgkk implements zzglz {
    private zzgce() {
        super(zzgcf.zzb);
    }

    public final zzgce zza(zzgjg zzgjg) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgcf) this.zza).zzg = zzgjg;
        return this;
    }

    public final zzgce zzb(zzgcl zzgcl) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzgcf.zzi((zzgcf) this.zza, zzgcl);
        return this;
    }

    public final zzgce zzc(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgcf) this.zza).zze = 0;
        return this;
    }

    public /* synthetic */ zzgce(zzgcd zzgcd) {
        super(zzgcf.zzb);
    }
}
