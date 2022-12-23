package com.google.android.gms.internal.ads;

public final class zzgch extends zzgkk implements zzglz {
    private zzgch() {
        super(zzgci.zzb);
    }

    public final zzgch zza(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgci) this.zza).zzf = i;
        return this;
    }

    public final zzgch zzb(zzgcl zzgcl) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzgci.zzg((zzgci) this.zza, zzgcl);
        return this;
    }

    public /* synthetic */ zzgch(zzgcg zzgcg) {
        super(zzgci.zzb);
    }
}
